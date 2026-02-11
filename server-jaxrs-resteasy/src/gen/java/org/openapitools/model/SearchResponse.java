package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
public class SearchResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private List<Object> items = new ArrayList<>();
  private Integer count;
  private Boolean hasMoreResults;
  private Long countTotal;
  private Long start;
  private Long limit;
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
  @JsonProperty("items")
  public List<Object> getItems() {
    return items;
  }
  public void setItems(List<Object> items) {
    this.items = items;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hasMoreResults")
  public Boolean getHasMoreResults() {
    return hasMoreResults;
  }
  public void setHasMoreResults(Boolean hasMoreResults) {
    this.hasMoreResults = hasMoreResults;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("countTotal")
  public Long getCountTotal() {
    return countTotal;
  }
  public void setCountTotal(Long countTotal) {
    this.countTotal = countTotal;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("start")
  public Long getStart() {
    return start;
  }
  public void setStart(Long start) {
    this.start = start;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("limit")
  public Long getLimit() {
    return limit;
  }
  public void setLimit(Long limit) {
    this.limit = limit;
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
    SearchResponse searchResponse = (SearchResponse) o;
    return Objects.equals(this.valid, searchResponse.valid) &&
        Objects.equals(this.message, searchResponse.message) &&
        Objects.equals(this.version, searchResponse.version) &&
        Objects.equals(this.serializeNulls, searchResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, searchResponse.startTimeLog) &&
        Objects.equals(this.errorCode, searchResponse.errorCode) &&
        Objects.equals(this.request, searchResponse.request) &&
        Objects.equals(this.items, searchResponse.items) &&
        Objects.equals(this.count, searchResponse.count) &&
        Objects.equals(this.hasMoreResults, searchResponse.hasMoreResults) &&
        Objects.equals(this.countTotal, searchResponse.countTotal) &&
        Objects.equals(this.start, searchResponse.start) &&
        Objects.equals(this.limit, searchResponse.limit) &&
        Objects.equals(this.returning, searchResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, items, count, hasMoreResults, countTotal, start, limit, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    hasMoreResults: ").append(toIndentedString(hasMoreResults)).append("\n");
    sb.append("    countTotal: ").append(toIndentedString(countTotal)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

