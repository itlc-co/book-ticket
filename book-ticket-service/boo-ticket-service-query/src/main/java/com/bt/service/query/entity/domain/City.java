package com.bt.service.query.entity.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <p>
 *  城市表实体类
 * </p>
 *
 * @since 2022-04-01
 */
@Getter
@Setter
@TableName("city")
public class City extends Model<City> implements Serializable {

    private static final long serialVersionUID = 436974791L;

    private Integer id;

    private String cityName;

    private String code;

    private String simpleCode;


}
