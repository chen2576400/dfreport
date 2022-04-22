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
 * @TableName piresource_assignment
 */
@TableName(value ="piresource_assignment")
@Data
public class PiresourceAssignment implements Serializable {
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
    private String accountRefClass;

    /**
     * 
     */
    private Long accountRefId;

    /**
     * 
     */
    private Date actualEndDate;

    /**
     * 
     */
    private Double actualOvertimeCost;

    /**
     * 
     */
    private Double actualOvertimeQty;

    /**
     * 
     */
    private Double actualRegularCost;

    /**
     * 
     */
    private Double actualRegularQty;

    /**
     * 
     */
    private Date actualStartDate;

    /**
     * 
     */
    private Double actualThisPerCost;

    /**
     * 
     */
    private Double actualThisPerQty;

    /**
     * 
     */
    private Double allocationPercentage;

    /**
     * 
     */
    private String assignmentState;

    /**
     * 
     */
    private String assignmentType;

    /**
     * 
     */
    private Double costPerQty;

    /**
     * 
     */
    private String costPerQtySourceType;

    /**
     * 
     */
    private Boolean costQtyLinkFlag;

    /**
     * 
     */
    private String healthStatusDescription;

    /**
     * 
     */
    private String healthStatusType;

    /**
     * 
     */
    private Date openTaskDate;

    /**
     * 
     */
    private Double overTimeFactor;

    /**
     * 
     */
    private Double pendActualOvertimeQty;

    /**
     * 
     */
    private Double pendActualRegularQty;

    /**
     * 
     */
    private Double pendRemainQty;

    /**
     * 
     */
    private Double pendingCompletePercent;

    /**
     * 
     */
    private String plannableRefClass;

    /**
     * 
     */
    private Long plannableRefId;

    /**
     * 
     */
    private String plannableStatus;

    /**
     * 
     */
    private Double priorTimesheetActualOvertimeQty;

    /**
     * 
     */
    private Double priorTimesheetActualRegQty;

    /**
     * 
     */
    private String projectRefClass;

    /**
     * 
     */
    private Long projectRefId;

    /**
     * 
     */
    private String rateType;

    /**
     * 
     */
    private Date reendDate;

    /**
     * 
     */
    private String relagDurationFormat;

    /**
     * 
     */
    private Long relagDurationMillis;

    /**
     * 
     */
    private Double remainCost;

    /**
     * 
     */
    private String remainDurationFormat;

    /**
     * 
     */
    private Long remainDurationMillis;

    /**
     * 
     */
    private Double remainQty;

    /**
     * 
     */
    private Double remainQtyPerHour;

    /**
     * 
     */
    private Date remainingLateEndDate;

    /**
     * 
     */
    private Date remainingLateStartDate;

    /**
     * 
     */
    private String resourceType;

    /**
     * 
     */
    private Date restartDate;

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
    private Boolean rollupDatesFlag;

    /**
     * 
     */
    private String rootRefClass;

    /**
     * 
     */
    private Long rootRefId;

    /**
     * 
     */
    private String rsrcRefClass;

    /**
     * 
     */
    private Long rsrcRefId;

    /**
     * 
     */
    private String rsrcRequestData;

    /**
     * 
     */
    private Integer skillLevel;

    /**
     * 
     */
    private Double targetCost;

    /**
     * 
     */
    private String targetDurationFormat;

    /**
     * 
     */
    private Long targetDurationMillis;

    /**
     * 
     */
    private Date targetEndDate;

    /**
     * 
     */
    private String targetLagDurationFormat;

    /**
     * 
     */
    private Long targetLagDurationMillis;

    /**
     * 
     */
    private Double targetQty;

    /**
     * 
     */
    private Double targetQtyPerHour;

    /**
     * 
     */
    private Date targetStartDate;

    /**
     * 
     */
    private Boolean timesheetPendActualEndFlag;

    /**
     * 
     */
    private Double workCompletePercent;

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
        PiresourceAssignment other = (PiresourceAssignment) that;
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
            && (this.getAccountRefClass() == null ? other.getAccountRefClass() == null : this.getAccountRefClass().equals(other.getAccountRefClass()))
            && (this.getAccountRefId() == null ? other.getAccountRefId() == null : this.getAccountRefId().equals(other.getAccountRefId()))
            && (this.getActualEndDate() == null ? other.getActualEndDate() == null : this.getActualEndDate().equals(other.getActualEndDate()))
            && (this.getActualOvertimeCost() == null ? other.getActualOvertimeCost() == null : this.getActualOvertimeCost().equals(other.getActualOvertimeCost()))
            && (this.getActualOvertimeQty() == null ? other.getActualOvertimeQty() == null : this.getActualOvertimeQty().equals(other.getActualOvertimeQty()))
            && (this.getActualRegularCost() == null ? other.getActualRegularCost() == null : this.getActualRegularCost().equals(other.getActualRegularCost()))
            && (this.getActualRegularQty() == null ? other.getActualRegularQty() == null : this.getActualRegularQty().equals(other.getActualRegularQty()))
            && (this.getActualStartDate() == null ? other.getActualStartDate() == null : this.getActualStartDate().equals(other.getActualStartDate()))
            && (this.getActualThisPerCost() == null ? other.getActualThisPerCost() == null : this.getActualThisPerCost().equals(other.getActualThisPerCost()))
            && (this.getActualThisPerQty() == null ? other.getActualThisPerQty() == null : this.getActualThisPerQty().equals(other.getActualThisPerQty()))
            && (this.getAllocationPercentage() == null ? other.getAllocationPercentage() == null : this.getAllocationPercentage().equals(other.getAllocationPercentage()))
            && (this.getAssignmentState() == null ? other.getAssignmentState() == null : this.getAssignmentState().equals(other.getAssignmentState()))
            && (this.getAssignmentType() == null ? other.getAssignmentType() == null : this.getAssignmentType().equals(other.getAssignmentType()))
            && (this.getCostPerQty() == null ? other.getCostPerQty() == null : this.getCostPerQty().equals(other.getCostPerQty()))
            && (this.getCostPerQtySourceType() == null ? other.getCostPerQtySourceType() == null : this.getCostPerQtySourceType().equals(other.getCostPerQtySourceType()))
            && (this.getCostQtyLinkFlag() == null ? other.getCostQtyLinkFlag() == null : this.getCostQtyLinkFlag().equals(other.getCostQtyLinkFlag()))
            && (this.getHealthStatusDescription() == null ? other.getHealthStatusDescription() == null : this.getHealthStatusDescription().equals(other.getHealthStatusDescription()))
            && (this.getHealthStatusType() == null ? other.getHealthStatusType() == null : this.getHealthStatusType().equals(other.getHealthStatusType()))
            && (this.getOpenTaskDate() == null ? other.getOpenTaskDate() == null : this.getOpenTaskDate().equals(other.getOpenTaskDate()))
            && (this.getOverTimeFactor() == null ? other.getOverTimeFactor() == null : this.getOverTimeFactor().equals(other.getOverTimeFactor()))
            && (this.getPendActualOvertimeQty() == null ? other.getPendActualOvertimeQty() == null : this.getPendActualOvertimeQty().equals(other.getPendActualOvertimeQty()))
            && (this.getPendActualRegularQty() == null ? other.getPendActualRegularQty() == null : this.getPendActualRegularQty().equals(other.getPendActualRegularQty()))
            && (this.getPendRemainQty() == null ? other.getPendRemainQty() == null : this.getPendRemainQty().equals(other.getPendRemainQty()))
            && (this.getPendingCompletePercent() == null ? other.getPendingCompletePercent() == null : this.getPendingCompletePercent().equals(other.getPendingCompletePercent()))
            && (this.getPlannableRefClass() == null ? other.getPlannableRefClass() == null : this.getPlannableRefClass().equals(other.getPlannableRefClass()))
            && (this.getPlannableRefId() == null ? other.getPlannableRefId() == null : this.getPlannableRefId().equals(other.getPlannableRefId()))
            && (this.getPlannableStatus() == null ? other.getPlannableStatus() == null : this.getPlannableStatus().equals(other.getPlannableStatus()))
            && (this.getPriorTimesheetActualOvertimeQty() == null ? other.getPriorTimesheetActualOvertimeQty() == null : this.getPriorTimesheetActualOvertimeQty().equals(other.getPriorTimesheetActualOvertimeQty()))
            && (this.getPriorTimesheetActualRegQty() == null ? other.getPriorTimesheetActualRegQty() == null : this.getPriorTimesheetActualRegQty().equals(other.getPriorTimesheetActualRegQty()))
            && (this.getProjectRefClass() == null ? other.getProjectRefClass() == null : this.getProjectRefClass().equals(other.getProjectRefClass()))
            && (this.getProjectRefId() == null ? other.getProjectRefId() == null : this.getProjectRefId().equals(other.getProjectRefId()))
            && (this.getRateType() == null ? other.getRateType() == null : this.getRateType().equals(other.getRateType()))
            && (this.getReendDate() == null ? other.getReendDate() == null : this.getReendDate().equals(other.getReendDate()))
            && (this.getRelagDurationFormat() == null ? other.getRelagDurationFormat() == null : this.getRelagDurationFormat().equals(other.getRelagDurationFormat()))
            && (this.getRelagDurationMillis() == null ? other.getRelagDurationMillis() == null : this.getRelagDurationMillis().equals(other.getRelagDurationMillis()))
            && (this.getRemainCost() == null ? other.getRemainCost() == null : this.getRemainCost().equals(other.getRemainCost()))
            && (this.getRemainDurationFormat() == null ? other.getRemainDurationFormat() == null : this.getRemainDurationFormat().equals(other.getRemainDurationFormat()))
            && (this.getRemainDurationMillis() == null ? other.getRemainDurationMillis() == null : this.getRemainDurationMillis().equals(other.getRemainDurationMillis()))
            && (this.getRemainQty() == null ? other.getRemainQty() == null : this.getRemainQty().equals(other.getRemainQty()))
            && (this.getRemainQtyPerHour() == null ? other.getRemainQtyPerHour() == null : this.getRemainQtyPerHour().equals(other.getRemainQtyPerHour()))
            && (this.getRemainingLateEndDate() == null ? other.getRemainingLateEndDate() == null : this.getRemainingLateEndDate().equals(other.getRemainingLateEndDate()))
            && (this.getRemainingLateStartDate() == null ? other.getRemainingLateStartDate() == null : this.getRemainingLateStartDate().equals(other.getRemainingLateStartDate()))
            && (this.getResourceType() == null ? other.getResourceType() == null : this.getResourceType().equals(other.getResourceType()))
            && (this.getRestartDate() == null ? other.getRestartDate() == null : this.getRestartDate().equals(other.getRestartDate()))
            && (this.getRoleRefClass() == null ? other.getRoleRefClass() == null : this.getRoleRefClass().equals(other.getRoleRefClass()))
            && (this.getRoleRefId() == null ? other.getRoleRefId() == null : this.getRoleRefId().equals(other.getRoleRefId()))
            && (this.getRollupDatesFlag() == null ? other.getRollupDatesFlag() == null : this.getRollupDatesFlag().equals(other.getRollupDatesFlag()))
            && (this.getRootRefClass() == null ? other.getRootRefClass() == null : this.getRootRefClass().equals(other.getRootRefClass()))
            && (this.getRootRefId() == null ? other.getRootRefId() == null : this.getRootRefId().equals(other.getRootRefId()))
            && (this.getRsrcRefClass() == null ? other.getRsrcRefClass() == null : this.getRsrcRefClass().equals(other.getRsrcRefClass()))
            && (this.getRsrcRefId() == null ? other.getRsrcRefId() == null : this.getRsrcRefId().equals(other.getRsrcRefId()))
            && (this.getRsrcRequestData() == null ? other.getRsrcRequestData() == null : this.getRsrcRequestData().equals(other.getRsrcRequestData()))
            && (this.getSkillLevel() == null ? other.getSkillLevel() == null : this.getSkillLevel().equals(other.getSkillLevel()))
            && (this.getTargetCost() == null ? other.getTargetCost() == null : this.getTargetCost().equals(other.getTargetCost()))
            && (this.getTargetDurationFormat() == null ? other.getTargetDurationFormat() == null : this.getTargetDurationFormat().equals(other.getTargetDurationFormat()))
            && (this.getTargetDurationMillis() == null ? other.getTargetDurationMillis() == null : this.getTargetDurationMillis().equals(other.getTargetDurationMillis()))
            && (this.getTargetEndDate() == null ? other.getTargetEndDate() == null : this.getTargetEndDate().equals(other.getTargetEndDate()))
            && (this.getTargetLagDurationFormat() == null ? other.getTargetLagDurationFormat() == null : this.getTargetLagDurationFormat().equals(other.getTargetLagDurationFormat()))
            && (this.getTargetLagDurationMillis() == null ? other.getTargetLagDurationMillis() == null : this.getTargetLagDurationMillis().equals(other.getTargetLagDurationMillis()))
            && (this.getTargetQty() == null ? other.getTargetQty() == null : this.getTargetQty().equals(other.getTargetQty()))
            && (this.getTargetQtyPerHour() == null ? other.getTargetQtyPerHour() == null : this.getTargetQtyPerHour().equals(other.getTargetQtyPerHour()))
            && (this.getTargetStartDate() == null ? other.getTargetStartDate() == null : this.getTargetStartDate().equals(other.getTargetStartDate()))
            && (this.getTimesheetPendActualEndFlag() == null ? other.getTimesheetPendActualEndFlag() == null : this.getTimesheetPendActualEndFlag().equals(other.getTimesheetPendActualEndFlag()))
            && (this.getWorkCompletePercent() == null ? other.getWorkCompletePercent() == null : this.getWorkCompletePercent().equals(other.getWorkCompletePercent()));
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
        result = prime * result + ((getAccountRefClass() == null) ? 0 : getAccountRefClass().hashCode());
        result = prime * result + ((getAccountRefId() == null) ? 0 : getAccountRefId().hashCode());
        result = prime * result + ((getActualEndDate() == null) ? 0 : getActualEndDate().hashCode());
        result = prime * result + ((getActualOvertimeCost() == null) ? 0 : getActualOvertimeCost().hashCode());
        result = prime * result + ((getActualOvertimeQty() == null) ? 0 : getActualOvertimeQty().hashCode());
        result = prime * result + ((getActualRegularCost() == null) ? 0 : getActualRegularCost().hashCode());
        result = prime * result + ((getActualRegularQty() == null) ? 0 : getActualRegularQty().hashCode());
        result = prime * result + ((getActualStartDate() == null) ? 0 : getActualStartDate().hashCode());
        result = prime * result + ((getActualThisPerCost() == null) ? 0 : getActualThisPerCost().hashCode());
        result = prime * result + ((getActualThisPerQty() == null) ? 0 : getActualThisPerQty().hashCode());
        result = prime * result + ((getAllocationPercentage() == null) ? 0 : getAllocationPercentage().hashCode());
        result = prime * result + ((getAssignmentState() == null) ? 0 : getAssignmentState().hashCode());
        result = prime * result + ((getAssignmentType() == null) ? 0 : getAssignmentType().hashCode());
        result = prime * result + ((getCostPerQty() == null) ? 0 : getCostPerQty().hashCode());
        result = prime * result + ((getCostPerQtySourceType() == null) ? 0 : getCostPerQtySourceType().hashCode());
        result = prime * result + ((getCostQtyLinkFlag() == null) ? 0 : getCostQtyLinkFlag().hashCode());
        result = prime * result + ((getHealthStatusDescription() == null) ? 0 : getHealthStatusDescription().hashCode());
        result = prime * result + ((getHealthStatusType() == null) ? 0 : getHealthStatusType().hashCode());
        result = prime * result + ((getOpenTaskDate() == null) ? 0 : getOpenTaskDate().hashCode());
        result = prime * result + ((getOverTimeFactor() == null) ? 0 : getOverTimeFactor().hashCode());
        result = prime * result + ((getPendActualOvertimeQty() == null) ? 0 : getPendActualOvertimeQty().hashCode());
        result = prime * result + ((getPendActualRegularQty() == null) ? 0 : getPendActualRegularQty().hashCode());
        result = prime * result + ((getPendRemainQty() == null) ? 0 : getPendRemainQty().hashCode());
        result = prime * result + ((getPendingCompletePercent() == null) ? 0 : getPendingCompletePercent().hashCode());
        result = prime * result + ((getPlannableRefClass() == null) ? 0 : getPlannableRefClass().hashCode());
        result = prime * result + ((getPlannableRefId() == null) ? 0 : getPlannableRefId().hashCode());
        result = prime * result + ((getPlannableStatus() == null) ? 0 : getPlannableStatus().hashCode());
        result = prime * result + ((getPriorTimesheetActualOvertimeQty() == null) ? 0 : getPriorTimesheetActualOvertimeQty().hashCode());
        result = prime * result + ((getPriorTimesheetActualRegQty() == null) ? 0 : getPriorTimesheetActualRegQty().hashCode());
        result = prime * result + ((getProjectRefClass() == null) ? 0 : getProjectRefClass().hashCode());
        result = prime * result + ((getProjectRefId() == null) ? 0 : getProjectRefId().hashCode());
        result = prime * result + ((getRateType() == null) ? 0 : getRateType().hashCode());
        result = prime * result + ((getReendDate() == null) ? 0 : getReendDate().hashCode());
        result = prime * result + ((getRelagDurationFormat() == null) ? 0 : getRelagDurationFormat().hashCode());
        result = prime * result + ((getRelagDurationMillis() == null) ? 0 : getRelagDurationMillis().hashCode());
        result = prime * result + ((getRemainCost() == null) ? 0 : getRemainCost().hashCode());
        result = prime * result + ((getRemainDurationFormat() == null) ? 0 : getRemainDurationFormat().hashCode());
        result = prime * result + ((getRemainDurationMillis() == null) ? 0 : getRemainDurationMillis().hashCode());
        result = prime * result + ((getRemainQty() == null) ? 0 : getRemainQty().hashCode());
        result = prime * result + ((getRemainQtyPerHour() == null) ? 0 : getRemainQtyPerHour().hashCode());
        result = prime * result + ((getRemainingLateEndDate() == null) ? 0 : getRemainingLateEndDate().hashCode());
        result = prime * result + ((getRemainingLateStartDate() == null) ? 0 : getRemainingLateStartDate().hashCode());
        result = prime * result + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        result = prime * result + ((getRestartDate() == null) ? 0 : getRestartDate().hashCode());
        result = prime * result + ((getRoleRefClass() == null) ? 0 : getRoleRefClass().hashCode());
        result = prime * result + ((getRoleRefId() == null) ? 0 : getRoleRefId().hashCode());
        result = prime * result + ((getRollupDatesFlag() == null) ? 0 : getRollupDatesFlag().hashCode());
        result = prime * result + ((getRootRefClass() == null) ? 0 : getRootRefClass().hashCode());
        result = prime * result + ((getRootRefId() == null) ? 0 : getRootRefId().hashCode());
        result = prime * result + ((getRsrcRefClass() == null) ? 0 : getRsrcRefClass().hashCode());
        result = prime * result + ((getRsrcRefId() == null) ? 0 : getRsrcRefId().hashCode());
        result = prime * result + ((getRsrcRequestData() == null) ? 0 : getRsrcRequestData().hashCode());
        result = prime * result + ((getSkillLevel() == null) ? 0 : getSkillLevel().hashCode());
        result = prime * result + ((getTargetCost() == null) ? 0 : getTargetCost().hashCode());
        result = prime * result + ((getTargetDurationFormat() == null) ? 0 : getTargetDurationFormat().hashCode());
        result = prime * result + ((getTargetDurationMillis() == null) ? 0 : getTargetDurationMillis().hashCode());
        result = prime * result + ((getTargetEndDate() == null) ? 0 : getTargetEndDate().hashCode());
        result = prime * result + ((getTargetLagDurationFormat() == null) ? 0 : getTargetLagDurationFormat().hashCode());
        result = prime * result + ((getTargetLagDurationMillis() == null) ? 0 : getTargetLagDurationMillis().hashCode());
        result = prime * result + ((getTargetQty() == null) ? 0 : getTargetQty().hashCode());
        result = prime * result + ((getTargetQtyPerHour() == null) ? 0 : getTargetQtyPerHour().hashCode());
        result = prime * result + ((getTargetStartDate() == null) ? 0 : getTargetStartDate().hashCode());
        result = prime * result + ((getTimesheetPendActualEndFlag() == null) ? 0 : getTimesheetPendActualEndFlag().hashCode());
        result = prime * result + ((getWorkCompletePercent() == null) ? 0 : getWorkCompletePercent().hashCode());
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
        sb.append(", accountRefClass=").append(accountRefClass);
        sb.append(", accountRefId=").append(accountRefId);
        sb.append(", actualEndDate=").append(actualEndDate);
        sb.append(", actualOvertimeCost=").append(actualOvertimeCost);
        sb.append(", actualOvertimeQty=").append(actualOvertimeQty);
        sb.append(", actualRegularCost=").append(actualRegularCost);
        sb.append(", actualRegularQty=").append(actualRegularQty);
        sb.append(", actualStartDate=").append(actualStartDate);
        sb.append(", actualThisPerCost=").append(actualThisPerCost);
        sb.append(", actualThisPerQty=").append(actualThisPerQty);
        sb.append(", allocationPercentage=").append(allocationPercentage);
        sb.append(", assignmentState=").append(assignmentState);
        sb.append(", assignmentType=").append(assignmentType);
        sb.append(", costPerQty=").append(costPerQty);
        sb.append(", costPerQtySourceType=").append(costPerQtySourceType);
        sb.append(", costQtyLinkFlag=").append(costQtyLinkFlag);
        sb.append(", healthStatusDescription=").append(healthStatusDescription);
        sb.append(", healthStatusType=").append(healthStatusType);
        sb.append(", openTaskDate=").append(openTaskDate);
        sb.append(", overTimeFactor=").append(overTimeFactor);
        sb.append(", pendActualOvertimeQty=").append(pendActualOvertimeQty);
        sb.append(", pendActualRegularQty=").append(pendActualRegularQty);
        sb.append(", pendRemainQty=").append(pendRemainQty);
        sb.append(", pendingCompletePercent=").append(pendingCompletePercent);
        sb.append(", plannableRefClass=").append(plannableRefClass);
        sb.append(", plannableRefId=").append(plannableRefId);
        sb.append(", plannableStatus=").append(plannableStatus);
        sb.append(", priorTimesheetActualOvertimeQty=").append(priorTimesheetActualOvertimeQty);
        sb.append(", priorTimesheetActualRegQty=").append(priorTimesheetActualRegQty);
        sb.append(", projectRefClass=").append(projectRefClass);
        sb.append(", projectRefId=").append(projectRefId);
        sb.append(", rateType=").append(rateType);
        sb.append(", reendDate=").append(reendDate);
        sb.append(", relagDurationFormat=").append(relagDurationFormat);
        sb.append(", relagDurationMillis=").append(relagDurationMillis);
        sb.append(", remainCost=").append(remainCost);
        sb.append(", remainDurationFormat=").append(remainDurationFormat);
        sb.append(", remainDurationMillis=").append(remainDurationMillis);
        sb.append(", remainQty=").append(remainQty);
        sb.append(", remainQtyPerHour=").append(remainQtyPerHour);
        sb.append(", remainingLateEndDate=").append(remainingLateEndDate);
        sb.append(", remainingLateStartDate=").append(remainingLateStartDate);
        sb.append(", resourceType=").append(resourceType);
        sb.append(", restartDate=").append(restartDate);
        sb.append(", roleRefClass=").append(roleRefClass);
        sb.append(", roleRefId=").append(roleRefId);
        sb.append(", rollupDatesFlag=").append(rollupDatesFlag);
        sb.append(", rootRefClass=").append(rootRefClass);
        sb.append(", rootRefId=").append(rootRefId);
        sb.append(", rsrcRefClass=").append(rsrcRefClass);
        sb.append(", rsrcRefId=").append(rsrcRefId);
        sb.append(", rsrcRequestData=").append(rsrcRequestData);
        sb.append(", skillLevel=").append(skillLevel);
        sb.append(", targetCost=").append(targetCost);
        sb.append(", targetDurationFormat=").append(targetDurationFormat);
        sb.append(", targetDurationMillis=").append(targetDurationMillis);
        sb.append(", targetEndDate=").append(targetEndDate);
        sb.append(", targetLagDurationFormat=").append(targetLagDurationFormat);
        sb.append(", targetLagDurationMillis=").append(targetLagDurationMillis);
        sb.append(", targetQty=").append(targetQty);
        sb.append(", targetQtyPerHour=").append(targetQtyPerHour);
        sb.append(", targetStartDate=").append(targetStartDate);
        sb.append(", timesheetPendActualEndFlag=").append(timesheetPendActualEndFlag);
        sb.append(", workCompletePercent=").append(workCompletePercent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}