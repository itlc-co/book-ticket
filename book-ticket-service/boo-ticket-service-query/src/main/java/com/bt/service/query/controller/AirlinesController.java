package com.bt.service.query.controller;


import com.bt.common.entity.ListResponse;
import com.bt.common.entity.ResponseResult;
import com.bt.service.common.controller.BaseController;
import com.bt.service.query.entity.request.AirlinesRequest;
import com.bt.service.query.entity.response.AirlinesResponse;
import com.bt.service.query.service.AirlinesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/airlines")
public class AirlinesController extends BaseController {

    @Resource
    private AirlinesService airlinesService;

    /**
     * 航空公司列表查询接口
     *
     * @param airlinesRequest 查询请求实体
     * @return 结果集
     */
    @GetMapping("/list")
    public ResponseResult<ListResponse<AirlinesResponse>> list(AirlinesRequest airlinesRequest) {
        List<AirlinesResponse> airlinesResponses = this.airlinesService.list(airlinesRequest);
        return success(ListResponse.<AirlinesResponse>builder().list(airlinesResponses).build());
    }


}
