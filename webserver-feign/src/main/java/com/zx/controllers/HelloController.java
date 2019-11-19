package com.zx.controllers;

import com.zx.beans.User;
import com.zx.feigns.MyFeignClient;
import com.zx.feigns.MyFeignClient02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @创建人 张绚
 * @创建时间 2019/11/15 0015
 * @描述
 */

@RestController
public class HelloController {
    @Autowired
    private MyFeignClient feignClient;
    @Autowired
    private MyFeignClient02 feignClient02;

    @GetMapping("/order/{id}")
    public User getUserById(@PathVariable("id") String id) {
        User user = feignClient.getUserById(id);
        return user;
    }

    @RequestMapping(value = "/feign-get-user", method = RequestMethod.GET)
    public User getUser(@RequestBody User user) {
        User user1 = feignClient.getUser(user);
        return user1;
    }

    @RequestMapping(value = "/serviceInfo/{name}", method = RequestMethod.GET)
    public String getInfo(@PathVariable("name") String name) {
        String info = feignClient02.getServiceInfo(name);
        return info;
    }
}
