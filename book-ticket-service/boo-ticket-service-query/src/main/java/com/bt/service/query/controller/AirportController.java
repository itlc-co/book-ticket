package com.bt.service.query.controller;

import com.bt.common.entity.ListResponse;
import com.bt.common.entity.ResponseResult;
import com.bt.service.common.controller.BaseController;
import com.bt.service.query.entity.response.AirportResponse;
import com.bt.service.query.service.AirportService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/airport")
public class AirportController extends BaseController {

    @Resource
    private AirportService airportService;


    @GetMapping("/list/{cityId}")
    public ResponseResult<ListResponse<AirportResponse>> listByCityId(@PathVariable("cityId") Integer cityId) {
        List<AirportResponse> airportResponses = this.airportService.listByCityId(cityId);
        return success(ListResponse.<AirportResponse>builder().list(airportResponses).build());
    }


}
