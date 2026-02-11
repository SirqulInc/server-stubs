package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RankResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RankListResponse   {
  
  private List<@Valid RankResponse> items = new ArrayList<>();
  private RankResponse userRank;
  private Boolean hasMoreResults;
  private Integer count;
  private String rankType;
  private String app;
  private String sortField;

  /**
   * Gets or Sets leaderboardMode
   */
  public enum LeaderboardModeEnum {
    GLOBAL("GLOBAL"),

        FRIENDS("FRIENDS"),

        LOCAL("LOCAL"),

        SEARCH("SEARCH"),

        CUSTOM("CUSTOM");
    private String value;

    LeaderboardModeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private LeaderboardModeEnum leaderboardMode;
  private Long start;
  private Long limit;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("items")
  @Valid
  public List<@Valid RankResponse> getItems() {
    return items;
  }
  public void setItems(List<@Valid RankResponse> items) {
    this.items = items;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userRank")
  @Valid
  public RankResponse getUserRank() {
    return userRank;
  }
  public void setUserRank(RankResponse userRank) {
    this.userRank = userRank;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hasMoreResults")
  public Boolean getHasMoreResults() {
    return hasMoreResults;
  }
  public void setHasMoreResults(Boolean hasMoreResults) {
    this.hasMoreResults = hasMoreResults;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
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
  @JsonProperty("app")
  public String getApp() {
    return app;
  }
  public void setApp(String app) {
    this.app = app;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sortField")
  public String getSortField() {
    return sortField;
  }
  public void setSortField(String sortField) {
    this.sortField = sortField;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("leaderboardMode")
  public LeaderboardModeEnum getLeaderboardMode() {
    return leaderboardMode;
  }
  public void setLeaderboardMode(LeaderboardModeEnum leaderboardMode) {
    this.leaderboardMode = leaderboardMode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("start")
  public Long getStart() {
    return start;
  }
  public void setStart(Long start) {
    this.start = start;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("limit")
  public Long getLimit() {
    return limit;
  }
  public void setLimit(Long limit) {
    this.limit = limit;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

