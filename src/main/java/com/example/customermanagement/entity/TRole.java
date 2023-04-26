package com.example.customermanagement.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 角色表
 * @TableName t_role
 */
@TableName(value ="t_role")
@Data
public class TRole implements Serializable {
    /**
     * 角色id
     */
    @TableId(value = "rid", type = IdType.AUTO)
    private Integer rid;

    /**
     * 角色名称
     */
    @TableField(value = "rname")
    private String rname;

    /**
     * 角色类型
     */
    @TableField(value = "rtype")
    private String rtype;

    /**
     * 角色描述
     */
    @TableField(value = "rdesc")
    private String rdesc;

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