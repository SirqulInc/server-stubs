package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ProfileShortResponse  {
  
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

  private Long accountId;

  @ApiModelProperty(value = "")

  private String locationDisplay;

  @ApiModelProperty(value = "")

  private String display;

  @ApiModelProperty(value = "")

  private String username;

  @ApiModelProperty(value = "")

  private String profileImage;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse profileAvatar;

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

  public ProfileShortResponse valid(Boolean valid) {
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

  public ProfileShortResponse message(String message) {
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

  public ProfileShortResponse version(Double version) {
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

  public ProfileShortResponse serializeNulls(Boolean serializeNulls) {
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

  public ProfileShortResponse startTimeLog(Long startTimeLog) {
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

  public ProfileShortResponse errorCode(String errorCode) {
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

  public ProfileShortResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ProfileShortResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get accountId
   * @return accountId
  **/
  @JsonProperty("accountId")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public ProfileShortResponse accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * Get locationDisplay
   * @return locationDisplay
  **/
  @JsonProperty("locationDisplay")
  public String getLocationDisplay() {
    return locationDisplay;
  }

  public void setLocationDisplay(String locationDisplay) {
    this.locationDisplay = locationDisplay;
  }

  public ProfileShortResponse locationDisplay(String locationDisplay) {
    this.locationDisplay = locationDisplay;
    return this;
  }

 /**
   * Get display
   * @return display
  **/
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public ProfileShortResponse display(String display) {
    this.display = display;
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

  public ProfileShortResponse username(String username) {
    this.username = username;
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

  public ProfileShortResponse profileImage(String profileImage) {
    this.profileImage = profileImage;
    return this;
  }

 /**
   * Get profileAvatar
   * @return profileAvatar
  **/
  @JsonProperty("profileAvatar")
  public AssetShortResponse getProfileAvatar() {
    return profileAvatar;
  }

  public void setProfileAvatar(AssetShortResponse profileAvatar) {
    this.profileAvatar = profileAvatar;
  }

  public ProfileShortResponse profileAvatar(AssetShortResponse profileAvatar) {
    this.profileAvatar = profileAvatar;
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

  public ProfileShortResponse returning(String returning) {
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
    ProfileShortResponse profileShortResponse = (ProfileShortResponse) o;
    return Objects.equals(this.valid, profileShortResponse.valid) &&
        Objects.equals(this.message, profileShortResponse.message) &&
        Objects.equals(this.version, profileShortResponse.version) &&
        Objects.equals(this.serializeNulls, profileShortResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, profileShortResponse.startTimeLog) &&
        Objects.equals(this.errorCode, profileShortResponse.errorCode) &&
        Objects.equals(this.request, profileShortResponse.request) &&
        Objects.equals(this.accountId, profileShortResponse.accountId) &&
        Objects.equals(this.locationDisplay, profileShortResponse.locationDisplay) &&
        Objects.equals(this.display, profileShortResponse.display) &&
        Objects.equals(this.username, profileShortResponse.username) &&
        Objects.equals(this.profileImage, profileShortResponse.profileImage) &&
        Objects.equals(this.profileAvatar, profileShortResponse.profileAvatar) &&
        Objects.equals(this.returning, profileShortResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, accountId, locationDisplay, display, username, profileImage, profileAvatar, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileShortResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    locationDisplay: ").append(toIndentedString(locationDisplay)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
    sb.append("    profileAvatar: ").append(toIndentedString(profileAvatar)).append("\n");
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

