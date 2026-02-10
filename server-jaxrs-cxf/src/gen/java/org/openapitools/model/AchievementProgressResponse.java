package org.openapitools.model;

import org.openapitools.model.AssetShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AchievementProgressResponse  {
  
  @ApiModelProperty(value = "")

  private Long achievementId;

  @ApiModelProperty(value = "")

  private Long achievementTierId;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse icon;

  @ApiModelProperty(value = "")

  private Boolean completed;

  @ApiModelProperty(value = "")

  private Long progressCount;

  @ApiModelProperty(value = "")

  private Long goalCount;

  @ApiModelProperty(value = "")

  private Long dateUpdated;
 /**
   * Get achievementId
   * @return achievementId
  **/
  @JsonProperty("achievementId")
  public Long getAchievementId() {
    return achievementId;
  }

  public void setAchievementId(Long achievementId) {
    this.achievementId = achievementId;
  }

  public AchievementProgressResponse achievementId(Long achievementId) {
    this.achievementId = achievementId;
    return this;
  }

 /**
   * Get achievementTierId
   * @return achievementTierId
  **/
  @JsonProperty("achievementTierId")
  public Long getAchievementTierId() {
    return achievementTierId;
  }

  public void setAchievementTierId(Long achievementTierId) {
    this.achievementTierId = achievementTierId;
  }

  public AchievementProgressResponse achievementTierId(Long achievementTierId) {
    this.achievementTierId = achievementTierId;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AchievementProgressResponse title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AchievementProgressResponse description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get icon
   * @return icon
  **/
  @JsonProperty("icon")
  public AssetShortResponse getIcon() {
    return icon;
  }

  public void setIcon(AssetShortResponse icon) {
    this.icon = icon;
  }

  public AchievementProgressResponse icon(AssetShortResponse icon) {
    this.icon = icon;
    return this;
  }

 /**
   * Get completed
   * @return completed
  **/
  @JsonProperty("completed")
  public Boolean getCompleted() {
    return completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  public AchievementProgressResponse completed(Boolean completed) {
    this.completed = completed;
    return this;
  }

 /**
   * Get progressCount
   * @return progressCount
  **/
  @JsonProperty("progressCount")
  public Long getProgressCount() {
    return progressCount;
  }

  public void setProgressCount(Long progressCount) {
    this.progressCount = progressCount;
  }

  public AchievementProgressResponse progressCount(Long progressCount) {
    this.progressCount = progressCount;
    return this;
  }

 /**
   * Get goalCount
   * @return goalCount
  **/
  @JsonProperty("goalCount")
  public Long getGoalCount() {
    return goalCount;
  }

  public void setGoalCount(Long goalCount) {
    this.goalCount = goalCount;
  }

  public AchievementProgressResponse goalCount(Long goalCount) {
    this.goalCount = goalCount;
    return this;
  }

 /**
   * Get dateUpdated
   * @return dateUpdated
  **/
  @JsonProperty("dateUpdated")
  public Long getDateUpdated() {
    return dateUpdated;
  }

  public void setDateUpdated(Long dateUpdated) {
    this.dateUpdated = dateUpdated;
  }

  public AchievementProgressResponse dateUpdated(Long dateUpdated) {
    this.dateUpdated = dateUpdated;
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
    AchievementProgressResponse achievementProgressResponse = (AchievementProgressResponse) o;
    return Objects.equals(this.achievementId, achievementProgressResponse.achievementId) &&
        Objects.equals(this.achievementTierId, achievementProgressResponse.achievementTierId) &&
        Objects.equals(this.title, achievementProgressResponse.title) &&
        Objects.equals(this.description, achievementProgressResponse.description) &&
        Objects.equals(this.icon, achievementProgressResponse.icon) &&
        Objects.equals(this.completed, achievementProgressResponse.completed) &&
        Objects.equals(this.progressCount, achievementProgressResponse.progressCount) &&
        Objects.equals(this.goalCount, achievementProgressResponse.goalCount) &&
        Objects.equals(this.dateUpdated, achievementProgressResponse.dateUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(achievementId, achievementTierId, title, description, icon, completed, progressCount, goalCount, dateUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AchievementProgressResponse {\n");
    
    sb.append("    achievementId: ").append(toIndentedString(achievementId)).append("\n");
    sb.append("    achievementTierId: ").append(toIndentedString(achievementTierId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    progressCount: ").append(toIndentedString(progressCount)).append("\n");
    sb.append("    goalCount: ").append(toIndentedString(goalCount)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
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

