package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ActivityResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ActivityResponse {

  private @Nullable Long activityId;

  private @Nullable Long created;

  private @Nullable String appKey;

  private @Nullable Long targetId;

  private @Nullable String targetType;

  private @Nullable String targetLegacyId;

  private @Nullable String targetDescription;

  private @Nullable Boolean targetActive;

  private @Nullable String action;

  private @Nullable Long slaveEntityId;

  public ActivityResponse activityId(@Nullable Long activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * Get activityId
   * @return activityId
   */
  
  @Schema(name = "activityId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityId")
  public @Nullable Long getActivityId() {
    return activityId;
  }

  public void setActivityId(@Nullable Long activityId) {
    this.activityId = activityId;
  }

  public ActivityResponse created(@Nullable Long created) {
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

  public ActivityResponse appKey(@Nullable String appKey) {
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

  public ActivityResponse targetId(@Nullable Long targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * Get targetId
   * @return targetId
   */
  
  @Schema(name = "targetId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetId")
  public @Nullable Long getTargetId() {
    return targetId;
  }

  public void setTargetId(@Nullable Long targetId) {
    this.targetId = targetId;
  }

  public ActivityResponse targetType(@Nullable String targetType) {
    this.targetType = targetType;
    return this;
  }

  /**
   * Get targetType
   * @return targetType
   */
  
  @Schema(name = "targetType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetType")
  public @Nullable String getTargetType() {
    return targetType;
  }

  public void setTargetType(@Nullable String targetType) {
    this.targetType = targetType;
  }

  public ActivityResponse targetLegacyId(@Nullable String targetLegacyId) {
    this.targetLegacyId = targetLegacyId;
    return this;
  }

  /**
   * Get targetLegacyId
   * @return targetLegacyId
   */
  
  @Schema(name = "targetLegacyId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetLegacyId")
  public @Nullable String getTargetLegacyId() {
    return targetLegacyId;
  }

  public void setTargetLegacyId(@Nullable String targetLegacyId) {
    this.targetLegacyId = targetLegacyId;
  }

  public ActivityResponse targetDescription(@Nullable String targetDescription) {
    this.targetDescription = targetDescription;
    return this;
  }

  /**
   * Get targetDescription
   * @return targetDescription
   */
  
  @Schema(name = "targetDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetDescription")
  public @Nullable String getTargetDescription() {
    return targetDescription;
  }

  public void setTargetDescription(@Nullable String targetDescription) {
    this.targetDescription = targetDescription;
  }

  public ActivityResponse targetActive(@Nullable Boolean targetActive) {
    this.targetActive = targetActive;
    return this;
  }

  /**
   * Get targetActive
   * @return targetActive
   */
  
  @Schema(name = "targetActive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetActive")
  public @Nullable Boolean getTargetActive() {
    return targetActive;
  }

  public void setTargetActive(@Nullable Boolean targetActive) {
    this.targetActive = targetActive;
  }

  public ActivityResponse action(@Nullable String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   */
  
  @Schema(name = "action", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("action")
  public @Nullable String getAction() {
    return action;
  }

  public void setAction(@Nullable String action) {
    this.action = action;
  }

  public ActivityResponse slaveEntityId(@Nullable Long slaveEntityId) {
    this.slaveEntityId = slaveEntityId;
    return this;
  }

  /**
   * Get slaveEntityId
   * @return slaveEntityId
   */
  
  @Schema(name = "slaveEntityId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slaveEntityId")
  public @Nullable Long getSlaveEntityId() {
    return slaveEntityId;
  }

  public void setSlaveEntityId(@Nullable Long slaveEntityId) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

