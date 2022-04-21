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
 * @TableName stexpected_finish_time
 */
@TableName(value ="stexpected_finish_time")
@Data
public class StexpectedFinishTime implements Serializable {
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
    private Date expectedFinishTime;

    /**
     * 
     */
    private String planActivityRefClass;

    /**
     * 
     */
    private Long planActivityRefId;

    /**
     * 
     */
    private String planRefClass;

    /**
     * 
     */
    private Long planRefId;

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
    private Date reportTime;

    /**
     * 
     */
    private String reporterRefClass;

    /**
     * 
     */
    private Long reporterRefId;

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
        StexpectedFinishTime other = (StexpectedFinishTime) that;
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
            && (this.getExpectedFinishTime() == null ? other.getExpectedFinishTime() == null : this.getExpectedFinishTime().equals(other.getExpectedFinishTime()))
            && (this.getPlanActivityRefClass() == null ? other.getPlanActivityRefClass() == null : this.getPlanActivityRefClass().equals(other.getPlanActivityRefClass()))
            && (this.getPlanActivityRefId() == null ? other.getPlanActivityRefId() == null : this.getPlanActivityRefId().equals(other.getPlanActivityRefId()))
            && (this.getPlanRefClass() == null ? other.getPlanRefClass() == null : this.getPlanRefClass().equals(other.getPlanRefClass()))
            && (this.getPlanRefId() == null ? other.getPlanRefId() == null : this.getPlanRefId().equals(other.getPlanRefId()))
            && (this.getProjectRefClass() == null ? other.getProjectRefClass() == null : this.getProjectRefClass().equals(other.getProjectRefClass()))
            && (this.getProjectRefId() == null ? other.getProjectRefId() == null : this.getProjectRefId().equals(other.getProjectRefId()))
            && (this.getReportTime() == null ? other.getReportTime() == null : this.getReportTime().equals(other.getReportTime()))
            && (this.getReporterRefClass() == null ? other.getReporterRefClass() == null : this.getReporterRefClass().equals(other.getReporterRefClass()))
            && (this.getReporterRefId() == null ? other.getReporterRefId() == null : this.getReporterRefId().equals(other.getReporterRefId()));
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
        result = prime * result + ((getExpectedFinishTime() == null) ? 0 : getExpectedFinishTime().hashCode());
        result = prime * result + ((getPlanActivityRefClass() == null) ? 0 : getPlanActivityRefClass().hashCode());
        result = prime * result + ((getPlanActivityRefId() == null) ? 0 : getPlanActivityRefId().hashCode());
        result = prime * result + ((getPlanRefClass() == null) ? 0 : getPlanRefClass().hashCode());
        result = prime * result + ((getPlanRefId() == null) ? 0 : getPlanRefId().hashCode());
        result = prime * result + ((getProjectRefClass() == null) ? 0 : getProjectRefClass().hashCode());
        result = prime * result + ((getProjectRefId() == null) ? 0 : getProjectRefId().hashCode());
        result = prime * result + ((getReportTime() == null) ? 0 : getReportTime().hashCode());
        result = prime * result + ((getReporterRefClass() == null) ? 0 : getReporterRefClass().hashCode());
        result = prime * result + ((getReporterRefId() == null) ? 0 : getReporterRefId().hashCode());
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
        sb.append(", expectedFinishTime=").append(expectedFinishTime);
        sb.append(", planActivityRefClass=").append(planActivityRefClass);
        sb.append(", planActivityRefId=").append(planActivityRefId);
        sb.append(", planRefClass=").append(planRefClass);
        sb.append(", planRefId=").append(planRefId);
        sb.append(", projectRefClass=").append(projectRefClass);
        sb.append(", projectRefId=").append(projectRefId);
        sb.append(", reportTime=").append(reportTime);
        sb.append(", reporterRefClass=").append(reporterRefClass);
        sb.append(", reporterRefId=").append(reporterRefId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}