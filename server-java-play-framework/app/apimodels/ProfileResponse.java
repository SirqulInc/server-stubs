package apimodels;

import apimodels.AppInfoResponse;
import apimodels.ConnectionInfoResponse;
import apimodels.NameStringValueResponse;
import apimodels.ProfileInfoResponse;
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
 * ProfileResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ProfileResponse   {
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

  @JsonProperty("loginAccountId")
  
  private Long loginAccountId;

  @JsonProperty("validated")
  
  private Boolean validated;

  @JsonProperty("appInfo")
  @Valid

  private AppInfoResponse appInfo;

  @JsonProperty("canViewAppInfo")
  
  private Boolean canViewAppInfo;

  @JsonProperty("canViewFriendInfo")
  
  private Boolean canViewFriendInfo;

  @JsonProperty("canViewProfileInfo")
  
  private Boolean canViewProfileInfo;

  @JsonProperty("flagCount")
  
  private Long flagCount;

  @JsonProperty("friendInfo")
  @Valid

  private ConnectionInfoResponse friendInfo;

  @JsonProperty("isBlocked")
  
  private Boolean isBlocked;

  @JsonProperty("isProfileOwner")
  
  private Boolean isProfileOwner;

  @JsonProperty("metFlagThreshold")
  
  private Boolean metFlagThreshold;

  @JsonProperty("profileInfo")
  @Valid

  private ProfileInfoResponse profileInfo;

  @JsonProperty("trusted")
  
  private Boolean trusted;

  @JsonProperty("following")
  
  private Boolean following;

  @JsonProperty("friendRequested")
  
  private Boolean friendRequested;

  @JsonProperty("friendRequestPending")
  
  private Boolean friendRequestPending;

  @JsonProperty("blocked")
  
  private Boolean blocked;

  @JsonProperty("flagged")
  
  private Boolean flagged;

  @JsonProperty("profileOwner")
  
  private Boolean profileOwner;

  @JsonProperty("friend")
  
  private Boolean friend;

  @JsonProperty("returning")
  
  private String returning;

  public ProfileResponse valid(Boolean valid) {
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

  public ProfileResponse message(String message) {
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

  public ProfileResponse version(Double version) {
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

  public ProfileResponse serializeNulls(Boolean serializeNulls) {
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

  public ProfileResponse startTimeLog(Long startTimeLog) {
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

  public ProfileResponse errorCode(String errorCode) {
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
  **/
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public ProfileResponse loginAccountId(Long loginAccountId) {
    this.loginAccountId = loginAccountId;
    return this;
  }

   /**
   * Get loginAccountId
   * @return loginAccountId
  **/
  public Long getLoginAccountId() {
    return loginAccountId;
  }

  public void setLoginAccountId(Long loginAccountId) {
    this.loginAccountId = loginAccountId;
  }

  public ProfileResponse validated(Boolean validated) {
    this.validated = validated;
    return this;
  }

   /**
   * Get validated
   * @return validated
  **/
  public Boolean getValidated() {
    return validated;
  }

  public void setValidated(Boolean validated) {
    this.validated = validated;
  }

  public ProfileResponse appInfo(AppInfoResponse appInfo) {
    this.appInfo = appInfo;
    return this;
  }

   /**
   * Get appInfo
   * @return appInfo
  **/
  public AppInfoResponse getAppInfo() {
    return appInfo;
  }

  public void setAppInfo(AppInfoResponse appInfo) {
    this.appInfo = appInfo;
  }

  public ProfileResponse canViewAppInfo(Boolean canViewAppInfo) {
    this.canViewAppInfo = canViewAppInfo;
    return this;
  }

   /**
   * Get canViewAppInfo
   * @return canViewAppInfo
  **/
  public Boolean getCanViewAppInfo() {
    return canViewAppInfo;
  }

  public void setCanViewAppInfo(Boolean canViewAppInfo) {
    this.canViewAppInfo = canViewAppInfo;
  }

  public ProfileResponse canViewFriendInfo(Boolean canViewFriendInfo) {
    this.canViewFriendInfo = canViewFriendInfo;
    return this;
  }

   /**
   * Get canViewFriendInfo
   * @return canViewFriendInfo
  **/
  public Boolean getCanViewFriendInfo() {
    return canViewFriendInfo;
  }

  public void setCanViewFriendInfo(Boolean canViewFriendInfo) {
    this.canViewFriendInfo = canViewFriendInfo;
  }

  public ProfileResponse canViewProfileInfo(Boolean canViewProfileInfo) {
    this.canViewProfileInfo = canViewProfileInfo;
    return this;
  }

   /**
   * Get canViewProfileInfo
   * @return canViewProfileInfo
  **/
  public Boolean getCanViewProfileInfo() {
    return canViewProfileInfo;
  }

  public void setCanViewProfileInfo(Boolean canViewProfileInfo) {
    this.canViewProfileInfo = canViewProfileInfo;
  }

  public ProfileResponse flagCount(Long flagCount) {
    this.flagCount = flagCount;
    return this;
  }

   /**
   * Get flagCount
   * @return flagCount
  **/
  public Long getFlagCount() {
    return flagCount;
  }

  public void setFlagCount(Long flagCount) {
    this.flagCount = flagCount;
  }

  public ProfileResponse friendInfo(ConnectionInfoResponse friendInfo) {
    this.friendInfo = friendInfo;
    return this;
  }

   /**
   * Get friendInfo
   * @return friendInfo
  **/
  public ConnectionInfoResponse getFriendInfo() {
    return friendInfo;
  }

  public void setFriendInfo(ConnectionInfoResponse friendInfo) {
    this.friendInfo = friendInfo;
  }

  public ProfileResponse isBlocked(Boolean isBlocked) {
    this.isBlocked = isBlocked;
    return this;
  }

   /**
   * Get isBlocked
   * @return isBlocked
  **/
  public Boolean getIsBlocked() {
    return isBlocked;
  }

  public void setIsBlocked(Boolean isBlocked) {
    this.isBlocked = isBlocked;
  }

  public ProfileResponse isProfileOwner(Boolean isProfileOwner) {
    this.isProfileOwner = isProfileOwner;
    return this;
  }

   /**
   * Get isProfileOwner
   * @return isProfileOwner
  **/
  public Boolean getIsProfileOwner() {
    return isProfileOwner;
  }

  public void setIsProfileOwner(Boolean isProfileOwner) {
    this.isProfileOwner = isProfileOwner;
  }

  public ProfileResponse metFlagThreshold(Boolean metFlagThreshold) {
    this.metFlagThreshold = metFlagThreshold;
    return this;
  }

   /**
   * Get metFlagThreshold
   * @return metFlagThreshold
  **/
  public Boolean getMetFlagThreshold() {
    return metFlagThreshold;
  }

  public void setMetFlagThreshold(Boolean metFlagThreshold) {
    this.metFlagThreshold = metFlagThreshold;
  }

  public ProfileResponse profileInfo(ProfileInfoResponse profileInfo) {
    this.profileInfo = profileInfo;
    return this;
  }

   /**
   * Get profileInfo
   * @return profileInfo
  **/
  public ProfileInfoResponse getProfileInfo() {
    return profileInfo;
  }

  public void setProfileInfo(ProfileInfoResponse profileInfo) {
    this.profileInfo = profileInfo;
  }

  public ProfileResponse trusted(Boolean trusted) {
    this.trusted = trusted;
    return this;
  }

   /**
   * Get trusted
   * @return trusted
  **/
  public Boolean getTrusted() {
    return trusted;
  }

  public void setTrusted(Boolean trusted) {
    this.trusted = trusted;
  }

  public ProfileResponse following(Boolean following) {
    this.following = following;
    return this;
  }

   /**
   * Get following
   * @return following
  **/
  public Boolean getFollowing() {
    return following;
  }

  public void setFollowing(Boolean following) {
    this.following = following;
  }

  public ProfileResponse friendRequested(Boolean friendRequested) {
    this.friendRequested = friendRequested;
    return this;
  }

   /**
   * Get friendRequested
   * @return friendRequested
  **/
  public Boolean getFriendRequested() {
    return friendRequested;
  }

  public void setFriendRequested(Boolean friendRequested) {
    this.friendRequested = friendRequested;
  }

  public ProfileResponse friendRequestPending(Boolean friendRequestPending) {
    this.friendRequestPending = friendRequestPending;
    return this;
  }

   /**
   * Get friendRequestPending
   * @return friendRequestPending
  **/
  public Boolean getFriendRequestPending() {
    return friendRequestPending;
  }

  public void setFriendRequestPending(Boolean friendRequestPending) {
    this.friendRequestPending = friendRequestPending;
  }

  public ProfileResponse blocked(Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

   /**
   * Get blocked
   * @return blocked
  **/
  public Boolean getBlocked() {
    return blocked;
  }

  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }

  public ProfileResponse flagged(Boolean flagged) {
    this.flagged = flagged;
    return this;
  }

   /**
   * Get flagged
   * @return flagged
  **/
  public Boolean getFlagged() {
    return flagged;
  }

  public void setFlagged(Boolean flagged) {
    this.flagged = flagged;
  }

  public ProfileResponse profileOwner(Boolean profileOwner) {
    this.profileOwner = profileOwner;
    return this;
  }

   /**
   * Get profileOwner
   * @return profileOwner
  **/
  public Boolean getProfileOwner() {
    return profileOwner;
  }

  public void setProfileOwner(Boolean profileOwner) {
    this.profileOwner = profileOwner;
  }

  public ProfileResponse friend(Boolean friend) {
    this.friend = friend;
    return this;
  }

   /**
   * Get friend
   * @return friend
  **/
  public Boolean getFriend() {
    return friend;
  }

  public void setFriend(Boolean friend) {
    this.friend = friend;
  }

  public ProfileResponse returning(String returning) {
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
    ProfileResponse profileResponse = (ProfileResponse) o;
    return Objects.equals(valid, profileResponse.valid) &&
        Objects.equals(message, profileResponse.message) &&
        Objects.equals(version, profileResponse.version) &&
        Objects.equals(serializeNulls, profileResponse.serializeNulls) &&
        Objects.equals(startTimeLog, profileResponse.startTimeLog) &&
        Objects.equals(errorCode, profileResponse.errorCode) &&
        Objects.equals(request, profileResponse.request) &&
        Objects.equals(loginAccountId, profileResponse.loginAccountId) &&
        Objects.equals(validated, profileResponse.validated) &&
        Objects.equals(appInfo, profileResponse.appInfo) &&
        Objects.equals(canViewAppInfo, profileResponse.canViewAppInfo) &&
        Objects.equals(canViewFriendInfo, profileResponse.canViewFriendInfo) &&
        Objects.equals(canViewProfileInfo, profileResponse.canViewProfileInfo) &&
        Objects.equals(flagCount, profileResponse.flagCount) &&
        Objects.equals(friendInfo, profileResponse.friendInfo) &&
        Objects.equals(isBlocked, profileResponse.isBlocked) &&
        Objects.equals(isProfileOwner, profileResponse.isProfileOwner) &&
        Objects.equals(metFlagThreshold, profileResponse.metFlagThreshold) &&
        Objects.equals(profileInfo, profileResponse.profileInfo) &&
        Objects.equals(trusted, profileResponse.trusted) &&
        Objects.equals(following, profileResponse.following) &&
        Objects.equals(friendRequested, profileResponse.friendRequested) &&
        Objects.equals(friendRequestPending, profileResponse.friendRequestPending) &&
        Objects.equals(blocked, profileResponse.blocked) &&
        Objects.equals(flagged, profileResponse.flagged) &&
        Objects.equals(profileOwner, profileResponse.profileOwner) &&
        Objects.equals(friend, profileResponse.friend) &&
        Objects.equals(returning, profileResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, loginAccountId, validated, appInfo, canViewAppInfo, canViewFriendInfo, canViewProfileInfo, flagCount, friendInfo, isBlocked, isProfileOwner, metFlagThreshold, profileInfo, trusted, following, friendRequested, friendRequestPending, blocked, flagged, profileOwner, friend, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

