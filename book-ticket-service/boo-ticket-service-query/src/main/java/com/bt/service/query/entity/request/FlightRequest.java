package com.bt.service.query.entity.request;

import com.bt.common.entity.PageRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.List;

/**
 * 航班查询参数
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightRequest extends PageRequest {

    /**
     * 航班号
     */
    @Pattern(regexp = "^[A-Z\\d]{2}\\d{4}$", message = "航班号不合法")
    private String flightNo;

    /**
     * 出发城市id
     */
    @NotNull(message = "出发城市不能为null")
    @Min(value = 1, message = "城市id最小为1")
    private Integer departedCityId;

    /**
     * 到达城市id
     */
    @NotNull(message = "到达城市不能为null")
    @Min(value = 1, message = "城市id最小为1")
    private Integer arrivedCityId;


    /**
     * 用户选择的航班日期需要根据日期判断库存
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "航班日期不能为null")
    private LocalDate flightDate;


    /**
     * 选择的批量的航空公司id
     */
    private List<Integer> airlinesIds;

    /**
     * 选择的批量的机型id
     */
    private List<Integer> planeTypeIds;


    /**
     * 选择的批量的舱位类型id
     */
    private List<Integer> seatTypes;


    /**
     * 选择的多个起飞时间段
     */
    private List<DepartedTime> departedTimeList;


    /**
     * 选择的多个起飞时间段id
     */
    private List<Integer> departedTimes;


    /**
     * 选择的多个出发机场
     */
    private List<String> departedAirPorts;


}
