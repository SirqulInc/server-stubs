package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AssetShortResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AchievementProgressResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AchievementProgressResponse {

  private @Nullable Long achievementId;

  private @Nullable Long achievementTierId;

  private @Nullable String title;

  private @Nullable String description;

  private @Nullable AssetShortResponse icon;

  private @Nullable Boolean completed;

  private @Nullable Long progressCount;

  private @Nullable Long goalCount;

  private @Nullable Long dateUpdated;

  public AchievementProgressResponse achievementId(@Nullable Long achievementId) {
    this.achievementId = achievementId;
    return this;
  }

  /**
   * Get achievementId
   * @return achievementId
   */
  
  @Schema(name = "achievementId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("achievementId")
  public @Nullable Long getAchievementId() {
    return achievementId;
  }

  public void setAchievementId(@Nullable Long achievementId) {
    this.achievementId = achievementId;
  }

  public AchievementProgressResponse achievementTierId(@Nullable Long achievementTierId) {
    this.achievementTierId = achievementTierId;
    return this;
  }

  /**
   * Get achievementTierId
   * @return achievementTierId
   */
  
  @Schema(name = "achievementTierId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("achievementTierId")
  public @Nullable Long getAchievementTierId() {
    return achievementTierId;
  }

  public void setAchievementTierId(@Nullable Long achievementTierId) {
    this.achievementTierId = achievementTierId;
  }

  public AchievementProgressResponse title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public AchievementProgressResponse description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public AchievementProgressResponse icon(@Nullable AssetShortResponse icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
   */
  @Valid 
  @Schema(name = "icon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("icon")
  public @Nullable AssetShortResponse getIcon() {
    return icon;
  }

  public void setIcon(@Nullable AssetShortResponse icon) {
    this.icon = icon;
  }

  public AchievementProgressResponse completed(@Nullable Boolean completed) {
    this.completed = completed;
    return this;
  }

  /**
   * Get completed
   * @return completed
   */
  
  @Schema(name = "completed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completed")
  public @Nullable Boolean getCompleted() {
    return completed;
  }

  public void setCompleted(@Nullable Boolean completed) {
    this.completed = completed;
  }

  public AchievementProgressResponse progressCount(@Nullable Long progressCount) {
    this.progressCount = progressCount;
    return this;
  }

  /**
   * Get progressCount
   * @return progressCount
   */
  
  @Schema(name = "progressCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("progressCount")
  public @Nullable Long getProgressCount() {
    return progressCount;
  }

  public void setProgressCount(@Nullable Long progressCount) {
    this.progressCount = progressCount;
  }

  public AchievementProgressResponse goalCount(@Nullable Long goalCount) {
    this.goalCount = goalCount;
    return this;
  }

  /**
   * Get goalCount
   * @return goalCount
   */
  
  @Schema(name = "goalCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("goalCount")
  public @Nullable Long getGoalCount() {
    return goalCount;
  }

  public void setGoalCount(@Nullable Long goalCount) {
    this.goalCount = goalCount;
  }

  public AchievementProgressResponse dateUpdated(@Nullable Long dateUpdated) {
    this.dateUpdated = dateUpdated;
    return this;
  }

  /**
   * Get dateUpdated
   * @return dateUpdated
   */
  
  @Schema(name = "dateUpdated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateUpdated")
  public @Nullable Long getDateUpdated() {
    return dateUpdated;
  }

  public void setDateUpdated(@Nullable Long dateUpdated) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

