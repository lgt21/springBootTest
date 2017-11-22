package com.lgt.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author lgt
 * @date 2017/11/22 21:04
 */
@SpringBootApplication
@MapperScan("com.lgt.springboot")
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
