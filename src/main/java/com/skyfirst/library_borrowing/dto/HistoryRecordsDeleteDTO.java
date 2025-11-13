package com.skyfirst.library_borrowing.dto;

import lombok.Data;

import java.util.List;

/**
 * 批量删除历史借阅记录
 * 注意：只能删除status为RETURNED状态的记录，后端注意判断
 */
@Data
public class HistoryRecordsDeleteDTO {
    List<String> borrowRecordIdList;
}
