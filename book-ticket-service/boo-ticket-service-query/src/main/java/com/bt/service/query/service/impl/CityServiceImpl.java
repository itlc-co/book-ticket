package com.bt.service.query.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bt.service.query.entity.domain.City;
import com.bt.service.query.entity.response.CityResponse;
import com.bt.service.query.mapper.CityMapper;
import com.bt.service.query.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 城市服务实现类
 * </p>
 *
 * @since 2022-04-01
 */
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements CityService {

    @Resource
    private CityMapper cityMapper;


    @Override
    public List<CityResponse> cityList() {
        return this.cityMapper.list();
    }
}
