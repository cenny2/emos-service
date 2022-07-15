package com.ht.emos.mapper;

import com.ht.emos.proj.TbAction;

/**
* @author Wuc
* @description 针对表【tb_action(行为表)】的数据库操作Mapper
* @createDate 2022-07-14 22:04:45
* @Entity com.ht.emos.proj.TbAction
*/
public interface TbActionDao {

    int deleteByPrimaryKey(Long id);

    int insert(TbAction record);

    int insertSelective(TbAction record);

    TbAction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbAction record);

    int updateByPrimaryKey(TbAction record);

}
