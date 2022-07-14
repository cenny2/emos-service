package com.ht.emos.proj;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 罚金类型表
 * @TableName tb_amect_type
 */
@Data
public class TbAmectType implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 类别
     */
    private String type;

    /**
     * 罚金
     */
    private BigDecimal money;

    /**
     * 是否为系统内置
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
        TbAmectType other = (TbAmectType) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getSystemic() == null ? other.getSystemic() == null : this.getSystemic().equals(other.getSystemic()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
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
        sb.append(", type=").append(type);
        sb.append(", money=").append(money);
        sb.append(", systemic=").append(systemic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}