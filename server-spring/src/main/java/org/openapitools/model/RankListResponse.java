package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RankResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RankListResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RankListResponse {

  @Valid
  private List<@Valid RankResponse> items = new ArrayList<>();

  private @Nullable RankResponse userRank;

  private @Nullable Boolean hasMoreResults;

  private @Nullable Integer count;

  private @Nullable String rankType;

  private @Nullable String app;

  private @Nullable String sortField;

  /**
   * Gets or Sets leaderboardMode
   */
  public enum LeaderboardModeEnum {
    GLOBAL("GLOBAL"),
    
    FRIENDS("FRIENDS"),
    
    LOCAL("LOCAL"),
    
    SEARCH("SEARCH"),
    
    CUSTOM("CUSTOM");

    private final String value;

    LeaderboardModeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable LeaderboardModeEnum leaderboardMode;

  private @Nullable Long start;

  private @Nullable Long limit;

  public RankListResponse items(List<@Valid RankResponse> items) {
    this.items = items;
    return this;
  }

  public RankListResponse addItemsItem(RankResponse itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   */
  @Valid 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid RankResponse> getItems() {
    return items;
  }

  public void setItems(List<@Valid RankResponse> items) {
    this.items = items;
  }

  public RankListResponse userRank(@Nullable RankResponse userRank) {
    this.userRank = userRank;
    return this;
  }

  /**
   * Get userRank
   * @return userRank
   */
  @Valid 
  @Schema(name = "userRank", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userRank")
  public @Nullable RankResponse getUserRank() {
    return userRank;
  }

  public void setUserRank(@Nullable RankResponse userRank) {
    this.userRank = userRank;
  }

  public RankListResponse hasMoreResults(@Nullable Boolean hasMoreResults) {
    this.hasMoreResults = hasMoreResults;
    return this;
  }

  /**
   * Get hasMoreResults
   * @return hasMoreResults
   */
  
  @Schema(name = "hasMoreResults", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasMoreResults")
  public @Nullable Boolean getHasMoreResults() {
    return hasMoreResults;
  }

  public void setHasMoreResults(@Nullable Boolean hasMoreResults) {
    this.hasMoreResults = hasMoreResults;
  }

  public RankListResponse count(@Nullable Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
   */
  
  @Schema(name = "count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public @Nullable Integer getCount() {
    return count;
  }

  public void setCount(@Nullable Integer count) {
    this.count = count;
  }

  public RankListResponse rankType(@Nullable String rankType) {
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

  public RankListResponse app(@Nullable String app) {
    this.app = app;
    return this;
  }

  /**
   * Get app
   * @return app
   */
  
  @Schema(name = "app", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app")
  public @Nullable String getApp() {
    return app;
  }

  public void setApp(@Nullable String app) {
    this.app = app;
  }

  public RankListResponse sortField(@Nullable String sortField) {
    this.sortField = sortField;
    return this;
  }

  /**
   * Get sortField
   * @return sortField
   */
  
  @Schema(name = "sortField", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sortField")
  public @Nullable String getSortField() {
    return sortField;
  }

  public void setSortField(@Nullable String sortField) {
    this.sortField = sortField;
  }

  public RankListResponse leaderboardMode(@Nullable LeaderboardModeEnum leaderboardMode) {
    this.leaderboardMode = leaderboardMode;
    return this;
  }

  /**
   * Get leaderboardMode
   * @return leaderboardMode
   */
  
  @Schema(name = "leaderboardMode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("leaderboardMode")
  public @Nullable LeaderboardModeEnum getLeaderboardMode() {
    return leaderboardMode;
  }

  public void setLeaderboardMode(@Nullable LeaderboardModeEnum leaderboardMode) {
    this.leaderboardMode = leaderboardMode;
  }

  public RankListResponse start(@Nullable Long start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
   */
  
  @Schema(name = "start", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start")
  public @Nullable Long getStart() {
    return start;
  }

  public void setStart(@Nullable Long start) {
    this.start = start;
  }

  public RankListResponse limit(@Nullable Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * @return limit
   */
  
  @Schema(name = "limit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit")
  public @Nullable Long getLimit() {
    return limit;
  }

  public void setLimit(@Nullable Long limit) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

