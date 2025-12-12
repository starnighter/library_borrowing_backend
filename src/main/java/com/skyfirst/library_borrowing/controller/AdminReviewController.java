package com.skyfirst.library_borrowing.controller;

import com.skyfirst.library_borrowing.common.ApiResponse;
import com.skyfirst.library_borrowing.exception.BusinessException;
import com.skyfirst.library_borrowing.service.IReviewService;
import com.skyfirst.library_borrowing.util.VerifyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/review")
public class AdminReviewController {

    @Autowired
    private IReviewService reviewService;

    @DeleteMapping("/{reviewId}")
    public ApiResponse<Void> deleteAppointedReview(@PathVariable("reviewId") String reviewId) {
        VerifyUtil.isAdmin();
        if (reviewId == null || reviewId.isEmpty()) {
            throw new BusinessException("传入的评论ID为空，请重新传入");
        }
        reviewService.deleteAppointedReview(reviewId);

        return ApiResponse.success();
    }

}
