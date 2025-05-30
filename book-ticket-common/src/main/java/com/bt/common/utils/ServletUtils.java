package com.bt.common.utils;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.StrUtil;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

/**
 * Description: Servlet工具类
 *
 * @author lc-co
 * @version 1.0
 * @date 2022-08-06  18:15
 */
public class ServletUtils {

    /**
     * 定义移动端请求的所有可能类型
     */
    private final static String[] agent = {"Android", "iPhone", "iPod", "iPad", "Windows Phone", "MQQBrowser"};



    /**
     * Description: 是否为ajax请求
     *
     * @param request 请求
     * @return boolean true 是 false 不是
     * @date 2022-09-24 10:37
     */
    public static boolean isAjaxRequest(HttpServletRequest request) {
        String accept = request.getHeader("accept");
        if (accept != null && accept.contains("application/json")) {
            return true;
        }
        String xRequestedWith = request.getHeader("X-Requested-With");
        if (xRequestedWith != null && xRequestedWith.contains("XMLHttpRequest")) {
            return true;
        }
        String uri = request.getRequestURI();
        if (StrUtil.equalsAnyIgnoreCase(uri, ".json", ".xml")) {
            return true;
        }
        String ajax = request.getParameter("__ajax");
        return StrUtil.equalsAnyIgnoreCase(ajax, "json", "xml");
    }

    /**
     * Description: 判断User-Agent 是不是来自于移动端
     *
     * @param ua User-Agent
     * @return boolean true 来自于移动端 false 不来自移动端
     * @date 2022-09-24 10:37
     */
    public static boolean checkAgentIsMobile(String ua) {
        boolean flag = false;
        if (!ua.contains("Windows NT") || (ua.contains("Windows NT") && ua.contains("compatible; MSIE 9.0;"))) {
            // 排除 苹果桌面系统
            if (!ua.contains("Windows NT") && !ua.contains("Macintosh")) {
                for (String item : agent) {
                    if (ua.contains(item)) {
                        flag = true;
                        break;
                    }
                }
            }
        }
        return flag;
    }


    /**
     * Description: 转换请求
     *
     * @param request 请求
     * @return {@link HttpServletRequest } http请求
     * @date 2022-09-24 10:36
     */
    public static HttpServletRequest toHttpServlet(ServletRequest request) {
        return (HttpServletRequest) request;
    }


    /**
     * Description: 获取请求体数据字节数组
     *
     * @param request 请求
     * @return {@link byte[] } 请求体数据字节数组
     * @date 2022-10-05 15:56
     */
    public static byte[] getBodyBytes(HttpServletRequest request) {
        try {
            return IoUtil.readBytes(request.getInputStream());
        } catch (Exception e) {
            return new byte[]{};
        }
    }
}
