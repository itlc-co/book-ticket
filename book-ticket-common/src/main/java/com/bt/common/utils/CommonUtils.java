package com.bt.common.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * 公共组件工具类
 */
public class CommonUtils {


    /**
     * 获取当前日期的一年内的日期字符串
     *
     * @return 一年内的日期字符串
     */
    public static List<String> oneYearDateByNow() {
        List<String> dates = new ArrayList<>();
        LocalDate date = LocalDate.now();
        int days = 365;
        if (date.isLeapYear()) {
            days = 366;
        }
        for (int i = 1; i <= days; i++) {
            dates.add(date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            date = date.plusDays(1L);
        }
        return dates;
    }


}
