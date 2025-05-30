package com.bt.service.query.entity.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 航班座位类型
 * </p>
 *
 * @since 2022-04-01
 */
@Getter
@Setter
@TableName("seat_type")
public class SeatType extends Model<SeatType> implements Serializable {

    private static final long serialVersionUID = 5365617454797065L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Integer seatType;

    private Integer capacity;

    private BigDecimal price;

    private Long flightId;


}
