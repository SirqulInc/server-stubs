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
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.LikeResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.NoteFullResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AssetFullResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private Long assetId;
  private String fileName;
  private String caption;
  private String mediaType;
  private String thumbnailURL;
  private String coverURL;
  private String fullURL;
  private String assetVersion;
  private String versionName;
  private Integer versionCode;
  private String display;
  private String locationDescription;
  private AccountShortResponse uploader;
  private Long likesCount;
  private Integer commentsCount;
  private Double latitude;
  private Double longitude;
  private String attachedMediaType;
  private String attachedAssetURL;
  private Long created;
  private Long updated;
  private String searchTags;
  private String metaData;
  private List<@Valid NoteFullResponse> comments = new ArrayList<>();
  private List<@Valid LikeResponse> likes = new ArrayList<>();
  private Boolean hasLiked;
  private Boolean hasDisliked;
  private Boolean metFlagThreshold;
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
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("caption")
  public String getCaption() {
    return caption;
  }
  public void setCaption(String caption) {
    this.caption = caption;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mediaType")
  public String getMediaType() {
    return mediaType;
  }
  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("thumbnailURL")
  public String getThumbnailURL() {
    return thumbnailURL;
  }
  public void setThumbnailURL(String thumbnailURL) {
    this.thumbnailURL = thumbnailURL;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("coverURL")
  public String getCoverURL() {
    return coverURL;
  }
  public void setCoverURL(String coverURL) {
    this.coverURL = coverURL;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fullURL")
  public String getFullURL() {
    return fullURL;
  }
  public void setFullURL(String fullURL) {
    this.fullURL = fullURL;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("assetVersion")
  public String getAssetVersion() {
    return assetVersion;
  }
  public void setAssetVersion(String assetVersion) {
    this.assetVersion = assetVersion;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("versionName")
  public String getVersionName() {
    return versionName;
  }
  public void setVersionName(String versionName) {
    this.versionName = versionName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("versionCode")
  public Integer getVersionCode() {
    return versionCode;
  }
  public void setVersionCode(Integer versionCode) {
    this.versionCode = versionCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }
  public void setDisplay(String display) {
    this.display = display;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationDescription")
  public String getLocationDescription() {
    return locationDescription;
  }
  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("uploader")
  @Valid
  public AccountShortResponse getUploader() {
    return uploader;
  }
  public void setUploader(AccountShortResponse uploader) {
    this.uploader = uploader;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("likesCount")
  public Long getLikesCount() {
    return likesCount;
  }
  public void setLikesCount(Long likesCount) {
    this.likesCount = likesCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("commentsCount")
  public Integer getCommentsCount() {
    return commentsCount;
  }
  public void setCommentsCount(Integer commentsCount) {
    this.commentsCount = commentsCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("attachedMediaType")
  public String getAttachedMediaType() {
    return attachedMediaType;
  }
  public void setAttachedMediaType(String attachedMediaType) {
    this.attachedMediaType = attachedMediaType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("attachedAssetURL")
  public String getAttachedAssetURL() {
    return attachedAssetURL;
  }
  public void setAttachedAssetURL(String attachedAssetURL) {
    this.attachedAssetURL = attachedAssetURL;
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
  @JsonProperty("searchTags")
  public String getSearchTags() {
    return searchTags;
  }
  public void setSearchTags(String searchTags) {
    this.searchTags = searchTags;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("metaData")
  public String getMetaData() {
    return metaData;
  }
  public void setMetaData(String metaData) {
    this.metaData = metaData;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("comments")
  @Valid
  public List<@Valid NoteFullResponse> getComments() {
    return comments;
  }
  public void setComments(List<@Valid NoteFullResponse> comments) {
    this.comments = comments;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("likes")
  @Valid
  public List<@Valid LikeResponse> getLikes() {
    return likes;
  }
  public void setLikes(List<@Valid LikeResponse> likes) {
    this.likes = likes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hasLiked")
  public Boolean getHasLiked() {
    return hasLiked;
  }
  public void setHasLiked(Boolean hasLiked) {
    this.hasLiked = hasLiked;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hasDisliked")
  public Boolean getHasDisliked() {
    return hasDisliked;
  }
  public void setHasDisliked(Boolean hasDisliked) {
    this.hasDisliked = hasDisliked;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("metFlagThreshold")
  public Boolean getMetFlagThreshold() {
    return metFlagThreshold;
  }
  public void setMetFlagThreshold(Boolean metFlagThreshold) {
    this.metFlagThreshold = metFlagThreshold;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

