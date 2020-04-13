package com.rmt.utils;

import com.rmt.config.enums.ResultCode;
import lombok.Getter;

@Getter
public class ResultVo<T> {
    /**
     * 状态码
     */
    private int code;
    /**
     * 响应信息，用来说明响应情况
     */
    private String msg;
    /**
     * 响应体数据
     */
    private T data;

    public ResultVo(T data){
        this(ResultCode.SUCCESS,data);
    }

    public ResultVo(ResultCode resultCode,T data){
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data = data;
    }
}
