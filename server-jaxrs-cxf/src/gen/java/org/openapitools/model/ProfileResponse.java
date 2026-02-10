package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AppInfoResponse;
import org.openapitools.model.ConnectionInfoResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.ProfileInfoResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ProfileResponse  {
  
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

  private Long loginAccountId;

  @ApiModelProperty(value = "")

  private Boolean validated;

  @ApiModelProperty(value = "")

  @Valid

  private AppInfoResponse appInfo;

  @ApiModelProperty(value = "")

  private Boolean canViewAppInfo;

  @ApiModelProperty(value = "")

  private Boolean canViewFriendInfo;

  @ApiModelProperty(value = "")

  private Boolean canViewProfileInfo;

  @ApiModelProperty(value = "")

  private Long flagCount;

  @ApiModelProperty(value = "")

  @Valid

  private ConnectionInfoResponse friendInfo;

  @ApiModelProperty(value = "")

  private Boolean isBlocked;

  @ApiModelProperty(value = "")

  private Boolean isProfileOwner;

  @ApiModelProperty(value = "")

  private Boolean metFlagThreshold;

  @ApiModelProperty(value = "")

  @Valid

  private ProfileInfoResponse profileInfo;

  @ApiModelProperty(value = "")

  private Boolean trusted;

  @ApiModelProperty(value = "")

  private Boolean following;

  @ApiModelProperty(value = "")

  private Boolean friendRequested;

  @ApiModelProperty(value = "")

  private Boolean friendRequestPending;

  @ApiModelProperty(value = "")

  private Boolean blocked;

  @ApiModelProperty(value = "")

  private Boolean flagged;

  @ApiModelProperty(value = "")

  private Boolean profileOwner;

  @ApiModelProperty(value = "")

  private Boolean friend;

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

  public ProfileResponse valid(Boolean valid) {
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

  public ProfileResponse message(String message) {
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

  public ProfileResponse version(Double version) {
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

  public ProfileResponse serializeNulls(Boolean serializeNulls) {
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

  public ProfileResponse startTimeLog(Long startTimeLog) {
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

  public ProfileResponse errorCode(String errorCode) {
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

  public ProfileResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ProfileResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get loginAccountId
   * @return loginAccountId
  **/
  @JsonProperty("loginAccountId")
  public Long getLoginAccountId() {
    return loginAccountId;
  }

  public void setLoginAccountId(Long loginAccountId) {
    this.loginAccountId = loginAccountId;
  }

  public ProfileResponse loginAccountId(Long loginAccountId) {
    this.loginAccountId = loginAccountId;
    return this;
  }

 /**
   * Get validated
   * @return validated
  **/
  @JsonProperty("validated")
  public Boolean getValidated() {
    return validated;
  }

  public void setValidated(Boolean validated) {
    this.validated = validated;
  }

  public ProfileResponse validated(Boolean validated) {
    this.validated = validated;
    return this;
  }

 /**
   * Get appInfo
   * @return appInfo
  **/
  @JsonProperty("appInfo")
  public AppInfoResponse getAppInfo() {
    return appInfo;
  }

  public void setAppInfo(AppInfoResponse appInfo) {
    this.appInfo = appInfo;
  }

  public ProfileResponse appInfo(AppInfoResponse appInfo) {
    this.appInfo = appInfo;
    return this;
  }

 /**
   * Get canViewAppInfo
   * @return canViewAppInfo
  **/
  @JsonProperty("canViewAppInfo")
  public Boolean getCanViewAppInfo() {
    return canViewAppInfo;
  }

  public void setCanViewAppInfo(Boolean canViewAppInfo) {
    this.canViewAppInfo = canViewAppInfo;
  }

  public ProfileResponse canViewAppInfo(Boolean canViewAppInfo) {
    this.canViewAppInfo = canViewAppInfo;
    return this;
  }

 /**
   * Get canViewFriendInfo
   * @return canViewFriendInfo
  **/
  @JsonProperty("canViewFriendInfo")
  public Boolean getCanViewFriendInfo() {
    return canViewFriendInfo;
  }

  public void setCanViewFriendInfo(Boolean canViewFriendInfo) {
    this.canViewFriendInfo = canViewFriendInfo;
  }

  public ProfileResponse canViewFriendInfo(Boolean canViewFriendInfo) {
    this.canViewFriendInfo = canViewFriendInfo;
    return this;
  }

 /**
   * Get canViewProfileInfo
   * @return canViewProfileInfo
  **/
  @JsonProperty("canViewProfileInfo")
  public Boolean getCanViewProfileInfo() {
    return canViewProfileInfo;
  }

  public void setCanViewProfileInfo(Boolean canViewProfileInfo) {
    this.canViewProfileInfo = canViewProfileInfo;
  }

  public ProfileResponse canViewProfileInfo(Boolean canViewProfileInfo) {
    this.canViewProfileInfo = canViewProfileInfo;
    return this;
  }

 /**
   * Get flagCount
   * @return flagCount
  **/
  @JsonProperty("flagCount")
  public Long getFlagCount() {
    return flagCount;
  }

  public void setFlagCount(Long flagCount) {
    this.flagCount = flagCount;
  }

  public ProfileResponse flagCount(Long flagCount) {
    this.flagCount = flagCount;
    return this;
  }

 /**
   * Get friendInfo
   * @return friendInfo
  **/
  @JsonProperty("friendInfo")
  public ConnectionInfoResponse getFriendInfo() {
    return friendInfo;
  }

  public void setFriendInfo(ConnectionInfoResponse friendInfo) {
    this.friendInfo = friendInfo;
  }

  public ProfileResponse friendInfo(ConnectionInfoResponse friendInfo) {
    this.friendInfo = friendInfo;
    return this;
  }

 /**
   * Get isBlocked
   * @return isBlocked
  **/
  @JsonProperty("isBlocked")
  public Boolean getIsBlocked() {
    return isBlocked;
  }

  public void setIsBlocked(Boolean isBlocked) {
    this.isBlocked = isBlocked;
  }

  public ProfileResponse isBlocked(Boolean isBlocked) {
    this.isBlocked = isBlocked;
    return this;
  }

 /**
   * Get isProfileOwner
   * @return isProfileOwner
  **/
  @JsonProperty("isProfileOwner")
  public Boolean getIsProfileOwner() {
    return isProfileOwner;
  }

  public void setIsProfileOwner(Boolean isProfileOwner) {
    this.isProfileOwner = isProfileOwner;
  }

  public ProfileResponse isProfileOwner(Boolean isProfileOwner) {
    this.isProfileOwner = isProfileOwner;
    return this;
  }

 /**
   * Get metFlagThreshold
   * @return metFlagThreshold
  **/
  @JsonProperty("metFlagThreshold")
  public Boolean getMetFlagThreshold() {
    return metFlagThreshold;
  }

  public void setMetFlagThreshold(Boolean metFlagThreshold) {
    this.metFlagThreshold = metFlagThreshold;
  }

  public ProfileResponse metFlagThreshold(Boolean metFlagThreshold) {
    this.metFlagThreshold = metFlagThreshold;
    return this;
  }

 /**
   * Get profileInfo
   * @return profileInfo
  **/
  @JsonProperty("profileInfo")
  public ProfileInfoResponse getProfileInfo() {
    return profileInfo;
  }

  public void setProfileInfo(ProfileInfoResponse profileInfo) {
    this.profileInfo = profileInfo;
  }

  public ProfileResponse profileInfo(ProfileInfoResponse profileInfo) {
    this.profileInfo = profileInfo;
    return this;
  }

 /**
   * Get trusted
   * @return trusted
  **/
  @JsonProperty("trusted")
  public Boolean getTrusted() {
    return trusted;
  }

  public void setTrusted(Boolean trusted) {
    this.trusted = trusted;
  }

  public ProfileResponse trusted(Boolean trusted) {
    this.trusted = trusted;
    return this;
  }

 /**
   * Get following
   * @return following
  **/
  @JsonProperty("following")
  public Boolean getFollowing() {
    return following;
  }

  public void setFollowing(Boolean following) {
    this.following = following;
  }

  public ProfileResponse following(Boolean following) {
    this.following = following;
    return this;
  }

 /**
   * Get friendRequested
   * @return friendRequested
  **/
  @JsonProperty("friendRequested")
  public Boolean getFriendRequested() {
    return friendRequested;
  }

  public void setFriendRequested(Boolean friendRequested) {
    this.friendRequested = friendRequested;
  }

  public ProfileResponse friendRequested(Boolean friendRequested) {
    this.friendRequested = friendRequested;
    return this;
  }

 /**
   * Get friendRequestPending
   * @return friendRequestPending
  **/
  @JsonProperty("friendRequestPending")
  public Boolean getFriendRequestPending() {
    return friendRequestPending;
  }

  public void setFriendRequestPending(Boolean friendRequestPending) {
    this.friendRequestPending = friendRequestPending;
  }

  public ProfileResponse friendRequestPending(Boolean friendRequestPending) {
    this.friendRequestPending = friendRequestPending;
    return this;
  }

 /**
   * Get blocked
   * @return blocked
  **/
  @JsonProperty("blocked")
  public Boolean getBlocked() {
    return blocked;
  }

  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }

  public ProfileResponse blocked(Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

 /**
   * Get flagged
   * @return flagged
  **/
  @JsonProperty("flagged")
  public Boolean getFlagged() {
    return flagged;
  }

  public void setFlagged(Boolean flagged) {
    this.flagged = flagged;
  }

  public ProfileResponse flagged(Boolean flagged) {
    this.flagged = flagged;
    return this;
  }

 /**
   * Get profileOwner
   * @return profileOwner
  **/
  @JsonProperty("profileOwner")
  public Boolean getProfileOwner() {
    return profileOwner;
  }

  public void setProfileOwner(Boolean profileOwner) {
    this.profileOwner = profileOwner;
  }

  public ProfileResponse profileOwner(Boolean profileOwner) {
    this.profileOwner = profileOwner;
    return this;
  }

 /**
   * Get friend
   * @return friend
  **/
  @JsonProperty("friend")
  public Boolean getFriend() {
    return friend;
  }

  public void setFriend(Boolean friend) {
    this.friend = friend;
  }

  public ProfileResponse friend(Boolean friend) {
    this.friend = friend;
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

  public ProfileResponse returning(String returning) {
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
    ProfileResponse profileResponse = (ProfileResponse) o;
    return Objects.equals(this.valid, profileResponse.valid) &&
        Objects.equals(this.message, profileResponse.message) &&
        Objects.equals(this.version, profileResponse.version) &&
        Objects.equals(this.serializeNulls, profileResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, profileResponse.startTimeLog) &&
        Objects.equals(this.errorCode, profileResponse.errorCode) &&
        Objects.equals(this.request, profileResponse.request) &&
        Objects.equals(this.loginAccountId, profileResponse.loginAccountId) &&
        Objects.equals(this.validated, profileResponse.validated) &&
        Objects.equals(this.appInfo, profileResponse.appInfo) &&
        Objects.equals(this.canViewAppInfo, profileResponse.canViewAppInfo) &&
        Objects.equals(this.canViewFriendInfo, profileResponse.canViewFriendInfo) &&
        Objects.equals(this.canViewProfileInfo, profileResponse.canViewProfileInfo) &&
        Objects.equals(this.flagCount, profileResponse.flagCount) &&
        Objects.equals(this.friendInfo, profileResponse.friendInfo) &&
        Objects.equals(this.isBlocked, profileResponse.isBlocked) &&
        Objects.equals(this.isProfileOwner, profileResponse.isProfileOwner) &&
        Objects.equals(this.metFlagThreshold, profileResponse.metFlagThreshold) &&
        Objects.equals(this.profileInfo, profileResponse.profileInfo) &&
        Objects.equals(this.trusted, profileResponse.trusted) &&
        Objects.equals(this.following, profileResponse.following) &&
        Objects.equals(this.friendRequested, profileResponse.friendRequested) &&
        Objects.equals(this.friendRequestPending, profileResponse.friendRequestPending) &&
        Objects.equals(this.blocked, profileResponse.blocked) &&
        Objects.equals(this.flagged, profileResponse.flagged) &&
        Objects.equals(this.profileOwner, profileResponse.profileOwner) &&
        Objects.equals(this.friend, profileResponse.friend) &&
        Objects.equals(this.returning, profileResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, loginAccountId, validated, appInfo, canViewAppInfo, canViewFriendInfo, canViewProfileInfo, flagCount, friendInfo, isBlocked, isProfileOwner, metFlagThreshold, profileInfo, trusted, following, friendRequested, friendRequestPending, blocked, flagged, profileOwner, friend, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    loginAccountId: ").append(toIndentedString(loginAccountId)).append("\n");
    sb.append("    validated: ").append(toIndentedString(validated)).append("\n");
    sb.append("    appInfo: ").append(toIndentedString(appInfo)).append("\n");
    sb.append("    canViewAppInfo: ").append(toIndentedString(canViewAppInfo)).append("\n");
    sb.append("    canViewFriendInfo: ").append(toIndentedString(canViewFriendInfo)).append("\n");
    sb.append("    canViewProfileInfo: ").append(toIndentedString(canViewProfileInfo)).append("\n");
    sb.append("    flagCount: ").append(toIndentedString(flagCount)).append("\n");
    sb.append("    friendInfo: ").append(toIndentedString(friendInfo)).append("\n");
    sb.append("    isBlocked: ").append(toIndentedString(isBlocked)).append("\n");
    sb.append("    isProfileOwner: ").append(toIndentedString(isProfileOwner)).append("\n");
    sb.append("    metFlagThreshold: ").append(toIndentedString(metFlagThreshold)).append("\n");
    sb.append("    profileInfo: ").append(toIndentedString(profileInfo)).append("\n");
    sb.append("    trusted: ").append(toIndentedString(trusted)).append("\n");
    sb.append("    following: ").append(toIndentedString(following)).append("\n");
    sb.append("    friendRequested: ").append(toIndentedString(friendRequested)).append("\n");
    sb.append("    friendRequestPending: ").append(toIndentedString(friendRequestPending)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    flagged: ").append(toIndentedString(flagged)).append("\n");
    sb.append("    profileOwner: ").append(toIndentedString(profileOwner)).append("\n");
    sb.append("    friend: ").append(toIndentedString(friend)).append("\n");
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

