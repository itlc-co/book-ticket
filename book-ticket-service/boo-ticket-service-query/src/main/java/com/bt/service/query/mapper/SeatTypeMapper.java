package com.bt.service.query.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bt.service.query.entity.domain.SeatType;
import com.bt.service.query.entity.request.SeatTypeRequest;
import com.bt.service.query.entity.response.SeatTypeResponse;

import java.util.List;

/**
 * <p>
 * 航班座位类型 Mapper 接口
 * </p>
 *
 * @since 2022-04-01
 */
public interface SeatTypeMapper extends BaseMapper<SeatType> {


    List<SeatTypeResponse> list(SeatTypeRequest seatTypeRequest);

}
