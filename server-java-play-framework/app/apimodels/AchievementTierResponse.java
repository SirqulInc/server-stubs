package apimodels;

import apimodels.AssetShortResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AchievementTierResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AchievementTierResponse   {
  @JsonProperty("achievementTierId")
  
  private Long achievementTierId;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("goalCount")
  
  private Long goalCount;

  @JsonProperty("icon")
  @Valid

  private AssetShortResponse icon;

  @JsonProperty("missionId")
  
  private Long missionId;

  @JsonProperty("gameId")
  
  private Long gameId;

  @JsonProperty("packId")
  
  private Long packId;

  @JsonProperty("gameLevelId")
  
  private Long gameLevelId;

  @JsonProperty("gameObjectId")
  
  private Long gameObjectId;

  public AchievementTierResponse achievementTierId(Long achievementTierId) {
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

  public AchievementTierResponse title(String title) {
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

  public AchievementTierResponse description(String description) {
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

  public AchievementTierResponse goalCount(Long goalCount) {
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

  public AchievementTierResponse icon(AssetShortResponse icon) {
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

  public AchievementTierResponse missionId(Long missionId) {
    this.missionId = missionId;
    return this;
  }

   /**
   * Get missionId
   * @return missionId
  **/
  public Long getMissionId() {
    return missionId;
  }

  public void setMissionId(Long missionId) {
    this.missionId = missionId;
  }

  public AchievementTierResponse gameId(Long gameId) {
    this.gameId = gameId;
    return this;
  }

   /**
   * Get gameId
   * @return gameId
  **/
  public Long getGameId() {
    return gameId;
  }

  public void setGameId(Long gameId) {
    this.gameId = gameId;
  }

  public AchievementTierResponse packId(Long packId) {
    this.packId = packId;
    return this;
  }

   /**
   * Get packId
   * @return packId
  **/
  public Long getPackId() {
    return packId;
  }

  public void setPackId(Long packId) {
    this.packId = packId;
  }

  public AchievementTierResponse gameLevelId(Long gameLevelId) {
    this.gameLevelId = gameLevelId;
    return this;
  }

   /**
   * Get gameLevelId
   * @return gameLevelId
  **/
  public Long getGameLevelId() {
    return gameLevelId;
  }

  public void setGameLevelId(Long gameLevelId) {
    this.gameLevelId = gameLevelId;
  }

  public AchievementTierResponse gameObjectId(Long gameObjectId) {
    this.gameObjectId = gameObjectId;
    return this;
  }

   /**
   * Get gameObjectId
   * @return gameObjectId
  **/
  public Long getGameObjectId() {
    return gameObjectId;
  }

  public void setGameObjectId(Long gameObjectId) {
    this.gameObjectId = gameObjectId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AchievementTierResponse achievementTierResponse = (AchievementTierResponse) o;
    return Objects.equals(achievementTierId, achievementTierResponse.achievementTierId) &&
        Objects.equals(title, achievementTierResponse.title) &&
        Objects.equals(description, achievementTierResponse.description) &&
        Objects.equals(goalCount, achievementTierResponse.goalCount) &&
        Objects.equals(icon, achievementTierResponse.icon) &&
        Objects.equals(missionId, achievementTierResponse.missionId) &&
        Objects.equals(gameId, achievementTierResponse.gameId) &&
        Objects.equals(packId, achievementTierResponse.packId) &&
        Objects.equals(gameLevelId, achievementTierResponse.gameLevelId) &&
        Objects.equals(gameObjectId, achievementTierResponse.gameObjectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(achievementTierId, title, description, goalCount, icon, missionId, gameId, packId, gameLevelId, gameObjectId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AchievementTierResponse {\n");
    
    sb.append("    achievementTierId: ").append(toIndentedString(achievementTierId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    goalCount: ").append(toIndentedString(goalCount)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    missionId: ").append(toIndentedString(missionId)).append("\n");
    sb.append("    gameId: ").append(toIndentedString(gameId)).append("\n");
    sb.append("    packId: ").append(toIndentedString(packId)).append("\n");
    sb.append("    gameLevelId: ").append(toIndentedString(gameLevelId)).append("\n");
    sb.append("    gameObjectId: ").append(toIndentedString(gameObjectId)).append("\n");
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

