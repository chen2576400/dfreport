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
 * @TableName piplan_activity
 */
@TableName(value ="piplan_activity")
@Data
public class PiplanActivity implements Serializable {
    /**
     * 
     */
    @TableId
    private String classname;

    /**
     * 
     */
    @TableId
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
    private String activityType;

    /**
     * 
     */
    private String actualDurationFormat;

    /**
     * 
     */
    private Long actualDurationMillis;

    /**
     * 
     */
    private Date actualEndDate;

    /**
     * 
     */
    private Double actualEquipQty;

    /**
     * 
     */
    private Date actualStartDate;

    /**
     * 
     */
    private Double actualWorkQty;

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
    private Boolean controlUpdatesFlag;

    /**
     * 
     */
    private Boolean critical;

    /**
     * 
     */
    private String description;

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
    private Boolean drivingPathFlag;

    /**
     * 
     */
    private Date earlyEndDate;

    /**
     * 
     */
    private Date earlyStartDate;

    /**
     * 
     */
    private Date expectEndDate;

    /**
     * 
     */
    private Double freeFloat;

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
    private Integer internalIndex;

    /**
     * 
     */
    private Date lateEndDate;

    /**
     * 
     */
    private Date lateStartDate;

    /**
     * 
     */
    private Integer lineNumber;

    /**
     * 
     */
    private Date lockDate;

    /**
     * 
     */
    private String lockNote;

    /**
     * 
     */
    private Boolean locked;

    /**
     * 
     */
    private String lockerRefClass;

    /**
     * 
     */
    private Long lockerRefId;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Double originalCost;

    /**
     * 
     */
    private String parentRefClass;

    /**
     * 
     */
    private Long parentRefId;

    /**
     * 
     */
    private Double physicalCompletePercent;

    /**
     * 
     */
    private String plannableStatus;

    /**
     * 
     */
    private String primaryResourceRefClass;

    /**
     * 
     */
    private Long primaryResourceRefId;

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
    private Date reendDate;

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
    private Double remainEquipQty;

    /**
     * 
     */
    private Double remainWorkQty;

    /**
     * 
     */
    private Date restartDate;

    /**
     * 
     */
    private Date resumeDate;

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
    private Date suspendDate;

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
    private Double targetEquipQty;

    /**
     * 
     */
    private Date targetStartDate;

    /**
     * 
     */
    private Double targetWorkQty;

    /**
     * 
     */
    private String taskCode;

    /**
     * 
     */
    private Double totalFloat;

    /**
     * 
     */
    private Date constraintDate;

    /**
     * 
     */
    private Date constraintDate2;

    /**
     * 
     */
    private String dateContraintType;

    /**
     * 
     */
    private String dateContraintType2;

    /**
     * 
     */
    private String defaultDurationType;

    /**
     * 
     */
    private String editorRefClass;

    /**
     * 
     */
    private Long editorRefId;

    /**
     * 
     */
    private Boolean hasDeliverable;

    /**
     * 
     */
    private String ltdtypeDefinitionRefClass;

    /**
     * 
     */
    private Long ltdtypeDefinitionRefId;

    /**
     * 
     */
    private Date openTaskDate;

    /**
     * 
     */
    private String ownerClass;

    /**
     * 
     */
    private Long ownerId;

    /**
     * 
     */
    private String plannablePriorityType;

    /**
     * 
     */
    private Date reviewEndDate;

    /**
     * 
     */
    private String reviewerRefClass;

    /**
     * 
     */
    private Long reviewerRefId;

    /**
     * 
     */
    private String standardDurationFormat;

    /**
     * 
     */
    private Long standardDurationMillis;

    /**
     * 
     */
    private Double standardWorkQty;

    /**
     * 
     */
    private String defaultReviewpointType;

    /**
     * 
     */
    private String releaserRefClass;

    /**
     * 
     */
    private Long releaserRefId;

    /**
     * 
     */
    private String andonStatus;

    /**
     * 
     */
    private String taskCode2;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


}