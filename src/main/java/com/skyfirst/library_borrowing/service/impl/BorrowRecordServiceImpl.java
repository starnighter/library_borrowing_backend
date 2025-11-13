package com.skyfirst.library_borrowing.service.impl;

import com.skyfirst.library_borrowing.entity.BorrowRecord;
import com.skyfirst.library_borrowing.mapper.BorrowRecordMapper;
import com.skyfirst.library_borrowing.service.IBorrowRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 借阅记录表 服务实现类
 * </p>
 *
 * @author starnighter
 * @since 2025-11-08
 */
@Service
public class BorrowRecordServiceImpl extends ServiceImpl<BorrowRecordMapper, BorrowRecord> implements IBorrowRecordService {

}
