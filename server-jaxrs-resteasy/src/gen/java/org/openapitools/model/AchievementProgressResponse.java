package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AssetShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AchievementProgressResponse   {
  
  private Long achievementId;
  private Long achievementTierId;
  private String title;
  private String description;
  private AssetShortResponse icon;
  private Boolean completed;
  private Long progressCount;
  private Long goalCount;
  private Long dateUpdated;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("achievementId")
  public Long getAchievementId() {
    return achievementId;
  }
  public void setAchievementId(Long achievementId) {
    this.achievementId = achievementId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("achievementTierId")
  public Long getAchievementTierId() {
    return achievementTierId;
  }
  public void setAchievementTierId(Long achievementTierId) {
    this.achievementTierId = achievementTierId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("icon")
  @Valid
  public AssetShortResponse getIcon() {
    return icon;
  }
  public void setIcon(AssetShortResponse icon) {
    this.icon = icon;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("completed")
  public Boolean getCompleted() {
    return completed;
  }
  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("progressCount")
  public Long getProgressCount() {
    return progressCount;
  }
  public void setProgressCount(Long progressCount) {
    this.progressCount = progressCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("goalCount")
  public Long getGoalCount() {
    return goalCount;
  }
  public void setGoalCount(Long goalCount) {
    this.goalCount = goalCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dateUpdated")
  public Long getDateUpdated() {
    return dateUpdated;
  }
  public void setDateUpdated(Long dateUpdated) {
    this.dateUpdated = dateUpdated;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

