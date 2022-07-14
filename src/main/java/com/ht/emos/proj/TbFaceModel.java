package com.ht.emos.proj;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName tb_face_model
 */
@Data
public class TbFaceModel implements Serializable {
    /**
     * 主键值
     */
    private Object id;

    /**
     * 用户ID
     */
    private Object userId;

    /**
     * 用户人脸模型
     */
    private String faceModel;

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
        TbFaceModel other = (TbFaceModel) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getFaceModel() == null ? other.getFaceModel() == null : this.getFaceModel().equals(other.getFaceModel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getFaceModel() == null) ? 0 : getFaceModel().hashCode());
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
        sb.append(", faceModel=").append(faceModel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}