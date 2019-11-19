package com.zx.feigns;

import com.zx.beans.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @创建人 张绚
 * @创建时间 2019/11/15 0015
 * @描述
 */

@FeignClient("PROVIDER-USER")
public interface MyFeignClient {

//    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @GetMapping("/user/{id}")
    User getUserById(@PathVariable("id") String id);

    @RequestMapping(value = "/get-user", method = RequestMethod.GET, consumes = "application/json") //服务提供者必须时post方式接收请求，如果服务提供者非要以get方式传递多个数据，则只能以普通参数方式传递，不能封装为复杂对象
    User getUser(@RequestBody User user); //如果你传递的时复杂请求参数，那么无论你配置的时什么请求方式，feign都会以post方式发送出去

}
