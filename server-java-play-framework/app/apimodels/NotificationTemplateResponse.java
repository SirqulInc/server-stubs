package apimodels;

import apimodels.ApplicationMiniResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * NotificationTemplateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class NotificationTemplateResponse   {
  @JsonProperty("notificationTemplateId")
  
  private Long notificationTemplateId;

  @JsonProperty("event")
  
  private String event;

  /**
   * Gets or Sets conduit
   */
  public enum ConduitEnum {
    HTTP("HTTP"),
    
    SAVE("SAVE"),
    
    EMAIL("EMAIL"),
    
    SMS("SMS"),
    
    APNS("APNS"),
    
    GCM("GCM"),
    
    PUSH("PUSH"),
    
    MOBILE_NOTIFICATION("MOBILE_NOTIFICATION");

    private final String value;

    ConduitEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ConduitEnum fromValue(String value) {
      for (ConduitEnum b : ConduitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("conduit")
  
  private ConduitEnum conduit;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("body")
  
  private String body;

  @JsonProperty("publicBody")
  
  private String publicBody;

  @JsonProperty("application")
  @Valid

  private ApplicationMiniResponse application;

  @JsonProperty("updated")
  
  private Long updated;

  @JsonProperty("created")
  
  private Long created;

  @JsonProperty("tags")
  
  private String tags;

  public NotificationTemplateResponse notificationTemplateId(Long notificationTemplateId) {
    this.notificationTemplateId = notificationTemplateId;
    return this;
  }

   /**
   * Get notificationTemplateId
   * @return notificationTemplateId
  **/
  public Long getNotificationTemplateId() {
    return notificationTemplateId;
  }

  public void setNotificationTemplateId(Long notificationTemplateId) {
    this.notificationTemplateId = notificationTemplateId;
  }

  public NotificationTemplateResponse event(String event) {
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

  public NotificationTemplateResponse conduit(ConduitEnum conduit) {
    this.conduit = conduit;
    return this;
  }

   /**
   * Get conduit
   * @return conduit
  **/
  public ConduitEnum getConduit() {
    return conduit;
  }

  public void setConduit(ConduitEnum conduit) {
    this.conduit = conduit;
  }

  public NotificationTemplateResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public NotificationTemplateResponse body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public NotificationTemplateResponse publicBody(String publicBody) {
    this.publicBody = publicBody;
    return this;
  }

   /**
   * Get publicBody
   * @return publicBody
  **/
  public String getPublicBody() {
    return publicBody;
  }

  public void setPublicBody(String publicBody) {
    this.publicBody = publicBody;
  }

  public NotificationTemplateResponse application(ApplicationMiniResponse application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  public ApplicationMiniResponse getApplication() {
    return application;
  }

  public void setApplication(ApplicationMiniResponse application) {
    this.application = application;
  }

  public NotificationTemplateResponse updated(Long updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  public NotificationTemplateResponse created(Long created) {
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

  public NotificationTemplateResponse tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationTemplateResponse notificationTemplateResponse = (NotificationTemplateResponse) o;
    return Objects.equals(notificationTemplateId, notificationTemplateResponse.notificationTemplateId) &&
        Objects.equals(event, notificationTemplateResponse.event) &&
        Objects.equals(conduit, notificationTemplateResponse.conduit) &&
        Objects.equals(title, notificationTemplateResponse.title) &&
        Objects.equals(body, notificationTemplateResponse.body) &&
        Objects.equals(publicBody, notificationTemplateResponse.publicBody) &&
        Objects.equals(application, notificationTemplateResponse.application) &&
        Objects.equals(updated, notificationTemplateResponse.updated) &&
        Objects.equals(created, notificationTemplateResponse.created) &&
        Objects.equals(tags, notificationTemplateResponse.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationTemplateId, event, conduit, title, body, publicBody, application, updated, created, tags);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationTemplateResponse {\n");
    
    sb.append("    notificationTemplateId: ").append(toIndentedString(notificationTemplateId)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    conduit: ").append(toIndentedString(conduit)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    publicBody: ").append(toIndentedString(publicBody)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

