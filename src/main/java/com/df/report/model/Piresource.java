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
 * @TableName piresource
 */
@TableName(value ="piresource")
@Data
public class Piresource implements Serializable {
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
    private String creatorRefClass;

    /**
     * 
     */
    private Long creatorRefId;

    /**
     * 
     */
    private String modifierRefClass;

    /**
     * 
     */
    private Long modifierRefId;

    /**
     * 
     */
    private Boolean activeFlag;

    /**
     * 
     */
    private Boolean autoComputeActualFlag;

    /**
     * 
     */
    private String calendarRefClass;

    /**
     * 
     */
    private Long calendarRefId;

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
    private String currencyTypeRefClass;

    /**
     * 
     */
    private Long currencyTypeRefId;

    /**
     * 
     */
    private Boolean defaultCostQtyLinkFlag;

    /**
     * 
     */
    private Double defaultQtyPerHour;

    /**
     * 
     */
    private Integer lastChecksum;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Double overtimeFactor;

    /**
     * 
     */
    private Boolean overtimeFlag;

    /**
     * 
     */
    private String parentResourceRefClass;

    /**
     * 
     */
    private Long parentResourceRefId;

    /**
     * 
     */
    private String costQtyType;

    /**
     * 
     */
    private String resourceNotes;

    /**
     * 
     */
    private Integer resourceSeqNum;

    /**
     * 
     */
    private String resourceShortName;

    /**
     * 
     */
    private String resourceTitleName;

    /**
     * 
     */
    private String resourceType;

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
    private String shiftRefClass;

    /**
     * 
     */
    private Long shiftRefId;

    /**
     * 
     */
    private String timesheetApproveUserRefClass;

    /**
     * 
     */
    private Long timesheetApproveUserRefId;

    /**
     * 
     */
    private Boolean timesheetFlag;

    /**
     * 
     */
    private String unitRefClass;

    /**
     * 
     */
    private Long unitRefId;

    /**
     * 
     */
    private String userRefClass;

    /**
     * 
     */
    private Long userRefId;

    /**
     * 
     */
    private Integer xferCompleteDayCount;

    /**
     * 
     */
    private Integer xferNotStartDayCount;

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
        Piresource other = (Piresource) that;
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
            && (this.getCreatorRefClass() == null ? other.getCreatorRefClass() == null : this.getCreatorRefClass().equals(other.getCreatorRefClass()))
            && (this.getCreatorRefId() == null ? other.getCreatorRefId() == null : this.getCreatorRefId().equals(other.getCreatorRefId()))
            && (this.getModifierRefClass() == null ? other.getModifierRefClass() == null : this.getModifierRefClass().equals(other.getModifierRefClass()))
            && (this.getModifierRefId() == null ? other.getModifierRefId() == null : this.getModifierRefId().equals(other.getModifierRefId()))
            && (this.getActiveFlag() == null ? other.getActiveFlag() == null : this.getActiveFlag().equals(other.getActiveFlag()))
            && (this.getAutoComputeActualFlag() == null ? other.getAutoComputeActualFlag() == null : this.getAutoComputeActualFlag().equals(other.getAutoComputeActualFlag()))
            && (this.getCalendarRefClass() == null ? other.getCalendarRefClass() == null : this.getCalendarRefClass().equals(other.getCalendarRefClass()))
            && (this.getCalendarRefId() == null ? other.getCalendarRefId() == null : this.getCalendarRefId().equals(other.getCalendarRefId()))
            && (this.getContainerRefClass() == null ? other.getContainerRefClass() == null : this.getContainerRefClass().equals(other.getContainerRefClass()))
            && (this.getContainerRefId() == null ? other.getContainerRefId() == null : this.getContainerRefId().equals(other.getContainerRefId()))
            && (this.getCurrencyTypeRefClass() == null ? other.getCurrencyTypeRefClass() == null : this.getCurrencyTypeRefClass().equals(other.getCurrencyTypeRefClass()))
            && (this.getCurrencyTypeRefId() == null ? other.getCurrencyTypeRefId() == null : this.getCurrencyTypeRefId().equals(other.getCurrencyTypeRefId()))
            && (this.getDefaultCostQtyLinkFlag() == null ? other.getDefaultCostQtyLinkFlag() == null : this.getDefaultCostQtyLinkFlag().equals(other.getDefaultCostQtyLinkFlag()))
            && (this.getDefaultQtyPerHour() == null ? other.getDefaultQtyPerHour() == null : this.getDefaultQtyPerHour().equals(other.getDefaultQtyPerHour()))
            && (this.getLastChecksum() == null ? other.getLastChecksum() == null : this.getLastChecksum().equals(other.getLastChecksum()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getOvertimeFactor() == null ? other.getOvertimeFactor() == null : this.getOvertimeFactor().equals(other.getOvertimeFactor()))
            && (this.getOvertimeFlag() == null ? other.getOvertimeFlag() == null : this.getOvertimeFlag().equals(other.getOvertimeFlag()))
            && (this.getParentResourceRefClass() == null ? other.getParentResourceRefClass() == null : this.getParentResourceRefClass().equals(other.getParentResourceRefClass()))
            && (this.getParentResourceRefId() == null ? other.getParentResourceRefId() == null : this.getParentResourceRefId().equals(other.getParentResourceRefId()))
            && (this.getCostQtyType() == null ? other.getCostQtyType() == null : this.getCostQtyType().equals(other.getCostQtyType()))
            && (this.getResourceNotes() == null ? other.getResourceNotes() == null : this.getResourceNotes().equals(other.getResourceNotes()))
            && (this.getResourceSeqNum() == null ? other.getResourceSeqNum() == null : this.getResourceSeqNum().equals(other.getResourceSeqNum()))
            && (this.getResourceShortName() == null ? other.getResourceShortName() == null : this.getResourceShortName().equals(other.getResourceShortName()))
            && (this.getResourceTitleName() == null ? other.getResourceTitleName() == null : this.getResourceTitleName().equals(other.getResourceTitleName()))
            && (this.getResourceType() == null ? other.getResourceType() == null : this.getResourceType().equals(other.getResourceType()))
            && (this.getRoleRefClass() == null ? other.getRoleRefClass() == null : this.getRoleRefClass().equals(other.getRoleRefClass()))
            && (this.getRoleRefId() == null ? other.getRoleRefId() == null : this.getRoleRefId().equals(other.getRoleRefId()))
            && (this.getShiftRefClass() == null ? other.getShiftRefClass() == null : this.getShiftRefClass().equals(other.getShiftRefClass()))
            && (this.getShiftRefId() == null ? other.getShiftRefId() == null : this.getShiftRefId().equals(other.getShiftRefId()))
            && (this.getTimesheetApproveUserRefClass() == null ? other.getTimesheetApproveUserRefClass() == null : this.getTimesheetApproveUserRefClass().equals(other.getTimesheetApproveUserRefClass()))
            && (this.getTimesheetApproveUserRefId() == null ? other.getTimesheetApproveUserRefId() == null : this.getTimesheetApproveUserRefId().equals(other.getTimesheetApproveUserRefId()))
            && (this.getTimesheetFlag() == null ? other.getTimesheetFlag() == null : this.getTimesheetFlag().equals(other.getTimesheetFlag()))
            && (this.getUnitRefClass() == null ? other.getUnitRefClass() == null : this.getUnitRefClass().equals(other.getUnitRefClass()))
            && (this.getUnitRefId() == null ? other.getUnitRefId() == null : this.getUnitRefId().equals(other.getUnitRefId()))
            && (this.getUserRefClass() == null ? other.getUserRefClass() == null : this.getUserRefClass().equals(other.getUserRefClass()))
            && (this.getUserRefId() == null ? other.getUserRefId() == null : this.getUserRefId().equals(other.getUserRefId()))
            && (this.getXferCompleteDayCount() == null ? other.getXferCompleteDayCount() == null : this.getXferCompleteDayCount().equals(other.getXferCompleteDayCount()))
            && (this.getXferNotStartDayCount() == null ? other.getXferNotStartDayCount() == null : this.getXferNotStartDayCount().equals(other.getXferNotStartDayCount()));
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
        result = prime * result + ((getCreatorRefClass() == null) ? 0 : getCreatorRefClass().hashCode());
        result = prime * result + ((getCreatorRefId() == null) ? 0 : getCreatorRefId().hashCode());
        result = prime * result + ((getModifierRefClass() == null) ? 0 : getModifierRefClass().hashCode());
        result = prime * result + ((getModifierRefId() == null) ? 0 : getModifierRefId().hashCode());
        result = prime * result + ((getActiveFlag() == null) ? 0 : getActiveFlag().hashCode());
        result = prime * result + ((getAutoComputeActualFlag() == null) ? 0 : getAutoComputeActualFlag().hashCode());
        result = prime * result + ((getCalendarRefClass() == null) ? 0 : getCalendarRefClass().hashCode());
        result = prime * result + ((getCalendarRefId() == null) ? 0 : getCalendarRefId().hashCode());
        result = prime * result + ((getContainerRefClass() == null) ? 0 : getContainerRefClass().hashCode());
        result = prime * result + ((getContainerRefId() == null) ? 0 : getContainerRefId().hashCode());
        result = prime * result + ((getCurrencyTypeRefClass() == null) ? 0 : getCurrencyTypeRefClass().hashCode());
        result = prime * result + ((getCurrencyTypeRefId() == null) ? 0 : getCurrencyTypeRefId().hashCode());
        result = prime * result + ((getDefaultCostQtyLinkFlag() == null) ? 0 : getDefaultCostQtyLinkFlag().hashCode());
        result = prime * result + ((getDefaultQtyPerHour() == null) ? 0 : getDefaultQtyPerHour().hashCode());
        result = prime * result + ((getLastChecksum() == null) ? 0 : getLastChecksum().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getOvertimeFactor() == null) ? 0 : getOvertimeFactor().hashCode());
        result = prime * result + ((getOvertimeFlag() == null) ? 0 : getOvertimeFlag().hashCode());
        result = prime * result + ((getParentResourceRefClass() == null) ? 0 : getParentResourceRefClass().hashCode());
        result = prime * result + ((getParentResourceRefId() == null) ? 0 : getParentResourceRefId().hashCode());
        result = prime * result + ((getCostQtyType() == null) ? 0 : getCostQtyType().hashCode());
        result = prime * result + ((getResourceNotes() == null) ? 0 : getResourceNotes().hashCode());
        result = prime * result + ((getResourceSeqNum() == null) ? 0 : getResourceSeqNum().hashCode());
        result = prime * result + ((getResourceShortName() == null) ? 0 : getResourceShortName().hashCode());
        result = prime * result + ((getResourceTitleName() == null) ? 0 : getResourceTitleName().hashCode());
        result = prime * result + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        result = prime * result + ((getRoleRefClass() == null) ? 0 : getRoleRefClass().hashCode());
        result = prime * result + ((getRoleRefId() == null) ? 0 : getRoleRefId().hashCode());
        result = prime * result + ((getShiftRefClass() == null) ? 0 : getShiftRefClass().hashCode());
        result = prime * result + ((getShiftRefId() == null) ? 0 : getShiftRefId().hashCode());
        result = prime * result + ((getTimesheetApproveUserRefClass() == null) ? 0 : getTimesheetApproveUserRefClass().hashCode());
        result = prime * result + ((getTimesheetApproveUserRefId() == null) ? 0 : getTimesheetApproveUserRefId().hashCode());
        result = prime * result + ((getTimesheetFlag() == null) ? 0 : getTimesheetFlag().hashCode());
        result = prime * result + ((getUnitRefClass() == null) ? 0 : getUnitRefClass().hashCode());
        result = prime * result + ((getUnitRefId() == null) ? 0 : getUnitRefId().hashCode());
        result = prime * result + ((getUserRefClass() == null) ? 0 : getUserRefClass().hashCode());
        result = prime * result + ((getUserRefId() == null) ? 0 : getUserRefId().hashCode());
        result = prime * result + ((getXferCompleteDayCount() == null) ? 0 : getXferCompleteDayCount().hashCode());
        result = prime * result + ((getXferNotStartDayCount() == null) ? 0 : getXferNotStartDayCount().hashCode());
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
        sb.append(", creatorRefClass=").append(creatorRefClass);
        sb.append(", creatorRefId=").append(creatorRefId);
        sb.append(", modifierRefClass=").append(modifierRefClass);
        sb.append(", modifierRefId=").append(modifierRefId);
        sb.append(", activeFlag=").append(activeFlag);
        sb.append(", autoComputeActualFlag=").append(autoComputeActualFlag);
        sb.append(", calendarRefClass=").append(calendarRefClass);
        sb.append(", calendarRefId=").append(calendarRefId);
        sb.append(", containerRefClass=").append(containerRefClass);
        sb.append(", containerRefId=").append(containerRefId);
        sb.append(", currencyTypeRefClass=").append(currencyTypeRefClass);
        sb.append(", currencyTypeRefId=").append(currencyTypeRefId);
        sb.append(", defaultCostQtyLinkFlag=").append(defaultCostQtyLinkFlag);
        sb.append(", defaultQtyPerHour=").append(defaultQtyPerHour);
        sb.append(", lastChecksum=").append(lastChecksum);
        sb.append(", name=").append(name);
        sb.append(", overtimeFactor=").append(overtimeFactor);
        sb.append(", overtimeFlag=").append(overtimeFlag);
        sb.append(", parentResourceRefClass=").append(parentResourceRefClass);
        sb.append(", parentResourceRefId=").append(parentResourceRefId);
        sb.append(", costQtyType=").append(costQtyType);
        sb.append(", resourceNotes=").append(resourceNotes);
        sb.append(", resourceSeqNum=").append(resourceSeqNum);
        sb.append(", resourceShortName=").append(resourceShortName);
        sb.append(", resourceTitleName=").append(resourceTitleName);
        sb.append(", resourceType=").append(resourceType);
        sb.append(", roleRefClass=").append(roleRefClass);
        sb.append(", roleRefId=").append(roleRefId);
        sb.append(", shiftRefClass=").append(shiftRefClass);
        sb.append(", shiftRefId=").append(shiftRefId);
        sb.append(", timesheetApproveUserRefClass=").append(timesheetApproveUserRefClass);
        sb.append(", timesheetApproveUserRefId=").append(timesheetApproveUserRefId);
        sb.append(", timesheetFlag=").append(timesheetFlag);
        sb.append(", unitRefClass=").append(unitRefClass);
        sb.append(", unitRefId=").append(unitRefId);
        sb.append(", userRefClass=").append(userRefClass);
        sb.append(", userRefId=").append(userRefId);
        sb.append(", xferCompleteDayCount=").append(xferCompleteDayCount);
        sb.append(", xferNotStartDayCount=").append(xferNotStartDayCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}