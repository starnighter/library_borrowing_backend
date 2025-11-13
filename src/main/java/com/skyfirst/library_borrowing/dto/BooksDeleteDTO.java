package com.skyfirst.library_borrowing.dto;

import lombok.Data;

import java.util.List;

/**
 * 批量删除图书DTO
 */
@Data
public class BooksDeleteDTO {
    List<String> bookIdList;
}
