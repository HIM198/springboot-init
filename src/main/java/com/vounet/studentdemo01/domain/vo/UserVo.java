package com.vounet.studentdemo01.domain.vo;

import lombok.Data;

/**
 * @Author HIM198
 * @Date 2023 13:21
 * @Description
 **/

@Data
public class UserVo {
    private String username;

    private String password;

    private String email;
    //    验证码
    private String code;

    //省略了get和set方法，自己生成一下
}
