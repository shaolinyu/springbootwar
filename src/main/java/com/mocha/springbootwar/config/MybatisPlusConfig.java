package com.mocha.springbootwar.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.baomidou.mybatisplus.core.incrementer.IKeyGenerator;
import com.baomidou.mybatisplus.extension.incrementer.OracleKeyGenerator;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;

@Configuration
@MapperScan(basePackages = { "com.mocha.springbootwar.mapper" })
@EnableTransactionManagement
public class MybatisPlusConfig {
    
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
    
    /**
     * 配置oracle主键sequence生成策略
     * @return
     */
    @Bean
    public IKeyGenerator keyGenerator() {
        return new OracleKeyGenerator();
    }

}
