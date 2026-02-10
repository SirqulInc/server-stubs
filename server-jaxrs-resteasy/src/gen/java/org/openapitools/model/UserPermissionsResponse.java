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
import org.openapitools.model.ConnectionResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.PermissionResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class UserPermissionsResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private PermissionResponse permissions;
  private ConnectionResponse connection;
  private ConnectionGroupResponse connectionGroup;
  private Boolean exclude;
  private Boolean blocked;
  private Boolean friendGroup;
  private Long permissionableId;
  private String permissionableType;
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
  @JsonProperty("permissions")
  @Valid
  public PermissionResponse getPermissions() {
    return permissions;
  }
  public void setPermissions(PermissionResponse permissions) {
    this.permissions = permissions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connection")
  @Valid
  public ConnectionResponse getConnection() {
    return connection;
  }
  public void setConnection(ConnectionResponse connection) {
    this.connection = connection;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connectionGroup")
  @Valid
  public ConnectionGroupResponse getConnectionGroup() {
    return connectionGroup;
  }
  public void setConnectionGroup(ConnectionGroupResponse connectionGroup) {
    this.connectionGroup = connectionGroup;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("exclude")
  public Boolean getExclude() {
    return exclude;
  }
  public void setExclude(Boolean exclude) {
    this.exclude = exclude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("blocked")
  public Boolean getBlocked() {
    return blocked;
  }
  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("friendGroup")
  public Boolean getFriendGroup() {
    return friendGroup;
  }
  public void setFriendGroup(Boolean friendGroup) {
    this.friendGroup = friendGroup;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("permissionableId")
  public Long getPermissionableId() {
    return permissionableId;
  }
  public void setPermissionableId(Long permissionableId) {
    this.permissionableId = permissionableId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("permissionableType")
  public String getPermissionableType() {
    return permissionableType;
  }
  public void setPermissionableType(String permissionableType) {
    this.permissionableType = permissionableType;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

