package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
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
 * AssetResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AssetResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  private @Nullable Long assetId;

  private @Nullable String fileName;

  private @Nullable String caption;

  private @Nullable String mediaType;

  private @Nullable String thumbnailURL;

  private @Nullable String coverURL;

  private @Nullable String fullURL;

  private @Nullable String assetVersion;

  private @Nullable String versionName;

  private @Nullable Integer versionCode;

  private @Nullable String display;

  private @Nullable String locationDescription;

  private @Nullable AccountShortResponse uploader;

  private @Nullable Long likesCount;

  private @Nullable Integer commentsCount;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable String attachedMediaType;

  private @Nullable String attachedAssetURL;

  private @Nullable Long created;

  private @Nullable Long updated;

  private @Nullable String searchTags;

  private @Nullable String metaData;

  private @Nullable String returning;

  public AssetResponse valid(@Nullable Boolean valid) {
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

  public AssetResponse message(@Nullable String message) {
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

  public AssetResponse version(@Nullable Double version) {
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

  public AssetResponse serializeNulls(@Nullable Boolean serializeNulls) {
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

  public AssetResponse startTimeLog(@Nullable Long startTimeLog) {
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

  public AssetResponse errorCode(@Nullable String errorCode) {
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

  public AssetResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public AssetResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public AssetResponse assetId(@Nullable Long assetId) {
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

  public AssetResponse fileName(@Nullable String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * @return fileName
   */
  
  @Schema(name = "fileName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fileName")
  public @Nullable String getFileName() {
    return fileName;
  }

  public void setFileName(@Nullable String fileName) {
    this.fileName = fileName;
  }

  public AssetResponse caption(@Nullable String caption) {
    this.caption = caption;
    return this;
  }

  /**
   * Get caption
   * @return caption
   */
  
  @Schema(name = "caption", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caption")
  public @Nullable String getCaption() {
    return caption;
  }

  public void setCaption(@Nullable String caption) {
    this.caption = caption;
  }

  public AssetResponse mediaType(@Nullable String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * Get mediaType
   * @return mediaType
   */
  
  @Schema(name = "mediaType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mediaType")
  public @Nullable String getMediaType() {
    return mediaType;
  }

  public void setMediaType(@Nullable String mediaType) {
    this.mediaType = mediaType;
  }

  public AssetResponse thumbnailURL(@Nullable String thumbnailURL) {
    this.thumbnailURL = thumbnailURL;
    return this;
  }

  /**
   * Get thumbnailURL
   * @return thumbnailURL
   */
  
  @Schema(name = "thumbnailURL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thumbnailURL")
  public @Nullable String getThumbnailURL() {
    return thumbnailURL;
  }

  public void setThumbnailURL(@Nullable String thumbnailURL) {
    this.thumbnailURL = thumbnailURL;
  }

  public AssetResponse coverURL(@Nullable String coverURL) {
    this.coverURL = coverURL;
    return this;
  }

  /**
   * Get coverURL
   * @return coverURL
   */
  
  @Schema(name = "coverURL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("coverURL")
  public @Nullable String getCoverURL() {
    return coverURL;
  }

  public void setCoverURL(@Nullable String coverURL) {
    this.coverURL = coverURL;
  }

  public AssetResponse fullURL(@Nullable String fullURL) {
    this.fullURL = fullURL;
    return this;
  }

  /**
   * Get fullURL
   * @return fullURL
   */
  
  @Schema(name = "fullURL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fullURL")
  public @Nullable String getFullURL() {
    return fullURL;
  }

  public void setFullURL(@Nullable String fullURL) {
    this.fullURL = fullURL;
  }

  public AssetResponse assetVersion(@Nullable String assetVersion) {
    this.assetVersion = assetVersion;
    return this;
  }

  /**
   * Get assetVersion
   * @return assetVersion
   */
  
  @Schema(name = "assetVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assetVersion")
  public @Nullable String getAssetVersion() {
    return assetVersion;
  }

  public void setAssetVersion(@Nullable String assetVersion) {
    this.assetVersion = assetVersion;
  }

  public AssetResponse versionName(@Nullable String versionName) {
    this.versionName = versionName;
    return this;
  }

  /**
   * Get versionName
   * @return versionName
   */
  
  @Schema(name = "versionName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionName")
  public @Nullable String getVersionName() {
    return versionName;
  }

  public void setVersionName(@Nullable String versionName) {
    this.versionName = versionName;
  }

  public AssetResponse versionCode(@Nullable Integer versionCode) {
    this.versionCode = versionCode;
    return this;
  }

  /**
   * Get versionCode
   * @return versionCode
   */
  
  @Schema(name = "versionCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionCode")
  public @Nullable Integer getVersionCode() {
    return versionCode;
  }

  public void setVersionCode(@Nullable Integer versionCode) {
    this.versionCode = versionCode;
  }

  public AssetResponse display(@Nullable String display) {
    this.display = display;
    return this;
  }

  /**
   * Get display
   * @return display
   */
  
  @Schema(name = "display", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display")
  public @Nullable String getDisplay() {
    return display;
  }

  public void setDisplay(@Nullable String display) {
    this.display = display;
  }

  public AssetResponse locationDescription(@Nullable String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

  /**
   * Get locationDescription
   * @return locationDescription
   */
  
  @Schema(name = "locationDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationDescription")
  public @Nullable String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(@Nullable String locationDescription) {
    this.locationDescription = locationDescription;
  }

  public AssetResponse uploader(@Nullable AccountShortResponse uploader) {
    this.uploader = uploader;
    return this;
  }

  /**
   * Get uploader
   * @return uploader
   */
  @Valid 
  @Schema(name = "uploader", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uploader")
  public @Nullable AccountShortResponse getUploader() {
    return uploader;
  }

  public void setUploader(@Nullable AccountShortResponse uploader) {
    this.uploader = uploader;
  }

  public AssetResponse likesCount(@Nullable Long likesCount) {
    this.likesCount = likesCount;
    return this;
  }

  /**
   * Get likesCount
   * @return likesCount
   */
  
  @Schema(name = "likesCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("likesCount")
  public @Nullable Long getLikesCount() {
    return likesCount;
  }

  public void setLikesCount(@Nullable Long likesCount) {
    this.likesCount = likesCount;
  }

  public AssetResponse commentsCount(@Nullable Integer commentsCount) {
    this.commentsCount = commentsCount;
    return this;
  }

  /**
   * Get commentsCount
   * @return commentsCount
   */
  
  @Schema(name = "commentsCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commentsCount")
  public @Nullable Integer getCommentsCount() {
    return commentsCount;
  }

  public void setCommentsCount(@Nullable Integer commentsCount) {
    this.commentsCount = commentsCount;
  }

  public AssetResponse latitude(@Nullable Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   */
  
  @Schema(name = "latitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public @Nullable Double getLatitude() {
    return latitude;
  }

  public void setLatitude(@Nullable Double latitude) {
    this.latitude = latitude;
  }

  public AssetResponse longitude(@Nullable Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
   */
  
  @Schema(name = "longitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public @Nullable Double getLongitude() {
    return longitude;
  }

  public void setLongitude(@Nullable Double longitude) {
    this.longitude = longitude;
  }

  public AssetResponse attachedMediaType(@Nullable String attachedMediaType) {
    this.attachedMediaType = attachedMediaType;
    return this;
  }

  /**
   * Get attachedMediaType
   * @return attachedMediaType
   */
  
  @Schema(name = "attachedMediaType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attachedMediaType")
  public @Nullable String getAttachedMediaType() {
    return attachedMediaType;
  }

  public void setAttachedMediaType(@Nullable String attachedMediaType) {
    this.attachedMediaType = attachedMediaType;
  }

  public AssetResponse attachedAssetURL(@Nullable String attachedAssetURL) {
    this.attachedAssetURL = attachedAssetURL;
    return this;
  }

  /**
   * Get attachedAssetURL
   * @return attachedAssetURL
   */
  
  @Schema(name = "attachedAssetURL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attachedAssetURL")
  public @Nullable String getAttachedAssetURL() {
    return attachedAssetURL;
  }

  public void setAttachedAssetURL(@Nullable String attachedAssetURL) {
    this.attachedAssetURL = attachedAssetURL;
  }

  public AssetResponse created(@Nullable Long created) {
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

  public AssetResponse updated(@Nullable Long updated) {
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

  public AssetResponse searchTags(@Nullable String searchTags) {
    this.searchTags = searchTags;
    return this;
  }

  /**
   * Get searchTags
   * @return searchTags
   */
  
  @Schema(name = "searchTags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("searchTags")
  public @Nullable String getSearchTags() {
    return searchTags;
  }

  public void setSearchTags(@Nullable String searchTags) {
    this.searchTags = searchTags;
  }

  public AssetResponse metaData(@Nullable String metaData) {
    this.metaData = metaData;
    return this;
  }

  /**
   * Get metaData
   * @return metaData
   */
  
  @Schema(name = "metaData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metaData")
  public @Nullable String getMetaData() {
    return metaData;
  }

  public void setMetaData(@Nullable String metaData) {
    this.metaData = metaData;
  }

  public AssetResponse returning(@Nullable String returning) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

