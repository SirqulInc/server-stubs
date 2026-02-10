package apimodels;

import apimodels.NameStringValueResponse;
import apimodels.StepResponse;
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
 * LegResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LegResponse   {
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

  @JsonProperty("appKey")
  
  private String appKey;

  @JsonProperty("distance")
  
  private Double distance;

  @JsonProperty("duration")
  
  private Long duration;

  @JsonProperty("startLatitude")
  
  private Double startLatitude;

  @JsonProperty("startLongitude")
  
  private Double startLongitude;

  @JsonProperty("startAltitude")
  
  private Double startAltitude;

  @JsonProperty("startDate")
  
  private Long startDate;

  @JsonProperty("endLatitude")
  
  private Double endLatitude;

  @JsonProperty("endLongitude")
  
  private Double endLongitude;

  @JsonProperty("endAltitude")
  
  private Double endAltitude;

  @JsonProperty("endDate")
  
  private Long endDate;

  @JsonProperty("created")
  
  private Long created;

  @JsonProperty("tags")
  
  private String tags;

  @JsonProperty("deviceId")
  
  private String deviceId;

  @JsonProperty("accountId")
  
  private Long accountId;

  @JsonProperty("deviceSignature")
  
  private String deviceSignature;

  @JsonProperty("parentAccountId")
  
  private Long parentAccountId;

  @JsonProperty("steps")
  @Valid

  private List<@Valid StepResponse> steps = null;

  @JsonProperty("type")
  
  private String type;

  @JsonProperty("returning")
  
  private String returning;

  public LegResponse valid(Boolean valid) {
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

  public LegResponse message(String message) {
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

  public LegResponse version(Double version) {
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

  public LegResponse serializeNulls(Boolean serializeNulls) {
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

  public LegResponse startTimeLog(Long startTimeLog) {
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

  public LegResponse errorCode(String errorCode) {
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
  **/
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public LegResponse appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

   /**
   * Get appKey
   * @return appKey
  **/
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public LegResponse distance(Double distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public LegResponse duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public LegResponse startLatitude(Double startLatitude) {
    this.startLatitude = startLatitude;
    return this;
  }

   /**
   * Get startLatitude
   * @return startLatitude
  **/
  public Double getStartLatitude() {
    return startLatitude;
  }

  public void setStartLatitude(Double startLatitude) {
    this.startLatitude = startLatitude;
  }

  public LegResponse startLongitude(Double startLongitude) {
    this.startLongitude = startLongitude;
    return this;
  }

   /**
   * Get startLongitude
   * @return startLongitude
  **/
  public Double getStartLongitude() {
    return startLongitude;
  }

  public void setStartLongitude(Double startLongitude) {
    this.startLongitude = startLongitude;
  }

  public LegResponse startAltitude(Double startAltitude) {
    this.startAltitude = startAltitude;
    return this;
  }

   /**
   * Get startAltitude
   * @return startAltitude
  **/
  public Double getStartAltitude() {
    return startAltitude;
  }

  public void setStartAltitude(Double startAltitude) {
    this.startAltitude = startAltitude;
  }

  public LegResponse startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public LegResponse endLatitude(Double endLatitude) {
    this.endLatitude = endLatitude;
    return this;
  }

   /**
   * Get endLatitude
   * @return endLatitude
  **/
  public Double getEndLatitude() {
    return endLatitude;
  }

  public void setEndLatitude(Double endLatitude) {
    this.endLatitude = endLatitude;
  }

  public LegResponse endLongitude(Double endLongitude) {
    this.endLongitude = endLongitude;
    return this;
  }

   /**
   * Get endLongitude
   * @return endLongitude
  **/
  public Double getEndLongitude() {
    return endLongitude;
  }

  public void setEndLongitude(Double endLongitude) {
    this.endLongitude = endLongitude;
  }

  public LegResponse endAltitude(Double endAltitude) {
    this.endAltitude = endAltitude;
    return this;
  }

   /**
   * Get endAltitude
   * @return endAltitude
  **/
  public Double getEndAltitude() {
    return endAltitude;
  }

  public void setEndAltitude(Double endAltitude) {
    this.endAltitude = endAltitude;
  }

  public LegResponse endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public LegResponse created(Long created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public LegResponse tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public LegResponse deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public LegResponse accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public LegResponse deviceSignature(String deviceSignature) {
    this.deviceSignature = deviceSignature;
    return this;
  }

   /**
   * Get deviceSignature
   * @return deviceSignature
  **/
  public String getDeviceSignature() {
    return deviceSignature;
  }

  public void setDeviceSignature(String deviceSignature) {
    this.deviceSignature = deviceSignature;
  }

  public LegResponse parentAccountId(Long parentAccountId) {
    this.parentAccountId = parentAccountId;
    return this;
  }

   /**
   * Get parentAccountId
   * @return parentAccountId
  **/
  public Long getParentAccountId() {
    return parentAccountId;
  }

  public void setParentAccountId(Long parentAccountId) {
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
  **/
  public List<@Valid StepResponse> getSteps() {
    return steps;
  }

  public void setSteps(List<@Valid StepResponse> steps) {
    this.steps = steps;
  }

  public LegResponse type(String type) {
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

  public LegResponse returning(String returning) {
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
    LegResponse legResponse = (LegResponse) o;
    return Objects.equals(valid, legResponse.valid) &&
        Objects.equals(message, legResponse.message) &&
        Objects.equals(version, legResponse.version) &&
        Objects.equals(serializeNulls, legResponse.serializeNulls) &&
        Objects.equals(startTimeLog, legResponse.startTimeLog) &&
        Objects.equals(errorCode, legResponse.errorCode) &&
        Objects.equals(request, legResponse.request) &&
        Objects.equals(appKey, legResponse.appKey) &&
        Objects.equals(distance, legResponse.distance) &&
        Objects.equals(duration, legResponse.duration) &&
        Objects.equals(startLatitude, legResponse.startLatitude) &&
        Objects.equals(startLongitude, legResponse.startLongitude) &&
        Objects.equals(startAltitude, legResponse.startAltitude) &&
        Objects.equals(startDate, legResponse.startDate) &&
        Objects.equals(endLatitude, legResponse.endLatitude) &&
        Objects.equals(endLongitude, legResponse.endLongitude) &&
        Objects.equals(endAltitude, legResponse.endAltitude) &&
        Objects.equals(endDate, legResponse.endDate) &&
        Objects.equals(created, legResponse.created) &&
        Objects.equals(tags, legResponse.tags) &&
        Objects.equals(deviceId, legResponse.deviceId) &&
        Objects.equals(accountId, legResponse.accountId) &&
        Objects.equals(deviceSignature, legResponse.deviceSignature) &&
        Objects.equals(parentAccountId, legResponse.parentAccountId) &&
        Objects.equals(steps, legResponse.steps) &&
        Objects.equals(type, legResponse.type) &&
        Objects.equals(returning, legResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, appKey, distance, duration, startLatitude, startLongitude, startAltitude, startDate, endLatitude, endLongitude, endAltitude, endDate, created, tags, deviceId, accountId, deviceSignature, parentAccountId, steps, type, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

