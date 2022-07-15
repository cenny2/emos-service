package com.ht.emos.mapper;

import com.ht.emos.proj.TbRole;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Wuc
* @description 针对表【tb_role(角色表)】的数据库操作Mapper
* @createDate 2022-07-14 22:04:45
* @Entity com.ht.emos.proj.TbRole
*/
@Mapper
public interface TbRoleDao {

    int deleteByPrimaryKey(Long id);

    int insert(TbRole record);

    int insertSelective(TbRole record);

    TbRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbRole record);

    int updateByPrimaryKey(TbRole record);

}
