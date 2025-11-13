package com.skyfirst.library_borrowing.service.impl;

import com.skyfirst.library_borrowing.entity.Reservation;
import com.skyfirst.library_borrowing.mapper.ReservationMapper;
import com.skyfirst.library_borrowing.service.IReservationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 图书预约表 服务实现类
 * </p>
 *
 * @author starnighter
 * @since 2025-11-08
 */
@Service
public class ReservationServiceImpl extends ServiceImpl<ReservationMapper, Reservation> implements IReservationService {

}
