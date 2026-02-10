package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BlockedNotificationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BlockedNotificationResponse   {
  @JsonProperty("blockedNotificationId")
  
  private Long blockedNotificationId;

  @JsonProperty("created")
  
  private Long created;

  @JsonProperty("event")
  
  private String event;

  @JsonProperty("conduit")
  
  private String conduit;

  @JsonProperty("customType")
  
  private String customType;

  @JsonProperty("contentType")
  
  private String contentType;

  @JsonProperty("contentId")
  
  private Long contentId;

  @JsonProperty("searchTags")
  
  private String searchTags;

  @JsonProperty("blocked")
  
  private Boolean blocked;

  @JsonProperty("deleted")
  
  private Boolean deleted;

  public BlockedNotificationResponse blockedNotificationId(Long blockedNotificationId) {
    this.blockedNotificationId = blockedNotificationId;
    return this;
  }

   /**
   * Get blockedNotificationId
   * @return blockedNotificationId
  **/
  public Long getBlockedNotificationId() {
    return blockedNotificationId;
  }

  public void setBlockedNotificationId(Long blockedNotificationId) {
    this.blockedNotificationId = blockedNotificationId;
  }

  public BlockedNotificationResponse created(Long created) {
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

  public BlockedNotificationResponse event(String event) {
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

  public BlockedNotificationResponse conduit(String conduit) {
    this.conduit = conduit;
    return this;
  }

   /**
   * Get conduit
   * @return conduit
  **/
  public String getConduit() {
    return conduit;
  }

  public void setConduit(String conduit) {
    this.conduit = conduit;
  }

  public BlockedNotificationResponse customType(String customType) {
    this.customType = customType;
    return this;
  }

   /**
   * Get customType
   * @return customType
  **/
  public String getCustomType() {
    return customType;
  }

  public void setCustomType(String customType) {
    this.customType = customType;
  }

  public BlockedNotificationResponse contentType(String contentType) {
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

  public BlockedNotificationResponse contentId(Long contentId) {
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

  public BlockedNotificationResponse searchTags(String searchTags) {
    this.searchTags = searchTags;
    return this;
  }

   /**
   * Get searchTags
   * @return searchTags
  **/
  public String getSearchTags() {
    return searchTags;
  }

  public void setSearchTags(String searchTags) {
    this.searchTags = searchTags;
  }

  public BlockedNotificationResponse blocked(Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

   /**
   * Get blocked
   * @return blocked
  **/
  public Boolean getBlocked() {
    return blocked;
  }

  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }

  public BlockedNotificationResponse deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
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
    return Objects.equals(blockedNotificationId, blockedNotificationResponse.blockedNotificationId) &&
        Objects.equals(created, blockedNotificationResponse.created) &&
        Objects.equals(event, blockedNotificationResponse.event) &&
        Objects.equals(conduit, blockedNotificationResponse.conduit) &&
        Objects.equals(customType, blockedNotificationResponse.customType) &&
        Objects.equals(contentType, blockedNotificationResponse.contentType) &&
        Objects.equals(contentId, blockedNotificationResponse.contentId) &&
        Objects.equals(searchTags, blockedNotificationResponse.searchTags) &&
        Objects.equals(blocked, blockedNotificationResponse.blocked) &&
        Objects.equals(deleted, blockedNotificationResponse.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockedNotificationId, created, event, conduit, customType, contentType, contentId, searchTags, blocked, deleted);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

