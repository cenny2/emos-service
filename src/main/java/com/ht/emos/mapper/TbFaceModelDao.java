package com.ht.emos.mapper;

import com.ht.emos.proj.TbFaceModel;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Wuc
* @description 针对表【tb_face_model】的数据库操作Mapper
* @createDate 2022-07-14 22:04:45
* @Entity com.ht.emos.proj.TbFaceModel
*/
@Mapper
public interface TbFaceModelDao {

    int deleteByPrimaryKey(Long id);

    int insert(TbFaceModel record);

    int insertSelective(TbFaceModel record);

    TbFaceModel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbFaceModel record);

    int updateByPrimaryKey(TbFaceModel record);

}
