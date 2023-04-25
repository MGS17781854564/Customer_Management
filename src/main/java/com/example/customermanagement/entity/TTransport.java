package com.example.customermanagement.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 运输线路表
 * @TableName t_transport
 */
@TableName(value ="t_transport")
@Data
public class TTransport implements Serializable {
    /**
     * 线路id
     */
    @TableId(value = "tid", type = IdType.AUTO)
    private Integer tid;

    /**
     * 线路编号
     */
    @TableField(value = "tnumber")
    private String tnumber;

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