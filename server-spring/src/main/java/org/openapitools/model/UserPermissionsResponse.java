package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConnectionGroupResponse;
import org.openapitools.model.ConnectionResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.PermissionResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserPermissionsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class UserPermissionsResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  private @Nullable PermissionResponse permissions;

  private @Nullable ConnectionResponse connection;

  private @Nullable ConnectionGroupResponse connectionGroup;

  private @Nullable Boolean exclude;

  private @Nullable Boolean blocked;

  private @Nullable Boolean friendGroup;

  private @Nullable Long permissionableId;

  private @Nullable String permissionableType;

  private @Nullable String returning;

  public UserPermissionsResponse valid(@Nullable Boolean valid) {
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

  public UserPermissionsResponse message(@Nullable String message) {
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

  public UserPermissionsResponse version(@Nullable Double version) {
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

  public UserPermissionsResponse serializeNulls(@Nullable Boolean serializeNulls) {
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

  public UserPermissionsResponse startTimeLog(@Nullable Long startTimeLog) {
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

  public UserPermissionsResponse errorCode(@Nullable String errorCode) {
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

  public UserPermissionsResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public UserPermissionsResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public UserPermissionsResponse permissions(@Nullable PermissionResponse permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Get permissions
   * @return permissions
   */
  @Valid 
  @Schema(name = "permissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permissions")
  public @Nullable PermissionResponse getPermissions() {
    return permissions;
  }

  public void setPermissions(@Nullable PermissionResponse permissions) {
    this.permissions = permissions;
  }

  public UserPermissionsResponse connection(@Nullable ConnectionResponse connection) {
    this.connection = connection;
    return this;
  }

  /**
   * Get connection
   * @return connection
   */
  @Valid 
  @Schema(name = "connection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connection")
  public @Nullable ConnectionResponse getConnection() {
    return connection;
  }

  public void setConnection(@Nullable ConnectionResponse connection) {
    this.connection = connection;
  }

  public UserPermissionsResponse connectionGroup(@Nullable ConnectionGroupResponse connectionGroup) {
    this.connectionGroup = connectionGroup;
    return this;
  }

  /**
   * Get connectionGroup
   * @return connectionGroup
   */
  @Valid 
  @Schema(name = "connectionGroup", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectionGroup")
  public @Nullable ConnectionGroupResponse getConnectionGroup() {
    return connectionGroup;
  }

  public void setConnectionGroup(@Nullable ConnectionGroupResponse connectionGroup) {
    this.connectionGroup = connectionGroup;
  }

  public UserPermissionsResponse exclude(@Nullable Boolean exclude) {
    this.exclude = exclude;
    return this;
  }

  /**
   * Get exclude
   * @return exclude
   */
  
  @Schema(name = "exclude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exclude")
  public @Nullable Boolean getExclude() {
    return exclude;
  }

  public void setExclude(@Nullable Boolean exclude) {
    this.exclude = exclude;
  }

  public UserPermissionsResponse blocked(@Nullable Boolean blocked) {
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

  public UserPermissionsResponse friendGroup(@Nullable Boolean friendGroup) {
    this.friendGroup = friendGroup;
    return this;
  }

  /**
   * Get friendGroup
   * @return friendGroup
   */
  
  @Schema(name = "friendGroup", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("friendGroup")
  public @Nullable Boolean getFriendGroup() {
    return friendGroup;
  }

  public void setFriendGroup(@Nullable Boolean friendGroup) {
    this.friendGroup = friendGroup;
  }

  public UserPermissionsResponse permissionableId(@Nullable Long permissionableId) {
    this.permissionableId = permissionableId;
    return this;
  }

  /**
   * Get permissionableId
   * @return permissionableId
   */
  
  @Schema(name = "permissionableId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permissionableId")
  public @Nullable Long getPermissionableId() {
    return permissionableId;
  }

  public void setPermissionableId(@Nullable Long permissionableId) {
    this.permissionableId = permissionableId;
  }

  public UserPermissionsResponse permissionableType(@Nullable String permissionableType) {
    this.permissionableType = permissionableType;
    return this;
  }

  /**
   * Get permissionableType
   * @return permissionableType
   */
  
  @Schema(name = "permissionableType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permissionableType")
  public @Nullable String getPermissionableType() {
    return permissionableType;
  }

  public void setPermissionableType(@Nullable String permissionableType) {
    this.permissionableType = permissionableType;
  }

  public UserPermissionsResponse returning(@Nullable String returning) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

