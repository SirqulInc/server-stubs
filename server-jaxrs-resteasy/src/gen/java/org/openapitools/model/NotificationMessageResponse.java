package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AccountShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class NotificationMessageResponse   {
  
  private AccountShortResponse sender;
  private String event;
  private String notificationMessage;
  private Long created;
  private Boolean hasRead;
  private Long contentId;
  private String contentType;
  private String contentName;
  private Long parentId;
  private String parentType;
  private String actionCategory;
  private String thumbnailURL;
  private String coverURL;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sender")
  @Valid
  public AccountShortResponse getSender() {
    return sender;
  }
  public void setSender(AccountShortResponse sender) {
    this.sender = sender;
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
  @JsonProperty("notificationMessage")
  public String getNotificationMessage() {
    return notificationMessage;
  }
  public void setNotificationMessage(String notificationMessage) {
    this.notificationMessage = notificationMessage;
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
  @JsonProperty("hasRead")
  public Boolean getHasRead() {
    return hasRead;
  }
  public void setHasRead(Boolean hasRead) {
    this.hasRead = hasRead;
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
  @JsonProperty("contentName")
  public String getContentName() {
    return contentName;
  }
  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }
  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("parentType")
  public String getParentType() {
    return parentType;
  }
  public void setParentType(String parentType) {
    this.parentType = parentType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("actionCategory")
  public String getActionCategory() {
    return actionCategory;
  }
  public void setActionCategory(String actionCategory) {
    this.actionCategory = actionCategory;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("thumbnailURL")
  public String getThumbnailURL() {
    return thumbnailURL;
  }
  public void setThumbnailURL(String thumbnailURL) {
    this.thumbnailURL = thumbnailURL;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("coverURL")
  public String getCoverURL() {
    return coverURL;
  }
  public void setCoverURL(String coverURL) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

