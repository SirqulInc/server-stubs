package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class BlockedNotificationResponse   {
  
  private Long blockedNotificationId;
  private Long created;
  private String event;
  private String conduit;
  private String customType;
  private String contentType;
  private Long contentId;
  private String searchTags;
  private Boolean blocked;
  private Boolean deleted;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("blockedNotificationId")
  public Long getBlockedNotificationId() {
    return blockedNotificationId;
  }
  public void setBlockedNotificationId(Long blockedNotificationId) {
    this.blockedNotificationId = blockedNotificationId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }
  public void setCreated(Long created) {
    this.created = created;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("event")
  public String getEvent() {
    return event;
  }
  public void setEvent(String event) {
    this.event = event;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("conduit")
  public String getConduit() {
    return conduit;
  }
  public void setConduit(String conduit) {
    this.conduit = conduit;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customType")
  public String getCustomType() {
    return customType;
  }
  public void setCustomType(String customType) {
    this.customType = customType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contentId")
  public Long getContentId() {
    return contentId;
  }
  public void setContentId(Long contentId) {
    this.contentId = contentId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("searchTags")
  public String getSearchTags() {
    return searchTags;
  }
  public void setSearchTags(String searchTags) {
    this.searchTags = searchTags;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("blocked")
  public Boolean getBlocked() {
    return blocked;
  }
  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }
  public void setDeleted(Boolean deleted) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

