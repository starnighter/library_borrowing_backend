package com.skyfirst.library_borrowing.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.skyfirst.library_borrowing.entity.User;
import com.skyfirst.library_borrowing.mapper.UserMapper;
import com.skyfirst.library_borrowing.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.Arrays;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author starnighter
 * @since 2025-11-08
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    private final UserMapper userMapper;


    @Override
    public User login(String userName, String password) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<User>();
        queryWrapper.eq(User::getUserName, userName);
        User user = userMapper.selectOne(queryWrapper);

        if(user == null){
            throw new RuntimeException("用户名或密码错误");
        }

        String encryptedInput = DigestUtils.md5DigestAsHex(password.getBytes());
//String encryptedInput = password;
        if(!encryptedInput.equals(user.getPassword())){
            throw new RuntimeException("用户名或密码错误");
        }

        return user;
    }

    @Override
    public int register(User user) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<User>();
        queryWrapper.eq(User::getUserName, user.getUserName());
        Long count = userMapper.selectCount(queryWrapper);
        if(count>0){
            throw new RuntimeException("用户名已存在");
        }


        String encryptedPassword = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
        user.setPassword(encryptedPassword);


        return userMapper.insert(user);
    }

    @Override
    public User getUserInfo(int userId) {
        return userMapper.selectById(userId);
    }
}
