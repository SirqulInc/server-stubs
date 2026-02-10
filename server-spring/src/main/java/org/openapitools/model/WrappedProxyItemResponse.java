package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ImageGenerationResponse;
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
 * WrappedProxyItemResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class WrappedProxyItemResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  private @Nullable String returning;

  private @Nullable String type;

  private @Nullable Integer responseCode;

  private @Nullable String responseRaw;

  private @Nullable Long requestDuration;

  private @Nullable Long requestEndTime;

  private @Nullable ImageGenerationResponse item;

  public WrappedProxyItemResponse valid(@Nullable Boolean valid) {
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

  public WrappedProxyItemResponse message(@Nullable String message) {
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

  public WrappedProxyItemResponse version(@Nullable Double version) {
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

  public WrappedProxyItemResponse serializeNulls(@Nullable Boolean serializeNulls) {
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

  public WrappedProxyItemResponse startTimeLog(@Nullable Long startTimeLog) {
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

  public WrappedProxyItemResponse errorCode(@Nullable String errorCode) {
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

  public WrappedProxyItemResponse returning(@Nullable String returning) {
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

  public WrappedProxyItemResponse type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable String getType() {
    return type;
  }

  public void setType(@Nullable String type) {
    this.type = type;
  }

  public WrappedProxyItemResponse responseCode(@Nullable Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  /**
   * Get responseCode
   * @return responseCode
   */
  
  @Schema(name = "responseCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("responseCode")
  public @Nullable Integer getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(@Nullable Integer responseCode) {
    this.responseCode = responseCode;
  }

  public WrappedProxyItemResponse responseRaw(@Nullable String responseRaw) {
    this.responseRaw = responseRaw;
    return this;
  }

  /**
   * Get responseRaw
   * @return responseRaw
   */
  
  @Schema(name = "responseRaw", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("responseRaw")
  public @Nullable String getResponseRaw() {
    return responseRaw;
  }

  public void setResponseRaw(@Nullable String responseRaw) {
    this.responseRaw = responseRaw;
  }

  public WrappedProxyItemResponse requestDuration(@Nullable Long requestDuration) {
    this.requestDuration = requestDuration;
    return this;
  }

  /**
   * Get requestDuration
   * @return requestDuration
   */
  
  @Schema(name = "requestDuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestDuration")
  public @Nullable Long getRequestDuration() {
    return requestDuration;
  }

  public void setRequestDuration(@Nullable Long requestDuration) {
    this.requestDuration = requestDuration;
  }

  public WrappedProxyItemResponse requestEndTime(@Nullable Long requestEndTime) {
    this.requestEndTime = requestEndTime;
    return this;
  }

  /**
   * Get requestEndTime
   * @return requestEndTime
   */
  
  @Schema(name = "requestEndTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestEndTime")
  public @Nullable Long getRequestEndTime() {
    return requestEndTime;
  }

  public void setRequestEndTime(@Nullable Long requestEndTime) {
    this.requestEndTime = requestEndTime;
  }

  public WrappedProxyItemResponse item(@Nullable ImageGenerationResponse item) {
    this.item = item;
    return this;
  }

  /**
   * Get item
   * @return item
   */
  @Valid 
  @Schema(name = "item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item")
  public @Nullable ImageGenerationResponse getItem() {
    return item;
  }

  public void setItem(@Nullable ImageGenerationResponse item) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

