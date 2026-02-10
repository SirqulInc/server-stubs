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
import org.openapitools.model.Account;
import org.openapitools.model.Asset;
import org.openapitools.model.Connection;
import org.openapitools.model.GroupPermissions;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ConnectionGroup   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Account owner;
  private String name;
  private String description;
  private List<@Valid Connection> connections = new ArrayList<>();
  private GroupPermissions permissions;
  private Asset image;
  private List<@Valid ConnectionGroup> subGroups = new ArrayList<>();

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
  @JsonProperty("owner")
  @Valid
  public Account getOwner() {
    return owner;
  }
  public void setOwner(Account owner) {
    this.owner = owner;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connections")
  @Valid
  public List<@Valid Connection> getConnections() {
    return connections;
  }
  public void setConnections(List<@Valid Connection> connections) {
    this.connections = connections;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("permissions")
  @Valid
  public GroupPermissions getPermissions() {
    return permissions;
  }
  public void setPermissions(GroupPermissions permissions) {
    this.permissions = permissions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("image")
  @Valid
  public Asset getImage() {
    return image;
  }
  public void setImage(Asset image) {
    this.image = image;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("subGroups")
  @Valid
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

