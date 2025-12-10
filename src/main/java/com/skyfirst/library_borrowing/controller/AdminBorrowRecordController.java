package com.skyfirst.library_borrowing.controller;

import com.skyfirst.library_borrowing.common.ApiResponse;
import com.skyfirst.library_borrowing.common.PageResponse;
import com.skyfirst.library_borrowing.exception.BusinessException;
import com.skyfirst.library_borrowing.service.IBorrowRecordService;
import com.skyfirst.library_borrowing.util.VerifyUtil;
import com.skyfirst.library_borrowing.vo.BorrowRecordVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/borrow")
public class AdminBorrowRecordController {

    @Autowired
    private IBorrowRecordService borrowRecordService;

    @GetMapping
    public ApiResponse<PageResponse<BorrowRecordVO>> getAllBorrowRecords(
            @RequestParam Long currentPage,
            @RequestParam Long pageSize,
            @RequestParam(required = false) String bookTitle
    ) {
        VerifyUtil.isAdmin();
        if (currentPage == null || pageSize == null) {
            throw new BusinessException("传入的当前页码或每页大小为空，请重新传入");
        }

        List<BorrowRecordVO> vo = borrowRecordService.getAllBorrowRecords(currentPage, pageSize, bookTitle);

        return ApiResponse.success(new PageResponse<>(currentPage, pageSize, vo));
    }

    @GetMapping("/count")
    public ApiResponse<String> getAllRecordsCount() {
        VerifyUtil.isAdmin();
        String count = borrowRecordService.getAllRecordsCount();
        return ApiResponse.success(count);
    }

    @GetMapping("/overdue-rate")
    public ApiResponse<String> getOverdueRate() {
        VerifyUtil.isAdmin();
        String overdueRate = borrowRecordService.getOverdueRate();
        return ApiResponse.success(overdueRate);
    }

    @GetMapping("/returned-rate")
    public ApiResponse<String> getReturnedRate() {
        VerifyUtil.isAdmin();
        String returnedRate = borrowRecordService.getReturnedRate();
        return ApiResponse.success(returnedRate);
    }
}
