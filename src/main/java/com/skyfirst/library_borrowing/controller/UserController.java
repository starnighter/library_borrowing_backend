package com.skyfirst.library_borrowing.controller;

import com.skyfirst.library_borrowing.common.R;
import com.skyfirst.library_borrowing.common.ResultCode;
import com.skyfirst.library_borrowing.common.context.BaseContext;
import com.skyfirst.library_borrowing.dto.UserInfoDTO;
import com.skyfirst.library_borrowing.dto.UserLoginDTO;
import com.skyfirst.library_borrowing.dto.UserRegisterDTO;
import com.skyfirst.library_borrowing.entity.User;
import com.skyfirst.library_borrowing.exception.BusinessException;
import com.skyfirst.library_borrowing.service.IUserService;
import com.skyfirst.library_borrowing.util.JwtUtils;
import com.skyfirst.library_borrowing.vo.LoginVO;
import com.skyfirst.library_borrowing.vo.RegisterVO;
import com.skyfirst.library_borrowing.vo.UserVO;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author starnighter
 * @since 2025-11-08
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final IUserService userService;
    private final JwtUtils jwtUtils;
    @PostMapping("/login")
    public R<LoginVO> login(@RequestBody UserLoginDTO loginDTO){
        User loginuser = userService.login(loginDTO.getUsername(), loginDTO.getPassword());
        if(loginuser == null){
            return R.failed(ResultCode.PASSWORD_ERROR);
        }
        Map<String,Object> claims = new HashMap<>();
        claims.put("userId",loginuser.getId());
String token = jwtUtils.generateJwt(claims);
        UserVO userVO = UserVO.builder()
                .id(String.valueOf(loginuser.getId()) )
                .username(loginuser.getUserName())
                .email(loginuser.getEmail())
                .role(loginuser.getRole())
                .build();
        LoginVO loginVO = LoginVO.builder()
                .userInfo(userVO)
                .token(token)
                .build();
        return R.success(loginVO);
    }

    @PostMapping("/register")
    public R<RegisterVO> register(@RequestBody UserRegisterDTO userDTO){
        User user = User.builder()
                .userName(userDTO.getUsername())
                .password(userDTO.getPassword())
                .email(userDTO.getEmail())
                .role("user")
                .build();
        try{
            int result = userService.register(user);
            if(result <= 0){
                throw new BusinessException("注册失败");
            }

            RegisterVO registerVO = RegisterVO.builder()
                    .id(String.valueOf(user.getId()))
                    .userName(user.getUserName())
                    .email(user.getEmail())
                    .role(user.getRole())
                    .build();
            return R.success(registerVO,"注册成功");
        }catch (BusinessException e){
            return R.failed(e.getCode(),e.getMessage());
        }
    }

    @GetMapping("/info")
    public R<UserVO> info(){
        int id = BaseContext.getCurrentId();
        User user = userService.getUserInfo(id);

        UserVO userVO = UserVO.builder()
                .id(String.valueOf(user.getId()) )
                .username(user.getUserName())
                .email(user.getEmail())
                .role(user.getRole())
                .build();
        return R.success(userVO);
    }

}
