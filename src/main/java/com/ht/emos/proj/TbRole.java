package com.ht.emos.proj;

import java.io.Serializable;
import lombok.Data;

/**
 * 角色表
 * @TableName tb_role
 */
@Data
public class TbRole implements Serializable {
    /**
     * 主键
     */
    private Object id;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 权限集合
     */
    private Object permissions;

    /**
     * 描述
     */
    private String desc;

    /**
     * 系统角色内置权限
     */
    private Object defaultPermissions;

    /**
     * 是否为系统内置角色
     */
    private Integer systemic;

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
        TbRole other = (TbRole) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRoleName() == null ? other.getRoleName() == null : this.getRoleName().equals(other.getRoleName()))
            && (this.getPermissions() == null ? other.getPermissions() == null : this.getPermissions().equals(other.getPermissions()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getDefaultPermissions() == null ? other.getDefaultPermissions() == null : this.getDefaultPermissions().equals(other.getDefaultPermissions()))
            && (this.getSystemic() == null ? other.getSystemic() == null : this.getSystemic().equals(other.getSystemic()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        result = prime * result + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getDefaultPermissions() == null) ? 0 : getDefaultPermissions().hashCode());
        result = prime * result + ((getSystemic() == null) ? 0 : getSystemic().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleName=").append(roleName);
        sb.append(", permissions=").append(permissions);
        sb.append(", desc=").append(desc);
        sb.append(", defaultPermissions=").append(defaultPermissions);
        sb.append(", systemic=").append(systemic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}