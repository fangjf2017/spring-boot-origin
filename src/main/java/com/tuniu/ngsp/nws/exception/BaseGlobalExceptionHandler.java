package com.tuniu.ngsp.nws.exception;

import com.tuniu.ngsp.nws.vo.ResponseVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by fanshuai on 2018/1/19.
 * 异常处理的基类
 */
@Component
@ControllerAdvice
public class BaseGlobalExceptionHandler {

    protected static final Logger logger = null;
    protected static final String DEFAULT_ERROR_MESSAGE = "系统忙，请稍后再试";


    //其他未处理的异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseVo ExceptionHandler(Exception e) {
        ResponseVo vo = new ResponseVo();
        vo.setMsg("通用异常");
        return vo;
    }


    //其他未处理的异常
    @ExceptionHandler(MyException.class)
    @ResponseBody
    public ResponseVo MyExceptionHandler(Exception e) {
        ResponseVo vo = new ResponseVo();
        vo.setMsg("自定义异常");
        return vo;
    }


    public Logger getLogger() {
        return LoggerFactory.getLogger(BaseGlobalExceptionHandler.class);
    }

}
