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
 * 航空公司表实体类
 * </p>
 *
 * @since 2022-04-01
 */
@Getter
@Setter
@TableName("airlines")
public class Airlines extends Model<Airlines> implements Serializable {

    private static final long serialVersionUID = 41697266966573L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String airlinesName;

    private String hostLine;


}
