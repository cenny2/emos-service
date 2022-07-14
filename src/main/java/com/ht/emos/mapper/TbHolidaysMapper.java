package com.ht.emos.mapper;

import com.ht.emos.proj.TbHolidays;

/**
* @author Wuc
* @description 针对表【tb_holidays(节假日表)】的数据库操作Mapper
* @createDate 2022-07-14 22:04:45
* @Entity com.ht.emos.proj.TbHolidays
*/
public interface TbHolidaysMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TbHolidays record);

    int insertSelective(TbHolidays record);

    TbHolidays selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbHolidays record);

    int updateByPrimaryKey(TbHolidays record);

}
