package com.vounet.educationdemo02.domain.entity;

import lombok.Data;

/**
 * @Author HIM198
 * @Date 2023 13:13
 * @Description
 **/

@Data
public class User {
    private String username;
    private String password;
    private String email;

    //get和set方法省略了，自己生成一下

}