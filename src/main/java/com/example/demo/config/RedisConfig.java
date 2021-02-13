package com.example.demo.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Flora on 2020/12/12.
 */
@Configuration
public class RedisConfig extends CachingConfigurerSupport {
    /**
     *
     * @return
     */
    public RedisSerializer<Object> jackson2JsonRedisSerializer(){
        // 使用jackson2JsonRedisSerializer来序列化和反序列化redis的value值
        Jackson2JsonRedisSerializer<Object> serializer = new Jackson2JsonRedisSerializer<Object>(Object.class);
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        serializer.setObjectMapper(mapper);
        return serializer;
    }

    public CacheManager cacheManager(RedisConnectionFactory connectionFactory){
        // 生成一个默认配置，通过config对象即可对缓存进行自定义配置
        RedisCacheConfiguration config = RedisCacheConfiguration.defaultCacheConfig();
        config = config
                // 设置key为string序列化
                .serializeKeysWith(RedisSerializationContext.SerializationPair.fromSerializer(new StringRedisSerializer()))
                // 设置value为json序列
                .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(jackson2JsonRedisSerializer()))
                // 不缓存空值
                .disableCachingNullValues()
                // 设置缓存默认过期时间 30min
                .entryTtl(Duration.ofMillis(30L));

        // 特殊缓存空间应用不同的配置
        Map<String, RedisCacheConfiguration> map = new HashMap<>();
        map.put("user1", config.entryTtl(Duration.ofSeconds(30L)));
        map.put("user2", config.entryTtl(Duration.ofHours(1L)));

        // 使用自定义缓存配置初始化一个RedisCacheManager
        RedisCacheManager cacheManager = RedisCacheManager.builder(connectionFactory)
                // 默认配置
                .cacheDefaults(config)
                // 特殊缓存
                .withInitialCacheConfigurations(map)
                // 事务
                .transactionAware()
                .build();
        return cacheManager;
    }
}
