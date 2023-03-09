package com.vounet.educationdemo02.domain.vo;

import com.vounet.educationdemo02.domain.entity.User;

/**
 * @Author HIM198
 * @Date 2023 13:21
 * @Description
 **/

public class UserVoToUser {

    /**
     * 将表单中的对象转化为数据库中存储的用户对象（剔除表单中的code）
     * @param userVo
     * @return
     */
    public static User toUser(UserVo userVo) {

        //创建一个数据库中存储的对象
        User user = new User();

        //传值
        user.setUsername(userVo.getUsername());
        user.setPassword(userVo.getPassword());
        user.setEmail(userVo.getEmail());

        // 返回包装后的对象
        return user;
    }
}

