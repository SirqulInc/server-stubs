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
import org.openapitools.model.StepResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class LegResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private String appKey;
  private Double distance;
  private Long duration;
  private Double startLatitude;
  private Double startLongitude;
  private Double startAltitude;
  private Long startDate;
  private Double endLatitude;
  private Double endLongitude;
  private Double endAltitude;
  private Long endDate;
  private Long created;
  private String tags;
  private String deviceId;
  private Long accountId;
  private String deviceSignature;
  private Long parentAccountId;
  private List<@Valid StepResponse> steps = new ArrayList<>();
  private String type;
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
  @JsonProperty("appKey")
  public String getAppKey() {
    return appKey;
  }
  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("distance")
  public Double getDistance() {
    return distance;
  }
  public void setDistance(Double distance) {
    this.distance = distance;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("duration")
  public Long getDuration() {
    return duration;
  }
  public void setDuration(Long duration) {
    this.duration = duration;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startLatitude")
  public Double getStartLatitude() {
    return startLatitude;
  }
  public void setStartLatitude(Double startLatitude) {
    this.startLatitude = startLatitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startLongitude")
  public Double getStartLongitude() {
    return startLongitude;
  }
  public void setStartLongitude(Double startLongitude) {
    this.startLongitude = startLongitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startAltitude")
  public Double getStartAltitude() {
    return startAltitude;
  }
  public void setStartAltitude(Double startAltitude) {
    this.startAltitude = startAltitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startDate")
  public Long getStartDate() {
    return startDate;
  }
  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endLatitude")
  public Double getEndLatitude() {
    return endLatitude;
  }
  public void setEndLatitude(Double endLatitude) {
    this.endLatitude = endLatitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endLongitude")
  public Double getEndLongitude() {
    return endLongitude;
  }
  public void setEndLongitude(Double endLongitude) {
    this.endLongitude = endLongitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endAltitude")
  public Double getEndAltitude() {
    return endAltitude;
  }
  public void setEndAltitude(Double endAltitude) {
    this.endAltitude = endAltitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }
  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }
  public void setCreated(Long created) {
    this.created = created;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tags")
  public String getTags() {
    return tags;
  }
  public void setTags(String tags) {
    this.tags = tags;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deviceId")
  public String getDeviceId() {
    return deviceId;
  }
  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accountId")
  public Long getAccountId() {
    return accountId;
  }
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deviceSignature")
  public String getDeviceSignature() {
    return deviceSignature;
  }
  public void setDeviceSignature(String deviceSignature) {
    this.deviceSignature = deviceSignature;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("parentAccountId")
  public Long getParentAccountId() {
    return parentAccountId;
  }
  public void setParentAccountId(Long parentAccountId) {
    this.parentAccountId = parentAccountId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("steps")
  @Valid
  public List<@Valid StepResponse> getSteps() {
    return steps;
  }
  public void setSteps(List<@Valid StepResponse> steps) {
    this.steps = steps;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

