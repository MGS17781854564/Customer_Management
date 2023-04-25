package com.example.customermanagement.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.customermanagement.dto.AddUsersDto;
import com.example.customermanagement.entity.TUser;

/**
* @author 86180
* @description 针对表【t_user(用户表)】的数据库操作Service
* @createDate 2023-04-24 11:57:23
*/
public interface TUserService extends IService<TUser> {

    TUser register(AddUsersDto addUsersDto);
}
