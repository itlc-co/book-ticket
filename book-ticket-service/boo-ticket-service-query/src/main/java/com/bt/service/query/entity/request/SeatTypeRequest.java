package com.bt.service.query.entity.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/**
 * 舱位查询参数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeatTypeRequest {

    /**
     * 航班id
     */
    private Long flightId;

    /**
     * 用户选择的航班日期需要根据日期判断库存
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate flightDate;

}
