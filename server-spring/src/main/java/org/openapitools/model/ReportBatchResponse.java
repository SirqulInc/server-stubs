package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NameStringValueResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ReportBatchResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ReportBatchResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  private @Nullable Long batchId;

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

    private final String value;

    ReportBatchStatusEnum(String value) {
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
    public static ReportBatchStatusEnum fromValue(String value) {
      for (ReportBatchStatusEnum b : ReportBatchStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ReportBatchStatusEnum reportBatchStatus;

  private @Nullable String errorMessage;

  private @Nullable String endpoint;

  private @Nullable String pageUrl;

  private @Nullable String name;

  private @Nullable String description;

  private @Nullable Long created;

  private @Nullable Long updated;

  private @Nullable String returning;

  public ReportBatchResponse valid(@Nullable Boolean valid) {
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

  public ReportBatchResponse message(@Nullable String message) {
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

  public ReportBatchResponse version(@Nullable Double version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public @Nullable Double getVersion() {
    return version;
  }

  public void setVersion(@Nullable Double version) {
    this.version = version;
  }

  public ReportBatchResponse serializeNulls(@Nullable Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

  /**
   * Get serializeNulls
   * @return serializeNulls
   */
  
  @Schema(name = "serializeNulls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serializeNulls")
  public @Nullable Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(@Nullable Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public ReportBatchResponse startTimeLog(@Nullable Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

  /**
   * Get startTimeLog
   * @return startTimeLog
   */
  
  @Schema(name = "startTimeLog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTimeLog")
  public @Nullable Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(@Nullable Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public ReportBatchResponse errorCode(@Nullable String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
   */
  
  @Schema(name = "errorCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCode")
  public @Nullable String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(@Nullable String errorCode) {
    this.errorCode = errorCode;
  }

  public ReportBatchResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ReportBatchResponse addRequestItem(NameStringValueResponse requestItem) {
    if (this.request == null) {
      this.request = new ArrayList<>();
    }
    this.request.add(requestItem);
    return this;
  }

  /**
   * Get request
   * @return request
   */
  @Valid 
  @Schema(name = "request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("request")
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public ReportBatchResponse batchId(@Nullable Long batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * Get batchId
   * @return batchId
   */
  
  @Schema(name = "batchId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("batchId")
  public @Nullable Long getBatchId() {
    return batchId;
  }

  public void setBatchId(@Nullable Long batchId) {
    this.batchId = batchId;
  }

  public ReportBatchResponse reportBatchStatus(@Nullable ReportBatchStatusEnum reportBatchStatus) {
    this.reportBatchStatus = reportBatchStatus;
    return this;
  }

  /**
   * Get reportBatchStatus
   * @return reportBatchStatus
   */
  
  @Schema(name = "reportBatchStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reportBatchStatus")
  public @Nullable ReportBatchStatusEnum getReportBatchStatus() {
    return reportBatchStatus;
  }

  public void setReportBatchStatus(@Nullable ReportBatchStatusEnum reportBatchStatus) {
    this.reportBatchStatus = reportBatchStatus;
  }

  public ReportBatchResponse errorMessage(@Nullable String errorMessage) {
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

  public ReportBatchResponse endpoint(@Nullable String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Get endpoint
   * @return endpoint
   */
  
  @Schema(name = "endpoint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endpoint")
  public @Nullable String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(@Nullable String endpoint) {
    this.endpoint = endpoint;
  }

  public ReportBatchResponse pageUrl(@Nullable String pageUrl) {
    this.pageUrl = pageUrl;
    return this;
  }

  /**
   * Get pageUrl
   * @return pageUrl
   */
  
  @Schema(name = "pageUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pageUrl")
  public @Nullable String getPageUrl() {
    return pageUrl;
  }

  public void setPageUrl(@Nullable String pageUrl) {
    this.pageUrl = pageUrl;
  }

  public ReportBatchResponse name(@Nullable String name) {
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

  public ReportBatchResponse description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public ReportBatchResponse created(@Nullable Long created) {
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

  public ReportBatchResponse updated(@Nullable Long updated) {
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

  public ReportBatchResponse returning(@Nullable String returning) {
    this.returning = returning;
    return this;
  }

  /**
   * Get returning
   * @return returning
   */
  
  @Schema(name = "returning", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returning")
  public @Nullable String getReturning() {
    return returning;
  }

  public void setReturning(@Nullable String returning) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

