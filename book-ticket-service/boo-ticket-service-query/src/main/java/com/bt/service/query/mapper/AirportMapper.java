package com.bt.service.query.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bt.service.query.entity.domain.Airport;
import com.bt.service.query.entity.response.AirportResponse;

import java.util.List;

/**
 * <p>
 * 机场Mapper 接口
 * </p>
 *
 * @since 2022-04-01
 */
public interface AirportMapper extends BaseMapper<Airport> {
    List<AirportResponse> listByCityId(Integer cityId);
}
