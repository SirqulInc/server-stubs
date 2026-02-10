package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MessageResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class MessageListResponse   {
  
  private Integer start;
  private Integer limit;
  private Long countTotal;
  private List<@Valid MessageResponse> items = new ArrayList<>();
  private Integer count;
  private Boolean hasMoreResults;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("start")
  public Integer getStart() {
    return start;
  }
  public void setStart(Integer start) {
    this.start = start;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("countTotal")
  public Long getCountTotal() {
    return countTotal;
  }
  public void setCountTotal(Long countTotal) {
    this.countTotal = countTotal;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("items")
  @Valid
  public List<@Valid MessageResponse> getItems() {
    return items;
  }
  public void setItems(List<@Valid MessageResponse> items) {
    this.items = items;
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
  @JsonProperty("hasMoreResults")
  public Boolean getHasMoreResults() {
    return hasMoreResults;
  }
  public void setHasMoreResults(Boolean hasMoreResults) {
    this.hasMoreResults = hasMoreResults;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageListResponse messageListResponse = (MessageListResponse) o;
    return Objects.equals(this.start, messageListResponse.start) &&
        Objects.equals(this.limit, messageListResponse.limit) &&
        Objects.equals(this.countTotal, messageListResponse.countTotal) &&
        Objects.equals(this.items, messageListResponse.items) &&
        Objects.equals(this.count, messageListResponse.count) &&
        Objects.equals(this.hasMoreResults, messageListResponse.hasMoreResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, limit, countTotal, items, count, hasMoreResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageListResponse {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

