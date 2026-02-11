package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BlockedNotificationResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class BlockedNotificationResponse {

  private @Nullable Long blockedNotificationId;

  private @Nullable Long created;

  private @Nullable String event;

  private @Nullable String conduit;

  private @Nullable String customType;

  private @Nullable String contentType;

  private @Nullable Long contentId;

  private @Nullable String searchTags;

  private @Nullable Boolean blocked;

  private @Nullable Boolean deleted;

  public BlockedNotificationResponse blockedNotificationId(@Nullable Long blockedNotificationId) {
    this.blockedNotificationId = blockedNotificationId;
    return this;
  }

  /**
   * Get blockedNotificationId
   * @return blockedNotificationId
   */
  
  @Schema(name = "blockedNotificationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blockedNotificationId")
  public @Nullable Long getBlockedNotificationId() {
    return blockedNotificationId;
  }

  public void setBlockedNotificationId(@Nullable Long blockedNotificationId) {
    this.blockedNotificationId = blockedNotificationId;
  }

  public BlockedNotificationResponse created(@Nullable Long created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  
  @Schema(name = "created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created")
  public @Nullable Long getCreated() {
    return created;
  }

  public void setCreated(@Nullable Long created) {
    this.created = created;
  }

  public BlockedNotificationResponse event(@Nullable String event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
   */
  
  @Schema(name = "event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event")
  public @Nullable String getEvent() {
    return event;
  }

  public void setEvent(@Nullable String event) {
    this.event = event;
  }

  public BlockedNotificationResponse conduit(@Nullable String conduit) {
    this.conduit = conduit;
    return this;
  }

  /**
   * Get conduit
   * @return conduit
   */
  
  @Schema(name = "conduit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conduit")
  public @Nullable String getConduit() {
    return conduit;
  }

  public void setConduit(@Nullable String conduit) {
    this.conduit = conduit;
  }

  public BlockedNotificationResponse customType(@Nullable String customType) {
    this.customType = customType;
    return this;
  }

  /**
   * Get customType
   * @return customType
   */
  
  @Schema(name = "customType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customType")
  public @Nullable String getCustomType() {
    return customType;
  }

  public void setCustomType(@Nullable String customType) {
    this.customType = customType;
  }

  public BlockedNotificationResponse contentType(@Nullable String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
   */
  
  @Schema(name = "contentType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentType")
  public @Nullable String getContentType() {
    return contentType;
  }

  public void setContentType(@Nullable String contentType) {
    this.contentType = contentType;
  }

  public BlockedNotificationResponse contentId(@Nullable Long contentId) {
    this.contentId = contentId;
    return this;
  }

  /**
   * Get contentId
   * @return contentId
   */
  
  @Schema(name = "contentId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentId")
  public @Nullable Long getContentId() {
    return contentId;
  }

  public void setContentId(@Nullable Long contentId) {
    this.contentId = contentId;
  }

  public BlockedNotificationResponse searchTags(@Nullable String searchTags) {
    this.searchTags = searchTags;
    return this;
  }

  /**
   * Get searchTags
   * @return searchTags
   */
  
  @Schema(name = "searchTags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("searchTags")
  public @Nullable String getSearchTags() {
    return searchTags;
  }

  public void setSearchTags(@Nullable String searchTags) {
    this.searchTags = searchTags;
  }

  public BlockedNotificationResponse blocked(@Nullable Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

  /**
   * Get blocked
   * @return blocked
   */
  
  @Schema(name = "blocked", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blocked")
  public @Nullable Boolean getBlocked() {
    return blocked;
  }

  public void setBlocked(@Nullable Boolean blocked) {
    this.blocked = blocked;
  }

  public BlockedNotificationResponse deleted(@Nullable Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Get deleted
   * @return deleted
   */
  
  @Schema(name = "deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deleted")
  public @Nullable Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(@Nullable Boolean deleted) {
    this.deleted = deleted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockedNotificationResponse blockedNotificationResponse = (BlockedNotificationResponse) o;
    return Objects.equals(this.blockedNotificationId, blockedNotificationResponse.blockedNotificationId) &&
        Objects.equals(this.created, blockedNotificationResponse.created) &&
        Objects.equals(this.event, blockedNotificationResponse.event) &&
        Objects.equals(this.conduit, blockedNotificationResponse.conduit) &&
        Objects.equals(this.customType, blockedNotificationResponse.customType) &&
        Objects.equals(this.contentType, blockedNotificationResponse.contentType) &&
        Objects.equals(this.contentId, blockedNotificationResponse.contentId) &&
        Objects.equals(this.searchTags, blockedNotificationResponse.searchTags) &&
        Objects.equals(this.blocked, blockedNotificationResponse.blocked) &&
        Objects.equals(this.deleted, blockedNotificationResponse.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockedNotificationId, created, event, conduit, customType, contentType, contentId, searchTags, blocked, deleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockedNotificationResponse {\n");
    sb.append("    blockedNotificationId: ").append(toIndentedString(blockedNotificationId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    conduit: ").append(toIndentedString(conduit)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    searchTags: ").append(toIndentedString(searchTags)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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

