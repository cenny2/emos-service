package com.ht.emos.mapper;

import com.ht.emos.proj.TbCity;

/**
* @author Wuc
* @description 针对表【tb_city(疫情城市列表)】的数据库操作Mapper
* @createDate 2022-07-14 22:04:45
* @Entity com.ht.emos.proj.TbCity
*/
public interface TbCityMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TbCity record);

    int insertSelective(TbCity record);

    TbCity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbCity record);

    int updateByPrimaryKey(TbCity record);

}
