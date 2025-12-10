package com.skyfirst.library_borrowing.controller;

import com.skyfirst.library_borrowing.common.ApiResponse;
import com.skyfirst.library_borrowing.common.PageResponse;
import com.skyfirst.library_borrowing.dto.BorrowRequestDTO;
import com.skyfirst.library_borrowing.dto.HistoryRecordsDeleteDTO;
import com.skyfirst.library_borrowing.dto.ReturnRequestDTO;
import com.skyfirst.library_borrowing.exception.BusinessException;
import com.skyfirst.library_borrowing.service.IBorrowRecordService;
import com.skyfirst.library_borrowing.vo.BorrowRecordVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 借阅记录表 前端控制器
 * </p>
 *
 * @author starnighter
 * @since 2025-11-08
 */
@RestController
@RequestMapping("/borrow")
public class BorrowRecordController {

    @Autowired
    private IBorrowRecordService borrowRecordService;

    @PostMapping
    public ApiResponse<BorrowRecordVO> borrowBookById(@RequestBody BorrowRequestDTO dto){
        BorrowRecordVO vo = borrowRecordService.borrowBookById(dto);
        return ApiResponse.success(vo);
    }

    @PostMapping("/return")
    public ApiResponse<BorrowRecordVO> returnBookByBorrowId(@RequestBody ReturnRequestDTO dto){
        BorrowRecordVO vo = borrowRecordService.returnBookByBorrowId(dto);
        return ApiResponse.success(vo);
    }

    @GetMapping("/me")
    public ApiResponse<PageResponse<BorrowRecordVO>> getCurrentBorrowRecords(@RequestParam Long currentPage, @RequestParam Long pageSize){
        if(currentPage == null || pageSize == null){
            throw new BusinessException("传入的当前页码或每页大小为空，请重新传入");
        }
        List<BorrowRecordVO> vo = borrowRecordService.getCurrentBorrowRecords(currentPage, pageSize);

        return ApiResponse.success(new PageResponse<>(currentPage, pageSize, vo));
    }

    @GetMapping("/history")
    public ApiResponse<PageResponse<BorrowRecordVO>> getHistoryBorrowRecords(@RequestParam Long currentPage, @RequestParam Long pageSize) {
        if(currentPage == null || pageSize == null){
            throw new BusinessException("传入的当前页码或每页大小为空，请重新传入");
        }
        List<BorrowRecordVO> vo = borrowRecordService.getHistoryBorrowRecords(currentPage, pageSize);

        return ApiResponse.success(new PageResponse<>(currentPage, pageSize, vo));
    }

    @DeleteMapping("/history")
    public ApiResponse<Void> deleteHistoryRecords(@RequestBody HistoryRecordsDeleteDTO dto){
        borrowRecordService.deleteHistoryRecords(dto);
        return ApiResponse.success();
    }


}
