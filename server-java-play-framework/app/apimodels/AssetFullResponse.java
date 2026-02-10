package apimodels;

import apimodels.AccountShortResponse;
import apimodels.LikeResponse;
import apimodels.NameStringValueResponse;
import apimodels.NoteFullResponse;
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
 * AssetFullResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AssetFullResponse   {
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

  @JsonProperty("comments")
  @Valid

  private List<@Valid NoteFullResponse> comments = null;

  @JsonProperty("likes")
  @Valid

  private List<@Valid LikeResponse> likes = null;

  @JsonProperty("hasLiked")
  
  private Boolean hasLiked;

  @JsonProperty("hasDisliked")
  
  private Boolean hasDisliked;

  @JsonProperty("metFlagThreshold")
  
  private Boolean metFlagThreshold;

  @JsonProperty("returning")
  
  private String returning;

  public AssetFullResponse valid(Boolean valid) {
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

  public AssetFullResponse message(String message) {
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

  public AssetFullResponse version(Double version) {
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

  public AssetFullResponse serializeNulls(Boolean serializeNulls) {
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

  public AssetFullResponse startTimeLog(Long startTimeLog) {
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

  public AssetFullResponse errorCode(String errorCode) {
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

  public AssetFullResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public AssetFullResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public AssetFullResponse assetId(Long assetId) {
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

  public AssetFullResponse fileName(String fileName) {
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

  public AssetFullResponse caption(String caption) {
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

  public AssetFullResponse mediaType(String mediaType) {
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

  public AssetFullResponse thumbnailURL(String thumbnailURL) {
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

  public AssetFullResponse coverURL(String coverURL) {
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

  public AssetFullResponse fullURL(String fullURL) {
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

  public AssetFullResponse assetVersion(String assetVersion) {
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

  public AssetFullResponse versionName(String versionName) {
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

  public AssetFullResponse versionCode(Integer versionCode) {
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

  public AssetFullResponse display(String display) {
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

  public AssetFullResponse locationDescription(String locationDescription) {
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

  public AssetFullResponse uploader(AccountShortResponse uploader) {
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

  public AssetFullResponse likesCount(Long likesCount) {
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

  public AssetFullResponse commentsCount(Integer commentsCount) {
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

  public AssetFullResponse latitude(Double latitude) {
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

  public AssetFullResponse longitude(Double longitude) {
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

  public AssetFullResponse attachedMediaType(String attachedMediaType) {
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

  public AssetFullResponse attachedAssetURL(String attachedAssetURL) {
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

  public AssetFullResponse created(Long created) {
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

  public AssetFullResponse updated(Long updated) {
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

  public AssetFullResponse searchTags(String searchTags) {
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

  public AssetFullResponse metaData(String metaData) {
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

  public AssetFullResponse comments(List<@Valid NoteFullResponse> comments) {
    this.comments = comments;
    return this;
  }

  public AssetFullResponse addCommentsItem(NoteFullResponse commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  public List<@Valid NoteFullResponse> getComments() {
    return comments;
  }

  public void setComments(List<@Valid NoteFullResponse> comments) {
    this.comments = comments;
  }

  public AssetFullResponse likes(List<@Valid LikeResponse> likes) {
    this.likes = likes;
    return this;
  }

  public AssetFullResponse addLikesItem(LikeResponse likesItem) {
    if (this.likes == null) {
      this.likes = new ArrayList<>();
    }
    this.likes.add(likesItem);
    return this;
  }

   /**
   * Get likes
   * @return likes
  **/
  public List<@Valid LikeResponse> getLikes() {
    return likes;
  }

  public void setLikes(List<@Valid LikeResponse> likes) {
    this.likes = likes;
  }

  public AssetFullResponse hasLiked(Boolean hasLiked) {
    this.hasLiked = hasLiked;
    return this;
  }

   /**
   * Get hasLiked
   * @return hasLiked
  **/
  public Boolean getHasLiked() {
    return hasLiked;
  }

  public void setHasLiked(Boolean hasLiked) {
    this.hasLiked = hasLiked;
  }

  public AssetFullResponse hasDisliked(Boolean hasDisliked) {
    this.hasDisliked = hasDisliked;
    return this;
  }

   /**
   * Get hasDisliked
   * @return hasDisliked
  **/
  public Boolean getHasDisliked() {
    return hasDisliked;
  }

  public void setHasDisliked(Boolean hasDisliked) {
    this.hasDisliked = hasDisliked;
  }

  public AssetFullResponse metFlagThreshold(Boolean metFlagThreshold) {
    this.metFlagThreshold = metFlagThreshold;
    return this;
  }

   /**
   * Get metFlagThreshold
   * @return metFlagThreshold
  **/
  public Boolean getMetFlagThreshold() {
    return metFlagThreshold;
  }

  public void setMetFlagThreshold(Boolean metFlagThreshold) {
    this.metFlagThreshold = metFlagThreshold;
  }

  public AssetFullResponse returning(String returning) {
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
    AssetFullResponse assetFullResponse = (AssetFullResponse) o;
    return Objects.equals(valid, assetFullResponse.valid) &&
        Objects.equals(message, assetFullResponse.message) &&
        Objects.equals(version, assetFullResponse.version) &&
        Objects.equals(serializeNulls, assetFullResponse.serializeNulls) &&
        Objects.equals(startTimeLog, assetFullResponse.startTimeLog) &&
        Objects.equals(errorCode, assetFullResponse.errorCode) &&
        Objects.equals(request, assetFullResponse.request) &&
        Objects.equals(assetId, assetFullResponse.assetId) &&
        Objects.equals(fileName, assetFullResponse.fileName) &&
        Objects.equals(caption, assetFullResponse.caption) &&
        Objects.equals(mediaType, assetFullResponse.mediaType) &&
        Objects.equals(thumbnailURL, assetFullResponse.thumbnailURL) &&
        Objects.equals(coverURL, assetFullResponse.coverURL) &&
        Objects.equals(fullURL, assetFullResponse.fullURL) &&
        Objects.equals(assetVersion, assetFullResponse.assetVersion) &&
        Objects.equals(versionName, assetFullResponse.versionName) &&
        Objects.equals(versionCode, assetFullResponse.versionCode) &&
        Objects.equals(display, assetFullResponse.display) &&
        Objects.equals(locationDescription, assetFullResponse.locationDescription) &&
        Objects.equals(uploader, assetFullResponse.uploader) &&
        Objects.equals(likesCount, assetFullResponse.likesCount) &&
        Objects.equals(commentsCount, assetFullResponse.commentsCount) &&
        Objects.equals(latitude, assetFullResponse.latitude) &&
        Objects.equals(longitude, assetFullResponse.longitude) &&
        Objects.equals(attachedMediaType, assetFullResponse.attachedMediaType) &&
        Objects.equals(attachedAssetURL, assetFullResponse.attachedAssetURL) &&
        Objects.equals(created, assetFullResponse.created) &&
        Objects.equals(updated, assetFullResponse.updated) &&
        Objects.equals(searchTags, assetFullResponse.searchTags) &&
        Objects.equals(metaData, assetFullResponse.metaData) &&
        Objects.equals(comments, assetFullResponse.comments) &&
        Objects.equals(likes, assetFullResponse.likes) &&
        Objects.equals(hasLiked, assetFullResponse.hasLiked) &&
        Objects.equals(hasDisliked, assetFullResponse.hasDisliked) &&
        Objects.equals(metFlagThreshold, assetFullResponse.metFlagThreshold) &&
        Objects.equals(returning, assetFullResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, assetId, fileName, caption, mediaType, thumbnailURL, coverURL, fullURL, assetVersion, versionName, versionCode, display, locationDescription, uploader, likesCount, commentsCount, latitude, longitude, attachedMediaType, attachedAssetURL, created, updated, searchTags, metaData, comments, likes, hasLiked, hasDisliked, metFlagThreshold, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetFullResponse {\n");
    
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
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    hasLiked: ").append(toIndentedString(hasLiked)).append("\n");
    sb.append("    hasDisliked: ").append(toIndentedString(hasDisliked)).append("\n");
    sb.append("    metFlagThreshold: ").append(toIndentedString(metFlagThreshold)).append("\n");
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

