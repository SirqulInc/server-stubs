package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AppInfoResponse;
import org.openapitools.model.ConnectionInfoResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.ProfileInfoResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProfileResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ProfileResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  private @Nullable Long loginAccountId;

  private @Nullable Boolean validated;

  private @Nullable AppInfoResponse appInfo;

  private @Nullable Boolean canViewAppInfo;

  private @Nullable Boolean canViewFriendInfo;

  private @Nullable Boolean canViewProfileInfo;

  private @Nullable Long flagCount;

  private @Nullable ConnectionInfoResponse friendInfo;

  private @Nullable Boolean isBlocked;

  private @Nullable Boolean isProfileOwner;

  private @Nullable Boolean metFlagThreshold;

  private @Nullable ProfileInfoResponse profileInfo;

  private @Nullable Boolean trusted;

  private @Nullable Boolean following;

  private @Nullable Boolean friendRequested;

  private @Nullable Boolean friendRequestPending;

  private @Nullable Boolean blocked;

  private @Nullable Boolean flagged;

  private @Nullable Boolean profileOwner;

  private @Nullable Boolean friend;

  private @Nullable String returning;

  public ProfileResponse valid(@Nullable Boolean valid) {
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

  public ProfileResponse message(@Nullable String message) {
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

  public ProfileResponse version(@Nullable Double version) {
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

  public ProfileResponse serializeNulls(@Nullable Boolean serializeNulls) {
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

  public ProfileResponse startTimeLog(@Nullable Long startTimeLog) {
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

  public ProfileResponse errorCode(@Nullable String errorCode) {
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

  public ProfileResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ProfileResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public ProfileResponse loginAccountId(@Nullable Long loginAccountId) {
    this.loginAccountId = loginAccountId;
    return this;
  }

  /**
   * Get loginAccountId
   * @return loginAccountId
   */
  
  @Schema(name = "loginAccountId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("loginAccountId")
  public @Nullable Long getLoginAccountId() {
    return loginAccountId;
  }

  public void setLoginAccountId(@Nullable Long loginAccountId) {
    this.loginAccountId = loginAccountId;
  }

  public ProfileResponse validated(@Nullable Boolean validated) {
    this.validated = validated;
    return this;
  }

  /**
   * Get validated
   * @return validated
   */
  
  @Schema(name = "validated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validated")
  public @Nullable Boolean getValidated() {
    return validated;
  }

  public void setValidated(@Nullable Boolean validated) {
    this.validated = validated;
  }

  public ProfileResponse appInfo(@Nullable AppInfoResponse appInfo) {
    this.appInfo = appInfo;
    return this;
  }

  /**
   * Get appInfo
   * @return appInfo
   */
  @Valid 
  @Schema(name = "appInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appInfo")
  public @Nullable AppInfoResponse getAppInfo() {
    return appInfo;
  }

  public void setAppInfo(@Nullable AppInfoResponse appInfo) {
    this.appInfo = appInfo;
  }

  public ProfileResponse canViewAppInfo(@Nullable Boolean canViewAppInfo) {
    this.canViewAppInfo = canViewAppInfo;
    return this;
  }

  /**
   * Get canViewAppInfo
   * @return canViewAppInfo
   */
  
  @Schema(name = "canViewAppInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("canViewAppInfo")
  public @Nullable Boolean getCanViewAppInfo() {
    return canViewAppInfo;
  }

  public void setCanViewAppInfo(@Nullable Boolean canViewAppInfo) {
    this.canViewAppInfo = canViewAppInfo;
  }

  public ProfileResponse canViewFriendInfo(@Nullable Boolean canViewFriendInfo) {
    this.canViewFriendInfo = canViewFriendInfo;
    return this;
  }

  /**
   * Get canViewFriendInfo
   * @return canViewFriendInfo
   */
  
  @Schema(name = "canViewFriendInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("canViewFriendInfo")
  public @Nullable Boolean getCanViewFriendInfo() {
    return canViewFriendInfo;
  }

  public void setCanViewFriendInfo(@Nullable Boolean canViewFriendInfo) {
    this.canViewFriendInfo = canViewFriendInfo;
  }

  public ProfileResponse canViewProfileInfo(@Nullable Boolean canViewProfileInfo) {
    this.canViewProfileInfo = canViewProfileInfo;
    return this;
  }

  /**
   * Get canViewProfileInfo
   * @return canViewProfileInfo
   */
  
  @Schema(name = "canViewProfileInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("canViewProfileInfo")
  public @Nullable Boolean getCanViewProfileInfo() {
    return canViewProfileInfo;
  }

  public void setCanViewProfileInfo(@Nullable Boolean canViewProfileInfo) {
    this.canViewProfileInfo = canViewProfileInfo;
  }

  public ProfileResponse flagCount(@Nullable Long flagCount) {
    this.flagCount = flagCount;
    return this;
  }

  /**
   * Get flagCount
   * @return flagCount
   */
  
  @Schema(name = "flagCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flagCount")
  public @Nullable Long getFlagCount() {
    return flagCount;
  }

  public void setFlagCount(@Nullable Long flagCount) {
    this.flagCount = flagCount;
  }

  public ProfileResponse friendInfo(@Nullable ConnectionInfoResponse friendInfo) {
    this.friendInfo = friendInfo;
    return this;
  }

  /**
   * Get friendInfo
   * @return friendInfo
   */
  @Valid 
  @Schema(name = "friendInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("friendInfo")
  public @Nullable ConnectionInfoResponse getFriendInfo() {
    return friendInfo;
  }

  public void setFriendInfo(@Nullable ConnectionInfoResponse friendInfo) {
    this.friendInfo = friendInfo;
  }

  public ProfileResponse isBlocked(@Nullable Boolean isBlocked) {
    this.isBlocked = isBlocked;
    return this;
  }

  /**
   * Get isBlocked
   * @return isBlocked
   */
  
  @Schema(name = "isBlocked", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isBlocked")
  public @Nullable Boolean getIsBlocked() {
    return isBlocked;
  }

  public void setIsBlocked(@Nullable Boolean isBlocked) {
    this.isBlocked = isBlocked;
  }

  public ProfileResponse isProfileOwner(@Nullable Boolean isProfileOwner) {
    this.isProfileOwner = isProfileOwner;
    return this;
  }

  /**
   * Get isProfileOwner
   * @return isProfileOwner
   */
  
  @Schema(name = "isProfileOwner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isProfileOwner")
  public @Nullable Boolean getIsProfileOwner() {
    return isProfileOwner;
  }

  public void setIsProfileOwner(@Nullable Boolean isProfileOwner) {
    this.isProfileOwner = isProfileOwner;
  }

  public ProfileResponse metFlagThreshold(@Nullable Boolean metFlagThreshold) {
    this.metFlagThreshold = metFlagThreshold;
    return this;
  }

  /**
   * Get metFlagThreshold
   * @return metFlagThreshold
   */
  
  @Schema(name = "metFlagThreshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metFlagThreshold")
  public @Nullable Boolean getMetFlagThreshold() {
    return metFlagThreshold;
  }

  public void setMetFlagThreshold(@Nullable Boolean metFlagThreshold) {
    this.metFlagThreshold = metFlagThreshold;
  }

  public ProfileResponse profileInfo(@Nullable ProfileInfoResponse profileInfo) {
    this.profileInfo = profileInfo;
    return this;
  }

  /**
   * Get profileInfo
   * @return profileInfo
   */
  @Valid 
  @Schema(name = "profileInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profileInfo")
  public @Nullable ProfileInfoResponse getProfileInfo() {
    return profileInfo;
  }

  public void setProfileInfo(@Nullable ProfileInfoResponse profileInfo) {
    this.profileInfo = profileInfo;
  }

  public ProfileResponse trusted(@Nullable Boolean trusted) {
    this.trusted = trusted;
    return this;
  }

  /**
   * Get trusted
   * @return trusted
   */
  
  @Schema(name = "trusted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trusted")
  public @Nullable Boolean getTrusted() {
    return trusted;
  }

  public void setTrusted(@Nullable Boolean trusted) {
    this.trusted = trusted;
  }

  public ProfileResponse following(@Nullable Boolean following) {
    this.following = following;
    return this;
  }

  /**
   * Get following
   * @return following
   */
  
  @Schema(name = "following", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("following")
  public @Nullable Boolean getFollowing() {
    return following;
  }

  public void setFollowing(@Nullable Boolean following) {
    this.following = following;
  }

  public ProfileResponse friendRequested(@Nullable Boolean friendRequested) {
    this.friendRequested = friendRequested;
    return this;
  }

  /**
   * Get friendRequested
   * @return friendRequested
   */
  
  @Schema(name = "friendRequested", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("friendRequested")
  public @Nullable Boolean getFriendRequested() {
    return friendRequested;
  }

  public void setFriendRequested(@Nullable Boolean friendRequested) {
    this.friendRequested = friendRequested;
  }

  public ProfileResponse friendRequestPending(@Nullable Boolean friendRequestPending) {
    this.friendRequestPending = friendRequestPending;
    return this;
  }

  /**
   * Get friendRequestPending
   * @return friendRequestPending
   */
  
  @Schema(name = "friendRequestPending", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("friendRequestPending")
  public @Nullable Boolean getFriendRequestPending() {
    return friendRequestPending;
  }

  public void setFriendRequestPending(@Nullable Boolean friendRequestPending) {
    this.friendRequestPending = friendRequestPending;
  }

  public ProfileResponse blocked(@Nullable Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

  /**
   * Get blocked
   * @return blocked
   */
  
  @Schema(name = "blocked", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blocked")
  public @Nullable Boolean getBlocked() {
    return blocked;
  }

  public void setBlocked(@Nullable Boolean blocked) {
    this.blocked = blocked;
  }

  public ProfileResponse flagged(@Nullable Boolean flagged) {
    this.flagged = flagged;
    return this;
  }

  /**
   * Get flagged
   * @return flagged
   */
  
  @Schema(name = "flagged", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flagged")
  public @Nullable Boolean getFlagged() {
    return flagged;
  }

  public void setFlagged(@Nullable Boolean flagged) {
    this.flagged = flagged;
  }

  public ProfileResponse profileOwner(@Nullable Boolean profileOwner) {
    this.profileOwner = profileOwner;
    return this;
  }

  /**
   * Get profileOwner
   * @return profileOwner
   */
  
  @Schema(name = "profileOwner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profileOwner")
  public @Nullable Boolean getProfileOwner() {
    return profileOwner;
  }

  public void setProfileOwner(@Nullable Boolean profileOwner) {
    this.profileOwner = profileOwner;
  }

  public ProfileResponse friend(@Nullable Boolean friend) {
    this.friend = friend;
    return this;
  }

  /**
   * Get friend
   * @return friend
   */
  
  @Schema(name = "friend", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("friend")
  public @Nullable Boolean getFriend() {
    return friend;
  }

  public void setFriend(@Nullable Boolean friend) {
    this.friend = friend;
  }

  public ProfileResponse returning(@Nullable String returning) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

