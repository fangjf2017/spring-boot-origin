package com.fanshuai.ngsp.nws.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fanshuai on 2017/9/26.
 * 日志打印示例
 */
@RestController
public class LoggerController {
    private final static Logger logger = LoggerFactory.getLogger(LoggerController.class);

    @RequestMapping("/log")
    public String home() {
        logger.info("logback 访问hello");
        logger.error("logback 访问hello");
        return "Hello World!";
    }
}
