package com.bt.service.query.entity.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 航空公司查询参数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AirlinesRequest {

    /**
     * 出发城市id
     */
    private Integer departedCityId;

    /**
     * 到达城市id
     */
    private Integer arrivedCityId;
}
