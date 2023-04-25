package com.example.customermanagement.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.customermanagement.entity.TAuth;
import com.example.customermanagement.service.TAuthService;
import com.example.customermanagement.mapper.TAuthMapper;
import org.springframework.stereotype.Service;

/**
* @author 86180
* @description 针对表【t_auth(权限表)】的数据库操作Service实现
* @createDate 2023-04-24 11:57:23
*/
@Service
public class TAuthServiceImpl extends ServiceImpl<TAuthMapper, TAuth>
    implements TAuthService{

}




