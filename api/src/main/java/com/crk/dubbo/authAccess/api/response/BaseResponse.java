package com.crk.dubbo.authAccess.api.response;/**
 * Created by Administrator on 2019/1/12.
 */

import com.crk.dubbo.authAccess.api.enums.StatusCode;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author:debug (SteadyJack)
 * @Date: 2019/1/12 13:59
 **/
@Data
public class BaseResponse<T> implements Serializable{

    private Integer code;
    private String msg;
    private T data;

    public BaseResponse() {
    }

    public BaseResponse(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public BaseResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseResponse(StatusCode statusCode) {
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
    }

}


























