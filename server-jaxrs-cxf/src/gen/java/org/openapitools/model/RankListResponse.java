package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RankResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RankListResponse  {
  
  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid RankResponse> items = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private RankResponse userRank;

  @ApiModelProperty(value = "")

  private Boolean hasMoreResults;

  @ApiModelProperty(value = "")

  private Integer count;

  @ApiModelProperty(value = "")

  private String rankType;

  @ApiModelProperty(value = "")

  private String app;

  @ApiModelProperty(value = "")

  private String sortField;

public enum LeaderboardModeEnum {

GLOBAL(String.valueOf("GLOBAL")), FRIENDS(String.valueOf("FRIENDS")), LOCAL(String.valueOf("LOCAL")), SEARCH(String.valueOf("SEARCH")), CUSTOM(String.valueOf("CUSTOM"));


    private String value;

    LeaderboardModeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static LeaderboardModeEnum fromValue(String value) {
        for (LeaderboardModeEnum b : LeaderboardModeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private LeaderboardModeEnum leaderboardMode;

  @ApiModelProperty(value = "")

  private Long start;

  @ApiModelProperty(value = "")

  private Long limit;
 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<@Valid RankResponse> getItems() {
    return items;
  }

  public void setItems(List<@Valid RankResponse> items) {
    this.items = items;
  }

  public RankListResponse items(List<@Valid RankResponse> items) {
    this.items = items;
    return this;
  }

  public RankListResponse addItemsItem(RankResponse itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
   * Get userRank
   * @return userRank
  **/
  @JsonProperty("userRank")
  public RankResponse getUserRank() {
    return userRank;
  }

  public void setUserRank(RankResponse userRank) {
    this.userRank = userRank;
  }

  public RankListResponse userRank(RankResponse userRank) {
    this.userRank = userRank;
    return this;
  }

 /**
   * Get hasMoreResults
   * @return hasMoreResults
  **/
  @JsonProperty("hasMoreResults")
  public Boolean getHasMoreResults() {
    return hasMoreResults;
  }

  public void setHasMoreResults(Boolean hasMoreResults) {
    this.hasMoreResults = hasMoreResults;
  }

  public RankListResponse hasMoreResults(Boolean hasMoreResults) {
    this.hasMoreResults = hasMoreResults;
    return this;
  }

 /**
   * Get count
   * @return count
  **/
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public RankListResponse count(Integer count) {
    this.count = count;
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

  public RankListResponse rankType(String rankType) {
    this.rankType = rankType;
    return this;
  }

 /**
   * Get app
   * @return app
  **/
  @JsonProperty("app")
  public String getApp() {
    return app;
  }

  public void setApp(String app) {
    this.app = app;
  }

  public RankListResponse app(String app) {
    this.app = app;
    return this;
  }

 /**
   * Get sortField
   * @return sortField
  **/
  @JsonProperty("sortField")
  public String getSortField() {
    return sortField;
  }

  public void setSortField(String sortField) {
    this.sortField = sortField;
  }

  public RankListResponse sortField(String sortField) {
    this.sortField = sortField;
    return this;
  }

 /**
   * Get leaderboardMode
   * @return leaderboardMode
  **/
  @JsonProperty("leaderboardMode")
  public String getLeaderboardMode() {
    if (leaderboardMode == null) {
      return null;
    }
    return leaderboardMode.value();
  }

  public void setLeaderboardMode(LeaderboardModeEnum leaderboardMode) {
    this.leaderboardMode = leaderboardMode;
  }

  public RankListResponse leaderboardMode(LeaderboardModeEnum leaderboardMode) {
    this.leaderboardMode = leaderboardMode;
    return this;
  }

 /**
   * Get start
   * @return start
  **/
  @JsonProperty("start")
  public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
  }

  public RankListResponse start(Long start) {
    this.start = start;
    return this;
  }

 /**
   * Get limit
   * @return limit
  **/
  @JsonProperty("limit")
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public RankListResponse limit(Long limit) {
    this.limit = limit;
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
    RankListResponse rankListResponse = (RankListResponse) o;
    return Objects.equals(this.items, rankListResponse.items) &&
        Objects.equals(this.userRank, rankListResponse.userRank) &&
        Objects.equals(this.hasMoreResults, rankListResponse.hasMoreResults) &&
        Objects.equals(this.count, rankListResponse.count) &&
        Objects.equals(this.rankType, rankListResponse.rankType) &&
        Objects.equals(this.app, rankListResponse.app) &&
        Objects.equals(this.sortField, rankListResponse.sortField) &&
        Objects.equals(this.leaderboardMode, rankListResponse.leaderboardMode) &&
        Objects.equals(this.start, rankListResponse.start) &&
        Objects.equals(this.limit, rankListResponse.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, userRank, hasMoreResults, count, rankType, app, sortField, leaderboardMode, start, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RankListResponse {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    userRank: ").append(toIndentedString(userRank)).append("\n");
    sb.append("    hasMoreResults: ").append(toIndentedString(hasMoreResults)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    rankType: ").append(toIndentedString(rankType)).append("\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
    sb.append("    leaderboardMode: ").append(toIndentedString(leaderboardMode)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

