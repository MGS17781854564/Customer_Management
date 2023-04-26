package com.example.customermanagement.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 权限表
 * @TableName t_auth
 */
@TableName(value ="t_auth")
@Data
public class TAuth implements Serializable {
    /**
     * 权限id
     */
    @TableId(value = "aid", type = IdType.AUTO)
    private Integer aid;

    /**
     * 权限名称
     */
    @TableField(value = "aname")
    private String aname;

    /**
     * 权限路径
     */
    @TableField(value = "apath")
    private String apath;

    /**
     * 默认权限1
     */
    @TableField(value = "atype")
    private Integer atype;

    /**
     * 父id
     */
    @TableField(value = "pid")
    private Integer pid;

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