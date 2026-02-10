package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Account;
import org.openapitools.model.Connection;
import org.openapitools.model.ConnectionGroup;
import org.openapitools.model.Permissions;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class UserPermissions   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private String permissionableType;
  private Long permissionableId;
  private ConnectionGroup connectionGroup;
  private Boolean friendGroup;
  private Connection connection;
  private Permissions permissions;
  private Boolean exclude;
  private Boolean blocked;
  private Account owner;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

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
  @JsonProperty("connectionGroup")
  @Valid
  public ConnectionGroup getConnectionGroup() {
    return connectionGroup;
  }
  public void setConnectionGroup(ConnectionGroup connectionGroup) {
    this.connectionGroup = connectionGroup;
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
  @JsonProperty("connection")
  @Valid
  public Connection getConnection() {
    return connection;
  }
  public void setConnection(Connection connection) {
    this.connection = connection;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("permissions")
  @Valid
  public Permissions getPermissions() {
    return permissions;
  }
  public void setPermissions(Permissions permissions) {
    this.permissions = permissions;
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
  @JsonProperty("owner")
  @Valid
  public Account getOwner() {
    return owner;
  }
  public void setOwner(Account owner) {
    this.owner = owner;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

