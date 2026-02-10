package apimodels;

import apimodels.NameStringValueResponse;
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
 * ReportRegionLegSummaryBatchResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ReportRegionLegSummaryBatchResponse   {
  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("message")
  
  private String message;

  @JsonProperty("version")
  
  private Double version;

  @JsonProperty("serializeNulls")
  
  private Boolean serializeNulls;

  @JsonProperty("startTimeLog")
  
  private Long startTimeLog;

  @JsonProperty("errorCode")
  
  private String errorCode;

  @JsonProperty("request")
  @Valid

  private List<@Valid NameStringValueResponse> request = null;

  @JsonProperty("successCount")
  
  private Long successCount;

  @JsonProperty("failureCount")
  
  private Long failureCount;

  @JsonProperty("returning")
  
  private String returning;

  public ReportRegionLegSummaryBatchResponse valid(Boolean valid) {
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

  public ReportRegionLegSummaryBatchResponse message(String message) {
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

  public ReportRegionLegSummaryBatchResponse version(Double version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public ReportRegionLegSummaryBatchResponse serializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

   /**
   * Get serializeNulls
   * @return serializeNulls
  **/
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public ReportRegionLegSummaryBatchResponse startTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

   /**
   * Get startTimeLog
   * @return startTimeLog
  **/
  public Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public ReportRegionLegSummaryBatchResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ReportRegionLegSummaryBatchResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ReportRegionLegSummaryBatchResponse addRequestItem(NameStringValueResponse requestItem) {
    if (this.request == null) {
      this.request = new ArrayList<>();
    }
    this.request.add(requestItem);
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public ReportRegionLegSummaryBatchResponse successCount(Long successCount) {
    this.successCount = successCount;
    return this;
  }

   /**
   * Get successCount
   * @return successCount
  **/
  public Long getSuccessCount() {
    return successCount;
  }

  public void setSuccessCount(Long successCount) {
    this.successCount = successCount;
  }

  public ReportRegionLegSummaryBatchResponse failureCount(Long failureCount) {
    this.failureCount = failureCount;
    return this;
  }

   /**
   * Get failureCount
   * @return failureCount
  **/
  public Long getFailureCount() {
    return failureCount;
  }

  public void setFailureCount(Long failureCount) {
    this.failureCount = failureCount;
  }

  public ReportRegionLegSummaryBatchResponse returning(String returning) {
    this.returning = returning;
    return this;
  }

   /**
   * Get returning
   * @return returning
  **/
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
    ReportRegionLegSummaryBatchResponse reportRegionLegSummaryBatchResponse = (ReportRegionLegSummaryBatchResponse) o;
    return Objects.equals(valid, reportRegionLegSummaryBatchResponse.valid) &&
        Objects.equals(message, reportRegionLegSummaryBatchResponse.message) &&
        Objects.equals(version, reportRegionLegSummaryBatchResponse.version) &&
        Objects.equals(serializeNulls, reportRegionLegSummaryBatchResponse.serializeNulls) &&
        Objects.equals(startTimeLog, reportRegionLegSummaryBatchResponse.startTimeLog) &&
        Objects.equals(errorCode, reportRegionLegSummaryBatchResponse.errorCode) &&
        Objects.equals(request, reportRegionLegSummaryBatchResponse.request) &&
        Objects.equals(successCount, reportRegionLegSummaryBatchResponse.successCount) &&
        Objects.equals(failureCount, reportRegionLegSummaryBatchResponse.failureCount) &&
        Objects.equals(returning, reportRegionLegSummaryBatchResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, successCount, failureCount, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportRegionLegSummaryBatchResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
    sb.append("    failureCount: ").append(toIndentedString(failureCount)).append("\n");
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

