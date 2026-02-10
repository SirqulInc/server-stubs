package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ActivityResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ActivityResponse   {
  @JsonProperty("activityId")
  
  private Long activityId;

  @JsonProperty("created")
  
  private Long created;

  @JsonProperty("appKey")
  
  private String appKey;

  @JsonProperty("targetId")
  
  private Long targetId;

  @JsonProperty("targetType")
  
  private String targetType;

  @JsonProperty("targetLegacyId")
  
  private String targetLegacyId;

  @JsonProperty("targetDescription")
  
  private String targetDescription;

  @JsonProperty("targetActive")
  
  private Boolean targetActive;

  @JsonProperty("action")
  
  private String action;

  @JsonProperty("slaveEntityId")
  
  private Long slaveEntityId;

  public ActivityResponse activityId(Long activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * Get activityId
   * @return activityId
  **/
  public Long getActivityId() {
    return activityId;
  }

  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }

  public ActivityResponse created(Long created) {
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

  public ActivityResponse appKey(String appKey) {
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

  public ActivityResponse targetId(Long targetId) {
    this.targetId = targetId;
    return this;
  }

   /**
   * Get targetId
   * @return targetId
  **/
  public Long getTargetId() {
    return targetId;
  }

  public void setTargetId(Long targetId) {
    this.targetId = targetId;
  }

  public ActivityResponse targetType(String targetType) {
    this.targetType = targetType;
    return this;
  }

   /**
   * Get targetType
   * @return targetType
  **/
  public String getTargetType() {
    return targetType;
  }

  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }

  public ActivityResponse targetLegacyId(String targetLegacyId) {
    this.targetLegacyId = targetLegacyId;
    return this;
  }

   /**
   * Get targetLegacyId
   * @return targetLegacyId
  **/
  public String getTargetLegacyId() {
    return targetLegacyId;
  }

  public void setTargetLegacyId(String targetLegacyId) {
    this.targetLegacyId = targetLegacyId;
  }

  public ActivityResponse targetDescription(String targetDescription) {
    this.targetDescription = targetDescription;
    return this;
  }

   /**
   * Get targetDescription
   * @return targetDescription
  **/
  public String getTargetDescription() {
    return targetDescription;
  }

  public void setTargetDescription(String targetDescription) {
    this.targetDescription = targetDescription;
  }

  public ActivityResponse targetActive(Boolean targetActive) {
    this.targetActive = targetActive;
    return this;
  }

   /**
   * Get targetActive
   * @return targetActive
  **/
  public Boolean getTargetActive() {
    return targetActive;
  }

  public void setTargetActive(Boolean targetActive) {
    this.targetActive = targetActive;
  }

  public ActivityResponse action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public ActivityResponse slaveEntityId(Long slaveEntityId) {
    this.slaveEntityId = slaveEntityId;
    return this;
  }

   /**
   * Get slaveEntityId
   * @return slaveEntityId
  **/
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
    return Objects.equals(activityId, activityResponse.activityId) &&
        Objects.equals(created, activityResponse.created) &&
        Objects.equals(appKey, activityResponse.appKey) &&
        Objects.equals(targetId, activityResponse.targetId) &&
        Objects.equals(targetType, activityResponse.targetType) &&
        Objects.equals(targetLegacyId, activityResponse.targetLegacyId) &&
        Objects.equals(targetDescription, activityResponse.targetDescription) &&
        Objects.equals(targetActive, activityResponse.targetActive) &&
        Objects.equals(action, activityResponse.action) &&
        Objects.equals(slaveEntityId, activityResponse.slaveEntityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, created, appKey, targetId, targetType, targetLegacyId, targetDescription, targetActive, action, slaveEntityId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

