package apimodels;

import apimodels.ConnectionGroupResponse;
import apimodels.NameStringValueResponse;
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
 * ConnectionInfoResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConnectionInfoResponse   {
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

  @JsonProperty("groups")
  @Valid

  private List<@Valid ConnectionGroupResponse> groups = null;

  @JsonProperty("followerCount")
  
  private Integer followerCount;

  @JsonProperty("followingCount")
  
  private Integer followingCount;

  @JsonProperty("friendCount")
  
  private Integer friendCount;

  @JsonProperty("privateGroupCount")
  
  private Integer privateGroupCount;

  @JsonProperty("returning")
  
  private String returning;

  public ConnectionInfoResponse valid(Boolean valid) {
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

  public ConnectionInfoResponse message(String message) {
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

  public ConnectionInfoResponse version(Double version) {
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

  public ConnectionInfoResponse serializeNulls(Boolean serializeNulls) {
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

  public ConnectionInfoResponse startTimeLog(Long startTimeLog) {
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

  public ConnectionInfoResponse errorCode(String errorCode) {
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

  public ConnectionInfoResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ConnectionInfoResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public ConnectionInfoResponse groups(List<@Valid ConnectionGroupResponse> groups) {
    this.groups = groups;
    return this;
  }

  public ConnectionInfoResponse addGroupsItem(ConnectionGroupResponse groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  public List<@Valid ConnectionGroupResponse> getGroups() {
    return groups;
  }

  public void setGroups(List<@Valid ConnectionGroupResponse> groups) {
    this.groups = groups;
  }

  public ConnectionInfoResponse followerCount(Integer followerCount) {
    this.followerCount = followerCount;
    return this;
  }

   /**
   * Get followerCount
   * @return followerCount
  **/
  public Integer getFollowerCount() {
    return followerCount;
  }

  public void setFollowerCount(Integer followerCount) {
    this.followerCount = followerCount;
  }

  public ConnectionInfoResponse followingCount(Integer followingCount) {
    this.followingCount = followingCount;
    return this;
  }

   /**
   * Get followingCount
   * @return followingCount
  **/
  public Integer getFollowingCount() {
    return followingCount;
  }

  public void setFollowingCount(Integer followingCount) {
    this.followingCount = followingCount;
  }

  public ConnectionInfoResponse friendCount(Integer friendCount) {
    this.friendCount = friendCount;
    return this;
  }

   /**
   * Get friendCount
   * @return friendCount
  **/
  public Integer getFriendCount() {
    return friendCount;
  }

  public void setFriendCount(Integer friendCount) {
    this.friendCount = friendCount;
  }

  public ConnectionInfoResponse privateGroupCount(Integer privateGroupCount) {
    this.privateGroupCount = privateGroupCount;
    return this;
  }

   /**
   * Get privateGroupCount
   * @return privateGroupCount
  **/
  public Integer getPrivateGroupCount() {
    return privateGroupCount;
  }

  public void setPrivateGroupCount(Integer privateGroupCount) {
    this.privateGroupCount = privateGroupCount;
  }

  public ConnectionInfoResponse returning(String returning) {
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
    ConnectionInfoResponse connectionInfoResponse = (ConnectionInfoResponse) o;
    return Objects.equals(valid, connectionInfoResponse.valid) &&
        Objects.equals(message, connectionInfoResponse.message) &&
        Objects.equals(version, connectionInfoResponse.version) &&
        Objects.equals(serializeNulls, connectionInfoResponse.serializeNulls) &&
        Objects.equals(startTimeLog, connectionInfoResponse.startTimeLog) &&
        Objects.equals(errorCode, connectionInfoResponse.errorCode) &&
        Objects.equals(request, connectionInfoResponse.request) &&
        Objects.equals(groups, connectionInfoResponse.groups) &&
        Objects.equals(followerCount, connectionInfoResponse.followerCount) &&
        Objects.equals(followingCount, connectionInfoResponse.followingCount) &&
        Objects.equals(friendCount, connectionInfoResponse.friendCount) &&
        Objects.equals(privateGroupCount, connectionInfoResponse.privateGroupCount) &&
        Objects.equals(returning, connectionInfoResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, groups, followerCount, followingCount, friendCount, privateGroupCount, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionInfoResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    followerCount: ").append(toIndentedString(followerCount)).append("\n");
    sb.append("    followingCount: ").append(toIndentedString(followingCount)).append("\n");
    sb.append("    friendCount: ").append(toIndentedString(friendCount)).append("\n");
    sb.append("    privateGroupCount: ").append(toIndentedString(privateGroupCount)).append("\n");
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

