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


public class AssetShortResponse  {
  
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

  private Long assetId;

  @ApiModelProperty(value = "")

  private String fileName;

  @ApiModelProperty(value = "")

  private String caption;

  @ApiModelProperty(value = "")

  private String mediaType;

  @ApiModelProperty(value = "")

  private String thumbnailURL;

  @ApiModelProperty(value = "")

  private String coverURL;

  @ApiModelProperty(value = "")

  private String fullURL;

  @ApiModelProperty(value = "")

  private String assetVersion;

  @ApiModelProperty(value = "")

  private String versionName;

  @ApiModelProperty(value = "")

  private Integer versionCode;

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

  public AssetShortResponse valid(Boolean valid) {
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

  public AssetShortResponse message(String message) {
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

  public AssetShortResponse version(Double version) {
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

  public AssetShortResponse serializeNulls(Boolean serializeNulls) {
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

  public AssetShortResponse startTimeLog(Long startTimeLog) {
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

  public AssetShortResponse errorCode(String errorCode) {
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

  public AssetShortResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public AssetShortResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
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

  public AssetShortResponse assetId(Long assetId) {
    this.assetId = assetId;
    return this;
  }

 /**
   * Get fileName
   * @return fileName
  **/
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public AssetShortResponse fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

 /**
   * Get caption
   * @return caption
  **/
  @JsonProperty("caption")
  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public AssetShortResponse caption(String caption) {
    this.caption = caption;
    return this;
  }

 /**
   * Get mediaType
   * @return mediaType
  **/
  @JsonProperty("mediaType")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public AssetShortResponse mediaType(String mediaType) {
    this.mediaType = mediaType;
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

  public AssetShortResponse thumbnailURL(String thumbnailURL) {
    this.thumbnailURL = thumbnailURL;
    return this;
  }

 /**
   * Get coverURL
   * @return coverURL
  **/
  @JsonProperty("coverURL")
  public String getCoverURL() {
    return coverURL;
  }

  public void setCoverURL(String coverURL) {
    this.coverURL = coverURL;
  }

  public AssetShortResponse coverURL(String coverURL) {
    this.coverURL = coverURL;
    return this;
  }

 /**
   * Get fullURL
   * @return fullURL
  **/
  @JsonProperty("fullURL")
  public String getFullURL() {
    return fullURL;
  }

  public void setFullURL(String fullURL) {
    this.fullURL = fullURL;
  }

  public AssetShortResponse fullURL(String fullURL) {
    this.fullURL = fullURL;
    return this;
  }

 /**
   * Get assetVersion
   * @return assetVersion
  **/
  @JsonProperty("assetVersion")
  public String getAssetVersion() {
    return assetVersion;
  }

  public void setAssetVersion(String assetVersion) {
    this.assetVersion = assetVersion;
  }

  public AssetShortResponse assetVersion(String assetVersion) {
    this.assetVersion = assetVersion;
    return this;
  }

 /**
   * Get versionName
   * @return versionName
  **/
  @JsonProperty("versionName")
  public String getVersionName() {
    return versionName;
  }

  public void setVersionName(String versionName) {
    this.versionName = versionName;
  }

  public AssetShortResponse versionName(String versionName) {
    this.versionName = versionName;
    return this;
  }

 /**
   * Get versionCode
   * @return versionCode
  **/
  @JsonProperty("versionCode")
  public Integer getVersionCode() {
    return versionCode;
  }

  public void setVersionCode(Integer versionCode) {
    this.versionCode = versionCode;
  }

  public AssetShortResponse versionCode(Integer versionCode) {
    this.versionCode = versionCode;
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

  public AssetShortResponse returning(String returning) {
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
    AssetShortResponse assetShortResponse = (AssetShortResponse) o;
    return Objects.equals(this.valid, assetShortResponse.valid) &&
        Objects.equals(this.message, assetShortResponse.message) &&
        Objects.equals(this.version, assetShortResponse.version) &&
        Objects.equals(this.serializeNulls, assetShortResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, assetShortResponse.startTimeLog) &&
        Objects.equals(this.errorCode, assetShortResponse.errorCode) &&
        Objects.equals(this.request, assetShortResponse.request) &&
        Objects.equals(this.assetId, assetShortResponse.assetId) &&
        Objects.equals(this.fileName, assetShortResponse.fileName) &&
        Objects.equals(this.caption, assetShortResponse.caption) &&
        Objects.equals(this.mediaType, assetShortResponse.mediaType) &&
        Objects.equals(this.thumbnailURL, assetShortResponse.thumbnailURL) &&
        Objects.equals(this.coverURL, assetShortResponse.coverURL) &&
        Objects.equals(this.fullURL, assetShortResponse.fullURL) &&
        Objects.equals(this.assetVersion, assetShortResponse.assetVersion) &&
        Objects.equals(this.versionName, assetShortResponse.versionName) &&
        Objects.equals(this.versionCode, assetShortResponse.versionCode) &&
        Objects.equals(this.returning, assetShortResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, assetId, fileName, caption, mediaType, thumbnailURL, coverURL, fullURL, assetVersion, versionName, versionCode, returning);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

