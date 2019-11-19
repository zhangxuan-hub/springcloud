package com.zx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @创建人 张绚
 * @创建时间 2019/11/15 0015
 * @描述
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class WebServerFeign {
    public static void main(String[] args) {
        SpringApplication.run(WebServerFeign.class);
    }
}
