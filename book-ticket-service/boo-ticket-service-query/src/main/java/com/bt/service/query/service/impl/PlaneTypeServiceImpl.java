package com.bt.service.query.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bt.service.query.entity.domain.PlaneType;
import com.bt.service.query.entity.request.PlaneTypeRequest;
import com.bt.service.query.entity.response.PlaneTypeResponse;
import com.bt.service.query.mapper.PlaneTypeMapper;
import com.bt.service.query.service.PlaneTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 机型服务实现类
 * </p>
 *
 * @since 2022-04-01
 */
@Service
public class PlaneTypeServiceImpl extends ServiceImpl<PlaneTypeMapper, PlaneType> implements PlaneTypeService {

    @Resource
    private PlaneTypeMapper planeTypeMapper;

    @Override
    public List<PlaneTypeResponse> list(PlaneTypeRequest planeTypeRequest) {
        return this.planeTypeMapper.list(planeTypeRequest);
    }
}
