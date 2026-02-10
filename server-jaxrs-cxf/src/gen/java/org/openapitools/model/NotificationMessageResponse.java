package org.openapitools.model;

import org.openapitools.model.AccountShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NotificationMessageResponse  {
  
  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse sender;

  @ApiModelProperty(value = "")

  private String event;

  @ApiModelProperty(value = "")

  private String notificationMessage;

  @ApiModelProperty(value = "")

  private Long created;

  @ApiModelProperty(value = "")

  private Boolean hasRead;

  @ApiModelProperty(value = "")

  private Long contentId;

  @ApiModelProperty(value = "")

  private String contentType;

  @ApiModelProperty(value = "")

  private String contentName;

  @ApiModelProperty(value = "")

  private Long parentId;

  @ApiModelProperty(value = "")

  private String parentType;

  @ApiModelProperty(value = "")

  private String actionCategory;

  @ApiModelProperty(value = "")

  private String thumbnailURL;

  @ApiModelProperty(value = "")

  private String coverURL;
 /**
   * Get sender
   * @return sender
  **/
  @JsonProperty("sender")
  public AccountShortResponse getSender() {
    return sender;
  }

  public void setSender(AccountShortResponse sender) {
    this.sender = sender;
  }

  public NotificationMessageResponse sender(AccountShortResponse sender) {
    this.sender = sender;
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

  public NotificationMessageResponse event(String event) {
    this.event = event;
    return this;
  }

 /**
   * Get notificationMessage
   * @return notificationMessage
  **/
  @JsonProperty("notificationMessage")
  public String getNotificationMessage() {
    return notificationMessage;
  }

  public void setNotificationMessage(String notificationMessage) {
    this.notificationMessage = notificationMessage;
  }

  public NotificationMessageResponse notificationMessage(String notificationMessage) {
    this.notificationMessage = notificationMessage;
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

  public NotificationMessageResponse created(Long created) {
    this.created = created;
    return this;
  }

 /**
   * Get hasRead
   * @return hasRead
  **/
  @JsonProperty("hasRead")
  public Boolean getHasRead() {
    return hasRead;
  }

  public void setHasRead(Boolean hasRead) {
    this.hasRead = hasRead;
  }

  public NotificationMessageResponse hasRead(Boolean hasRead) {
    this.hasRead = hasRead;
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

  public NotificationMessageResponse contentId(Long contentId) {
    this.contentId = contentId;
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

  public NotificationMessageResponse contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

 /**
   * Get contentName
   * @return contentName
  **/
  @JsonProperty("contentName")
  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  public NotificationMessageResponse contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

 /**
   * Get parentId
   * @return parentId
  **/
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public NotificationMessageResponse parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

 /**
   * Get parentType
   * @return parentType
  **/
  @JsonProperty("parentType")
  public String getParentType() {
    return parentType;
  }

  public void setParentType(String parentType) {
    this.parentType = parentType;
  }

  public NotificationMessageResponse parentType(String parentType) {
    this.parentType = parentType;
    return this;
  }

 /**
   * Get actionCategory
   * @return actionCategory
  **/
  @JsonProperty("actionCategory")
  public String getActionCategory() {
    return actionCategory;
  }

  public void setActionCategory(String actionCategory) {
    this.actionCategory = actionCategory;
  }

  public NotificationMessageResponse actionCategory(String actionCategory) {
    this.actionCategory = actionCategory;
    return this;
  }

 /**
   * Get thumbnailURL
   * @return thumbnailURL
  **/
  @JsonProperty("thumbnailURL")
  public String getThumbnailURL() {
    return thumbnailURL;
  }

  public void setThumbnailURL(String thumbnailURL) {
    this.thumbnailURL = thumbnailURL;
  }

  public NotificationMessageResponse thumbnailURL(String thumbnailURL) {
    this.thumbnailURL = thumbnailURL;
    return this;
  }

 /**
   * Get coverURL
   * @return coverURL
  **/
  @JsonProperty("coverURL")
  public String getCoverURL() {
    return coverURL;
  }

  public void setCoverURL(String coverURL) {
    this.coverURL = coverURL;
  }

  public NotificationMessageResponse coverURL(String coverURL) {
    this.coverURL = coverURL;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

