package com.vounet.springbootInit.common;

import com.vounet.springbootInit.domain.enums.ErrorCode;
import lombok.Data;

/**
 * @Author HIM198
 * @Date 2022 0:01
 * @Description
 **/

@Data
public class R<T> {

    /**
     * 编码：0成功，1和其它数字为失败
     */
    private int code = 0;

    /**
     * 返回消息
     */
    private String msg = "";

    /**
     * 返回数据
     */
    private Object data = null;

    public static <T> R success(T data) {
        R r = new R();
        r.code = 0;
        r.data = data;
        return r;
    }

    public static <T> R success(T data, String msg) {
        R r = new R();
        r.code = 0;
        r.data = data;
        r.msg = msg;
        return r;
    }

    public static <T> R error(String msg) {
        R r = new R();
        r.code = 1;
        r.msg = msg;
        return r;
    }

    public static <T> R error(int code,String msg) {
        R r = new R();
        r.code = code;
        r.msg = msg;
        return r;
    }

    public static <T> R error(ErrorCode errorCode) {
        R r = new R();
        r.code = errorCode.getCode();
        r.msg= errorCode.getMsg();
        return r;
    }

    public static <T> R error(ErrorCode errorCode,String msg) {
        R r = new R();
        r.code = errorCode.getCode();
        r.msg = msg;
        return r;
    }


    @Override
    public String toString() {
        return "R [code=" + code + ", msg=" + msg + ", data=" + data + "]";
    }



}

