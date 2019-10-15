package com.springboot;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Component;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@EnableFeignClients({"com.springboot.feign"})
@Component("com.springboot")
@MapperScan({"com.springboot.mapper"})
public class SpringBootStart extends SpringBootServletInitializer implements WebApplicationInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootStart.class);
    }

    public static  void main(String [] args){
        SpringApplication.run(SpringBootStart.class,args);
    }
}
