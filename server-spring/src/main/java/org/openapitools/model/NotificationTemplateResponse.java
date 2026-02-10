package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ApplicationMiniResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NotificationTemplateResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class NotificationTemplateResponse {

  private @Nullable Long notificationTemplateId;

  private @Nullable String event;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable ConduitEnum conduit;

  private @Nullable String title;

  private @Nullable String body;

  private @Nullable String publicBody;

  private @Nullable ApplicationMiniResponse application;

  private @Nullable Long updated;

  private @Nullable Long created;

  private @Nullable String tags;

  public NotificationTemplateResponse notificationTemplateId(@Nullable Long notificationTemplateId) {
    this.notificationTemplateId = notificationTemplateId;
    return this;
  }

  /**
   * Get notificationTemplateId
   * @return notificationTemplateId
   */
  
  @Schema(name = "notificationTemplateId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notificationTemplateId")
  public @Nullable Long getNotificationTemplateId() {
    return notificationTemplateId;
  }

  public void setNotificationTemplateId(@Nullable Long notificationTemplateId) {
    this.notificationTemplateId = notificationTemplateId;
  }

  public NotificationTemplateResponse event(@Nullable String event) {
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

  public NotificationTemplateResponse conduit(@Nullable ConduitEnum conduit) {
    this.conduit = conduit;
    return this;
  }

  /**
   * Get conduit
   * @return conduit
   */
  
  @Schema(name = "conduit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conduit")
  public @Nullable ConduitEnum getConduit() {
    return conduit;
  }

  public void setConduit(@Nullable ConduitEnum conduit) {
    this.conduit = conduit;
  }

  public NotificationTemplateResponse title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public NotificationTemplateResponse body(@Nullable String body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   * @return body
   */
  
  @Schema(name = "body", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("body")
  public @Nullable String getBody() {
    return body;
  }

  public void setBody(@Nullable String body) {
    this.body = body;
  }

  public NotificationTemplateResponse publicBody(@Nullable String publicBody) {
    this.publicBody = publicBody;
    return this;
  }

  /**
   * Get publicBody
   * @return publicBody
   */
  
  @Schema(name = "publicBody", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publicBody")
  public @Nullable String getPublicBody() {
    return publicBody;
  }

  public void setPublicBody(@Nullable String publicBody) {
    this.publicBody = publicBody;
  }

  public NotificationTemplateResponse application(@Nullable ApplicationMiniResponse application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
   */
  @Valid 
  @Schema(name = "application", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("application")
  public @Nullable ApplicationMiniResponse getApplication() {
    return application;
  }

  public void setApplication(@Nullable ApplicationMiniResponse application) {
    this.application = application;
  }

  public NotificationTemplateResponse updated(@Nullable Long updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
   */
  
  @Schema(name = "updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated")
  public @Nullable Long getUpdated() {
    return updated;
  }

  public void setUpdated(@Nullable Long updated) {
    this.updated = updated;
  }

  public NotificationTemplateResponse created(@Nullable Long created) {
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

  public NotificationTemplateResponse tags(@Nullable String tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  
  @Schema(name = "tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public @Nullable String getTags() {
    return tags;
  }

  public void setTags(@Nullable String tags) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

