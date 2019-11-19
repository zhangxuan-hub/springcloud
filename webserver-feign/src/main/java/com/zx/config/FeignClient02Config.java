package com.zx.config;

import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @创建人 张绚
 * @创建时间 2019/11/19 0019
 * @描述
 */

@Configuration
public class FeignClient02Config {

    /**
     * 用于创建连接获取数据时的用户名和密码
     * @return
     */
//    @Bean
//    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
//        return new BasicAuthRequestInterceptor("用户名", "密码");
//    }

    /**
     * 配置日志要输出的内容，输出级别在application.yml文件种定义
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
