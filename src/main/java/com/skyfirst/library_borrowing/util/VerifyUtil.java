package com.skyfirst.library_borrowing.util;

import com.skyfirst.library_borrowing.common.context.BaseContext;
import com.skyfirst.library_borrowing.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class VerifyUtil {

    public static boolean isAdmin() {
        boolean isAdmin = BaseContext.getCurrentIsAdmin();
        if (!isAdmin) {
            throw new BusinessException("该用户不是管理员，暂无权限");
        }
        return true;
    }

}
