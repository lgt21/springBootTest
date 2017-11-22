package com.lgt.springboot.dao.config;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan("com.lgt.springboot.dao")
@AutoConfigureAfter(MyBatisConfig.class)
public class MyBatisMapperScannerConfig {
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.lgt.springboot.dao");
        return mapperScannerConfigurer;
    }
}
