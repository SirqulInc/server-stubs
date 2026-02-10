package apimodels;

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
 * ApplicationConfigResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ApplicationConfigResponse   {
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

  @JsonProperty("configId")
  
  private Long configId;

  @JsonProperty("created")
  
  private Long created;

  @JsonProperty("updated")
  
  private Long updated;

  @JsonProperty("configVersion")
  
  private String configVersion;

  @JsonProperty("configJson")
  
  private String configJson;

  @JsonProperty("configJsonURL")
  
  private String configJsonURL;

  @JsonProperty("assetId")
  
  private Long assetId;

  @JsonProperty("returning")
  
  private String returning;

  public ApplicationConfigResponse valid(Boolean valid) {
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

  public ApplicationConfigResponse message(String message) {
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

  public ApplicationConfigResponse version(Double version) {
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

  public ApplicationConfigResponse serializeNulls(Boolean serializeNulls) {
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

  public ApplicationConfigResponse startTimeLog(Long startTimeLog) {
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

  public ApplicationConfigResponse errorCode(String errorCode) {
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
  **/
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public ApplicationConfigResponse configId(Long configId) {
    this.configId = configId;
    return this;
  }

   /**
   * Get configId
   * @return configId
  **/
  public Long getConfigId() {
    return configId;
  }

  public void setConfigId(Long configId) {
    this.configId = configId;
  }

  public ApplicationConfigResponse created(Long created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public ApplicationConfigResponse updated(Long updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  public ApplicationConfigResponse configVersion(String configVersion) {
    this.configVersion = configVersion;
    return this;
  }

   /**
   * Get configVersion
   * @return configVersion
  **/
  public String getConfigVersion() {
    return configVersion;
  }

  public void setConfigVersion(String configVersion) {
    this.configVersion = configVersion;
  }

  public ApplicationConfigResponse configJson(String configJson) {
    this.configJson = configJson;
    return this;
  }

   /**
   * Get configJson
   * @return configJson
  **/
  public String getConfigJson() {
    return configJson;
  }

  public void setConfigJson(String configJson) {
    this.configJson = configJson;
  }

  public ApplicationConfigResponse configJsonURL(String configJsonURL) {
    this.configJsonURL = configJsonURL;
    return this;
  }

   /**
   * Get configJsonURL
   * @return configJsonURL
  **/
  public String getConfigJsonURL() {
    return configJsonURL;
  }

  public void setConfigJsonURL(String configJsonURL) {
    this.configJsonURL = configJsonURL;
  }

  public ApplicationConfigResponse assetId(Long assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Get assetId
   * @return assetId
  **/
  public Long getAssetId() {
    return assetId;
  }

  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }

  public ApplicationConfigResponse returning(String returning) {
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
    ApplicationConfigResponse applicationConfigResponse = (ApplicationConfigResponse) o;
    return Objects.equals(valid, applicationConfigResponse.valid) &&
        Objects.equals(message, applicationConfigResponse.message) &&
        Objects.equals(version, applicationConfigResponse.version) &&
        Objects.equals(serializeNulls, applicationConfigResponse.serializeNulls) &&
        Objects.equals(startTimeLog, applicationConfigResponse.startTimeLog) &&
        Objects.equals(errorCode, applicationConfigResponse.errorCode) &&
        Objects.equals(request, applicationConfigResponse.request) &&
        Objects.equals(configId, applicationConfigResponse.configId) &&
        Objects.equals(created, applicationConfigResponse.created) &&
        Objects.equals(updated, applicationConfigResponse.updated) &&
        Objects.equals(configVersion, applicationConfigResponse.configVersion) &&
        Objects.equals(configJson, applicationConfigResponse.configJson) &&
        Objects.equals(configJsonURL, applicationConfigResponse.configJsonURL) &&
        Objects.equals(assetId, applicationConfigResponse.assetId) &&
        Objects.equals(returning, applicationConfigResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, configId, created, updated, configVersion, configJson, configJsonURL, assetId, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

