package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ApplicationMiniResponse;
import org.openapitools.model.AssetResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class LeaderboardResponse   {
  
  private Long leaderboardId;
  private String rankType;
  private String rankMode;
  private String sortType;
  private Integer limitation;
  private String title;
  private String description;
  private String metaData;
  private AssetResponse iconAsset;
  private AssetResponse bannerAsset;
  private Boolean active;
  private ApplicationMiniResponse application;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("leaderboardId")
  public Long getLeaderboardId() {
    return leaderboardId;
  }
  public void setLeaderboardId(Long leaderboardId) {
    this.leaderboardId = leaderboardId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rankType")
  public String getRankType() {
    return rankType;
  }
  public void setRankType(String rankType) {
    this.rankType = rankType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rankMode")
  public String getRankMode() {
    return rankMode;
  }
  public void setRankMode(String rankMode) {
    this.rankMode = rankMode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sortType")
  public String getSortType() {
    return sortType;
  }
  public void setSortType(String sortType) {
    this.sortType = sortType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("limitation")
  public Integer getLimitation() {
    return limitation;
  }
  public void setLimitation(Integer limitation) {
    this.limitation = limitation;
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
  @JsonProperty("metaData")
  public String getMetaData() {
    return metaData;
  }
  public void setMetaData(String metaData) {
    this.metaData = metaData;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("iconAsset")
  @Valid
  public AssetResponse getIconAsset() {
    return iconAsset;
  }
  public void setIconAsset(AssetResponse iconAsset) {
    this.iconAsset = iconAsset;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bannerAsset")
  @Valid
  public AssetResponse getBannerAsset() {
    return bannerAsset;
  }
  public void setBannerAsset(AssetResponse bannerAsset) {
    this.bannerAsset = bannerAsset;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("application")
  @Valid
  public ApplicationMiniResponse getApplication() {
    return application;
  }
  public void setApplication(ApplicationMiniResponse application) {
    this.application = application;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

