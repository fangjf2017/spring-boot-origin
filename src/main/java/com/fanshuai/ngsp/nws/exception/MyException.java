package com.fanshuai.ngsp.nws.exception;

/**
 * Created by fanshuai on 2018/1/19.
 * 自定义的异常类型
 */
public class MyException extends Exception {

    public MyException() {
        super();
    }

    public MyException(String msg) {
        super(msg);
    }
}
