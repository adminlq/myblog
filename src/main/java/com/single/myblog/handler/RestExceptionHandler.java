package com.single.myblog.handler;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.single.myblog.consts.ErrorCode;
import com.single.myblog.utils.JsonUtil;

/**
 * 全局异常返回
 * 
 * @author 刘强 email:liuqiang@bestsec.cn
 * @time 2017年10月27日 下午3:37:18
 */
@ControllerAdvice
public class RestExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(RestExceptionHandler.class);

    // 运行时异常
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public String runtimeExceptionHandler(RuntimeException runtimeException) {

        runtimeException.printStackTrace();
        return JsonUtil.toErrorCodeStr(ErrorCode.runtimeException);
    }

    // 空指针异常
    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public String nullPointerExceptionHandler(NullPointerException ex) {
        ex.printStackTrace();
        return JsonUtil.toErrorCodeStr(ErrorCode.nullPointerException);
    }

    // 类型转换异常
    @ExceptionHandler(ClassCastException.class)
    @ResponseBody
    public String classCastExceptionHandler(ClassCastException ex) {
        ex.printStackTrace();
        return JsonUtil.toErrorCodeStr(ErrorCode.classCastException);
    }

    // IO异常
    @ExceptionHandler(IOException.class)
    @ResponseBody
    public String iOExceptionHandler(IOException ex) {
        ex.printStackTrace();
        return JsonUtil.toErrorCodeStr(ErrorCode.iOException);
    }

    // 未知方法异常
    @ExceptionHandler(NoSuchMethodException.class)
    @ResponseBody
    public String noSuchMethodExceptionHandler(NoSuchMethodException ex) {
        ex.printStackTrace();
        return JsonUtil.toErrorCodeStr(ErrorCode.noSuchMethodException);
    }

    // 400错误
    @ExceptionHandler({ HttpMessageNotReadableException.class })
    @ResponseBody
    public String requestNotReadable(HttpMessageNotReadableException ex) {
        System.out.println("HttpMessageNotReadableException");
        return JsonUtil.toErrorCodeStr(ErrorCode.requestParamsException);
    }

    // 400错误
    @ExceptionHandler({ TypeMismatchException.class })
    @ResponseBody
    public String requestTypeMismatch(TypeMismatchException ex) {
        System.out.println("TypeMismatchException");
        return JsonUtil.toErrorCodeStr(ErrorCode.requestParamsException);
    }

    // 400错误
    @ExceptionHandler({ MissingServletRequestParameterException.class })
    @ResponseBody
    public String requestMissingServletRequest(MissingServletRequestParameterException ex) {
        System.out.println("MissingServletRequestParameterException");
        ex.printStackTrace();
        return JsonUtil.toErrorCodeStr(ErrorCode.requestParamsException);
    }

    // 404 有问题
    @ExceptionHandler({ NoHandlerFoundException.class })
    @ResponseBody
    public String requestMissingServletRequest(NoHandlerFoundException ex) {
        System.out.println("NoHandlerFoundException");
        ex.printStackTrace();
        return JsonUtil.toErrorCodeStr(ErrorCode.noSuchRequestHandlingMethodException);
    }

    // 500错误
    @ExceptionHandler({ ConversionNotSupportedException.class, HttpMessageNotWritableException.class })
    @ResponseBody
    public String server500(RuntimeException runtimeException) {
        return JsonUtil.toErrorCodeStr(ErrorCode.internalServerError);
    }

    // 自定义异常
    @ExceptionHandler({ MyException.class })
    @ResponseBody
    public String MyException(MyException ex) {
        logger.info(JsonUtil.toErrorCodeStr(ex.getErrorCode()));
        return JsonUtil.toErrorCodeStr(ex.getErrorCode());
    }
}
