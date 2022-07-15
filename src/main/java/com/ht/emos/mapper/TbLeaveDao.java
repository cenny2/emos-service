package com.ht.emos.mapper;

import com.ht.emos.proj.TbLeave;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Wuc
* @description 针对表【tb_leave】的数据库操作Mapper
* @createDate 2022-07-14 22:04:45
* @Entity com.ht.emos.proj.TbLeave
*/
@Mapper
public interface TbLeaveDao {

    int deleteByPrimaryKey(Long id);

    int insert(TbLeave record);

    int insertSelective(TbLeave record);

    TbLeave selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbLeave record);

    int updateByPrimaryKey(TbLeave record);

}
