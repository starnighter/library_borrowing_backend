package com.skyfirst.library_borrowing.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.skyfirst.library_borrowing.common.context.BaseContext;
import com.skyfirst.library_borrowing.dto.BorrowRequestDTO;
import com.skyfirst.library_borrowing.dto.HistoryRecordsDeleteDTO;
import com.skyfirst.library_borrowing.dto.ReturnRequestDTO;
import com.skyfirst.library_borrowing.entity.Book;
import com.skyfirst.library_borrowing.entity.BorrowRecord;
import com.skyfirst.library_borrowing.entity.User;
import com.skyfirst.library_borrowing.exception.BusinessException;
import com.skyfirst.library_borrowing.mapper.BookMapper;
import com.skyfirst.library_borrowing.mapper.BorrowRecordMapper;
import com.skyfirst.library_borrowing.mapper.UserMapper;
import com.skyfirst.library_borrowing.service.IBorrowRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skyfirst.library_borrowing.vo.BorrowRecordVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

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

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public BorrowRecordVO borrowBookById(BorrowRequestDTO dto) {
        if (dto == null || dto.getBookId() == null || dto.getBookId().isEmpty() || dto.getBorrowTime() == null) {
            throw new BusinessException("借阅书籍请求对象为空或未传递所需数据");
        }

        Long bookId = Long.parseLong(dto.getBookId());
        Long userId = BaseContext.getCurrentId();
        Integer borrowTime = dto.getBorrowTime();
        LocalDateTime now = LocalDateTime.now();

        BorrowRecord borrowRecord = new BorrowRecord();
        borrowRecord.setBookId(bookId);
        borrowRecord.setUserId(userId);
        borrowRecord.setBorrowDate(now);
        borrowRecord.setDueDate(now.plusDays(borrowTime));
        borrowRecord.setStatus("BORROWED");
        if (!save(borrowRecord)) {
            throw new BusinessException("保存借阅书籍失败，请重试");
        }

        return borrowRecord2VO(borrowRecord,bookId);
    }

    @Override
    @Transactional
    public BorrowRecordVO returnBookByBorrowId(ReturnRequestDTO dto) {
        if (dto == null || dto.getBorrowRecordId() == null || dto.getBorrowRecordId().isEmpty()) {
            throw new BusinessException("传入的归还数据为空或借阅ID为空");
        }
        boolean success = update().eq("id", Long.parseLong(dto.getBorrowRecordId()))
                .set("return_date", LocalDateTime.now())
                .set("status", "RETURNED")
                .update();
        if (!success) {
            throw new BusinessException("归还书籍失败，请重试");
        }
        BorrowRecord borrowRecord = query().eq("id", Long.parseLong(dto.getBorrowRecordId())).one();

        return borrowRecord2VO(borrowRecord, borrowRecord.getBookId());
    }

    @Override
    public List<BorrowRecordVO> getCurrentBorrowRecords(Long currentPage, Long pageSize) {
        Page<BorrowRecord> page = new Page<>(currentPage, pageSize);

        List<BorrowRecord> borrowRecords = query()
                .ne("status", "RETURNED")
                .page(page)
                .getRecords();

        return borrowRecords.stream()
                .map(borrowRecord -> borrowRecord2VO(borrowRecord, borrowRecord.getBookId()))
                .toList();
    }

    @Override
    public List<BorrowRecordVO> getHistoryBorrowRecords(Long currentPage, Long pageSize) {
        Page<BorrowRecord> page = new Page<>(currentPage, pageSize);

        List<BorrowRecord> borrowRecords = query()
                .eq("status", "RETURNED")
                .page(page)
                .getRecords();

        return borrowRecords.stream()
                .map(borrowRecord -> borrowRecord2VO(borrowRecord, borrowRecord.getBookId()))
                .toList();
    }

    @Override
    @Transactional
    public void deleteHistoryRecords(HistoryRecordsDeleteDTO dto) {
        if (dto == null || dto.getBorrowRecordIdList() == null || dto.getBorrowRecordIdList().isEmpty()) {
            throw new BusinessException("传入的历史数据为空，请重新传入");
        }
        List<BorrowRecord> borrowRecords = listByIds(dto.getBorrowRecordIdList());
        List<Long> filterIdList = borrowRecords.stream()
                .filter(record -> "RETURNED".equals(record.getStatus()))
                .map(BorrowRecord::getId)
                .toList();
        if (!removeBatchByIds(filterIdList)) {
            throw new BusinessException("删除历史借阅记录失败，请重试");
        }
    }

    @Override
    public List<BorrowRecordVO> getAllBorrowRecords(Long currentPage, Long pageSize, String bookTitle) {
        Page<BorrowRecord> page = new Page<>(currentPage, pageSize);

        boolean condition = bookTitle != null && !bookTitle.isEmpty();
        List<BorrowRecord> borrowRecords = query()
                .like(condition, "book_title", bookTitle)
                .page(page)
                .getRecords();

        return borrowRecords.stream()
                .map(borrowRecord -> borrowRecord2VO(borrowRecord, borrowRecord.getBookId()))
                .toList();
    }

    @Override
    public String getAllRecordsCount() {
        return query().count().toString();
    }

    @Override
    public String getOverdueRate() {
        Long allCount = query().count();
        Long overDueCount = query().eq("status", "OVERDUE").count();
        double overDueRate = overDueCount.doubleValue() / allCount;

        return Double.toString(overDueRate * 100);
    }

    @Override
    public String getReturnedRate() {
        Long allCount = query().count();
        Long returnedCount = query().eq("status", "RETURNED").count();
        double returnedRate = returnedCount.doubleValue() / allCount;

        return Double.toString(returnedRate * 100);
    }

    private BorrowRecordVO borrowRecord2VO(BorrowRecord borrowRecord, Long bookId) {
        Book book = bookMapper.selectById(bookId);
        BorrowRecordVO vo = new BorrowRecordVO();
        BeanUtils.copyProperties(borrowRecord, vo);
        vo.setId(bookId.toString());
        vo.setBookTitle(book.getTitle());
        vo.setBookCoverUrl(book.getCoverUrl());

        return vo;
    }
}
