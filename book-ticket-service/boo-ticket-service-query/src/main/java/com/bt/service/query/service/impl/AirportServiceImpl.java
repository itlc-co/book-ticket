package com.bt.service.query.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bt.service.query.entity.domain.Airport;
import com.bt.service.query.entity.response.AirportResponse;
import com.bt.service.query.mapper.AirportMapper;
import com.bt.service.query.service.AirportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * <p>
 * 机场服务实现类
 * </p>
 *
 * @since 2022-04-01
 */
@Service
public class AirportServiceImpl extends ServiceImpl<AirportMapper, Airport> implements AirportService {

    @Resource
    private AirportMapper airportMapper;


    @Override
    public List<AirportResponse> listByCityId(Integer cityId) {
       return this.airportMapper.listByCityId(cityId);
    }
}
