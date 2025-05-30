package com.bt.service.query.entity.domain;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * <p>
 * 航班
 * </p>
 *
 * @since 2022-04-01
 */
@Getter
@Setter
@TableName("flight")
public class Flight extends Model<Flight> implements Serializable {

    private static final long serialVersionUID = 466696768741L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String flightNo;
    private Long airlineId;

    private Integer planeTypeId;

    private Integer maxCapacity;

    private Integer departCityId;

    private Integer arrivedCityId;

    private String departedAirport;

    private String arrivedAirport;

    private LocalTime departTime;

    private LocalTime arrivedTime;

    private Integer isPublished;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime modifiedTime;

    private Long createdUser;

    private Long modifiedUser;

    private Integer isDeleted;


}
