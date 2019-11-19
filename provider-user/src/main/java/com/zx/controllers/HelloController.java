package com.zx.controllers;

import com.zx.beans.User;
import org.springframework.web.bind.annotation.*;

/**
 * @创建人 张绚
 * @创建时间 2019/11/15 0015
 * @描述
 */

@RestController
public class HelloController {

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") String id) {
        return new User(id);
    }

    @PostMapping("/get-user")
    public User getUser(@RequestBody User user) {
        return new User(user.getId());
    }
}
