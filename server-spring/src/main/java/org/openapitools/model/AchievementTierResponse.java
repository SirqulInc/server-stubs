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
 * AchievementTierResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AchievementTierResponse {

  private @Nullable Long achievementTierId;

  private @Nullable String title;

  private @Nullable String description;

  private @Nullable Long goalCount;

  private @Nullable AssetShortResponse icon;

  private @Nullable Long missionId;

  private @Nullable Long gameId;

  private @Nullable Long packId;

  private @Nullable Long gameLevelId;

  private @Nullable Long gameObjectId;

  public AchievementTierResponse achievementTierId(@Nullable Long achievementTierId) {
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

  public AchievementTierResponse title(@Nullable String title) {
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

  public AchievementTierResponse description(@Nullable String description) {
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

  public AchievementTierResponse goalCount(@Nullable Long goalCount) {
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

  public AchievementTierResponse icon(@Nullable AssetShortResponse icon) {
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

  public AchievementTierResponse missionId(@Nullable Long missionId) {
    this.missionId = missionId;
    return this;
  }

  /**
   * Get missionId
   * @return missionId
   */
  
  @Schema(name = "missionId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("missionId")
  public @Nullable Long getMissionId() {
    return missionId;
  }

  public void setMissionId(@Nullable Long missionId) {
    this.missionId = missionId;
  }

  public AchievementTierResponse gameId(@Nullable Long gameId) {
    this.gameId = gameId;
    return this;
  }

  /**
   * Get gameId
   * @return gameId
   */
  
  @Schema(name = "gameId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gameId")
  public @Nullable Long getGameId() {
    return gameId;
  }

  public void setGameId(@Nullable Long gameId) {
    this.gameId = gameId;
  }

  public AchievementTierResponse packId(@Nullable Long packId) {
    this.packId = packId;
    return this;
  }

  /**
   * Get packId
   * @return packId
   */
  
  @Schema(name = "packId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("packId")
  public @Nullable Long getPackId() {
    return packId;
  }

  public void setPackId(@Nullable Long packId) {
    this.packId = packId;
  }

  public AchievementTierResponse gameLevelId(@Nullable Long gameLevelId) {
    this.gameLevelId = gameLevelId;
    return this;
  }

  /**
   * Get gameLevelId
   * @return gameLevelId
   */
  
  @Schema(name = "gameLevelId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gameLevelId")
  public @Nullable Long getGameLevelId() {
    return gameLevelId;
  }

  public void setGameLevelId(@Nullable Long gameLevelId) {
    this.gameLevelId = gameLevelId;
  }

  public AchievementTierResponse gameObjectId(@Nullable Long gameObjectId) {
    this.gameObjectId = gameObjectId;
    return this;
  }

  /**
   * Get gameObjectId
   * @return gameObjectId
   */
  
  @Schema(name = "gameObjectId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gameObjectId")
  public @Nullable Long getGameObjectId() {
    return gameObjectId;
  }

  public void setGameObjectId(@Nullable Long gameObjectId) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

