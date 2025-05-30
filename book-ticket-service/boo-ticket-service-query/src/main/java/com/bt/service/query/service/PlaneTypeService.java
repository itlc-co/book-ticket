package com.bt.service.query.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.bt.service.query.entity.domain.PlaneType;
import com.bt.service.query.entity.request.PlaneTypeRequest;
import com.bt.service.query.entity.response.PlaneTypeResponse;

import java.util.List;

/**
 * <p>
 * 机型服务类
 * </p>
 *
 * @since 2022-04-01
 */
public interface PlaneTypeService extends IService<PlaneType> {

    List<PlaneTypeResponse> list(PlaneTypeRequest planeTypeRequest);
}
