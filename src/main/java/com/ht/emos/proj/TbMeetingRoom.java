package com.ht.emos.proj;

import java.io.Serializable;
import lombok.Data;

/**
 * 会议室表
 * @TableName tb_meeting_room
 */
@Data
public class TbMeetingRoom implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 会议室名称
     */
    private String name;

    /**
     * 最大人数
     */
    private Integer max;

    /**
     * 备注
     */
    private String desc;

    /**
     * 状态，0不可用，1可用
     */
    private Integer status;

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
        TbMeetingRoom other = (TbMeetingRoom) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getMax() == null ? other.getMax() == null : this.getMax().equals(other.getMax()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getMax() == null) ? 0 : getMax().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", max=").append(max);
        sb.append(", desc=").append(desc);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}