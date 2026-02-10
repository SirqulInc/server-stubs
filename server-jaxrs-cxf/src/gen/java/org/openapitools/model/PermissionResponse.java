package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PermissionResponse  {
  
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

  private Boolean read;

  @ApiModelProperty(value = "")

  private Boolean write;

  @ApiModelProperty(value = "")

  private Boolean delete;

  @ApiModelProperty(value = "")

  private Boolean add;

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

  public PermissionResponse valid(Boolean valid) {
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

  public PermissionResponse message(String message) {
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

  public PermissionResponse version(Double version) {
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

  public PermissionResponse serializeNulls(Boolean serializeNulls) {
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

  public PermissionResponse startTimeLog(Long startTimeLog) {
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

  public PermissionResponse errorCode(String errorCode) {
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

  public PermissionResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public PermissionResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get read
   * @return read
  **/
  @JsonProperty("read")
  public Boolean getRead() {
    return read;
  }

  public void setRead(Boolean read) {
    this.read = read;
  }

  public PermissionResponse read(Boolean read) {
    this.read = read;
    return this;
  }

 /**
   * Get write
   * @return write
  **/
  @JsonProperty("write")
  public Boolean getWrite() {
    return write;
  }

  public void setWrite(Boolean write) {
    this.write = write;
  }

  public PermissionResponse write(Boolean write) {
    this.write = write;
    return this;
  }

 /**
   * Get delete
   * @return delete
  **/
  @JsonProperty("delete")
  public Boolean getDelete() {
    return delete;
  }

  public void setDelete(Boolean delete) {
    this.delete = delete;
  }

  public PermissionResponse delete(Boolean delete) {
    this.delete = delete;
    return this;
  }

 /**
   * Get add
   * @return add
  **/
  @JsonProperty("add")
  public Boolean getAdd() {
    return add;
  }

  public void setAdd(Boolean add) {
    this.add = add;
  }

  public PermissionResponse add(Boolean add) {
    this.add = add;
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

  public PermissionResponse returning(String returning) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

