package apimodels;

import apimodels.Account;
import apimodels.Connection;
import apimodels.ConnectionGroup;
import apimodels.Permissions;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UserPermissions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UserPermissions   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("permissionableType")
  
  private String permissionableType;

  @JsonProperty("permissionableId")
  
  private Long permissionableId;

  @JsonProperty("connectionGroup")
  @Valid

  private ConnectionGroup connectionGroup;

  @JsonProperty("friendGroup")
  
  private Boolean friendGroup;

  @JsonProperty("connection")
  @Valid

  private Connection connection;

  @JsonProperty("permissions")
  @Valid

  private Permissions permissions;

  @JsonProperty("exclude")
  
  private Boolean exclude;

  @JsonProperty("blocked")
  
  private Boolean blocked;

  @JsonProperty("owner")
  @Valid

  private Account owner;

  public UserPermissions id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserPermissions active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public UserPermissions valid(Boolean valid) {
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

  public UserPermissions permissionableType(String permissionableType) {
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

  public UserPermissions permissionableId(Long permissionableId) {
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

  public UserPermissions connectionGroup(ConnectionGroup connectionGroup) {
    this.connectionGroup = connectionGroup;
    return this;
  }

   /**
   * Get connectionGroup
   * @return connectionGroup
  **/
  public ConnectionGroup getConnectionGroup() {
    return connectionGroup;
  }

  public void setConnectionGroup(ConnectionGroup connectionGroup) {
    this.connectionGroup = connectionGroup;
  }

  public UserPermissions friendGroup(Boolean friendGroup) {
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

  public UserPermissions connection(Connection connection) {
    this.connection = connection;
    return this;
  }

   /**
   * Get connection
   * @return connection
  **/
  public Connection getConnection() {
    return connection;
  }

  public void setConnection(Connection connection) {
    this.connection = connection;
  }

  public UserPermissions permissions(Permissions permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  public Permissions getPermissions() {
    return permissions;
  }

  public void setPermissions(Permissions permissions) {
    this.permissions = permissions;
  }

  public UserPermissions exclude(Boolean exclude) {
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

  public UserPermissions blocked(Boolean blocked) {
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

  public UserPermissions owner(Account owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
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
    return Objects.equals(id, userPermissions.id) &&
        Objects.equals(active, userPermissions.active) &&
        Objects.equals(valid, userPermissions.valid) &&
        Objects.equals(permissionableType, userPermissions.permissionableType) &&
        Objects.equals(permissionableId, userPermissions.permissionableId) &&
        Objects.equals(connectionGroup, userPermissions.connectionGroup) &&
        Objects.equals(friendGroup, userPermissions.friendGroup) &&
        Objects.equals(connection, userPermissions.connection) &&
        Objects.equals(permissions, userPermissions.permissions) &&
        Objects.equals(exclude, userPermissions.exclude) &&
        Objects.equals(blocked, userPermissions.blocked) &&
        Objects.equals(owner, userPermissions.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, permissionableType, permissionableId, connectionGroup, friendGroup, connection, permissions, exclude, blocked, owner);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

