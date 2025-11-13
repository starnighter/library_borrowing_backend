package com.skyfirst.library_borrowing.util;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 自定义的雪花算法ID生成器（生成64位唯一ID）
 * 结构：符号位0(1位) + 时间戳(41位) + 数据中心ID(5位) + 机器ID(5位) + 序列号(12位)
 */
@Component
public class SnowflakeIdGenerator {

    // 起始时间戳（2025-01-01 00:00:00）
    private static final long START_TIMESTAMP = 1735689600000L;

    // 数据中心ID位数
    private static final int DATA_CENTER_BITS = 5;
    // 机器ID位数
    private static final int WORKER_BITS = 5;
    // 序列号位数
    private static final int SEQUENCE_BITS = 12;

    // 数据中心ID最大值
    private static final long MAX_DATA_CENTER_ID = (1L << DATA_CENTER_BITS) - 1;
    // 机器ID最大值
    private static final long MAX_WORKER_ID = (1L << WORKER_BITS) - 1;
    // 序列号最大值
    private static final long MAX_SEQUENCE = (1L << SEQUENCE_BITS) - 1;

    // 机器ID左移位数
    private static final int WORKER_SHIFT = SEQUENCE_BITS;
    // 数据中心ID左移位数
    private static final int DATA_CENTER_SHIFT = SEQUENCE_BITS + WORKER_BITS;
    // 时间戳左移位数
    private static final int TIMESTAMP_SHIFT = SEQUENCE_BITS + WORKER_BITS + DATA_CENTER_BITS;

    // 数据中心ID
    private long dataCenterId;

    // 机器ID
    private long workerId;

    // 序列号
    private long sequence = 0L;

    // 上一次生成ID的时间戳
    private long lastTimestamp = -1L;

    // 锁
    private final ReentrantLock lock = new ReentrantLock();

    /**
     * 初始化数据中心ID和机器ID
     */
    @PostConstruct
    public void init() {
        // 单机环境
        this.dataCenterId = 1;
        this.workerId = 1;
    }

    /**
     * 生成下一个唯一ID
     */
    public long nextId() {
        lock.lock();
        try {
            long currentTimestamp = System.currentTimeMillis();

            // 如果当前时间戳小于上一次生成ID的时间戳，说明系统时钟回退，抛出异常
            if (currentTimestamp < lastTimestamp) {
                throw new RuntimeException(String.format(
                        "系统时钟回退，拒绝生成ID。当前时间: %d, 上次时间: %d",
                        currentTimestamp, lastTimestamp
                ));
            }

            // 如果是同一时间戳，序列号自增
            if (currentTimestamp == lastTimestamp) {
                sequence = (sequence + 1) & MAX_SEQUENCE;
                // 序列号溢出，等待下一毫秒
                if (sequence == 0) {
                    currentTimestamp = waitNextMillis(lastTimestamp);
                }
            } else {
                // 不同时间戳，序列号重置为0
                sequence = 0L;
            }

            lastTimestamp = currentTimestamp;

            // 组合ID：符号位 + 时间戳 + 数据中心ID + 机器ID + 序列号
            return (currentTimestamp - START_TIMESTAMP) << TIMESTAMP_SHIFT
                    | dataCenterId << DATA_CENTER_SHIFT
                    | workerId << WORKER_SHIFT
                    | sequence;
        } finally {
            lock.unlock();
        }
    }

    /**
     * 等待到下一毫秒
     */
    private long waitNextMillis(long lastTimestamp) {
        long timestamp = System.currentTimeMillis();
        while (timestamp <= lastTimestamp) {
            timestamp = System.currentTimeMillis();
        }
        return timestamp;
    }
}
