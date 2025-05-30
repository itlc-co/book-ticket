package com.bt.service.query.entity.response;

import com.bt.common.entity.Response;
import lombok.*;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalTime;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(chain = true)
public class FlightResponse extends Response {

    private static final long serialVersionUID = 1L;
    private Long id;
    private Instant flightTime;
    private BigDecimal price;
    private Integer inventory;
    private String flightNo;
    private String departedAirport;
    private String departedCityName;
    private String arrivedCityName;
    private String arrivedAirport;
    private LocalTime departTime;
    private LocalTime arrivedTime;
    private String airlinesName;
    private String planeTypeName;


}