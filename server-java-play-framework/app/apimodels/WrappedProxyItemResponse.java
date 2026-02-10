package apimodels;

import apimodels.ImageGenerationResponse;
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
 * WrappedProxyItemResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class WrappedProxyItemResponse   {
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

  @JsonProperty("returning")
  
  private String returning;

  @JsonProperty("type")
  
  private String type;

  @JsonProperty("responseCode")
  
  private Integer responseCode;

  @JsonProperty("responseRaw")
  
  private String responseRaw;

  @JsonProperty("requestDuration")
  
  private Long requestDuration;

  @JsonProperty("requestEndTime")
  
  private Long requestEndTime;

  @JsonProperty("item")
  @Valid

  private ImageGenerationResponse item;

  public WrappedProxyItemResponse valid(Boolean valid) {
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

  public WrappedProxyItemResponse message(String message) {
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

  public WrappedProxyItemResponse version(Double version) {
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

  public WrappedProxyItemResponse serializeNulls(Boolean serializeNulls) {
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

  public WrappedProxyItemResponse startTimeLog(Long startTimeLog) {
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

  public WrappedProxyItemResponse errorCode(String errorCode) {
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

  public WrappedProxyItemResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public WrappedProxyItemResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public WrappedProxyItemResponse returning(String returning) {
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

  public WrappedProxyItemResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public WrappedProxyItemResponse responseCode(Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Get responseCode
   * @return responseCode
  **/
  public Integer getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }

  public WrappedProxyItemResponse responseRaw(String responseRaw) {
    this.responseRaw = responseRaw;
    return this;
  }

   /**
   * Get responseRaw
   * @return responseRaw
  **/
  public String getResponseRaw() {
    return responseRaw;
  }

  public void setResponseRaw(String responseRaw) {
    this.responseRaw = responseRaw;
  }

  public WrappedProxyItemResponse requestDuration(Long requestDuration) {
    this.requestDuration = requestDuration;
    return this;
  }

   /**
   * Get requestDuration
   * @return requestDuration
  **/
  public Long getRequestDuration() {
    return requestDuration;
  }

  public void setRequestDuration(Long requestDuration) {
    this.requestDuration = requestDuration;
  }

  public WrappedProxyItemResponse requestEndTime(Long requestEndTime) {
    this.requestEndTime = requestEndTime;
    return this;
  }

   /**
   * Get requestEndTime
   * @return requestEndTime
  **/
  public Long getRequestEndTime() {
    return requestEndTime;
  }

  public void setRequestEndTime(Long requestEndTime) {
    this.requestEndTime = requestEndTime;
  }

  public WrappedProxyItemResponse item(ImageGenerationResponse item) {
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  public ImageGenerationResponse getItem() {
    return item;
  }

  public void setItem(ImageGenerationResponse item) {
    this.item = item;
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
    return Objects.equals(valid, wrappedProxyItemResponse.valid) &&
        Objects.equals(message, wrappedProxyItemResponse.message) &&
        Objects.equals(version, wrappedProxyItemResponse.version) &&
        Objects.equals(serializeNulls, wrappedProxyItemResponse.serializeNulls) &&
        Objects.equals(startTimeLog, wrappedProxyItemResponse.startTimeLog) &&
        Objects.equals(errorCode, wrappedProxyItemResponse.errorCode) &&
        Objects.equals(request, wrappedProxyItemResponse.request) &&
        Objects.equals(returning, wrappedProxyItemResponse.returning) &&
        Objects.equals(type, wrappedProxyItemResponse.type) &&
        Objects.equals(responseCode, wrappedProxyItemResponse.responseCode) &&
        Objects.equals(responseRaw, wrappedProxyItemResponse.responseRaw) &&
        Objects.equals(requestDuration, wrappedProxyItemResponse.requestDuration) &&
        Objects.equals(requestEndTime, wrappedProxyItemResponse.requestEndTime) &&
        Objects.equals(item, wrappedProxyItemResponse.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, returning, type, responseCode, responseRaw, requestDuration, requestEndTime, item);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

