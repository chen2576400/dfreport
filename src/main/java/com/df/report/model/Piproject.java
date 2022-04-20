package com.df.report.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName piproject
 */
@TableName(value ="piproject")
@Data
public class Piproject implements Serializable {
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
    private String accountRefClass;

    /**
     * 
     */
    private Long accountRefId;

    /**
     * 
     */
    private Boolean actualPercentLinkFlag;

    /**
     * 
     */
    private Boolean actualThisPerLinkFlag;

    /**
     * 
     */
    private Boolean addActualRemainFlag;

    /**
     * 
     */
    private String addByName;

    /**
     * 
     */
    private Date addDate;

    /**
     * 
     */
    private Boolean allowCompleteFlag;

    /**
     * 
     */
    private Boolean allowNegActualFlag;

    /**
     * 
     */
    private Date applyActualsDate;

    /**
     * 
     */
    private String baselineTypeRefClass;

    /**
     * 
     */
    private Long baselineTypeRefId;

    /**
     * 
     */
    private Boolean batchSumFlag;

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
    private Date checkoutDate;

    /**
     * 
     */
    private Boolean checkoutFlag;

    /**
     * 
     */
    private String checkoutUserRefClass;

    /**
     * 
     */
    private Long checkoutUserRefId;

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
    private Boolean costQtyRecalcFlag;

    /**
     * 
     */
    private Double criticalDurationHourCount;

    /**
     * 
     */
    private String criticalPathType;

    /**
     * 
     */
    private String defaultCompletePercentType;

    /**
     * 
     */
    private Double defaultCostPerQty;

    /**
     * 
     */
    private String defaultDurationType;

    /**
     * 
     */
    private String defaultQtyType;

    /**
     * 
     */
    private String defaultRateType;

    /**
     * 
     */
    private Boolean defaultRollupDatesFlag;

    /**
     * 
     */
    private String defaultTaskType;

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
    private Integer fiscalYearStartMonthNum;

    /**
     * 
     */
    private Date forecastStartDate;

    /**
     * 
     */
    private String histInterval;

    /**
     * 
     */
    private String histLevel;

    /**
     * 
     */
    private String intgProjectType;

    /**
     * 
     */
    private Boolean isTemplate;

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
    private Date lastBaselineUpdateDate;

    /**
     * 
     */
    private Integer lastChecksum;

    /**
     * 
     */
    private String lastFinancialPeriodRefClass;

    /**
     * 
     */
    private Long lastFinancialPeriodRefId;

    /**
     * 
     */
    private Date lastRecalcDate;

    /**
     * 
     */
    private Date lastTasksumDate;

    /**
     * 
     */
    private Double maxQtyPerHour;

    /**
     * 
     */
    private Boolean mspManagedFlag;

    /**
     * 
     */
    private Boolean mspUpdateActualsFlag;

    /**
     * 
     */
    private String nameSepChar;

    /**
     * 
     */
    private String obsRefClass;

    /**
     * 
     */
    private Long obsRefId;

    /**
     * 
     */
    private String originalProjectRefClass;

    /**
     * 
     */
    private Long originalProjectRefId;

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
    private Date planEndDate;

    /**
     * 
     */
    private Date planStartDate;

    /**
     * 
     */
    private Integer priorityNum;

    /**
     * 
     */
    private String projectAbbreviation;

    /**
     * 
     */
    private Boolean projectFlag;

    /**
     * 
     */
    private String projectGroupRefClass;

    /**
     * 
     */
    private Long projectGroupRefId;

    /**
     * 
     */
    private String projectName;

    /**
     * 
     */
    private String projectShortName;

    /**
     * 
     */
    private String projectTemplateRefClass;

    /**
     * 
     */
    private Long projectTemplateRefId;

    /**
     * 
     */
    private String projectUrl;

    /**
     * 
     */
    private Boolean remainingTargetLinkFlag;

    /**
     * 
     */
    private Boolean resetPlannedFlag;

    /**
     * 
     */
    private String responsibleRsrcRefClass;

    /**
     * 
     */
    private Long responsibleRsrcRefId;

    /**
     * 
     */
    private Integer riskLevel;

    /**
     * 
     */
    private Boolean rsrcMultiAssignFlag;

    /**
     * 
     */
    private Boolean rsrcSelfAddFlag;

    /**
     * 
     */
    private Date scheduledEndDate;

    /**
     * 
     */
    private String sourceProjectRefClass;

    /**
     * 
     */
    private Long sourceProjectRefId;

    /**
     * 
     */
    private Date startDate;

    /**
     * 
     */
    private Boolean atGate;

    /**
     * 
     */
    private String lcStateRefClass;

    /**
     * 
     */
    private Long lcStateRefId;

    /**
     * 
     */
    private Boolean stepCompleteFlag;

    /**
     * 
     */
    private Integer strgyPriorityNum;

    /**
     * 
     */
    private String sumAssignLevel;

    /**
     * 
     */
    private String sumBaselineProjectRefClass;

    /**
     * 
     */
    private Long sumBaselineProjectRefId;

    /**
     * 
     */
    private Date sumDataDate;

    /**
     * 
     */
    private Boolean sumOnlyFlag;

    /**
     * 
     */
    private Integer taskCodeBase;

    /**
     * 
     */
    private String taskCodePrefix;

    /**
     * 
     */
    private Boolean taskCodePrefixFlag;

    /**
     * 
     */
    private Integer taskCodeStep;

    /**
     * 
     */
    private Boolean timesheetRsrcMarkActualFinishFlag;

    /**
     * 
     */
    private Boolean timesheetRsrcViewComplAsgnFlag;

    /**
     * 
     */
    private Boolean timesheetRsrcViewInactActvFlag;

    /**
     * 
     */
    private Boolean useProjectBaselineFlag;

    /**
     * 
     */
    private Integer wbsMaxSumLevel;

    /**
     * 
     */
    private String lcTemplateRefClass;

    /**
     * 
     */
    private Long lcTemplateRefId;

    /**
     * 
     */
    private String projectManagerRefClass;

    /**
     * 
     */
    private Long projectManagerRefId;

    /**
     * 
     */
    private String teamReferenceClass;

    /**
     * 
     */
    private Long teamReferenceId;

    /**
     * 
     */
    private String teamTemplateReferenceClass;

    /**
     * 
     */
    private Long teamTemplateReferenceId;

    /**
     * 
     */
    private byte[] entrySet;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


}