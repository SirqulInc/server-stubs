package apimodels;

import apimodels.AccountShortResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * NotificationMessageResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class NotificationMessageResponse   {
  @JsonProperty("sender")
  @Valid

  private AccountShortResponse sender;

  @JsonProperty("event")
  
  private String event;

  @JsonProperty("notificationMessage")
  
  private String notificationMessage;

  @JsonProperty("created")
  
  private Long created;

  @JsonProperty("hasRead")
  
  private Boolean hasRead;

  @JsonProperty("contentId")
  
  private Long contentId;

  @JsonProperty("contentType")
  
  private String contentType;

  @JsonProperty("contentName")
  
  private String contentName;

  @JsonProperty("parentId")
  
  private Long parentId;

  @JsonProperty("parentType")
  
  private String parentType;

  @JsonProperty("actionCategory")
  
  private String actionCategory;

  @JsonProperty("thumbnailURL")
  
  private String thumbnailURL;

  @JsonProperty("coverURL")
  
  private String coverURL;

  public NotificationMessageResponse sender(AccountShortResponse sender) {
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  public AccountShortResponse getSender() {
    return sender;
  }

  public void setSender(AccountShortResponse sender) {
    this.sender = sender;
  }

  public NotificationMessageResponse event(String event) {
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public NotificationMessageResponse notificationMessage(String notificationMessage) {
    this.notificationMessage = notificationMessage;
    return this;
  }

   /**
   * Get notificationMessage
   * @return notificationMessage
  **/
  public String getNotificationMessage() {
    return notificationMessage;
  }

  public void setNotificationMessage(String notificationMessage) {
    this.notificationMessage = notificationMessage;
  }

  public NotificationMessageResponse created(Long created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public NotificationMessageResponse hasRead(Boolean hasRead) {
    this.hasRead = hasRead;
    return this;
  }

   /**
   * Get hasRead
   * @return hasRead
  **/
  public Boolean getHasRead() {
    return hasRead;
  }

  public void setHasRead(Boolean hasRead) {
    this.hasRead = hasRead;
  }

  public NotificationMessageResponse contentId(Long contentId) {
    this.contentId = contentId;
    return this;
  }

   /**
   * Get contentId
   * @return contentId
  **/
  public Long getContentId() {
    return contentId;
  }

  public void setContentId(Long contentId) {
    this.contentId = contentId;
  }

  public NotificationMessageResponse contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public NotificationMessageResponse contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

   /**
   * Get contentName
   * @return contentName
  **/
  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  public NotificationMessageResponse parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public NotificationMessageResponse parentType(String parentType) {
    this.parentType = parentType;
    return this;
  }

   /**
   * Get parentType
   * @return parentType
  **/
  public String getParentType() {
    return parentType;
  }

  public void setParentType(String parentType) {
    this.parentType = parentType;
  }

  public NotificationMessageResponse actionCategory(String actionCategory) {
    this.actionCategory = actionCategory;
    return this;
  }

   /**
   * Get actionCategory
   * @return actionCategory
  **/
  public String getActionCategory() {
    return actionCategory;
  }

  public void setActionCategory(String actionCategory) {
    this.actionCategory = actionCategory;
  }

  public NotificationMessageResponse thumbnailURL(String thumbnailURL) {
    this.thumbnailURL = thumbnailURL;
    return this;
  }

   /**
   * Get thumbnailURL
   * @return thumbnailURL
  **/
  public String getThumbnailURL() {
    return thumbnailURL;
  }

  public void setThumbnailURL(String thumbnailURL) {
    this.thumbnailURL = thumbnailURL;
  }

  public NotificationMessageResponse coverURL(String coverURL) {
    this.coverURL = coverURL;
    return this;
  }

   /**
   * Get coverURL
   * @return coverURL
  **/
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
    return Objects.equals(sender, notificationMessageResponse.sender) &&
        Objects.equals(event, notificationMessageResponse.event) &&
        Objects.equals(notificationMessage, notificationMessageResponse.notificationMessage) &&
        Objects.equals(created, notificationMessageResponse.created) &&
        Objects.equals(hasRead, notificationMessageResponse.hasRead) &&
        Objects.equals(contentId, notificationMessageResponse.contentId) &&
        Objects.equals(contentType, notificationMessageResponse.contentType) &&
        Objects.equals(contentName, notificationMessageResponse.contentName) &&
        Objects.equals(parentId, notificationMessageResponse.parentId) &&
        Objects.equals(parentType, notificationMessageResponse.parentType) &&
        Objects.equals(actionCategory, notificationMessageResponse.actionCategory) &&
        Objects.equals(thumbnailURL, notificationMessageResponse.thumbnailURL) &&
        Objects.equals(coverURL, notificationMessageResponse.coverURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sender, event, notificationMessage, created, hasRead, contentId, contentType, contentName, parentId, parentType, actionCategory, thumbnailURL, coverURL);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

