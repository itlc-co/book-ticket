package com.bt.service.query.entity.response;

import com.bt.common.base.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlaneTypeResponse  extends BaseResponse {
    /**
     * 机型id
     */
    private Long id;

    /**
     * 机型名
     */
    private String name;
}
