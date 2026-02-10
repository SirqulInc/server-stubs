package apimodels;

import apimodels.ConnectionResponse;
import apimodels.GroupPermissions;
import apimodels.NameStringValueResponse;
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
 * ConnectionGroupResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConnectionGroupResponse   {
  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("message")
  
  private String message;

  @JsonProperty("version")
  
  private Double version;

  @JsonProperty("serializeNulls")
  
  private Boolean serializeNulls;

  @JsonProperty("startTimeLog")
  
  private Long startTimeLog;

  @JsonProperty("errorCode")
  
  private String errorCode;

  @JsonProperty("request")
  @Valid

  private List<@Valid NameStringValueResponse> request = null;

  @JsonProperty("connectionGroupId")
  
  private Long connectionGroupId;

  @JsonProperty("name")
  
  private String name;

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

  @JsonProperty("groupType")
  
  private GroupTypeEnum groupType;

  @JsonProperty("thumbnailURL")
  
  private String thumbnailURL;

  @JsonProperty("subGroups")
  @Valid

  private List<@Valid ConnectionGroupResponse> subGroups = null;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("connectionCount")
  
  private Integer connectionCount;

  @JsonProperty("connections")
  @Valid

  private List<@Valid ConnectionResponse> connections = null;

  @JsonProperty("groupPermissions")
  @Valid

  private GroupPermissions groupPermissions;

  @JsonProperty("ownerId")
  
  private Long ownerId;

  @JsonProperty("returning")
  
  private String returning;

  public ConnectionGroupResponse valid(Boolean valid) {
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

  public ConnectionGroupResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ConnectionGroupResponse version(Double version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public ConnectionGroupResponse serializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

   /**
   * Get serializeNulls
   * @return serializeNulls
  **/
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public ConnectionGroupResponse startTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

   /**
   * Get startTimeLog
   * @return startTimeLog
  **/
  public Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public ConnectionGroupResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
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
  **/
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public ConnectionGroupResponse connectionGroupId(Long connectionGroupId) {
    this.connectionGroupId = connectionGroupId;
    return this;
  }

   /**
   * Get connectionGroupId
   * @return connectionGroupId
  **/
  public Long getConnectionGroupId() {
    return connectionGroupId;
  }

  public void setConnectionGroupId(Long connectionGroupId) {
    this.connectionGroupId = connectionGroupId;
  }

  public ConnectionGroupResponse name(String name) {
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

  public ConnectionGroupResponse groupType(GroupTypeEnum groupType) {
    this.groupType = groupType;
    return this;
  }

   /**
   * Get groupType
   * @return groupType
  **/
  public GroupTypeEnum getGroupType() {
    return groupType;
  }

  public void setGroupType(GroupTypeEnum groupType) {
    this.groupType = groupType;
  }

  public ConnectionGroupResponse thumbnailURL(String thumbnailURL) {
    this.thumbnailURL = thumbnailURL;
    return this;
  }

   /**
   * Get thumbnailURL
   * @return thumbnailURL
  **/
  public String getThumbnailURL() {
    return thumbnailURL;
  }

  public void setThumbnailURL(String thumbnailURL) {
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
  **/
  public List<@Valid ConnectionGroupResponse> getSubGroups() {
    return subGroups;
  }

  public void setSubGroups(List<@Valid ConnectionGroupResponse> subGroups) {
    this.subGroups = subGroups;
  }

  public ConnectionGroupResponse description(String description) {
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

  public ConnectionGroupResponse active(Boolean active) {
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

  public ConnectionGroupResponse connectionCount(Integer connectionCount) {
    this.connectionCount = connectionCount;
    return this;
  }

   /**
   * Get connectionCount
   * @return connectionCount
  **/
  public Integer getConnectionCount() {
    return connectionCount;
  }

  public void setConnectionCount(Integer connectionCount) {
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
  **/
  public List<@Valid ConnectionResponse> getConnections() {
    return connections;
  }

  public void setConnections(List<@Valid ConnectionResponse> connections) {
    this.connections = connections;
  }

  public ConnectionGroupResponse groupPermissions(GroupPermissions groupPermissions) {
    this.groupPermissions = groupPermissions;
    return this;
  }

   /**
   * Get groupPermissions
   * @return groupPermissions
  **/
  public GroupPermissions getGroupPermissions() {
    return groupPermissions;
  }

  public void setGroupPermissions(GroupPermissions groupPermissions) {
    this.groupPermissions = groupPermissions;
  }

  public ConnectionGroupResponse ownerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public ConnectionGroupResponse returning(String returning) {
    this.returning = returning;
    return this;
  }

   /**
   * Get returning
   * @return returning
  **/
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
    ConnectionGroupResponse connectionGroupResponse = (ConnectionGroupResponse) o;
    return Objects.equals(valid, connectionGroupResponse.valid) &&
        Objects.equals(message, connectionGroupResponse.message) &&
        Objects.equals(version, connectionGroupResponse.version) &&
        Objects.equals(serializeNulls, connectionGroupResponse.serializeNulls) &&
        Objects.equals(startTimeLog, connectionGroupResponse.startTimeLog) &&
        Objects.equals(errorCode, connectionGroupResponse.errorCode) &&
        Objects.equals(request, connectionGroupResponse.request) &&
        Objects.equals(connectionGroupId, connectionGroupResponse.connectionGroupId) &&
        Objects.equals(name, connectionGroupResponse.name) &&
        Objects.equals(groupType, connectionGroupResponse.groupType) &&
        Objects.equals(thumbnailURL, connectionGroupResponse.thumbnailURL) &&
        Objects.equals(subGroups, connectionGroupResponse.subGroups) &&
        Objects.equals(description, connectionGroupResponse.description) &&
        Objects.equals(active, connectionGroupResponse.active) &&
        Objects.equals(connectionCount, connectionGroupResponse.connectionCount) &&
        Objects.equals(connections, connectionGroupResponse.connections) &&
        Objects.equals(groupPermissions, connectionGroupResponse.groupPermissions) &&
        Objects.equals(ownerId, connectionGroupResponse.ownerId) &&
        Objects.equals(returning, connectionGroupResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, connectionGroupId, name, groupType, thumbnailURL, subGroups, description, active, connectionCount, connections, groupPermissions, ownerId, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

