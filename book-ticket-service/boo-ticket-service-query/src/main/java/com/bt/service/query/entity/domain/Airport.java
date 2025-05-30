package com.bt.service.query.entity.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <p>
 *  机场表实体类
 * </p>
 *
 * @since 2022-04-01
 */
@Getter
@Setter
@TableName("airport")
public class Airport extends Model<Airport> implements Serializable {

    private static final long serialVersionUID = 4169727067274L;

    private Integer id;
    private Integer cityId;

    private String airportName;

    private String code;
    private String simpleCode;


}
