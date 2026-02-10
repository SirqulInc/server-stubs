package apimodels;

import apimodels.ConnectionGroupResponse;
import apimodels.ConnectionResponse;
import apimodels.NameStringValueResponse;
import apimodels.PermissionResponse;
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
 * UserPermissionsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UserPermissionsResponse   {
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

  @JsonProperty("permissions")
  @Valid

  private PermissionResponse permissions;

  @JsonProperty("connection")
  @Valid

  private ConnectionResponse connection;

  @JsonProperty("connectionGroup")
  @Valid

  private ConnectionGroupResponse connectionGroup;

  @JsonProperty("exclude")
  
  private Boolean exclude;

  @JsonProperty("blocked")
  
  private Boolean blocked;

  @JsonProperty("friendGroup")
  
  private Boolean friendGroup;

  @JsonProperty("permissionableId")
  
  private Long permissionableId;

  @JsonProperty("permissionableType")
  
  private String permissionableType;

  @JsonProperty("returning")
  
  private String returning;

  public UserPermissionsResponse valid(Boolean valid) {
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

  public UserPermissionsResponse message(String message) {
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

  public UserPermissionsResponse version(Double version) {
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

  public UserPermissionsResponse serializeNulls(Boolean serializeNulls) {
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

  public UserPermissionsResponse startTimeLog(Long startTimeLog) {
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

  public UserPermissionsResponse errorCode(String errorCode) {
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
  **/
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public UserPermissionsResponse permissions(PermissionResponse permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  public PermissionResponse getPermissions() {
    return permissions;
  }

  public void setPermissions(PermissionResponse permissions) {
    this.permissions = permissions;
  }

  public UserPermissionsResponse connection(ConnectionResponse connection) {
    this.connection = connection;
    return this;
  }

   /**
   * Get connection
   * @return connection
  **/
  public ConnectionResponse getConnection() {
    return connection;
  }

  public void setConnection(ConnectionResponse connection) {
    this.connection = connection;
  }

  public UserPermissionsResponse connectionGroup(ConnectionGroupResponse connectionGroup) {
    this.connectionGroup = connectionGroup;
    return this;
  }

   /**
   * Get connectionGroup
   * @return connectionGroup
  **/
  public ConnectionGroupResponse getConnectionGroup() {
    return connectionGroup;
  }

  public void setConnectionGroup(ConnectionGroupResponse connectionGroup) {
    this.connectionGroup = connectionGroup;
  }

  public UserPermissionsResponse exclude(Boolean exclude) {
    this.exclude = exclude;
    return this;
  }

   /**
   * Get exclude
   * @return exclude
  **/
  public Boolean getExclude() {
    return exclude;
  }

  public void setExclude(Boolean exclude) {
    this.exclude = exclude;
  }

  public UserPermissionsResponse blocked(Boolean blocked) {
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

  public UserPermissionsResponse friendGroup(Boolean friendGroup) {
    this.friendGroup = friendGroup;
    return this;
  }

   /**
   * Get friendGroup
   * @return friendGroup
  **/
  public Boolean getFriendGroup() {
    return friendGroup;
  }

  public void setFriendGroup(Boolean friendGroup) {
    this.friendGroup = friendGroup;
  }

  public UserPermissionsResponse permissionableId(Long permissionableId) {
    this.permissionableId = permissionableId;
    return this;
  }

   /**
   * Get permissionableId
   * @return permissionableId
  **/
  public Long getPermissionableId() {
    return permissionableId;
  }

  public void setPermissionableId(Long permissionableId) {
    this.permissionableId = permissionableId;
  }

  public UserPermissionsResponse permissionableType(String permissionableType) {
    this.permissionableType = permissionableType;
    return this;
  }

   /**
   * Get permissionableType
   * @return permissionableType
  **/
  public String getPermissionableType() {
    return permissionableType;
  }

  public void setPermissionableType(String permissionableType) {
    this.permissionableType = permissionableType;
  }

  public UserPermissionsResponse returning(String returning) {
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
    UserPermissionsResponse userPermissionsResponse = (UserPermissionsResponse) o;
    return Objects.equals(valid, userPermissionsResponse.valid) &&
        Objects.equals(message, userPermissionsResponse.message) &&
        Objects.equals(version, userPermissionsResponse.version) &&
        Objects.equals(serializeNulls, userPermissionsResponse.serializeNulls) &&
        Objects.equals(startTimeLog, userPermissionsResponse.startTimeLog) &&
        Objects.equals(errorCode, userPermissionsResponse.errorCode) &&
        Objects.equals(request, userPermissionsResponse.request) &&
        Objects.equals(permissions, userPermissionsResponse.permissions) &&
        Objects.equals(connection, userPermissionsResponse.connection) &&
        Objects.equals(connectionGroup, userPermissionsResponse.connectionGroup) &&
        Objects.equals(exclude, userPermissionsResponse.exclude) &&
        Objects.equals(blocked, userPermissionsResponse.blocked) &&
        Objects.equals(friendGroup, userPermissionsResponse.friendGroup) &&
        Objects.equals(permissionableId, userPermissionsResponse.permissionableId) &&
        Objects.equals(permissionableType, userPermissionsResponse.permissionableType) &&
        Objects.equals(returning, userPermissionsResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, permissions, connection, connectionGroup, exclude, blocked, friendGroup, permissionableId, permissionableType, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

