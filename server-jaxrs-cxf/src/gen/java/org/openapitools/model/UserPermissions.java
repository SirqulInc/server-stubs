package org.openapitools.model;

import org.openapitools.model.Account;
import org.openapitools.model.Connection;
import org.openapitools.model.ConnectionGroup;
import org.openapitools.model.Permissions;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UserPermissions  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String permissionableType;

  @ApiModelProperty(value = "")

  private Long permissionableId;

  @ApiModelProperty(value = "")

  @Valid

  private ConnectionGroup connectionGroup;

  @ApiModelProperty(value = "")

  private Boolean friendGroup;

  @ApiModelProperty(value = "")

  @Valid

  private Connection connection;

  @ApiModelProperty(value = "")

  @Valid

  private Permissions permissions;

  @ApiModelProperty(value = "")

  private Boolean exclude;

  @ApiModelProperty(value = "")

  private Boolean blocked;

  @ApiModelProperty(value = "")

  @Valid

  private Account owner;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserPermissions id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public UserPermissions active(Boolean active) {
    this.active = active;
    return this;
  }

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

  public UserPermissions valid(Boolean valid) {
    this.valid = valid;
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

  public UserPermissions permissionableType(String permissionableType) {
    this.permissionableType = permissionableType;
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

  public UserPermissions permissionableId(Long permissionableId) {
    this.permissionableId = permissionableId;
    return this;
  }

 /**
   * Get connectionGroup
   * @return connectionGroup
  **/
  @JsonProperty("connectionGroup")
  public ConnectionGroup getConnectionGroup() {
    return connectionGroup;
  }

  public void setConnectionGroup(ConnectionGroup connectionGroup) {
    this.connectionGroup = connectionGroup;
  }

  public UserPermissions connectionGroup(ConnectionGroup connectionGroup) {
    this.connectionGroup = connectionGroup;
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

  public UserPermissions friendGroup(Boolean friendGroup) {
    this.friendGroup = friendGroup;
    return this;
  }

 /**
   * Get connection
   * @return connection
  **/
  @JsonProperty("connection")
  public Connection getConnection() {
    return connection;
  }

  public void setConnection(Connection connection) {
    this.connection = connection;
  }

  public UserPermissions connection(Connection connection) {
    this.connection = connection;
    return this;
  }

 /**
   * Get permissions
   * @return permissions
  **/
  @JsonProperty("permissions")
  public Permissions getPermissions() {
    return permissions;
  }

  public void setPermissions(Permissions permissions) {
    this.permissions = permissions;
  }

  public UserPermissions permissions(Permissions permissions) {
    this.permissions = permissions;
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

  public UserPermissions exclude(Boolean exclude) {
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

  public UserPermissions blocked(Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public UserPermissions owner(Account owner) {
    this.owner = owner;
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
    UserPermissions userPermissions = (UserPermissions) o;
    return Objects.equals(this.id, userPermissions.id) &&
        Objects.equals(this.active, userPermissions.active) &&
        Objects.equals(this.valid, userPermissions.valid) &&
        Objects.equals(this.permissionableType, userPermissions.permissionableType) &&
        Objects.equals(this.permissionableId, userPermissions.permissionableId) &&
        Objects.equals(this.connectionGroup, userPermissions.connectionGroup) &&
        Objects.equals(this.friendGroup, userPermissions.friendGroup) &&
        Objects.equals(this.connection, userPermissions.connection) &&
        Objects.equals(this.permissions, userPermissions.permissions) &&
        Objects.equals(this.exclude, userPermissions.exclude) &&
        Objects.equals(this.blocked, userPermissions.blocked) &&
        Objects.equals(this.owner, userPermissions.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, permissionableType, permissionableId, connectionGroup, friendGroup, connection, permissions, exclude, blocked, owner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPermissions {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    permissionableType: ").append(toIndentedString(permissionableType)).append("\n");
    sb.append("    permissionableId: ").append(toIndentedString(permissionableId)).append("\n");
    sb.append("    connectionGroup: ").append(toIndentedString(connectionGroup)).append("\n");
    sb.append("    friendGroup: ").append(toIndentedString(friendGroup)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

