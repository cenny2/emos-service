package com.ht.emos.mapper;

import com.ht.emos.proj.TbAmect;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Wuc
* @description 针对表【tb_amect(罚金表)】的数据库操作Mapper
* @createDate 2022-07-14 22:04:45
* @Entity com.ht.emos.proj.TbAmect
*/
@Mapper
public interface TbAmectDao {

    int deleteByPrimaryKey(Long id);

    int insert(TbAmect record);

    int insertSelective(TbAmect record);

    TbAmect selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbAmect record);

    int updateByPrimaryKey(TbAmect record);

}
