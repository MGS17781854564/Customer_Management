package com.example.customermanagement.controller;

import com.example.customermanagement.common.CommonResult;
import com.example.customermanagement.dto.AddUsersDto;
import com.example.customermanagement.entity.TUser;
import com.example.customermanagement.service.TUserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    TUserService tUserService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public CommonResult<TUser> add(@RequestBody AddUsersDto addUsersDto){
        TUser tUser = tUserService.register(addUsersDto);
        if (tUser==null){
            return CommonResult.failed();
        }
        return CommonResult.success(tUser);
    }
}
