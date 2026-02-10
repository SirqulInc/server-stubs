package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
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
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ScheduledNotification
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ScheduledNotification {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Account owner;

  private @Nullable BillableEntity billableEntity;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    HTTP("HTTP"),
    
    SAVE("SAVE"),
    
    EMAIL("EMAIL"),
    
    SMS("SMS"),
    
    APNS("APNS"),
    
    GCM("GCM"),
    
    PUSH("PUSH"),
    
    MOBILE_NOTIFICATION("MOBILE_NOTIFICATION");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable TypeEnum type;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    NEW("NEW"),
    
    ERROR("ERROR"),
    
    COMPLETE("COMPLETE"),
    
    PROCESSING("PROCESSING"),
    
    TEMPLATE("TEMPLATE");

    private final String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable StatusEnum status;

  /**
   * Gets or Sets templateType
   */
  public enum TemplateTypeEnum {
    REPORTING("REPORTING"),
    
    ACHIEVEMENT_OWNER("ACHIEVEMENT_OWNER"),
    
    ACHIEVEMENT_TRIGGER("ACHIEVEMENT_TRIGGER"),
    
    GEOFENCE_OWNER("GEOFENCE_OWNER"),
    
    GEOFENCE_TARGET("GEOFENCE_TARGET"),
    
    GEOFENCE_TRIGGER("GEOFENCE_TRIGGER"),
    
    GEOFENCE_HTTP_CALL("GEOFENCE_HTTP_CALL");

    private final String value;

    TemplateTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable TemplateTypeEnum templateType;

  private @Nullable String name;

  private @Nullable String errorMessage;

  private @Nullable String message;

  private @Nullable String payload;

  private @Nullable String contentName;

  private @Nullable Long contentId;

  private @Nullable String contentType;

  private @Nullable Long parentId;

  private @Nullable String parentType;

  private @Nullable Application application;

  @Valid
  private List<@Valid ConnectionGroup> connectionGroups = new ArrayList<>();

  @Valid
  private Set<Long> accountIds = new LinkedHashSet<>();

  @Valid
  private List<@Valid Audience> audiences = new ArrayList<>();

  private @Nullable ReportDefinition report;

  private @Nullable String reportParams;

  private @Nullable String endpointURL;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime lastActionDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime scheduledDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime startDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime endDate;

  private @Nullable String cronExpression;

  private @Nullable Long deliverEstimate;

  private @Nullable Long deliverCount;

  private @Nullable Long deliverFailed;

  private @Nullable Long deliverTotal;

  private @Nullable Long deliverStart;

  private @Nullable Long deliverLimit;

  private @Nullable Long processingTime;

  private @Nullable Long sendingTime;

  private @Nullable String groupingId;

  private @Nullable String conditionalInput;

  private @Nullable String conditionalCode;

  private @Nullable Permissions publicPermissions;

  @Valid
  private List<@Valid UserPermissions> userPermissions = new ArrayList<>();

  /**
   * Gets or Sets visibility
   */
  public enum VisibilityEnum {
    PUBLIC("PUBLIC"),
    
    PRIVATE("PRIVATE"),
    
    FRIENDS("FRIENDS");

    private final String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable VisibilityEnum visibility;

  /**
   * Gets or Sets approvalStatus
   */
  public enum ApprovalStatusEnum {
    PENDING("PENDING"),
    
    REJECTED("REJECTED"),
    
    APPROVED("APPROVED"),
    
    FEATURED("FEATURED");

    private final String value;

    ApprovalStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable ApprovalStatusEnum approvalStatus;

  private @Nullable Asset contentAsset;

  public ScheduledNotification id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public ScheduledNotification active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  public ScheduledNotification valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public ScheduledNotification owner(@Nullable Account owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @Valid 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public @Nullable Account getOwner() {
    return owner;
  }

  public void setOwner(@Nullable Account owner) {
    this.owner = owner;
  }

  public ScheduledNotification billableEntity(@Nullable BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
    return this;
  }

  /**
   * Get billableEntity
   * @return billableEntity
   */
  @Valid 
  @Schema(name = "billableEntity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billableEntity")
  public @Nullable BillableEntity getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(@Nullable BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
  }

  public ScheduledNotification type(@Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable TypeEnum getType() {
    return type;
  }

  public void setType(@Nullable TypeEnum type) {
    this.type = type;
  }

  public ScheduledNotification status(@Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@Nullable StatusEnum status) {
    this.status = status;
  }

  public ScheduledNotification templateType(@Nullable TemplateTypeEnum templateType) {
    this.templateType = templateType;
    return this;
  }

  /**
   * Get templateType
   * @return templateType
   */
  
  @Schema(name = "templateType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("templateType")
  public @Nullable TemplateTypeEnum getTemplateType() {
    return templateType;
  }

  public void setTemplateType(@Nullable TemplateTypeEnum templateType) {
    this.templateType = templateType;
  }

  public ScheduledNotification name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public ScheduledNotification errorMessage(@Nullable String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
   */
  
  @Schema(name = "errorMessage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorMessage")
  public @Nullable String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(@Nullable String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ScheduledNotification message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  public ScheduledNotification payload(@Nullable String payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Get payload
   * @return payload
   */
  
  @Schema(name = "payload", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("payload")
  public @Nullable String getPayload() {
    return payload;
  }

  public void setPayload(@Nullable String payload) {
    this.payload = payload;
  }

  public ScheduledNotification contentName(@Nullable String contentName) {
    this.contentName = contentName;
    return this;
  }

  /**
   * Get contentName
   * @return contentName
   */
  
  @Schema(name = "contentName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentName")
  public @Nullable String getContentName() {
    return contentName;
  }

  public void setContentName(@Nullable String contentName) {
    this.contentName = contentName;
  }

  public ScheduledNotification contentId(@Nullable Long contentId) {
    this.contentId = contentId;
    return this;
  }

  /**
   * Get contentId
   * @return contentId
   */
  
  @Schema(name = "contentId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentId")
  public @Nullable Long getContentId() {
    return contentId;
  }

  public void setContentId(@Nullable Long contentId) {
    this.contentId = contentId;
  }

  public ScheduledNotification contentType(@Nullable String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
   */
  
  @Schema(name = "contentType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentType")
  public @Nullable String getContentType() {
    return contentType;
  }

  public void setContentType(@Nullable String contentType) {
    this.contentType = contentType;
  }

  public ScheduledNotification parentId(@Nullable Long parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
   */
  
  @Schema(name = "parentId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentId")
  public @Nullable Long getParentId() {
    return parentId;
  }

  public void setParentId(@Nullable Long parentId) {
    this.parentId = parentId;
  }

  public ScheduledNotification parentType(@Nullable String parentType) {
    this.parentType = parentType;
    return this;
  }

  /**
   * Get parentType
   * @return parentType
   */
  
  @Schema(name = "parentType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentType")
  public @Nullable String getParentType() {
    return parentType;
  }

  public void setParentType(@Nullable String parentType) {
    this.parentType = parentType;
  }

  public ScheduledNotification application(@Nullable Application application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
   */
  @Valid 
  @Schema(name = "application", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("application")
  public @Nullable Application getApplication() {
    return application;
  }

  public void setApplication(@Nullable Application application) {
    this.application = application;
  }

  public ScheduledNotification connectionGroups(List<@Valid ConnectionGroup> connectionGroups) {
    this.connectionGroups = connectionGroups;
    return this;
  }

  public ScheduledNotification addConnectionGroupsItem(ConnectionGroup connectionGroupsItem) {
    if (this.connectionGroups == null) {
      this.connectionGroups = new ArrayList<>();
    }
    this.connectionGroups.add(connectionGroupsItem);
    return this;
  }

  /**
   * Get connectionGroups
   * @return connectionGroups
   */
  @Valid 
  @Schema(name = "connectionGroups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectionGroups")
  public List<@Valid ConnectionGroup> getConnectionGroups() {
    return connectionGroups;
  }

  public void setConnectionGroups(List<@Valid ConnectionGroup> connectionGroups) {
    this.connectionGroups = connectionGroups;
  }

  public ScheduledNotification accountIds(Set<Long> accountIds) {
    this.accountIds = accountIds;
    return this;
  }

  public ScheduledNotification addAccountIdsItem(Long accountIdsItem) {
    if (this.accountIds == null) {
      this.accountIds = new LinkedHashSet<>();
    }
    this.accountIds.add(accountIdsItem);
    return this;
  }

  /**
   * Get accountIds
   * @return accountIds
   */
  
  @Schema(name = "accountIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountIds")
  public Set<Long> getAccountIds() {
    return accountIds;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setAccountIds(Set<Long> accountIds) {
    this.accountIds = accountIds;
  }

  public ScheduledNotification audiences(List<@Valid Audience> audiences) {
    this.audiences = audiences;
    return this;
  }

  public ScheduledNotification addAudiencesItem(Audience audiencesItem) {
    if (this.audiences == null) {
      this.audiences = new ArrayList<>();
    }
    this.audiences.add(audiencesItem);
    return this;
  }

  /**
   * Get audiences
   * @return audiences
   */
  @Valid 
  @Schema(name = "audiences", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("audiences")
  public List<@Valid Audience> getAudiences() {
    return audiences;
  }

  public void setAudiences(List<@Valid Audience> audiences) {
    this.audiences = audiences;
  }

  public ScheduledNotification report(@Nullable ReportDefinition report) {
    this.report = report;
    return this;
  }

  /**
   * Get report
   * @return report
   */
  @Valid 
  @Schema(name = "report", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("report")
  public @Nullable ReportDefinition getReport() {
    return report;
  }

  public void setReport(@Nullable ReportDefinition report) {
    this.report = report;
  }

  public ScheduledNotification reportParams(@Nullable String reportParams) {
    this.reportParams = reportParams;
    return this;
  }

  /**
   * Get reportParams
   * @return reportParams
   */
  
  @Schema(name = "reportParams", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reportParams")
  public @Nullable String getReportParams() {
    return reportParams;
  }

  public void setReportParams(@Nullable String reportParams) {
    this.reportParams = reportParams;
  }

  public ScheduledNotification endpointURL(@Nullable String endpointURL) {
    this.endpointURL = endpointURL;
    return this;
  }

  /**
   * Get endpointURL
   * @return endpointURL
   */
  
  @Schema(name = "endpointURL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endpointURL")
  public @Nullable String getEndpointURL() {
    return endpointURL;
  }

  public void setEndpointURL(@Nullable String endpointURL) {
    this.endpointURL = endpointURL;
  }

  public ScheduledNotification lastActionDate(@Nullable OffsetDateTime lastActionDate) {
    this.lastActionDate = lastActionDate;
    return this;
  }

  /**
   * Get lastActionDate
   * @return lastActionDate
   */
  @Valid 
  @Schema(name = "lastActionDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastActionDate")
  public @Nullable OffsetDateTime getLastActionDate() {
    return lastActionDate;
  }

  public void setLastActionDate(@Nullable OffsetDateTime lastActionDate) {
    this.lastActionDate = lastActionDate;
  }

  public ScheduledNotification scheduledDate(@Nullable OffsetDateTime scheduledDate) {
    this.scheduledDate = scheduledDate;
    return this;
  }

  /**
   * Get scheduledDate
   * @return scheduledDate
   */
  @Valid 
  @Schema(name = "scheduledDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduledDate")
  public @Nullable OffsetDateTime getScheduledDate() {
    return scheduledDate;
  }

  public void setScheduledDate(@Nullable OffsetDateTime scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

  public ScheduledNotification startDate(@Nullable OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  @Valid 
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public @Nullable OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public ScheduledNotification endDate(@Nullable OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  @Valid 
  @Schema(name = "endDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public @Nullable OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(@Nullable OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public ScheduledNotification cronExpression(@Nullable String cronExpression) {
    this.cronExpression = cronExpression;
    return this;
  }

  /**
   * Get cronExpression
   * @return cronExpression
   */
  
  @Schema(name = "cronExpression", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cronExpression")
  public @Nullable String getCronExpression() {
    return cronExpression;
  }

  public void setCronExpression(@Nullable String cronExpression) {
    this.cronExpression = cronExpression;
  }

  public ScheduledNotification deliverEstimate(@Nullable Long deliverEstimate) {
    this.deliverEstimate = deliverEstimate;
    return this;
  }

  /**
   * Get deliverEstimate
   * @return deliverEstimate
   */
  
  @Schema(name = "deliverEstimate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deliverEstimate")
  public @Nullable Long getDeliverEstimate() {
    return deliverEstimate;
  }

  public void setDeliverEstimate(@Nullable Long deliverEstimate) {
    this.deliverEstimate = deliverEstimate;
  }

  public ScheduledNotification deliverCount(@Nullable Long deliverCount) {
    this.deliverCount = deliverCount;
    return this;
  }

  /**
   * Get deliverCount
   * @return deliverCount
   */
  
  @Schema(name = "deliverCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deliverCount")
  public @Nullable Long getDeliverCount() {
    return deliverCount;
  }

  public void setDeliverCount(@Nullable Long deliverCount) {
    this.deliverCount = deliverCount;
  }

  public ScheduledNotification deliverFailed(@Nullable Long deliverFailed) {
    this.deliverFailed = deliverFailed;
    return this;
  }

  /**
   * Get deliverFailed
   * @return deliverFailed
   */
  
  @Schema(name = "deliverFailed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deliverFailed")
  public @Nullable Long getDeliverFailed() {
    return deliverFailed;
  }

  public void setDeliverFailed(@Nullable Long deliverFailed) {
    this.deliverFailed = deliverFailed;
  }

  public ScheduledNotification deliverTotal(@Nullable Long deliverTotal) {
    this.deliverTotal = deliverTotal;
    return this;
  }

  /**
   * Get deliverTotal
   * @return deliverTotal
   */
  
  @Schema(name = "deliverTotal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deliverTotal")
  public @Nullable Long getDeliverTotal() {
    return deliverTotal;
  }

  public void setDeliverTotal(@Nullable Long deliverTotal) {
    this.deliverTotal = deliverTotal;
  }

  public ScheduledNotification deliverStart(@Nullable Long deliverStart) {
    this.deliverStart = deliverStart;
    return this;
  }

  /**
   * Get deliverStart
   * @return deliverStart
   */
  
  @Schema(name = "deliverStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deliverStart")
  public @Nullable Long getDeliverStart() {
    return deliverStart;
  }

  public void setDeliverStart(@Nullable Long deliverStart) {
    this.deliverStart = deliverStart;
  }

  public ScheduledNotification deliverLimit(@Nullable Long deliverLimit) {
    this.deliverLimit = deliverLimit;
    return this;
  }

  /**
   * Get deliverLimit
   * @return deliverLimit
   */
  
  @Schema(name = "deliverLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deliverLimit")
  public @Nullable Long getDeliverLimit() {
    return deliverLimit;
  }

  public void setDeliverLimit(@Nullable Long deliverLimit) {
    this.deliverLimit = deliverLimit;
  }

  public ScheduledNotification processingTime(@Nullable Long processingTime) {
    this.processingTime = processingTime;
    return this;
  }

  /**
   * Get processingTime
   * @return processingTime
   */
  
  @Schema(name = "processingTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processingTime")
  public @Nullable Long getProcessingTime() {
    return processingTime;
  }

  public void setProcessingTime(@Nullable Long processingTime) {
    this.processingTime = processingTime;
  }

  public ScheduledNotification sendingTime(@Nullable Long sendingTime) {
    this.sendingTime = sendingTime;
    return this;
  }

  /**
   * Get sendingTime
   * @return sendingTime
   */
  
  @Schema(name = "sendingTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sendingTime")
  public @Nullable Long getSendingTime() {
    return sendingTime;
  }

  public void setSendingTime(@Nullable Long sendingTime) {
    this.sendingTime = sendingTime;
  }

  public ScheduledNotification groupingId(@Nullable String groupingId) {
    this.groupingId = groupingId;
    return this;
  }

  /**
   * Get groupingId
   * @return groupingId
   */
  
  @Schema(name = "groupingId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupingId")
  public @Nullable String getGroupingId() {
    return groupingId;
  }

  public void setGroupingId(@Nullable String groupingId) {
    this.groupingId = groupingId;
  }

  public ScheduledNotification conditionalInput(@Nullable String conditionalInput) {
    this.conditionalInput = conditionalInput;
    return this;
  }

  /**
   * Get conditionalInput
   * @return conditionalInput
   */
  
  @Schema(name = "conditionalInput", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conditionalInput")
  public @Nullable String getConditionalInput() {
    return conditionalInput;
  }

  public void setConditionalInput(@Nullable String conditionalInput) {
    this.conditionalInput = conditionalInput;
  }

  public ScheduledNotification conditionalCode(@Nullable String conditionalCode) {
    this.conditionalCode = conditionalCode;
    return this;
  }

  /**
   * Get conditionalCode
   * @return conditionalCode
   */
  
  @Schema(name = "conditionalCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conditionalCode")
  public @Nullable String getConditionalCode() {
    return conditionalCode;
  }

  public void setConditionalCode(@Nullable String conditionalCode) {
    this.conditionalCode = conditionalCode;
  }

  public ScheduledNotification publicPermissions(@Nullable Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
    return this;
  }

  /**
   * Get publicPermissions
   * @return publicPermissions
   */
  @Valid 
  @Schema(name = "publicPermissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publicPermissions")
  public @Nullable Permissions getPublicPermissions() {
    return publicPermissions;
  }

  public void setPublicPermissions(@Nullable Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
  }

  public ScheduledNotification userPermissions(List<@Valid UserPermissions> userPermissions) {
    this.userPermissions = userPermissions;
    return this;
  }

  public ScheduledNotification addUserPermissionsItem(UserPermissions userPermissionsItem) {
    if (this.userPermissions == null) {
      this.userPermissions = new ArrayList<>();
    }
    this.userPermissions.add(userPermissionsItem);
    return this;
  }

  /**
   * Get userPermissions
   * @return userPermissions
   */
  @Valid 
  @Schema(name = "userPermissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userPermissions")
  public List<@Valid UserPermissions> getUserPermissions() {
    return userPermissions;
  }

  public void setUserPermissions(List<@Valid UserPermissions> userPermissions) {
    this.userPermissions = userPermissions;
  }

  public ScheduledNotification visibility(@Nullable VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Get visibility
   * @return visibility
   */
  
  @Schema(name = "visibility", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visibility")
  public @Nullable VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(@Nullable VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public ScheduledNotification approvalStatus(@Nullable ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

  /**
   * Get approvalStatus
   * @return approvalStatus
   */
  
  @Schema(name = "approvalStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approvalStatus")
  public @Nullable ApprovalStatusEnum getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(@Nullable ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public ScheduledNotification contentAsset(@Nullable Asset contentAsset) {
    this.contentAsset = contentAsset;
    return this;
  }

  /**
   * Get contentAsset
   * @return contentAsset
   */
  @Valid 
  @Schema(name = "contentAsset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentAsset")
  public @Nullable Asset getContentAsset() {
    return contentAsset;
  }

  public void setContentAsset(@Nullable Asset contentAsset) {
    this.contentAsset = contentAsset;
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

