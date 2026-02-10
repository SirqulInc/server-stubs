package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConnectionResponse;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConnectionListResponse  {
  
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

  private List<@Valid ConnectionResponse> connections = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Integer friendCount;

  @ApiModelProperty(value = "")

  private Integer followingCount;

  @ApiModelProperty(value = "")

  private Integer itemCount;

  @ApiModelProperty(value = "")

  private Boolean hasMoreResults;

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

  public ConnectionListResponse valid(Boolean valid) {
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

  public ConnectionListResponse message(String message) {
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

  public ConnectionListResponse version(Double version) {
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

  public ConnectionListResponse serializeNulls(Boolean serializeNulls) {
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

  public ConnectionListResponse startTimeLog(Long startTimeLog) {
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

  public ConnectionListResponse errorCode(String errorCode) {
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

  public ConnectionListResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ConnectionListResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get connections
   * @return connections
  **/
  @JsonProperty("connections")
  public List<@Valid ConnectionResponse> getConnections() {
    return connections;
  }

  public void setConnections(List<@Valid ConnectionResponse> connections) {
    this.connections = connections;
  }

  public ConnectionListResponse connections(List<@Valid ConnectionResponse> connections) {
    this.connections = connections;
    return this;
  }

  public ConnectionListResponse addConnectionsItem(ConnectionResponse connectionsItem) {
    this.connections.add(connectionsItem);
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

  public ConnectionListResponse friendCount(Integer friendCount) {
    this.friendCount = friendCount;
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

  public ConnectionListResponse followingCount(Integer followingCount) {
    this.followingCount = followingCount;
    return this;
  }

 /**
   * Get itemCount
   * @return itemCount
  **/
  @JsonProperty("itemCount")
  public Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }

  public ConnectionListResponse itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

 /**
   * Get hasMoreResults
   * @return hasMoreResults
  **/
  @JsonProperty("hasMoreResults")
  public Boolean getHasMoreResults() {
    return hasMoreResults;
  }

  public void setHasMoreResults(Boolean hasMoreResults) {
    this.hasMoreResults = hasMoreResults;
  }

  public ConnectionListResponse hasMoreResults(Boolean hasMoreResults) {
    this.hasMoreResults = hasMoreResults;
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

  public ConnectionListResponse returning(String returning) {
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
    ConnectionListResponse connectionListResponse = (ConnectionListResponse) o;
    return Objects.equals(this.valid, connectionListResponse.valid) &&
        Objects.equals(this.message, connectionListResponse.message) &&
        Objects.equals(this.version, connectionListResponse.version) &&
        Objects.equals(this.serializeNulls, connectionListResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, connectionListResponse.startTimeLog) &&
        Objects.equals(this.errorCode, connectionListResponse.errorCode) &&
        Objects.equals(this.request, connectionListResponse.request) &&
        Objects.equals(this.connections, connectionListResponse.connections) &&
        Objects.equals(this.friendCount, connectionListResponse.friendCount) &&
        Objects.equals(this.followingCount, connectionListResponse.followingCount) &&
        Objects.equals(this.itemCount, connectionListResponse.itemCount) &&
        Objects.equals(this.hasMoreResults, connectionListResponse.hasMoreResults) &&
        Objects.equals(this.returning, connectionListResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, connections, friendCount, followingCount, itemCount, hasMoreResults, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionListResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    friendCount: ").append(toIndentedString(friendCount)).append("\n");
    sb.append("    followingCount: ").append(toIndentedString(followingCount)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    hasMoreResults: ").append(toIndentedString(hasMoreResults)).append("\n");
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

