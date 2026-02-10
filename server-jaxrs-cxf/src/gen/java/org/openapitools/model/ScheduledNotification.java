package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.model.Account;
import org.openapitools.model.Application;
import org.openapitools.model.Asset;
import org.openapitools.model.Audience;
import org.openapitools.model.BillableEntity;
import org.openapitools.model.ConnectionGroup;
import org.openapitools.model.Permissions;
import org.openapitools.model.ReportDefinition;
import org.openapitools.model.UserPermissions;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ScheduledNotification  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  @Valid

  private Account owner;

  @ApiModelProperty(value = "")

  @Valid

  private BillableEntity billableEntity;

public enum TypeEnum {

HTTP(String.valueOf("HTTP")), SAVE(String.valueOf("SAVE")), EMAIL(String.valueOf("EMAIL")), SMS(String.valueOf("SMS")), APNS(String.valueOf("APNS")), GCM(String.valueOf("GCM")), PUSH(String.valueOf("PUSH")), MOBILE_NOTIFICATION(String.valueOf("MOBILE_NOTIFICATION"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private TypeEnum type;

public enum StatusEnum {

NEW(String.valueOf("NEW")), ERROR(String.valueOf("ERROR")), COMPLETE(String.valueOf("COMPLETE")), PROCESSING(String.valueOf("PROCESSING")), TEMPLATE(String.valueOf("TEMPLATE"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private StatusEnum status;

public enum TemplateTypeEnum {

REPORTING(String.valueOf("REPORTING")), ACHIEVEMENT_OWNER(String.valueOf("ACHIEVEMENT_OWNER")), ACHIEVEMENT_TRIGGER(String.valueOf("ACHIEVEMENT_TRIGGER")), GEOFENCE_OWNER(String.valueOf("GEOFENCE_OWNER")), GEOFENCE_TARGET(String.valueOf("GEOFENCE_TARGET")), GEOFENCE_TRIGGER(String.valueOf("GEOFENCE_TRIGGER")), GEOFENCE_HTTP_CALL(String.valueOf("GEOFENCE_HTTP_CALL"));


    private String value;

    TemplateTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static TemplateTypeEnum fromValue(String value) {
        for (TemplateTypeEnum b : TemplateTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private TemplateTypeEnum templateType;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String errorMessage;

  @ApiModelProperty(value = "")

  private String message;

  @ApiModelProperty(value = "")

  private String payload;

  @ApiModelProperty(value = "")

  private String contentName;

  @ApiModelProperty(value = "")

  private Long contentId;

  @ApiModelProperty(value = "")

  private String contentType;

  @ApiModelProperty(value = "")

  private Long parentId;

  @ApiModelProperty(value = "")

  private String parentType;

  @ApiModelProperty(value = "")

  @Valid

  private Application application;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid ConnectionGroup> connectionGroups = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Set<Long> accountIds = new LinkedHashSet<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Audience> audiences = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private ReportDefinition report;

  @ApiModelProperty(value = "")

  private String reportParams;

  @ApiModelProperty(value = "")

  private String endpointURL;

  @ApiModelProperty(value = "")

  private Date lastActionDate;

  @ApiModelProperty(value = "")

  private Date scheduledDate;

  @ApiModelProperty(value = "")

  private Date startDate;

  @ApiModelProperty(value = "")

  private Date endDate;

  @ApiModelProperty(value = "")

  private String cronExpression;

  @ApiModelProperty(value = "")

  private Long deliverEstimate;

  @ApiModelProperty(value = "")

  private Long deliverCount;

  @ApiModelProperty(value = "")

  private Long deliverFailed;

  @ApiModelProperty(value = "")

  private Long deliverTotal;

  @ApiModelProperty(value = "")

  private Long deliverStart;

  @ApiModelProperty(value = "")

  private Long deliverLimit;

  @ApiModelProperty(value = "")

  private Long processingTime;

  @ApiModelProperty(value = "")

  private Long sendingTime;

  @ApiModelProperty(value = "")

  private String groupingId;

  @ApiModelProperty(value = "")

  private String conditionalInput;

  @ApiModelProperty(value = "")

  private String conditionalCode;

  @ApiModelProperty(value = "")

  @Valid

  private Permissions publicPermissions;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid UserPermissions> userPermissions = new ArrayList<>();

public enum VisibilityEnum {

PUBLIC(String.valueOf("PUBLIC")), PRIVATE(String.valueOf("PRIVATE")), FRIENDS(String.valueOf("FRIENDS"));


    private String value;

    VisibilityEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static VisibilityEnum fromValue(String value) {
        for (VisibilityEnum b : VisibilityEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private VisibilityEnum visibility;

public enum ApprovalStatusEnum {

PENDING(String.valueOf("PENDING")), REJECTED(String.valueOf("REJECTED")), APPROVED(String.valueOf("APPROVED")), FEATURED(String.valueOf("FEATURED"));


    private String value;

    ApprovalStatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ApprovalStatusEnum fromValue(String value) {
        for (ApprovalStatusEnum b : ApprovalStatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ApprovalStatusEnum approvalStatus;

  @ApiModelProperty(value = "")

  @Valid

  private Asset contentAsset;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ScheduledNotification id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ScheduledNotification active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public ScheduledNotification valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public ScheduledNotification owner(Account owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get billableEntity
   * @return billableEntity
  **/
  @JsonProperty("billableEntity")
  public BillableEntity getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
  }

  public ScheduledNotification billableEntity(BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ScheduledNotification type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ScheduledNotification status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Get templateType
   * @return templateType
  **/
  @JsonProperty("templateType")
  public String getTemplateType() {
    if (templateType == null) {
      return null;
    }
    return templateType.value();
  }

  public void setTemplateType(TemplateTypeEnum templateType) {
    this.templateType = templateType;
  }

  public ScheduledNotification templateType(TemplateTypeEnum templateType) {
    this.templateType = templateType;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ScheduledNotification name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get errorMessage
   * @return errorMessage
  **/
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ScheduledNotification errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ScheduledNotification message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get payload
   * @return payload
  **/
  @JsonProperty("payload")
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public ScheduledNotification payload(String payload) {
    this.payload = payload;
    return this;
  }

 /**
   * Get contentName
   * @return contentName
  **/
  @JsonProperty("contentName")
  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  public ScheduledNotification contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

 /**
   * Get contentId
   * @return contentId
  **/
  @JsonProperty("contentId")
  public Long getContentId() {
    return contentId;
  }

  public void setContentId(Long contentId) {
    this.contentId = contentId;
  }

  public ScheduledNotification contentId(Long contentId) {
    this.contentId = contentId;
    return this;
  }

 /**
   * Get contentType
   * @return contentType
  **/
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public ScheduledNotification contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

 /**
   * Get parentId
   * @return parentId
  **/
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public ScheduledNotification parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

 /**
   * Get parentType
   * @return parentType
  **/
  @JsonProperty("parentType")
  public String getParentType() {
    return parentType;
  }

  public void setParentType(String parentType) {
    this.parentType = parentType;
  }

  public ScheduledNotification parentType(String parentType) {
    this.parentType = parentType;
    return this;
  }

 /**
   * Get application
   * @return application
  **/
  @JsonProperty("application")
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }

  public ScheduledNotification application(Application application) {
    this.application = application;
    return this;
  }

 /**
   * Get connectionGroups
   * @return connectionGroups
  **/
  @JsonProperty("connectionGroups")
  public List<@Valid ConnectionGroup> getConnectionGroups() {
    return connectionGroups;
  }

  public void setConnectionGroups(List<@Valid ConnectionGroup> connectionGroups) {
    this.connectionGroups = connectionGroups;
  }

  public ScheduledNotification connectionGroups(List<@Valid ConnectionGroup> connectionGroups) {
    this.connectionGroups = connectionGroups;
    return this;
  }

  public ScheduledNotification addConnectionGroupsItem(ConnectionGroup connectionGroupsItem) {
    this.connectionGroups.add(connectionGroupsItem);
    return this;
  }

 /**
   * Get accountIds
   * @return accountIds
  **/
  @JsonProperty("accountIds")
  public Set<Long> getAccountIds() {
    return accountIds;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setAccountIds(Set<Long> accountIds) {
    this.accountIds = accountIds;
  }

  public ScheduledNotification accountIds(Set<Long> accountIds) {
    this.accountIds = accountIds;
    return this;
  }

  public ScheduledNotification addAccountIdsItem(Long accountIdsItem) {
    this.accountIds.add(accountIdsItem);
    return this;
  }

 /**
   * Get audiences
   * @return audiences
  **/
  @JsonProperty("audiences")
  public List<@Valid Audience> getAudiences() {
    return audiences;
  }

  public void setAudiences(List<@Valid Audience> audiences) {
    this.audiences = audiences;
  }

  public ScheduledNotification audiences(List<@Valid Audience> audiences) {
    this.audiences = audiences;
    return this;
  }

  public ScheduledNotification addAudiencesItem(Audience audiencesItem) {
    this.audiences.add(audiencesItem);
    return this;
  }

 /**
   * Get report
   * @return report
  **/
  @JsonProperty("report")
  public ReportDefinition getReport() {
    return report;
  }

  public void setReport(ReportDefinition report) {
    this.report = report;
  }

  public ScheduledNotification report(ReportDefinition report) {
    this.report = report;
    return this;
  }

 /**
   * Get reportParams
   * @return reportParams
  **/
  @JsonProperty("reportParams")
  public String getReportParams() {
    return reportParams;
  }

  public void setReportParams(String reportParams) {
    this.reportParams = reportParams;
  }

  public ScheduledNotification reportParams(String reportParams) {
    this.reportParams = reportParams;
    return this;
  }

 /**
   * Get endpointURL
   * @return endpointURL
  **/
  @JsonProperty("endpointURL")
  public String getEndpointURL() {
    return endpointURL;
  }

  public void setEndpointURL(String endpointURL) {
    this.endpointURL = endpointURL;
  }

  public ScheduledNotification endpointURL(String endpointURL) {
    this.endpointURL = endpointURL;
    return this;
  }

 /**
   * Get lastActionDate
   * @return lastActionDate
  **/
  @JsonProperty("lastActionDate")
  public Date getLastActionDate() {
    return lastActionDate;
  }

  public void setLastActionDate(Date lastActionDate) {
    this.lastActionDate = lastActionDate;
  }

  public ScheduledNotification lastActionDate(Date lastActionDate) {
    this.lastActionDate = lastActionDate;
    return this;
  }

 /**
   * Get scheduledDate
   * @return scheduledDate
  **/
  @JsonProperty("scheduledDate")
  public Date getScheduledDate() {
    return scheduledDate;
  }

  public void setScheduledDate(Date scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

  public ScheduledNotification scheduledDate(Date scheduledDate) {
    this.scheduledDate = scheduledDate;
    return this;
  }

 /**
   * Get startDate
   * @return startDate
  **/
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public ScheduledNotification startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * Get endDate
   * @return endDate
  **/
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public ScheduledNotification endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * Get cronExpression
   * @return cronExpression
  **/
  @JsonProperty("cronExpression")
  public String getCronExpression() {
    return cronExpression;
  }

  public void setCronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
  }

  public ScheduledNotification cronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
    return this;
  }

 /**
   * Get deliverEstimate
   * @return deliverEstimate
  **/
  @JsonProperty("deliverEstimate")
  public Long getDeliverEstimate() {
    return deliverEstimate;
  }

  public void setDeliverEstimate(Long deliverEstimate) {
    this.deliverEstimate = deliverEstimate;
  }

  public ScheduledNotification deliverEstimate(Long deliverEstimate) {
    this.deliverEstimate = deliverEstimate;
    return this;
  }

 /**
   * Get deliverCount
   * @return deliverCount
  **/
  @JsonProperty("deliverCount")
  public Long getDeliverCount() {
    return deliverCount;
  }

  public void setDeliverCount(Long deliverCount) {
    this.deliverCount = deliverCount;
  }

  public ScheduledNotification deliverCount(Long deliverCount) {
    this.deliverCount = deliverCount;
    return this;
  }

 /**
   * Get deliverFailed
   * @return deliverFailed
  **/
  @JsonProperty("deliverFailed")
  public Long getDeliverFailed() {
    return deliverFailed;
  }

  public void setDeliverFailed(Long deliverFailed) {
    this.deliverFailed = deliverFailed;
  }

  public ScheduledNotification deliverFailed(Long deliverFailed) {
    this.deliverFailed = deliverFailed;
    return this;
  }

 /**
   * Get deliverTotal
   * @return deliverTotal
  **/
  @JsonProperty("deliverTotal")
  public Long getDeliverTotal() {
    return deliverTotal;
  }

  public void setDeliverTotal(Long deliverTotal) {
    this.deliverTotal = deliverTotal;
  }

  public ScheduledNotification deliverTotal(Long deliverTotal) {
    this.deliverTotal = deliverTotal;
    return this;
  }

 /**
   * Get deliverStart
   * @return deliverStart
  **/
  @JsonProperty("deliverStart")
  public Long getDeliverStart() {
    return deliverStart;
  }

  public void setDeliverStart(Long deliverStart) {
    this.deliverStart = deliverStart;
  }

  public ScheduledNotification deliverStart(Long deliverStart) {
    this.deliverStart = deliverStart;
    return this;
  }

 /**
   * Get deliverLimit
   * @return deliverLimit
  **/
  @JsonProperty("deliverLimit")
  public Long getDeliverLimit() {
    return deliverLimit;
  }

  public void setDeliverLimit(Long deliverLimit) {
    this.deliverLimit = deliverLimit;
  }

  public ScheduledNotification deliverLimit(Long deliverLimit) {
    this.deliverLimit = deliverLimit;
    return this;
  }

 /**
   * Get processingTime
   * @return processingTime
  **/
  @JsonProperty("processingTime")
  public Long getProcessingTime() {
    return processingTime;
  }

  public void setProcessingTime(Long processingTime) {
    this.processingTime = processingTime;
  }

  public ScheduledNotification processingTime(Long processingTime) {
    this.processingTime = processingTime;
    return this;
  }

 /**
   * Get sendingTime
   * @return sendingTime
  **/
  @JsonProperty("sendingTime")
  public Long getSendingTime() {
    return sendingTime;
  }

  public void setSendingTime(Long sendingTime) {
    this.sendingTime = sendingTime;
  }

  public ScheduledNotification sendingTime(Long sendingTime) {
    this.sendingTime = sendingTime;
    return this;
  }

 /**
   * Get groupingId
   * @return groupingId
  **/
  @JsonProperty("groupingId")
  public String getGroupingId() {
    return groupingId;
  }

  public void setGroupingId(String groupingId) {
    this.groupingId = groupingId;
  }

  public ScheduledNotification groupingId(String groupingId) {
    this.groupingId = groupingId;
    return this;
  }

 /**
   * Get conditionalInput
   * @return conditionalInput
  **/
  @JsonProperty("conditionalInput")
  public String getConditionalInput() {
    return conditionalInput;
  }

  public void setConditionalInput(String conditionalInput) {
    this.conditionalInput = conditionalInput;
  }

  public ScheduledNotification conditionalInput(String conditionalInput) {
    this.conditionalInput = conditionalInput;
    return this;
  }

 /**
   * Get conditionalCode
   * @return conditionalCode
  **/
  @JsonProperty("conditionalCode")
  public String getConditionalCode() {
    return conditionalCode;
  }

  public void setConditionalCode(String conditionalCode) {
    this.conditionalCode = conditionalCode;
  }

  public ScheduledNotification conditionalCode(String conditionalCode) {
    this.conditionalCode = conditionalCode;
    return this;
  }

 /**
   * Get publicPermissions
   * @return publicPermissions
  **/
  @JsonProperty("publicPermissions")
  public Permissions getPublicPermissions() {
    return publicPermissions;
  }

  public void setPublicPermissions(Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
  }

  public ScheduledNotification publicPermissions(Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
    return this;
  }

 /**
   * Get userPermissions
   * @return userPermissions
  **/
  @JsonProperty("userPermissions")
  public List<@Valid UserPermissions> getUserPermissions() {
    return userPermissions;
  }

  public void setUserPermissions(List<@Valid UserPermissions> userPermissions) {
    this.userPermissions = userPermissions;
  }

  public ScheduledNotification userPermissions(List<@Valid UserPermissions> userPermissions) {
    this.userPermissions = userPermissions;
    return this;
  }

  public ScheduledNotification addUserPermissionsItem(UserPermissions userPermissionsItem) {
    this.userPermissions.add(userPermissionsItem);
    return this;
  }

 /**
   * Get visibility
   * @return visibility
  **/
  @JsonProperty("visibility")
  public String getVisibility() {
    if (visibility == null) {
      return null;
    }
    return visibility.value();
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public ScheduledNotification visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

 /**
   * Get approvalStatus
   * @return approvalStatus
  **/
  @JsonProperty("approvalStatus")
  public String getApprovalStatus() {
    if (approvalStatus == null) {
      return null;
    }
    return approvalStatus.value();
  }

  public void setApprovalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public ScheduledNotification approvalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

 /**
   * Get contentAsset
   * @return contentAsset
  **/
  @JsonProperty("contentAsset")
  public Asset getContentAsset() {
    return contentAsset;
  }

  public void setContentAsset(Asset contentAsset) {
    this.contentAsset = contentAsset;
  }

  public ScheduledNotification contentAsset(Asset contentAsset) {
    this.contentAsset = contentAsset;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduledNotification scheduledNotification = (ScheduledNotification) o;
    return Objects.equals(this.id, scheduledNotification.id) &&
        Objects.equals(this.active, scheduledNotification.active) &&
        Objects.equals(this.valid, scheduledNotification.valid) &&
        Objects.equals(this.owner, scheduledNotification.owner) &&
        Objects.equals(this.billableEntity, scheduledNotification.billableEntity) &&
        Objects.equals(this.type, scheduledNotification.type) &&
        Objects.equals(this.status, scheduledNotification.status) &&
        Objects.equals(this.templateType, scheduledNotification.templateType) &&
        Objects.equals(this.name, scheduledNotification.name) &&
        Objects.equals(this.errorMessage, scheduledNotification.errorMessage) &&
        Objects.equals(this.message, scheduledNotification.message) &&
        Objects.equals(this.payload, scheduledNotification.payload) &&
        Objects.equals(this.contentName, scheduledNotification.contentName) &&
        Objects.equals(this.contentId, scheduledNotification.contentId) &&
        Objects.equals(this.contentType, scheduledNotification.contentType) &&
        Objects.equals(this.parentId, scheduledNotification.parentId) &&
        Objects.equals(this.parentType, scheduledNotification.parentType) &&
        Objects.equals(this.application, scheduledNotification.application) &&
        Objects.equals(this.connectionGroups, scheduledNotification.connectionGroups) &&
        Objects.equals(this.accountIds, scheduledNotification.accountIds) &&
        Objects.equals(this.audiences, scheduledNotification.audiences) &&
        Objects.equals(this.report, scheduledNotification.report) &&
        Objects.equals(this.reportParams, scheduledNotification.reportParams) &&
        Objects.equals(this.endpointURL, scheduledNotification.endpointURL) &&
        Objects.equals(this.lastActionDate, scheduledNotification.lastActionDate) &&
        Objects.equals(this.scheduledDate, scheduledNotification.scheduledDate) &&
        Objects.equals(this.startDate, scheduledNotification.startDate) &&
        Objects.equals(this.endDate, scheduledNotification.endDate) &&
        Objects.equals(this.cronExpression, scheduledNotification.cronExpression) &&
        Objects.equals(this.deliverEstimate, scheduledNotification.deliverEstimate) &&
        Objects.equals(this.deliverCount, scheduledNotification.deliverCount) &&
        Objects.equals(this.deliverFailed, scheduledNotification.deliverFailed) &&
        Objects.equals(this.deliverTotal, scheduledNotification.deliverTotal) &&
        Objects.equals(this.deliverStart, scheduledNotification.deliverStart) &&
        Objects.equals(this.deliverLimit, scheduledNotification.deliverLimit) &&
        Objects.equals(this.processingTime, scheduledNotification.processingTime) &&
        Objects.equals(this.sendingTime, scheduledNotification.sendingTime) &&
        Objects.equals(this.groupingId, scheduledNotification.groupingId) &&
        Objects.equals(this.conditionalInput, scheduledNotification.conditionalInput) &&
        Objects.equals(this.conditionalCode, scheduledNotification.conditionalCode) &&
        Objects.equals(this.publicPermissions, scheduledNotification.publicPermissions) &&
        Objects.equals(this.userPermissions, scheduledNotification.userPermissions) &&
        Objects.equals(this.visibility, scheduledNotification.visibility) &&
        Objects.equals(this.approvalStatus, scheduledNotification.approvalStatus) &&
        Objects.equals(this.contentAsset, scheduledNotification.contentAsset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, owner, billableEntity, type, status, templateType, name, errorMessage, message, payload, contentName, contentId, contentType, parentId, parentType, application, connectionGroups, accountIds, audiences, report, reportParams, endpointURL, lastActionDate, scheduledDate, startDate, endDate, cronExpression, deliverEstimate, deliverCount, deliverFailed, deliverTotal, deliverStart, deliverLimit, processingTime, sendingTime, groupingId, conditionalInput, conditionalCode, publicPermissions, userPermissions, visibility, approvalStatus, contentAsset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    billableEntity: ").append(toIndentedString(billableEntity)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    connectionGroups: ").append(toIndentedString(connectionGroups)).append("\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    audiences: ").append(toIndentedString(audiences)).append("\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
    sb.append("    reportParams: ").append(toIndentedString(reportParams)).append("\n");
    sb.append("    endpointURL: ").append(toIndentedString(endpointURL)).append("\n");
    sb.append("    lastActionDate: ").append(toIndentedString(lastActionDate)).append("\n");
    sb.append("    scheduledDate: ").append(toIndentedString(scheduledDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    cronExpression: ").append(toIndentedString(cronExpression)).append("\n");
    sb.append("    deliverEstimate: ").append(toIndentedString(deliverEstimate)).append("\n");
    sb.append("    deliverCount: ").append(toIndentedString(deliverCount)).append("\n");
    sb.append("    deliverFailed: ").append(toIndentedString(deliverFailed)).append("\n");
    sb.append("    deliverTotal: ").append(toIndentedString(deliverTotal)).append("\n");
    sb.append("    deliverStart: ").append(toIndentedString(deliverStart)).append("\n");
    sb.append("    deliverLimit: ").append(toIndentedString(deliverLimit)).append("\n");
    sb.append("    processingTime: ").append(toIndentedString(processingTime)).append("\n");
    sb.append("    sendingTime: ").append(toIndentedString(sendingTime)).append("\n");
    sb.append("    groupingId: ").append(toIndentedString(groupingId)).append("\n");
    sb.append("    conditionalInput: ").append(toIndentedString(conditionalInput)).append("\n");
    sb.append("    conditionalCode: ").append(toIndentedString(conditionalCode)).append("\n");
    sb.append("    publicPermissions: ").append(toIndentedString(publicPermissions)).append("\n");
    sb.append("    userPermissions: ").append(toIndentedString(userPermissions)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    contentAsset: ").append(toIndentedString(contentAsset)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

