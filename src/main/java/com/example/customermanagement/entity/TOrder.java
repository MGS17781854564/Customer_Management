package com.example.customermanagement.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 货运订单表
 * @TableName t_order
 */
@TableName(value ="t_order")
@Data
public class TOrder implements Serializable {
    /**
     * 订单id
     */
    @TableId(value = "oid", type = IdType.AUTO)
    private Integer oid;

    /**
     * 订单编号
     */
    @TableField(value = "onumber")
    private String onumber;

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