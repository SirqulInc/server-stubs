package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConnectionGroupResponse;
import org.openapitools.model.ConnectionResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.PermissionResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UserPermissionsResponse  {
  
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

  private PermissionResponse permissions;

  @ApiModelProperty(value = "")

  @Valid

  private ConnectionResponse connection;

  @ApiModelProperty(value = "")

  @Valid

  private ConnectionGroupResponse connectionGroup;

  @ApiModelProperty(value = "")

  private Boolean exclude;

  @ApiModelProperty(value = "")

  private Boolean blocked;

  @ApiModelProperty(value = "")

  private Boolean friendGroup;

  @ApiModelProperty(value = "")

  private Long permissionableId;

  @ApiModelProperty(value = "")

  private String permissionableType;

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

  public UserPermissionsResponse valid(Boolean valid) {
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

  public UserPermissionsResponse message(String message) {
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

  public UserPermissionsResponse version(Double version) {
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

  public UserPermissionsResponse serializeNulls(Boolean serializeNulls) {
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

  public UserPermissionsResponse startTimeLog(Long startTimeLog) {
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

  public UserPermissionsResponse errorCode(String errorCode) {
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

  public UserPermissionsResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public UserPermissionsResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get permissions
   * @return permissions
  **/
  @JsonProperty("permissions")
  public PermissionResponse getPermissions() {
    return permissions;
  }

  public void setPermissions(PermissionResponse permissions) {
    this.permissions = permissions;
  }

  public UserPermissionsResponse permissions(PermissionResponse permissions) {
    this.permissions = permissions;
    return this;
  }

 /**
   * Get connection
   * @return connection
  **/
  @JsonProperty("connection")
  public ConnectionResponse getConnection() {
    return connection;
  }

  public void setConnection(ConnectionResponse connection) {
    this.connection = connection;
  }

  public UserPermissionsResponse connection(ConnectionResponse connection) {
    this.connection = connection;
    return this;
  }

 /**
   * Get connectionGroup
   * @return connectionGroup
  **/
  @JsonProperty("connectionGroup")
  public ConnectionGroupResponse getConnectionGroup() {
    return connectionGroup;
  }

  public void setConnectionGroup(ConnectionGroupResponse connectionGroup) {
    this.connectionGroup = connectionGroup;
  }

  public UserPermissionsResponse connectionGroup(ConnectionGroupResponse connectionGroup) {
    this.connectionGroup = connectionGroup;
    return this;
  }

 /**
   * Get exclude
   * @return exclude
  **/
  @JsonProperty("exclude")
  public Boolean getExclude() {
    return exclude;
  }

  public void setExclude(Boolean exclude) {
    this.exclude = exclude;
  }

  public UserPermissionsResponse exclude(Boolean exclude) {
    this.exclude = exclude;
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

  public UserPermissionsResponse blocked(Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

 /**
   * Get friendGroup
   * @return friendGroup
  **/
  @JsonProperty("friendGroup")
  public Boolean getFriendGroup() {
    return friendGroup;
  }

  public void setFriendGroup(Boolean friendGroup) {
    this.friendGroup = friendGroup;
  }

  public UserPermissionsResponse friendGroup(Boolean friendGroup) {
    this.friendGroup = friendGroup;
    return this;
  }

 /**
   * Get permissionableId
   * @return permissionableId
  **/
  @JsonProperty("permissionableId")
  public Long getPermissionableId() {
    return permissionableId;
  }

  public void setPermissionableId(Long permissionableId) {
    this.permissionableId = permissionableId;
  }

  public UserPermissionsResponse permissionableId(Long permissionableId) {
    this.permissionableId = permissionableId;
    return this;
  }

 /**
   * Get permissionableType
   * @return permissionableType
  **/
  @JsonProperty("permissionableType")
  public String getPermissionableType() {
    return permissionableType;
  }

  public void setPermissionableType(String permissionableType) {
    this.permissionableType = permissionableType;
  }

  public UserPermissionsResponse permissionableType(String permissionableType) {
    this.permissionableType = permissionableType;
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

  public UserPermissionsResponse returning(String returning) {
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
    UserPermissionsResponse userPermissionsResponse = (UserPermissionsResponse) o;
    return Objects.equals(this.valid, userPermissionsResponse.valid) &&
        Objects.equals(this.message, userPermissionsResponse.message) &&
        Objects.equals(this.version, userPermissionsResponse.version) &&
        Objects.equals(this.serializeNulls, userPermissionsResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, userPermissionsResponse.startTimeLog) &&
        Objects.equals(this.errorCode, userPermissionsResponse.errorCode) &&
        Objects.equals(this.request, userPermissionsResponse.request) &&
        Objects.equals(this.permissions, userPermissionsResponse.permissions) &&
        Objects.equals(this.connection, userPermissionsResponse.connection) &&
        Objects.equals(this.connectionGroup, userPermissionsResponse.connectionGroup) &&
        Objects.equals(this.exclude, userPermissionsResponse.exclude) &&
        Objects.equals(this.blocked, userPermissionsResponse.blocked) &&
        Objects.equals(this.friendGroup, userPermissionsResponse.friendGroup) &&
        Objects.equals(this.permissionableId, userPermissionsResponse.permissionableId) &&
        Objects.equals(this.permissionableType, userPermissionsResponse.permissionableType) &&
        Objects.equals(this.returning, userPermissionsResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, permissions, connection, connectionGroup, exclude, blocked, friendGroup, permissionableId, permissionableType, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPermissionsResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    connectionGroup: ").append(toIndentedString(connectionGroup)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    friendGroup: ").append(toIndentedString(friendGroup)).append("\n");
    sb.append("    permissionableId: ").append(toIndentedString(permissionableId)).append("\n");
    sb.append("    permissionableType: ").append(toIndentedString(permissionableType)).append("\n");
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

