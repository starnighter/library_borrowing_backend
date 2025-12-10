package com.skyfirst.library_borrowing.service;

import com.skyfirst.library_borrowing.dto.BookCreateDTO;
import com.skyfirst.library_borrowing.dto.BookUpdateDTO;
import com.skyfirst.library_borrowing.entity.Book;
import com.baomidou.mybatisplus.extension.service.IService;
import com.skyfirst.library_borrowing.vo.BookBriefVO;
import com.skyfirst.library_borrowing.vo.BookDetailVO;

import java.util.List;

/**
 * <p>
 * 图书表 服务类
 * </p>
 *
 * @author starnighter
 * @since 2025-11-08
 */
public interface IBookService extends IService<Book> {

    List<BookBriefVO> getBooks(Long currentPage, Long pageSize, String title, String author, String isbn);

    BookDetailVO getBookDetailById(String bookId);

    BookBriefVO creatBook(BookCreateDTO dto);

    BookDetailVO updateBookById(String bookId, BookUpdateDTO dto);

    void deleteBooksById(List<String> bookIdList);

    String getAllBooksCount();

    List<BookDetailVO> getTop10Books();
}
