package apimodels;

import apimodels.Account;
import apimodels.Application;
import apimodels.Asset;
import apimodels.Audience;
import apimodels.BillableEntity;
import apimodels.ConnectionGroup;
import apimodels.Permissions;
import apimodels.ReportDefinition;
import apimodels.UserPermissions;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ScheduledNotification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ScheduledNotification   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("owner")
  @Valid

  private Account owner;

  @JsonProperty("billableEntity")
  @Valid

  private BillableEntity billableEntity;

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

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("errorMessage")
  
  private String errorMessage;

  @JsonProperty("message")
  
  private String message;

  @JsonProperty("payload")
  
  private String payload;

  @JsonProperty("contentName")
  
  private String contentName;

  @JsonProperty("contentId")
  
  private Long contentId;

  @JsonProperty("contentType")
  
  private String contentType;

  @JsonProperty("parentId")
  
  private Long parentId;

  @JsonProperty("parentType")
  
  private String parentType;

  @JsonProperty("application")
  @Valid

  private Application application;

  @JsonProperty("connectionGroups")
  @Valid

  private List<@Valid ConnectionGroup> connectionGroups = null;

  @JsonProperty("accountIds")
  
  private Set<Long> accountIds = null;

  @JsonProperty("audiences")
  @Valid

  private List<@Valid Audience> audiences = null;

  @JsonProperty("report")
  @Valid

  private ReportDefinition report;

  @JsonProperty("reportParams")
  
  private String reportParams;

  @JsonProperty("endpointURL")
  
  private String endpointURL;

  @JsonProperty("lastActionDate")
  @Valid

  private OffsetDateTime lastActionDate;

  @JsonProperty("scheduledDate")
  @Valid

  private OffsetDateTime scheduledDate;

  @JsonProperty("startDate")
  @Valid

  private OffsetDateTime startDate;

  @JsonProperty("endDate")
  @Valid

  private OffsetDateTime endDate;

  @JsonProperty("cronExpression")
  
  private String cronExpression;

  @JsonProperty("deliverEstimate")
  
  private Long deliverEstimate;

  @JsonProperty("deliverCount")
  
  private Long deliverCount;

  @JsonProperty("deliverFailed")
  
  private Long deliverFailed;

  @JsonProperty("deliverTotal")
  
  private Long deliverTotal;

  @JsonProperty("deliverStart")
  
  private Long deliverStart;

  @JsonProperty("deliverLimit")
  
  private Long deliverLimit;

  @JsonProperty("processingTime")
  
  private Long processingTime;

  @JsonProperty("sendingTime")
  
  private Long sendingTime;

  @JsonProperty("groupingId")
  
  private String groupingId;

  @JsonProperty("conditionalInput")
  
  private String conditionalInput;

  @JsonProperty("conditionalCode")
  
  private String conditionalCode;

  @JsonProperty("publicPermissions")
  @Valid

  private Permissions publicPermissions;

  @JsonProperty("userPermissions")
  @Valid

  private List<@Valid UserPermissions> userPermissions = null;

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

  @JsonProperty("visibility")
  
  private VisibilityEnum visibility;

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

  @JsonProperty("approvalStatus")
  
  private ApprovalStatusEnum approvalStatus;

  @JsonProperty("contentAsset")
  @Valid

  private Asset contentAsset;

  public ScheduledNotification id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ScheduledNotification active(Boolean active) {
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

  public ScheduledNotification valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public ScheduledNotification owner(Account owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public ScheduledNotification billableEntity(BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
    return this;
  }

   /**
   * Get billableEntity
   * @return billableEntity
  **/
  public BillableEntity getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
  }

  public ScheduledNotification type(TypeEnum type) {
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

  public ScheduledNotification status(StatusEnum status) {
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

  public ScheduledNotification templateType(TemplateTypeEnum templateType) {
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

  public ScheduledNotification name(String name) {
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

  public ScheduledNotification errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ScheduledNotification message(String message) {
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

  public ScheduledNotification payload(String payload) {
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

  public ScheduledNotification contentName(String contentName) {
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

  public ScheduledNotification contentId(Long contentId) {
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

  public ScheduledNotification contentType(String contentType) {
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

  public ScheduledNotification parentId(Long parentId) {
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

  public ScheduledNotification parentType(String parentType) {
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

  public ScheduledNotification application(Application application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
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
  **/
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
  **/
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
  **/
  public List<@Valid Audience> getAudiences() {
    return audiences;
  }

  public void setAudiences(List<@Valid Audience> audiences) {
    this.audiences = audiences;
  }

  public ScheduledNotification report(ReportDefinition report) {
    this.report = report;
    return this;
  }

   /**
   * Get report
   * @return report
  **/
  public ReportDefinition getReport() {
    return report;
  }

  public void setReport(ReportDefinition report) {
    this.report = report;
  }

  public ScheduledNotification reportParams(String reportParams) {
    this.reportParams = reportParams;
    return this;
  }

   /**
   * Get reportParams
   * @return reportParams
  **/
  public String getReportParams() {
    return reportParams;
  }

  public void setReportParams(String reportParams) {
    this.reportParams = reportParams;
  }

  public ScheduledNotification endpointURL(String endpointURL) {
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

  public ScheduledNotification lastActionDate(OffsetDateTime lastActionDate) {
    this.lastActionDate = lastActionDate;
    return this;
  }

   /**
   * Get lastActionDate
   * @return lastActionDate
  **/
  public OffsetDateTime getLastActionDate() {
    return lastActionDate;
  }

  public void setLastActionDate(OffsetDateTime lastActionDate) {
    this.lastActionDate = lastActionDate;
  }

  public ScheduledNotification scheduledDate(OffsetDateTime scheduledDate) {
    this.scheduledDate = scheduledDate;
    return this;
  }

   /**
   * Get scheduledDate
   * @return scheduledDate
  **/
  public OffsetDateTime getScheduledDate() {
    return scheduledDate;
  }

  public void setScheduledDate(OffsetDateTime scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

  public ScheduledNotification startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public ScheduledNotification endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public ScheduledNotification cronExpression(String cronExpression) {
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

  public ScheduledNotification deliverEstimate(Long deliverEstimate) {
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

  public ScheduledNotification deliverCount(Long deliverCount) {
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

  public ScheduledNotification deliverFailed(Long deliverFailed) {
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

  public ScheduledNotification deliverTotal(Long deliverTotal) {
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

  public ScheduledNotification deliverStart(Long deliverStart) {
    this.deliverStart = deliverStart;
    return this;
  }

   /**
   * Get deliverStart
   * @return deliverStart
  **/
  public Long getDeliverStart() {
    return deliverStart;
  }

  public void setDeliverStart(Long deliverStart) {
    this.deliverStart = deliverStart;
  }

  public ScheduledNotification deliverLimit(Long deliverLimit) {
    this.deliverLimit = deliverLimit;
    return this;
  }

   /**
   * Get deliverLimit
   * @return deliverLimit
  **/
  public Long getDeliverLimit() {
    return deliverLimit;
  }

  public void setDeliverLimit(Long deliverLimit) {
    this.deliverLimit = deliverLimit;
  }

  public ScheduledNotification processingTime(Long processingTime) {
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

  public ScheduledNotification sendingTime(Long sendingTime) {
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

  public ScheduledNotification groupingId(String groupingId) {
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

  public ScheduledNotification conditionalInput(String conditionalInput) {
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

  public ScheduledNotification conditionalCode(String conditionalCode) {
    this.conditionalCode = conditionalCode;
    return this;
  }

   /**
   * Get conditionalCode
   * @return conditionalCode
  **/
  public String getConditionalCode() {
    return conditionalCode;
  }

  public void setConditionalCode(String conditionalCode) {
    this.conditionalCode = conditionalCode;
  }

  public ScheduledNotification publicPermissions(Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
    return this;
  }

   /**
   * Get publicPermissions
   * @return publicPermissions
  **/
  public Permissions getPublicPermissions() {
    return publicPermissions;
  }

  public void setPublicPermissions(Permissions publicPermissions) {
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
  **/
  public List<@Valid UserPermissions> getUserPermissions() {
    return userPermissions;
  }

  public void setUserPermissions(List<@Valid UserPermissions> userPermissions) {
    this.userPermissions = userPermissions;
  }

  public ScheduledNotification visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public ScheduledNotification approvalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

   /**
   * Get approvalStatus
   * @return approvalStatus
  **/
  public ApprovalStatusEnum getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public ScheduledNotification contentAsset(Asset contentAsset) {
    this.contentAsset = contentAsset;
    return this;
  }

   /**
   * Get contentAsset
   * @return contentAsset
  **/
  public Asset getContentAsset() {
    return contentAsset;
  }

  public void setContentAsset(Asset contentAsset) {
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
    return Objects.equals(id, scheduledNotification.id) &&
        Objects.equals(active, scheduledNotification.active) &&
        Objects.equals(valid, scheduledNotification.valid) &&
        Objects.equals(owner, scheduledNotification.owner) &&
        Objects.equals(billableEntity, scheduledNotification.billableEntity) &&
        Objects.equals(type, scheduledNotification.type) &&
        Objects.equals(status, scheduledNotification.status) &&
        Objects.equals(templateType, scheduledNotification.templateType) &&
        Objects.equals(name, scheduledNotification.name) &&
        Objects.equals(errorMessage, scheduledNotification.errorMessage) &&
        Objects.equals(message, scheduledNotification.message) &&
        Objects.equals(payload, scheduledNotification.payload) &&
        Objects.equals(contentName, scheduledNotification.contentName) &&
        Objects.equals(contentId, scheduledNotification.contentId) &&
        Objects.equals(contentType, scheduledNotification.contentType) &&
        Objects.equals(parentId, scheduledNotification.parentId) &&
        Objects.equals(parentType, scheduledNotification.parentType) &&
        Objects.equals(application, scheduledNotification.application) &&
        Objects.equals(connectionGroups, scheduledNotification.connectionGroups) &&
        Objects.equals(accountIds, scheduledNotification.accountIds) &&
        Objects.equals(audiences, scheduledNotification.audiences) &&
        Objects.equals(report, scheduledNotification.report) &&
        Objects.equals(reportParams, scheduledNotification.reportParams) &&
        Objects.equals(endpointURL, scheduledNotification.endpointURL) &&
        Objects.equals(lastActionDate, scheduledNotification.lastActionDate) &&
        Objects.equals(scheduledDate, scheduledNotification.scheduledDate) &&
        Objects.equals(startDate, scheduledNotification.startDate) &&
        Objects.equals(endDate, scheduledNotification.endDate) &&
        Objects.equals(cronExpression, scheduledNotification.cronExpression) &&
        Objects.equals(deliverEstimate, scheduledNotification.deliverEstimate) &&
        Objects.equals(deliverCount, scheduledNotification.deliverCount) &&
        Objects.equals(deliverFailed, scheduledNotification.deliverFailed) &&
        Objects.equals(deliverTotal, scheduledNotification.deliverTotal) &&
        Objects.equals(deliverStart, scheduledNotification.deliverStart) &&
        Objects.equals(deliverLimit, scheduledNotification.deliverLimit) &&
        Objects.equals(processingTime, scheduledNotification.processingTime) &&
        Objects.equals(sendingTime, scheduledNotification.sendingTime) &&
        Objects.equals(groupingId, scheduledNotification.groupingId) &&
        Objects.equals(conditionalInput, scheduledNotification.conditionalInput) &&
        Objects.equals(conditionalCode, scheduledNotification.conditionalCode) &&
        Objects.equals(publicPermissions, scheduledNotification.publicPermissions) &&
        Objects.equals(userPermissions, scheduledNotification.userPermissions) &&
        Objects.equals(visibility, scheduledNotification.visibility) &&
        Objects.equals(approvalStatus, scheduledNotification.approvalStatus) &&
        Objects.equals(contentAsset, scheduledNotification.contentAsset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, owner, billableEntity, type, status, templateType, name, errorMessage, message, payload, contentName, contentId, contentType, parentId, parentType, application, connectionGroups, accountIds, audiences, report, reportParams, endpointURL, lastActionDate, scheduledDate, startDate, endDate, cronExpression, deliverEstimate, deliverCount, deliverFailed, deliverTotal, deliverStart, deliverLimit, processingTime, sendingTime, groupingId, conditionalInput, conditionalCode, publicPermissions, userPermissions, visibility, approvalStatus, contentAsset);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

