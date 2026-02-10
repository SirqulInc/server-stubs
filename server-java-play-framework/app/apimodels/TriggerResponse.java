package apimodels;

import apimodels.AccountShortResponse;
import apimodels.ApplicationMiniResponse;
import apimodels.BillableEntityShortResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TriggerResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TriggerResponse   {
  @JsonProperty("scheduledNotificationId")
  
  private Long scheduledNotificationId;

  @JsonProperty("active")
  
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

    private final String value;

    StatusEnum(String value) {
      this.value = value;
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

  @JsonProperty("status")
  
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

    private final String value;

    TypeEnum(String value) {
      this.value = value;
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

  @JsonProperty("type")
  
  private TypeEnum type;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("message")
  
  private String message;

  @JsonProperty("groupingId")
  
  private String groupingId;

  @JsonProperty("scheduledDate")
  
  private Long scheduledDate;

  @JsonProperty("startDate")
  
  private Long startDate;

  @JsonProperty("endDate")
  
  private Long endDate;

  @JsonProperty("owner")
  @Valid

  private AccountShortResponse owner;

  @JsonProperty("billableEntity")
  @Valid

  private BillableEntityShortResponse billableEntity;

  @JsonProperty("contentId")
  
  private Long contentId;

  @JsonProperty("contentName")
  
  private String contentName;

  @JsonProperty("contentType")
  
  private String contentType;

  @JsonProperty("parentId")
  
  private Long parentId;

  @JsonProperty("parentType")
  
  private String parentType;

  @JsonProperty("application")
  @Valid

  private ApplicationMiniResponse application;

  @JsonProperty("targetId")
  
  private Long targetId;

  @JsonProperty("targetName")
  
  private String targetName;

  @JsonProperty("targetType")
  
  private String targetType;

  @JsonProperty("targetParams")
  
  private String targetParams;

  @JsonProperty("deliverEstimate")
  
  private Long deliverEstimate;

  @JsonProperty("deliverCount")
  
  private Long deliverCount;

  @JsonProperty("deliverTotal")
  
  private Long deliverTotal;

  @JsonProperty("deliverFailed")
  
  private Long deliverFailed;

  @JsonProperty("processingTime")
  
  private Long processingTime;

  @JsonProperty("sendingTime")
  
  private Long sendingTime;

  @JsonProperty("updated")
  
  private Long updated;

  @JsonProperty("created")
  
  private Long created;

  @JsonProperty("cronExpression")
  
  private String cronExpression;

  @JsonProperty("endpointURL")
  
  private String endpointURL;

  @JsonProperty("payload")
  
  private String payload;

  @JsonProperty("conditionalInput")
  
  private String conditionalInput;

  @JsonProperty("connectionAccountIds")
  
  private List<Long> connectionAccountIds = null;

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

  @JsonProperty("templateType")
  
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

    private final String value;

    GroupedTypesEnum(String value) {
      this.value = value;
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

  @JsonProperty("groupedTypes")
  
  private List<GroupedTypesEnum> groupedTypes = null;

  @JsonProperty("triggerId")
  
  private Long triggerId;

  public TriggerResponse scheduledNotificationId(Long scheduledNotificationId) {
    this.scheduledNotificationId = scheduledNotificationId;
    return this;
  }

   /**
   * Get scheduledNotificationId
   * @return scheduledNotificationId
  **/
  public Long getScheduledNotificationId() {
    return scheduledNotificationId;
  }

  public void setScheduledNotificationId(Long scheduledNotificationId) {
    this.scheduledNotificationId = scheduledNotificationId;
  }

  public TriggerResponse active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public TriggerResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public TriggerResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public TriggerResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TriggerResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public TriggerResponse groupingId(String groupingId) {
    this.groupingId = groupingId;
    return this;
  }

   /**
   * Get groupingId
   * @return groupingId
  **/
  public String getGroupingId() {
    return groupingId;
  }

  public void setGroupingId(String groupingId) {
    this.groupingId = groupingId;
  }

  public TriggerResponse scheduledDate(Long scheduledDate) {
    this.scheduledDate = scheduledDate;
    return this;
  }

   /**
   * Get scheduledDate
   * @return scheduledDate
  **/
  public Long getScheduledDate() {
    return scheduledDate;
  }

  public void setScheduledDate(Long scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

  public TriggerResponse startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public TriggerResponse endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public TriggerResponse owner(AccountShortResponse owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  public AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  public TriggerResponse billableEntity(BillableEntityShortResponse billableEntity) {
    this.billableEntity = billableEntity;
    return this;
  }

   /**
   * Get billableEntity
   * @return billableEntity
  **/
  public BillableEntityShortResponse getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(BillableEntityShortResponse billableEntity) {
    this.billableEntity = billableEntity;
  }

  public TriggerResponse contentId(Long contentId) {
    this.contentId = contentId;
    return this;
  }

   /**
   * Get contentId
   * @return contentId
  **/
  public Long getContentId() {
    return contentId;
  }

  public void setContentId(Long contentId) {
    this.contentId = contentId;
  }

  public TriggerResponse contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

   /**
   * Get contentName
   * @return contentName
  **/
  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  public TriggerResponse contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public TriggerResponse parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public TriggerResponse parentType(String parentType) {
    this.parentType = parentType;
    return this;
  }

   /**
   * Get parentType
   * @return parentType
  **/
  public String getParentType() {
    return parentType;
  }

  public void setParentType(String parentType) {
    this.parentType = parentType;
  }

  public TriggerResponse application(ApplicationMiniResponse application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  public ApplicationMiniResponse getApplication() {
    return application;
  }

  public void setApplication(ApplicationMiniResponse application) {
    this.application = application;
  }

  public TriggerResponse targetId(Long targetId) {
    this.targetId = targetId;
    return this;
  }

   /**
   * Get targetId
   * @return targetId
  **/
  public Long getTargetId() {
    return targetId;
  }

  public void setTargetId(Long targetId) {
    this.targetId = targetId;
  }

  public TriggerResponse targetName(String targetName) {
    this.targetName = targetName;
    return this;
  }

   /**
   * Get targetName
   * @return targetName
  **/
  public String getTargetName() {
    return targetName;
  }

  public void setTargetName(String targetName) {
    this.targetName = targetName;
  }

  public TriggerResponse targetType(String targetType) {
    this.targetType = targetType;
    return this;
  }

   /**
   * Get targetType
   * @return targetType
  **/
  public String getTargetType() {
    return targetType;
  }

  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }

  public TriggerResponse targetParams(String targetParams) {
    this.targetParams = targetParams;
    return this;
  }

   /**
   * Get targetParams
   * @return targetParams
  **/
  public String getTargetParams() {
    return targetParams;
  }

  public void setTargetParams(String targetParams) {
    this.targetParams = targetParams;
  }

  public TriggerResponse deliverEstimate(Long deliverEstimate) {
    this.deliverEstimate = deliverEstimate;
    return this;
  }

   /**
   * Get deliverEstimate
   * @return deliverEstimate
  **/
  public Long getDeliverEstimate() {
    return deliverEstimate;
  }

  public void setDeliverEstimate(Long deliverEstimate) {
    this.deliverEstimate = deliverEstimate;
  }

  public TriggerResponse deliverCount(Long deliverCount) {
    this.deliverCount = deliverCount;
    return this;
  }

   /**
   * Get deliverCount
   * @return deliverCount
  **/
  public Long getDeliverCount() {
    return deliverCount;
  }

  public void setDeliverCount(Long deliverCount) {
    this.deliverCount = deliverCount;
  }

  public TriggerResponse deliverTotal(Long deliverTotal) {
    this.deliverTotal = deliverTotal;
    return this;
  }

   /**
   * Get deliverTotal
   * @return deliverTotal
  **/
  public Long getDeliverTotal() {
    return deliverTotal;
  }

  public void setDeliverTotal(Long deliverTotal) {
    this.deliverTotal = deliverTotal;
  }

  public TriggerResponse deliverFailed(Long deliverFailed) {
    this.deliverFailed = deliverFailed;
    return this;
  }

   /**
   * Get deliverFailed
   * @return deliverFailed
  **/
  public Long getDeliverFailed() {
    return deliverFailed;
  }

  public void setDeliverFailed(Long deliverFailed) {
    this.deliverFailed = deliverFailed;
  }

  public TriggerResponse processingTime(Long processingTime) {
    this.processingTime = processingTime;
    return this;
  }

   /**
   * Get processingTime
   * @return processingTime
  **/
  public Long getProcessingTime() {
    return processingTime;
  }

  public void setProcessingTime(Long processingTime) {
    this.processingTime = processingTime;
  }

  public TriggerResponse sendingTime(Long sendingTime) {
    this.sendingTime = sendingTime;
    return this;
  }

   /**
   * Get sendingTime
   * @return sendingTime
  **/
  public Long getSendingTime() {
    return sendingTime;
  }

  public void setSendingTime(Long sendingTime) {
    this.sendingTime = sendingTime;
  }

  public TriggerResponse updated(Long updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  public TriggerResponse created(Long created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public TriggerResponse cronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
    return this;
  }

   /**
   * Get cronExpression
   * @return cronExpression
  **/
  public String getCronExpression() {
    return cronExpression;
  }

  public void setCronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
  }

  public TriggerResponse endpointURL(String endpointURL) {
    this.endpointURL = endpointURL;
    return this;
  }

   /**
   * Get endpointURL
   * @return endpointURL
  **/
  public String getEndpointURL() {
    return endpointURL;
  }

  public void setEndpointURL(String endpointURL) {
    this.endpointURL = endpointURL;
  }

  public TriggerResponse payload(String payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public TriggerResponse conditionalInput(String conditionalInput) {
    this.conditionalInput = conditionalInput;
    return this;
  }

   /**
   * Get conditionalInput
   * @return conditionalInput
  **/
  public String getConditionalInput() {
    return conditionalInput;
  }

  public void setConditionalInput(String conditionalInput) {
    this.conditionalInput = conditionalInput;
  }

  public TriggerResponse connectionAccountIds(List<Long> connectionAccountIds) {
    this.connectionAccountIds = connectionAccountIds;
    return this;
  }

  public TriggerResponse addConnectionAccountIdsItem(Long connectionAccountIdsItem) {
    if (this.connectionAccountIds == null) {
      this.connectionAccountIds = new ArrayList<>();
    }
    this.connectionAccountIds.add(connectionAccountIdsItem);
    return this;
  }

   /**
   * Get connectionAccountIds
   * @return connectionAccountIds
  **/
  public List<Long> getConnectionAccountIds() {
    return connectionAccountIds;
  }

  public void setConnectionAccountIds(List<Long> connectionAccountIds) {
    this.connectionAccountIds = connectionAccountIds;
  }

  public TriggerResponse templateType(TemplateTypeEnum templateType) {
    this.templateType = templateType;
    return this;
  }

   /**
   * Get templateType
   * @return templateType
  **/
  public TemplateTypeEnum getTemplateType() {
    return templateType;
  }

  public void setTemplateType(TemplateTypeEnum templateType) {
    this.templateType = templateType;
  }

  public TriggerResponse groupedTypes(List<GroupedTypesEnum> groupedTypes) {
    this.groupedTypes = groupedTypes;
    return this;
  }

  public TriggerResponse addGroupedTypesItem(GroupedTypesEnum groupedTypesItem) {
    if (this.groupedTypes == null) {
      this.groupedTypes = new ArrayList<>();
    }
    this.groupedTypes.add(groupedTypesItem);
    return this;
  }

   /**
   * Get groupedTypes
   * @return groupedTypes
  **/
  public List<GroupedTypesEnum> getGroupedTypes() {
    return groupedTypes;
  }

  public void setGroupedTypes(List<GroupedTypesEnum> groupedTypes) {
    this.groupedTypes = groupedTypes;
  }

  public TriggerResponse triggerId(Long triggerId) {
    this.triggerId = triggerId;
    return this;
  }

   /**
   * Get triggerId
   * @return triggerId
  **/
  public Long getTriggerId() {
    return triggerId;
  }

  public void setTriggerId(Long triggerId) {
    this.triggerId = triggerId;
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
    return Objects.equals(scheduledNotificationId, triggerResponse.scheduledNotificationId) &&
        Objects.equals(active, triggerResponse.active) &&
        Objects.equals(status, triggerResponse.status) &&
        Objects.equals(type, triggerResponse.type) &&
        Objects.equals(name, triggerResponse.name) &&
        Objects.equals(message, triggerResponse.message) &&
        Objects.equals(groupingId, triggerResponse.groupingId) &&
        Objects.equals(scheduledDate, triggerResponse.scheduledDate) &&
        Objects.equals(startDate, triggerResponse.startDate) &&
        Objects.equals(endDate, triggerResponse.endDate) &&
        Objects.equals(owner, triggerResponse.owner) &&
        Objects.equals(billableEntity, triggerResponse.billableEntity) &&
        Objects.equals(contentId, triggerResponse.contentId) &&
        Objects.equals(contentName, triggerResponse.contentName) &&
        Objects.equals(contentType, triggerResponse.contentType) &&
        Objects.equals(parentId, triggerResponse.parentId) &&
        Objects.equals(parentType, triggerResponse.parentType) &&
        Objects.equals(application, triggerResponse.application) &&
        Objects.equals(targetId, triggerResponse.targetId) &&
        Objects.equals(targetName, triggerResponse.targetName) &&
        Objects.equals(targetType, triggerResponse.targetType) &&
        Objects.equals(targetParams, triggerResponse.targetParams) &&
        Objects.equals(deliverEstimate, triggerResponse.deliverEstimate) &&
        Objects.equals(deliverCount, triggerResponse.deliverCount) &&
        Objects.equals(deliverTotal, triggerResponse.deliverTotal) &&
        Objects.equals(deliverFailed, triggerResponse.deliverFailed) &&
        Objects.equals(processingTime, triggerResponse.processingTime) &&
        Objects.equals(sendingTime, triggerResponse.sendingTime) &&
        Objects.equals(updated, triggerResponse.updated) &&
        Objects.equals(created, triggerResponse.created) &&
        Objects.equals(cronExpression, triggerResponse.cronExpression) &&
        Objects.equals(endpointURL, triggerResponse.endpointURL) &&
        Objects.equals(payload, triggerResponse.payload) &&
        Objects.equals(conditionalInput, triggerResponse.conditionalInput) &&
        Objects.equals(connectionAccountIds, triggerResponse.connectionAccountIds) &&
        Objects.equals(templateType, triggerResponse.templateType) &&
        Objects.equals(groupedTypes, triggerResponse.groupedTypes) &&
        Objects.equals(triggerId, triggerResponse.triggerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduledNotificationId, active, status, type, name, message, groupingId, scheduledDate, startDate, endDate, owner, billableEntity, contentId, contentName, contentType, parentId, parentType, application, targetId, targetName, targetType, targetParams, deliverEstimate, deliverCount, deliverTotal, deliverFailed, processingTime, sendingTime, updated, created, cronExpression, endpointURL, payload, conditionalInput, connectionAccountIds, templateType, groupedTypes, triggerId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

