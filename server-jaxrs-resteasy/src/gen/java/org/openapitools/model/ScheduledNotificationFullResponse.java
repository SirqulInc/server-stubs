package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.ApplicationMiniResponse;
import org.openapitools.model.BillableEntityShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ScheduledNotificationFullResponse   {
  
  private Long scheduledNotificationId;
  private Boolean active;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    NEW("NEW"),

        ERROR("ERROR"),

        COMPLETE("COMPLETE"),

        PROCESSING("PROCESSING"),

        TEMPLATE("TEMPLATE");
    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private StatusEnum status;

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
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TypeEnum type;
  private String name;
  private String message;
  private String groupingId;
  private Long scheduledDate;
  private Long startDate;
  private Long endDate;
  private AccountShortResponse owner;
  private BillableEntityShortResponse billableEntity;
  private Long contentId;
  private String contentName;
  private String contentType;
  private Long parentId;
  private String parentType;
  private ApplicationMiniResponse application;
  private Long targetId;
  private String targetName;
  private String targetType;
  private String targetParams;
  private Long deliverEstimate;
  private Long deliverCount;
  private Long deliverTotal;
  private Long deliverFailed;
  private Long processingTime;
  private Long sendingTime;
  private Long updated;
  private Long created;
  private String cronExpression;
  private String endpointURL;
  private String payload;
  private String conditionalInput;
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
    private String value;

    TemplateTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TemplateTypeEnum templateType;

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
    private String value;

    GroupedTypesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private List<GroupedTypesEnum> groupedTypes = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduledNotificationId")
  public Long getScheduledNotificationId() {
    return scheduledNotificationId;
  }
  public void setScheduledNotificationId(Long scheduledNotificationId) {
    this.scheduledNotificationId = scheduledNotificationId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("groupingId")
  public String getGroupingId() {
    return groupingId;
  }
  public void setGroupingId(String groupingId) {
    this.groupingId = groupingId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduledDate")
  public Long getScheduledDate() {
    return scheduledDate;
  }
  public void setScheduledDate(Long scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startDate")
  public Long getStartDate() {
    return startDate;
  }
  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }
  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("owner")
  @Valid
  public AccountShortResponse getOwner() {
    return owner;
  }
  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billableEntity")
  @Valid
  public BillableEntityShortResponse getBillableEntity() {
    return billableEntity;
  }
  public void setBillableEntity(BillableEntityShortResponse billableEntity) {
    this.billableEntity = billableEntity;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contentId")
  public Long getContentId() {
    return contentId;
  }
  public void setContentId(Long contentId) {
    this.contentId = contentId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contentName")
  public String getContentName() {
    return contentName;
  }
  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }
  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("parentType")
  public String getParentType() {
    return parentType;
  }
  public void setParentType(String parentType) {
    this.parentType = parentType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("application")
  @Valid
  public ApplicationMiniResponse getApplication() {
    return application;
  }
  public void setApplication(ApplicationMiniResponse application) {
    this.application = application;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("targetId")
  public Long getTargetId() {
    return targetId;
  }
  public void setTargetId(Long targetId) {
    this.targetId = targetId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("targetName")
  public String getTargetName() {
    return targetName;
  }
  public void setTargetName(String targetName) {
    this.targetName = targetName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("targetType")
  public String getTargetType() {
    return targetType;
  }
  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("targetParams")
  public String getTargetParams() {
    return targetParams;
  }
  public void setTargetParams(String targetParams) {
    this.targetParams = targetParams;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deliverEstimate")
  public Long getDeliverEstimate() {
    return deliverEstimate;
  }
  public void setDeliverEstimate(Long deliverEstimate) {
    this.deliverEstimate = deliverEstimate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deliverCount")
  public Long getDeliverCount() {
    return deliverCount;
  }
  public void setDeliverCount(Long deliverCount) {
    this.deliverCount = deliverCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deliverTotal")
  public Long getDeliverTotal() {
    return deliverTotal;
  }
  public void setDeliverTotal(Long deliverTotal) {
    this.deliverTotal = deliverTotal;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deliverFailed")
  public Long getDeliverFailed() {
    return deliverFailed;
  }
  public void setDeliverFailed(Long deliverFailed) {
    this.deliverFailed = deliverFailed;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("processingTime")
  public Long getProcessingTime() {
    return processingTime;
  }
  public void setProcessingTime(Long processingTime) {
    this.processingTime = processingTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sendingTime")
  public Long getSendingTime() {
    return sendingTime;
  }
  public void setSendingTime(Long sendingTime) {
    this.sendingTime = sendingTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }
  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }
  public void setCreated(Long created) {
    this.created = created;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cronExpression")
  public String getCronExpression() {
    return cronExpression;
  }
  public void setCronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endpointURL")
  public String getEndpointURL() {
    return endpointURL;
  }
  public void setEndpointURL(String endpointURL) {
    this.endpointURL = endpointURL;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("payload")
  public String getPayload() {
    return payload;
  }
  public void setPayload(String payload) {
    this.payload = payload;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("conditionalInput")
  public String getConditionalInput() {
    return conditionalInput;
  }
  public void setConditionalInput(String conditionalInput) {
    this.conditionalInput = conditionalInput;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connectionAccountIds")
  public List<Long> getConnectionAccountIds() {
    return connectionAccountIds;
  }
  public void setConnectionAccountIds(List<Long> connectionAccountIds) {
    this.connectionAccountIds = connectionAccountIds;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("templateType")
  public TemplateTypeEnum getTemplateType() {
    return templateType;
  }
  public void setTemplateType(TemplateTypeEnum templateType) {
    this.templateType = templateType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("groupedTypes")
  public List<GroupedTypesEnum> getGroupedTypes() {
    return groupedTypes;
  }
  public void setGroupedTypes(List<GroupedTypesEnum> groupedTypes) {
    this.groupedTypes = groupedTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduledNotificationFullResponse scheduledNotificationFullResponse = (ScheduledNotificationFullResponse) o;
    return Objects.equals(this.scheduledNotificationId, scheduledNotificationFullResponse.scheduledNotificationId) &&
        Objects.equals(this.active, scheduledNotificationFullResponse.active) &&
        Objects.equals(this.status, scheduledNotificationFullResponse.status) &&
        Objects.equals(this.type, scheduledNotificationFullResponse.type) &&
        Objects.equals(this.name, scheduledNotificationFullResponse.name) &&
        Objects.equals(this.message, scheduledNotificationFullResponse.message) &&
        Objects.equals(this.groupingId, scheduledNotificationFullResponse.groupingId) &&
        Objects.equals(this.scheduledDate, scheduledNotificationFullResponse.scheduledDate) &&
        Objects.equals(this.startDate, scheduledNotificationFullResponse.startDate) &&
        Objects.equals(this.endDate, scheduledNotificationFullResponse.endDate) &&
        Objects.equals(this.owner, scheduledNotificationFullResponse.owner) &&
        Objects.equals(this.billableEntity, scheduledNotificationFullResponse.billableEntity) &&
        Objects.equals(this.contentId, scheduledNotificationFullResponse.contentId) &&
        Objects.equals(this.contentName, scheduledNotificationFullResponse.contentName) &&
        Objects.equals(this.contentType, scheduledNotificationFullResponse.contentType) &&
        Objects.equals(this.parentId, scheduledNotificationFullResponse.parentId) &&
        Objects.equals(this.parentType, scheduledNotificationFullResponse.parentType) &&
        Objects.equals(this.application, scheduledNotificationFullResponse.application) &&
        Objects.equals(this.targetId, scheduledNotificationFullResponse.targetId) &&
        Objects.equals(this.targetName, scheduledNotificationFullResponse.targetName) &&
        Objects.equals(this.targetType, scheduledNotificationFullResponse.targetType) &&
        Objects.equals(this.targetParams, scheduledNotificationFullResponse.targetParams) &&
        Objects.equals(this.deliverEstimate, scheduledNotificationFullResponse.deliverEstimate) &&
        Objects.equals(this.deliverCount, scheduledNotificationFullResponse.deliverCount) &&
        Objects.equals(this.deliverTotal, scheduledNotificationFullResponse.deliverTotal) &&
        Objects.equals(this.deliverFailed, scheduledNotificationFullResponse.deliverFailed) &&
        Objects.equals(this.processingTime, scheduledNotificationFullResponse.processingTime) &&
        Objects.equals(this.sendingTime, scheduledNotificationFullResponse.sendingTime) &&
        Objects.equals(this.updated, scheduledNotificationFullResponse.updated) &&
        Objects.equals(this.created, scheduledNotificationFullResponse.created) &&
        Objects.equals(this.cronExpression, scheduledNotificationFullResponse.cronExpression) &&
        Objects.equals(this.endpointURL, scheduledNotificationFullResponse.endpointURL) &&
        Objects.equals(this.payload, scheduledNotificationFullResponse.payload) &&
        Objects.equals(this.conditionalInput, scheduledNotificationFullResponse.conditionalInput) &&
        Objects.equals(this.connectionAccountIds, scheduledNotificationFullResponse.connectionAccountIds) &&
        Objects.equals(this.templateType, scheduledNotificationFullResponse.templateType) &&
        Objects.equals(this.groupedTypes, scheduledNotificationFullResponse.groupedTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduledNotificationId, active, status, type, name, message, groupingId, scheduledDate, startDate, endDate, owner, billableEntity, contentId, contentName, contentType, parentId, parentType, application, targetId, targetName, targetType, targetParams, deliverEstimate, deliverCount, deliverTotal, deliverFailed, processingTime, sendingTime, updated, created, cronExpression, endpointURL, payload, conditionalInput, connectionAccountIds, templateType, groupedTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledNotificationFullResponse {\n");
    
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
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

