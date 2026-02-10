package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConnectionResponse;
import org.openapitools.model.GroupPermissions;
import org.openapitools.model.NameStringValueResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ConnectionGroupResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ConnectionGroupResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  private @Nullable Long connectionGroupId;

  private @Nullable String name;

  /**
   * Gets or Sets groupType
   */
  public enum GroupTypeEnum {
    PRIVATE("PRIVATE"),
    
    FRIENDS("FRIENDS"),
    
    TRUSTED("TRUSTED"),
    
    BLOCKED("BLOCKED"),
    
    FOLLOWERS("FOLLOWERS"),
    
    FOLLOWING("FOLLOWING"),
    
    PENDING("PENDING"),
    
    REQUEST("REQUEST");

    private final String value;

    GroupTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GroupTypeEnum fromValue(String value) {
      for (GroupTypeEnum b : GroupTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable GroupTypeEnum groupType;

  private @Nullable String thumbnailURL;

  @Valid
  private List<@Valid ConnectionGroupResponse> subGroups = new ArrayList<>();

  private @Nullable String description;

  private @Nullable Boolean active;

  private @Nullable Integer connectionCount;

  @Valid
  private List<@Valid ConnectionResponse> connections = new ArrayList<>();

  private @Nullable GroupPermissions groupPermissions;

  private @Nullable Long ownerId;

  private @Nullable String returning;

  public ConnectionGroupResponse valid(@Nullable Boolean valid) {
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

  public ConnectionGroupResponse message(@Nullable String message) {
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

  public ConnectionGroupResponse version(@Nullable Double version) {
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

  public ConnectionGroupResponse serializeNulls(@Nullable Boolean serializeNulls) {
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

  public ConnectionGroupResponse startTimeLog(@Nullable Long startTimeLog) {
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

  public ConnectionGroupResponse errorCode(@Nullable String errorCode) {
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

  public ConnectionGroupResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ConnectionGroupResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public ConnectionGroupResponse connectionGroupId(@Nullable Long connectionGroupId) {
    this.connectionGroupId = connectionGroupId;
    return this;
  }

  /**
   * Get connectionGroupId
   * @return connectionGroupId
   */
  
  @Schema(name = "connectionGroupId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectionGroupId")
  public @Nullable Long getConnectionGroupId() {
    return connectionGroupId;
  }

  public void setConnectionGroupId(@Nullable Long connectionGroupId) {
    this.connectionGroupId = connectionGroupId;
  }

  public ConnectionGroupResponse name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public ConnectionGroupResponse groupType(@Nullable GroupTypeEnum groupType) {
    this.groupType = groupType;
    return this;
  }

  /**
   * Get groupType
   * @return groupType
   */
  
  @Schema(name = "groupType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupType")
  public @Nullable GroupTypeEnum getGroupType() {
    return groupType;
  }

  public void setGroupType(@Nullable GroupTypeEnum groupType) {
    this.groupType = groupType;
  }

  public ConnectionGroupResponse thumbnailURL(@Nullable String thumbnailURL) {
    this.thumbnailURL = thumbnailURL;
    return this;
  }

  /**
   * Get thumbnailURL
   * @return thumbnailURL
   */
  
  @Schema(name = "thumbnailURL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thumbnailURL")
  public @Nullable String getThumbnailURL() {
    return thumbnailURL;
  }

  public void setThumbnailURL(@Nullable String thumbnailURL) {
    this.thumbnailURL = thumbnailURL;
  }

  public ConnectionGroupResponse subGroups(List<@Valid ConnectionGroupResponse> subGroups) {
    this.subGroups = subGroups;
    return this;
  }

  public ConnectionGroupResponse addSubGroupsItem(ConnectionGroupResponse subGroupsItem) {
    if (this.subGroups == null) {
      this.subGroups = new ArrayList<>();
    }
    this.subGroups.add(subGroupsItem);
    return this;
  }

  /**
   * Get subGroups
   * @return subGroups
   */
  @Valid 
  @Schema(name = "subGroups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subGroups")
  public List<@Valid ConnectionGroupResponse> getSubGroups() {
    return subGroups;
  }

  public void setSubGroups(List<@Valid ConnectionGroupResponse> subGroups) {
    this.subGroups = subGroups;
  }

  public ConnectionGroupResponse description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public ConnectionGroupResponse active(@Nullable Boolean active) {
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

  public ConnectionGroupResponse connectionCount(@Nullable Integer connectionCount) {
    this.connectionCount = connectionCount;
    return this;
  }

  /**
   * Get connectionCount
   * @return connectionCount
   */
  
  @Schema(name = "connectionCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectionCount")
  public @Nullable Integer getConnectionCount() {
    return connectionCount;
  }

  public void setConnectionCount(@Nullable Integer connectionCount) {
    this.connectionCount = connectionCount;
  }

  public ConnectionGroupResponse connections(List<@Valid ConnectionResponse> connections) {
    this.connections = connections;
    return this;
  }

  public ConnectionGroupResponse addConnectionsItem(ConnectionResponse connectionsItem) {
    if (this.connections == null) {
      this.connections = new ArrayList<>();
    }
    this.connections.add(connectionsItem);
    return this;
  }

  /**
   * Get connections
   * @return connections
   */
  @Valid 
  @Schema(name = "connections", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connections")
  public List<@Valid ConnectionResponse> getConnections() {
    return connections;
  }

  public void setConnections(List<@Valid ConnectionResponse> connections) {
    this.connections = connections;
  }

  public ConnectionGroupResponse groupPermissions(@Nullable GroupPermissions groupPermissions) {
    this.groupPermissions = groupPermissions;
    return this;
  }

  /**
   * Get groupPermissions
   * @return groupPermissions
   */
  @Valid 
  @Schema(name = "groupPermissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupPermissions")
  public @Nullable GroupPermissions getGroupPermissions() {
    return groupPermissions;
  }

  public void setGroupPermissions(@Nullable GroupPermissions groupPermissions) {
    this.groupPermissions = groupPermissions;
  }

  public ConnectionGroupResponse ownerId(@Nullable Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId
   * @return ownerId
   */
  
  @Schema(name = "ownerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ownerId")
  public @Nullable Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(@Nullable Long ownerId) {
    this.ownerId = ownerId;
  }

  public ConnectionGroupResponse returning(@Nullable String returning) {
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
    ConnectionGroupResponse connectionGroupResponse = (ConnectionGroupResponse) o;
    return Objects.equals(this.valid, connectionGroupResponse.valid) &&
        Objects.equals(this.message, connectionGroupResponse.message) &&
        Objects.equals(this.version, connectionGroupResponse.version) &&
        Objects.equals(this.serializeNulls, connectionGroupResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, connectionGroupResponse.startTimeLog) &&
        Objects.equals(this.errorCode, connectionGroupResponse.errorCode) &&
        Objects.equals(this.request, connectionGroupResponse.request) &&
        Objects.equals(this.connectionGroupId, connectionGroupResponse.connectionGroupId) &&
        Objects.equals(this.name, connectionGroupResponse.name) &&
        Objects.equals(this.groupType, connectionGroupResponse.groupType) &&
        Objects.equals(this.thumbnailURL, connectionGroupResponse.thumbnailURL) &&
        Objects.equals(this.subGroups, connectionGroupResponse.subGroups) &&
        Objects.equals(this.description, connectionGroupResponse.description) &&
        Objects.equals(this.active, connectionGroupResponse.active) &&
        Objects.equals(this.connectionCount, connectionGroupResponse.connectionCount) &&
        Objects.equals(this.connections, connectionGroupResponse.connections) &&
        Objects.equals(this.groupPermissions, connectionGroupResponse.groupPermissions) &&
        Objects.equals(this.ownerId, connectionGroupResponse.ownerId) &&
        Objects.equals(this.returning, connectionGroupResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, connectionGroupId, name, groupType, thumbnailURL, subGroups, description, active, connectionCount, connections, groupPermissions, ownerId, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionGroupResponse {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    connectionGroupId: ").append(toIndentedString(connectionGroupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
    sb.append("    thumbnailURL: ").append(toIndentedString(thumbnailURL)).append("\n");
    sb.append("    subGroups: ").append(toIndentedString(subGroups)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    connectionCount: ").append(toIndentedString(connectionCount)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    groupPermissions: ").append(toIndentedString(groupPermissions)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

