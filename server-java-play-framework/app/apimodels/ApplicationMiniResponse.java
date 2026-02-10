package apimodels;

import apimodels.AssetShortResponse;
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
 * ApplicationMiniResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ApplicationMiniResponse   {
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

  @JsonProperty("applicationId")
  
  private Long applicationId;

  @JsonProperty("appKey")
  
  private String appKey;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("currentBuildVersion")
  
  private String currentBuildVersion;

  @JsonProperty("currentApiVersion")
  
  private String currentApiVersion;

  @JsonProperty("appIcon")
  @Valid

  private AssetShortResponse appIcon;

  @JsonProperty("appLogo")
  @Valid

  private AssetShortResponse appLogo;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("returning")
  
  private String returning;

  public ApplicationMiniResponse valid(Boolean valid) {
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

  public ApplicationMiniResponse message(String message) {
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

  public ApplicationMiniResponse version(Double version) {
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

  public ApplicationMiniResponse serializeNulls(Boolean serializeNulls) {
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

  public ApplicationMiniResponse startTimeLog(Long startTimeLog) {
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

  public ApplicationMiniResponse errorCode(String errorCode) {
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

  public ApplicationMiniResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ApplicationMiniResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public ApplicationMiniResponse applicationId(Long applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Get applicationId
   * @return applicationId
  **/
  public Long getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }

  public ApplicationMiniResponse appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

   /**
   * Get appKey
   * @return appKey
  **/
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public ApplicationMiniResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ApplicationMiniResponse currentBuildVersion(String currentBuildVersion) {
    this.currentBuildVersion = currentBuildVersion;
    return this;
  }

   /**
   * Get currentBuildVersion
   * @return currentBuildVersion
  **/
  public String getCurrentBuildVersion() {
    return currentBuildVersion;
  }

  public void setCurrentBuildVersion(String currentBuildVersion) {
    this.currentBuildVersion = currentBuildVersion;
  }

  public ApplicationMiniResponse currentApiVersion(String currentApiVersion) {
    this.currentApiVersion = currentApiVersion;
    return this;
  }

   /**
   * Get currentApiVersion
   * @return currentApiVersion
  **/
  public String getCurrentApiVersion() {
    return currentApiVersion;
  }

  public void setCurrentApiVersion(String currentApiVersion) {
    this.currentApiVersion = currentApiVersion;
  }

  public ApplicationMiniResponse appIcon(AssetShortResponse appIcon) {
    this.appIcon = appIcon;
    return this;
  }

   /**
   * Get appIcon
   * @return appIcon
  **/
  public AssetShortResponse getAppIcon() {
    return appIcon;
  }

  public void setAppIcon(AssetShortResponse appIcon) {
    this.appIcon = appIcon;
  }

  public ApplicationMiniResponse appLogo(AssetShortResponse appLogo) {
    this.appLogo = appLogo;
    return this;
  }

   /**
   * Get appLogo
   * @return appLogo
  **/
  public AssetShortResponse getAppLogo() {
    return appLogo;
  }

  public void setAppLogo(AssetShortResponse appLogo) {
    this.appLogo = appLogo;
  }

  public ApplicationMiniResponse active(Boolean active) {
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

  public ApplicationMiniResponse returning(String returning) {
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
    ApplicationMiniResponse applicationMiniResponse = (ApplicationMiniResponse) o;
    return Objects.equals(valid, applicationMiniResponse.valid) &&
        Objects.equals(message, applicationMiniResponse.message) &&
        Objects.equals(version, applicationMiniResponse.version) &&
        Objects.equals(serializeNulls, applicationMiniResponse.serializeNulls) &&
        Objects.equals(startTimeLog, applicationMiniResponse.startTimeLog) &&
        Objects.equals(errorCode, applicationMiniResponse.errorCode) &&
        Objects.equals(request, applicationMiniResponse.request) &&
        Objects.equals(applicationId, applicationMiniResponse.applicationId) &&
        Objects.equals(appKey, applicationMiniResponse.appKey) &&
        Objects.equals(title, applicationMiniResponse.title) &&
        Objects.equals(currentBuildVersion, applicationMiniResponse.currentBuildVersion) &&
        Objects.equals(currentApiVersion, applicationMiniResponse.currentApiVersion) &&
        Objects.equals(appIcon, applicationMiniResponse.appIcon) &&
        Objects.equals(appLogo, applicationMiniResponse.appLogo) &&
        Objects.equals(active, applicationMiniResponse.active) &&
        Objects.equals(returning, applicationMiniResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, applicationId, appKey, title, currentBuildVersion, currentApiVersion, appIcon, appLogo, active, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationMiniResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    currentBuildVersion: ").append(toIndentedString(currentBuildVersion)).append("\n");
    sb.append("    currentApiVersion: ").append(toIndentedString(currentApiVersion)).append("\n");
    sb.append("    appIcon: ").append(toIndentedString(appIcon)).append("\n");
    sb.append("    appLogo: ").append(toIndentedString(appLogo)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

