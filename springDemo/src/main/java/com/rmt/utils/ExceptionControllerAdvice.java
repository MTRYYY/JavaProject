package com.rmt.utils;

import com.rmt.config.enums.ResultCode;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

public class ExceptionControllerAdvice {

    @ExceptionHandler(APIException.class)
    public ResultVo<String> APIExceptionHandler(APIException e){
        return new ResultVo<String>(ResultCode.FAILED, e.getMsg());
    }

    //参数校验
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultVo<String> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e){
        //从异常对象中获取ObjectException对象
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        //提取错误信息进行返回
        return new ResultVo<>(ResultCode.VALIDATE_FAILED,objectError.getDefaultMessage() );
    }

}
