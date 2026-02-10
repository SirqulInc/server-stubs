package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountResponse;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AccountListResponse  {
  
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

  private List<@Valid AccountResponse> items = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Integer count;

  @ApiModelProperty(value = "")

  private Boolean hasMoreResults;

  @ApiModelProperty(value = "")

  private Integer start;

  @ApiModelProperty(value = "")

  private Integer limit;

  @ApiModelProperty(value = "")

  private Long countTotal;

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

  public AccountListResponse valid(Boolean valid) {
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

  public AccountListResponse message(String message) {
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

  public AccountListResponse version(Double version) {
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

  public AccountListResponse serializeNulls(Boolean serializeNulls) {
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

  public AccountListResponse startTimeLog(Long startTimeLog) {
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

  public AccountListResponse errorCode(String errorCode) {
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

  public AccountListResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public AccountListResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<@Valid AccountResponse> getItems() {
    return items;
  }

  public void setItems(List<@Valid AccountResponse> items) {
    this.items = items;
  }

  public AccountListResponse items(List<@Valid AccountResponse> items) {
    this.items = items;
    return this;
  }

  public AccountListResponse addItemsItem(AccountResponse itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
   * Get count
   * @return count
  **/
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public AccountListResponse count(Integer count) {
    this.count = count;
    return this;
  }

 /**
   * Get hasMoreResults
   * @return hasMoreResults
  **/
  @JsonProperty("hasMoreResults")
  public Boolean getHasMoreResults() {
    return hasMoreResults;
  }

  public void setHasMoreResults(Boolean hasMoreResults) {
    this.hasMoreResults = hasMoreResults;
  }

  public AccountListResponse hasMoreResults(Boolean hasMoreResults) {
    this.hasMoreResults = hasMoreResults;
    return this;
  }

 /**
   * Get start
   * @return start
  **/
  @JsonProperty("start")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public AccountListResponse start(Integer start) {
    this.start = start;
    return this;
  }

 /**
   * Get limit
   * @return limit
  **/
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public AccountListResponse limit(Integer limit) {
    this.limit = limit;
    return this;
  }

 /**
   * Get countTotal
   * @return countTotal
  **/
  @JsonProperty("countTotal")
  public Long getCountTotal() {
    return countTotal;
  }

  public void setCountTotal(Long countTotal) {
    this.countTotal = countTotal;
  }

  public AccountListResponse countTotal(Long countTotal) {
    this.countTotal = countTotal;
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

  public AccountListResponse returning(String returning) {
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
    AccountListResponse accountListResponse = (AccountListResponse) o;
    return Objects.equals(this.valid, accountListResponse.valid) &&
        Objects.equals(this.message, accountListResponse.message) &&
        Objects.equals(this.version, accountListResponse.version) &&
        Objects.equals(this.serializeNulls, accountListResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, accountListResponse.startTimeLog) &&
        Objects.equals(this.errorCode, accountListResponse.errorCode) &&
        Objects.equals(this.request, accountListResponse.request) &&
        Objects.equals(this.items, accountListResponse.items) &&
        Objects.equals(this.count, accountListResponse.count) &&
        Objects.equals(this.hasMoreResults, accountListResponse.hasMoreResults) &&
        Objects.equals(this.start, accountListResponse.start) &&
        Objects.equals(this.limit, accountListResponse.limit) &&
        Objects.equals(this.countTotal, accountListResponse.countTotal) &&
        Objects.equals(this.returning, accountListResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, items, count, hasMoreResults, start, limit, countTotal, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountListResponse {\n");
    
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
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    countTotal: ").append(toIndentedString(countTotal)).append("\n");
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

