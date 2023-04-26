package com.example.customermanagement.mapper;

import com.example.customermanagement.entity.TCustomer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 86180
* @description 针对表【t_customer(客户表)】的数据库操作Mapper
* @createDate 2023-04-24 11:57:23
* @Entity com.example.customermanagement.entity.TCustomer
*/
@Mapper
public interface TCustomerMapper extends BaseMapper<TCustomer> {

}




