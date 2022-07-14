package com.ht.emos.mapper;

import com.ht.emos.proj.TbReim;

/**
* @author Wuc
* @description 针对表【tb_reim(报销单表)】的数据库操作Mapper
* @createDate 2022-07-14 22:04:45
* @Entity com.ht.emos.proj.TbReim
*/
public interface TbReimMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TbReim record);

    int insertSelective(TbReim record);

    TbReim selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbReim record);

    int updateByPrimaryKey(TbReim record);

}
