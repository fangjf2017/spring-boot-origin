package com.tuniu.ngsp.nws.vo;

/**
 * Created by fanshuai on 2018/1/19.
 * 统一的数据返回格式
 */
public class ResponseVo {

    private boolean success = true;
    private String msg;
    private int errorCode = 1200000;
    private Object data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
