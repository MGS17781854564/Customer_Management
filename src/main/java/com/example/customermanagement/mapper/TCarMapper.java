package com.example.customermanagement.mapper;

import com.example.customermanagement.entity.TCar;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 86180
* @description 针对表【t_car(车辆表)】的数据库操作Mapper
* @createDate 2023-04-24 11:57:23
* @Entity com.example.customermanagement.entity.TCar
*/
@Mapper
public interface TCarMapper extends BaseMapper<TCar> {

}




