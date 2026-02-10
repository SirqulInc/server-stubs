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


public class ApplicationConfigResponse  {
  
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

  private Long configId;

  @ApiModelProperty(value = "")

  private Long created;

  @ApiModelProperty(value = "")

  private Long updated;

  @ApiModelProperty(value = "")

  private String configVersion;

  @ApiModelProperty(value = "")

  private String configJson;

  @ApiModelProperty(value = "")

  private String configJsonURL;

  @ApiModelProperty(value = "")

  private Long assetId;

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

  public ApplicationConfigResponse valid(Boolean valid) {
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

  public ApplicationConfigResponse message(String message) {
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

  public ApplicationConfigResponse version(Double version) {
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

  public ApplicationConfigResponse serializeNulls(Boolean serializeNulls) {
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

  public ApplicationConfigResponse startTimeLog(Long startTimeLog) {
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

  public ApplicationConfigResponse errorCode(String errorCode) {
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

  public ApplicationConfigResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ApplicationConfigResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get configId
   * @return configId
  **/
  @JsonProperty("configId")
  public Long getConfigId() {
    return configId;
  }

  public void setConfigId(Long configId) {
    this.configId = configId;
  }

  public ApplicationConfigResponse configId(Long configId) {
    this.configId = configId;
    return this;
  }

 /**
   * Get created
   * @return created
  **/
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public ApplicationConfigResponse created(Long created) {
    this.created = created;
    return this;
  }

 /**
   * Get updated
   * @return updated
  **/
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  public ApplicationConfigResponse updated(Long updated) {
    this.updated = updated;
    return this;
  }

 /**
   * Get configVersion
   * @return configVersion
  **/
  @JsonProperty("configVersion")
  public String getConfigVersion() {
    return configVersion;
  }

  public void setConfigVersion(String configVersion) {
    this.configVersion = configVersion;
  }

  public ApplicationConfigResponse configVersion(String configVersion) {
    this.configVersion = configVersion;
    return this;
  }

 /**
   * Get configJson
   * @return configJson
  **/
  @JsonProperty("configJson")
  public String getConfigJson() {
    return configJson;
  }

  public void setConfigJson(String configJson) {
    this.configJson = configJson;
  }

  public ApplicationConfigResponse configJson(String configJson) {
    this.configJson = configJson;
    return this;
  }

 /**
   * Get configJsonURL
   * @return configJsonURL
  **/
  @JsonProperty("configJsonURL")
  public String getConfigJsonURL() {
    return configJsonURL;
  }

  public void setConfigJsonURL(String configJsonURL) {
    this.configJsonURL = configJsonURL;
  }

  public ApplicationConfigResponse configJsonURL(String configJsonURL) {
    this.configJsonURL = configJsonURL;
    return this;
  }

 /**
   * Get assetId
   * @return assetId
  **/
  @JsonProperty("assetId")
  public Long getAssetId() {
    return assetId;
  }

  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }

  public ApplicationConfigResponse assetId(Long assetId) {
    this.assetId = assetId;
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

  public ApplicationConfigResponse returning(String returning) {
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
    ApplicationConfigResponse applicationConfigResponse = (ApplicationConfigResponse) o;
    return Objects.equals(this.valid, applicationConfigResponse.valid) &&
        Objects.equals(this.message, applicationConfigResponse.message) &&
        Objects.equals(this.version, applicationConfigResponse.version) &&
        Objects.equals(this.serializeNulls, applicationConfigResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, applicationConfigResponse.startTimeLog) &&
        Objects.equals(this.errorCode, applicationConfigResponse.errorCode) &&
        Objects.equals(this.request, applicationConfigResponse.request) &&
        Objects.equals(this.configId, applicationConfigResponse.configId) &&
        Objects.equals(this.created, applicationConfigResponse.created) &&
        Objects.equals(this.updated, applicationConfigResponse.updated) &&
        Objects.equals(this.configVersion, applicationConfigResponse.configVersion) &&
        Objects.equals(this.configJson, applicationConfigResponse.configJson) &&
        Objects.equals(this.configJsonURL, applicationConfigResponse.configJsonURL) &&
        Objects.equals(this.assetId, applicationConfigResponse.assetId) &&
        Objects.equals(this.returning, applicationConfigResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, configId, created, updated, configVersion, configJson, configJsonURL, assetId, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationConfigResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    configVersion: ").append(toIndentedString(configVersion)).append("\n");
    sb.append("    configJson: ").append(toIndentedString(configJson)).append("\n");
    sb.append("    configJsonURL: ").append(toIndentedString(configJsonURL)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
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

