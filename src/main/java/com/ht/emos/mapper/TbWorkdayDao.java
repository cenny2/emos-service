package com.ht.emos.mapper;

import com.ht.emos.proj.TbWorkday;

/**
* @author Wuc
* @description 针对表【tb_workday】的数据库操作Mapper
* @createDate 2022-07-14 22:04:45
* @Entity com.ht.emos.proj.TbWorkday
*/
public interface TbWorkdayDao {

    int deleteByPrimaryKey(Long id);

    int insert(TbWorkday record);

    int insertSelective(TbWorkday record);

    TbWorkday selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbWorkday record);

    int updateByPrimaryKey(TbWorkday record);

}
