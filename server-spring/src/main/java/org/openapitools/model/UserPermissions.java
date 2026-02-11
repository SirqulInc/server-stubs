package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Account;
import org.openapitools.model.Connection;
import org.openapitools.model.ConnectionGroup;
import org.openapitools.model.Permissions;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserPermissions
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class UserPermissions {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable String permissionableType;

  private @Nullable Long permissionableId;

  private @Nullable ConnectionGroup connectionGroup;

  private @Nullable Boolean friendGroup;

  private @Nullable Connection connection;

  private @Nullable Permissions permissions;

  private @Nullable Boolean exclude;

  private @Nullable Boolean blocked;

  private @Nullable Account owner;

  public UserPermissions id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public UserPermissions active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  public UserPermissions valid(@Nullable Boolean valid) {
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

  public UserPermissions permissionableType(@Nullable String permissionableType) {
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

  public UserPermissions permissionableId(@Nullable Long permissionableId) {
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

  public UserPermissions connectionGroup(@Nullable ConnectionGroup connectionGroup) {
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
  public @Nullable ConnectionGroup getConnectionGroup() {
    return connectionGroup;
  }

  public void setConnectionGroup(@Nullable ConnectionGroup connectionGroup) {
    this.connectionGroup = connectionGroup;
  }

  public UserPermissions friendGroup(@Nullable Boolean friendGroup) {
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

  public UserPermissions connection(@Nullable Connection connection) {
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
  public @Nullable Connection getConnection() {
    return connection;
  }

  public void setConnection(@Nullable Connection connection) {
    this.connection = connection;
  }

  public UserPermissions permissions(@Nullable Permissions permissions) {
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
  public @Nullable Permissions getPermissions() {
    return permissions;
  }

  public void setPermissions(@Nullable Permissions permissions) {
    this.permissions = permissions;
  }

  public UserPermissions exclude(@Nullable Boolean exclude) {
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

  public UserPermissions blocked(@Nullable Boolean blocked) {
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

  public UserPermissions owner(@Nullable Account owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @Valid 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public @Nullable Account getOwner() {
    return owner;
  }

  public void setOwner(@Nullable Account owner) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

