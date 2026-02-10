package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.ReportTypeResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ReportResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ReportResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  @Valid
  private List<@Valid ReportTypeResponse> columns = new ArrayList<>();

  @Valid
  private List<Map<String, Object>> rows = new ArrayList<>();

  @Valid
  private Map<String, BigDecimal> summations = new HashMap<>();

  private @Nullable Long count;

  private @Nullable String queryName;

  private @Nullable Boolean hasMore;

  private @Nullable String returning;

  public ReportResponse valid(@Nullable Boolean valid) {
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

  public ReportResponse message(@Nullable String message) {
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

  public ReportResponse version(@Nullable Double version) {
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

  public ReportResponse serializeNulls(@Nullable Boolean serializeNulls) {
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

  public ReportResponse startTimeLog(@Nullable Long startTimeLog) {
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

  public ReportResponse errorCode(@Nullable String errorCode) {
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

  public ReportResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ReportResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public ReportResponse columns(List<@Valid ReportTypeResponse> columns) {
    this.columns = columns;
    return this;
  }

  public ReportResponse addColumnsItem(ReportTypeResponse columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

  /**
   * Get columns
   * @return columns
   */
  @Valid 
  @Schema(name = "columns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("columns")
  public List<@Valid ReportTypeResponse> getColumns() {
    return columns;
  }

  public void setColumns(List<@Valid ReportTypeResponse> columns) {
    this.columns = columns;
  }

  public ReportResponse rows(List<Map<String, Object>> rows) {
    this.rows = rows;
    return this;
  }

  public ReportResponse addRowsItem(Map<String, Object> rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

  /**
   * Get rows
   * @return rows
   */
  @Valid 
  @Schema(name = "rows", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rows")
  public List<Map<String, Object>> getRows() {
    return rows;
  }

  public void setRows(List<Map<String, Object>> rows) {
    this.rows = rows;
  }

  public ReportResponse summations(Map<String, BigDecimal> summations) {
    this.summations = summations;
    return this;
  }

  public ReportResponse putSummationsItem(String key, BigDecimal summationsItem) {
    if (this.summations == null) {
      this.summations = new HashMap<>();
    }
    this.summations.put(key, summationsItem);
    return this;
  }

  /**
   * Get summations
   * @return summations
   */
  @Valid 
  @Schema(name = "summations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summations")
  public Map<String, BigDecimal> getSummations() {
    return summations;
  }

  public void setSummations(Map<String, BigDecimal> summations) {
    this.summations = summations;
  }

  public ReportResponse count(@Nullable Long count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
   */
  
  @Schema(name = "count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public @Nullable Long getCount() {
    return count;
  }

  public void setCount(@Nullable Long count) {
    this.count = count;
  }

  public ReportResponse queryName(@Nullable String queryName) {
    this.queryName = queryName;
    return this;
  }

  /**
   * Get queryName
   * @return queryName
   */
  
  @Schema(name = "queryName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queryName")
  public @Nullable String getQueryName() {
    return queryName;
  }

  public void setQueryName(@Nullable String queryName) {
    this.queryName = queryName;
  }

  public ReportResponse hasMore(@Nullable Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  /**
   * Get hasMore
   * @return hasMore
   */
  
  @Schema(name = "hasMore", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasMore")
  public @Nullable Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(@Nullable Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public ReportResponse returning(@Nullable String returning) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

