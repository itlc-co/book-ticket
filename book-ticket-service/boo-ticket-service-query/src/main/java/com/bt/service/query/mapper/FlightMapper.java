package com.bt.service.query.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bt.service.query.entity.domain.Flight;
import com.bt.service.query.entity.request.FlightRequest;
import com.bt.service.query.entity.response.FlightResponse;

import java.util.List;


/**
 * <p>
 * 航班 Mapper 接口
 * </p>
 *
 * @since 2022-04-01
 */
public interface FlightMapper extends BaseMapper<Flight> {

    List<FlightResponse> list(FlightRequest flightRequest);

    List<FlightResponse> page(FlightRequest flightRequest);
}
