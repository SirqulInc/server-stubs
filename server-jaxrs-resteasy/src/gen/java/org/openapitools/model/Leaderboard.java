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
public class Leaderboard   {
  
  private Long id;
  private String rankType;
  private String rankMode;
  private String sortType;
  private Integer limitation;
  private String title;
  private String description;
  private AssetResponse iconAsset;
  private AssetResponse bannerAsset;
  private ApplicationMiniResponse application;
  private String metaData;
  private Boolean active;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
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
   * One of GLOBAL, FRIENDS, LOCAL, SEARCH, CUSTOM
   **/
  
  @ApiModelProperty(value = "One of GLOBAL, FRIENDS, LOCAL, SEARCH, CUSTOM")
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
  @JsonProperty("application")
  @Valid
  public ApplicationMiniResponse getApplication() {
    return application;
  }
  public void setApplication(ApplicationMiniResponse application) {
    this.application = application;
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
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Leaderboard leaderboard = (Leaderboard) o;
    return Objects.equals(this.id, leaderboard.id) &&
        Objects.equals(this.rankType, leaderboard.rankType) &&
        Objects.equals(this.rankMode, leaderboard.rankMode) &&
        Objects.equals(this.sortType, leaderboard.sortType) &&
        Objects.equals(this.limitation, leaderboard.limitation) &&
        Objects.equals(this.title, leaderboard.title) &&
        Objects.equals(this.description, leaderboard.description) &&
        Objects.equals(this.iconAsset, leaderboard.iconAsset) &&
        Objects.equals(this.bannerAsset, leaderboard.bannerAsset) &&
        Objects.equals(this.application, leaderboard.application) &&
        Objects.equals(this.metaData, leaderboard.metaData) &&
        Objects.equals(this.active, leaderboard.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, rankType, rankMode, sortType, limitation, title, description, iconAsset, bannerAsset, application, metaData, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Leaderboard {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rankType: ").append(toIndentedString(rankType)).append("\n");
    sb.append("    rankMode: ").append(toIndentedString(rankMode)).append("\n");
    sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
    sb.append("    limitation: ").append(toIndentedString(limitation)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconAsset: ").append(toIndentedString(iconAsset)).append("\n");
    sb.append("    bannerAsset: ").append(toIndentedString(bannerAsset)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

