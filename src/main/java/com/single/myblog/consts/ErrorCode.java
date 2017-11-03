package com.single.myblog.consts;


/**
 * 全局错误码
 * 
 * @author 刘强 email:liuqiang@bestsec.cn
 * @time 2017年5月15日 下午3:52:50
 */
public enum ErrorCode {

    success(0, "Success", "成功"), 
    failure(1, "Failure", "失败"), 
    targetNotExist(2, "Target does not exist or have been deleted", "数据不存在或已被删除"),
    userNameOrPasswdError(3, "UserName Or Passwd Error", "用户名或密码错误"), 
    pleaseLogin(4, "Please Login", "请登录"),
    oldPasswdError(5, "Old Passwd Error", "原密码错误"),
    appAlreadyError(6, "App Already Error", "应用信息已存在配置"),
    identifyingCodeError(7, "Identifying code error", "验证码错误，请确认后重新输入！"),
    requestParamsException(400,"Request Params Exception","请求参数异常"),
    noSuchRequestHandlingMethodException(404,"NoSuchRequestHandlingMethodException","API不存在"),
    internalServerError(500,"Internal Server Error","服务器错误"),
    runtimeException(1000, "RuntimeException", "[服务器]运行时异常"), 
    nullPointerException(1001, "NullPointerException", "空指针异常"),
    classCastException(1002,"ClassCastException","类型转换异常"),
    iOException(1003,"IOException","IO异常"),
    noSuchMethodException(999,"NoSuchMethodException","未知错误");

    private int code;
    private String description;
    private String reason;

    private ErrorCode(int code, String description, String reason) {
        this.code = code;
        this.description = description;
        this.reason = reason;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getReason() {
        return reason;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}
