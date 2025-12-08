package com.skyfirst.library_borrowing.common.context;

/**
 * 线程上下文工具类
 * 作用：在当前请求线程中存储用户信息（如userId），方便 Service 层随时获取
 */
public class BaseContext {

    // 使用 ThreadLocal 隔离不同线程的变量
    private static final ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

  /**
   * @description: 设置当前线程的用户ID
   * @author: bingxunqing
   * @date: 2025/12/8 23:54
   */
    public static void setCurrentId(int id) {
        threadLocal.set(id);
    }

    /**
     * @description: 获取当前线程的用户ID
     * @author: bingxunqing
     * @date: 2025/12/8 23:54
     */
    public static Integer getCurrentId() {
        return threadLocal.get();
    }


    /**
     * @description: 移除当前线程变量
     * @author: bingxunqing
     * @date: 2025/12/8 23:54
     */
    public static void removeCurrentId() {
        threadLocal.remove();
    }
}