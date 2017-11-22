package com.lgt.springboot.util;

/**
 * @author: lgt
 * @date: 2017/11/22  11:02
 */
public class ResponseModel<T> {

    private Integer state;

    private String message;

    private T data;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
