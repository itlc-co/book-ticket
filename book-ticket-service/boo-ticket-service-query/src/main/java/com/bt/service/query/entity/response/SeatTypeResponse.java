package com.bt.service.query.entity.response;

import cn.hutool.core.annotation.Alias;
import com.bt.common.base.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 舱位类型vo实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeatTypeResponse extends BaseResponse{


    /**
     * 座位类型id主键
     */
    @Alias("seatTypeId")
    private Long id;

    /**
     * 座位类型
     */
    private String seatType;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 库存剩余量
     */
    private Integer inventory;


    /**
     * 库存使用量
     */
    private Integer used;

    /**
     * 库存总量
     */
    private Integer capacity;


}
