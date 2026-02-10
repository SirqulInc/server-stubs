package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Asset;
import org.openapitools.model.Connection;
import org.openapitools.model.GroupPermissions;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConnectionGroup  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  @Valid

  private Account owner;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Connection> connections = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private GroupPermissions permissions;

  @ApiModelProperty(value = "")

  @Valid

  private Asset image;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid ConnectionGroup> subGroups = new ArrayList<>();
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

  public ConnectionGroup id(Long id) {
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

  public ConnectionGroup active(Boolean active) {
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

  public ConnectionGroup valid(Boolean valid) {
    this.valid = valid;
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

  public ConnectionGroup owner(Account owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConnectionGroup name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ConnectionGroup description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get connections
   * @return connections
  **/
  @JsonProperty("connections")
  public List<@Valid Connection> getConnections() {
    return connections;
  }

  public void setConnections(List<@Valid Connection> connections) {
    this.connections = connections;
  }

  public ConnectionGroup connections(List<@Valid Connection> connections) {
    this.connections = connections;
    return this;
  }

  public ConnectionGroup addConnectionsItem(Connection connectionsItem) {
    this.connections.add(connectionsItem);
    return this;
  }

 /**
   * Get permissions
   * @return permissions
  **/
  @JsonProperty("permissions")
  public GroupPermissions getPermissions() {
    return permissions;
  }

  public void setPermissions(GroupPermissions permissions) {
    this.permissions = permissions;
  }

  public ConnectionGroup permissions(GroupPermissions permissions) {
    this.permissions = permissions;
    return this;
  }

 /**
   * Get image
   * @return image
  **/
  @JsonProperty("image")
  public Asset getImage() {
    return image;
  }

  public void setImage(Asset image) {
    this.image = image;
  }

  public ConnectionGroup image(Asset image) {
    this.image = image;
    return this;
  }

 /**
   * Get subGroups
   * @return subGroups
  **/
  @JsonProperty("subGroups")
  public List<@Valid ConnectionGroup> getSubGroups() {
    return subGroups;
  }

  public void setSubGroups(List<@Valid ConnectionGroup> subGroups) {
    this.subGroups = subGroups;
  }

  public ConnectionGroup subGroups(List<@Valid ConnectionGroup> subGroups) {
    this.subGroups = subGroups;
    return this;
  }

  public ConnectionGroup addSubGroupsItem(ConnectionGroup subGroupsItem) {
    this.subGroups.add(subGroupsItem);
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
    ConnectionGroup connectionGroup = (ConnectionGroup) o;
    return Objects.equals(this.id, connectionGroup.id) &&
        Objects.equals(this.active, connectionGroup.active) &&
        Objects.equals(this.valid, connectionGroup.valid) &&
        Objects.equals(this.owner, connectionGroup.owner) &&
        Objects.equals(this.name, connectionGroup.name) &&
        Objects.equals(this.description, connectionGroup.description) &&
        Objects.equals(this.connections, connectionGroup.connections) &&
        Objects.equals(this.permissions, connectionGroup.permissions) &&
        Objects.equals(this.image, connectionGroup.image) &&
        Objects.equals(this.subGroups, connectionGroup.subGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, owner, name, description, connections, permissions, image, subGroups);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

