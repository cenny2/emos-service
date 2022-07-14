package com.ht.emos.mapper;

import com.ht.emos.proj.TbUser;

/**
* @author Wuc
* @description 针对表【tb_user(用户表)】的数据库操作Mapper
* @createDate 2022-07-14 22:04:45
* @Entity com.ht.emos.proj.TbUser
*/
public interface TbUserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    TbUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);

}
