package com.example.customermanagement.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.customermanagement.entity.TCar;
import com.example.customermanagement.service.TCarService;
import com.example.customermanagement.mapper.TCarMapper;
import org.springframework.stereotype.Service;

/**
* @author 86180
* @description 针对表【t_car(车辆表)】的数据库操作Service实现
* @createDate 2023-04-24 11:57:23
*/
@Service
public class TCarServiceImpl extends ServiceImpl<TCarMapper, TCar>
    implements TCarService{

}




