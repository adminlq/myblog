package com.single.myblog.dto;

public class ResultCode {

    private Integer code;
    private String message;

    public ResultCode() {
        super();
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
