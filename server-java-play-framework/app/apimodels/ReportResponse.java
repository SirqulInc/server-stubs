package apimodels;

import apimodels.NameStringValueResponse;
import apimodels.ReportTypeResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ReportResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ReportResponse   {
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

  @JsonProperty("columns")
  @Valid

  private List<@Valid ReportTypeResponse> columns = null;

  @JsonProperty("rows")
  @Valid

  private List<Map<String, Object>> rows = null;

  @JsonProperty("summations")
  @Valid

  private Map<String, BigDecimal> summations = null;

  @JsonProperty("count")
  
  private Long count;

  @JsonProperty("queryName")
  
  private String queryName;

  @JsonProperty("hasMore")
  
  private Boolean hasMore;

  @JsonProperty("returning")
  
  private String returning;

  public ReportResponse valid(Boolean valid) {
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

  public ReportResponse message(String message) {
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

  public ReportResponse version(Double version) {
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

  public ReportResponse serializeNulls(Boolean serializeNulls) {
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

  public ReportResponse startTimeLog(Long startTimeLog) {
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

  public ReportResponse errorCode(String errorCode) {
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
  **/
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
  **/
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
  **/
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
  **/
  public Map<String, BigDecimal> getSummations() {
    return summations;
  }

  public void setSummations(Map<String, BigDecimal> summations) {
    this.summations = summations;
  }

  public ReportResponse count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public ReportResponse queryName(String queryName) {
    this.queryName = queryName;
    return this;
  }

   /**
   * Get queryName
   * @return queryName
  **/
  public String getQueryName() {
    return queryName;
  }

  public void setQueryName(String queryName) {
    this.queryName = queryName;
  }

  public ReportResponse hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Get hasMore
   * @return hasMore
  **/
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public ReportResponse returning(String returning) {
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
    ReportResponse reportResponse = (ReportResponse) o;
    return Objects.equals(valid, reportResponse.valid) &&
        Objects.equals(message, reportResponse.message) &&
        Objects.equals(version, reportResponse.version) &&
        Objects.equals(serializeNulls, reportResponse.serializeNulls) &&
        Objects.equals(startTimeLog, reportResponse.startTimeLog) &&
        Objects.equals(errorCode, reportResponse.errorCode) &&
        Objects.equals(request, reportResponse.request) &&
        Objects.equals(columns, reportResponse.columns) &&
        Objects.equals(rows, reportResponse.rows) &&
        Objects.equals(summations, reportResponse.summations) &&
        Objects.equals(count, reportResponse.count) &&
        Objects.equals(queryName, reportResponse.queryName) &&
        Objects.equals(hasMore, reportResponse.hasMore) &&
        Objects.equals(returning, reportResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, columns, rows, summations, count, queryName, hasMore, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

