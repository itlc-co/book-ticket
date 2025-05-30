package com.bt.service.query.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.bt.service.query.entity.domain.SeatType;
import com.bt.service.query.entity.request.SeatTypeRequest;
import com.bt.service.query.entity.response.SeatTypeResponse;

import java.util.List;

/**
 * <p>
 * 航班座位类型 服务类
 * </p>
 *
 * @since 2022-04-01
 */
public interface SeatTypeService extends IService<SeatType> {

    List<SeatTypeResponse> list(SeatTypeRequest seatTypeRequest);

}
