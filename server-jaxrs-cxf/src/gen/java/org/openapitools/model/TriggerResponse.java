package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.ApplicationMiniResponse;
import org.openapitools.model.BillableEntityShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TriggerResponse  {
  
  @ApiModelProperty(value = "")

  private Long scheduledNotificationId;

  @ApiModelProperty(value = "")

  private Boolean active;

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

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String message;

  @ApiModelProperty(value = "")

  private String groupingId;

  @ApiModelProperty(value = "")

  private Long scheduledDate;

  @ApiModelProperty(value = "")

  private Long startDate;

  @ApiModelProperty(value = "")

  private Long endDate;

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse owner;

  @ApiModelProperty(value = "")

  @Valid

  private BillableEntityShortResponse billableEntity;

  @ApiModelProperty(value = "")

  private Long contentId;

  @ApiModelProperty(value = "")

  private String contentName;

  @ApiModelProperty(value = "")

  private String contentType;

  @ApiModelProperty(value = "")

  private Long parentId;

  @ApiModelProperty(value = "")

  private String parentType;

  @ApiModelProperty(value = "")

  @Valid

  private ApplicationMiniResponse application;

  @ApiModelProperty(value = "")

  private Long targetId;

  @ApiModelProperty(value = "")

  private String targetName;

  @ApiModelProperty(value = "")

  private String targetType;

  @ApiModelProperty(value = "")

  private String targetParams;

  @ApiModelProperty(value = "")

  private Long deliverEstimate;

  @ApiModelProperty(value = "")

  private Long deliverCount;

  @ApiModelProperty(value = "")

  private Long deliverTotal;

  @ApiModelProperty(value = "")

  private Long deliverFailed;

  @ApiModelProperty(value = "")

  private Long processingTime;

  @ApiModelProperty(value = "")

  private Long sendingTime;

  @ApiModelProperty(value = "")

  private Long updated;

  @ApiModelProperty(value = "")

  private Long created;

  @ApiModelProperty(value = "")

  private String cronExpression;

  @ApiModelProperty(value = "")

  private String endpointURL;

  @ApiModelProperty(value = "")

  private String payload;

  @ApiModelProperty(value = "")

  private String conditionalInput;

  @ApiModelProperty(value = "")

  private List<Long> connectionAccountIds = new ArrayList<>();

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

public enum GroupedTypesEnum {

HTTP(String.valueOf("HTTP")), SAVE(String.valueOf("SAVE")), EMAIL(String.valueOf("EMAIL")), SMS(String.valueOf("SMS")), APNS(String.valueOf("APNS")), GCM(String.valueOf("GCM")), PUSH(String.valueOf("PUSH")), MOBILE_NOTIFICATION(String.valueOf("MOBILE_NOTIFICATION"));


    private String value;

    GroupedTypesEnum (String v) {
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
    public static GroupedTypesEnum fromValue(String value) {
        for (GroupedTypesEnum b : GroupedTypesEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private List<GroupedTypesEnum> groupedTypes = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long triggerId;
 /**
   * Get scheduledNotificationId
   * @return scheduledNotificationId
  **/
  @JsonProperty("scheduledNotificationId")
  public Long getScheduledNotificationId() {
    return scheduledNotificationId;
  }

  public void setScheduledNotificationId(Long scheduledNotificationId) {
    this.scheduledNotificationId = scheduledNotificationId;
  }

  public TriggerResponse scheduledNotificationId(Long scheduledNotificationId) {
    this.scheduledNotificationId = scheduledNotificationId;
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

  public TriggerResponse active(Boolean active) {
    this.active = active;
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

  public TriggerResponse status(StatusEnum status) {
    this.status = status;
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

  public TriggerResponse type(TypeEnum type) {
    this.type = type;
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

  public TriggerResponse name(String name) {
    this.name = name;
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

  public TriggerResponse message(String message) {
    this.message = message;
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

  public TriggerResponse groupingId(String groupingId) {
    this.groupingId = groupingId;
    return this;
  }

 /**
   * Get scheduledDate
   * @return scheduledDate
  **/
  @JsonProperty("scheduledDate")
  public Long getScheduledDate() {
    return scheduledDate;
  }

  public void setScheduledDate(Long scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

  public TriggerResponse scheduledDate(Long scheduledDate) {
    this.scheduledDate = scheduledDate;
    return this;
  }

 /**
   * Get startDate
   * @return startDate
  **/
  @JsonProperty("startDate")
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public TriggerResponse startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * Get endDate
   * @return endDate
  **/
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public TriggerResponse endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  public TriggerResponse owner(AccountShortResponse owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get billableEntity
   * @return billableEntity
  **/
  @JsonProperty("billableEntity")
  public BillableEntityShortResponse getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(BillableEntityShortResponse billableEntity) {
    this.billableEntity = billableEntity;
  }

  public TriggerResponse billableEntity(BillableEntityShortResponse billableEntity) {
    this.billableEntity = billableEntity;
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

  public TriggerResponse contentId(Long contentId) {
    this.contentId = contentId;
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

  public TriggerResponse contentName(String contentName) {
    this.contentName = contentName;
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

  public TriggerResponse contentType(String contentType) {
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

  public TriggerResponse parentId(Long parentId) {
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

  public TriggerResponse parentType(String parentType) {
    this.parentType = parentType;
    return this;
  }

 /**
   * Get application
   * @return application
  **/
  @JsonProperty("application")
  public ApplicationMiniResponse getApplication() {
    return application;
  }

  public void setApplication(ApplicationMiniResponse application) {
    this.application = application;
  }

  public TriggerResponse application(ApplicationMiniResponse application) {
    this.application = application;
    return this;
  }

 /**
   * Get targetId
   * @return targetId
  **/
  @JsonProperty("targetId")
  public Long getTargetId() {
    return targetId;
  }

  public void setTargetId(Long targetId) {
    this.targetId = targetId;
  }

  public TriggerResponse targetId(Long targetId) {
    this.targetId = targetId;
    return this;
  }

 /**
   * Get targetName
   * @return targetName
  **/
  @JsonProperty("targetName")
  public String getTargetName() {
    return targetName;
  }

  public void setTargetName(String targetName) {
    this.targetName = targetName;
  }

  public TriggerResponse targetName(String targetName) {
    this.targetName = targetName;
    return this;
  }

 /**
   * Get targetType
   * @return targetType
  **/
  @JsonProperty("targetType")
  public String getTargetType() {
    return targetType;
  }

  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }

  public TriggerResponse targetType(String targetType) {
    this.targetType = targetType;
    return this;
  }

 /**
   * Get targetParams
   * @return targetParams
  **/
  @JsonProperty("targetParams")
  public String getTargetParams() {
    return targetParams;
  }

  public void setTargetParams(String targetParams) {
    this.targetParams = targetParams;
  }

  public TriggerResponse targetParams(String targetParams) {
    this.targetParams = targetParams;
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

  public TriggerResponse deliverEstimate(Long deliverEstimate) {
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

  public TriggerResponse deliverCount(Long deliverCount) {
    this.deliverCount = deliverCount;
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

  public TriggerResponse deliverTotal(Long deliverTotal) {
    this.deliverTotal = deliverTotal;
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

  public TriggerResponse deliverFailed(Long deliverFailed) {
    this.deliverFailed = deliverFailed;
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

  public TriggerResponse processingTime(Long processingTime) {
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

  public TriggerResponse sendingTime(Long sendingTime) {
    this.sendingTime = sendingTime;
    return this;
  }

 /**
   * Get updated
   * @return updated
  **/
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  public TriggerResponse updated(Long updated) {
    this.updated = updated;
    return this;
  }

 /**
   * Get created
   * @return created
  **/
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public TriggerResponse created(Long created) {
    this.created = created;
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

  public TriggerResponse cronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
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

  public TriggerResponse endpointURL(String endpointURL) {
    this.endpointURL = endpointURL;
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

  public TriggerResponse payload(String payload) {
    this.payload = payload;
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

  public TriggerResponse conditionalInput(String conditionalInput) {
    this.conditionalInput = conditionalInput;
    return this;
  }

 /**
   * Get connectionAccountIds
   * @return connectionAccountIds
  **/
  @JsonProperty("connectionAccountIds")
  public List<Long> getConnectionAccountIds() {
    return connectionAccountIds;
  }

  public void setConnectionAccountIds(List<Long> connectionAccountIds) {
    this.connectionAccountIds = connectionAccountIds;
  }

  public TriggerResponse connectionAccountIds(List<Long> connectionAccountIds) {
    this.connectionAccountIds = connectionAccountIds;
    return this;
  }

  public TriggerResponse addConnectionAccountIdsItem(Long connectionAccountIdsItem) {
    this.connectionAccountIds.add(connectionAccountIdsItem);
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

  public TriggerResponse templateType(TemplateTypeEnum templateType) {
    this.templateType = templateType;
    return this;
  }

 /**
   * Get groupedTypes
   * @return groupedTypes
  **/
  @JsonProperty("groupedTypes")
  public List<GroupedTypesEnum> getGroupedTypes() {
    return groupedTypes;
  }

  public void setGroupedTypes(List<GroupedTypesEnum> groupedTypes) {
    this.groupedTypes = groupedTypes;
  }

  public TriggerResponse groupedTypes(List<GroupedTypesEnum> groupedTypes) {
    this.groupedTypes = groupedTypes;
    return this;
  }

  public TriggerResponse addGroupedTypesItem(GroupedTypesEnum groupedTypesItem) {
    this.groupedTypes.add(groupedTypesItem);
    return this;
  }

 /**
   * Get triggerId
   * @return triggerId
  **/
  @JsonProperty("triggerId")
  public Long getTriggerId() {
    return triggerId;
  }

  public void setTriggerId(Long triggerId) {
    this.triggerId = triggerId;
  }

  public TriggerResponse triggerId(Long triggerId) {
    this.triggerId = triggerId;
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
    TriggerResponse triggerResponse = (TriggerResponse) o;
    return Objects.equals(this.scheduledNotificationId, triggerResponse.scheduledNotificationId) &&
        Objects.equals(this.active, triggerResponse.active) &&
        Objects.equals(this.status, triggerResponse.status) &&
        Objects.equals(this.type, triggerResponse.type) &&
        Objects.equals(this.name, triggerResponse.name) &&
        Objects.equals(this.message, triggerResponse.message) &&
        Objects.equals(this.groupingId, triggerResponse.groupingId) &&
        Objects.equals(this.scheduledDate, triggerResponse.scheduledDate) &&
        Objects.equals(this.startDate, triggerResponse.startDate) &&
        Objects.equals(this.endDate, triggerResponse.endDate) &&
        Objects.equals(this.owner, triggerResponse.owner) &&
        Objects.equals(this.billableEntity, triggerResponse.billableEntity) &&
        Objects.equals(this.contentId, triggerResponse.contentId) &&
        Objects.equals(this.contentName, triggerResponse.contentName) &&
        Objects.equals(this.contentType, triggerResponse.contentType) &&
        Objects.equals(this.parentId, triggerResponse.parentId) &&
        Objects.equals(this.parentType, triggerResponse.parentType) &&
        Objects.equals(this.application, triggerResponse.application) &&
        Objects.equals(this.targetId, triggerResponse.targetId) &&
        Objects.equals(this.targetName, triggerResponse.targetName) &&
        Objects.equals(this.targetType, triggerResponse.targetType) &&
        Objects.equals(this.targetParams, triggerResponse.targetParams) &&
        Objects.equals(this.deliverEstimate, triggerResponse.deliverEstimate) &&
        Objects.equals(this.deliverCount, triggerResponse.deliverCount) &&
        Objects.equals(this.deliverTotal, triggerResponse.deliverTotal) &&
        Objects.equals(this.deliverFailed, triggerResponse.deliverFailed) &&
        Objects.equals(this.processingTime, triggerResponse.processingTime) &&
        Objects.equals(this.sendingTime, triggerResponse.sendingTime) &&
        Objects.equals(this.updated, triggerResponse.updated) &&
        Objects.equals(this.created, triggerResponse.created) &&
        Objects.equals(this.cronExpression, triggerResponse.cronExpression) &&
        Objects.equals(this.endpointURL, triggerResponse.endpointURL) &&
        Objects.equals(this.payload, triggerResponse.payload) &&
        Objects.equals(this.conditionalInput, triggerResponse.conditionalInput) &&
        Objects.equals(this.connectionAccountIds, triggerResponse.connectionAccountIds) &&
        Objects.equals(this.templateType, triggerResponse.templateType) &&
        Objects.equals(this.groupedTypes, triggerResponse.groupedTypes) &&
        Objects.equals(this.triggerId, triggerResponse.triggerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduledNotificationId, active, status, type, name, message, groupingId, scheduledDate, startDate, endDate, owner, billableEntity, contentId, contentName, contentType, parentId, parentType, application, targetId, targetName, targetType, targetParams, deliverEstimate, deliverCount, deliverTotal, deliverFailed, processingTime, sendingTime, updated, created, cronExpression, endpointURL, payload, conditionalInput, connectionAccountIds, templateType, groupedTypes, triggerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TriggerResponse {\n");
    
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
    sb.append("    triggerId: ").append(toIndentedString(triggerId)).append("\n");
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

