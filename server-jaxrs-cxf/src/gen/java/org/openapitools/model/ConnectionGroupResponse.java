package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConnectionResponse;
import org.openapitools.model.GroupPermissions;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConnectionGroupResponse  {
  
  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String message;

  @ApiModelProperty(value = "")

  private Double version;

  @ApiModelProperty(value = "")

  private Boolean serializeNulls;

  @ApiModelProperty(value = "")

  private Long startTimeLog;

  @ApiModelProperty(value = "")

  private String errorCode;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long connectionGroupId;

  @ApiModelProperty(value = "")

  private String name;

public enum GroupTypeEnum {

PRIVATE(String.valueOf("PRIVATE")), FRIENDS(String.valueOf("FRIENDS")), TRUSTED(String.valueOf("TRUSTED")), BLOCKED(String.valueOf("BLOCKED")), FOLLOWERS(String.valueOf("FOLLOWERS")), FOLLOWING(String.valueOf("FOLLOWING")), PENDING(String.valueOf("PENDING")), REQUEST(String.valueOf("REQUEST"));


    private String value;

    GroupTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

  @ApiModelProperty(value = "")

  private GroupTypeEnum groupType;

  @ApiModelProperty(value = "")

  private String thumbnailURL;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid ConnectionGroupResponse> subGroups = new ArrayList<>();

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Integer connectionCount;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid ConnectionResponse> connections = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private GroupPermissions groupPermissions;

  @ApiModelProperty(value = "")

  private Long ownerId;

  @ApiModelProperty(value = "")

  private String returning;
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

  public ConnectionGroupResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ConnectionGroupResponse message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public ConnectionGroupResponse version(Double version) {
    this.version = version;
    return this;
  }

 /**
   * Get serializeNulls
   * @return serializeNulls
  **/
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public ConnectionGroupResponse serializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

 /**
   * Get startTimeLog
   * @return startTimeLog
  **/
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public ConnectionGroupResponse startTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

 /**
   * Get errorCode
   * @return errorCode
  **/
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ConnectionGroupResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

 /**
   * Get request
   * @return request
  **/
  @JsonProperty("request")
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public ConnectionGroupResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ConnectionGroupResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get connectionGroupId
   * @return connectionGroupId
  **/
  @JsonProperty("connectionGroupId")
  public Long getConnectionGroupId() {
    return connectionGroupId;
  }

  public void setConnectionGroupId(Long connectionGroupId) {
    this.connectionGroupId = connectionGroupId;
  }

  public ConnectionGroupResponse connectionGroupId(Long connectionGroupId) {
    this.connectionGroupId = connectionGroupId;
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

  public ConnectionGroupResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get groupType
   * @return groupType
  **/
  @JsonProperty("groupType")
  public String getGroupType() {
    if (groupType == null) {
      return null;
    }
    return groupType.value();
  }

  public void setGroupType(GroupTypeEnum groupType) {
    this.groupType = groupType;
  }

  public ConnectionGroupResponse groupType(GroupTypeEnum groupType) {
    this.groupType = groupType;
    return this;
  }

 /**
   * Get thumbnailURL
   * @return thumbnailURL
  **/
  @JsonProperty("thumbnailURL")
  public String getThumbnailURL() {
    return thumbnailURL;
  }

  public void setThumbnailURL(String thumbnailURL) {
    this.thumbnailURL = thumbnailURL;
  }

  public ConnectionGroupResponse thumbnailURL(String thumbnailURL) {
    this.thumbnailURL = thumbnailURL;
    return this;
  }

 /**
   * Get subGroups
   * @return subGroups
  **/
  @JsonProperty("subGroups")
  public List<@Valid ConnectionGroupResponse> getSubGroups() {
    return subGroups;
  }

  public void setSubGroups(List<@Valid ConnectionGroupResponse> subGroups) {
    this.subGroups = subGroups;
  }

  public ConnectionGroupResponse subGroups(List<@Valid ConnectionGroupResponse> subGroups) {
    this.subGroups = subGroups;
    return this;
  }

  public ConnectionGroupResponse addSubGroupsItem(ConnectionGroupResponse subGroupsItem) {
    this.subGroups.add(subGroupsItem);
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

  public ConnectionGroupResponse description(String description) {
    this.description = description;
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

  public ConnectionGroupResponse active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get connectionCount
   * @return connectionCount
  **/
  @JsonProperty("connectionCount")
  public Integer getConnectionCount() {
    return connectionCount;
  }

  public void setConnectionCount(Integer connectionCount) {
    this.connectionCount = connectionCount;
  }

  public ConnectionGroupResponse connectionCount(Integer connectionCount) {
    this.connectionCount = connectionCount;
    return this;
  }

 /**
   * Get connections
   * @return connections
  **/
  @JsonProperty("connections")
  public List<@Valid ConnectionResponse> getConnections() {
    return connections;
  }

  public void setConnections(List<@Valid ConnectionResponse> connections) {
    this.connections = connections;
  }

  public ConnectionGroupResponse connections(List<@Valid ConnectionResponse> connections) {
    this.connections = connections;
    return this;
  }

  public ConnectionGroupResponse addConnectionsItem(ConnectionResponse connectionsItem) {
    this.connections.add(connectionsItem);
    return this;
  }

 /**
   * Get groupPermissions
   * @return groupPermissions
  **/
  @JsonProperty("groupPermissions")
  public GroupPermissions getGroupPermissions() {
    return groupPermissions;
  }

  public void setGroupPermissions(GroupPermissions groupPermissions) {
    this.groupPermissions = groupPermissions;
  }

  public ConnectionGroupResponse groupPermissions(GroupPermissions groupPermissions) {
    this.groupPermissions = groupPermissions;
    return this;
  }

 /**
   * Get ownerId
   * @return ownerId
  **/
  @JsonProperty("ownerId")
  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public ConnectionGroupResponse ownerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

 /**
   * Get returning
   * @return returning
  **/
  @JsonProperty("returning")
  public String getReturning() {
    return returning;
  }

  public void setReturning(String returning) {
    this.returning = returning;
  }

  public ConnectionGroupResponse returning(String returning) {
    this.returning = returning;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

