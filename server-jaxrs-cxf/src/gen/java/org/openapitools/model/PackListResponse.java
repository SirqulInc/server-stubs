package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PackResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PackListResponse  {
  
  @ApiModelProperty(value = "")

  private Integer start;

  @ApiModelProperty(value = "")

  private Integer limit;

  @ApiModelProperty(value = "")

  private Long countTotal;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid PackResponse> items = new ArrayList<>();

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

  public PackListResponse start(Integer start) {
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

  public PackListResponse limit(Integer limit) {
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

  public PackListResponse countTotal(Long countTotal) {
    this.countTotal = countTotal;
    return this;
  }

 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<@Valid PackResponse> getItems() {
    return items;
  }

  public void setItems(List<@Valid PackResponse> items) {
    this.items = items;
  }

  public PackListResponse items(List<@Valid PackResponse> items) {
    this.items = items;
    return this;
  }

  public PackListResponse addItemsItem(PackResponse itemsItem) {
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

  public PackListResponse count(Integer count) {
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

  public PackListResponse hasMoreResults(Boolean hasMoreResults) {
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
    PackListResponse packListResponse = (PackListResponse) o;
    return Objects.equals(this.start, packListResponse.start) &&
        Objects.equals(this.limit, packListResponse.limit) &&
        Objects.equals(this.countTotal, packListResponse.countTotal) &&
        Objects.equals(this.items, packListResponse.items) &&
        Objects.equals(this.count, packListResponse.count) &&
        Objects.equals(this.hasMoreResults, packListResponse.hasMoreResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, limit, countTotal, items, count, hasMoreResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackListResponse {\n");
    
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

