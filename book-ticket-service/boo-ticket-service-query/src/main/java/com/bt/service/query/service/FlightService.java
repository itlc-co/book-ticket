package com.bt.service.query.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.bt.common.entity.ListResponse;
import com.bt.common.entity.PageResponse;
import com.bt.service.query.entity.domain.Flight;
import com.bt.service.query.entity.request.FlightRequest;
import com.bt.service.query.entity.response.FlightResponse;

/**
 * <p>
 * 航班 服务类
 * </p>
 *
 * @since 2022-04-01
 */
public interface FlightService extends IService<Flight> {



    ListResponse<FlightResponse> list(FlightRequest flightRequest);


    PageResponse<FlightResponse> page(FlightRequest flightRequest);



}
