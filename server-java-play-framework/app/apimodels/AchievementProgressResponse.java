package apimodels;

import apimodels.AssetShortResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AchievementProgressResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AchievementProgressResponse   {
  @JsonProperty("achievementId")
  
  private Long achievementId;

  @JsonProperty("achievementTierId")
  
  private Long achievementTierId;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("icon")
  @Valid

  private AssetShortResponse icon;

  @JsonProperty("completed")
  
  private Boolean completed;

  @JsonProperty("progressCount")
  
  private Long progressCount;

  @JsonProperty("goalCount")
  
  private Long goalCount;

  @JsonProperty("dateUpdated")
  
  private Long dateUpdated;

  public AchievementProgressResponse achievementId(Long achievementId) {
    this.achievementId = achievementId;
    return this;
  }

   /**
   * Get achievementId
   * @return achievementId
  **/
  public Long getAchievementId() {
    return achievementId;
  }

  public void setAchievementId(Long achievementId) {
    this.achievementId = achievementId;
  }

  public AchievementProgressResponse achievementTierId(Long achievementTierId) {
    this.achievementTierId = achievementTierId;
    return this;
  }

   /**
   * Get achievementTierId
   * @return achievementTierId
  **/
  public Long getAchievementTierId() {
    return achievementTierId;
  }

  public void setAchievementTierId(Long achievementTierId) {
    this.achievementTierId = achievementTierId;
  }

  public AchievementProgressResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AchievementProgressResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AchievementProgressResponse icon(AssetShortResponse icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  public AssetShortResponse getIcon() {
    return icon;
  }

  public void setIcon(AssetShortResponse icon) {
    this.icon = icon;
  }

  public AchievementProgressResponse completed(Boolean completed) {
    this.completed = completed;
    return this;
  }

   /**
   * Get completed
   * @return completed
  **/
  public Boolean getCompleted() {
    return completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  public AchievementProgressResponse progressCount(Long progressCount) {
    this.progressCount = progressCount;
    return this;
  }

   /**
   * Get progressCount
   * @return progressCount
  **/
  public Long getProgressCount() {
    return progressCount;
  }

  public void setProgressCount(Long progressCount) {
    this.progressCount = progressCount;
  }

  public AchievementProgressResponse goalCount(Long goalCount) {
    this.goalCount = goalCount;
    return this;
  }

   /**
   * Get goalCount
   * @return goalCount
  **/
  public Long getGoalCount() {
    return goalCount;
  }

  public void setGoalCount(Long goalCount) {
    this.goalCount = goalCount;
  }

  public AchievementProgressResponse dateUpdated(Long dateUpdated) {
    this.dateUpdated = dateUpdated;
    return this;
  }

   /**
   * Get dateUpdated
   * @return dateUpdated
  **/
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
    return Objects.equals(achievementId, achievementProgressResponse.achievementId) &&
        Objects.equals(achievementTierId, achievementProgressResponse.achievementTierId) &&
        Objects.equals(title, achievementProgressResponse.title) &&
        Objects.equals(description, achievementProgressResponse.description) &&
        Objects.equals(icon, achievementProgressResponse.icon) &&
        Objects.equals(completed, achievementProgressResponse.completed) &&
        Objects.equals(progressCount, achievementProgressResponse.progressCount) &&
        Objects.equals(goalCount, achievementProgressResponse.goalCount) &&
        Objects.equals(dateUpdated, achievementProgressResponse.dateUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(achievementId, achievementTierId, title, description, icon, completed, progressCount, goalCount, dateUpdated);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

