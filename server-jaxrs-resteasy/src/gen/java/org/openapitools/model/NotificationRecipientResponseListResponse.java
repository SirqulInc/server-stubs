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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class NotificationRecipientResponseListResponse   {
  
  private List<Object> items = new ArrayList<>();
  private Integer count;
  private Integer startIndexAudiences;
  private Integer startIndexGroups;
  private Long total;
  private Long countAudiences;
  private Long countGroups;
  private Boolean hasMoreResults;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("items")
  public List<Object> getItems() {
    return items;
  }
  public void setItems(List<Object> items) {
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
  @JsonProperty("startIndexAudiences")
  public Integer getStartIndexAudiences() {
    return startIndexAudiences;
  }
  public void setStartIndexAudiences(Integer startIndexAudiences) {
    this.startIndexAudiences = startIndexAudiences;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startIndexGroups")
  public Integer getStartIndexGroups() {
    return startIndexGroups;
  }
  public void setStartIndexGroups(Integer startIndexGroups) {
    this.startIndexGroups = startIndexGroups;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("countAudiences")
  public Long getCountAudiences() {
    return countAudiences;
  }
  public void setCountAudiences(Long countAudiences) {
    this.countAudiences = countAudiences;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("countGroups")
  public Long getCountGroups() {
    return countGroups;
  }
  public void setCountGroups(Long countGroups) {
    this.countGroups = countGroups;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

