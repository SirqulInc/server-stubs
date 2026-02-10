package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GameLevelResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GameLevelListResponse  {
  
  @ApiModelProperty(value = "")

  private Integer start;

  @ApiModelProperty(value = "")

  private Integer limit;

  @ApiModelProperty(value = "")

  private Long countTotal;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid GameLevelResponse> items = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Integer count;

  @ApiModelProperty(value = "")

  private Boolean hasMoreResults;
 /**
   * Get start
   * @return start
  **/
  @JsonProperty("start")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public GameLevelListResponse start(Integer start) {
    this.start = start;
    return this;
  }

 /**
   * Get limit
   * @return limit
  **/
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public GameLevelListResponse limit(Integer limit) {
    this.limit = limit;
    return this;
  }

 /**
   * Get countTotal
   * @return countTotal
  **/
  @JsonProperty("countTotal")
  public Long getCountTotal() {
    return countTotal;
  }

  public void setCountTotal(Long countTotal) {
    this.countTotal = countTotal;
  }

  public GameLevelListResponse countTotal(Long countTotal) {
    this.countTotal = countTotal;
    return this;
  }

 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<@Valid GameLevelResponse> getItems() {
    return items;
  }

  public void setItems(List<@Valid GameLevelResponse> items) {
    this.items = items;
  }

  public GameLevelListResponse items(List<@Valid GameLevelResponse> items) {
    this.items = items;
    return this;
  }

  public GameLevelListResponse addItemsItem(GameLevelResponse itemsItem) {
    this.items.add(itemsItem);
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

  public GameLevelListResponse count(Integer count) {
    this.count = count;
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

  public GameLevelListResponse hasMoreResults(Boolean hasMoreResults) {
    this.hasMoreResults = hasMoreResults;
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
    GameLevelListResponse gameLevelListResponse = (GameLevelListResponse) o;
    return Objects.equals(this.start, gameLevelListResponse.start) &&
        Objects.equals(this.limit, gameLevelListResponse.limit) &&
        Objects.equals(this.countTotal, gameLevelListResponse.countTotal) &&
        Objects.equals(this.items, gameLevelListResponse.items) &&
        Objects.equals(this.count, gameLevelListResponse.count) &&
        Objects.equals(this.hasMoreResults, gameLevelListResponse.hasMoreResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, limit, countTotal, items, count, hasMoreResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameLevelListResponse {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    countTotal: ").append(toIndentedString(countTotal)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    hasMoreResults: ").append(toIndentedString(hasMoreResults)).append("\n");
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

