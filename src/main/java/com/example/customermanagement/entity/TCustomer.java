package com.example.customermanagement.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 客户表
 * @TableName t_customer
 */
@TableName(value ="t_customer")
@Data
public class TCustomer implements Serializable {
    /**
     * 客户id
     */
    @TableId(value = "cid")
    private Long cid;

    /**
     * 客户名(真实姓名)
     */
    @TableField(value = "cname")
    private String cname;

    /**
     * 客户手机号
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 客户邮件
     */
    @TableField(value = "email")
    private String email;

    /**
     * 证件号
     */
    @TableField(value = "idcard")
    private String idcard;

    /**
     * 客户类型默认个人
     */
    @TableField(value = "ctype")
    private Integer ctype;

    /**
     * 客户性别默认男
     */
    @TableField(value = "csex")
    private Integer csex;

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