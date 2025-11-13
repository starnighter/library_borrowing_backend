package com.skyfirst.library_borrowing.dto;

import lombok.Data;

/**
 * 归还图书请求DTO
 */
@Data
public class ReturnRequestDTO {
    Long borrowRecordId; // 要归还的借阅记录ID (非BookID)
}