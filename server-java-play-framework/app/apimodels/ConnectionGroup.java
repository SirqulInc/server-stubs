package apimodels;

import apimodels.Account;
import apimodels.Asset;
import apimodels.Connection;
import apimodels.GroupPermissions;
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
 * ConnectionGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConnectionGroup   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("owner")
  @Valid

  private Account owner;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("connections")
  @Valid

  private List<@Valid Connection> connections = null;

  @JsonProperty("permissions")
  @Valid

  private GroupPermissions permissions;

  @JsonProperty("image")
  @Valid

  private Asset image;

  @JsonProperty("subGroups")
  @Valid

  private List<@Valid ConnectionGroup> subGroups = null;

  public ConnectionGroup id(Long id) {
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

  public ConnectionGroup active(Boolean active) {
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

  public ConnectionGroup valid(Boolean valid) {
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

  public ConnectionGroup owner(Account owner) {
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

  public ConnectionGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConnectionGroup description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ConnectionGroup connections(List<@Valid Connection> connections) {
    this.connections = connections;
    return this;
  }

  public ConnectionGroup addConnectionsItem(Connection connectionsItem) {
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
  public List<@Valid Connection> getConnections() {
    return connections;
  }

  public void setConnections(List<@Valid Connection> connections) {
    this.connections = connections;
  }

  public ConnectionGroup permissions(GroupPermissions permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  public GroupPermissions getPermissions() {
    return permissions;
  }

  public void setPermissions(GroupPermissions permissions) {
    this.permissions = permissions;
  }

  public ConnectionGroup image(Asset image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  public Asset getImage() {
    return image;
  }

  public void setImage(Asset image) {
    this.image = image;
  }

  public ConnectionGroup subGroups(List<@Valid ConnectionGroup> subGroups) {
    this.subGroups = subGroups;
    return this;
  }

  public ConnectionGroup addSubGroupsItem(ConnectionGroup subGroupsItem) {
    if (this.subGroups == null) {
      this.subGroups = new ArrayList<>();
    }
    this.subGroups.add(subGroupsItem);
    return this;
  }

   /**
   * Get subGroups
   * @return subGroups
  **/
  public List<@Valid ConnectionGroup> getSubGroups() {
    return subGroups;
  }

  public void setSubGroups(List<@Valid ConnectionGroup> subGroups) {
    this.subGroups = subGroups;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionGroup connectionGroup = (ConnectionGroup) o;
    return Objects.equals(id, connectionGroup.id) &&
        Objects.equals(active, connectionGroup.active) &&
        Objects.equals(valid, connectionGroup.valid) &&
        Objects.equals(owner, connectionGroup.owner) &&
        Objects.equals(name, connectionGroup.name) &&
        Objects.equals(description, connectionGroup.description) &&
        Objects.equals(connections, connectionGroup.connections) &&
        Objects.equals(permissions, connectionGroup.permissions) &&
        Objects.equals(image, connectionGroup.image) &&
        Objects.equals(subGroups, connectionGroup.subGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, owner, name, description, connections, permissions, image, subGroups);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    subGroups: ").append(toIndentedString(subGroups)).append("\n");
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

