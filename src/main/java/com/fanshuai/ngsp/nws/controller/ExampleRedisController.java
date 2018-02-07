package com.fanshuai.ngsp.nws.controller;

import com.fanshuai.ngsp.nws.service.IRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fanshuai on 2017/9/30.
 * redis使用demo
 */
@RestController
public class ExampleRedisController {

    @Autowired
    private IRedisService redisService;


    @RequestMapping("/redis/set")
    public boolean redisSet(@RequestParam("value") String value) {
        boolean isOk = redisService.set("car_name", value);
        return isOk;
    }

    @RequestMapping("/redis/get")
    public String redisGet() {
        String name = redisService.get("car_name");
        return name;
    }
}
