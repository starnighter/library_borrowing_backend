package com.skyfirst.library_borrowing.service.impl;

import com.skyfirst.library_borrowing.entity.Review;
import com.skyfirst.library_borrowing.mapper.ReviewMapper;
import com.skyfirst.library_borrowing.service.IReviewService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
