package com.example.customermanagement.service.impl;

import cn.hutool.crypto.digest.BCrypt;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.customermanagement.dto.AddUsersDto;
import com.example.customermanagement.entity.TUser;
import com.example.customermanagement.mapper.TUserMapper;
import com.example.customermanagement.service.TUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 86180
* @description 针对表【t_user(用户表)】的数据库操作Service实现
* @createDate 2023-04-24 11:57:23
*/
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser>
    implements TUserService{

    @Override
    public TUser register(AddUsersDto addUsersDto) {
        TUser tUser = new TUser();
        BeanUtils.copyProperties(tUser,addUsersDto);
        LambdaQueryWrapper<TUser> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(TUser::getUaccount,addUsersDto.getUaccount());
        List<TUser> list = list(queryWrapper);
        if (list.size()>0) return null;

        //将密码进行加密操作
        String s = BCrypt.hashpw(tUser.getUpass());
        tUser.setUpass(s);
        baseMapper.insert(tUser);
        return tUser;
    }
}




