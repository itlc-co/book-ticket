package com.bt.common.entity;

import com.bt.common.base.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 节点树形结构实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(chain = true)
public class TreeNode extends BaseResponse {

    /**
     * 节点标签
     */
    private String label;

    /**
     * 节点value
     */
    private Integer value;

    /**
     * 子节点
     */
    private List<? extends TreeNode> children;

}
