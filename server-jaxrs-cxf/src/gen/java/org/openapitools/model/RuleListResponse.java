package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RuleResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RuleListResponse  {
  
  @ApiModelProperty(value = "")

  private Integer start;

  @ApiModelProperty(value = "")

  private Integer limit;

  @ApiModelProperty(value = "")

  private Long countTotal;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid RuleResponse> items = new ArrayList<>();

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

  public RuleListResponse start(Integer start) {
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

  public RuleListResponse limit(Integer limit) {
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

  public RuleListResponse countTotal(Long countTotal) {
    this.countTotal = countTotal;
    return this;
  }

 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<@Valid RuleResponse> getItems() {
    return items;
  }

  public void setItems(List<@Valid RuleResponse> items) {
    this.items = items;
  }

  public RuleListResponse items(List<@Valid RuleResponse> items) {
    this.items = items;
    return this;
  }

  public RuleListResponse addItemsItem(RuleResponse itemsItem) {
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

  public RuleListResponse count(Integer count) {
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

  public RuleListResponse hasMoreResults(Boolean hasMoreResults) {
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
    RuleListResponse ruleListResponse = (RuleListResponse) o;
    return Objects.equals(this.start, ruleListResponse.start) &&
        Objects.equals(this.limit, ruleListResponse.limit) &&
        Objects.equals(this.countTotal, ruleListResponse.countTotal) &&
        Objects.equals(this.items, ruleListResponse.items) &&
        Objects.equals(this.count, ruleListResponse.count) &&
        Objects.equals(this.hasMoreResults, ruleListResponse.hasMoreResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, limit, countTotal, items, count, hasMoreResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleListResponse {\n");
    
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

