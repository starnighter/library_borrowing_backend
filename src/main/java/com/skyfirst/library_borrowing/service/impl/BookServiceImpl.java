package com.skyfirst.library_borrowing.service.impl;

import com.skyfirst.library_borrowing.entity.Book;
import com.skyfirst.library_borrowing.mapper.BookMapper;
import com.skyfirst.library_borrowing.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 图书表 服务实现类
 * </p>
 *
 * @author starnighter
 * @since 2025-11-08
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

}
