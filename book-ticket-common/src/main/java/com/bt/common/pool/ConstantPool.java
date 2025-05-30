package com.bt.common.pool;

import cn.hutool.core.map.MapUtil;

import java.util.Map;

/**
 * 公共常量池
 */
public class ConstantPool {


    /**
     * 字符串集
     */
    public static final String CONSTANT_UTF8 = "utf-8";

    /**
     * redis缓存名称
     */
    public static final String REDIS_CACHE_NAME = "redis";

    /**
     * redis缓存管理名称
     */
    public static final String REDIS_CACHE_MANAGER = "redisCacheManager";

    /**
     * caffeine一级缓存名称
     */
    public static final String CAFFEINE_CACHE_NAME = "caffeine";

    /**
     * caffeine一级缓存管理名称
     */
    public static final String CAFFEINE_CACHE_MANAGER = "caffeineCacheManager";

    /**
     * mongodb 航班集合名称
     */
    public static final String FLIGHT_COLLECTION_NAME = "flight";

    /**
     * mongodb 订单集合名称
     */
    public static final String ORDER_COLLECTION_NAME = "order";


    /**
     * 航班实体字段映射map
     */
    public static Map<String, String> FLIGHT_FIELD_MAPPING = MapUtil.newHashMap(10);

    /**
     * 订单实体字段映射map
     */
    public static Map<String, String> ORDER_FIELD_MAPPING = MapUtil.newHashMap(10);

    static {
        // 订单id（orderId）映射id
        ORDER_FIELD_MAPPING.put("orderId", "id");
        // 订单创建时间（createdTime）映射createTime
        ORDER_FIELD_MAPPING.put("createdTime", "createTime");
    }


}
