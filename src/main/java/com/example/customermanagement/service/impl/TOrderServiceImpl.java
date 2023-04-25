package com.example.customermanagement.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.customermanagement.entity.TOrder;
import com.example.customermanagement.service.TOrderService;
import com.example.customermanagement.mapper.TOrderMapper;
import org.springframework.stereotype.Service;

/**
* @author 86180
* @description 针对表【t_order(货运订单表)】的数据库操作Service实现
* @createDate 2023-04-24 11:57:23
*/
@Service
public class TOrderServiceImpl extends ServiceImpl<TOrderMapper, TOrder>
    implements TOrderService{

}




