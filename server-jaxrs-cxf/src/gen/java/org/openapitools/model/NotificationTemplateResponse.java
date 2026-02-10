package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ApplicationMiniResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NotificationTemplateResponse  {
  
  @ApiModelProperty(value = "")

  private Long notificationTemplateId;

  @ApiModelProperty(value = "")

  private String event;

public enum ConduitEnum {

HTTP(String.valueOf("HTTP")), SAVE(String.valueOf("SAVE")), EMAIL(String.valueOf("EMAIL")), SMS(String.valueOf("SMS")), APNS(String.valueOf("APNS")), GCM(String.valueOf("GCM")), PUSH(String.valueOf("PUSH")), MOBILE_NOTIFICATION(String.valueOf("MOBILE_NOTIFICATION"));


    private String value;

    ConduitEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
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

  @ApiModelProperty(value = "")

  private ConduitEnum conduit;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String body;

  @ApiModelProperty(value = "")

  private String publicBody;

  @ApiModelProperty(value = "")

  @Valid

  private ApplicationMiniResponse application;

  @ApiModelProperty(value = "")

  private Long updated;

  @ApiModelProperty(value = "")

  private Long created;

  @ApiModelProperty(value = "")

  private String tags;
 /**
   * Get notificationTemplateId
   * @return notificationTemplateId
  **/
  @JsonProperty("notificationTemplateId")
  public Long getNotificationTemplateId() {
    return notificationTemplateId;
  }

  public void setNotificationTemplateId(Long notificationTemplateId) {
    this.notificationTemplateId = notificationTemplateId;
  }

  public NotificationTemplateResponse notificationTemplateId(Long notificationTemplateId) {
    this.notificationTemplateId = notificationTemplateId;
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

  public NotificationTemplateResponse event(String event) {
    this.event = event;
    return this;
  }

 /**
   * Get conduit
   * @return conduit
  **/
  @JsonProperty("conduit")
  public String getConduit() {
    if (conduit == null) {
      return null;
    }
    return conduit.value();
  }

  public void setConduit(ConduitEnum conduit) {
    this.conduit = conduit;
  }

  public NotificationTemplateResponse conduit(ConduitEnum conduit) {
    this.conduit = conduit;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public NotificationTemplateResponse title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get body
   * @return body
  **/
  @JsonProperty("body")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public NotificationTemplateResponse body(String body) {
    this.body = body;
    return this;
  }

 /**
   * Get publicBody
   * @return publicBody
  **/
  @JsonProperty("publicBody")
  public String getPublicBody() {
    return publicBody;
  }

  public void setPublicBody(String publicBody) {
    this.publicBody = publicBody;
  }

  public NotificationTemplateResponse publicBody(String publicBody) {
    this.publicBody = publicBody;
    return this;
  }

 /**
   * Get application
   * @return application
  **/
  @JsonProperty("application")
  public ApplicationMiniResponse getApplication() {
    return application;
  }

  public void setApplication(ApplicationMiniResponse application) {
    this.application = application;
  }

  public NotificationTemplateResponse application(ApplicationMiniResponse application) {
    this.application = application;
    return this;
  }

 /**
   * Get updated
   * @return updated
  **/
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  public NotificationTemplateResponse updated(Long updated) {
    this.updated = updated;
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

  public NotificationTemplateResponse created(Long created) {
    this.created = created;
    return this;
  }

 /**
   * Get tags
   * @return tags
  **/
  @JsonProperty("tags")
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public NotificationTemplateResponse tags(String tags) {
    this.tags = tags;
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
    NotificationTemplateResponse notificationTemplateResponse = (NotificationTemplateResponse) o;
    return Objects.equals(this.notificationTemplateId, notificationTemplateResponse.notificationTemplateId) &&
        Objects.equals(this.event, notificationTemplateResponse.event) &&
        Objects.equals(this.conduit, notificationTemplateResponse.conduit) &&
        Objects.equals(this.title, notificationTemplateResponse.title) &&
        Objects.equals(this.body, notificationTemplateResponse.body) &&
        Objects.equals(this.publicBody, notificationTemplateResponse.publicBody) &&
        Objects.equals(this.application, notificationTemplateResponse.application) &&
        Objects.equals(this.updated, notificationTemplateResponse.updated) &&
        Objects.equals(this.created, notificationTemplateResponse.created) &&
        Objects.equals(this.tags, notificationTemplateResponse.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationTemplateId, event, conduit, title, body, publicBody, application, updated, created, tags);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

