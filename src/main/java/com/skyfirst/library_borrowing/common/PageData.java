package com.skyfirst.library_borrowing.common;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 分页数据包装类，用于传递分页查询结果中的记录列表和总数
 */
@Data
@AllArgsConstructor
public class PageData<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<T> records; // 当前页的数据
    private Long totalCount; // 总数目
}
