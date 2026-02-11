package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ApplicationMiniResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class NotificationTemplateResponse   {
  
  private Long notificationTemplateId;
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
    private String value;

    ConduitEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ConduitEnum conduit;
  private String title;
  private String body;
  private String publicBody;
  private ApplicationMiniResponse application;
  private Long updated;
  private Long created;
  private String tags;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notificationTemplateId")
  public Long getNotificationTemplateId() {
    return notificationTemplateId;
  }
  public void setNotificationTemplateId(Long notificationTemplateId) {
    this.notificationTemplateId = notificationTemplateId;
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
  public ConduitEnum getConduit() {
    return conduit;
  }
  public void setConduit(ConduitEnum conduit) {
    this.conduit = conduit;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("body")
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("publicBody")
  public String getPublicBody() {
    return publicBody;
  }
  public void setPublicBody(String publicBody) {
    this.publicBody = publicBody;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("application")
  @Valid
  public ApplicationMiniResponse getApplication() {
    return application;
  }
  public void setApplication(ApplicationMiniResponse application) {
    this.application = application;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }
  public void setUpdated(Long updated) {
    this.updated = updated;
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
  @JsonProperty("tags")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

