package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ApplicationConfigResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private Long configId;
  private Long created;
  private Long updated;
  private String configVersion;
  private String configJson;
  private String configJsonURL;
  private Long assetId;
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
  @JsonProperty("configId")
  public Long getConfigId() {
    return configId;
  }
  public void setConfigId(Long configId) {
    this.configId = configId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }
  public void setCreated(Long created) {
    this.created = created;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }
  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("configVersion")
  public String getConfigVersion() {
    return configVersion;
  }
  public void setConfigVersion(String configVersion) {
    this.configVersion = configVersion;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("configJson")
  public String getConfigJson() {
    return configJson;
  }
  public void setConfigJson(String configJson) {
    this.configJson = configJson;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("configJsonURL")
  public String getConfigJsonURL() {
    return configJsonURL;
  }
  public void setConfigJsonURL(String configJsonURL) {
    this.configJsonURL = configJsonURL;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("assetId")
  public Long getAssetId() {
    return assetId;
  }
  public void setAssetId(Long assetId) {
    this.assetId = assetId;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

