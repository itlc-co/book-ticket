package com.bt.service.query.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bt.service.query.entity.domain.Airlines;
import com.bt.service.query.entity.request.AirlinesRequest;
import com.bt.service.query.entity.response.AirlinesResponse;
import com.bt.service.query.mapper.AirlinesMapper;
import com.bt.service.query.service.AirlinesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 航空公司服务实现类
 * </p>
 *
 * @since 2022-04-01
 */
@Service
public class AirlinesServiceImpl extends ServiceImpl<AirlinesMapper, Airlines> implements AirlinesService {

    @Resource
    private AirlinesMapper airlinesMapper;

    @Override
    public List<AirlinesResponse> list(AirlinesRequest airlinesRequest) {
        return airlinesMapper.list(airlinesRequest);
    }
}