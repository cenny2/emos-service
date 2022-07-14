package com.ht.emos.mapper;

import com.ht.emos.proj.TbCheckin;

/**
* @author Wuc
* @description 针对表【tb_checkin(签到表)】的数据库操作Mapper
* @createDate 2022-07-14 22:04:45
* @Entity com.ht.emos.proj.TbCheckin
*/
public interface TbCheckinMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TbCheckin record);

    int insertSelective(TbCheckin record);

    TbCheckin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbCheckin record);

    int updateByPrimaryKey(TbCheckin record);

}
