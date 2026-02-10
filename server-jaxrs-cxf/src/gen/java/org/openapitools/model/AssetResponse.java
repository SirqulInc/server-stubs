package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AssetResponse  {
  
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

  private String display;

  @ApiModelProperty(value = "")

  private String locationDescription;

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse uploader;

  @ApiModelProperty(value = "")

  private Long likesCount;

  @ApiModelProperty(value = "")

  private Integer commentsCount;

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;

  @ApiModelProperty(value = "")

  private String attachedMediaType;

  @ApiModelProperty(value = "")

  private String attachedAssetURL;

  @ApiModelProperty(value = "")

  private Long created;

  @ApiModelProperty(value = "")

  private Long updated;

  @ApiModelProperty(value = "")

  private String searchTags;

  @ApiModelProperty(value = "")

  private String metaData;

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

  public AssetResponse valid(Boolean valid) {
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

  public AssetResponse message(String message) {
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

  public AssetResponse version(Double version) {
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

  public AssetResponse serializeNulls(Boolean serializeNulls) {
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

  public AssetResponse startTimeLog(Long startTimeLog) {
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

  public AssetResponse errorCode(String errorCode) {
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

  public AssetResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public AssetResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public AssetResponse assetId(Long assetId) {
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

  public AssetResponse fileName(String fileName) {
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

  public AssetResponse caption(String caption) {
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

  public AssetResponse mediaType(String mediaType) {
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

  public AssetResponse thumbnailURL(String thumbnailURL) {
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

  public AssetResponse coverURL(String coverURL) {
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

  public AssetResponse fullURL(String fullURL) {
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

  public AssetResponse assetVersion(String assetVersion) {
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

  public AssetResponse versionName(String versionName) {
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

  public AssetResponse versionCode(Integer versionCode) {
    this.versionCode = versionCode;
    return this;
  }

 /**
   * Get display
   * @return display
  **/
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public AssetResponse display(String display) {
    this.display = display;
    return this;
  }

 /**
   * Get locationDescription
   * @return locationDescription
  **/
  @JsonProperty("locationDescription")
  public String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }

  public AssetResponse locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

 /**
   * Get uploader
   * @return uploader
  **/
  @JsonProperty("uploader")
  public AccountShortResponse getUploader() {
    return uploader;
  }

  public void setUploader(AccountShortResponse uploader) {
    this.uploader = uploader;
  }

  public AssetResponse uploader(AccountShortResponse uploader) {
    this.uploader = uploader;
    return this;
  }

 /**
   * Get likesCount
   * @return likesCount
  **/
  @JsonProperty("likesCount")
  public Long getLikesCount() {
    return likesCount;
  }

  public void setLikesCount(Long likesCount) {
    this.likesCount = likesCount;
  }

  public AssetResponse likesCount(Long likesCount) {
    this.likesCount = likesCount;
    return this;
  }

 /**
   * Get commentsCount
   * @return commentsCount
  **/
  @JsonProperty("commentsCount")
  public Integer getCommentsCount() {
    return commentsCount;
  }

  public void setCommentsCount(Integer commentsCount) {
    this.commentsCount = commentsCount;
  }

  public AssetResponse commentsCount(Integer commentsCount) {
    this.commentsCount = commentsCount;
    return this;
  }

 /**
   * Get latitude
   * @return latitude
  **/
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public AssetResponse latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Get longitude
   * @return longitude
  **/
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public AssetResponse longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Get attachedMediaType
   * @return attachedMediaType
  **/
  @JsonProperty("attachedMediaType")
  public String getAttachedMediaType() {
    return attachedMediaType;
  }

  public void setAttachedMediaType(String attachedMediaType) {
    this.attachedMediaType = attachedMediaType;
  }

  public AssetResponse attachedMediaType(String attachedMediaType) {
    this.attachedMediaType = attachedMediaType;
    return this;
  }

 /**
   * Get attachedAssetURL
   * @return attachedAssetURL
  **/
  @JsonProperty("attachedAssetURL")
  public String getAttachedAssetURL() {
    return attachedAssetURL;
  }

  public void setAttachedAssetURL(String attachedAssetURL) {
    this.attachedAssetURL = attachedAssetURL;
  }

  public AssetResponse attachedAssetURL(String attachedAssetURL) {
    this.attachedAssetURL = attachedAssetURL;
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

  public AssetResponse created(Long created) {
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

  public AssetResponse updated(Long updated) {
    this.updated = updated;
    return this;
  }

 /**
   * Get searchTags
   * @return searchTags
  **/
  @JsonProperty("searchTags")
  public String getSearchTags() {
    return searchTags;
  }

  public void setSearchTags(String searchTags) {
    this.searchTags = searchTags;
  }

  public AssetResponse searchTags(String searchTags) {
    this.searchTags = searchTags;
    return this;
  }

 /**
   * Get metaData
   * @return metaData
  **/
  @JsonProperty("metaData")
  public String getMetaData() {
    return metaData;
  }

  public void setMetaData(String metaData) {
    this.metaData = metaData;
  }

  public AssetResponse metaData(String metaData) {
    this.metaData = metaData;
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

  public AssetResponse returning(String returning) {
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
    AssetResponse assetResponse = (AssetResponse) o;
    return Objects.equals(this.valid, assetResponse.valid) &&
        Objects.equals(this.message, assetResponse.message) &&
        Objects.equals(this.version, assetResponse.version) &&
        Objects.equals(this.serializeNulls, assetResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, assetResponse.startTimeLog) &&
        Objects.equals(this.errorCode, assetResponse.errorCode) &&
        Objects.equals(this.request, assetResponse.request) &&
        Objects.equals(this.assetId, assetResponse.assetId) &&
        Objects.equals(this.fileName, assetResponse.fileName) &&
        Objects.equals(this.caption, assetResponse.caption) &&
        Objects.equals(this.mediaType, assetResponse.mediaType) &&
        Objects.equals(this.thumbnailURL, assetResponse.thumbnailURL) &&
        Objects.equals(this.coverURL, assetResponse.coverURL) &&
        Objects.equals(this.fullURL, assetResponse.fullURL) &&
        Objects.equals(this.assetVersion, assetResponse.assetVersion) &&
        Objects.equals(this.versionName, assetResponse.versionName) &&
        Objects.equals(this.versionCode, assetResponse.versionCode) &&
        Objects.equals(this.display, assetResponse.display) &&
        Objects.equals(this.locationDescription, assetResponse.locationDescription) &&
        Objects.equals(this.uploader, assetResponse.uploader) &&
        Objects.equals(this.likesCount, assetResponse.likesCount) &&
        Objects.equals(this.commentsCount, assetResponse.commentsCount) &&
        Objects.equals(this.latitude, assetResponse.latitude) &&
        Objects.equals(this.longitude, assetResponse.longitude) &&
        Objects.equals(this.attachedMediaType, assetResponse.attachedMediaType) &&
        Objects.equals(this.attachedAssetURL, assetResponse.attachedAssetURL) &&
        Objects.equals(this.created, assetResponse.created) &&
        Objects.equals(this.updated, assetResponse.updated) &&
        Objects.equals(this.searchTags, assetResponse.searchTags) &&
        Objects.equals(this.metaData, assetResponse.metaData) &&
        Objects.equals(this.returning, assetResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, assetId, fileName, caption, mediaType, thumbnailURL, coverURL, fullURL, assetVersion, versionName, versionCode, display, locationDescription, uploader, likesCount, commentsCount, latitude, longitude, attachedMediaType, attachedAssetURL, created, updated, searchTags, metaData, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetResponse {\n");
    
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
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    uploader: ").append(toIndentedString(uploader)).append("\n");
    sb.append("    likesCount: ").append(toIndentedString(likesCount)).append("\n");
    sb.append("    commentsCount: ").append(toIndentedString(commentsCount)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    attachedMediaType: ").append(toIndentedString(attachedMediaType)).append("\n");
    sb.append("    attachedAssetURL: ").append(toIndentedString(attachedAssetURL)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    searchTags: ").append(toIndentedString(searchTags)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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

