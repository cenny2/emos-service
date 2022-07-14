package com.ht.emos.mapper;

import com.ht.emos.proj.TbModule;

/**
* @author Wuc
* @description 针对表【tb_module(模块资源表)】的数据库操作Mapper
* @createDate 2022-07-14 22:04:45
* @Entity com.ht.emos.proj.TbModule
*/
public interface TbModuleMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TbModule record);

    int insertSelective(TbModule record);

    TbModule selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbModule record);

    int updateByPrimaryKey(TbModule record);

}
