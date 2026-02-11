package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NotificationRecipientResponseListResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class NotificationRecipientResponseListResponse {

  @Valid
  private List<Object> items = new ArrayList<>();

  private @Nullable Integer count;

  private @Nullable Integer startIndexAudiences;

  private @Nullable Integer startIndexGroups;

  private @Nullable Long total;

  private @Nullable Long countAudiences;

  private @Nullable Long countGroups;

  private @Nullable Boolean hasMoreResults;

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
   */
  
  @Schema(name = "items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<Object> getItems() {
    return items;
  }

  public void setItems(List<Object> items) {
    this.items = items;
  }

  public NotificationRecipientResponseListResponse count(@Nullable Integer count) {
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

  public NotificationRecipientResponseListResponse startIndexAudiences(@Nullable Integer startIndexAudiences) {
    this.startIndexAudiences = startIndexAudiences;
    return this;
  }

  /**
   * Get startIndexAudiences
   * @return startIndexAudiences
   */
  
  @Schema(name = "startIndexAudiences", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startIndexAudiences")
  public @Nullable Integer getStartIndexAudiences() {
    return startIndexAudiences;
  }

  public void setStartIndexAudiences(@Nullable Integer startIndexAudiences) {
    this.startIndexAudiences = startIndexAudiences;
  }

  public NotificationRecipientResponseListResponse startIndexGroups(@Nullable Integer startIndexGroups) {
    this.startIndexGroups = startIndexGroups;
    return this;
  }

  /**
   * Get startIndexGroups
   * @return startIndexGroups
   */
  
  @Schema(name = "startIndexGroups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startIndexGroups")
  public @Nullable Integer getStartIndexGroups() {
    return startIndexGroups;
  }

  public void setStartIndexGroups(@Nullable Integer startIndexGroups) {
    this.startIndexGroups = startIndexGroups;
  }

  public NotificationRecipientResponseListResponse total(@Nullable Long total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
   */
  
  @Schema(name = "total", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public @Nullable Long getTotal() {
    return total;
  }

  public void setTotal(@Nullable Long total) {
    this.total = total;
  }

  public NotificationRecipientResponseListResponse countAudiences(@Nullable Long countAudiences) {
    this.countAudiences = countAudiences;
    return this;
  }

  /**
   * Get countAudiences
   * @return countAudiences
   */
  
  @Schema(name = "countAudiences", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countAudiences")
  public @Nullable Long getCountAudiences() {
    return countAudiences;
  }

  public void setCountAudiences(@Nullable Long countAudiences) {
    this.countAudiences = countAudiences;
  }

  public NotificationRecipientResponseListResponse countGroups(@Nullable Long countGroups) {
    this.countGroups = countGroups;
    return this;
  }

  /**
   * Get countGroups
   * @return countGroups
   */
  
  @Schema(name = "countGroups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countGroups")
  public @Nullable Long getCountGroups() {
    return countGroups;
  }

  public void setCountGroups(@Nullable Long countGroups) {
    this.countGroups = countGroups;
  }

  public NotificationRecipientResponseListResponse hasMoreResults(@Nullable Boolean hasMoreResults) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

