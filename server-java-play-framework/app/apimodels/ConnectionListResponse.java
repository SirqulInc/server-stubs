package apimodels;

import apimodels.ConnectionResponse;
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
 * ConnectionListResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConnectionListResponse   {
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

  @JsonProperty("connections")
  @Valid

  private List<@Valid ConnectionResponse> connections = null;

  @JsonProperty("friendCount")
  
  private Integer friendCount;

  @JsonProperty("followingCount")
  
  private Integer followingCount;

  @JsonProperty("itemCount")
  
  private Integer itemCount;

  @JsonProperty("hasMoreResults")
  
  private Boolean hasMoreResults;

  @JsonProperty("returning")
  
  private String returning;

  public ConnectionListResponse valid(Boolean valid) {
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

  public ConnectionListResponse message(String message) {
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

  public ConnectionListResponse version(Double version) {
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

  public ConnectionListResponse serializeNulls(Boolean serializeNulls) {
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

  public ConnectionListResponse startTimeLog(Long startTimeLog) {
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

  public ConnectionListResponse errorCode(String errorCode) {
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

  public ConnectionListResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ConnectionListResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public ConnectionListResponse connections(List<@Valid ConnectionResponse> connections) {
    this.connections = connections;
    return this;
  }

  public ConnectionListResponse addConnectionsItem(ConnectionResponse connectionsItem) {
    if (this.connections == null) {
      this.connections = new ArrayList<>();
    }
    this.connections.add(connectionsItem);
    return this;
  }

   /**
   * Get connections
   * @return connections
  **/
  public List<@Valid ConnectionResponse> getConnections() {
    return connections;
  }

  public void setConnections(List<@Valid ConnectionResponse> connections) {
    this.connections = connections;
  }

  public ConnectionListResponse friendCount(Integer friendCount) {
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

  public ConnectionListResponse followingCount(Integer followingCount) {
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

  public ConnectionListResponse itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

   /**
   * Get itemCount
   * @return itemCount
  **/
  public Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }

  public ConnectionListResponse hasMoreResults(Boolean hasMoreResults) {
    this.hasMoreResults = hasMoreResults;
    return this;
  }

   /**
   * Get hasMoreResults
   * @return hasMoreResults
  **/
  public Boolean getHasMoreResults() {
    return hasMoreResults;
  }

  public void setHasMoreResults(Boolean hasMoreResults) {
    this.hasMoreResults = hasMoreResults;
  }

  public ConnectionListResponse returning(String returning) {
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
    ConnectionListResponse connectionListResponse = (ConnectionListResponse) o;
    return Objects.equals(valid, connectionListResponse.valid) &&
        Objects.equals(message, connectionListResponse.message) &&
        Objects.equals(version, connectionListResponse.version) &&
        Objects.equals(serializeNulls, connectionListResponse.serializeNulls) &&
        Objects.equals(startTimeLog, connectionListResponse.startTimeLog) &&
        Objects.equals(errorCode, connectionListResponse.errorCode) &&
        Objects.equals(request, connectionListResponse.request) &&
        Objects.equals(connections, connectionListResponse.connections) &&
        Objects.equals(friendCount, connectionListResponse.friendCount) &&
        Objects.equals(followingCount, connectionListResponse.followingCount) &&
        Objects.equals(itemCount, connectionListResponse.itemCount) &&
        Objects.equals(hasMoreResults, connectionListResponse.hasMoreResults) &&
        Objects.equals(returning, connectionListResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, connections, friendCount, followingCount, itemCount, hasMoreResults, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

