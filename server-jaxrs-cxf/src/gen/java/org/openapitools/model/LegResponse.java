package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.StepResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LegResponse  {
  
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

  private String appKey;

  @ApiModelProperty(value = "")

  private Double distance;

  @ApiModelProperty(value = "")

  private Long duration;

  @ApiModelProperty(value = "")

  private Double startLatitude;

  @ApiModelProperty(value = "")

  private Double startLongitude;

  @ApiModelProperty(value = "")

  private Double startAltitude;

  @ApiModelProperty(value = "")

  private Long startDate;

  @ApiModelProperty(value = "")

  private Double endLatitude;

  @ApiModelProperty(value = "")

  private Double endLongitude;

  @ApiModelProperty(value = "")

  private Double endAltitude;

  @ApiModelProperty(value = "")

  private Long endDate;

  @ApiModelProperty(value = "")

  private Long created;

  @ApiModelProperty(value = "")

  private String tags;

  @ApiModelProperty(value = "")

  private String deviceId;

  @ApiModelProperty(value = "")

  private Long accountId;

  @ApiModelProperty(value = "")

  private String deviceSignature;

  @ApiModelProperty(value = "")

  private Long parentAccountId;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid StepResponse> steps = new ArrayList<>();

  @ApiModelProperty(value = "")

  private String type;

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

  public LegResponse valid(Boolean valid) {
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

  public LegResponse message(String message) {
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

  public LegResponse version(Double version) {
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

  public LegResponse serializeNulls(Boolean serializeNulls) {
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

  public LegResponse startTimeLog(Long startTimeLog) {
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

  public LegResponse errorCode(String errorCode) {
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

  public LegResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public LegResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get appKey
   * @return appKey
  **/
  @JsonProperty("appKey")
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public LegResponse appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

 /**
   * Get distance
   * @return distance
  **/
  @JsonProperty("distance")
  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public LegResponse distance(Double distance) {
    this.distance = distance;
    return this;
  }

 /**
   * Get duration
   * @return duration
  **/
  @JsonProperty("duration")
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public LegResponse duration(Long duration) {
    this.duration = duration;
    return this;
  }

 /**
   * Get startLatitude
   * @return startLatitude
  **/
  @JsonProperty("startLatitude")
  public Double getStartLatitude() {
    return startLatitude;
  }

  public void setStartLatitude(Double startLatitude) {
    this.startLatitude = startLatitude;
  }

  public LegResponse startLatitude(Double startLatitude) {
    this.startLatitude = startLatitude;
    return this;
  }

 /**
   * Get startLongitude
   * @return startLongitude
  **/
  @JsonProperty("startLongitude")
  public Double getStartLongitude() {
    return startLongitude;
  }

  public void setStartLongitude(Double startLongitude) {
    this.startLongitude = startLongitude;
  }

  public LegResponse startLongitude(Double startLongitude) {
    this.startLongitude = startLongitude;
    return this;
  }

 /**
   * Get startAltitude
   * @return startAltitude
  **/
  @JsonProperty("startAltitude")
  public Double getStartAltitude() {
    return startAltitude;
  }

  public void setStartAltitude(Double startAltitude) {
    this.startAltitude = startAltitude;
  }

  public LegResponse startAltitude(Double startAltitude) {
    this.startAltitude = startAltitude;
    return this;
  }

 /**
   * Get startDate
   * @return startDate
  **/
  @JsonProperty("startDate")
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public LegResponse startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * Get endLatitude
   * @return endLatitude
  **/
  @JsonProperty("endLatitude")
  public Double getEndLatitude() {
    return endLatitude;
  }

  public void setEndLatitude(Double endLatitude) {
    this.endLatitude = endLatitude;
  }

  public LegResponse endLatitude(Double endLatitude) {
    this.endLatitude = endLatitude;
    return this;
  }

 /**
   * Get endLongitude
   * @return endLongitude
  **/
  @JsonProperty("endLongitude")
  public Double getEndLongitude() {
    return endLongitude;
  }

  public void setEndLongitude(Double endLongitude) {
    this.endLongitude = endLongitude;
  }

  public LegResponse endLongitude(Double endLongitude) {
    this.endLongitude = endLongitude;
    return this;
  }

 /**
   * Get endAltitude
   * @return endAltitude
  **/
  @JsonProperty("endAltitude")
  public Double getEndAltitude() {
    return endAltitude;
  }

  public void setEndAltitude(Double endAltitude) {
    this.endAltitude = endAltitude;
  }

  public LegResponse endAltitude(Double endAltitude) {
    this.endAltitude = endAltitude;
    return this;
  }

 /**
   * Get endDate
   * @return endDate
  **/
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public LegResponse endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * Get created
   * @return created
  **/
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public LegResponse created(Long created) {
    this.created = created;
    return this;
  }

 /**
   * Get tags
   * @return tags
  **/
  @JsonProperty("tags")
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public LegResponse tags(String tags) {
    this.tags = tags;
    return this;
  }

 /**
   * Get deviceId
   * @return deviceId
  **/
  @JsonProperty("deviceId")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public LegResponse deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

 /**
   * Get accountId
   * @return accountId
  **/
  @JsonProperty("accountId")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public LegResponse accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * Get deviceSignature
   * @return deviceSignature
  **/
  @JsonProperty("deviceSignature")
  public String getDeviceSignature() {
    return deviceSignature;
  }

  public void setDeviceSignature(String deviceSignature) {
    this.deviceSignature = deviceSignature;
  }

  public LegResponse deviceSignature(String deviceSignature) {
    this.deviceSignature = deviceSignature;
    return this;
  }

 /**
   * Get parentAccountId
   * @return parentAccountId
  **/
  @JsonProperty("parentAccountId")
  public Long getParentAccountId() {
    return parentAccountId;
  }

  public void setParentAccountId(Long parentAccountId) {
    this.parentAccountId = parentAccountId;
  }

  public LegResponse parentAccountId(Long parentAccountId) {
    this.parentAccountId = parentAccountId;
    return this;
  }

 /**
   * Get steps
   * @return steps
  **/
  @JsonProperty("steps")
  public List<@Valid StepResponse> getSteps() {
    return steps;
  }

  public void setSteps(List<@Valid StepResponse> steps) {
    this.steps = steps;
  }

  public LegResponse steps(List<@Valid StepResponse> steps) {
    this.steps = steps;
    return this;
  }

  public LegResponse addStepsItem(StepResponse stepsItem) {
    this.steps.add(stepsItem);
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

  public LegResponse type(String type) {
    this.type = type;
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

  public LegResponse returning(String returning) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

