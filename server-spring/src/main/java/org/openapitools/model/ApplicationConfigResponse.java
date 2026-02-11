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
 * ApplicationConfigResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ApplicationConfigResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  private @Nullable Long configId;

  private @Nullable Long created;

  private @Nullable Long updated;

  private @Nullable String configVersion;

  private @Nullable String configJson;

  private @Nullable String configJsonURL;

  private @Nullable Long assetId;

  private @Nullable String returning;

  public ApplicationConfigResponse valid(@Nullable Boolean valid) {
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

  public ApplicationConfigResponse message(@Nullable String message) {
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

  public ApplicationConfigResponse version(@Nullable Double version) {
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

  public ApplicationConfigResponse serializeNulls(@Nullable Boolean serializeNulls) {
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

  public ApplicationConfigResponse startTimeLog(@Nullable Long startTimeLog) {
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

  public ApplicationConfigResponse errorCode(@Nullable String errorCode) {
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

  public ApplicationConfigResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ApplicationConfigResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public ApplicationConfigResponse configId(@Nullable Long configId) {
    this.configId = configId;
    return this;
  }

  /**
   * Get configId
   * @return configId
   */
  
  @Schema(name = "configId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configId")
  public @Nullable Long getConfigId() {
    return configId;
  }

  public void setConfigId(@Nullable Long configId) {
    this.configId = configId;
  }

  public ApplicationConfigResponse created(@Nullable Long created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  
  @Schema(name = "created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created")
  public @Nullable Long getCreated() {
    return created;
  }

  public void setCreated(@Nullable Long created) {
    this.created = created;
  }

  public ApplicationConfigResponse updated(@Nullable Long updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
   */
  
  @Schema(name = "updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated")
  public @Nullable Long getUpdated() {
    return updated;
  }

  public void setUpdated(@Nullable Long updated) {
    this.updated = updated;
  }

  public ApplicationConfigResponse configVersion(@Nullable String configVersion) {
    this.configVersion = configVersion;
    return this;
  }

  /**
   * Get configVersion
   * @return configVersion
   */
  
  @Schema(name = "configVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configVersion")
  public @Nullable String getConfigVersion() {
    return configVersion;
  }

  public void setConfigVersion(@Nullable String configVersion) {
    this.configVersion = configVersion;
  }

  public ApplicationConfigResponse configJson(@Nullable String configJson) {
    this.configJson = configJson;
    return this;
  }

  /**
   * Get configJson
   * @return configJson
   */
  
  @Schema(name = "configJson", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configJson")
  public @Nullable String getConfigJson() {
    return configJson;
  }

  public void setConfigJson(@Nullable String configJson) {
    this.configJson = configJson;
  }

  public ApplicationConfigResponse configJsonURL(@Nullable String configJsonURL) {
    this.configJsonURL = configJsonURL;
    return this;
  }

  /**
   * Get configJsonURL
   * @return configJsonURL
   */
  
  @Schema(name = "configJsonURL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configJsonURL")
  public @Nullable String getConfigJsonURL() {
    return configJsonURL;
  }

  public void setConfigJsonURL(@Nullable String configJsonURL) {
    this.configJsonURL = configJsonURL;
  }

  public ApplicationConfigResponse assetId(@Nullable Long assetId) {
    this.assetId = assetId;
    return this;
  }

  /**
   * Get assetId
   * @return assetId
   */
  
  @Schema(name = "assetId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assetId")
  public @Nullable Long getAssetId() {
    return assetId;
  }

  public void setAssetId(@Nullable Long assetId) {
    this.assetId = assetId;
  }

  public ApplicationConfigResponse returning(@Nullable String returning) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

