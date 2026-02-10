package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class UserActivityResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private Date created;
  private Double latitude;
  private Double longitude;
  private String tag;
  private Long customId;
  private String customType;
  private Long userId;
  private String username;
  private String appTitle;
  private Long appId;
  private String appUrl;
  private String appDescription;
  private String imageURL;
  private String profileImage;
  private String fields;
  private Long id;
  private String customText;
  private Double customValue;
  private String customMessage;
  private String returning;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }
  public void setVersion(Double version) {
    this.version = version;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }
  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }
  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("request")
  @Valid
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }
  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("created")
  public Date getCreated() {
    return created;
  }
  public void setCreated(Date created) {
    this.created = created;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tag")
  public String getTag() {
    return tag;
  }
  public void setTag(String tag) {
    this.tag = tag;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customId")
  public Long getCustomId() {
    return customId;
  }
  public void setCustomId(Long customId) {
    this.customId = customId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customType")
  public String getCustomType() {
    return customType;
  }
  public void setCustomType(String customType) {
    this.customType = customType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userId")
  public Long getUserId() {
    return userId;
  }
  public void setUserId(Long userId) {
    this.userId = userId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appTitle")
  public String getAppTitle() {
    return appTitle;
  }
  public void setAppTitle(String appTitle) {
    this.appTitle = appTitle;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appId")
  public Long getAppId() {
    return appId;
  }
  public void setAppId(Long appId) {
    this.appId = appId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appUrl")
  public String getAppUrl() {
    return appUrl;
  }
  public void setAppUrl(String appUrl) {
    this.appUrl = appUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appDescription")
  public String getAppDescription() {
    return appDescription;
  }
  public void setAppDescription(String appDescription) {
    this.appDescription = appDescription;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("imageURL")
  public String getImageURL() {
    return imageURL;
  }
  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("profileImage")
  public String getProfileImage() {
    return profileImage;
  }
  public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fields")
  public String getFields() {
    return fields;
  }
  public void setFields(String fields) {
    this.fields = fields;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customText")
  public String getCustomText() {
    return customText;
  }
  public void setCustomText(String customText) {
    this.customText = customText;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customValue")
  public Double getCustomValue() {
    return customValue;
  }
  public void setCustomValue(Double customValue) {
    this.customValue = customValue;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customMessage")
  public String getCustomMessage() {
    return customMessage;
  }
  public void setCustomMessage(String customMessage) {
    this.customMessage = customMessage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("returning")
  public String getReturning() {
    return returning;
  }
  public void setReturning(String returning) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

