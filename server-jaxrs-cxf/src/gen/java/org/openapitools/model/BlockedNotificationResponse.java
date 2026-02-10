package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BlockedNotificationResponse  {
  
  @ApiModelProperty(value = "")

  private Long blockedNotificationId;

  @ApiModelProperty(value = "")

  private Long created;

  @ApiModelProperty(value = "")

  private String event;

  @ApiModelProperty(value = "")

  private String conduit;

  @ApiModelProperty(value = "")

  private String customType;

  @ApiModelProperty(value = "")

  private String contentType;

  @ApiModelProperty(value = "")

  private Long contentId;

  @ApiModelProperty(value = "")

  private String searchTags;

  @ApiModelProperty(value = "")

  private Boolean blocked;

  @ApiModelProperty(value = "")

  private Boolean deleted;
 /**
   * Get blockedNotificationId
   * @return blockedNotificationId
  **/
  @JsonProperty("blockedNotificationId")
  public Long getBlockedNotificationId() {
    return blockedNotificationId;
  }

  public void setBlockedNotificationId(Long blockedNotificationId) {
    this.blockedNotificationId = blockedNotificationId;
  }

  public BlockedNotificationResponse blockedNotificationId(Long blockedNotificationId) {
    this.blockedNotificationId = blockedNotificationId;
    return this;
  }

 /**
   * Get created
   * @return created
  **/
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public BlockedNotificationResponse created(Long created) {
    this.created = created;
    return this;
  }

 /**
   * Get event
   * @return event
  **/
  @JsonProperty("event")
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public BlockedNotificationResponse event(String event) {
    this.event = event;
    return this;
  }

 /**
   * Get conduit
   * @return conduit
  **/
  @JsonProperty("conduit")
  public String getConduit() {
    return conduit;
  }

  public void setConduit(String conduit) {
    this.conduit = conduit;
  }

  public BlockedNotificationResponse conduit(String conduit) {
    this.conduit = conduit;
    return this;
  }

 /**
   * Get customType
   * @return customType
  **/
  @JsonProperty("customType")
  public String getCustomType() {
    return customType;
  }

  public void setCustomType(String customType) {
    this.customType = customType;
  }

  public BlockedNotificationResponse customType(String customType) {
    this.customType = customType;
    return this;
  }

 /**
   * Get contentType
   * @return contentType
  **/
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public BlockedNotificationResponse contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

 /**
   * Get contentId
   * @return contentId
  **/
  @JsonProperty("contentId")
  public Long getContentId() {
    return contentId;
  }

  public void setContentId(Long contentId) {
    this.contentId = contentId;
  }

  public BlockedNotificationResponse contentId(Long contentId) {
    this.contentId = contentId;
    return this;
  }

 /**
   * Get searchTags
   * @return searchTags
  **/
  @JsonProperty("searchTags")
  public String getSearchTags() {
    return searchTags;
  }

  public void setSearchTags(String searchTags) {
    this.searchTags = searchTags;
  }

  public BlockedNotificationResponse searchTags(String searchTags) {
    this.searchTags = searchTags;
    return this;
  }

 /**
   * Get blocked
   * @return blocked
  **/
  @JsonProperty("blocked")
  public Boolean getBlocked() {
    return blocked;
  }

  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }

  public BlockedNotificationResponse blocked(Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

 /**
   * Get deleted
   * @return deleted
  **/
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public BlockedNotificationResponse deleted(Boolean deleted) {
    this.deleted = deleted;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

