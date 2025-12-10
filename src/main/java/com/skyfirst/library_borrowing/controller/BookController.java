package com.skyfirst.library_borrowing.controller;

import com.skyfirst.library_borrowing.common.ApiResponse;
import com.skyfirst.library_borrowing.common.PageResponse;
import com.skyfirst.library_borrowing.exception.BusinessException;
import com.skyfirst.library_borrowing.service.IBookService;
import com.skyfirst.library_borrowing.util.VerifyUtil;
import com.skyfirst.library_borrowing.vo.BookBriefVO;
import com.skyfirst.library_borrowing.vo.BookDetailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 图书表 前端控制器
 * </p>
 *
 * @author starnighter
 * @since 2025-11-08
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping
    public ApiResponse<PageResponse<BookBriefVO>> getBooks(
            @RequestParam Long currentPage,
            @RequestParam Long pageSize,
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String author,
            @RequestParam(required = false) String isbn
    ) {
        if (currentPage == null || pageSize == null) {
            throw new BusinessException("传入的页码或每页大小为空，请重新传入");
        }
        List<BookBriefVO> vo = bookService.getBooks(currentPage, pageSize, title, author, isbn);
        return ApiResponse.success(new PageResponse<>(currentPage, pageSize, vo));
    }

    @GetMapping("/{bookId}")
    public ApiResponse<BookDetailVO> getBookById(@PathVariable String bookId) {
        BookDetailVO vo = bookService.getBookDetailById(bookId);
        return ApiResponse.success(vo);
    }

    @GetMapping("/top-10")
    public ApiResponse<List<BookDetailVO>> getTop10Books() {
        List<BookDetailVO> top10Books = bookService.getTop10Books();
        return ApiResponse.success(top10Books);
    }
}
