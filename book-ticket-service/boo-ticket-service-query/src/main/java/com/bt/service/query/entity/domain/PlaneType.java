package com.bt.service.query.entity.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <p>
 * 机型表实体类
 * </p>
 *
 * @since 2022-04-01
 */
@Getter
@Setter
@TableName("plane_type")
public class PlaneType extends Model<PlaneType> implements Serializable {

    private static final long serialVersionUID = 5066166554797065L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer maxCapacity;


}
