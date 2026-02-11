package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ApplicationMiniResponse;
import org.openapitools.model.AssetResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LeaderboardResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class LeaderboardResponse {

  private @Nullable Long leaderboardId;

  private @Nullable String rankType;

  private @Nullable String rankMode;

  private @Nullable String sortType;

  private @Nullable Integer limitation;

  private @Nullable String title;

  private @Nullable String description;

  private @Nullable String metaData;

  private @Nullable AssetResponse iconAsset;

  private @Nullable AssetResponse bannerAsset;

  private @Nullable Boolean active;

  private @Nullable ApplicationMiniResponse application;

  public LeaderboardResponse leaderboardId(@Nullable Long leaderboardId) {
    this.leaderboardId = leaderboardId;
    return this;
  }

  /**
   * Get leaderboardId
   * @return leaderboardId
   */
  
  @Schema(name = "leaderboardId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("leaderboardId")
  public @Nullable Long getLeaderboardId() {
    return leaderboardId;
  }

  public void setLeaderboardId(@Nullable Long leaderboardId) {
    this.leaderboardId = leaderboardId;
  }

  public LeaderboardResponse rankType(@Nullable String rankType) {
    this.rankType = rankType;
    return this;
  }

  /**
   * Get rankType
   * @return rankType
   */
  
  @Schema(name = "rankType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rankType")
  public @Nullable String getRankType() {
    return rankType;
  }

  public void setRankType(@Nullable String rankType) {
    this.rankType = rankType;
  }

  public LeaderboardResponse rankMode(@Nullable String rankMode) {
    this.rankMode = rankMode;
    return this;
  }

  /**
   * Get rankMode
   * @return rankMode
   */
  
  @Schema(name = "rankMode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rankMode")
  public @Nullable String getRankMode() {
    return rankMode;
  }

  public void setRankMode(@Nullable String rankMode) {
    this.rankMode = rankMode;
  }

  public LeaderboardResponse sortType(@Nullable String sortType) {
    this.sortType = sortType;
    return this;
  }

  /**
   * Get sortType
   * @return sortType
   */
  
  @Schema(name = "sortType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sortType")
  public @Nullable String getSortType() {
    return sortType;
  }

  public void setSortType(@Nullable String sortType) {
    this.sortType = sortType;
  }

  public LeaderboardResponse limitation(@Nullable Integer limitation) {
    this.limitation = limitation;
    return this;
  }

  /**
   * Get limitation
   * @return limitation
   */
  
  @Schema(name = "limitation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limitation")
  public @Nullable Integer getLimitation() {
    return limitation;
  }

  public void setLimitation(@Nullable Integer limitation) {
    this.limitation = limitation;
  }

  public LeaderboardResponse title(@Nullable String title) {
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

  public LeaderboardResponse description(@Nullable String description) {
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

  public LeaderboardResponse metaData(@Nullable String metaData) {
    this.metaData = metaData;
    return this;
  }

  /**
   * Get metaData
   * @return metaData
   */
  
  @Schema(name = "metaData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metaData")
  public @Nullable String getMetaData() {
    return metaData;
  }

  public void setMetaData(@Nullable String metaData) {
    this.metaData = metaData;
  }

  public LeaderboardResponse iconAsset(@Nullable AssetResponse iconAsset) {
    this.iconAsset = iconAsset;
    return this;
  }

  /**
   * Get iconAsset
   * @return iconAsset
   */
  @Valid 
  @Schema(name = "iconAsset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("iconAsset")
  public @Nullable AssetResponse getIconAsset() {
    return iconAsset;
  }

  public void setIconAsset(@Nullable AssetResponse iconAsset) {
    this.iconAsset = iconAsset;
  }

  public LeaderboardResponse bannerAsset(@Nullable AssetResponse bannerAsset) {
    this.bannerAsset = bannerAsset;
    return this;
  }

  /**
   * Get bannerAsset
   * @return bannerAsset
   */
  @Valid 
  @Schema(name = "bannerAsset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bannerAsset")
  public @Nullable AssetResponse getBannerAsset() {
    return bannerAsset;
  }

  public void setBannerAsset(@Nullable AssetResponse bannerAsset) {
    this.bannerAsset = bannerAsset;
  }

  public LeaderboardResponse active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  public LeaderboardResponse application(@Nullable ApplicationMiniResponse application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
   */
  @Valid 
  @Schema(name = "application", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("application")
  public @Nullable ApplicationMiniResponse getApplication() {
    return application;
  }

  public void setApplication(@Nullable ApplicationMiniResponse application) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

