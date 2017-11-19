package com.cn.wh.hwl.result;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一错误码异常处理
 * @Description 
 * @author Hero
 * @date 2017年11月14日 下午10:16:36
 */
@RestControllerAdvice
public class GlobalErrorInfoHandler {

    @ExceptionHandler(value = GlobalErrorException.class)
    public ResultBody errorHandlerOverJson(HttpServletRequest request,
                                           GlobalErrorException exception) {
        ErrorInfoInterface errorInfo = exception.getErrorInfo();
        ResultBody result = new ResultBody(errorInfo);
        return result;
    }
}
