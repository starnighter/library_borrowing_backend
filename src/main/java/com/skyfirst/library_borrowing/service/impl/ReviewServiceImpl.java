package com.skyfirst.library_borrowing.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.skyfirst.library_borrowing.common.context.BaseContext;
import com.skyfirst.library_borrowing.dto.ReviewCreateDTO;
import com.skyfirst.library_borrowing.entity.Review;
import com.skyfirst.library_borrowing.entity.User;
import com.skyfirst.library_borrowing.exception.BusinessException;
import com.skyfirst.library_borrowing.mapper.ReviewMapper;
import com.skyfirst.library_borrowing.mapper.UserMapper;
import com.skyfirst.library_borrowing.service.IReviewService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skyfirst.library_borrowing.vo.ReviewVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

/**
 * <p>
 * 评价表 服务实现类
 * </p>
 *
 * @author starnighter
 * @since 2025-11-08
 */
@Service
public class ReviewServiceImpl extends ServiceImpl<ReviewMapper, Review> implements IReviewService {

    @Autowired
    private UserMapper userMapper;

    private final Long currentUserId = BaseContext.getCurrentId();

    @Override
    @Transactional
    public ReviewVO createReview(ReviewCreateDTO dto) {
        Review review = new Review();
        BeanUtils.copyProperties(dto,review);
        review.setUserId(currentUserId);
        review.setBookId(Long.parseLong(dto.getBookId()));

        if (!save(review)) {
            throw new BusinessException("创建评价失败，请重试");
        }

        return review2VO(review, currentUserId);
    }

    @Override
    @Transactional
    public void deleteReview(String reviewId) {
        boolean success = update().eq("id", reviewId)
                .eq("user_id", currentUserId)
                .set("is_deleted", 1)
                .update();

        if (!success) {
            throw new BusinessException("删除评论失败，请重试");
        }
    }

    @Override
    public List<ReviewVO> getReviewsByBookId(Long currentPage, Long pageSize, String bookId) {
        Page<Review> page = new Page<>(currentPage, pageSize);

        List<Review> reviews = lambdaQuery().eq(Review::getBookId, Long.parseLong(bookId))
                .page(page)
                .getRecords();

        if (reviews == null || reviews.isEmpty()) {
            return Collections.emptyList();
        }

        return reviews.stream()
                .map(review -> review2VO(review, review.getUserId()))
                .toList();
    }

    private ReviewVO review2VO(Review review, Long userId) {
        User user = userMapper.selectById(userId);

        ReviewVO vo = new ReviewVO();
        BeanUtils.copyProperties(review,vo);
        vo.setId(review.getId().toString());
        vo.setBookId(review.getBookId().toString());
        vo.setUserId(review.getUserId().toString());
        vo.setUsername(user.getUserName());

        return vo;
    }
}
