package apimodels;

import apimodels.RankResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RankListResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RankListResponse   {
  @JsonProperty("items")
  @Valid

  private List<@Valid RankResponse> items = null;

  @JsonProperty("userRank")
  @Valid

  private RankResponse userRank;

  @JsonProperty("hasMoreResults")
  
  private Boolean hasMoreResults;

  @JsonProperty("count")
  
  private Integer count;

  @JsonProperty("rankType")
  
  private String rankType;

  @JsonProperty("app")
  
  private String app;

  @JsonProperty("sortField")
  
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

    private final String value;

    LeaderboardModeEnum(String value) {
      this.value = value;
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

  @JsonProperty("leaderboardMode")
  
  private LeaderboardModeEnum leaderboardMode;

  @JsonProperty("start")
  
  private Long start;

  @JsonProperty("limit")
  
  private Long limit;

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
  **/
  public List<@Valid RankResponse> getItems() {
    return items;
  }

  public void setItems(List<@Valid RankResponse> items) {
    this.items = items;
  }

  public RankListResponse userRank(RankResponse userRank) {
    this.userRank = userRank;
    return this;
  }

   /**
   * Get userRank
   * @return userRank
  **/
  public RankResponse getUserRank() {
    return userRank;
  }

  public void setUserRank(RankResponse userRank) {
    this.userRank = userRank;
  }

  public RankListResponse hasMoreResults(Boolean hasMoreResults) {
    this.hasMoreResults = hasMoreResults;
    return this;
  }

   /**
   * Get hasMoreResults
   * @return hasMoreResults
  **/
  public Boolean getHasMoreResults() {
    return hasMoreResults;
  }

  public void setHasMoreResults(Boolean hasMoreResults) {
    this.hasMoreResults = hasMoreResults;
  }

  public RankListResponse count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public RankListResponse rankType(String rankType) {
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

  public RankListResponse app(String app) {
    this.app = app;
    return this;
  }

   /**
   * Get app
   * @return app
  **/
  public String getApp() {
    return app;
  }

  public void setApp(String app) {
    this.app = app;
  }

  public RankListResponse sortField(String sortField) {
    this.sortField = sortField;
    return this;
  }

   /**
   * Get sortField
   * @return sortField
  **/
  public String getSortField() {
    return sortField;
  }

  public void setSortField(String sortField) {
    this.sortField = sortField;
  }

  public RankListResponse leaderboardMode(LeaderboardModeEnum leaderboardMode) {
    this.leaderboardMode = leaderboardMode;
    return this;
  }

   /**
   * Get leaderboardMode
   * @return leaderboardMode
  **/
  public LeaderboardModeEnum getLeaderboardMode() {
    return leaderboardMode;
  }

  public void setLeaderboardMode(LeaderboardModeEnum leaderboardMode) {
    this.leaderboardMode = leaderboardMode;
  }

  public RankListResponse start(Long start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
  }

  public RankListResponse limit(Long limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
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
    return Objects.equals(items, rankListResponse.items) &&
        Objects.equals(userRank, rankListResponse.userRank) &&
        Objects.equals(hasMoreResults, rankListResponse.hasMoreResults) &&
        Objects.equals(count, rankListResponse.count) &&
        Objects.equals(rankType, rankListResponse.rankType) &&
        Objects.equals(app, rankListResponse.app) &&
        Objects.equals(sortField, rankListResponse.sortField) &&
        Objects.equals(leaderboardMode, rankListResponse.leaderboardMode) &&
        Objects.equals(start, rankListResponse.start) &&
        Objects.equals(limit, rankListResponse.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, userRank, hasMoreResults, count, rankType, app, sortField, leaderboardMode, start, limit);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

