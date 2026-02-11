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
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ReportBatchResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private Long batchId;

  /**
   * Gets or Sets reportBatchStatus
   */
  public enum ReportBatchStatusEnum {
    NEW("NEW"),

        ERROR("ERROR"),

        COMPLETE("COMPLETE"),

        PARSE_ERROR("PARSE_ERROR"),

        PROCESSING("PROCESSING"),

        DUPLICATE("DUPLICATE"),

        SAVEONLY("SAVEONLY");
    private String value;

    ReportBatchStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ReportBatchStatusEnum reportBatchStatus;
  private String errorMessage;
  private String endpoint;
  private String pageUrl;
  private String name;
  private String description;
  private Long created;
  private Long updated;
  private String returning;

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
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }
  public void setVersion(Double version) {
    this.version = version;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }
  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }
  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("request")
  @Valid
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }
  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("batchId")
  public Long getBatchId() {
    return batchId;
  }
  public void setBatchId(Long batchId) {
    this.batchId = batchId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("reportBatchStatus")
  public ReportBatchStatusEnum getReportBatchStatus() {
    return reportBatchStatus;
  }
  public void setReportBatchStatus(ReportBatchStatusEnum reportBatchStatus) {
    this.reportBatchStatus = reportBatchStatus;
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
  @JsonProperty("endpoint")
  public String getEndpoint() {
    return endpoint;
  }
  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pageUrl")
  public String getPageUrl() {
    return pageUrl;
  }
  public void setPageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
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
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
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
  @JsonProperty("returning")
  public String getReturning() {
    return returning;
  }
  public void setReturning(String returning) {
    this.returning = returning;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

