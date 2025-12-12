package com.skyfirst.library_borrowing.controller;

import com.skyfirst.library_borrowing.common.ApiResponse;
import com.skyfirst.library_borrowing.dto.BookCreateDTO;
import com.skyfirst.library_borrowing.dto.BookUpdateDTO;
import com.skyfirst.library_borrowing.dto.BooksDeleteDTO;
import com.skyfirst.library_borrowing.exception.BusinessException;
import com.skyfirst.library_borrowing.service.IBookService;
import com.skyfirst.library_borrowing.util.VerifyUtil;
import com.skyfirst.library_borrowing.vo.BookBriefVO;
import com.skyfirst.library_borrowing.vo.BookDetailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/book")
public class AdminBookController {

    @Autowired
    private IBookService bookService;

    @PostMapping
    public ApiResponse<BookBriefVO> createBook(@RequestBody BookCreateDTO dto) {
        VerifyUtil.isAdmin();
        if (dto == null) {
            throw new BusinessException("传入的书籍构建对象为空，请重新传入");
        }
        BookBriefVO vo = bookService.creatBook(dto);
        return ApiResponse.success(vo);
    }

    @PutMapping("/{bookId}")
    public ApiResponse<BookDetailVO> updateBookById(@PathVariable String bookId, @RequestBody BookUpdateDTO dto) {
        VerifyUtil.isAdmin();
        if (bookId == null || bookId.isEmpty() || dto == null) {
            throw new BusinessException("传入的书籍ID或书籍更新对象为空，请重新传入");
        }
        BookDetailVO vo =  bookService.updateBookById(bookId, dto);
        return ApiResponse.success(vo);
    }

    @DeleteMapping
    public ApiResponse<Void> deleteBooksById(@RequestBody BooksDeleteDTO dto) {
        VerifyUtil.isAdmin();
        if (dto == null) {
            throw new BusinessException("传入的删除书籍对象为空，请重新传入");
        }
        List<String> bookIdList = dto.getBookIdList();
        if(bookIdList == null || bookIdList.isEmpty()){
            throw new BusinessException("传入的书籍ID列表为空，请重新传入");
        }
        bookService.deleteBooksById(bookIdList);
        return ApiResponse.success();
    }

    @GetMapping("/count")
    public ApiResponse<String> getAllBooksCount() {
        String booksCount = bookService.getAllBooksCount();
        return ApiResponse.success(booksCount);
    }
}
