package com.bt.service.query.controller;

import com.bt.common.entity.ListResponse;
import com.bt.common.entity.ResponseResult;
import com.bt.service.common.controller.BaseController;
import com.bt.service.query.entity.request.PlaneTypeRequest;
import com.bt.service.query.entity.response.PlaneTypeResponse;
import com.bt.service.query.service.PlaneTypeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/planeType")
public class PlaneTypeController extends BaseController {

    @Resource
    private PlaneTypeService planeTypeService;

    @GetMapping("/list")
    public ResponseResult<ListResponse<PlaneTypeResponse>> list(PlaneTypeRequest planeTypeRequest) {
        List<PlaneTypeResponse> planeTypeResponses =  this.planeTypeService.list(planeTypeRequest);
        return success(ListResponse.<PlaneTypeResponse>builder().list(planeTypeResponses).build());
    }


}
