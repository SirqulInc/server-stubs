package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ActivityResponse   {
  
  private Long activityId;
  private Long created;
  private String appKey;
  private Long targetId;
  private String targetType;
  private String targetLegacyId;
  private String targetDescription;
  private Boolean targetActive;
  private String action;
  private Long slaveEntityId;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("activityId")
  public Long getActivityId() {
    return activityId;
  }
  public void setActivityId(Long activityId) {
    this.activityId = activityId;
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
  @JsonProperty("targetId")
  public Long getTargetId() {
    return targetId;
  }
  public void setTargetId(Long targetId) {
    this.targetId = targetId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("targetType")
  public String getTargetType() {
    return targetType;
  }
  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("targetLegacyId")
  public String getTargetLegacyId() {
    return targetLegacyId;
  }
  public void setTargetLegacyId(String targetLegacyId) {
    this.targetLegacyId = targetLegacyId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("targetDescription")
  public String getTargetDescription() {
    return targetDescription;
  }
  public void setTargetDescription(String targetDescription) {
    this.targetDescription = targetDescription;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("targetActive")
  public Boolean getTargetActive() {
    return targetActive;
  }
  public void setTargetActive(Boolean targetActive) {
    this.targetActive = targetActive;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("action")
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("slaveEntityId")
  public Long getSlaveEntityId() {
    return slaveEntityId;
  }
  public void setSlaveEntityId(Long slaveEntityId) {
    this.slaveEntityId = slaveEntityId;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

