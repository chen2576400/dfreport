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
 * @TableName pigroup
 */
@TableName(value ="pigroup")
@Data
public class Pigroup implements Serializable {
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
    private String domainRefClass;

    /**
     * 
     */
    private Long domainRefId;

    /**
     * 
     */
    private Boolean inheritedDomain;

    /**
     * 
     */
    private Boolean disabled;

    /**
     * 
     */
    private Date disabledDate;

    /**
     * 
     */
    private Boolean internal;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Boolean repairNeeded;

    /**
     * 
     */
    private String principalStatus;

    /**
     * 
     */
    private String containerRefClass;

    /**
     * 
     */
    private Long containerRefId;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private Boolean replicate;

    /**
     * 
     */
    private String roleRefClass;

    /**
     * 
     */
    private Long roleRefId;

    /**
     * 
     */
    private String groupCategory;

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
        Pigroup other = (Pigroup) that;
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
            && (this.getDomainRefClass() == null ? other.getDomainRefClass() == null : this.getDomainRefClass().equals(other.getDomainRefClass()))
            && (this.getDomainRefId() == null ? other.getDomainRefId() == null : this.getDomainRefId().equals(other.getDomainRefId()))
            && (this.getInheritedDomain() == null ? other.getInheritedDomain() == null : this.getInheritedDomain().equals(other.getInheritedDomain()))
            && (this.getDisabled() == null ? other.getDisabled() == null : this.getDisabled().equals(other.getDisabled()))
            && (this.getDisabledDate() == null ? other.getDisabledDate() == null : this.getDisabledDate().equals(other.getDisabledDate()))
            && (this.getInternal() == null ? other.getInternal() == null : this.getInternal().equals(other.getInternal()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getRepairNeeded() == null ? other.getRepairNeeded() == null : this.getRepairNeeded().equals(other.getRepairNeeded()))
            && (this.getPrincipalStatus() == null ? other.getPrincipalStatus() == null : this.getPrincipalStatus().equals(other.getPrincipalStatus()))
            && (this.getContainerRefClass() == null ? other.getContainerRefClass() == null : this.getContainerRefClass().equals(other.getContainerRefClass()))
            && (this.getContainerRefId() == null ? other.getContainerRefId() == null : this.getContainerRefId().equals(other.getContainerRefId()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getReplicate() == null ? other.getReplicate() == null : this.getReplicate().equals(other.getReplicate()))
            && (this.getRoleRefClass() == null ? other.getRoleRefClass() == null : this.getRoleRefClass().equals(other.getRoleRefClass()))
            && (this.getRoleRefId() == null ? other.getRoleRefId() == null : this.getRoleRefId().equals(other.getRoleRefId()))
            && (this.getGroupCategory() == null ? other.getGroupCategory() == null : this.getGroupCategory().equals(other.getGroupCategory()));
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
        result = prime * result + ((getDomainRefClass() == null) ? 0 : getDomainRefClass().hashCode());
        result = prime * result + ((getDomainRefId() == null) ? 0 : getDomainRefId().hashCode());
        result = prime * result + ((getInheritedDomain() == null) ? 0 : getInheritedDomain().hashCode());
        result = prime * result + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        result = prime * result + ((getDisabledDate() == null) ? 0 : getDisabledDate().hashCode());
        result = prime * result + ((getInternal() == null) ? 0 : getInternal().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getRepairNeeded() == null) ? 0 : getRepairNeeded().hashCode());
        result = prime * result + ((getPrincipalStatus() == null) ? 0 : getPrincipalStatus().hashCode());
        result = prime * result + ((getContainerRefClass() == null) ? 0 : getContainerRefClass().hashCode());
        result = prime * result + ((getContainerRefId() == null) ? 0 : getContainerRefId().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getReplicate() == null) ? 0 : getReplicate().hashCode());
        result = prime * result + ((getRoleRefClass() == null) ? 0 : getRoleRefClass().hashCode());
        result = prime * result + ((getRoleRefId() == null) ? 0 : getRoleRefId().hashCode());
        result = prime * result + ((getGroupCategory() == null) ? 0 : getGroupCategory().hashCode());
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
        sb.append(", domainRefClass=").append(domainRefClass);
        sb.append(", domainRefId=").append(domainRefId);
        sb.append(", inheritedDomain=").append(inheritedDomain);
        sb.append(", disabled=").append(disabled);
        sb.append(", disabledDate=").append(disabledDate);
        sb.append(", internal=").append(internal);
        sb.append(", name=").append(name);
        sb.append(", repairNeeded=").append(repairNeeded);
        sb.append(", principalStatus=").append(principalStatus);
        sb.append(", containerRefClass=").append(containerRefClass);
        sb.append(", containerRefId=").append(containerRefId);
        sb.append(", description=").append(description);
        sb.append(", replicate=").append(replicate);
        sb.append(", roleRefClass=").append(roleRefClass);
        sb.append(", roleRefId=").append(roleRefId);
        sb.append(", groupCategory=").append(groupCategory);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}