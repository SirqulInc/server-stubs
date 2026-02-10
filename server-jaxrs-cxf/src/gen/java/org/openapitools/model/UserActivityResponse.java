package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UserActivityResponse  {
  
  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String message;

  @ApiModelProperty(value = "")

  private Double version;

  @ApiModelProperty(value = "")

  private Boolean serializeNulls;

  @ApiModelProperty(value = "")

  private Long startTimeLog;

  @ApiModelProperty(value = "")

  private String errorCode;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Date created;

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;

  @ApiModelProperty(value = "")

  private String tag;

  @ApiModelProperty(value = "")

  private Long customId;

  @ApiModelProperty(value = "")

  private String customType;

  @ApiModelProperty(value = "")

  private Long userId;

  @ApiModelProperty(value = "")

  private String username;

  @ApiModelProperty(value = "")

  private String appTitle;

  @ApiModelProperty(value = "")

  private Long appId;

  @ApiModelProperty(value = "")

  private String appUrl;

  @ApiModelProperty(value = "")

  private String appDescription;

  @ApiModelProperty(value = "")

  private String imageURL;

  @ApiModelProperty(value = "")

  private String profileImage;

  @ApiModelProperty(value = "")

  private String fields;

  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private String customText;

  @ApiModelProperty(value = "")

  private Double customValue;

  @ApiModelProperty(value = "")

  private String customMessage;

  @ApiModelProperty(value = "")

  private String returning;
 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public UserActivityResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public UserActivityResponse message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public UserActivityResponse version(Double version) {
    this.version = version;
    return this;
  }

 /**
   * Get serializeNulls
   * @return serializeNulls
  **/
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public UserActivityResponse serializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

 /**
   * Get startTimeLog
   * @return startTimeLog
  **/
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public UserActivityResponse startTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

 /**
   * Get errorCode
   * @return errorCode
  **/
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public UserActivityResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

 /**
   * Get request
   * @return request
  **/
  @JsonProperty("request")
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public UserActivityResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public UserActivityResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get created
   * @return created
  **/
  @JsonProperty("created")
  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public UserActivityResponse created(Date created) {
    this.created = created;
    return this;
  }

 /**
   * Get latitude
   * @return latitude
  **/
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public UserActivityResponse latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Get longitude
   * @return longitude
  **/
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public UserActivityResponse longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Get tag
   * @return tag
  **/
  @JsonProperty("tag")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public UserActivityResponse tag(String tag) {
    this.tag = tag;
    return this;
  }

 /**
   * Get customId
   * @return customId
  **/
  @JsonProperty("customId")
  public Long getCustomId() {
    return customId;
  }

  public void setCustomId(Long customId) {
    this.customId = customId;
  }

  public UserActivityResponse customId(Long customId) {
    this.customId = customId;
    return this;
  }

 /**
   * Get customType
   * @return customType
  **/
  @JsonProperty("customType")
  public String getCustomType() {
    return customType;
  }

  public void setCustomType(String customType) {
    this.customType = customType;
  }

  public UserActivityResponse customType(String customType) {
    this.customType = customType;
    return this;
  }

 /**
   * Get userId
   * @return userId
  **/
  @JsonProperty("userId")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public UserActivityResponse userId(Long userId) {
    this.userId = userId;
    return this;
  }

 /**
   * Get username
   * @return username
  **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UserActivityResponse username(String username) {
    this.username = username;
    return this;
  }

 /**
   * Get appTitle
   * @return appTitle
  **/
  @JsonProperty("appTitle")
  public String getAppTitle() {
    return appTitle;
  }

  public void setAppTitle(String appTitle) {
    this.appTitle = appTitle;
  }

  public UserActivityResponse appTitle(String appTitle) {
    this.appTitle = appTitle;
    return this;
  }

 /**
   * Get appId
   * @return appId
  **/
  @JsonProperty("appId")
  public Long getAppId() {
    return appId;
  }

  public void setAppId(Long appId) {
    this.appId = appId;
  }

  public UserActivityResponse appId(Long appId) {
    this.appId = appId;
    return this;
  }

 /**
   * Get appUrl
   * @return appUrl
  **/
  @JsonProperty("appUrl")
  public String getAppUrl() {
    return appUrl;
  }

  public void setAppUrl(String appUrl) {
    this.appUrl = appUrl;
  }

  public UserActivityResponse appUrl(String appUrl) {
    this.appUrl = appUrl;
    return this;
  }

 /**
   * Get appDescription
   * @return appDescription
  **/
  @JsonProperty("appDescription")
  public String getAppDescription() {
    return appDescription;
  }

  public void setAppDescription(String appDescription) {
    this.appDescription = appDescription;
  }

  public UserActivityResponse appDescription(String appDescription) {
    this.appDescription = appDescription;
    return this;
  }

 /**
   * Get imageURL
   * @return imageURL
  **/
  @JsonProperty("imageURL")
  public String getImageURL() {
    return imageURL;
  }

  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }

  public UserActivityResponse imageURL(String imageURL) {
    this.imageURL = imageURL;
    return this;
  }

 /**
   * Get profileImage
   * @return profileImage
  **/
  @JsonProperty("profileImage")
  public String getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
  }

  public UserActivityResponse profileImage(String profileImage) {
    this.profileImage = profileImage;
    return this;
  }

 /**
   * Get fields
   * @return fields
  **/
  @JsonProperty("fields")
  public String getFields() {
    return fields;
  }

  public void setFields(String fields) {
    this.fields = fields;
  }

  public UserActivityResponse fields(String fields) {
    this.fields = fields;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserActivityResponse id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get customText
   * @return customText
  **/
  @JsonProperty("customText")
  public String getCustomText() {
    return customText;
  }

  public void setCustomText(String customText) {
    this.customText = customText;
  }

  public UserActivityResponse customText(String customText) {
    this.customText = customText;
    return this;
  }

 /**
   * Get customValue
   * @return customValue
  **/
  @JsonProperty("customValue")
  public Double getCustomValue() {
    return customValue;
  }

  public void setCustomValue(Double customValue) {
    this.customValue = customValue;
  }

  public UserActivityResponse customValue(Double customValue) {
    this.customValue = customValue;
    return this;
  }

 /**
   * Get customMessage
   * @return customMessage
  **/
  @JsonProperty("customMessage")
  public String getCustomMessage() {
    return customMessage;
  }

  public void setCustomMessage(String customMessage) {
    this.customMessage = customMessage;
  }

  public UserActivityResponse customMessage(String customMessage) {
    this.customMessage = customMessage;
    return this;
  }

 /**
   * Get returning
   * @return returning
  **/
  @JsonProperty("returning")
  public String getReturning() {
    return returning;
  }

  public void setReturning(String returning) {
    this.returning = returning;
  }

  public UserActivityResponse returning(String returning) {
    this.returning = returning;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

