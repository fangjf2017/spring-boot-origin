package com.tuniu.ngsp.nws.controller;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by fanshuai on 2017/9/19.
 * <p>
 * 用于tomcat下应用的部署
 */
public class SpringBootStartApplication extends SpringBootServletInitializer

{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(Application.class);
    }
}
