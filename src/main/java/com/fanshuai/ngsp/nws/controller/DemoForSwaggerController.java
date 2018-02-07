package com.fanshuai.ngsp.nws.controller;

import com.google.common.collect.Lists;
import com.fanshuai.ngsp.nws.exception.MyException;
import com.fanshuai.ngsp.nws.vo.ResponseVo;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fanshuai on 2017/9/30.
 * swagger现在接口文档示例
 * 访问：http://localhost:8080/swagger-ui.html
 */
@RestController
@RequestMapping(value = "/swagger")
@Api(value = "/swagger", description = "在线测试文档")
public class DemoForSwaggerController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String testForSwagger() throws Exception {
        return "hello swagger!";
    }

    @RequestMapping(value = "/json", method = RequestMethod.GET)
    public ResponseVo json() throws MyException {//测试异常的统一处理
        Map<String, Object> m = new HashMap<String, Object>();
        m.put("name", "test");
        m.put("password", "123");
        try {
             List<?> l = Lists.newArrayList();
            l.clear();
            System.out.println(l.get(100));
        } catch (Exception e) {
            throw new MyException("自定义的异常类型");
        }
        ResponseVo vo = new ResponseVo();
        vo.setData(m);
        return vo;
    }


}
