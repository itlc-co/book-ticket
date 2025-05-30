package com.bt.service.query.controller;

import cn.hutool.core.bean.BeanUtil;
import com.bt.common.entity.ListResponse;
import com.bt.common.entity.ResponseResult;
import com.bt.service.common.controller.BaseController;
import com.bt.service.query.entity.domain.SeatType;
import com.bt.service.query.entity.request.SeatTypeRequest;
import com.bt.service.query.entity.response.SeatTypeResponse;
import com.bt.service.query.service.SeatTypeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/seatType")
public class SeatTypeController extends BaseController {

    @Resource
    private SeatTypeService seatTypeService;


    @GetMapping("/list")
    public ResponseResult<ListResponse<SeatTypeResponse>> list(SeatTypeRequest seatTypeRequest) {
        List<SeatTypeResponse> seatTypeResponses =  this.seatTypeService.list(seatTypeRequest);
        return success(ListResponse.<SeatTypeResponse>builder().list(seatTypeResponses).build());
    }


    @GetMapping("/{seatTypeId}")
    public ResponseResult<SeatTypeResponse> info(@PathVariable(value = "seatTypeId", required = true) Long seatTypeId) {
        SeatType seatType = this.seatTypeService.getById(seatTypeId);
        return success(BeanUtil.copyProperties(seatType, SeatTypeResponse.class));
    }


}
