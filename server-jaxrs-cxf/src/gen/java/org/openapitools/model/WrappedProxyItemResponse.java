package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ImageGenerationResponse;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class WrappedProxyItemResponse  {
  
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

  private String returning;

  @ApiModelProperty(value = "")

  private String type;

  @ApiModelProperty(value = "")

  private Integer responseCode;

  @ApiModelProperty(value = "")

  private String responseRaw;

  @ApiModelProperty(value = "")

  private Long requestDuration;

  @ApiModelProperty(value = "")

  private Long requestEndTime;

  @ApiModelProperty(value = "")

  @Valid

  private ImageGenerationResponse item;
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

  public WrappedProxyItemResponse valid(Boolean valid) {
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

  public WrappedProxyItemResponse message(String message) {
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

  public WrappedProxyItemResponse version(Double version) {
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

  public WrappedProxyItemResponse serializeNulls(Boolean serializeNulls) {
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

  public WrappedProxyItemResponse startTimeLog(Long startTimeLog) {
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

  public WrappedProxyItemResponse errorCode(String errorCode) {
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

  public WrappedProxyItemResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public WrappedProxyItemResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
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

  public WrappedProxyItemResponse returning(String returning) {
    this.returning = returning;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public WrappedProxyItemResponse type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get responseCode
   * @return responseCode
  **/
  @JsonProperty("responseCode")
  public Integer getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }

  public WrappedProxyItemResponse responseCode(Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

 /**
   * Get responseRaw
   * @return responseRaw
  **/
  @JsonProperty("responseRaw")
  public String getResponseRaw() {
    return responseRaw;
  }

  public void setResponseRaw(String responseRaw) {
    this.responseRaw = responseRaw;
  }

  public WrappedProxyItemResponse responseRaw(String responseRaw) {
    this.responseRaw = responseRaw;
    return this;
  }

 /**
   * Get requestDuration
   * @return requestDuration
  **/
  @JsonProperty("requestDuration")
  public Long getRequestDuration() {
    return requestDuration;
  }

  public void setRequestDuration(Long requestDuration) {
    this.requestDuration = requestDuration;
  }

  public WrappedProxyItemResponse requestDuration(Long requestDuration) {
    this.requestDuration = requestDuration;
    return this;
  }

 /**
   * Get requestEndTime
   * @return requestEndTime
  **/
  @JsonProperty("requestEndTime")
  public Long getRequestEndTime() {
    return requestEndTime;
  }

  public void setRequestEndTime(Long requestEndTime) {
    this.requestEndTime = requestEndTime;
  }

  public WrappedProxyItemResponse requestEndTime(Long requestEndTime) {
    this.requestEndTime = requestEndTime;
    return this;
  }

 /**
   * Get item
   * @return item
  **/
  @JsonProperty("item")
  public ImageGenerationResponse getItem() {
    return item;
  }

  public void setItem(ImageGenerationResponse item) {
    this.item = item;
  }

  public WrappedProxyItemResponse item(ImageGenerationResponse item) {
    this.item = item;
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
    WrappedProxyItemResponse wrappedProxyItemResponse = (WrappedProxyItemResponse) o;
    return Objects.equals(this.valid, wrappedProxyItemResponse.valid) &&
        Objects.equals(this.message, wrappedProxyItemResponse.message) &&
        Objects.equals(this.version, wrappedProxyItemResponse.version) &&
        Objects.equals(this.serializeNulls, wrappedProxyItemResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, wrappedProxyItemResponse.startTimeLog) &&
        Objects.equals(this.errorCode, wrappedProxyItemResponse.errorCode) &&
        Objects.equals(this.request, wrappedProxyItemResponse.request) &&
        Objects.equals(this.returning, wrappedProxyItemResponse.returning) &&
        Objects.equals(this.type, wrappedProxyItemResponse.type) &&
        Objects.equals(this.responseCode, wrappedProxyItemResponse.responseCode) &&
        Objects.equals(this.responseRaw, wrappedProxyItemResponse.responseRaw) &&
        Objects.equals(this.requestDuration, wrappedProxyItemResponse.requestDuration) &&
        Objects.equals(this.requestEndTime, wrappedProxyItemResponse.requestEndTime) &&
        Objects.equals(this.item, wrappedProxyItemResponse.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, returning, type, responseCode, responseRaw, requestDuration, requestEndTime, item);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WrappedProxyItemResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    returning: ").append(toIndentedString(returning)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseRaw: ").append(toIndentedString(responseRaw)).append("\n");
    sb.append("    requestDuration: ").append(toIndentedString(requestDuration)).append("\n");
    sb.append("    requestEndTime: ").append(toIndentedString(requestEndTime)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
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

