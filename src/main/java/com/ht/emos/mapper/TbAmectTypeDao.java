package com.ht.emos.mapper;

import com.ht.emos.proj.TbAmectType;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Wuc
* @description 针对表【tb_amect_type(罚金类型表)】的数据库操作Mapper
* @createDate 2022-07-14 22:04:45
* @Entity com.ht.emos.proj.TbAmectType
*/
@Mapper
public interface TbAmectTypeDao {

    int deleteByPrimaryKey(Long id);

    int insert(TbAmectType record);

    int insertSelective(TbAmectType record);

    TbAmectType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbAmectType record);

    int updateByPrimaryKey(TbAmectType record);

}
