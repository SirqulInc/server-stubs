package org.openapitools.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.ReportTypeResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ReportResponse  {
  
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

  @Valid

  private List<@Valid ReportTypeResponse> columns = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<Map<String, Object>> rows = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private Map<String, BigDecimal> summations = new HashMap<>();

  @ApiModelProperty(value = "")

  private Long count;

  @ApiModelProperty(value = "")

  private String queryName;

  @ApiModelProperty(value = "")

  private Boolean hasMore;

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

  public ReportResponse valid(Boolean valid) {
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

  public ReportResponse message(String message) {
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

  public ReportResponse version(Double version) {
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

  public ReportResponse serializeNulls(Boolean serializeNulls) {
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

  public ReportResponse startTimeLog(Long startTimeLog) {
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

  public ReportResponse errorCode(String errorCode) {
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

  public ReportResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ReportResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get columns
   * @return columns
  **/
  @JsonProperty("columns")
  public List<@Valid ReportTypeResponse> getColumns() {
    return columns;
  }

  public void setColumns(List<@Valid ReportTypeResponse> columns) {
    this.columns = columns;
  }

  public ReportResponse columns(List<@Valid ReportTypeResponse> columns) {
    this.columns = columns;
    return this;
  }

  public ReportResponse addColumnsItem(ReportTypeResponse columnsItem) {
    this.columns.add(columnsItem);
    return this;
  }

 /**
   * Get rows
   * @return rows
  **/
  @JsonProperty("rows")
  public List<Map<String, Object>> getRows() {
    return rows;
  }

  public void setRows(List<Map<String, Object>> rows) {
    this.rows = rows;
  }

  public ReportResponse rows(List<Map<String, Object>> rows) {
    this.rows = rows;
    return this;
  }

  public ReportResponse addRowsItem(Map<String, Object> rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

 /**
   * Get summations
   * @return summations
  **/
  @JsonProperty("summations")
  public Map<String, BigDecimal> getSummations() {
    return summations;
  }

  public void setSummations(Map<String, BigDecimal> summations) {
    this.summations = summations;
  }

  public ReportResponse summations(Map<String, BigDecimal> summations) {
    this.summations = summations;
    return this;
  }

  public ReportResponse putSummationsItem(String key, BigDecimal summationsItem) {
    this.summations.put(key, summationsItem);
    return this;
  }

 /**
   * Get count
   * @return count
  **/
  @JsonProperty("count")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public ReportResponse count(Long count) {
    this.count = count;
    return this;
  }

 /**
   * Get queryName
   * @return queryName
  **/
  @JsonProperty("queryName")
  public String getQueryName() {
    return queryName;
  }

  public void setQueryName(String queryName) {
    this.queryName = queryName;
  }

  public ReportResponse queryName(String queryName) {
    this.queryName = queryName;
    return this;
  }

 /**
   * Get hasMore
   * @return hasMore
  **/
  @JsonProperty("hasMore")
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public ReportResponse hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
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

  public ReportResponse returning(String returning) {
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
    ReportResponse reportResponse = (ReportResponse) o;
    return Objects.equals(this.valid, reportResponse.valid) &&
        Objects.equals(this.message, reportResponse.message) &&
        Objects.equals(this.version, reportResponse.version) &&
        Objects.equals(this.serializeNulls, reportResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, reportResponse.startTimeLog) &&
        Objects.equals(this.errorCode, reportResponse.errorCode) &&
        Objects.equals(this.request, reportResponse.request) &&
        Objects.equals(this.columns, reportResponse.columns) &&
        Objects.equals(this.rows, reportResponse.rows) &&
        Objects.equals(this.summations, reportResponse.summations) &&
        Objects.equals(this.count, reportResponse.count) &&
        Objects.equals(this.queryName, reportResponse.queryName) &&
        Objects.equals(this.hasMore, reportResponse.hasMore) &&
        Objects.equals(this.returning, reportResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, columns, rows, summations, count, queryName, hasMore, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    summations: ").append(toIndentedString(summations)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    queryName: ").append(toIndentedString(queryName)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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

