package com.skyfirst.library_borrowing.dto;

import lombok.Data;

/**
 * 预约请求DTO
 */
@Data
public class ReservationRequestDTO {
    private String bookId; // 要预约的图书ID
}