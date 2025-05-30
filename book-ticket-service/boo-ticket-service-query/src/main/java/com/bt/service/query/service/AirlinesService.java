package com.bt.service.query.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.bt.service.query.entity.domain.Airlines;
import com.bt.service.query.entity.request.AirlinesRequest;
import com.bt.service.query.entity.response.AirlinesResponse;

import java.util.List;

/**
 * <p>
 * 航空公司服务类
 * </p>
 *
 * @author 作者
 * @since 2022-04-01
 */
public interface AirlinesService extends IService<Airlines> {

    List<AirlinesResponse> list(AirlinesRequest airlinesRequest);
}
