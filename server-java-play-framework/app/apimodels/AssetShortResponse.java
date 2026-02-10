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
 * AssetShortResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AssetShortResponse   {
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

  @JsonProperty("assetId")
  
  private Long assetId;

  @JsonProperty("fileName")
  
  private String fileName;

  @JsonProperty("caption")
  
  private String caption;

  @JsonProperty("mediaType")
  
  private String mediaType;

  @JsonProperty("thumbnailURL")
  
  private String thumbnailURL;

  @JsonProperty("coverURL")
  
  private String coverURL;

  @JsonProperty("fullURL")
  
  private String fullURL;

  @JsonProperty("assetVersion")
  
  private String assetVersion;

  @JsonProperty("versionName")
  
  private String versionName;

  @JsonProperty("versionCode")
  
  private Integer versionCode;

  @JsonProperty("returning")
  
  private String returning;

  public AssetShortResponse valid(Boolean valid) {
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

  public AssetShortResponse message(String message) {
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

  public AssetShortResponse version(Double version) {
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

  public AssetShortResponse serializeNulls(Boolean serializeNulls) {
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

  public AssetShortResponse startTimeLog(Long startTimeLog) {
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

  public AssetShortResponse errorCode(String errorCode) {
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

  public AssetShortResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public AssetShortResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public AssetShortResponse assetId(Long assetId) {
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

  public AssetShortResponse fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public AssetShortResponse caption(String caption) {
    this.caption = caption;
    return this;
  }

   /**
   * Get caption
   * @return caption
  **/
  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public AssetShortResponse mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public AssetShortResponse thumbnailURL(String thumbnailURL) {
    this.thumbnailURL = thumbnailURL;
    return this;
  }

   /**
   * Get thumbnailURL
   * @return thumbnailURL
  **/
  public String getThumbnailURL() {
    return thumbnailURL;
  }

  public void setThumbnailURL(String thumbnailURL) {
    this.thumbnailURL = thumbnailURL;
  }

  public AssetShortResponse coverURL(String coverURL) {
    this.coverURL = coverURL;
    return this;
  }

   /**
   * Get coverURL
   * @return coverURL
  **/
  public String getCoverURL() {
    return coverURL;
  }

  public void setCoverURL(String coverURL) {
    this.coverURL = coverURL;
  }

  public AssetShortResponse fullURL(String fullURL) {
    this.fullURL = fullURL;
    return this;
  }

   /**
   * Get fullURL
   * @return fullURL
  **/
  public String getFullURL() {
    return fullURL;
  }

  public void setFullURL(String fullURL) {
    this.fullURL = fullURL;
  }

  public AssetShortResponse assetVersion(String assetVersion) {
    this.assetVersion = assetVersion;
    return this;
  }

   /**
   * Get assetVersion
   * @return assetVersion
  **/
  public String getAssetVersion() {
    return assetVersion;
  }

  public void setAssetVersion(String assetVersion) {
    this.assetVersion = assetVersion;
  }

  public AssetShortResponse versionName(String versionName) {
    this.versionName = versionName;
    return this;
  }

   /**
   * Get versionName
   * @return versionName
  **/
  public String getVersionName() {
    return versionName;
  }

  public void setVersionName(String versionName) {
    this.versionName = versionName;
  }

  public AssetShortResponse versionCode(Integer versionCode) {
    this.versionCode = versionCode;
    return this;
  }

   /**
   * Get versionCode
   * @return versionCode
  **/
  public Integer getVersionCode() {
    return versionCode;
  }

  public void setVersionCode(Integer versionCode) {
    this.versionCode = versionCode;
  }

  public AssetShortResponse returning(String returning) {
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
    AssetShortResponse assetShortResponse = (AssetShortResponse) o;
    return Objects.equals(valid, assetShortResponse.valid) &&
        Objects.equals(message, assetShortResponse.message) &&
        Objects.equals(version, assetShortResponse.version) &&
        Objects.equals(serializeNulls, assetShortResponse.serializeNulls) &&
        Objects.equals(startTimeLog, assetShortResponse.startTimeLog) &&
        Objects.equals(errorCode, assetShortResponse.errorCode) &&
        Objects.equals(request, assetShortResponse.request) &&
        Objects.equals(assetId, assetShortResponse.assetId) &&
        Objects.equals(fileName, assetShortResponse.fileName) &&
        Objects.equals(caption, assetShortResponse.caption) &&
        Objects.equals(mediaType, assetShortResponse.mediaType) &&
        Objects.equals(thumbnailURL, assetShortResponse.thumbnailURL) &&
        Objects.equals(coverURL, assetShortResponse.coverURL) &&
        Objects.equals(fullURL, assetShortResponse.fullURL) &&
        Objects.equals(assetVersion, assetShortResponse.assetVersion) &&
        Objects.equals(versionName, assetShortResponse.versionName) &&
        Objects.equals(versionCode, assetShortResponse.versionCode) &&
        Objects.equals(returning, assetShortResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, assetId, fileName, caption, mediaType, thumbnailURL, coverURL, fullURL, assetVersion, versionName, versionCode, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetShortResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    thumbnailURL: ").append(toIndentedString(thumbnailURL)).append("\n");
    sb.append("    coverURL: ").append(toIndentedString(coverURL)).append("\n");
    sb.append("    fullURL: ").append(toIndentedString(fullURL)).append("\n");
    sb.append("    assetVersion: ").append(toIndentedString(assetVersion)).append("\n");
    sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
    sb.append("    versionCode: ").append(toIndentedString(versionCode)).append("\n");
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

