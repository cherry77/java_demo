package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.Duration;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Resource
    RedisTemplate redisTemplate;

    @ResponseBody
    @RequestMapping("/user")
    public String index() {
        return userService.getUser();
    }

    @ResponseBody
    @RequestMapping("/addOrder")
    public void addOrder() {
        redisTemplate.opsForValue().set("order-12", "添加的订单", Duration.ofMinutes(30L));
    }

    public void vote(){

    }
}
