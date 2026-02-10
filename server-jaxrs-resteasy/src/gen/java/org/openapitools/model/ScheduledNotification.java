package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ScheduledNotification   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Account owner;
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
  private String name;
  private String errorMessage;
  private String message;
  private String payload;
  private String contentName;
  private Long contentId;
  private String contentType;
  private Long parentId;
  private String parentType;
  private Application application;
  private List<@Valid ConnectionGroup> connectionGroups = new ArrayList<>();
  private Set<Long> accountIds = new LinkedHashSet<>();
  private List<@Valid Audience> audiences = new ArrayList<>();
  private ReportDefinition report;
  private String reportParams;
  private String endpointURL;
  private Date lastActionDate;
  private Date scheduledDate;
  private Date startDate;
  private Date endDate;
  private String cronExpression;
  private Long deliverEstimate;
  private Long deliverCount;
  private Long deliverFailed;
  private Long deliverTotal;
  private Long deliverStart;
  private Long deliverLimit;
  private Long processingTime;
  private Long sendingTime;
  private String groupingId;
  private String conditionalInput;
  private String conditionalCode;
  private Permissions publicPermissions;
  private List<@Valid UserPermissions> userPermissions = new ArrayList<>();

  /**
   * Gets or Sets visibility
   */
  public enum VisibilityEnum {
    PUBLIC("PUBLIC"),

        PRIVATE("PRIVATE"),

        FRIENDS("FRIENDS");
    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private VisibilityEnum visibility;

  /**
   * Gets or Sets approvalStatus
   */
  public enum ApprovalStatusEnum {
    PENDING("PENDING"),

        REJECTED("REJECTED"),

        APPROVED("APPROVED"),

        FEATURED("FEATURED");
    private String value;

    ApprovalStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ApprovalStatusEnum approvalStatus;
  private Asset contentAsset;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
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
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("owner")
  @Valid
  public Account getOwner() {
    return owner;
  }
  public void setOwner(Account owner) {
    this.owner = owner;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billableEntity")
  @Valid
  public BillableEntity getBillableEntity() {
    return billableEntity;
  }
  public void setBillableEntity(BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
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
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
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
  public Application getApplication() {
    return application;
  }
  public void setApplication(Application application) {
    this.application = application;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connectionGroups")
  @Valid
  public List<@Valid ConnectionGroup> getConnectionGroups() {
    return connectionGroups;
  }
  public void setConnectionGroups(List<@Valid ConnectionGroup> connectionGroups) {
    this.connectionGroups = connectionGroups;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accountIds")
  public Set<Long> getAccountIds() {
    return accountIds;
  }
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setAccountIds(Set<Long> accountIds) {
    this.accountIds = accountIds;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("audiences")
  @Valid
  public List<@Valid Audience> getAudiences() {
    return audiences;
  }
  public void setAudiences(List<@Valid Audience> audiences) {
    this.audiences = audiences;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("report")
  @Valid
  public ReportDefinition getReport() {
    return report;
  }
  public void setReport(ReportDefinition report) {
    this.report = report;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("reportParams")
  public String getReportParams() {
    return reportParams;
  }
  public void setReportParams(String reportParams) {
    this.reportParams = reportParams;
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
  @JsonProperty("lastActionDate")
  public Date getLastActionDate() {
    return lastActionDate;
  }
  public void setLastActionDate(Date lastActionDate) {
    this.lastActionDate = lastActionDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduledDate")
  public Date getScheduledDate() {
    return scheduledDate;
  }
  public void setScheduledDate(Date scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
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
  @JsonProperty("deliverStart")
  public Long getDeliverStart() {
    return deliverStart;
  }
  public void setDeliverStart(Long deliverStart) {
    this.deliverStart = deliverStart;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deliverLimit")
  public Long getDeliverLimit() {
    return deliverLimit;
  }
  public void setDeliverLimit(Long deliverLimit) {
    this.deliverLimit = deliverLimit;
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
  @JsonProperty("conditionalCode")
  public String getConditionalCode() {
    return conditionalCode;
  }
  public void setConditionalCode(String conditionalCode) {
    this.conditionalCode = conditionalCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("publicPermissions")
  @Valid
  public Permissions getPublicPermissions() {
    return publicPermissions;
  }
  public void setPublicPermissions(Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userPermissions")
  @Valid
  public List<@Valid UserPermissions> getUserPermissions() {
    return userPermissions;
  }
  public void setUserPermissions(List<@Valid UserPermissions> userPermissions) {
    this.userPermissions = userPermissions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("visibility")
  public VisibilityEnum getVisibility() {
    return visibility;
  }
  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("approvalStatus")
  public ApprovalStatusEnum getApprovalStatus() {
    return approvalStatus;
  }
  public void setApprovalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contentAsset")
  @Valid
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

