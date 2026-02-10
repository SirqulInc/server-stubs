package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * ConnectionGroupShortResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ConnectionGroupShortResponse {

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

  private @Nullable String returning;

  public ConnectionGroupShortResponse valid(@Nullable Boolean valid) {
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

  public ConnectionGroupShortResponse message(@Nullable String message) {
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

  public ConnectionGroupShortResponse version(@Nullable Double version) {
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

  public ConnectionGroupShortResponse serializeNulls(@Nullable Boolean serializeNulls) {
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

  public ConnectionGroupShortResponse startTimeLog(@Nullable Long startTimeLog) {
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

  public ConnectionGroupShortResponse errorCode(@Nullable String errorCode) {
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

  public ConnectionGroupShortResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ConnectionGroupShortResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public ConnectionGroupShortResponse connectionGroupId(@Nullable Long connectionGroupId) {
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

  public ConnectionGroupShortResponse name(@Nullable String name) {
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

  public ConnectionGroupShortResponse groupType(@Nullable GroupTypeEnum groupType) {
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

  public ConnectionGroupShortResponse thumbnailURL(@Nullable String thumbnailURL) {
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

  public ConnectionGroupShortResponse returning(@Nullable String returning) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

