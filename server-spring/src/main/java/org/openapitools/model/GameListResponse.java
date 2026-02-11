package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GameResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GameListResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class GameListResponse {

  private @Nullable Integer start;

  private @Nullable Integer limit;

  private @Nullable Long countTotal;

  @Valid
  private List<@Valid GameResponse> items = new ArrayList<>();

  private @Nullable Boolean hasMoreResults;

  private @Nullable Integer count;

  public GameListResponse start(@Nullable Integer start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
   */
  
  @Schema(name = "start", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start")
  public @Nullable Integer getStart() {
    return start;
  }

  public void setStart(@Nullable Integer start) {
    this.start = start;
  }

  public GameListResponse limit(@Nullable Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * @return limit
   */
  
  @Schema(name = "limit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit")
  public @Nullable Integer getLimit() {
    return limit;
  }

  public void setLimit(@Nullable Integer limit) {
    this.limit = limit;
  }

  public GameListResponse countTotal(@Nullable Long countTotal) {
    this.countTotal = countTotal;
    return this;
  }

  /**
   * Get countTotal
   * @return countTotal
   */
  
  @Schema(name = "countTotal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countTotal")
  public @Nullable Long getCountTotal() {
    return countTotal;
  }

  public void setCountTotal(@Nullable Long countTotal) {
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
   */
  @Valid 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid GameResponse> getItems() {
    return items;
  }

  public void setItems(List<@Valid GameResponse> items) {
    this.items = items;
  }

  public GameListResponse hasMoreResults(@Nullable Boolean hasMoreResults) {
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

  public GameListResponse count(@Nullable Integer count) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameListResponse gameListResponse = (GameListResponse) o;
    return Objects.equals(this.start, gameListResponse.start) &&
        Objects.equals(this.limit, gameListResponse.limit) &&
        Objects.equals(this.countTotal, gameListResponse.countTotal) &&
        Objects.equals(this.items, gameListResponse.items) &&
        Objects.equals(this.hasMoreResults, gameListResponse.hasMoreResults) &&
        Objects.equals(this.count, gameListResponse.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, limit, countTotal, items, hasMoreResults, count);
  }

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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

