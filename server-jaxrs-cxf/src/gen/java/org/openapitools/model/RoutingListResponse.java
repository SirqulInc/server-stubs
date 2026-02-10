package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.RoutingResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RoutingListResponse  {
  
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

  private List<@Valid RoutingResponse> items = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Integer count;

  @ApiModelProperty(value = "")

  private List<String> debug = new ArrayList<>();

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

  public RoutingListResponse valid(Boolean valid) {
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

  public RoutingListResponse message(String message) {
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

  public RoutingListResponse version(Double version) {
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

  public RoutingListResponse serializeNulls(Boolean serializeNulls) {
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

  public RoutingListResponse startTimeLog(Long startTimeLog) {
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

  public RoutingListResponse errorCode(String errorCode) {
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

  public RoutingListResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public RoutingListResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<@Valid RoutingResponse> getItems() {
    return items;
  }

  public void setItems(List<@Valid RoutingResponse> items) {
    this.items = items;
  }

  public RoutingListResponse items(List<@Valid RoutingResponse> items) {
    this.items = items;
    return this;
  }

  public RoutingListResponse addItemsItem(RoutingResponse itemsItem) {
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

  public RoutingListResponse count(Integer count) {
    this.count = count;
    return this;
  }

 /**
   * Get debug
   * @return debug
  **/
  @JsonProperty("debug")
  public List<String> getDebug() {
    return debug;
  }

  public void setDebug(List<String> debug) {
    this.debug = debug;
  }

  public RoutingListResponse debug(List<String> debug) {
    this.debug = debug;
    return this;
  }

  public RoutingListResponse addDebugItem(String debugItem) {
    this.debug.add(debugItem);
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

  public RoutingListResponse returning(String returning) {
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
    RoutingListResponse routingListResponse = (RoutingListResponse) o;
    return Objects.equals(this.valid, routingListResponse.valid) &&
        Objects.equals(this.message, routingListResponse.message) &&
        Objects.equals(this.version, routingListResponse.version) &&
        Objects.equals(this.serializeNulls, routingListResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, routingListResponse.startTimeLog) &&
        Objects.equals(this.errorCode, routingListResponse.errorCode) &&
        Objects.equals(this.request, routingListResponse.request) &&
        Objects.equals(this.items, routingListResponse.items) &&
        Objects.equals(this.count, routingListResponse.count) &&
        Objects.equals(this.debug, routingListResponse.debug) &&
        Objects.equals(this.returning, routingListResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, items, count, debug, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingListResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    debug: ").append(toIndentedString(debug)).append("\n");
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

