package com.ht.emos.proj;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 会议表
 * @TableName tb_meeting
 */
@Data
public class TbMeeting implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * UUID
     */
    private String uuid;

    /**
     * 会议题目
     */
    private String title;

    /**
     * 创建人ID
     */
    private Long creatorId;

    /**
     * 日期
     */
    private Date date;

    /**
     * 开会地点
     */
    private String place;

    /**
     * 开始时间
     */
    private Date start;

    /**
     * 结束时间
     */
    private Date end;

    /**
     * 会议类型（1在线会议，2线下会议）
     */
    private Integer type;

    /**
     * 参与者
     */
    private Object members;

    /**
     * 会议内容
     */
    private String desc;

    /**
     * 工作流实例ID
     */
    private String instanceId;

    /**
     * 出席人员名单
     */
    private Object present;

    /**
     * 未出席人员名单
     */
    private Object unpresent;

    /**
     * 状态（1.申请中，2.审批未通过，3.审批通过，4.会议进行中，5.会议结束）
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TbMeeting other = (TbMeeting) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getCreatorId() == null ? other.getCreatorId() == null : this.getCreatorId().equals(other.getCreatorId()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getPlace() == null ? other.getPlace() == null : this.getPlace().equals(other.getPlace()))
            && (this.getStart() == null ? other.getStart() == null : this.getStart().equals(other.getStart()))
            && (this.getEnd() == null ? other.getEnd() == null : this.getEnd().equals(other.getEnd()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getMembers() == null ? other.getMembers() == null : this.getMembers().equals(other.getMembers()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getInstanceId() == null ? other.getInstanceId() == null : this.getInstanceId().equals(other.getInstanceId()))
            && (this.getPresent() == null ? other.getPresent() == null : this.getPresent().equals(other.getPresent()))
            && (this.getUnpresent() == null ? other.getUnpresent() == null : this.getUnpresent().equals(other.getUnpresent()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getCreatorId() == null) ? 0 : getCreatorId().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getPlace() == null) ? 0 : getPlace().hashCode());
        result = prime * result + ((getStart() == null) ? 0 : getStart().hashCode());
        result = prime * result + ((getEnd() == null) ? 0 : getEnd().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getMembers() == null) ? 0 : getMembers().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        result = prime * result + ((getPresent() == null) ? 0 : getPresent().hashCode());
        result = prime * result + ((getUnpresent() == null) ? 0 : getUnpresent().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uuid=").append(uuid);
        sb.append(", title=").append(title);
        sb.append(", creatorId=").append(creatorId);
        sb.append(", date=").append(date);
        sb.append(", place=").append(place);
        sb.append(", start=").append(start);
        sb.append(", end=").append(end);
        sb.append(", type=").append(type);
        sb.append(", members=").append(members);
        sb.append(", desc=").append(desc);
        sb.append(", instanceId=").append(instanceId);
        sb.append(", present=").append(present);
        sb.append(", unpresent=").append(unpresent);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}