package com.lgt.springboot.model.response;

/**
 * @author: lgt
 * @date: 2017/11/22  11:02
 */
public class ResponseModel<T> {

    private Integer state;

    private String message;

    private T data;

    private final static Integer ERROR = -1;
    private final static Integer SUCCESS = 0;


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

    public ResponseModel(Integer state, String message, T data) {
        this.state = state;
        this.message = message;
        this.data = data;
    }

    public static ResponseModel error(String message) {
        return new ResponseModel(ERROR, message, null);
    }
    public static ResponseModel success(Object data) {
        return new ResponseModel(ERROR, null, data);
    }
}
