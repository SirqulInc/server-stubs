package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AppInfoResponse;
import org.openapitools.model.ConnectionInfoResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.ProfileInfoResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ProfileResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private Long loginAccountId;
  private Boolean validated;
  private AppInfoResponse appInfo;
  private Boolean canViewAppInfo;
  private Boolean canViewFriendInfo;
  private Boolean canViewProfileInfo;
  private Long flagCount;
  private ConnectionInfoResponse friendInfo;
  private Boolean isBlocked;
  private Boolean isProfileOwner;
  private Boolean metFlagThreshold;
  private ProfileInfoResponse profileInfo;
  private Boolean trusted;
  private Boolean following;
  private Boolean friendRequested;
  private Boolean friendRequestPending;
  private Boolean blocked;
  private Boolean flagged;
  private Boolean profileOwner;
  private Boolean friend;
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
  @JsonProperty("loginAccountId")
  public Long getLoginAccountId() {
    return loginAccountId;
  }
  public void setLoginAccountId(Long loginAccountId) {
    this.loginAccountId = loginAccountId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("validated")
  public Boolean getValidated() {
    return validated;
  }
  public void setValidated(Boolean validated) {
    this.validated = validated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appInfo")
  @Valid
  public AppInfoResponse getAppInfo() {
    return appInfo;
  }
  public void setAppInfo(AppInfoResponse appInfo) {
    this.appInfo = appInfo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("canViewAppInfo")
  public Boolean getCanViewAppInfo() {
    return canViewAppInfo;
  }
  public void setCanViewAppInfo(Boolean canViewAppInfo) {
    this.canViewAppInfo = canViewAppInfo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("canViewFriendInfo")
  public Boolean getCanViewFriendInfo() {
    return canViewFriendInfo;
  }
  public void setCanViewFriendInfo(Boolean canViewFriendInfo) {
    this.canViewFriendInfo = canViewFriendInfo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("canViewProfileInfo")
  public Boolean getCanViewProfileInfo() {
    return canViewProfileInfo;
  }
  public void setCanViewProfileInfo(Boolean canViewProfileInfo) {
    this.canViewProfileInfo = canViewProfileInfo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flagCount")
  public Long getFlagCount() {
    return flagCount;
  }
  public void setFlagCount(Long flagCount) {
    this.flagCount = flagCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("friendInfo")
  @Valid
  public ConnectionInfoResponse getFriendInfo() {
    return friendInfo;
  }
  public void setFriendInfo(ConnectionInfoResponse friendInfo) {
    this.friendInfo = friendInfo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isBlocked")
  public Boolean getIsBlocked() {
    return isBlocked;
  }
  public void setIsBlocked(Boolean isBlocked) {
    this.isBlocked = isBlocked;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isProfileOwner")
  public Boolean getIsProfileOwner() {
    return isProfileOwner;
  }
  public void setIsProfileOwner(Boolean isProfileOwner) {
    this.isProfileOwner = isProfileOwner;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("metFlagThreshold")
  public Boolean getMetFlagThreshold() {
    return metFlagThreshold;
  }
  public void setMetFlagThreshold(Boolean metFlagThreshold) {
    this.metFlagThreshold = metFlagThreshold;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("profileInfo")
  @Valid
  public ProfileInfoResponse getProfileInfo() {
    return profileInfo;
  }
  public void setProfileInfo(ProfileInfoResponse profileInfo) {
    this.profileInfo = profileInfo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("trusted")
  public Boolean getTrusted() {
    return trusted;
  }
  public void setTrusted(Boolean trusted) {
    this.trusted = trusted;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("following")
  public Boolean getFollowing() {
    return following;
  }
  public void setFollowing(Boolean following) {
    this.following = following;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("friendRequested")
  public Boolean getFriendRequested() {
    return friendRequested;
  }
  public void setFriendRequested(Boolean friendRequested) {
    this.friendRequested = friendRequested;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("friendRequestPending")
  public Boolean getFriendRequestPending() {
    return friendRequestPending;
  }
  public void setFriendRequestPending(Boolean friendRequestPending) {
    this.friendRequestPending = friendRequestPending;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("blocked")
  public Boolean getBlocked() {
    return blocked;
  }
  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flagged")
  public Boolean getFlagged() {
    return flagged;
  }
  public void setFlagged(Boolean flagged) {
    this.flagged = flagged;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("profileOwner")
  public Boolean getProfileOwner() {
    return profileOwner;
  }
  public void setProfileOwner(Boolean profileOwner) {
    this.profileOwner = profileOwner;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("friend")
  public Boolean getFriend() {
    return friend;
  }
  public void setFriend(Boolean friend) {
    this.friend = friend;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

