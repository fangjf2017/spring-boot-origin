package com.tuniu.ngsp.nws.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by fanshuai on 2017/9/30.
 * swagger现在接口文档示例
 * 访问：http://localhost:8080/swagger-ui.html
 */
@Controller
@RequestMapping(value = "/swagger")
@Api(value = "/swagger", description = "在线测试文档")
public class DemoForSwaggerController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String testForSwagger() {
        return "hello swagger!";
    }


}
