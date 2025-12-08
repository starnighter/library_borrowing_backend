package com.skyfirst.library_borrowing.service;

import com.skyfirst.library_borrowing.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author starnighter
 * @since 2025-11-08
 */
public interface IUserService extends IService<User> {
    public User login(String userName,String password);

    public int register(User user);

    public User getUserInfo(int userId);
}
