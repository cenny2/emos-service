package com.ht.emos.mapper;

import com.ht.emos.proj.TbPermission;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Wuc
* @description 针对表【tb_permission】的数据库操作Mapper
* @createDate 2022-07-14 22:04:45
* @Entity com.ht.emos.proj.TbPermission
*/
@Mapper
public interface TbPermissionDao {

    int deleteByPrimaryKey(Long id);

    int insert(TbPermission record);

    int insertSelective(TbPermission record);

    TbPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbPermission record);

    int updateByPrimaryKey(TbPermission record);

}
