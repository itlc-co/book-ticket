package com.bt.service.query.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bt.service.query.entity.domain.Airport;
import com.bt.service.query.entity.response.AirportResponse;

import java.util.List;

/**
 * <p>
 * 机场服务类
 * </p>
 *
 * @since 2022-04-01
 */
public interface AirportService  extends IService<Airport> {

    /**
     * 指定城市id查询机场列表信息
     *
     * @param cityId 城市id
     * @return 机场信息列表
     */
    List<AirportResponse> listByCityId(Integer cityId);
}
