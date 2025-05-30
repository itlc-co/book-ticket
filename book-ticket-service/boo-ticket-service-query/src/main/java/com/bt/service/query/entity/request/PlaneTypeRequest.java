package com.bt.service.query.entity.request;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "机型查询参数")
public class PlaneTypeRequest {

    private Integer departedCityId;


    private Integer arrivedCityId;

}
