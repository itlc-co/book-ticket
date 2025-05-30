package com.bt.service.query.entity.response;

import com.bt.common.base.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AirlinesResponse extends BaseResponse {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 航空公司名
     */
    private String airlinesName;
}
