package com.skyfirst.library_borrowing.controller;

import com.skyfirst.library_borrowing.common.ApiResponse;
import com.skyfirst.library_borrowing.common.PageResponse;
import com.skyfirst.library_borrowing.common.PageData;
import com.skyfirst.library_borrowing.dto.ReviewCreateDTO;
import com.skyfirst.library_borrowing.exception.BusinessException;
import com.skyfirst.library_borrowing.service.IReviewService;
import com.skyfirst.library_borrowing.vo.ReviewVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 评价表 前端控制器
 * </p>
 *
 * @author starnighter
 * @since 2025-11-08
 */
@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    private IReviewService reviewService;

    @PostMapping
    public ApiResponse<ReviewVO> createReview(@RequestBody ReviewCreateDTO dto) {
        if (dto == null) {
            throw new BusinessException("传入的评论创建对象失败，请重新传入数据");
        }
        ReviewVO vo =  reviewService.createReview(dto);

        return ApiResponse.success(vo);
    }

    @DeleteMapping("/{reviewId}")
    public ApiResponse<Void> deleteReview(@PathVariable("reviewId") String reviewId) {
        if (reviewId == null) {
            throw new BusinessException("传入的评论ID为空，请重新传入数据");
        }

        reviewService.deleteReview(reviewId);

        return ApiResponse.success();
    }

    @GetMapping("/{bookId}")
    public ApiResponse<PageResponse<ReviewVO>> getReviewsByBookId(
            @RequestParam Long currentPage,
            @RequestParam Long pageSize,
            @PathVariable("bookId") String bookId
    ) {
        if (currentPage == null || pageSize == null) {
            throw new BusinessException("传入的当前页码或每页大小为空，请重新传入数据");
        }
        if (bookId == null) {
            throw new BusinessException("传入的书籍ID为空，请重新传入数据");
        }

        PageData<ReviewVO> pageData = reviewService.getReviewsByBookId(currentPage, pageSize, bookId);

        return ApiResponse.success(new PageResponse<>(currentPage, pageSize, pageData.getRecords(), pageData.getTotalCount()));
    }
}

