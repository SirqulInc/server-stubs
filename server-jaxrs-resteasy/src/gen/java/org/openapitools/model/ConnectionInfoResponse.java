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
import org.openapitools.model.ConnectionGroupResponse;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ConnectionInfoResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private List<@Valid ConnectionGroupResponse> groups = new ArrayList<>();
  private Integer followerCount;
  private Integer followingCount;
  private Integer friendCount;
  private Integer privateGroupCount;
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
  @JsonProperty("groups")
  @Valid
  public List<@Valid ConnectionGroupResponse> getGroups() {
    return groups;
  }
  public void setGroups(List<@Valid ConnectionGroupResponse> groups) {
    this.groups = groups;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("followerCount")
  public Integer getFollowerCount() {
    return followerCount;
  }
  public void setFollowerCount(Integer followerCount) {
    this.followerCount = followerCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("followingCount")
  public Integer getFollowingCount() {
    return followingCount;
  }
  public void setFollowingCount(Integer followingCount) {
    this.followingCount = followingCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("friendCount")
  public Integer getFriendCount() {
    return friendCount;
  }
  public void setFriendCount(Integer friendCount) {
    this.friendCount = friendCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("privateGroupCount")
  public Integer getPrivateGroupCount() {
    return privateGroupCount;
  }
  public void setPrivateGroupCount(Integer privateGroupCount) {
    this.privateGroupCount = privateGroupCount;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

