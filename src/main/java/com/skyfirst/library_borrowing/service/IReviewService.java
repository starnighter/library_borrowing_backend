package com.skyfirst.library_borrowing.service;

import com.skyfirst.library_borrowing.common.PageData;
import com.skyfirst.library_borrowing.common.PageResponse;
import com.skyfirst.library_borrowing.dto.ReviewCreateDTO;
import com.skyfirst.library_borrowing.entity.Review;
import com.baomidou.mybatisplus.extension.service.IService;
import com.skyfirst.library_borrowing.vo.ReviewVO;

/**
 * <p>
 * 评价表 服务类
 * </p>
 *
 * @author starnighter
 * @since 2025-11-08
 */
public interface IReviewService extends IService<Review> {

    ReviewVO createReview(ReviewCreateDTO dto);

    void deleteReview(String reviewId);

    PageResponse<ReviewVO> getReviewsByBookId(Long currentPage, Long pageSize, String bookId);

    void deleteAppointedReview(String reviewId);
}
