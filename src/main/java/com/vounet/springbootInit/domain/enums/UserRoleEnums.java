package com.vounet.springbootInit.domain.enums;

/**
 * @Author HIM198
 * @Date 2023 17:54
 * @Description
 **/

public enum UserRoleEnums {


    //用户权限
    USER("用户","user"),
    ADMIN("管理员","admin"),
    BAN("被封号","ban");


    private final String text;
    private final String value;

    UserRoleEnums(String text, String value) {
        this.text = text;
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public String getValue() {
        return value;
    }


}
