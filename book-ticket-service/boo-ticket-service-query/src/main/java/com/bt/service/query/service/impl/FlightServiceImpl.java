package com.bt.service.query.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bt.common.entity.ListResponse;
import com.bt.common.entity.PageResponse;
import com.bt.service.query.entity.domain.Flight;
import com.bt.service.query.entity.request.FlightRequest;
import com.bt.service.query.entity.response.FlightResponse;
import com.bt.service.query.mapper.FlightMapper;
import com.bt.service.query.service.FlightService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 航班 服务实现类
 * </p>
 *
 * @since 2022-04-01
 */
@Service
@Log4j2
public class FlightServiceImpl extends ServiceImpl<FlightMapper, Flight> implements FlightService {

    @Resource
    private FlightMapper flightMapper;

    @Override
    public PageResponse<FlightResponse> page(FlightRequest flightRequest) {
        Integer curPage = flightRequest.getCurPage();
        Integer pageSize = flightRequest.getPageSize();
        Page<FlightResponse> page = PageHelper.startPage(curPage, pageSize);
        List<FlightResponse> flightResponses = flightMapper.page(flightRequest);
        return BeanUtil.copyProperties(page.toPageInfo(), PageResponse.class);
    }

    @Override
    public ListResponse<FlightResponse> list(FlightRequest flightRequest) {
        List<FlightResponse> flightResponseList = flightMapper.list(flightRequest);
        return ListResponse.<FlightResponse>builder().list(flightResponseList).build();
    }
}
