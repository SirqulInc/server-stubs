package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NameStringValueResponse;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserActivityResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class UserActivityResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime created;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable String tag;

  private @Nullable Long customId;

  private @Nullable String customType;

  private @Nullable Long userId;

  private @Nullable String username;

  private @Nullable String appTitle;

  private @Nullable Long appId;

  private @Nullable String appUrl;

  private @Nullable String appDescription;

  private @Nullable String imageURL;

  private @Nullable String profileImage;

  private @Nullable String fields;

  private @Nullable Long id;

  private @Nullable String customText;

  private @Nullable Double customValue;

  private @Nullable String customMessage;

  private @Nullable String returning;

  public UserActivityResponse valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public UserActivityResponse message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  public UserActivityResponse version(@Nullable Double version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public @Nullable Double getVersion() {
    return version;
  }

  public void setVersion(@Nullable Double version) {
    this.version = version;
  }

  public UserActivityResponse serializeNulls(@Nullable Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

  /**
   * Get serializeNulls
   * @return serializeNulls
   */
  
  @Schema(name = "serializeNulls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serializeNulls")
  public @Nullable Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(@Nullable Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public UserActivityResponse startTimeLog(@Nullable Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

  /**
   * Get startTimeLog
   * @return startTimeLog
   */
  
  @Schema(name = "startTimeLog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTimeLog")
  public @Nullable Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(@Nullable Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public UserActivityResponse errorCode(@Nullable String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
   */
  
  @Schema(name = "errorCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCode")
  public @Nullable String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(@Nullable String errorCode) {
    this.errorCode = errorCode;
  }

  public UserActivityResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public UserActivityResponse addRequestItem(NameStringValueResponse requestItem) {
    if (this.request == null) {
      this.request = new ArrayList<>();
    }
    this.request.add(requestItem);
    return this;
  }

  /**
   * Get request
   * @return request
   */
  @Valid 
  @Schema(name = "request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("request")
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public UserActivityResponse created(@Nullable OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  @Valid 
  @Schema(name = "created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created")
  public @Nullable OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(@Nullable OffsetDateTime created) {
    this.created = created;
  }

  public UserActivityResponse latitude(@Nullable Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   */
  
  @Schema(name = "latitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public @Nullable Double getLatitude() {
    return latitude;
  }

  public void setLatitude(@Nullable Double latitude) {
    this.latitude = latitude;
  }

  public UserActivityResponse longitude(@Nullable Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
   */
  
  @Schema(name = "longitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public @Nullable Double getLongitude() {
    return longitude;
  }

  public void setLongitude(@Nullable Double longitude) {
    this.longitude = longitude;
  }

  public UserActivityResponse tag(@Nullable String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * @return tag
   */
  
  @Schema(name = "tag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tag")
  public @Nullable String getTag() {
    return tag;
  }

  public void setTag(@Nullable String tag) {
    this.tag = tag;
  }

  public UserActivityResponse customId(@Nullable Long customId) {
    this.customId = customId;
    return this;
  }

  /**
   * Get customId
   * @return customId
   */
  
  @Schema(name = "customId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customId")
  public @Nullable Long getCustomId() {
    return customId;
  }

  public void setCustomId(@Nullable Long customId) {
    this.customId = customId;
  }

  public UserActivityResponse customType(@Nullable String customType) {
    this.customType = customType;
    return this;
  }

  /**
   * Get customType
   * @return customType
   */
  
  @Schema(name = "customType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customType")
  public @Nullable String getCustomType() {
    return customType;
  }

  public void setCustomType(@Nullable String customType) {
    this.customType = customType;
  }

  public UserActivityResponse userId(@Nullable Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public @Nullable Long getUserId() {
    return userId;
  }

  public void setUserId(@Nullable Long userId) {
    this.userId = userId;
  }

  public UserActivityResponse username(@Nullable String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  
  @Schema(name = "username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public @Nullable String getUsername() {
    return username;
  }

  public void setUsername(@Nullable String username) {
    this.username = username;
  }

  public UserActivityResponse appTitle(@Nullable String appTitle) {
    this.appTitle = appTitle;
    return this;
  }

  /**
   * Get appTitle
   * @return appTitle
   */
  
  @Schema(name = "appTitle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appTitle")
  public @Nullable String getAppTitle() {
    return appTitle;
  }

  public void setAppTitle(@Nullable String appTitle) {
    this.appTitle = appTitle;
  }

  public UserActivityResponse appId(@Nullable Long appId) {
    this.appId = appId;
    return this;
  }

  /**
   * Get appId
   * @return appId
   */
  
  @Schema(name = "appId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appId")
  public @Nullable Long getAppId() {
    return appId;
  }

  public void setAppId(@Nullable Long appId) {
    this.appId = appId;
  }

  public UserActivityResponse appUrl(@Nullable String appUrl) {
    this.appUrl = appUrl;
    return this;
  }

  /**
   * Get appUrl
   * @return appUrl
   */
  
  @Schema(name = "appUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appUrl")
  public @Nullable String getAppUrl() {
    return appUrl;
  }

  public void setAppUrl(@Nullable String appUrl) {
    this.appUrl = appUrl;
  }

  public UserActivityResponse appDescription(@Nullable String appDescription) {
    this.appDescription = appDescription;
    return this;
  }

  /**
   * Get appDescription
   * @return appDescription
   */
  
  @Schema(name = "appDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appDescription")
  public @Nullable String getAppDescription() {
    return appDescription;
  }

  public void setAppDescription(@Nullable String appDescription) {
    this.appDescription = appDescription;
  }

  public UserActivityResponse imageURL(@Nullable String imageURL) {
    this.imageURL = imageURL;
    return this;
  }

  /**
   * Get imageURL
   * @return imageURL
   */
  
  @Schema(name = "imageURL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imageURL")
  public @Nullable String getImageURL() {
    return imageURL;
  }

  public void setImageURL(@Nullable String imageURL) {
    this.imageURL = imageURL;
  }

  public UserActivityResponse profileImage(@Nullable String profileImage) {
    this.profileImage = profileImage;
    return this;
  }

  /**
   * Get profileImage
   * @return profileImage
   */
  
  @Schema(name = "profileImage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profileImage")
  public @Nullable String getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(@Nullable String profileImage) {
    this.profileImage = profileImage;
  }

  public UserActivityResponse fields(@Nullable String fields) {
    this.fields = fields;
    return this;
  }

  /**
   * Get fields
   * @return fields
   */
  
  @Schema(name = "fields", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fields")
  public @Nullable String getFields() {
    return fields;
  }

  public void setFields(@Nullable String fields) {
    this.fields = fields;
  }

  public UserActivityResponse id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public UserActivityResponse customText(@Nullable String customText) {
    this.customText = customText;
    return this;
  }

  /**
   * Get customText
   * @return customText
   */
  
  @Schema(name = "customText", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customText")
  public @Nullable String getCustomText() {
    return customText;
  }

  public void setCustomText(@Nullable String customText) {
    this.customText = customText;
  }

  public UserActivityResponse customValue(@Nullable Double customValue) {
    this.customValue = customValue;
    return this;
  }

  /**
   * Get customValue
   * @return customValue
   */
  
  @Schema(name = "customValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customValue")
  public @Nullable Double getCustomValue() {
    return customValue;
  }

  public void setCustomValue(@Nullable Double customValue) {
    this.customValue = customValue;
  }

  public UserActivityResponse customMessage(@Nullable String customMessage) {
    this.customMessage = customMessage;
    return this;
  }

  /**
   * Get customMessage
   * @return customMessage
   */
  
  @Schema(name = "customMessage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customMessage")
  public @Nullable String getCustomMessage() {
    return customMessage;
  }

  public void setCustomMessage(@Nullable String customMessage) {
    this.customMessage = customMessage;
  }

  public UserActivityResponse returning(@Nullable String returning) {
    this.returning = returning;
    return this;
  }

  /**
   * Get returning
   * @return returning
   */
  
  @Schema(name = "returning", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returning")
  public @Nullable String getReturning() {
    return returning;
  }

  public void setReturning(@Nullable String returning) {
    this.returning = returning;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserActivityResponse userActivityResponse = (UserActivityResponse) o;
    return Objects.equals(this.valid, userActivityResponse.valid) &&
        Objects.equals(this.message, userActivityResponse.message) &&
        Objects.equals(this.version, userActivityResponse.version) &&
        Objects.equals(this.serializeNulls, userActivityResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, userActivityResponse.startTimeLog) &&
        Objects.equals(this.errorCode, userActivityResponse.errorCode) &&
        Objects.equals(this.request, userActivityResponse.request) &&
        Objects.equals(this.created, userActivityResponse.created) &&
        Objects.equals(this.latitude, userActivityResponse.latitude) &&
        Objects.equals(this.longitude, userActivityResponse.longitude) &&
        Objects.equals(this.tag, userActivityResponse.tag) &&
        Objects.equals(this.customId, userActivityResponse.customId) &&
        Objects.equals(this.customType, userActivityResponse.customType) &&
        Objects.equals(this.userId, userActivityResponse.userId) &&
        Objects.equals(this.username, userActivityResponse.username) &&
        Objects.equals(this.appTitle, userActivityResponse.appTitle) &&
        Objects.equals(this.appId, userActivityResponse.appId) &&
        Objects.equals(this.appUrl, userActivityResponse.appUrl) &&
        Objects.equals(this.appDescription, userActivityResponse.appDescription) &&
        Objects.equals(this.imageURL, userActivityResponse.imageURL) &&
        Objects.equals(this.profileImage, userActivityResponse.profileImage) &&
        Objects.equals(this.fields, userActivityResponse.fields) &&
        Objects.equals(this.id, userActivityResponse.id) &&
        Objects.equals(this.customText, userActivityResponse.customText) &&
        Objects.equals(this.customValue, userActivityResponse.customValue) &&
        Objects.equals(this.customMessage, userActivityResponse.customMessage) &&
        Objects.equals(this.returning, userActivityResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, created, latitude, longitude, tag, customId, customType, userId, username, appTitle, appId, appUrl, appDescription, imageURL, profileImage, fields, id, customText, customValue, customMessage, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserActivityResponse {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    customId: ").append(toIndentedString(customId)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    appTitle: ").append(toIndentedString(appTitle)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appUrl: ").append(toIndentedString(appUrl)).append("\n");
    sb.append("    appDescription: ").append(toIndentedString(appDescription)).append("\n");
    sb.append("    imageURL: ").append(toIndentedString(imageURL)).append("\n");
    sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customText: ").append(toIndentedString(customText)).append("\n");
    sb.append("    customValue: ").append(toIndentedString(customValue)).append("\n");
    sb.append("    customMessage: ").append(toIndentedString(customMessage)).append("\n");
    sb.append("    returning: ").append(toIndentedString(returning)).append("\n");
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

