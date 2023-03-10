package com.vounet.studentdemo01.domain.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_user
 */
@TableName(value ="t_user")
@Data
public class TUser implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    @TableField(value = "username")
    private String username;

    /**
     * 
     */
    @TableField(value = "password")
    private String password;

    /**
     * 
     */
    @TableField(value = "email")
    private String email;

    /**
     *
     */
    @TableLogic(value = "0", delval = "1")
    @TableField(value = "isDelete")
    private String isDelete;

    /**
     * 
     */
    @TableField(value = "nickname")
    private String nickname;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}