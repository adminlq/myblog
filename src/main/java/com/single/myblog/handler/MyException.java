package com.single.myblog.handler;

import com.single.myblog.consts.ErrorCode;

public class MyException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private ErrorCode errorCode;

    public MyException() {
        super();
    }

    public MyException(ErrorCode errorCode) {
        super();
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

}
