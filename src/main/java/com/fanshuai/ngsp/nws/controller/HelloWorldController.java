package com.fanshuai.ngsp.nws.controller;

import com.fanshuai.ngsp.nws.mapper.dto.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by fanshuai on 2017/9/27.
 * demo for actuator(监控)
 */
@Controller
@RequestMapping("/hello-world")
public class HelloWorldController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Greeting sayHello(@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
