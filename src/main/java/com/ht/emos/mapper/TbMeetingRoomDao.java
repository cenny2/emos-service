package com.ht.emos.mapper;

import com.ht.emos.proj.TbMeetingRoom;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Wuc
* @description 针对表【tb_meeting_room(会议室表)】的数据库操作Mapper
* @createDate 2022-07-14 22:04:45
* @Entity com.ht.emos.proj.TbMeetingRoom
*/
@Mapper
public interface TbMeetingRoomDao {

    int deleteByPrimaryKey(Long id);

    int insert(TbMeetingRoom record);

    int insertSelective(TbMeetingRoom record);

    TbMeetingRoom selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbMeetingRoom record);

    int updateByPrimaryKey(TbMeetingRoom record);

}
