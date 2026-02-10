package org.openapitools.model;

import org.openapitools.model.ApplicationMiniResponse;
import org.openapitools.model.AssetResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Leaderboard  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private String rankType;

 /**
  * One of GLOBAL, FRIENDS, LOCAL, SEARCH, CUSTOM
  */
  @ApiModelProperty(value = "One of GLOBAL, FRIENDS, LOCAL, SEARCH, CUSTOM")

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

  @Valid

  private AssetResponse iconAsset;

  @ApiModelProperty(value = "")

  @Valid

  private AssetResponse bannerAsset;

  @ApiModelProperty(value = "")

  @Valid

  private ApplicationMiniResponse application;

  @ApiModelProperty(value = "")

  private String metaData;

  @ApiModelProperty(value = "")

  private Boolean active;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Leaderboard id(Long id) {
    this.id = id;
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

  public Leaderboard rankType(String rankType) {
    this.rankType = rankType;
    return this;
  }

 /**
   * One of GLOBAL, FRIENDS, LOCAL, SEARCH, CUSTOM
   * @return rankMode
  **/
  @JsonProperty("rankMode")
  public String getRankMode() {
    return rankMode;
  }

  public void setRankMode(String rankMode) {
    this.rankMode = rankMode;
  }

  public Leaderboard rankMode(String rankMode) {
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

  public Leaderboard sortType(String sortType) {
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

  public Leaderboard limitation(Integer limitation) {
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

  public Leaderboard title(String title) {
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

  public Leaderboard description(String description) {
    this.description = description;
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

  public Leaderboard iconAsset(AssetResponse iconAsset) {
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

  public Leaderboard bannerAsset(AssetResponse bannerAsset) {
    this.bannerAsset = bannerAsset;
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

  public Leaderboard application(ApplicationMiniResponse application) {
    this.application = application;
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

  public Leaderboard metaData(String metaData) {
    this.metaData = metaData;
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

  public Leaderboard active(Boolean active) {
    this.active = active;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

