package com.skyfirst.library_borrowing.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.skyfirst.library_borrowing.dto.BookCreateDTO;
import com.skyfirst.library_borrowing.dto.BookUpdateDTO;
import com.skyfirst.library_borrowing.entity.Book;
import com.skyfirst.library_borrowing.entity.Review;
import com.skyfirst.library_borrowing.exception.BusinessException;
import com.skyfirst.library_borrowing.mapper.BookMapper;
import com.skyfirst.library_borrowing.mapper.ReviewMapper;
import com.skyfirst.library_borrowing.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skyfirst.library_borrowing.vo.BookBriefVO;
import com.skyfirst.library_borrowing.vo.BookDetailVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

    @Autowired
    private ReviewMapper reviewMapper;

    @Override
    public List<BookBriefVO> getBooks(Long currentPage, Long pageSize, String title, String author, String isbn) {
        Page<Book> page = new Page<>(currentPage, pageSize);

        boolean titleCondition = title != null && !title.isEmpty();
        boolean authorCondition = author != null && !author.isEmpty();
        boolean isbnCondition = isbn != null && !isbn.isEmpty();

        List<Book> books = lambdaQuery()
                .eq(Book::getIsDeleted, 0)
                .like(titleCondition, Book::getTitle, title)
                .like(authorCondition, Book::getAuthor, author)
                .like(isbnCondition, Book::getIsbn, isbn)
                .orderByDesc(Book::getGmtCreate)
                .page(page)
                .getRecords();

        if (books == null || books.isEmpty()) {
            return Collections.emptyList();
        }

        return books.stream()
                .map(
                    book -> {
                        BookBriefVO vo = new BookBriefVO();
                        BeanUtils.copyProperties(book, vo);
                        vo.setId(book.getId().toString());
                        vo.setPublisher(book.getPublisher());
                        return vo;
                    }
                ).toList();
    }

    @Override
    public BookDetailVO getBookDetailById(String bookId) {
        if (bookId == null || bookId.isEmpty()) {
            return null;
        }

        Book book = query().eq("id", Long.parseLong(bookId))
                .eq("is_deleted", 0)
                .one();
        BookDetailVO vo = new BookDetailVO();
        BeanUtils.copyProperties(book, vo);
        vo.setId(book.getId().toString());
        vo.setAverageRating(getAverageRatingByBookId(bookId));
        return vo;
    }

    @Override
    @Transactional
    public BookBriefVO creatBook(BookCreateDTO dto) {
        Book newBook =  new Book();
        BeanUtils.copyProperties(dto, newBook);
        newBook.setAvailableStock(dto.getTotalStock());
        if (!save(newBook)) {
            return null;
        }

        BookBriefVO vo = new BookBriefVO();
        BeanUtils.copyProperties(newBook, vo);
        vo.setId(newBook.getId().toString());
        vo.setPublisher(newBook.getPublisher());
        return vo;
    }

    @Override
    @Transactional
    public BookDetailVO updateBookById(String bookId, BookUpdateDTO dto) {
        // 查询数据库中的旧数据
        Long id = Long.parseLong(bookId);
        Book oldBook = query().eq("id", id).one();

        // 构建需要更新的新数据
        Book updateBook = new Book();
        Integer updateAvailableStock = dto.getTotalStock() - oldBook.getTotalStock() + oldBook.getAvailableStock();
        BeanUtils.copyProperties(dto, updateBook);
        updateBook.setId(id);
        updateBook.setAvailableStock(updateAvailableStock);
        updateBook.setGmtCreate(oldBook.getGmtCreate());

        if (!updateById(updateBook)) {
            return null;
        }

        BookDetailVO vo = new BookDetailVO();
        BeanUtils.copyProperties(updateBook, vo);
        vo.setId(updateBook.getId().toString());
        vo.setAverageRating(getAverageRatingByBookId(bookId));

        return vo;
    }

    @Override
    @Transactional
    public void deleteBooksById(List<String> bookIdList) {
        for (String bookId : bookIdList) {
            boolean success = update().eq("id", Long.parseLong(bookId))
                    .set("is_deleted", 1).update();
            if (!success) {
                throw new BusinessException(String.format("更新ID为%s书籍失败，请全部重试", bookId));
            }
        }
    }

    @Override
    public String getAllBooksCount() {
        return query().eq("is_deleted",0).count().toString();
    }

    @Override
    public List<BookDetailVO> getTop10Books() {
        List<Book> books = query().eq("is_deleted", 0).list();
        if (books == null || books.isEmpty()) {
            return Collections.emptyList();
        }

        return books.stream()
                .map(book -> {
                            String bookId = book.getId().toString();
                            Double averageRating = getAverageRatingByBookId(bookId);
                            BookDetailVO vo = new BookDetailVO();
                            BeanUtils.copyProperties(book, vo);
                            vo.setId(bookId);
                            vo.setAverageRating(Math.round(averageRating * 10) / 10.0);
                            return vo;
                        }
                )
                .sorted(Comparator.comparing(
                        BookDetailVO::getAverageRating,
                        Comparator.nullsLast(Double::compareTo)
                ).reversed())
                .limit(10)
                .toList();
    }

    private Double getAverageRatingByBookId(String bookId) {
        List<Review> reviews = reviewMapper.selectList(new QueryWrapper<Review>().eq("book_id", bookId));
        Double sum = 0.0;
        for (Review review : reviews) {
            sum += review.getRating();
        }
        if (reviews == null || reviews.isEmpty()) {
            return 0.0;
        }

        return sum / reviews.size();
    }
}
