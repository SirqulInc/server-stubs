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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AchievementTierResponse   {
  
  private Long achievementTierId;
  private String title;
  private String description;
  private Long goalCount;
  private AssetShortResponse icon;
  private Long missionId;
  private Long gameId;
  private Long packId;
  private Long gameLevelId;
  private Long gameObjectId;

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
  @JsonProperty("missionId")
  public Long getMissionId() {
    return missionId;
  }
  public void setMissionId(Long missionId) {
    this.missionId = missionId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gameId")
  public Long getGameId() {
    return gameId;
  }
  public void setGameId(Long gameId) {
    this.gameId = gameId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("packId")
  public Long getPackId() {
    return packId;
  }
  public void setPackId(Long packId) {
    this.packId = packId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gameLevelId")
  public Long getGameLevelId() {
    return gameLevelId;
  }
  public void setGameLevelId(Long gameLevelId) {
    this.gameLevelId = gameLevelId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gameObjectId")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

