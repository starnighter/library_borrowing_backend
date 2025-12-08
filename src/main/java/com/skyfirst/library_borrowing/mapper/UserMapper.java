package com.skyfirst.library_borrowing.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.skyfirst.library_borrowing.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author starnighter
 * @since 2025-11-08
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
