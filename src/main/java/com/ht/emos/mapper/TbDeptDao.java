package com.ht.emos.mapper;

import com.ht.emos.proj.TbDept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author Wuc
* @description 针对表【tb_dept】的数据库操作Mapper
* @createDate 2022-07-14 22:04:45
* @Entity com.ht.emos.proj.TbDept
*/
@Mapper
public interface TbDeptDao {

    int deleteByPrimaryKey(Long id);

    int insert(TbDept record);

    int insertSelective(TbDept record);

    TbDept selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbDept record);

    int updateByPrimaryKey(TbDept record);

    List<TbDept> queryAllDept();

}
