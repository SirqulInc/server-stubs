package apimodels;

import apimodels.AccountShortResponse;
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
 * AssetResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AssetResponse   {
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

  @JsonProperty("display")
  
  private String display;

  @JsonProperty("locationDescription")
  
  private String locationDescription;

  @JsonProperty("uploader")
  @Valid

  private AccountShortResponse uploader;

  @JsonProperty("likesCount")
  
  private Long likesCount;

  @JsonProperty("commentsCount")
  
  private Integer commentsCount;

  @JsonProperty("latitude")
  
  private Double latitude;

  @JsonProperty("longitude")
  
  private Double longitude;

  @JsonProperty("attachedMediaType")
  
  private String attachedMediaType;

  @JsonProperty("attachedAssetURL")
  
  private String attachedAssetURL;

  @JsonProperty("created")
  
  private Long created;

  @JsonProperty("updated")
  
  private Long updated;

  @JsonProperty("searchTags")
  
  private String searchTags;

  @JsonProperty("metaData")
  
  private String metaData;

  @JsonProperty("returning")
  
  private String returning;

  public AssetResponse valid(Boolean valid) {
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

  public AssetResponse message(String message) {
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

  public AssetResponse version(Double version) {
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

  public AssetResponse serializeNulls(Boolean serializeNulls) {
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

  public AssetResponse startTimeLog(Long startTimeLog) {
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

  public AssetResponse errorCode(String errorCode) {
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
  **/
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public AssetResponse assetId(Long assetId) {
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

  public AssetResponse fileName(String fileName) {
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

  public AssetResponse caption(String caption) {
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

  public AssetResponse mediaType(String mediaType) {
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

  public AssetResponse thumbnailURL(String thumbnailURL) {
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

  public AssetResponse coverURL(String coverURL) {
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

  public AssetResponse fullURL(String fullURL) {
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

  public AssetResponse assetVersion(String assetVersion) {
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

  public AssetResponse versionName(String versionName) {
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

  public AssetResponse versionCode(Integer versionCode) {
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

  public AssetResponse display(String display) {
    this.display = display;
    return this;
  }

   /**
   * Get display
   * @return display
  **/
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public AssetResponse locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

   /**
   * Get locationDescription
   * @return locationDescription
  **/
  public String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }

  public AssetResponse uploader(AccountShortResponse uploader) {
    this.uploader = uploader;
    return this;
  }

   /**
   * Get uploader
   * @return uploader
  **/
  public AccountShortResponse getUploader() {
    return uploader;
  }

  public void setUploader(AccountShortResponse uploader) {
    this.uploader = uploader;
  }

  public AssetResponse likesCount(Long likesCount) {
    this.likesCount = likesCount;
    return this;
  }

   /**
   * Get likesCount
   * @return likesCount
  **/
  public Long getLikesCount() {
    return likesCount;
  }

  public void setLikesCount(Long likesCount) {
    this.likesCount = likesCount;
  }

  public AssetResponse commentsCount(Integer commentsCount) {
    this.commentsCount = commentsCount;
    return this;
  }

   /**
   * Get commentsCount
   * @return commentsCount
  **/
  public Integer getCommentsCount() {
    return commentsCount;
  }

  public void setCommentsCount(Integer commentsCount) {
    this.commentsCount = commentsCount;
  }

  public AssetResponse latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public AssetResponse longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public AssetResponse attachedMediaType(String attachedMediaType) {
    this.attachedMediaType = attachedMediaType;
    return this;
  }

   /**
   * Get attachedMediaType
   * @return attachedMediaType
  **/
  public String getAttachedMediaType() {
    return attachedMediaType;
  }

  public void setAttachedMediaType(String attachedMediaType) {
    this.attachedMediaType = attachedMediaType;
  }

  public AssetResponse attachedAssetURL(String attachedAssetURL) {
    this.attachedAssetURL = attachedAssetURL;
    return this;
  }

   /**
   * Get attachedAssetURL
   * @return attachedAssetURL
  **/
  public String getAttachedAssetURL() {
    return attachedAssetURL;
  }

  public void setAttachedAssetURL(String attachedAssetURL) {
    this.attachedAssetURL = attachedAssetURL;
  }

  public AssetResponse created(Long created) {
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

  public AssetResponse updated(Long updated) {
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

  public AssetResponse searchTags(String searchTags) {
    this.searchTags = searchTags;
    return this;
  }

   /**
   * Get searchTags
   * @return searchTags
  **/
  public String getSearchTags() {
    return searchTags;
  }

  public void setSearchTags(String searchTags) {
    this.searchTags = searchTags;
  }

  public AssetResponse metaData(String metaData) {
    this.metaData = metaData;
    return this;
  }

   /**
   * Get metaData
   * @return metaData
  **/
  public String getMetaData() {
    return metaData;
  }

  public void setMetaData(String metaData) {
    this.metaData = metaData;
  }

  public AssetResponse returning(String returning) {
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
    AssetResponse assetResponse = (AssetResponse) o;
    return Objects.equals(valid, assetResponse.valid) &&
        Objects.equals(message, assetResponse.message) &&
        Objects.equals(version, assetResponse.version) &&
        Objects.equals(serializeNulls, assetResponse.serializeNulls) &&
        Objects.equals(startTimeLog, assetResponse.startTimeLog) &&
        Objects.equals(errorCode, assetResponse.errorCode) &&
        Objects.equals(request, assetResponse.request) &&
        Objects.equals(assetId, assetResponse.assetId) &&
        Objects.equals(fileName, assetResponse.fileName) &&
        Objects.equals(caption, assetResponse.caption) &&
        Objects.equals(mediaType, assetResponse.mediaType) &&
        Objects.equals(thumbnailURL, assetResponse.thumbnailURL) &&
        Objects.equals(coverURL, assetResponse.coverURL) &&
        Objects.equals(fullURL, assetResponse.fullURL) &&
        Objects.equals(assetVersion, assetResponse.assetVersion) &&
        Objects.equals(versionName, assetResponse.versionName) &&
        Objects.equals(versionCode, assetResponse.versionCode) &&
        Objects.equals(display, assetResponse.display) &&
        Objects.equals(locationDescription, assetResponse.locationDescription) &&
        Objects.equals(uploader, assetResponse.uploader) &&
        Objects.equals(likesCount, assetResponse.likesCount) &&
        Objects.equals(commentsCount, assetResponse.commentsCount) &&
        Objects.equals(latitude, assetResponse.latitude) &&
        Objects.equals(longitude, assetResponse.longitude) &&
        Objects.equals(attachedMediaType, assetResponse.attachedMediaType) &&
        Objects.equals(attachedAssetURL, assetResponse.attachedAssetURL) &&
        Objects.equals(created, assetResponse.created) &&
        Objects.equals(updated, assetResponse.updated) &&
        Objects.equals(searchTags, assetResponse.searchTags) &&
        Objects.equals(metaData, assetResponse.metaData) &&
        Objects.equals(returning, assetResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, assetId, fileName, caption, mediaType, thumbnailURL, coverURL, fullURL, assetVersion, versionName, versionCode, display, locationDescription, uploader, likesCount, commentsCount, latitude, longitude, attachedMediaType, attachedAssetURL, created, updated, searchTags, metaData, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

