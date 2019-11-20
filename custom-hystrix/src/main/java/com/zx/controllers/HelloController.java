package com.zx.controllers;

import com.zx.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @创建人 张绚
 * @创建时间 2019/11/20 0020
 * @描述
 */

@RestController
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test/{id}")
    public User test(@PathVariable("id") String id) {
        User user = restTemplate.getForObject("http://localhost:7900/user/" + id, User.class);
        return user;
    }
}
