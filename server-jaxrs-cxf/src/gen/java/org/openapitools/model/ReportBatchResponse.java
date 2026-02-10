package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ReportBatchResponse  {
  
  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String message;

  @ApiModelProperty(value = "")

  private Double version;

  @ApiModelProperty(value = "")

  private Boolean serializeNulls;

  @ApiModelProperty(value = "")

  private Long startTimeLog;

  @ApiModelProperty(value = "")

  private String errorCode;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long batchId;

public enum ReportBatchStatusEnum {

NEW(String.valueOf("NEW")), ERROR(String.valueOf("ERROR")), COMPLETE(String.valueOf("COMPLETE")), PARSE_ERROR(String.valueOf("PARSE_ERROR")), PROCESSING(String.valueOf("PROCESSING")), DUPLICATE(String.valueOf("DUPLICATE")), SAVEONLY(String.valueOf("SAVEONLY"));


    private String value;

    ReportBatchStatusEnum (String v) {
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
    public static ReportBatchStatusEnum fromValue(String value) {
        for (ReportBatchStatusEnum b : ReportBatchStatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ReportBatchStatusEnum reportBatchStatus;

  @ApiModelProperty(value = "")

  private String errorMessage;

  @ApiModelProperty(value = "")

  private String endpoint;

  @ApiModelProperty(value = "")

  private String pageUrl;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private Long created;

  @ApiModelProperty(value = "")

  private Long updated;

  @ApiModelProperty(value = "")

  private String returning;
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

  public ReportBatchResponse valid(Boolean valid) {
    this.valid = valid;
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

  public ReportBatchResponse message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public ReportBatchResponse version(Double version) {
    this.version = version;
    return this;
  }

 /**
   * Get serializeNulls
   * @return serializeNulls
  **/
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public ReportBatchResponse serializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

 /**
   * Get startTimeLog
   * @return startTimeLog
  **/
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public ReportBatchResponse startTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

 /**
   * Get errorCode
   * @return errorCode
  **/
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ReportBatchResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

 /**
   * Get request
   * @return request
  **/
  @JsonProperty("request")
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public ReportBatchResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ReportBatchResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get batchId
   * @return batchId
  **/
  @JsonProperty("batchId")
  public Long getBatchId() {
    return batchId;
  }

  public void setBatchId(Long batchId) {
    this.batchId = batchId;
  }

  public ReportBatchResponse batchId(Long batchId) {
    this.batchId = batchId;
    return this;
  }

 /**
   * Get reportBatchStatus
   * @return reportBatchStatus
  **/
  @JsonProperty("reportBatchStatus")
  public String getReportBatchStatus() {
    if (reportBatchStatus == null) {
      return null;
    }
    return reportBatchStatus.value();
  }

  public void setReportBatchStatus(ReportBatchStatusEnum reportBatchStatus) {
    this.reportBatchStatus = reportBatchStatus;
  }

  public ReportBatchResponse reportBatchStatus(ReportBatchStatusEnum reportBatchStatus) {
    this.reportBatchStatus = reportBatchStatus;
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

  public ReportBatchResponse errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

 /**
   * Get endpoint
   * @return endpoint
  **/
  @JsonProperty("endpoint")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public ReportBatchResponse endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

 /**
   * Get pageUrl
   * @return pageUrl
  **/
  @JsonProperty("pageUrl")
  public String getPageUrl() {
    return pageUrl;
  }

  public void setPageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
  }

  public ReportBatchResponse pageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
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

  public ReportBatchResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ReportBatchResponse description(String description) {
    this.description = description;
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

  public ReportBatchResponse created(Long created) {
    this.created = created;
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

  public ReportBatchResponse updated(Long updated) {
    this.updated = updated;
    return this;
  }

 /**
   * Get returning
   * @return returning
  **/
  @JsonProperty("returning")
  public String getReturning() {
    return returning;
  }

  public void setReturning(String returning) {
    this.returning = returning;
  }

  public ReportBatchResponse returning(String returning) {
    this.returning = returning;
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
    ReportBatchResponse reportBatchResponse = (ReportBatchResponse) o;
    return Objects.equals(this.valid, reportBatchResponse.valid) &&
        Objects.equals(this.message, reportBatchResponse.message) &&
        Objects.equals(this.version, reportBatchResponse.version) &&
        Objects.equals(this.serializeNulls, reportBatchResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, reportBatchResponse.startTimeLog) &&
        Objects.equals(this.errorCode, reportBatchResponse.errorCode) &&
        Objects.equals(this.request, reportBatchResponse.request) &&
        Objects.equals(this.batchId, reportBatchResponse.batchId) &&
        Objects.equals(this.reportBatchStatus, reportBatchResponse.reportBatchStatus) &&
        Objects.equals(this.errorMessage, reportBatchResponse.errorMessage) &&
        Objects.equals(this.endpoint, reportBatchResponse.endpoint) &&
        Objects.equals(this.pageUrl, reportBatchResponse.pageUrl) &&
        Objects.equals(this.name, reportBatchResponse.name) &&
        Objects.equals(this.description, reportBatchResponse.description) &&
        Objects.equals(this.created, reportBatchResponse.created) &&
        Objects.equals(this.updated, reportBatchResponse.updated) &&
        Objects.equals(this.returning, reportBatchResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, batchId, reportBatchStatus, errorMessage, endpoint, pageUrl, name, description, created, updated, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportBatchResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    reportBatchStatus: ").append(toIndentedString(reportBatchStatus)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    pageUrl: ").append(toIndentedString(pageUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    returning: ").append(toIndentedString(returning)).append("\n");
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

