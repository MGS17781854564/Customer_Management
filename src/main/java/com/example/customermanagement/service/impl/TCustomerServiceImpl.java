package com.example.customermanagement.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.customermanagement.entity.TCustomer;
import com.example.customermanagement.service.TCustomerService;
import com.example.customermanagement.mapper.TCustomerMapper;
import org.springframework.stereotype.Service;

/**
* @author 86180
* @description 针对表【t_customer(客户表)】的数据库操作Service实现
* @createDate 2023-04-24 11:57:23
*/
@Service
public class TCustomerServiceImpl extends ServiceImpl<TCustomerMapper, TCustomer>
    implements TCustomerService{

}




