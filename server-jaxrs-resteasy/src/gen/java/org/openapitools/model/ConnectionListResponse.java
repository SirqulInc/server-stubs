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
import org.openapitools.model.ConnectionResponse;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ConnectionListResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private List<@Valid ConnectionResponse> connections = new ArrayList<>();
  private Integer friendCount;
  private Integer followingCount;
  private Integer itemCount;
  private Boolean hasMoreResults;
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
  @JsonProperty("connections")
  @Valid
  public List<@Valid ConnectionResponse> getConnections() {
    return connections;
  }
  public void setConnections(List<@Valid ConnectionResponse> connections) {
    this.connections = connections;
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
  @JsonProperty("itemCount")
  public Integer getItemCount() {
    return itemCount;
  }
  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hasMoreResults")
  public Boolean getHasMoreResults() {
    return hasMoreResults;
  }
  public void setHasMoreResults(Boolean hasMoreResults) {
    this.hasMoreResults = hasMoreResults;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

