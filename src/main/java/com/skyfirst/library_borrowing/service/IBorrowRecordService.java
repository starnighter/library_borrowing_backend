package com.skyfirst.library_borrowing.service;

import com.skyfirst.library_borrowing.dto.BorrowRequestDTO;
import com.skyfirst.library_borrowing.dto.HistoryRecordsDeleteDTO;
import com.skyfirst.library_borrowing.dto.ReturnRequestDTO;
import com.skyfirst.library_borrowing.entity.BorrowRecord;
import com.baomidou.mybatisplus.extension.service.IService;
import com.skyfirst.library_borrowing.vo.BorrowRecordVO;

import java.util.List;

/**
 * <p>
 * 借阅记录表 服务类
 * </p>
 *
 * @author starnighter
 * @since 2025-11-08
 */
public interface IBorrowRecordService extends IService<BorrowRecord> {

    BorrowRecordVO borrowBookById(BorrowRequestDTO dto);

    BorrowRecordVO returnBookByBorrowId(ReturnRequestDTO dto);

    List<BorrowRecordVO> getCurrentBorrowRecords(Long currentPage, Long pageSize);

    List<BorrowRecordVO> getHistoryBorrowRecords(Long currentPage, Long pageSize);

    void deleteHistoryRecords(HistoryRecordsDeleteDTO dto);

    List<BorrowRecordVO> getAllBorrowRecords(Long currentPage, Long pageSize, String bookTitle);

    String getAllRecordsCount();

    String getOverdueRate();

    String getReturnedRate();
}
