package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.LikeResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.NoteFullResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AssetFullResponse  {
  
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

  @Valid

  private List<@Valid NoteFullResponse> comments = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid LikeResponse> likes = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Boolean hasLiked;

  @ApiModelProperty(value = "")

  private Boolean hasDisliked;

  @ApiModelProperty(value = "")

  private Boolean metFlagThreshold;

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

  public AssetFullResponse valid(Boolean valid) {
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

  public AssetFullResponse message(String message) {
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

  public AssetFullResponse version(Double version) {
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

  public AssetFullResponse serializeNulls(Boolean serializeNulls) {
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

  public AssetFullResponse startTimeLog(Long startTimeLog) {
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

  public AssetFullResponse errorCode(String errorCode) {
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

  public AssetFullResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public AssetFullResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public AssetFullResponse assetId(Long assetId) {
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

  public AssetFullResponse fileName(String fileName) {
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

  public AssetFullResponse caption(String caption) {
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

  public AssetFullResponse mediaType(String mediaType) {
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

  public AssetFullResponse thumbnailURL(String thumbnailURL) {
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

  public AssetFullResponse coverURL(String coverURL) {
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

  public AssetFullResponse fullURL(String fullURL) {
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

  public AssetFullResponse assetVersion(String assetVersion) {
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

  public AssetFullResponse versionName(String versionName) {
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

  public AssetFullResponse versionCode(Integer versionCode) {
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

  public AssetFullResponse display(String display) {
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

  public AssetFullResponse locationDescription(String locationDescription) {
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

  public AssetFullResponse uploader(AccountShortResponse uploader) {
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

  public AssetFullResponse likesCount(Long likesCount) {
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

  public AssetFullResponse commentsCount(Integer commentsCount) {
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

  public AssetFullResponse latitude(Double latitude) {
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

  public AssetFullResponse longitude(Double longitude) {
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

  public AssetFullResponse attachedMediaType(String attachedMediaType) {
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

  public AssetFullResponse attachedAssetURL(String attachedAssetURL) {
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

  public AssetFullResponse created(Long created) {
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

  public AssetFullResponse updated(Long updated) {
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

  public AssetFullResponse searchTags(String searchTags) {
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

  public AssetFullResponse metaData(String metaData) {
    this.metaData = metaData;
    return this;
  }

 /**
   * Get comments
   * @return comments
  **/
  @JsonProperty("comments")
  public List<@Valid NoteFullResponse> getComments() {
    return comments;
  }

  public void setComments(List<@Valid NoteFullResponse> comments) {
    this.comments = comments;
  }

  public AssetFullResponse comments(List<@Valid NoteFullResponse> comments) {
    this.comments = comments;
    return this;
  }

  public AssetFullResponse addCommentsItem(NoteFullResponse commentsItem) {
    this.comments.add(commentsItem);
    return this;
  }

 /**
   * Get likes
   * @return likes
  **/
  @JsonProperty("likes")
  public List<@Valid LikeResponse> getLikes() {
    return likes;
  }

  public void setLikes(List<@Valid LikeResponse> likes) {
    this.likes = likes;
  }

  public AssetFullResponse likes(List<@Valid LikeResponse> likes) {
    this.likes = likes;
    return this;
  }

  public AssetFullResponse addLikesItem(LikeResponse likesItem) {
    this.likes.add(likesItem);
    return this;
  }

 /**
   * Get hasLiked
   * @return hasLiked
  **/
  @JsonProperty("hasLiked")
  public Boolean getHasLiked() {
    return hasLiked;
  }

  public void setHasLiked(Boolean hasLiked) {
    this.hasLiked = hasLiked;
  }

  public AssetFullResponse hasLiked(Boolean hasLiked) {
    this.hasLiked = hasLiked;
    return this;
  }

 /**
   * Get hasDisliked
   * @return hasDisliked
  **/
  @JsonProperty("hasDisliked")
  public Boolean getHasDisliked() {
    return hasDisliked;
  }

  public void setHasDisliked(Boolean hasDisliked) {
    this.hasDisliked = hasDisliked;
  }

  public AssetFullResponse hasDisliked(Boolean hasDisliked) {
    this.hasDisliked = hasDisliked;
    return this;
  }

 /**
   * Get metFlagThreshold
   * @return metFlagThreshold
  **/
  @JsonProperty("metFlagThreshold")
  public Boolean getMetFlagThreshold() {
    return metFlagThreshold;
  }

  public void setMetFlagThreshold(Boolean metFlagThreshold) {
    this.metFlagThreshold = metFlagThreshold;
  }

  public AssetFullResponse metFlagThreshold(Boolean metFlagThreshold) {
    this.metFlagThreshold = metFlagThreshold;
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

  public AssetFullResponse returning(String returning) {
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
    AssetFullResponse assetFullResponse = (AssetFullResponse) o;
    return Objects.equals(this.valid, assetFullResponse.valid) &&
        Objects.equals(this.message, assetFullResponse.message) &&
        Objects.equals(this.version, assetFullResponse.version) &&
        Objects.equals(this.serializeNulls, assetFullResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, assetFullResponse.startTimeLog) &&
        Objects.equals(this.errorCode, assetFullResponse.errorCode) &&
        Objects.equals(this.request, assetFullResponse.request) &&
        Objects.equals(this.assetId, assetFullResponse.assetId) &&
        Objects.equals(this.fileName, assetFullResponse.fileName) &&
        Objects.equals(this.caption, assetFullResponse.caption) &&
        Objects.equals(this.mediaType, assetFullResponse.mediaType) &&
        Objects.equals(this.thumbnailURL, assetFullResponse.thumbnailURL) &&
        Objects.equals(this.coverURL, assetFullResponse.coverURL) &&
        Objects.equals(this.fullURL, assetFullResponse.fullURL) &&
        Objects.equals(this.assetVersion, assetFullResponse.assetVersion) &&
        Objects.equals(this.versionName, assetFullResponse.versionName) &&
        Objects.equals(this.versionCode, assetFullResponse.versionCode) &&
        Objects.equals(this.display, assetFullResponse.display) &&
        Objects.equals(this.locationDescription, assetFullResponse.locationDescription) &&
        Objects.equals(this.uploader, assetFullResponse.uploader) &&
        Objects.equals(this.likesCount, assetFullResponse.likesCount) &&
        Objects.equals(this.commentsCount, assetFullResponse.commentsCount) &&
        Objects.equals(this.latitude, assetFullResponse.latitude) &&
        Objects.equals(this.longitude, assetFullResponse.longitude) &&
        Objects.equals(this.attachedMediaType, assetFullResponse.attachedMediaType) &&
        Objects.equals(this.attachedAssetURL, assetFullResponse.attachedAssetURL) &&
        Objects.equals(this.created, assetFullResponse.created) &&
        Objects.equals(this.updated, assetFullResponse.updated) &&
        Objects.equals(this.searchTags, assetFullResponse.searchTags) &&
        Objects.equals(this.metaData, assetFullResponse.metaData) &&
        Objects.equals(this.comments, assetFullResponse.comments) &&
        Objects.equals(this.likes, assetFullResponse.likes) &&
        Objects.equals(this.hasLiked, assetFullResponse.hasLiked) &&
        Objects.equals(this.hasDisliked, assetFullResponse.hasDisliked) &&
        Objects.equals(this.metFlagThreshold, assetFullResponse.metFlagThreshold) &&
        Objects.equals(this.returning, assetFullResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, assetId, fileName, caption, mediaType, thumbnailURL, coverURL, fullURL, assetVersion, versionName, versionCode, display, locationDescription, uploader, likesCount, commentsCount, latitude, longitude, attachedMediaType, attachedAssetURL, created, updated, searchTags, metaData, comments, likes, hasLiked, hasDisliked, metFlagThreshold, returning);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

