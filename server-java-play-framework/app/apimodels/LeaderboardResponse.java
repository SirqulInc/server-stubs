package apimodels;

import apimodels.ApplicationMiniResponse;
import apimodels.AssetResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * LeaderboardResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LeaderboardResponse   {
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

  public LeaderboardResponse leaderboardId(Long leaderboardId) {
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

  public LeaderboardResponse rankType(String rankType) {
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

  public LeaderboardResponse rankMode(String rankMode) {
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

  public LeaderboardResponse sortType(String sortType) {
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

  public LeaderboardResponse limitation(Integer limitation) {
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

  public LeaderboardResponse title(String title) {
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

  public LeaderboardResponse description(String description) {
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

  public LeaderboardResponse metaData(String metaData) {
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

  public LeaderboardResponse iconAsset(AssetResponse iconAsset) {
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

  public LeaderboardResponse bannerAsset(AssetResponse bannerAsset) {
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

  public LeaderboardResponse active(Boolean active) {
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

  public LeaderboardResponse application(ApplicationMiniResponse application) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaderboardResponse leaderboardResponse = (LeaderboardResponse) o;
    return Objects.equals(leaderboardId, leaderboardResponse.leaderboardId) &&
        Objects.equals(rankType, leaderboardResponse.rankType) &&
        Objects.equals(rankMode, leaderboardResponse.rankMode) &&
        Objects.equals(sortType, leaderboardResponse.sortType) &&
        Objects.equals(limitation, leaderboardResponse.limitation) &&
        Objects.equals(title, leaderboardResponse.title) &&
        Objects.equals(description, leaderboardResponse.description) &&
        Objects.equals(metaData, leaderboardResponse.metaData) &&
        Objects.equals(iconAsset, leaderboardResponse.iconAsset) &&
        Objects.equals(bannerAsset, leaderboardResponse.bannerAsset) &&
        Objects.equals(active, leaderboardResponse.active) &&
        Objects.equals(application, leaderboardResponse.application);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leaderboardId, rankType, rankMode, sortType, limitation, title, description, metaData, iconAsset, bannerAsset, active, application);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

