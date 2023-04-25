package com.example.customermanagement.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class AddUsersDto {
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
}
