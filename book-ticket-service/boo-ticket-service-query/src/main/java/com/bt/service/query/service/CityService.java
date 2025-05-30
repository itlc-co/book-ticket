package com.bt.service.query.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.bt.service.query.entity.domain.City;
import com.bt.service.query.entity.response.CityResponse;

import java.util.List;

/**
 * <p>
 * 城市服务类
 * </p>
 *
 * @since 2022-04-01
 */
public interface CityService extends IService<City> {

    List<CityResponse> cityList();

}
