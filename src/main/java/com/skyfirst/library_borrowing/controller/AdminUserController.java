package com.skyfirst.library_borrowing.controller;

import com.skyfirst.library_borrowing.common.ApiResponse;
import com.skyfirst.library_borrowing.service.IUserService;
import com.skyfirst.library_borrowing.util.VerifyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/user")
public class AdminUserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/count")
    public ApiResponse<String> getAllUsersCount() {
        VerifyUtil.isAdmin();
        String usersCount = userService.getAllUsersCount();
        return ApiResponse.success(usersCount);
    }

}
