package com.fanshuai.ngsp.nws.controller;


import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/**
 * Created by fan on 2019/4/12.
 */
@Controller
@RequestMapping("test")
public class TestServiceController {

    private static final Logger log = LoggerFactory.getLogger(TestServiceController.class);

    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(@RequestParam("recordId") String recordId) {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://127.0.0.1:6379").setPassword("123456");
        RedissonClient rc = Redisson.create(config);
        String res = "";
        RLock lock = rc.getLock(recordId);
        try {
            //尝试获得锁，等候1s,锁的过期时间是6s
            boolean bs = lock.tryLock(1, 6, TimeUnit.SECONDS);
            if (bs) {
                // 业务代码
                log.info("进入业务代码: " + recordId);
                res = "获得锁";
            } else {
                res = "没有获得锁";
            }
        } catch (Exception e) {
            log.error("", e);
            lock.unlock();
        }
        return res;
    }

}
