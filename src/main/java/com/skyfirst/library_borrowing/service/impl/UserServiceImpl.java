package com.skyfirst.library_borrowing.service.impl;

import com.skyfirst.library_borrowing.entity.User;
import com.skyfirst.library_borrowing.mapper.UserMapper;
import com.skyfirst.library_borrowing.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author starnighter
 * @since 2025-11-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
