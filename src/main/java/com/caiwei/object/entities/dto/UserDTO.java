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
     *
     */
    private String name;

    /**
     *
     */
    private String phoneNumber;

    /**
     *
     */
    private String email;

    /**
     *
     */
    private String password;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}