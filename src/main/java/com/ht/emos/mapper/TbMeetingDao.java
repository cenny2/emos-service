package com.ht.emos.mapper;

import com.ht.emos.proj.TbMeeting;

/**
* @author Wuc
* @description 针对表【tb_meeting(会议表)】的数据库操作Mapper
* @createDate 2022-07-14 22:04:45
* @Entity com.ht.emos.proj.TbMeeting
*/
public interface TbMeetingDao {

    int deleteByPrimaryKey(Long id);

    int insert(TbMeeting record);

    int insertSelective(TbMeeting record);

    TbMeeting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbMeeting record);

    int updateByPrimaryKey(TbMeeting record);

}
