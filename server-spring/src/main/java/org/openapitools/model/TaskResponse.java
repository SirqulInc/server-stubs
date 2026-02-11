package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.ApplicationMiniResponse;
import org.openapitools.model.BillableEntityShortResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TaskResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TaskResponse {

  private @Nullable Long scheduledNotificationId;

  private @Nullable Boolean active;

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

  private @Nullable String name;

  private @Nullable String message;

  private @Nullable String groupingId;

  private @Nullable Long scheduledDate;

  private @Nullable Long startDate;

  private @Nullable Long endDate;

  private @Nullable AccountShortResponse owner;

  private @Nullable BillableEntityShortResponse billableEntity;

  private @Nullable Long contentId;

  private @Nullable String contentName;

  private @Nullable String contentType;

  private @Nullable Long parentId;

  private @Nullable String parentType;

  private @Nullable ApplicationMiniResponse application;

  private @Nullable Long targetId;

  private @Nullable String targetName;

  private @Nullable String targetType;

  private @Nullable String targetParams;

  private @Nullable Long deliverEstimate;

  private @Nullable Long deliverCount;

  private @Nullable Long deliverTotal;

  private @Nullable Long deliverFailed;

  private @Nullable Long processingTime;

  private @Nullable Long sendingTime;

  private @Nullable Long updated;

  private @Nullable Long created;

  private @Nullable String cronExpression;

  private @Nullable String endpointURL;

  private @Nullable String payload;

  private @Nullable String conditionalInput;

  @Valid
  private List<Long> connectionAccountIds = new ArrayList<>();

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

  /**
   * Gets or Sets groupedTypes
   */
  public enum GroupedTypesEnum {
    HTTP("HTTP"),
    
    SAVE("SAVE"),
    
    EMAIL("EMAIL"),
    
    SMS("SMS"),
    
    APNS("APNS"),
    
    GCM("GCM"),
    
    PUSH("PUSH"),
    
    MOBILE_NOTIFICATION("MOBILE_NOTIFICATION");

    private final String value;

    GroupedTypesEnum(String value) {
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
    public static GroupedTypesEnum fromValue(String value) {
      for (GroupedTypesEnum b : GroupedTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<GroupedTypesEnum> groupedTypes = new ArrayList<>();

  private @Nullable Long taskId;

  public TaskResponse scheduledNotificationId(@Nullable Long scheduledNotificationId) {
    this.scheduledNotificationId = scheduledNotificationId;
    return this;
  }

  /**
   * Get scheduledNotificationId
   * @return scheduledNotificationId
   */
  
  @Schema(name = "scheduledNotificationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduledNotificationId")
  public @Nullable Long getScheduledNotificationId() {
    return scheduledNotificationId;
  }

  public void setScheduledNotificationId(@Nullable Long scheduledNotificationId) {
    this.scheduledNotificationId = scheduledNotificationId;
  }

  public TaskResponse active(@Nullable Boolean active) {
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

  public TaskResponse status(@Nullable StatusEnum status) {
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

  public TaskResponse type(@Nullable TypeEnum type) {
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

  public TaskResponse name(@Nullable String name) {
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

  public TaskResponse message(@Nullable String message) {
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

  public TaskResponse groupingId(@Nullable String groupingId) {
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

  public TaskResponse scheduledDate(@Nullable Long scheduledDate) {
    this.scheduledDate = scheduledDate;
    return this;
  }

  /**
   * Get scheduledDate
   * @return scheduledDate
   */
  
  @Schema(name = "scheduledDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduledDate")
  public @Nullable Long getScheduledDate() {
    return scheduledDate;
  }

  public void setScheduledDate(@Nullable Long scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

  public TaskResponse startDate(@Nullable Long startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public @Nullable Long getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable Long startDate) {
    this.startDate = startDate;
  }

  public TaskResponse endDate(@Nullable Long endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  
  @Schema(name = "endDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public @Nullable Long getEndDate() {
    return endDate;
  }

  public void setEndDate(@Nullable Long endDate) {
    this.endDate = endDate;
  }

  public TaskResponse owner(@Nullable AccountShortResponse owner) {
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
  public @Nullable AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(@Nullable AccountShortResponse owner) {
    this.owner = owner;
  }

  public TaskResponse billableEntity(@Nullable BillableEntityShortResponse billableEntity) {
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
  public @Nullable BillableEntityShortResponse getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(@Nullable BillableEntityShortResponse billableEntity) {
    this.billableEntity = billableEntity;
  }

  public TaskResponse contentId(@Nullable Long contentId) {
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

  public TaskResponse contentName(@Nullable String contentName) {
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

  public TaskResponse contentType(@Nullable String contentType) {
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

  public TaskResponse parentId(@Nullable Long parentId) {
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

  public TaskResponse parentType(@Nullable String parentType) {
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

  public TaskResponse application(@Nullable ApplicationMiniResponse application) {
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
  public @Nullable ApplicationMiniResponse getApplication() {
    return application;
  }

  public void setApplication(@Nullable ApplicationMiniResponse application) {
    this.application = application;
  }

  public TaskResponse targetId(@Nullable Long targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * Get targetId
   * @return targetId
   */
  
  @Schema(name = "targetId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetId")
  public @Nullable Long getTargetId() {
    return targetId;
  }

  public void setTargetId(@Nullable Long targetId) {
    this.targetId = targetId;
  }

  public TaskResponse targetName(@Nullable String targetName) {
    this.targetName = targetName;
    return this;
  }

  /**
   * Get targetName
   * @return targetName
   */
  
  @Schema(name = "targetName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetName")
  public @Nullable String getTargetName() {
    return targetName;
  }

  public void setTargetName(@Nullable String targetName) {
    this.targetName = targetName;
  }

  public TaskResponse targetType(@Nullable String targetType) {
    this.targetType = targetType;
    return this;
  }

  /**
   * Get targetType
   * @return targetType
   */
  
  @Schema(name = "targetType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetType")
  public @Nullable String getTargetType() {
    return targetType;
  }

  public void setTargetType(@Nullable String targetType) {
    this.targetType = targetType;
  }

  public TaskResponse targetParams(@Nullable String targetParams) {
    this.targetParams = targetParams;
    return this;
  }

  /**
   * Get targetParams
   * @return targetParams
   */
  
  @Schema(name = "targetParams", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetParams")
  public @Nullable String getTargetParams() {
    return targetParams;
  }

  public void setTargetParams(@Nullable String targetParams) {
    this.targetParams = targetParams;
  }

  public TaskResponse deliverEstimate(@Nullable Long deliverEstimate) {
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

  public TaskResponse deliverCount(@Nullable Long deliverCount) {
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

  public TaskResponse deliverTotal(@Nullable Long deliverTotal) {
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

  public TaskResponse deliverFailed(@Nullable Long deliverFailed) {
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

  public TaskResponse processingTime(@Nullable Long processingTime) {
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

  public TaskResponse sendingTime(@Nullable Long sendingTime) {
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

  public TaskResponse updated(@Nullable Long updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
   */
  
  @Schema(name = "updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated")
  public @Nullable Long getUpdated() {
    return updated;
  }

  public void setUpdated(@Nullable Long updated) {
    this.updated = updated;
  }

  public TaskResponse created(@Nullable Long created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  
  @Schema(name = "created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created")
  public @Nullable Long getCreated() {
    return created;
  }

  public void setCreated(@Nullable Long created) {
    this.created = created;
  }

  public TaskResponse cronExpression(@Nullable String cronExpression) {
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

  public TaskResponse endpointURL(@Nullable String endpointURL) {
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

  public TaskResponse payload(@Nullable String payload) {
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

  public TaskResponse conditionalInput(@Nullable String conditionalInput) {
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

  public TaskResponse connectionAccountIds(List<Long> connectionAccountIds) {
    this.connectionAccountIds = connectionAccountIds;
    return this;
  }

  public TaskResponse addConnectionAccountIdsItem(Long connectionAccountIdsItem) {
    if (this.connectionAccountIds == null) {
      this.connectionAccountIds = new ArrayList<>();
    }
    this.connectionAccountIds.add(connectionAccountIdsItem);
    return this;
  }

  /**
   * Get connectionAccountIds
   * @return connectionAccountIds
   */
  
  @Schema(name = "connectionAccountIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectionAccountIds")
  public List<Long> getConnectionAccountIds() {
    return connectionAccountIds;
  }

  public void setConnectionAccountIds(List<Long> connectionAccountIds) {
    this.connectionAccountIds = connectionAccountIds;
  }

  public TaskResponse templateType(@Nullable TemplateTypeEnum templateType) {
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

  public TaskResponse groupedTypes(List<GroupedTypesEnum> groupedTypes) {
    this.groupedTypes = groupedTypes;
    return this;
  }

  public TaskResponse addGroupedTypesItem(GroupedTypesEnum groupedTypesItem) {
    if (this.groupedTypes == null) {
      this.groupedTypes = new ArrayList<>();
    }
    this.groupedTypes.add(groupedTypesItem);
    return this;
  }

  /**
   * Get groupedTypes
   * @return groupedTypes
   */
  
  @Schema(name = "groupedTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupedTypes")
  public List<GroupedTypesEnum> getGroupedTypes() {
    return groupedTypes;
  }

  public void setGroupedTypes(List<GroupedTypesEnum> groupedTypes) {
    this.groupedTypes = groupedTypes;
  }

  public TaskResponse taskId(@Nullable Long taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Get taskId
   * @return taskId
   */
  
  @Schema(name = "taskId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskId")
  public @Nullable Long getTaskId() {
    return taskId;
  }

  public void setTaskId(@Nullable Long taskId) {
    this.taskId = taskId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskResponse taskResponse = (TaskResponse) o;
    return Objects.equals(this.scheduledNotificationId, taskResponse.scheduledNotificationId) &&
        Objects.equals(this.active, taskResponse.active) &&
        Objects.equals(this.status, taskResponse.status) &&
        Objects.equals(this.type, taskResponse.type) &&
        Objects.equals(this.name, taskResponse.name) &&
        Objects.equals(this.message, taskResponse.message) &&
        Objects.equals(this.groupingId, taskResponse.groupingId) &&
        Objects.equals(this.scheduledDate, taskResponse.scheduledDate) &&
        Objects.equals(this.startDate, taskResponse.startDate) &&
        Objects.equals(this.endDate, taskResponse.endDate) &&
        Objects.equals(this.owner, taskResponse.owner) &&
        Objects.equals(this.billableEntity, taskResponse.billableEntity) &&
        Objects.equals(this.contentId, taskResponse.contentId) &&
        Objects.equals(this.contentName, taskResponse.contentName) &&
        Objects.equals(this.contentType, taskResponse.contentType) &&
        Objects.equals(this.parentId, taskResponse.parentId) &&
        Objects.equals(this.parentType, taskResponse.parentType) &&
        Objects.equals(this.application, taskResponse.application) &&
        Objects.equals(this.targetId, taskResponse.targetId) &&
        Objects.equals(this.targetName, taskResponse.targetName) &&
        Objects.equals(this.targetType, taskResponse.targetType) &&
        Objects.equals(this.targetParams, taskResponse.targetParams) &&
        Objects.equals(this.deliverEstimate, taskResponse.deliverEstimate) &&
        Objects.equals(this.deliverCount, taskResponse.deliverCount) &&
        Objects.equals(this.deliverTotal, taskResponse.deliverTotal) &&
        Objects.equals(this.deliverFailed, taskResponse.deliverFailed) &&
        Objects.equals(this.processingTime, taskResponse.processingTime) &&
        Objects.equals(this.sendingTime, taskResponse.sendingTime) &&
        Objects.equals(this.updated, taskResponse.updated) &&
        Objects.equals(this.created, taskResponse.created) &&
        Objects.equals(this.cronExpression, taskResponse.cronExpression) &&
        Objects.equals(this.endpointURL, taskResponse.endpointURL) &&
        Objects.equals(this.payload, taskResponse.payload) &&
        Objects.equals(this.conditionalInput, taskResponse.conditionalInput) &&
        Objects.equals(this.connectionAccountIds, taskResponse.connectionAccountIds) &&
        Objects.equals(this.templateType, taskResponse.templateType) &&
        Objects.equals(this.groupedTypes, taskResponse.groupedTypes) &&
        Objects.equals(this.taskId, taskResponse.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduledNotificationId, active, status, type, name, message, groupingId, scheduledDate, startDate, endDate, owner, billableEntity, contentId, contentName, contentType, parentId, parentType, application, targetId, targetName, targetType, targetParams, deliverEstimate, deliverCount, deliverTotal, deliverFailed, processingTime, sendingTime, updated, created, cronExpression, endpointURL, payload, conditionalInput, connectionAccountIds, templateType, groupedTypes, taskId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskResponse {\n");
    sb.append("    scheduledNotificationId: ").append(toIndentedString(scheduledNotificationId)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    groupingId: ").append(toIndentedString(groupingId)).append("\n");
    sb.append("    scheduledDate: ").append(toIndentedString(scheduledDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    billableEntity: ").append(toIndentedString(billableEntity)).append("\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    targetParams: ").append(toIndentedString(targetParams)).append("\n");
    sb.append("    deliverEstimate: ").append(toIndentedString(deliverEstimate)).append("\n");
    sb.append("    deliverCount: ").append(toIndentedString(deliverCount)).append("\n");
    sb.append("    deliverTotal: ").append(toIndentedString(deliverTotal)).append("\n");
    sb.append("    deliverFailed: ").append(toIndentedString(deliverFailed)).append("\n");
    sb.append("    processingTime: ").append(toIndentedString(processingTime)).append("\n");
    sb.append("    sendingTime: ").append(toIndentedString(sendingTime)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    cronExpression: ").append(toIndentedString(cronExpression)).append("\n");
    sb.append("    endpointURL: ").append(toIndentedString(endpointURL)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    conditionalInput: ").append(toIndentedString(conditionalInput)).append("\n");
    sb.append("    connectionAccountIds: ").append(toIndentedString(connectionAccountIds)).append("\n");
    sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
    sb.append("    groupedTypes: ").append(toIndentedString(groupedTypes)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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

