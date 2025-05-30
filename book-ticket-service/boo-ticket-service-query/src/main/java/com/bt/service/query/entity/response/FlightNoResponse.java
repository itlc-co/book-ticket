package com.bt.service.query.entity.response;

import com.bt.common.entity.Response;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(chain = true)
public class FlightNoResponse extends Response {

    private String flightNo;


    private Map<Object, Object> cityIds;
}
