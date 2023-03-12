package com.vounet.springbootInit.domain.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 密码
     */
    @TableField(value = "userPassword")
    private String userPassword;

    /**
     * 用户昵称
     */
    @TableField(value = "userName")
    private String userName;

    /**
     * 用户头像
     */
    @TableField(value = "userAvatar")
    private String userAvatar;

    /**
     * 用户简介
     */
    @TableField(value = "userProfile")
    private String userProfile;

    /**
     * 用户角色：user/admin/ban
     */
    @TableField(value = "userRole")
    private String userRole;

    /**
     * 创建时间
     */
    @TableField(value = "createTime")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "updateTime")
    private Date updateTime;

    /**
     * 是否删除
     */
    @TableLogic
    @TableField(value = "isDelete")
    private Integer isDelete;

    /**
     * 
     */
    @TableField(value = "email")
    private String email;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}