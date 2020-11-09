package com.mocha.springbootwar.config;

import java.net.UnknownHostException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import com.mocha.springbootwar.bean.Employee;

@Configuration
public class MyRedisConfig {

    /**
     * 配置类的json序列化器，实现json存入redis缓存
     * @param redisConnectionFactory redis连接工厂
     * @return
     * @throws UnknownHostException 异常抛出
     */
    @Bean
    public RedisTemplate<Object, Employee> redisTemplate(
            RedisConnectionFactory redisConnectionFactory)
                    throws UnknownHostException {
        RedisTemplate<Object, Employee> template = new RedisTemplate<Object, Employee>();
        template.setConnectionFactory(redisConnectionFactory);
        template.setDefaultSerializer(new Jackson2JsonRedisSerializer<Employee>(Employee.class));
        return template;
    }
    
}
