package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NotificationRecipientResponseListResponse  {
  
  @ApiModelProperty(value = "")

  private List<Object> items = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Integer count;

  @ApiModelProperty(value = "")

  private Integer startIndexAudiences;

  @ApiModelProperty(value = "")

  private Integer startIndexGroups;

  @ApiModelProperty(value = "")

  private Long total;

  @ApiModelProperty(value = "")

  private Long countAudiences;

  @ApiModelProperty(value = "")

  private Long countGroups;

  @ApiModelProperty(value = "")

  private Boolean hasMoreResults;
 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<Object> getItems() {
    return items;
  }

  public void setItems(List<Object> items) {
    this.items = items;
  }

  public NotificationRecipientResponseListResponse items(List<Object> items) {
    this.items = items;
    return this;
  }

  public NotificationRecipientResponseListResponse addItemsItem(Object itemsItem) {
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

  public NotificationRecipientResponseListResponse count(Integer count) {
    this.count = count;
    return this;
  }

 /**
   * Get startIndexAudiences
   * @return startIndexAudiences
  **/
  @JsonProperty("startIndexAudiences")
  public Integer getStartIndexAudiences() {
    return startIndexAudiences;
  }

  public void setStartIndexAudiences(Integer startIndexAudiences) {
    this.startIndexAudiences = startIndexAudiences;
  }

  public NotificationRecipientResponseListResponse startIndexAudiences(Integer startIndexAudiences) {
    this.startIndexAudiences = startIndexAudiences;
    return this;
  }

 /**
   * Get startIndexGroups
   * @return startIndexGroups
  **/
  @JsonProperty("startIndexGroups")
  public Integer getStartIndexGroups() {
    return startIndexGroups;
  }

  public void setStartIndexGroups(Integer startIndexGroups) {
    this.startIndexGroups = startIndexGroups;
  }

  public NotificationRecipientResponseListResponse startIndexGroups(Integer startIndexGroups) {
    this.startIndexGroups = startIndexGroups;
    return this;
  }

 /**
   * Get total
   * @return total
  **/
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public NotificationRecipientResponseListResponse total(Long total) {
    this.total = total;
    return this;
  }

 /**
   * Get countAudiences
   * @return countAudiences
  **/
  @JsonProperty("countAudiences")
  public Long getCountAudiences() {
    return countAudiences;
  }

  public void setCountAudiences(Long countAudiences) {
    this.countAudiences = countAudiences;
  }

  public NotificationRecipientResponseListResponse countAudiences(Long countAudiences) {
    this.countAudiences = countAudiences;
    return this;
  }

 /**
   * Get countGroups
   * @return countGroups
  **/
  @JsonProperty("countGroups")
  public Long getCountGroups() {
    return countGroups;
  }

  public void setCountGroups(Long countGroups) {
    this.countGroups = countGroups;
  }

  public NotificationRecipientResponseListResponse countGroups(Long countGroups) {
    this.countGroups = countGroups;
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

  public NotificationRecipientResponseListResponse hasMoreResults(Boolean hasMoreResults) {
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
    NotificationRecipientResponseListResponse notificationRecipientResponseListResponse = (NotificationRecipientResponseListResponse) o;
    return Objects.equals(this.items, notificationRecipientResponseListResponse.items) &&
        Objects.equals(this.count, notificationRecipientResponseListResponse.count) &&
        Objects.equals(this.startIndexAudiences, notificationRecipientResponseListResponse.startIndexAudiences) &&
        Objects.equals(this.startIndexGroups, notificationRecipientResponseListResponse.startIndexGroups) &&
        Objects.equals(this.total, notificationRecipientResponseListResponse.total) &&
        Objects.equals(this.countAudiences, notificationRecipientResponseListResponse.countAudiences) &&
        Objects.equals(this.countGroups, notificationRecipientResponseListResponse.countGroups) &&
        Objects.equals(this.hasMoreResults, notificationRecipientResponseListResponse.hasMoreResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, count, startIndexAudiences, startIndexGroups, total, countAudiences, countGroups, hasMoreResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRecipientResponseListResponse {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    startIndexAudiences: ").append(toIndentedString(startIndexAudiences)).append("\n");
    sb.append("    startIndexGroups: ").append(toIndentedString(startIndexGroups)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    countAudiences: ").append(toIndentedString(countAudiences)).append("\n");
    sb.append("    countGroups: ").append(toIndentedString(countGroups)).append("\n");
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

