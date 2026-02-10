package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ApplicationMiniResponse;
import org.openapitools.model.AssetResponse;
import org.openapitools.model.RankListResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LeaderboardFullResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class LeaderboardFullResponse {

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

  private @Nullable RankListResponse leaderboardRankings;

  public LeaderboardFullResponse leaderboardId(@Nullable Long leaderboardId) {
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

  public LeaderboardFullResponse rankType(@Nullable String rankType) {
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

  public LeaderboardFullResponse rankMode(@Nullable String rankMode) {
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

  public LeaderboardFullResponse sortType(@Nullable String sortType) {
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

  public LeaderboardFullResponse limitation(@Nullable Integer limitation) {
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

  public LeaderboardFullResponse title(@Nullable String title) {
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

  public LeaderboardFullResponse description(@Nullable String description) {
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

  public LeaderboardFullResponse metaData(@Nullable String metaData) {
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

  public LeaderboardFullResponse iconAsset(@Nullable AssetResponse iconAsset) {
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

  public LeaderboardFullResponse bannerAsset(@Nullable AssetResponse bannerAsset) {
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

  public LeaderboardFullResponse active(@Nullable Boolean active) {
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

  public LeaderboardFullResponse application(@Nullable ApplicationMiniResponse application) {
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

  public LeaderboardFullResponse leaderboardRankings(@Nullable RankListResponse leaderboardRankings) {
    this.leaderboardRankings = leaderboardRankings;
    return this;
  }

  /**
   * Get leaderboardRankings
   * @return leaderboardRankings
   */
  @Valid 
  @Schema(name = "leaderboardRankings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("leaderboardRankings")
  public @Nullable RankListResponse getLeaderboardRankings() {
    return leaderboardRankings;
  }

  public void setLeaderboardRankings(@Nullable RankListResponse leaderboardRankings) {
    this.leaderboardRankings = leaderboardRankings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaderboardFullResponse leaderboardFullResponse = (LeaderboardFullResponse) o;
    return Objects.equals(this.leaderboardId, leaderboardFullResponse.leaderboardId) &&
        Objects.equals(this.rankType, leaderboardFullResponse.rankType) &&
        Objects.equals(this.rankMode, leaderboardFullResponse.rankMode) &&
        Objects.equals(this.sortType, leaderboardFullResponse.sortType) &&
        Objects.equals(this.limitation, leaderboardFullResponse.limitation) &&
        Objects.equals(this.title, leaderboardFullResponse.title) &&
        Objects.equals(this.description, leaderboardFullResponse.description) &&
        Objects.equals(this.metaData, leaderboardFullResponse.metaData) &&
        Objects.equals(this.iconAsset, leaderboardFullResponse.iconAsset) &&
        Objects.equals(this.bannerAsset, leaderboardFullResponse.bannerAsset) &&
        Objects.equals(this.active, leaderboardFullResponse.active) &&
        Objects.equals(this.application, leaderboardFullResponse.application) &&
        Objects.equals(this.leaderboardRankings, leaderboardFullResponse.leaderboardRankings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leaderboardId, rankType, rankMode, sortType, limitation, title, description, metaData, iconAsset, bannerAsset, active, application, leaderboardRankings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaderboardFullResponse {\n");
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
    sb.append("    leaderboardRankings: ").append(toIndentedString(leaderboardRankings)).append("\n");
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

