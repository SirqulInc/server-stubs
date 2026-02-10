package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * PermissionResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PermissionResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  private @Nullable Boolean read;

  private @Nullable Boolean write;

  private @Nullable Boolean delete;

  private @Nullable Boolean add;

  private @Nullable String returning;

  public PermissionResponse valid(@Nullable Boolean valid) {
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

  public PermissionResponse message(@Nullable String message) {
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

  public PermissionResponse version(@Nullable Double version) {
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

  public PermissionResponse serializeNulls(@Nullable Boolean serializeNulls) {
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

  public PermissionResponse startTimeLog(@Nullable Long startTimeLog) {
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

  public PermissionResponse errorCode(@Nullable String errorCode) {
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

  public PermissionResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public PermissionResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public PermissionResponse read(@Nullable Boolean read) {
    this.read = read;
    return this;
  }

  /**
   * Get read
   * @return read
   */
  
  @Schema(name = "read", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("read")
  public @Nullable Boolean getRead() {
    return read;
  }

  public void setRead(@Nullable Boolean read) {
    this.read = read;
  }

  public PermissionResponse write(@Nullable Boolean write) {
    this.write = write;
    return this;
  }

  /**
   * Get write
   * @return write
   */
  
  @Schema(name = "write", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("write")
  public @Nullable Boolean getWrite() {
    return write;
  }

  public void setWrite(@Nullable Boolean write) {
    this.write = write;
  }

  public PermissionResponse delete(@Nullable Boolean delete) {
    this.delete = delete;
    return this;
  }

  /**
   * Get delete
   * @return delete
   */
  
  @Schema(name = "delete", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("delete")
  public @Nullable Boolean getDelete() {
    return delete;
  }

  public void setDelete(@Nullable Boolean delete) {
    this.delete = delete;
  }

  public PermissionResponse add(@Nullable Boolean add) {
    this.add = add;
    return this;
  }

  /**
   * Get add
   * @return add
   */
  
  @Schema(name = "add", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("add")
  public @Nullable Boolean getAdd() {
    return add;
  }

  public void setAdd(@Nullable Boolean add) {
    this.add = add;
  }

  public PermissionResponse returning(@Nullable String returning) {
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
    PermissionResponse permissionResponse = (PermissionResponse) o;
    return Objects.equals(this.valid, permissionResponse.valid) &&
        Objects.equals(this.message, permissionResponse.message) &&
        Objects.equals(this.version, permissionResponse.version) &&
        Objects.equals(this.serializeNulls, permissionResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, permissionResponse.startTimeLog) &&
        Objects.equals(this.errorCode, permissionResponse.errorCode) &&
        Objects.equals(this.request, permissionResponse.request) &&
        Objects.equals(this.read, permissionResponse.read) &&
        Objects.equals(this.write, permissionResponse.write) &&
        Objects.equals(this.delete, permissionResponse.delete) &&
        Objects.equals(this.add, permissionResponse.add) &&
        Objects.equals(this.returning, permissionResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, read, write, delete, add, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionResponse {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    write: ").append(toIndentedString(write)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
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

