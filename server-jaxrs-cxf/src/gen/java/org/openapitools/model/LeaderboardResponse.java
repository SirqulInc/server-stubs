package org.openapitools.model;

import org.openapitools.model.ApplicationMiniResponse;
import org.openapitools.model.AssetResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LeaderboardResponse  {
  
  @ApiModelProperty(value = "")

  private Long leaderboardId;

  @ApiModelProperty(value = "")

  private String rankType;

  @ApiModelProperty(value = "")

  private String rankMode;

  @ApiModelProperty(value = "")

  private String sortType;

  @ApiModelProperty(value = "")

  private Integer limitation;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private String metaData;

  @ApiModelProperty(value = "")

  @Valid

  private AssetResponse iconAsset;

  @ApiModelProperty(value = "")

  @Valid

  private AssetResponse bannerAsset;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  @Valid

  private ApplicationMiniResponse application;
 /**
   * Get leaderboardId
   * @return leaderboardId
  **/
  @JsonProperty("leaderboardId")
  public Long getLeaderboardId() {
    return leaderboardId;
  }

  public void setLeaderboardId(Long leaderboardId) {
    this.leaderboardId = leaderboardId;
  }

  public LeaderboardResponse leaderboardId(Long leaderboardId) {
    this.leaderboardId = leaderboardId;
    return this;
  }

 /**
   * Get rankType
   * @return rankType
  **/
  @JsonProperty("rankType")
  public String getRankType() {
    return rankType;
  }

  public void setRankType(String rankType) {
    this.rankType = rankType;
  }

  public LeaderboardResponse rankType(String rankType) {
    this.rankType = rankType;
    return this;
  }

 /**
   * Get rankMode
   * @return rankMode
  **/
  @JsonProperty("rankMode")
  public String getRankMode() {
    return rankMode;
  }

  public void setRankMode(String rankMode) {
    this.rankMode = rankMode;
  }

  public LeaderboardResponse rankMode(String rankMode) {
    this.rankMode = rankMode;
    return this;
  }

 /**
   * Get sortType
   * @return sortType
  **/
  @JsonProperty("sortType")
  public String getSortType() {
    return sortType;
  }

  public void setSortType(String sortType) {
    this.sortType = sortType;
  }

  public LeaderboardResponse sortType(String sortType) {
    this.sortType = sortType;
    return this;
  }

 /**
   * Get limitation
   * @return limitation
  **/
  @JsonProperty("limitation")
  public Integer getLimitation() {
    return limitation;
  }

  public void setLimitation(Integer limitation) {
    this.limitation = limitation;
  }

  public LeaderboardResponse limitation(Integer limitation) {
    this.limitation = limitation;
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

  public LeaderboardResponse title(String title) {
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

  public LeaderboardResponse description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get metaData
   * @return metaData
  **/
  @JsonProperty("metaData")
  public String getMetaData() {
    return metaData;
  }

  public void setMetaData(String metaData) {
    this.metaData = metaData;
  }

  public LeaderboardResponse metaData(String metaData) {
    this.metaData = metaData;
    return this;
  }

 /**
   * Get iconAsset
   * @return iconAsset
  **/
  @JsonProperty("iconAsset")
  public AssetResponse getIconAsset() {
    return iconAsset;
  }

  public void setIconAsset(AssetResponse iconAsset) {
    this.iconAsset = iconAsset;
  }

  public LeaderboardResponse iconAsset(AssetResponse iconAsset) {
    this.iconAsset = iconAsset;
    return this;
  }

 /**
   * Get bannerAsset
   * @return bannerAsset
  **/
  @JsonProperty("bannerAsset")
  public AssetResponse getBannerAsset() {
    return bannerAsset;
  }

  public void setBannerAsset(AssetResponse bannerAsset) {
    this.bannerAsset = bannerAsset;
  }

  public LeaderboardResponse bannerAsset(AssetResponse bannerAsset) {
    this.bannerAsset = bannerAsset;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public LeaderboardResponse active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get application
   * @return application
  **/
  @JsonProperty("application")
  public ApplicationMiniResponse getApplication() {
    return application;
  }

  public void setApplication(ApplicationMiniResponse application) {
    this.application = application;
  }

  public LeaderboardResponse application(ApplicationMiniResponse application) {
    this.application = application;
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
    LeaderboardResponse leaderboardResponse = (LeaderboardResponse) o;
    return Objects.equals(this.leaderboardId, leaderboardResponse.leaderboardId) &&
        Objects.equals(this.rankType, leaderboardResponse.rankType) &&
        Objects.equals(this.rankMode, leaderboardResponse.rankMode) &&
        Objects.equals(this.sortType, leaderboardResponse.sortType) &&
        Objects.equals(this.limitation, leaderboardResponse.limitation) &&
        Objects.equals(this.title, leaderboardResponse.title) &&
        Objects.equals(this.description, leaderboardResponse.description) &&
        Objects.equals(this.metaData, leaderboardResponse.metaData) &&
        Objects.equals(this.iconAsset, leaderboardResponse.iconAsset) &&
        Objects.equals(this.bannerAsset, leaderboardResponse.bannerAsset) &&
        Objects.equals(this.active, leaderboardResponse.active) &&
        Objects.equals(this.application, leaderboardResponse.application);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leaderboardId, rankType, rankMode, sortType, limitation, title, description, metaData, iconAsset, bannerAsset, active, application);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaderboardResponse {\n");
    
    sb.append("    leaderboardId: ").append(toIndentedString(leaderboardId)).append("\n");
    sb.append("    rankType: ").append(toIndentedString(rankType)).append("\n");
    sb.append("    rankMode: ").append(toIndentedString(rankMode)).append("\n");
    sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
    sb.append("    limitation: ").append(toIndentedString(limitation)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    iconAsset: ").append(toIndentedString(iconAsset)).append("\n");
    sb.append("    bannerAsset: ").append(toIndentedString(bannerAsset)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
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

