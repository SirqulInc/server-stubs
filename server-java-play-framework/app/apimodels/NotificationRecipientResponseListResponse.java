package apimodels;

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
 * NotificationRecipientResponseListResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class NotificationRecipientResponseListResponse   {
  @JsonProperty("items")
  
  private List<Object> items = null;

  @JsonProperty("count")
  
  private Integer count;

  @JsonProperty("startIndexAudiences")
  
  private Integer startIndexAudiences;

  @JsonProperty("startIndexGroups")
  
  private Integer startIndexGroups;

  @JsonProperty("total")
  
  private Long total;

  @JsonProperty("countAudiences")
  
  private Long countAudiences;

  @JsonProperty("countGroups")
  
  private Long countGroups;

  @JsonProperty("hasMoreResults")
  
  private Boolean hasMoreResults;

  public NotificationRecipientResponseListResponse items(List<Object> items) {
    this.items = items;
    return this;
  }

  public NotificationRecipientResponseListResponse addItemsItem(Object itemsItem) {
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
  public List<Object> getItems() {
    return items;
  }

  public void setItems(List<Object> items) {
    this.items = items;
  }

  public NotificationRecipientResponseListResponse count(Integer count) {
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

  public NotificationRecipientResponseListResponse startIndexAudiences(Integer startIndexAudiences) {
    this.startIndexAudiences = startIndexAudiences;
    return this;
  }

   /**
   * Get startIndexAudiences
   * @return startIndexAudiences
  **/
  public Integer getStartIndexAudiences() {
    return startIndexAudiences;
  }

  public void setStartIndexAudiences(Integer startIndexAudiences) {
    this.startIndexAudiences = startIndexAudiences;
  }

  public NotificationRecipientResponseListResponse startIndexGroups(Integer startIndexGroups) {
    this.startIndexGroups = startIndexGroups;
    return this;
  }

   /**
   * Get startIndexGroups
   * @return startIndexGroups
  **/
  public Integer getStartIndexGroups() {
    return startIndexGroups;
  }

  public void setStartIndexGroups(Integer startIndexGroups) {
    this.startIndexGroups = startIndexGroups;
  }

  public NotificationRecipientResponseListResponse total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public NotificationRecipientResponseListResponse countAudiences(Long countAudiences) {
    this.countAudiences = countAudiences;
    return this;
  }

   /**
   * Get countAudiences
   * @return countAudiences
  **/
  public Long getCountAudiences() {
    return countAudiences;
  }

  public void setCountAudiences(Long countAudiences) {
    this.countAudiences = countAudiences;
  }

  public NotificationRecipientResponseListResponse countGroups(Long countGroups) {
    this.countGroups = countGroups;
    return this;
  }

   /**
   * Get countGroups
   * @return countGroups
  **/
  public Long getCountGroups() {
    return countGroups;
  }

  public void setCountGroups(Long countGroups) {
    this.countGroups = countGroups;
  }

  public NotificationRecipientResponseListResponse hasMoreResults(Boolean hasMoreResults) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationRecipientResponseListResponse notificationRecipientResponseListResponse = (NotificationRecipientResponseListResponse) o;
    return Objects.equals(items, notificationRecipientResponseListResponse.items) &&
        Objects.equals(count, notificationRecipientResponseListResponse.count) &&
        Objects.equals(startIndexAudiences, notificationRecipientResponseListResponse.startIndexAudiences) &&
        Objects.equals(startIndexGroups, notificationRecipientResponseListResponse.startIndexGroups) &&
        Objects.equals(total, notificationRecipientResponseListResponse.total) &&
        Objects.equals(countAudiences, notificationRecipientResponseListResponse.countAudiences) &&
        Objects.equals(countGroups, notificationRecipientResponseListResponse.countGroups) &&
        Objects.equals(hasMoreResults, notificationRecipientResponseListResponse.hasMoreResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, count, startIndexAudiences, startIndexGroups, total, countAudiences, countGroups, hasMoreResults);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

