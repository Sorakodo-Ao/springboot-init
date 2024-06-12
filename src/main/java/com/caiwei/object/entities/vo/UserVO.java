package com.caiwei.object.entities.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName user
 */
@TableName(value ="user")
@Data
public class UserVO implements Serializable {
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
     * 账户（用户名）
     */
    private String account;


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}