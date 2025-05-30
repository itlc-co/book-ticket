package com.bt.service.query.entity.response;

import com.bt.common.base.BaseResponse;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 城市vo实体
 * </p>
 *
 * @since 2022-04-01
 */
@Getter
@Setter
public class AirportResponse extends BaseResponse {

    private long id;
    private String airportName;
    private String airportCode;

}
