package com.bt.service.query.entity.response;

import com.bt.common.entity.TreeNode;
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
public class CityResponse extends TreeNode {

    /**
     * 城市简码
     */
    private String simpleCode;

    /**
     * 城市简码类别
     */
    private String categoryCode;

}
