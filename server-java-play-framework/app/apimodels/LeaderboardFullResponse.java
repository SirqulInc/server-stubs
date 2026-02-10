package apimodels;

import apimodels.ApplicationMiniResponse;
import apimodels.AssetResponse;
import apimodels.RankListResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * LeaderboardFullResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LeaderboardFullResponse   {
  @JsonProperty("leaderboardId")
  
  private Long leaderboardId;

  @JsonProperty("rankType")
  
  private String rankType;

  @JsonProperty("rankMode")
  
  private String rankMode;

  @JsonProperty("sortType")
  
  private String sortType;

  @JsonProperty("limitation")
  
  private Integer limitation;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("metaData")
  
  private String metaData;

  @JsonProperty("iconAsset")
  @Valid

  private AssetResponse iconAsset;

  @JsonProperty("bannerAsset")
  @Valid

  private AssetResponse bannerAsset;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("application")
  @Valid

  private ApplicationMiniResponse application;

  @JsonProperty("leaderboardRankings")
  @Valid

  private RankListResponse leaderboardRankings;

  public LeaderboardFullResponse leaderboardId(Long leaderboardId) {
    this.leaderboardId = leaderboardId;
    return this;
  }

   /**
   * Get leaderboardId
   * @return leaderboardId
  **/
  public Long getLeaderboardId() {
    return leaderboardId;
  }

  public void setLeaderboardId(Long leaderboardId) {
    this.leaderboardId = leaderboardId;
  }

  public LeaderboardFullResponse rankType(String rankType) {
    this.rankType = rankType;
    return this;
  }

   /**
   * Get rankType
   * @return rankType
  **/
  public String getRankType() {
    return rankType;
  }

  public void setRankType(String rankType) {
    this.rankType = rankType;
  }

  public LeaderboardFullResponse rankMode(String rankMode) {
    this.rankMode = rankMode;
    return this;
  }

   /**
   * Get rankMode
   * @return rankMode
  **/
  public String getRankMode() {
    return rankMode;
  }

  public void setRankMode(String rankMode) {
    this.rankMode = rankMode;
  }

  public LeaderboardFullResponse sortType(String sortType) {
    this.sortType = sortType;
    return this;
  }

   /**
   * Get sortType
   * @return sortType
  **/
  public String getSortType() {
    return sortType;
  }

  public void setSortType(String sortType) {
    this.sortType = sortType;
  }

  public LeaderboardFullResponse limitation(Integer limitation) {
    this.limitation = limitation;
    return this;
  }

   /**
   * Get limitation
   * @return limitation
  **/
  public Integer getLimitation() {
    return limitation;
  }

  public void setLimitation(Integer limitation) {
    this.limitation = limitation;
  }

  public LeaderboardFullResponse title(String title) {
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

  public LeaderboardFullResponse description(String description) {
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

  public LeaderboardFullResponse metaData(String metaData) {
    this.metaData = metaData;
    return this;
  }

   /**
   * Get metaData
   * @return metaData
  **/
  public String getMetaData() {
    return metaData;
  }

  public void setMetaData(String metaData) {
    this.metaData = metaData;
  }

  public LeaderboardFullResponse iconAsset(AssetResponse iconAsset) {
    this.iconAsset = iconAsset;
    return this;
  }

   /**
   * Get iconAsset
   * @return iconAsset
  **/
  public AssetResponse getIconAsset() {
    return iconAsset;
  }

  public void setIconAsset(AssetResponse iconAsset) {
    this.iconAsset = iconAsset;
  }

  public LeaderboardFullResponse bannerAsset(AssetResponse bannerAsset) {
    this.bannerAsset = bannerAsset;
    return this;
  }

   /**
   * Get bannerAsset
   * @return bannerAsset
  **/
  public AssetResponse getBannerAsset() {
    return bannerAsset;
  }

  public void setBannerAsset(AssetResponse bannerAsset) {
    this.bannerAsset = bannerAsset;
  }

  public LeaderboardFullResponse active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public LeaderboardFullResponse application(ApplicationMiniResponse application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  public ApplicationMiniResponse getApplication() {
    return application;
  }

  public void setApplication(ApplicationMiniResponse application) {
    this.application = application;
  }

  public LeaderboardFullResponse leaderboardRankings(RankListResponse leaderboardRankings) {
    this.leaderboardRankings = leaderboardRankings;
    return this;
  }

   /**
   * Get leaderboardRankings
   * @return leaderboardRankings
  **/
  public RankListResponse getLeaderboardRankings() {
    return leaderboardRankings;
  }

  public void setLeaderboardRankings(RankListResponse leaderboardRankings) {
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
    return Objects.equals(leaderboardId, leaderboardFullResponse.leaderboardId) &&
        Objects.equals(rankType, leaderboardFullResponse.rankType) &&
        Objects.equals(rankMode, leaderboardFullResponse.rankMode) &&
        Objects.equals(sortType, leaderboardFullResponse.sortType) &&
        Objects.equals(limitation, leaderboardFullResponse.limitation) &&
        Objects.equals(title, leaderboardFullResponse.title) &&
        Objects.equals(description, leaderboardFullResponse.description) &&
        Objects.equals(metaData, leaderboardFullResponse.metaData) &&
        Objects.equals(iconAsset, leaderboardFullResponse.iconAsset) &&
        Objects.equals(bannerAsset, leaderboardFullResponse.bannerAsset) &&
        Objects.equals(active, leaderboardFullResponse.active) &&
        Objects.equals(application, leaderboardFullResponse.application) &&
        Objects.equals(leaderboardRankings, leaderboardFullResponse.leaderboardRankings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leaderboardId, rankType, rankMode, sortType, limitation, title, description, metaData, iconAsset, bannerAsset, active, application, leaderboardRankings);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

