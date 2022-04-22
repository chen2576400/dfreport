package com.df.report.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName membership_link
 */
@TableName(value ="membership_link")
@Data
public class MembershipLink implements Serializable {
    /**
     * 
     */
    private String classname;

    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Date createStamp;

    /**
     * 
     */
    private Boolean isDeleted;

    /**
     * 
     */
    private Boolean isPersisted;

    /**
     * 
     */
    private Long markForDelete;

    /**
     * 
     */
    private Date modifyStamp;

    /**
     * 
     */
    private Integer updateCount;

    /**
     * 
     */
    private Date updateStamp;

    /**
     * 
     */
    private Boolean verified;

    /**
     * 
     */
    private String roleaobjectClass;

    /**
     * 
     */
    private Long roleaobjectId;

    /**
     * 
     */
    private String rolebobjectClass;

    /**
     * 
     */
    private Long rolebobjectId;

    @TableField(exist = false)
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
        MembershipLink other = (MembershipLink) that;
        return (this.getClassname() == null ? other.getClassname() == null : this.getClassname().equals(other.getClassname()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateStamp() == null ? other.getCreateStamp() == null : this.getCreateStamp().equals(other.getCreateStamp()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()))
            && (this.getIsPersisted() == null ? other.getIsPersisted() == null : this.getIsPersisted().equals(other.getIsPersisted()))
            && (this.getMarkForDelete() == null ? other.getMarkForDelete() == null : this.getMarkForDelete().equals(other.getMarkForDelete()))
            && (this.getModifyStamp() == null ? other.getModifyStamp() == null : this.getModifyStamp().equals(other.getModifyStamp()))
            && (this.getUpdateCount() == null ? other.getUpdateCount() == null : this.getUpdateCount().equals(other.getUpdateCount()))
            && (this.getUpdateStamp() == null ? other.getUpdateStamp() == null : this.getUpdateStamp().equals(other.getUpdateStamp()))
            && (this.getVerified() == null ? other.getVerified() == null : this.getVerified().equals(other.getVerified()))
            && (this.getRoleaobjectClass() == null ? other.getRoleaobjectClass() == null : this.getRoleaobjectClass().equals(other.getRoleaobjectClass()))
            && (this.getRoleaobjectId() == null ? other.getRoleaobjectId() == null : this.getRoleaobjectId().equals(other.getRoleaobjectId()))
            && (this.getRolebobjectClass() == null ? other.getRolebobjectClass() == null : this.getRolebobjectClass().equals(other.getRolebobjectClass()))
            && (this.getRolebobjectId() == null ? other.getRolebobjectId() == null : this.getRolebobjectId().equals(other.getRolebobjectId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getClassname() == null) ? 0 : getClassname().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateStamp() == null) ? 0 : getCreateStamp().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        result = prime * result + ((getIsPersisted() == null) ? 0 : getIsPersisted().hashCode());
        result = prime * result + ((getMarkForDelete() == null) ? 0 : getMarkForDelete().hashCode());
        result = prime * result + ((getModifyStamp() == null) ? 0 : getModifyStamp().hashCode());
        result = prime * result + ((getUpdateCount() == null) ? 0 : getUpdateCount().hashCode());
        result = prime * result + ((getUpdateStamp() == null) ? 0 : getUpdateStamp().hashCode());
        result = prime * result + ((getVerified() == null) ? 0 : getVerified().hashCode());
        result = prime * result + ((getRoleaobjectClass() == null) ? 0 : getRoleaobjectClass().hashCode());
        result = prime * result + ((getRoleaobjectId() == null) ? 0 : getRoleaobjectId().hashCode());
        result = prime * result + ((getRolebobjectClass() == null) ? 0 : getRolebobjectClass().hashCode());
        result = prime * result + ((getRolebobjectId() == null) ? 0 : getRolebobjectId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", classname=").append(classname);
        sb.append(", id=").append(id);
        sb.append(", createStamp=").append(createStamp);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", isPersisted=").append(isPersisted);
        sb.append(", markForDelete=").append(markForDelete);
        sb.append(", modifyStamp=").append(modifyStamp);
        sb.append(", updateCount=").append(updateCount);
        sb.append(", updateStamp=").append(updateStamp);
        sb.append(", verified=").append(verified);
        sb.append(", roleaobjectClass=").append(roleaobjectClass);
        sb.append(", roleaobjectId=").append(roleaobjectId);
        sb.append(", rolebobjectClass=").append(rolebobjectClass);
        sb.append(", rolebobjectId=").append(rolebobjectId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}