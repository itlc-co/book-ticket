package com.bt.common.entity;

import com.bt.common.base.BaseResponse;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(chain = true)
public class ListResponse<T extends BaseResponse> extends Response {

    private static final long serialVersionUID = 1L;

    private List<T> list;

}
