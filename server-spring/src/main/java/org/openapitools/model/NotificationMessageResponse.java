package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AccountShortResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NotificationMessageResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class NotificationMessageResponse {

  private @Nullable AccountShortResponse sender;

  private @Nullable String event;

  private @Nullable String notificationMessage;

  private @Nullable Long created;

  private @Nullable Boolean hasRead;

  private @Nullable Long contentId;

  private @Nullable String contentType;

  private @Nullable String contentName;

  private @Nullable Long parentId;

  private @Nullable String parentType;

  private @Nullable String actionCategory;

  private @Nullable String thumbnailURL;

  private @Nullable String coverURL;

  public NotificationMessageResponse sender(@Nullable AccountShortResponse sender) {
    this.sender = sender;
    return this;
  }

  /**
   * Get sender
   * @return sender
   */
  @Valid 
  @Schema(name = "sender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sender")
  public @Nullable AccountShortResponse getSender() {
    return sender;
  }

  public void setSender(@Nullable AccountShortResponse sender) {
    this.sender = sender;
  }

  public NotificationMessageResponse event(@Nullable String event) {
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

  public NotificationMessageResponse notificationMessage(@Nullable String notificationMessage) {
    this.notificationMessage = notificationMessage;
    return this;
  }

  /**
   * Get notificationMessage
   * @return notificationMessage
   */
  
  @Schema(name = "notificationMessage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notificationMessage")
  public @Nullable String getNotificationMessage() {
    return notificationMessage;
  }

  public void setNotificationMessage(@Nullable String notificationMessage) {
    this.notificationMessage = notificationMessage;
  }

  public NotificationMessageResponse created(@Nullable Long created) {
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

  public NotificationMessageResponse hasRead(@Nullable Boolean hasRead) {
    this.hasRead = hasRead;
    return this;
  }

  /**
   * Get hasRead
   * @return hasRead
   */
  
  @Schema(name = "hasRead", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasRead")
  public @Nullable Boolean getHasRead() {
    return hasRead;
  }

  public void setHasRead(@Nullable Boolean hasRead) {
    this.hasRead = hasRead;
  }

  public NotificationMessageResponse contentId(@Nullable Long contentId) {
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

  public NotificationMessageResponse contentType(@Nullable String contentType) {
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

  public NotificationMessageResponse contentName(@Nullable String contentName) {
    this.contentName = contentName;
    return this;
  }

  /**
   * Get contentName
   * @return contentName
   */
  
  @Schema(name = "contentName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentName")
  public @Nullable String getContentName() {
    return contentName;
  }

  public void setContentName(@Nullable String contentName) {
    this.contentName = contentName;
  }

  public NotificationMessageResponse parentId(@Nullable Long parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
   */
  
  @Schema(name = "parentId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentId")
  public @Nullable Long getParentId() {
    return parentId;
  }

  public void setParentId(@Nullable Long parentId) {
    this.parentId = parentId;
  }

  public NotificationMessageResponse parentType(@Nullable String parentType) {
    this.parentType = parentType;
    return this;
  }

  /**
   * Get parentType
   * @return parentType
   */
  
  @Schema(name = "parentType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentType")
  public @Nullable String getParentType() {
    return parentType;
  }

  public void setParentType(@Nullable String parentType) {
    this.parentType = parentType;
  }

  public NotificationMessageResponse actionCategory(@Nullable String actionCategory) {
    this.actionCategory = actionCategory;
    return this;
  }

  /**
   * Get actionCategory
   * @return actionCategory
   */
  
  @Schema(name = "actionCategory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actionCategory")
  public @Nullable String getActionCategory() {
    return actionCategory;
  }

  public void setActionCategory(@Nullable String actionCategory) {
    this.actionCategory = actionCategory;
  }

  public NotificationMessageResponse thumbnailURL(@Nullable String thumbnailURL) {
    this.thumbnailURL = thumbnailURL;
    return this;
  }

  /**
   * Get thumbnailURL
   * @return thumbnailURL
   */
  
  @Schema(name = "thumbnailURL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thumbnailURL")
  public @Nullable String getThumbnailURL() {
    return thumbnailURL;
  }

  public void setThumbnailURL(@Nullable String thumbnailURL) {
    this.thumbnailURL = thumbnailURL;
  }

  public NotificationMessageResponse coverURL(@Nullable String coverURL) {
    this.coverURL = coverURL;
    return this;
  }

  /**
   * Get coverURL
   * @return coverURL
   */
  
  @Schema(name = "coverURL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("coverURL")
  public @Nullable String getCoverURL() {
    return coverURL;
  }

  public void setCoverURL(@Nullable String coverURL) {
    this.coverURL = coverURL;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationMessageResponse notificationMessageResponse = (NotificationMessageResponse) o;
    return Objects.equals(this.sender, notificationMessageResponse.sender) &&
        Objects.equals(this.event, notificationMessageResponse.event) &&
        Objects.equals(this.notificationMessage, notificationMessageResponse.notificationMessage) &&
        Objects.equals(this.created, notificationMessageResponse.created) &&
        Objects.equals(this.hasRead, notificationMessageResponse.hasRead) &&
        Objects.equals(this.contentId, notificationMessageResponse.contentId) &&
        Objects.equals(this.contentType, notificationMessageResponse.contentType) &&
        Objects.equals(this.contentName, notificationMessageResponse.contentName) &&
        Objects.equals(this.parentId, notificationMessageResponse.parentId) &&
        Objects.equals(this.parentType, notificationMessageResponse.parentType) &&
        Objects.equals(this.actionCategory, notificationMessageResponse.actionCategory) &&
        Objects.equals(this.thumbnailURL, notificationMessageResponse.thumbnailURL) &&
        Objects.equals(this.coverURL, notificationMessageResponse.coverURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sender, event, notificationMessage, created, hasRead, contentId, contentType, contentName, parentId, parentType, actionCategory, thumbnailURL, coverURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationMessageResponse {\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    notificationMessage: ").append(toIndentedString(notificationMessage)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    hasRead: ").append(toIndentedString(hasRead)).append("\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
    sb.append("    actionCategory: ").append(toIndentedString(actionCategory)).append("\n");
    sb.append("    thumbnailURL: ").append(toIndentedString(thumbnailURL)).append("\n");
    sb.append("    coverURL: ").append(toIndentedString(coverURL)).append("\n");
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

