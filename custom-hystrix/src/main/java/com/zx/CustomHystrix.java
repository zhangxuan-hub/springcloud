package com.zx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @创建人 张绚
 * @创建时间 2019/11/20 0020
 * @描述
 */

@SpringBootApplication
@EnableEurekaClient
public class CustomHystrix {
    @Bean
    public RestTemplate restTemplate () {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(CustomHystrix.class);
    }
}
