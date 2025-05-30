package com.bt.service.query.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bt.service.query.entity.domain.PlaneType;
import com.bt.service.query.entity.request.PlaneTypeRequest;
import com.bt.service.query.entity.response.PlaneTypeResponse;

import java.util.List;

/**
 * <p>
 *  机型Mapper 接口
 * </p>
 *
 * @since 2022-04-01
 */
public interface PlaneTypeMapper extends BaseMapper<PlaneType> {

    List<PlaneTypeResponse> list(PlaneTypeRequest planeTypeRequest);
}
