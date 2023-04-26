package com.example.customermanagement.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 用户表
 * @TableName t_user
 */
@TableName(value ="t_user")
@Data
public class TUser implements Serializable {
    /**
     * 用户id
     */
    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

    /**
     * 用户名默认冥夜
     */
    @TableField(value = "uname")
    private String uname;

    /**
     * 用户用于登录时的账号
     */
    @TableField(value = "uaccount")
    private String uaccount;

    /**
     * 用户密码
     */
    @TableField(value = "upass")
    private String upass;

    /**
     * 用户邮件
     */
    @TableField(value = "email")
    private String email;

    /**
     * 用户手机号
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 待扩充字段
     */
    @TableField(value = "remake")
    private String remake;

    /**
     * 待扩充字段
     */
    @TableField(value = "remake1")
    private String remake1;

    /**
     * 待扩充字段
     */
    @TableField(value = "remake2")
    private String remake2;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}