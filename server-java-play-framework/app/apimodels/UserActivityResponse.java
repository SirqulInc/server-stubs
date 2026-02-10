package apimodels;

import apimodels.NameStringValueResponse;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UserActivityResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UserActivityResponse   {
  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("message")
  
  private String message;

  @JsonProperty("version")
  
  private Double version;

  @JsonProperty("serializeNulls")
  
  private Boolean serializeNulls;

  @JsonProperty("startTimeLog")
  
  private Long startTimeLog;

  @JsonProperty("errorCode")
  
  private String errorCode;

  @JsonProperty("request")
  @Valid

  private List<@Valid NameStringValueResponse> request = null;

  @JsonProperty("created")
  @Valid

  private OffsetDateTime created;

  @JsonProperty("latitude")
  
  private Double latitude;

  @JsonProperty("longitude")
  
  private Double longitude;

  @JsonProperty("tag")
  
  private String tag;

  @JsonProperty("customId")
  
  private Long customId;

  @JsonProperty("customType")
  
  private String customType;

  @JsonProperty("userId")
  
  private Long userId;

  @JsonProperty("username")
  
  private String username;

  @JsonProperty("appTitle")
  
  private String appTitle;

  @JsonProperty("appId")
  
  private Long appId;

  @JsonProperty("appUrl")
  
  private String appUrl;

  @JsonProperty("appDescription")
  
  private String appDescription;

  @JsonProperty("imageURL")
  
  private String imageURL;

  @JsonProperty("profileImage")
  
  private String profileImage;

  @JsonProperty("fields")
  
  private String fields;

  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("customText")
  
  private String customText;

  @JsonProperty("customValue")
  
  private Double customValue;

  @JsonProperty("customMessage")
  
  private String customMessage;

  @JsonProperty("returning")
  
  private String returning;

  public UserActivityResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public UserActivityResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public UserActivityResponse version(Double version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public UserActivityResponse serializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

   /**
   * Get serializeNulls
   * @return serializeNulls
  **/
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public UserActivityResponse startTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

   /**
   * Get startTimeLog
   * @return startTimeLog
  **/
  public Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public UserActivityResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
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
  **/
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public UserActivityResponse created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public UserActivityResponse latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public UserActivityResponse longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public UserActivityResponse tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public UserActivityResponse customId(Long customId) {
    this.customId = customId;
    return this;
  }

   /**
   * Get customId
   * @return customId
  **/
  public Long getCustomId() {
    return customId;
  }

  public void setCustomId(Long customId) {
    this.customId = customId;
  }

  public UserActivityResponse customType(String customType) {
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

  public UserActivityResponse userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public UserActivityResponse username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UserActivityResponse appTitle(String appTitle) {
    this.appTitle = appTitle;
    return this;
  }

   /**
   * Get appTitle
   * @return appTitle
  **/
  public String getAppTitle() {
    return appTitle;
  }

  public void setAppTitle(String appTitle) {
    this.appTitle = appTitle;
  }

  public UserActivityResponse appId(Long appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  public Long getAppId() {
    return appId;
  }

  public void setAppId(Long appId) {
    this.appId = appId;
  }

  public UserActivityResponse appUrl(String appUrl) {
    this.appUrl = appUrl;
    return this;
  }

   /**
   * Get appUrl
   * @return appUrl
  **/
  public String getAppUrl() {
    return appUrl;
  }

  public void setAppUrl(String appUrl) {
    this.appUrl = appUrl;
  }

  public UserActivityResponse appDescription(String appDescription) {
    this.appDescription = appDescription;
    return this;
  }

   /**
   * Get appDescription
   * @return appDescription
  **/
  public String getAppDescription() {
    return appDescription;
  }

  public void setAppDescription(String appDescription) {
    this.appDescription = appDescription;
  }

  public UserActivityResponse imageURL(String imageURL) {
    this.imageURL = imageURL;
    return this;
  }

   /**
   * Get imageURL
   * @return imageURL
  **/
  public String getImageURL() {
    return imageURL;
  }

  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }

  public UserActivityResponse profileImage(String profileImage) {
    this.profileImage = profileImage;
    return this;
  }

   /**
   * Get profileImage
   * @return profileImage
  **/
  public String getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
  }

  public UserActivityResponse fields(String fields) {
    this.fields = fields;
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  public String getFields() {
    return fields;
  }

  public void setFields(String fields) {
    this.fields = fields;
  }

  public UserActivityResponse id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserActivityResponse customText(String customText) {
    this.customText = customText;
    return this;
  }

   /**
   * Get customText
   * @return customText
  **/
  public String getCustomText() {
    return customText;
  }

  public void setCustomText(String customText) {
    this.customText = customText;
  }

  public UserActivityResponse customValue(Double customValue) {
    this.customValue = customValue;
    return this;
  }

   /**
   * Get customValue
   * @return customValue
  **/
  public Double getCustomValue() {
    return customValue;
  }

  public void setCustomValue(Double customValue) {
    this.customValue = customValue;
  }

  public UserActivityResponse customMessage(String customMessage) {
    this.customMessage = customMessage;
    return this;
  }

   /**
   * Get customMessage
   * @return customMessage
  **/
  public String getCustomMessage() {
    return customMessage;
  }

  public void setCustomMessage(String customMessage) {
    this.customMessage = customMessage;
  }

  public UserActivityResponse returning(String returning) {
    this.returning = returning;
    return this;
  }

   /**
   * Get returning
   * @return returning
  **/
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
    return Objects.equals(valid, userActivityResponse.valid) &&
        Objects.equals(message, userActivityResponse.message) &&
        Objects.equals(version, userActivityResponse.version) &&
        Objects.equals(serializeNulls, userActivityResponse.serializeNulls) &&
        Objects.equals(startTimeLog, userActivityResponse.startTimeLog) &&
        Objects.equals(errorCode, userActivityResponse.errorCode) &&
        Objects.equals(request, userActivityResponse.request) &&
        Objects.equals(created, userActivityResponse.created) &&
        Objects.equals(latitude, userActivityResponse.latitude) &&
        Objects.equals(longitude, userActivityResponse.longitude) &&
        Objects.equals(tag, userActivityResponse.tag) &&
        Objects.equals(customId, userActivityResponse.customId) &&
        Objects.equals(customType, userActivityResponse.customType) &&
        Objects.equals(userId, userActivityResponse.userId) &&
        Objects.equals(username, userActivityResponse.username) &&
        Objects.equals(appTitle, userActivityResponse.appTitle) &&
        Objects.equals(appId, userActivityResponse.appId) &&
        Objects.equals(appUrl, userActivityResponse.appUrl) &&
        Objects.equals(appDescription, userActivityResponse.appDescription) &&
        Objects.equals(imageURL, userActivityResponse.imageURL) &&
        Objects.equals(profileImage, userActivityResponse.profileImage) &&
        Objects.equals(fields, userActivityResponse.fields) &&
        Objects.equals(id, userActivityResponse.id) &&
        Objects.equals(customText, userActivityResponse.customText) &&
        Objects.equals(customValue, userActivityResponse.customValue) &&
        Objects.equals(customMessage, userActivityResponse.customMessage) &&
        Objects.equals(returning, userActivityResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, created, latitude, longitude, tag, customId, customType, userId, username, appTitle, appId, appUrl, appDescription, imageURL, profileImage, fields, id, customText, customValue, customMessage, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

