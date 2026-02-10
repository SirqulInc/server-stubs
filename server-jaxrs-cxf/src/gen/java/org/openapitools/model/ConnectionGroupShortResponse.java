package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConnectionGroupShortResponse  {
  
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

  public ConnectionGroupShortResponse valid(Boolean valid) {
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

  public ConnectionGroupShortResponse message(String message) {
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

  public ConnectionGroupShortResponse version(Double version) {
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

  public ConnectionGroupShortResponse serializeNulls(Boolean serializeNulls) {
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

  public ConnectionGroupShortResponse startTimeLog(Long startTimeLog) {
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

  public ConnectionGroupShortResponse errorCode(String errorCode) {
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

  public ConnectionGroupShortResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ConnectionGroupShortResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public ConnectionGroupShortResponse connectionGroupId(Long connectionGroupId) {
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

  public ConnectionGroupShortResponse name(String name) {
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

  public ConnectionGroupShortResponse groupType(GroupTypeEnum groupType) {
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

  public ConnectionGroupShortResponse thumbnailURL(String thumbnailURL) {
    this.thumbnailURL = thumbnailURL;
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

  public ConnectionGroupShortResponse returning(String returning) {
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
    ConnectionGroupShortResponse connectionGroupShortResponse = (ConnectionGroupShortResponse) o;
    return Objects.equals(this.valid, connectionGroupShortResponse.valid) &&
        Objects.equals(this.message, connectionGroupShortResponse.message) &&
        Objects.equals(this.version, connectionGroupShortResponse.version) &&
        Objects.equals(this.serializeNulls, connectionGroupShortResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, connectionGroupShortResponse.startTimeLog) &&
        Objects.equals(this.errorCode, connectionGroupShortResponse.errorCode) &&
        Objects.equals(this.request, connectionGroupShortResponse.request) &&
        Objects.equals(this.connectionGroupId, connectionGroupShortResponse.connectionGroupId) &&
        Objects.equals(this.name, connectionGroupShortResponse.name) &&
        Objects.equals(this.groupType, connectionGroupShortResponse.groupType) &&
        Objects.equals(this.thumbnailURL, connectionGroupShortResponse.thumbnailURL) &&
        Objects.equals(this.returning, connectionGroupShortResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, connectionGroupId, name, groupType, thumbnailURL, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionGroupShortResponse {\n");
    
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

