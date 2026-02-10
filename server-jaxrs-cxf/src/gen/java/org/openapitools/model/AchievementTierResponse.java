package org.openapitools.model;

import org.openapitools.model.AssetShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AchievementTierResponse  {
  
  @ApiModelProperty(value = "")

  private Long achievementTierId;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private Long goalCount;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse icon;

  @ApiModelProperty(value = "")

  private Long missionId;

  @ApiModelProperty(value = "")

  private Long gameId;

  @ApiModelProperty(value = "")

  private Long packId;

  @ApiModelProperty(value = "")

  private Long gameLevelId;

  @ApiModelProperty(value = "")

  private Long gameObjectId;
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

  public AchievementTierResponse achievementTierId(Long achievementTierId) {
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

  public AchievementTierResponse title(String title) {
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

  public AchievementTierResponse description(String description) {
    this.description = description;
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

  public AchievementTierResponse goalCount(Long goalCount) {
    this.goalCount = goalCount;
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

  public AchievementTierResponse icon(AssetShortResponse icon) {
    this.icon = icon;
    return this;
  }

 /**
   * Get missionId
   * @return missionId
  **/
  @JsonProperty("missionId")
  public Long getMissionId() {
    return missionId;
  }

  public void setMissionId(Long missionId) {
    this.missionId = missionId;
  }

  public AchievementTierResponse missionId(Long missionId) {
    this.missionId = missionId;
    return this;
  }

 /**
   * Get gameId
   * @return gameId
  **/
  @JsonProperty("gameId")
  public Long getGameId() {
    return gameId;
  }

  public void setGameId(Long gameId) {
    this.gameId = gameId;
  }

  public AchievementTierResponse gameId(Long gameId) {
    this.gameId = gameId;
    return this;
  }

 /**
   * Get packId
   * @return packId
  **/
  @JsonProperty("packId")
  public Long getPackId() {
    return packId;
  }

  public void setPackId(Long packId) {
    this.packId = packId;
  }

  public AchievementTierResponse packId(Long packId) {
    this.packId = packId;
    return this;
  }

 /**
   * Get gameLevelId
   * @return gameLevelId
  **/
  @JsonProperty("gameLevelId")
  public Long getGameLevelId() {
    return gameLevelId;
  }

  public void setGameLevelId(Long gameLevelId) {
    this.gameLevelId = gameLevelId;
  }

  public AchievementTierResponse gameLevelId(Long gameLevelId) {
    this.gameLevelId = gameLevelId;
    return this;
  }

 /**
   * Get gameObjectId
   * @return gameObjectId
  **/
  @JsonProperty("gameObjectId")
  public Long getGameObjectId() {
    return gameObjectId;
  }

  public void setGameObjectId(Long gameObjectId) {
    this.gameObjectId = gameObjectId;
  }

  public AchievementTierResponse gameObjectId(Long gameObjectId) {
    this.gameObjectId = gameObjectId;
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
    AchievementTierResponse achievementTierResponse = (AchievementTierResponse) o;
    return Objects.equals(this.achievementTierId, achievementTierResponse.achievementTierId) &&
        Objects.equals(this.title, achievementTierResponse.title) &&
        Objects.equals(this.description, achievementTierResponse.description) &&
        Objects.equals(this.goalCount, achievementTierResponse.goalCount) &&
        Objects.equals(this.icon, achievementTierResponse.icon) &&
        Objects.equals(this.missionId, achievementTierResponse.missionId) &&
        Objects.equals(this.gameId, achievementTierResponse.gameId) &&
        Objects.equals(this.packId, achievementTierResponse.packId) &&
        Objects.equals(this.gameLevelId, achievementTierResponse.gameLevelId) &&
        Objects.equals(this.gameObjectId, achievementTierResponse.gameObjectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(achievementTierId, title, description, goalCount, icon, missionId, gameId, packId, gameLevelId, gameObjectId);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

