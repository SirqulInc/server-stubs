package apimodels;

import apimodels.GameResponse;
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
 * GameListResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GameListResponse   {
  @JsonProperty("start")
  
  private Integer start;

  @JsonProperty("limit")
  
  private Integer limit;

  @JsonProperty("countTotal")
  
  private Long countTotal;

  @JsonProperty("items")
  @Valid

  private List<@Valid GameResponse> items = null;

  @JsonProperty("hasMoreResults")
  
  private Boolean hasMoreResults;

  @JsonProperty("count")
  
  private Integer count;

  public GameListResponse start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public GameListResponse limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public GameListResponse countTotal(Long countTotal) {
    this.countTotal = countTotal;
    return this;
  }

   /**
   * Get countTotal
   * @return countTotal
  **/
  public Long getCountTotal() {
    return countTotal;
  }

  public void setCountTotal(Long countTotal) {
    this.countTotal = countTotal;
  }

  public GameListResponse items(List<@Valid GameResponse> items) {
    this.items = items;
    return this;
  }

  public GameListResponse addItemsItem(GameResponse itemsItem) {
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
  public List<@Valid GameResponse> getItems() {
    return items;
  }

  public void setItems(List<@Valid GameResponse> items) {
    this.items = items;
  }

  public GameListResponse hasMoreResults(Boolean hasMoreResults) {
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

  public GameListResponse count(Integer count) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameListResponse gameListResponse = (GameListResponse) o;
    return Objects.equals(start, gameListResponse.start) &&
        Objects.equals(limit, gameListResponse.limit) &&
        Objects.equals(countTotal, gameListResponse.countTotal) &&
        Objects.equals(items, gameListResponse.items) &&
        Objects.equals(hasMoreResults, gameListResponse.hasMoreResults) &&
        Objects.equals(count, gameListResponse.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, limit, countTotal, items, hasMoreResults, count);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameListResponse {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    countTotal: ").append(toIndentedString(countTotal)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    hasMoreResults: ").append(toIndentedString(hasMoreResults)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

