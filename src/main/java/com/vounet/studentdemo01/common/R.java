package com.vounet.studentdemo01.common;

import lombok.Data;

/**
 * @Author HIM198
 * @Date 2022 0:01
 * @Description
 **/

@Data
public class R<T> {
    private int code = 0;  //编码：0成功，1和其它数字为失败
    private String msg = "";
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

    @Override
    public String toString() {
        return "R [code=" + code + ", msg=" + msg + ", data=" + data + "]";
    }
}

