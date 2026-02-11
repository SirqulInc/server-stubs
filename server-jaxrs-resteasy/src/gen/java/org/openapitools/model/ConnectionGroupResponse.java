package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConnectionResponse;
import org.openapitools.model.GroupPermissions;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ConnectionGroupResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private Long connectionGroupId;
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
    private String value;

    GroupTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private GroupTypeEnum groupType;
  private String thumbnailURL;
  private List<@Valid ConnectionGroupResponse> subGroups = new ArrayList<>();
  private String description;
  private Boolean active;
  private Integer connectionCount;
  private List<@Valid ConnectionResponse> connections = new ArrayList<>();
  private GroupPermissions groupPermissions;
  private Long ownerId;
  private String returning;

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
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }
  public void setVersion(Double version) {
    this.version = version;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }
  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }
  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("request")
  @Valid
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }
  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connectionGroupId")
  public Long getConnectionGroupId() {
    return connectionGroupId;
  }
  public void setConnectionGroupId(Long connectionGroupId) {
    this.connectionGroupId = connectionGroupId;
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
  @JsonProperty("groupType")
  public GroupTypeEnum getGroupType() {
    return groupType;
  }
  public void setGroupType(GroupTypeEnum groupType) {
    this.groupType = groupType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("thumbnailURL")
  public String getThumbnailURL() {
    return thumbnailURL;
  }
  public void setThumbnailURL(String thumbnailURL) {
    this.thumbnailURL = thumbnailURL;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("subGroups")
  @Valid
  public List<@Valid ConnectionGroupResponse> getSubGroups() {
    return subGroups;
  }
  public void setSubGroups(List<@Valid ConnectionGroupResponse> subGroups) {
    this.subGroups = subGroups;
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
  @JsonProperty("connectionCount")
  public Integer getConnectionCount() {
    return connectionCount;
  }
  public void setConnectionCount(Integer connectionCount) {
    this.connectionCount = connectionCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connections")
  @Valid
  public List<@Valid ConnectionResponse> getConnections() {
    return connections;
  }
  public void setConnections(List<@Valid ConnectionResponse> connections) {
    this.connections = connections;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("groupPermissions")
  @Valid
  public GroupPermissions getGroupPermissions() {
    return groupPermissions;
  }
  public void setGroupPermissions(GroupPermissions groupPermissions) {
    this.groupPermissions = groupPermissions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ownerId")
  public Long getOwnerId() {
    return ownerId;
  }
  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("returning")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

