package com.bt.service.query.controller;

import com.bt.common.entity.ListResponse;
import com.bt.common.entity.ResponseResult;
import com.bt.common.entity.TreeNode;
import com.bt.service.common.controller.BaseController;
import com.bt.service.query.entity.response.CityResponse;
import com.bt.service.query.service.CityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/city")
public class CityController extends BaseController {

    @Resource
    private CityService cityService;

    @GetMapping("/list")
    public ResponseResult<ListResponse<TreeNode>> list() {
        List<CityResponse> cityResponses = this.cityService.cityList();
        List<TreeNode> nodes = cityResponses.stream().collect(Collectors.groupingBy(CityResponse::getCategoryCode))
                .entrySet().stream().map((entry) -> TreeNode.builder().label(entry.getKey())
                        .children(entry.getValue().stream().sorted(Comparator.comparing(CityResponse::getSimpleCode)).collect(Collectors.toList()))
                        .build()).collect(Collectors.toList());
        return success(ListResponse.<TreeNode>builder().list(nodes).build());
    }

}
