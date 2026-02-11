package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.StepResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LegResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class LegResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  private @Nullable String appKey;

  private @Nullable Double distance;

  private @Nullable Long duration;

  private @Nullable Double startLatitude;

  private @Nullable Double startLongitude;

  private @Nullable Double startAltitude;

  private @Nullable Long startDate;

  private @Nullable Double endLatitude;

  private @Nullable Double endLongitude;

  private @Nullable Double endAltitude;

  private @Nullable Long endDate;

  private @Nullable Long created;

  private @Nullable String tags;

  private @Nullable String deviceId;

  private @Nullable Long accountId;

  private @Nullable String deviceSignature;

  private @Nullable Long parentAccountId;

  @Valid
  private List<@Valid StepResponse> steps = new ArrayList<>();

  private @Nullable String type;

  private @Nullable String returning;

  public LegResponse valid(@Nullable Boolean valid) {
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

  public LegResponse message(@Nullable String message) {
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

  public LegResponse version(@Nullable Double version) {
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

  public LegResponse serializeNulls(@Nullable Boolean serializeNulls) {
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

  public LegResponse startTimeLog(@Nullable Long startTimeLog) {
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

  public LegResponse errorCode(@Nullable String errorCode) {
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

  public LegResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public LegResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public LegResponse appKey(@Nullable String appKey) {
    this.appKey = appKey;
    return this;
  }

  /**
   * Get appKey
   * @return appKey
   */
  
  @Schema(name = "appKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appKey")
  public @Nullable String getAppKey() {
    return appKey;
  }

  public void setAppKey(@Nullable String appKey) {
    this.appKey = appKey;
  }

  public LegResponse distance(@Nullable Double distance) {
    this.distance = distance;
    return this;
  }

  /**
   * Get distance
   * @return distance
   */
  
  @Schema(name = "distance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("distance")
  public @Nullable Double getDistance() {
    return distance;
  }

  public void setDistance(@Nullable Double distance) {
    this.distance = distance;
  }

  public LegResponse duration(@Nullable Long duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
   */
  
  @Schema(name = "duration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("duration")
  public @Nullable Long getDuration() {
    return duration;
  }

  public void setDuration(@Nullable Long duration) {
    this.duration = duration;
  }

  public LegResponse startLatitude(@Nullable Double startLatitude) {
    this.startLatitude = startLatitude;
    return this;
  }

  /**
   * Get startLatitude
   * @return startLatitude
   */
  
  @Schema(name = "startLatitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startLatitude")
  public @Nullable Double getStartLatitude() {
    return startLatitude;
  }

  public void setStartLatitude(@Nullable Double startLatitude) {
    this.startLatitude = startLatitude;
  }

  public LegResponse startLongitude(@Nullable Double startLongitude) {
    this.startLongitude = startLongitude;
    return this;
  }

  /**
   * Get startLongitude
   * @return startLongitude
   */
  
  @Schema(name = "startLongitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startLongitude")
  public @Nullable Double getStartLongitude() {
    return startLongitude;
  }

  public void setStartLongitude(@Nullable Double startLongitude) {
    this.startLongitude = startLongitude;
  }

  public LegResponse startAltitude(@Nullable Double startAltitude) {
    this.startAltitude = startAltitude;
    return this;
  }

  /**
   * Get startAltitude
   * @return startAltitude
   */
  
  @Schema(name = "startAltitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startAltitude")
  public @Nullable Double getStartAltitude() {
    return startAltitude;
  }

  public void setStartAltitude(@Nullable Double startAltitude) {
    this.startAltitude = startAltitude;
  }

  public LegResponse startDate(@Nullable Long startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public @Nullable Long getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable Long startDate) {
    this.startDate = startDate;
  }

  public LegResponse endLatitude(@Nullable Double endLatitude) {
    this.endLatitude = endLatitude;
    return this;
  }

  /**
   * Get endLatitude
   * @return endLatitude
   */
  
  @Schema(name = "endLatitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endLatitude")
  public @Nullable Double getEndLatitude() {
    return endLatitude;
  }

  public void setEndLatitude(@Nullable Double endLatitude) {
    this.endLatitude = endLatitude;
  }

  public LegResponse endLongitude(@Nullable Double endLongitude) {
    this.endLongitude = endLongitude;
    return this;
  }

  /**
   * Get endLongitude
   * @return endLongitude
   */
  
  @Schema(name = "endLongitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endLongitude")
  public @Nullable Double getEndLongitude() {
    return endLongitude;
  }

  public void setEndLongitude(@Nullable Double endLongitude) {
    this.endLongitude = endLongitude;
  }

  public LegResponse endAltitude(@Nullable Double endAltitude) {
    this.endAltitude = endAltitude;
    return this;
  }

  /**
   * Get endAltitude
   * @return endAltitude
   */
  
  @Schema(name = "endAltitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endAltitude")
  public @Nullable Double getEndAltitude() {
    return endAltitude;
  }

  public void setEndAltitude(@Nullable Double endAltitude) {
    this.endAltitude = endAltitude;
  }

  public LegResponse endDate(@Nullable Long endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  
  @Schema(name = "endDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public @Nullable Long getEndDate() {
    return endDate;
  }

  public void setEndDate(@Nullable Long endDate) {
    this.endDate = endDate;
  }

  public LegResponse created(@Nullable Long created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  
  @Schema(name = "created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created")
  public @Nullable Long getCreated() {
    return created;
  }

  public void setCreated(@Nullable Long created) {
    this.created = created;
  }

  public LegResponse tags(@Nullable String tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  
  @Schema(name = "tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public @Nullable String getTags() {
    return tags;
  }

  public void setTags(@Nullable String tags) {
    this.tags = tags;
  }

  public LegResponse deviceId(@Nullable String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * Get deviceId
   * @return deviceId
   */
  
  @Schema(name = "deviceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceId")
  public @Nullable String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(@Nullable String deviceId) {
    this.deviceId = deviceId;
  }

  public LegResponse accountId(@Nullable Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
   */
  
  @Schema(name = "accountId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountId")
  public @Nullable Long getAccountId() {
    return accountId;
  }

  public void setAccountId(@Nullable Long accountId) {
    this.accountId = accountId;
  }

  public LegResponse deviceSignature(@Nullable String deviceSignature) {
    this.deviceSignature = deviceSignature;
    return this;
  }

  /**
   * Get deviceSignature
   * @return deviceSignature
   */
  
  @Schema(name = "deviceSignature", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceSignature")
  public @Nullable String getDeviceSignature() {
    return deviceSignature;
  }

  public void setDeviceSignature(@Nullable String deviceSignature) {
    this.deviceSignature = deviceSignature;
  }

  public LegResponse parentAccountId(@Nullable Long parentAccountId) {
    this.parentAccountId = parentAccountId;
    return this;
  }

  /**
   * Get parentAccountId
   * @return parentAccountId
   */
  
  @Schema(name = "parentAccountId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentAccountId")
  public @Nullable Long getParentAccountId() {
    return parentAccountId;
  }

  public void setParentAccountId(@Nullable Long parentAccountId) {
    this.parentAccountId = parentAccountId;
  }

  public LegResponse steps(List<@Valid StepResponse> steps) {
    this.steps = steps;
    return this;
  }

  public LegResponse addStepsItem(StepResponse stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

  /**
   * Get steps
   * @return steps
   */
  @Valid 
  @Schema(name = "steps", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("steps")
  public List<@Valid StepResponse> getSteps() {
    return steps;
  }

  public void setSteps(List<@Valid StepResponse> steps) {
    this.steps = steps;
  }

  public LegResponse type(@Nullable String type) {
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

  public LegResponse returning(@Nullable String returning) {
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
    LegResponse legResponse = (LegResponse) o;
    return Objects.equals(this.valid, legResponse.valid) &&
        Objects.equals(this.message, legResponse.message) &&
        Objects.equals(this.version, legResponse.version) &&
        Objects.equals(this.serializeNulls, legResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, legResponse.startTimeLog) &&
        Objects.equals(this.errorCode, legResponse.errorCode) &&
        Objects.equals(this.request, legResponse.request) &&
        Objects.equals(this.appKey, legResponse.appKey) &&
        Objects.equals(this.distance, legResponse.distance) &&
        Objects.equals(this.duration, legResponse.duration) &&
        Objects.equals(this.startLatitude, legResponse.startLatitude) &&
        Objects.equals(this.startLongitude, legResponse.startLongitude) &&
        Objects.equals(this.startAltitude, legResponse.startAltitude) &&
        Objects.equals(this.startDate, legResponse.startDate) &&
        Objects.equals(this.endLatitude, legResponse.endLatitude) &&
        Objects.equals(this.endLongitude, legResponse.endLongitude) &&
        Objects.equals(this.endAltitude, legResponse.endAltitude) &&
        Objects.equals(this.endDate, legResponse.endDate) &&
        Objects.equals(this.created, legResponse.created) &&
        Objects.equals(this.tags, legResponse.tags) &&
        Objects.equals(this.deviceId, legResponse.deviceId) &&
        Objects.equals(this.accountId, legResponse.accountId) &&
        Objects.equals(this.deviceSignature, legResponse.deviceSignature) &&
        Objects.equals(this.parentAccountId, legResponse.parentAccountId) &&
        Objects.equals(this.steps, legResponse.steps) &&
        Objects.equals(this.type, legResponse.type) &&
        Objects.equals(this.returning, legResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, appKey, distance, duration, startLatitude, startLongitude, startAltitude, startDate, endLatitude, endLongitude, endAltitude, endDate, created, tags, deviceId, accountId, deviceSignature, parentAccountId, steps, type, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegResponse {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    startLatitude: ").append(toIndentedString(startLatitude)).append("\n");
    sb.append("    startLongitude: ").append(toIndentedString(startLongitude)).append("\n");
    sb.append("    startAltitude: ").append(toIndentedString(startAltitude)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endLatitude: ").append(toIndentedString(endLatitude)).append("\n");
    sb.append("    endLongitude: ").append(toIndentedString(endLongitude)).append("\n");
    sb.append("    endAltitude: ").append(toIndentedString(endAltitude)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    deviceSignature: ").append(toIndentedString(deviceSignature)).append("\n");
    sb.append("    parentAccountId: ").append(toIndentedString(parentAccountId)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

