package com.bt.service.query.controller;


import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.bt.common.entity.ListResponse;
import com.bt.common.entity.PageResponse;
import com.bt.common.entity.ResponseResult;
import com.bt.service.common.controller.BaseController;
import com.bt.service.query.entity.domain.Flight;
import com.bt.service.query.entity.request.FlightRequest;
import com.bt.service.query.entity.response.FlightNoResponse;
import com.bt.service.query.entity.response.FlightResponse;
import com.bt.service.query.service.FlightService;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/flight")
@Log4j2
public class FlightController extends BaseController {

    @Resource
    private FlightService flightService;


    @GetMapping("/page")
    public ResponseResult<PageResponse<FlightResponse>> page(FlightRequest flightRequest) {
        return success(this.flightService.page(flightRequest));
    }


    /**
     * 根据参数查询航班信息接口
     *
     * @return 结果集
     */
    @GetMapping("/list")
    public ResponseResult<ListResponse<FlightResponse>> list(FlightRequest flightRequest) {
        return success(this.flightService.list(flightRequest));
    }


    /**
     * 航班号模糊查询
     *
     * @param flightNo 航班号
     * @return 结果集
     */
    @GetMapping("/flightNo")
    public ResponseResult<ListResponse<FlightNoResponse>> flightNo(@RequestParam("flightNo") String flightNo) {
        List<Flight> flights = this.flightService.list(new LambdaQueryWrapper<Flight>().like(Flight::getFlightNo, flightNo));
        List<FlightNoResponse> flightNoResponses = BeanUtil.copyToList(flights, FlightNoResponse.class);
        return success(ListResponse.<FlightNoResponse>builder().list(flightNoResponses).build());
    }


    /**
     * 根据航班id查询航班信息接口
     *
     * @param flightId 航班id
     * @return 结果集
     */
    @GetMapping("/{flightId}")
    public ResponseResult<FlightResponse> info(@PathVariable(value = "flightId", required = true) Long flightId) {
        return success(BeanUtil.copyProperties(this.flightService.getById(flightId), FlightResponse.class));
    }


}
