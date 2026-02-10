package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ActivityResponse  {
  
  @ApiModelProperty(value = "")

  private Long activityId;

  @ApiModelProperty(value = "")

  private Long created;

  @ApiModelProperty(value = "")

  private String appKey;

  @ApiModelProperty(value = "")

  private Long targetId;

  @ApiModelProperty(value = "")

  private String targetType;

  @ApiModelProperty(value = "")

  private String targetLegacyId;

  @ApiModelProperty(value = "")

  private String targetDescription;

  @ApiModelProperty(value = "")

  private Boolean targetActive;

  @ApiModelProperty(value = "")

  private String action;

  @ApiModelProperty(value = "")

  private Long slaveEntityId;
 /**
   * Get activityId
   * @return activityId
  **/
  @JsonProperty("activityId")
  public Long getActivityId() {
    return activityId;
  }

  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }

  public ActivityResponse activityId(Long activityId) {
    this.activityId = activityId;
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

  public ActivityResponse created(Long created) {
    this.created = created;
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

  public ActivityResponse appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

 /**
   * Get targetId
   * @return targetId
  **/
  @JsonProperty("targetId")
  public Long getTargetId() {
    return targetId;
  }

  public void setTargetId(Long targetId) {
    this.targetId = targetId;
  }

  public ActivityResponse targetId(Long targetId) {
    this.targetId = targetId;
    return this;
  }

 /**
   * Get targetType
   * @return targetType
  **/
  @JsonProperty("targetType")
  public String getTargetType() {
    return targetType;
  }

  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }

  public ActivityResponse targetType(String targetType) {
    this.targetType = targetType;
    return this;
  }

 /**
   * Get targetLegacyId
   * @return targetLegacyId
  **/
  @JsonProperty("targetLegacyId")
  public String getTargetLegacyId() {
    return targetLegacyId;
  }

  public void setTargetLegacyId(String targetLegacyId) {
    this.targetLegacyId = targetLegacyId;
  }

  public ActivityResponse targetLegacyId(String targetLegacyId) {
    this.targetLegacyId = targetLegacyId;
    return this;
  }

 /**
   * Get targetDescription
   * @return targetDescription
  **/
  @JsonProperty("targetDescription")
  public String getTargetDescription() {
    return targetDescription;
  }

  public void setTargetDescription(String targetDescription) {
    this.targetDescription = targetDescription;
  }

  public ActivityResponse targetDescription(String targetDescription) {
    this.targetDescription = targetDescription;
    return this;
  }

 /**
   * Get targetActive
   * @return targetActive
  **/
  @JsonProperty("targetActive")
  public Boolean getTargetActive() {
    return targetActive;
  }

  public void setTargetActive(Boolean targetActive) {
    this.targetActive = targetActive;
  }

  public ActivityResponse targetActive(Boolean targetActive) {
    this.targetActive = targetActive;
    return this;
  }

 /**
   * Get action
   * @return action
  **/
  @JsonProperty("action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public ActivityResponse action(String action) {
    this.action = action;
    return this;
  }

 /**
   * Get slaveEntityId
   * @return slaveEntityId
  **/
  @JsonProperty("slaveEntityId")
  public Long getSlaveEntityId() {
    return slaveEntityId;
  }

  public void setSlaveEntityId(Long slaveEntityId) {
    this.slaveEntityId = slaveEntityId;
  }

  public ActivityResponse slaveEntityId(Long slaveEntityId) {
    this.slaveEntityId = slaveEntityId;
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
    ActivityResponse activityResponse = (ActivityResponse) o;
    return Objects.equals(this.activityId, activityResponse.activityId) &&
        Objects.equals(this.created, activityResponse.created) &&
        Objects.equals(this.appKey, activityResponse.appKey) &&
        Objects.equals(this.targetId, activityResponse.targetId) &&
        Objects.equals(this.targetType, activityResponse.targetType) &&
        Objects.equals(this.targetLegacyId, activityResponse.targetLegacyId) &&
        Objects.equals(this.targetDescription, activityResponse.targetDescription) &&
        Objects.equals(this.targetActive, activityResponse.targetActive) &&
        Objects.equals(this.action, activityResponse.action) &&
        Objects.equals(this.slaveEntityId, activityResponse.slaveEntityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, created, appKey, targetId, targetType, targetLegacyId, targetDescription, targetActive, action, slaveEntityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityResponse {\n");
    
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    targetLegacyId: ").append(toIndentedString(targetLegacyId)).append("\n");
    sb.append("    targetDescription: ").append(toIndentedString(targetDescription)).append("\n");
    sb.append("    targetActive: ").append(toIndentedString(targetActive)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    slaveEntityId: ").append(toIndentedString(slaveEntityId)).append("\n");
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

