package com.ht.emos.proj;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName tb_leave
 */
@Data
public class TbLeave implements Serializable {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 用户ID
     */
    private Object userId;

    /**
     * 请假原因
     */
    private String reason;

    /**
     * 开始时间
     */
    private Date start;

    /**
     * 结束时间
     */
    private Date end;

    /**
     * 天数
     */
    private String days;

    /**
     * 类型：1病假，2事假
     */
    private Integer type;

    /**
     * 状态：1请假中，2不同意，3已同意
     */
    private Integer status;

    /**
     * 工作流实例ID
     */
    private String instanceId;

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
        TbLeave other = (TbLeave) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getStart() == null ? other.getStart() == null : this.getStart().equals(other.getStart()))
            && (this.getEnd() == null ? other.getEnd() == null : this.getEnd().equals(other.getEnd()))
            && (this.getDays() == null ? other.getDays() == null : this.getDays().equals(other.getDays()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getInstanceId() == null ? other.getInstanceId() == null : this.getInstanceId().equals(other.getInstanceId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getStart() == null) ? 0 : getStart().hashCode());
        result = prime * result + ((getEnd() == null) ? 0 : getEnd().hashCode());
        result = prime * result + ((getDays() == null) ? 0 : getDays().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
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
        sb.append(", userId=").append(userId);
        sb.append(", reason=").append(reason);
        sb.append(", start=").append(start);
        sb.append(", end=").append(end);
        sb.append(", days=").append(days);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
        sb.append(", instanceId=").append(instanceId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}