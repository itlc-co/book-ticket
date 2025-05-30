package com.bt.service.query.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bt.service.query.entity.domain.SeatType;
import com.bt.service.query.entity.request.SeatTypeRequest;
import com.bt.service.query.entity.response.SeatTypeResponse;
import com.bt.service.query.mapper.SeatTypeMapper;
import com.bt.service.query.service.SeatTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * <p>
 * 航班座位类型 服务实现类
 * </p>
 *
 * @since 2022-04-01
 */
@Service
public class SeatTypeServiceImpl extends ServiceImpl<SeatTypeMapper, SeatType> implements SeatTypeService {

    @Resource
    private SeatTypeMapper seatTypeMapper;

    @Override
    public List<SeatTypeResponse> list(SeatTypeRequest seatTypeRequest) {
        return this.seatTypeMapper.list(seatTypeRequest);
    }
}
