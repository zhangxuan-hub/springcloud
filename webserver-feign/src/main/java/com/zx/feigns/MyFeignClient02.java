package com.zx.feigns;

import com.zx.config.FeignClient02Config;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @创建人 张绚
 * @创建时间 2019/11/19 0019
 * @描述 如果url连接时需要输入用户名和密码，则需要在@FeignClient注解种增加configuration属性并复制为设置了用户名密码的类
 *       例如连接http://localhost:8761的用户名和密码就设置在FeignClient02Config类中
 */

@FeignClient(value = "PROVIDER-USER", url = "http://localhost:8761", configuration = FeignClient02Config.class)
public interface MyFeignClient02 {
    @RequestMapping(value = "/eureka/apps/{serviceName}", method = RequestMethod.GET)
    String getServiceInfo(@PathVariable("serviceName") String serviceName);
}
