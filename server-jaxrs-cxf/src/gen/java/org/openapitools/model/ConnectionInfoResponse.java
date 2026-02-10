package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConnectionGroupResponse;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConnectionInfoResponse  {
  
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

  @Valid

  private List<@Valid ConnectionGroupResponse> groups = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Integer followerCount;

  @ApiModelProperty(value = "")

  private Integer followingCount;

  @ApiModelProperty(value = "")

  private Integer friendCount;

  @ApiModelProperty(value = "")

  private Integer privateGroupCount;

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

  public ConnectionInfoResponse valid(Boolean valid) {
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

  public ConnectionInfoResponse message(String message) {
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

  public ConnectionInfoResponse version(Double version) {
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

  public ConnectionInfoResponse serializeNulls(Boolean serializeNulls) {
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

  public ConnectionInfoResponse startTimeLog(Long startTimeLog) {
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

  public ConnectionInfoResponse errorCode(String errorCode) {
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

  public ConnectionInfoResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ConnectionInfoResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get groups
   * @return groups
  **/
  @JsonProperty("groups")
  public List<@Valid ConnectionGroupResponse> getGroups() {
    return groups;
  }

  public void setGroups(List<@Valid ConnectionGroupResponse> groups) {
    this.groups = groups;
  }

  public ConnectionInfoResponse groups(List<@Valid ConnectionGroupResponse> groups) {
    this.groups = groups;
    return this;
  }

  public ConnectionInfoResponse addGroupsItem(ConnectionGroupResponse groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

 /**
   * Get followerCount
   * @return followerCount
  **/
  @JsonProperty("followerCount")
  public Integer getFollowerCount() {
    return followerCount;
  }

  public void setFollowerCount(Integer followerCount) {
    this.followerCount = followerCount;
  }

  public ConnectionInfoResponse followerCount(Integer followerCount) {
    this.followerCount = followerCount;
    return this;
  }

 /**
   * Get followingCount
   * @return followingCount
  **/
  @JsonProperty("followingCount")
  public Integer getFollowingCount() {
    return followingCount;
  }

  public void setFollowingCount(Integer followingCount) {
    this.followingCount = followingCount;
  }

  public ConnectionInfoResponse followingCount(Integer followingCount) {
    this.followingCount = followingCount;
    return this;
  }

 /**
   * Get friendCount
   * @return friendCount
  **/
  @JsonProperty("friendCount")
  public Integer getFriendCount() {
    return friendCount;
  }

  public void setFriendCount(Integer friendCount) {
    this.friendCount = friendCount;
  }

  public ConnectionInfoResponse friendCount(Integer friendCount) {
    this.friendCount = friendCount;
    return this;
  }

 /**
   * Get privateGroupCount
   * @return privateGroupCount
  **/
  @JsonProperty("privateGroupCount")
  public Integer getPrivateGroupCount() {
    return privateGroupCount;
  }

  public void setPrivateGroupCount(Integer privateGroupCount) {
    this.privateGroupCount = privateGroupCount;
  }

  public ConnectionInfoResponse privateGroupCount(Integer privateGroupCount) {
    this.privateGroupCount = privateGroupCount;
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

  public ConnectionInfoResponse returning(String returning) {
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
    ConnectionInfoResponse connectionInfoResponse = (ConnectionInfoResponse) o;
    return Objects.equals(this.valid, connectionInfoResponse.valid) &&
        Objects.equals(this.message, connectionInfoResponse.message) &&
        Objects.equals(this.version, connectionInfoResponse.version) &&
        Objects.equals(this.serializeNulls, connectionInfoResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, connectionInfoResponse.startTimeLog) &&
        Objects.equals(this.errorCode, connectionInfoResponse.errorCode) &&
        Objects.equals(this.request, connectionInfoResponse.request) &&
        Objects.equals(this.groups, connectionInfoResponse.groups) &&
        Objects.equals(this.followerCount, connectionInfoResponse.followerCount) &&
        Objects.equals(this.followingCount, connectionInfoResponse.followingCount) &&
        Objects.equals(this.friendCount, connectionInfoResponse.friendCount) &&
        Objects.equals(this.privateGroupCount, connectionInfoResponse.privateGroupCount) &&
        Objects.equals(this.returning, connectionInfoResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, groups, followerCount, followingCount, friendCount, privateGroupCount, returning);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

