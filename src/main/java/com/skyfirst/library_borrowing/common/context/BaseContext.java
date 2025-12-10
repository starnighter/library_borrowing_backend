package com.skyfirst.library_borrowing.common.context;

/**
 * 线程上下文工具类
 * 作用：在当前请求线程中存储用户信息（如userId），方便 Service 层随时获取
 */
public class BaseContext {

    // 使用 ThreadLocal 隔离不同线程的变量
    private static final ThreadLocal<Long> currentUserId = new ThreadLocal<>();
    private static final ThreadLocal<Boolean> currentIsAdmin = new ThreadLocal<>();
  /**
   * @description: 设置当前线程的用户ID
   * @author: bingxunqing
   * @date: 2025/12/8 23:54
   */
    public static void setCurrentId(Long id) {
        currentUserId.set(id);
    }

    public static void setCurrentIsAdmin(Boolean isAdmin) {
        currentIsAdmin.set(isAdmin);
    }

    /**
     * @description: 获取当前线程的用户ID
     * @author: bingxunqing
     * @date: 2025/12/8 23:54
     */
    public static Long getCurrentId() {
        return currentUserId.get();
    }

    public static Boolean getCurrentIsAdmin() {
        return currentIsAdmin.get();
    }


    /**
     * @description: 移除当前线程变量
     * @author: bingxunqing
     * @date: 2025/12/8 23:54
     */
    public static void remove() {
        currentUserId.remove();
        currentIsAdmin.remove();
    }
}