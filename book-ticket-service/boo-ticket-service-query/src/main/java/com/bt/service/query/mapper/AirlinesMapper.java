package com.bt.service.query.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bt.service.query.entity.domain.Airlines;
import com.bt.service.query.entity.request.AirlinesRequest;
import com.bt.service.query.entity.response.AirlinesResponse;

import java.util.List;

/**
 * <p>
 *  航空公司Mapper 接口
 * </p>
 *
 * @since 2022-04-01
 */
public interface AirlinesMapper extends BaseMapper<Airlines> {

    List<AirlinesResponse> list(AirlinesRequest airlinesRequest);
}
