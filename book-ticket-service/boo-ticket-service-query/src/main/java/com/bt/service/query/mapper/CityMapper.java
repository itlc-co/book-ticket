package com.bt.service.query.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bt.service.query.entity.domain.City;
import com.bt.service.query.entity.response.CityResponse;

import java.util.List;

/**
 * <p>
 *  城市Mapper 接口
 * </p>
 *
 * @since 2022-04-01
 */
public interface CityMapper extends BaseMapper<City> {

    List<CityResponse> list();
}
