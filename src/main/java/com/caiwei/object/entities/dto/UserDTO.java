package com.caiwei.object.entities.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName user
 */
@Data
public class UserDTO implements Serializable {

    /**
     * 姓名
     */
    private String name;

    /**
     * 电话
     */
    private String phoneNumber;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * 账户（用户名）
     */
    private String account;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}