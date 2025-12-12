package com.skyfirst.library_borrowing.common;

import lombok.Data;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * 统一分页类
 */
@Data
public class PageResponse<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long currentPage; // 当前页码
    private Long pageSize; // 每页显示条数
    private Long totalPage; // 总页数
    private Long totalCount; // 总数目
    private Long recordsCount; // 当前页记录数
    private List<T> records; // 实际的数据

    /**
     * 统一分页类构造函数，不需要传递总页数和总数目，其余均需要传递
     */
    public PageResponse(Long _currentPage, Long _pageSize, List<T> _records) {
        if (_currentPage == null || _currentPage <= 0) {
            _currentPage = 1L;
        }
        if (_pageSize == null || _pageSize <= 0) {
            _pageSize = 10L;
        }
        if (_records == null || _records.isEmpty()) {
            _records = Collections.emptyList();
        }
        long _totalCount = _records.size();

        this.currentPage = _currentPage;
        this.pageSize = _pageSize;
        this.recordsCount = (long) _records.size();
        this.totalCount = _totalCount;
        this.totalPage = (totalCount + pageSize - 1) / pageSize;
        this.records = _records;
    }

    /**
     * 统一分页类构造函数，需要传递总数目，用于分页查询返回部分记录但需要显示总数的场景
     */
    public PageResponse(Long _currentPage, Long _pageSize, List<T> _records, Long _totalCount) {
        if (_currentPage == null || _currentPage <= 0) {
            _currentPage = 1L;
        }
        if (_pageSize == null || _pageSize <= 0) {
            _pageSize = 10L;
        }
        if (_records == null || _records.isEmpty()) {
            _records = Collections.emptyList();
        }
        if (_totalCount == null || _totalCount < 0) {
            _totalCount = 0L;
        }

        this.currentPage = _currentPage;
        this.pageSize = _pageSize;
        this.recordsCount = (long) _records.size();
        this.totalCount = _totalCount;
        this.totalPage = (totalCount + pageSize - 1) / pageSize;
        this.records = _records;
    }
}
