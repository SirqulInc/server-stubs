package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.AssetResponse;
import org.openapitools.model.ConnectionGroupShortResponse;
import org.openapitools.model.ConnectionResponse;
import org.openapitools.model.LikeResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.NoteFullResponse;
import org.openapitools.model.Permissions;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AlbumFullResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AlbumFullResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  private @Nullable Long albumId;

  private @Nullable String albumType;

  private @Nullable Long ownerId;

  private @Nullable AccountShortResponse owner;

  private @Nullable String title;

  private @Nullable String description;

  private @Nullable AssetResponse coverAsset;

  private @Nullable String tags;

  /**
   * Gets or Sets visibility
   */
  public enum VisibilityEnum {
    PUBLIC("PUBLIC"),
    
    PRIVATE("PRIVATE"),
    
    FRIENDS("FRIENDS");

    private final String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable VisibilityEnum visibility;

  private @Nullable Long startDate;

  private @Nullable Long endDate;

  private @Nullable Integer assetCount;

  private @Nullable Long likeCount;

  private @Nullable Long dislikeCount;

  private @Nullable Long commentsCount;

  private @Nullable Integer userCount;

  private @Nullable Boolean notifications;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable String locationDescription;

  private @Nullable Double distance;

  private @Nullable Long dateCreated;

  private @Nullable Long dateUpdated;

  private @Nullable String cellPhone;

  private @Nullable String fullAddress;

  /**
   * Gets or Sets approvalStatus
   */
  public enum ApprovalStatusEnum {
    PENDING("PENDING"),
    
    REJECTED("REJECTED"),
    
    APPROVED("APPROVED"),
    
    FEATURED("FEATURED");

    private final String value;

    ApprovalStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ApprovalStatusEnum fromValue(String value) {
      for (ApprovalStatusEnum b : ApprovalStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ApprovalStatusEnum approvalStatus;

  private @Nullable Long favoriteCount;

  private @Nullable Boolean liked;

  private @Nullable Boolean favorite;

  private @Nullable Long favoriteId;

  private @Nullable Boolean anonymous;

  private @Nullable Long flagCount;

  private @Nullable Long viewedCount;

  private @Nullable Long clickedCount;

  private @Nullable Long sharedCount;

  @Valid
  private List<@Valid AssetResponse> assets = new ArrayList<>();

  @Valid
  private List<@Valid NoteFullResponse> comments = new ArrayList<>();

  @Valid
  private List<@Valid LikeResponse> likes = new ArrayList<>();

  @Valid
  private List<@Valid ConnectionGroupShortResponse> connectionGroups = new ArrayList<>();

  @Valid
  private List<@Valid ConnectionResponse> connections = new ArrayList<>();

  private @Nullable Boolean hasLiked;

  private @Nullable Boolean hasDisliked;

  private @Nullable Permissions userPermissions;

  private @Nullable Permissions publicPermissions;

  private @Nullable String returning;

  public AlbumFullResponse valid(@Nullable Boolean valid) {
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

  public AlbumFullResponse message(@Nullable String message) {
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

  public AlbumFullResponse version(@Nullable Double version) {
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

  public AlbumFullResponse serializeNulls(@Nullable Boolean serializeNulls) {
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

  public AlbumFullResponse startTimeLog(@Nullable Long startTimeLog) {
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

  public AlbumFullResponse errorCode(@Nullable String errorCode) {
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

  public AlbumFullResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public AlbumFullResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public AlbumFullResponse albumId(@Nullable Long albumId) {
    this.albumId = albumId;
    return this;
  }

  /**
   * Get albumId
   * @return albumId
   */
  
  @Schema(name = "albumId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("albumId")
  public @Nullable Long getAlbumId() {
    return albumId;
  }

  public void setAlbumId(@Nullable Long albumId) {
    this.albumId = albumId;
  }

  public AlbumFullResponse albumType(@Nullable String albumType) {
    this.albumType = albumType;
    return this;
  }

  /**
   * Get albumType
   * @return albumType
   */
  
  @Schema(name = "albumType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("albumType")
  public @Nullable String getAlbumType() {
    return albumType;
  }

  public void setAlbumType(@Nullable String albumType) {
    this.albumType = albumType;
  }

  public AlbumFullResponse ownerId(@Nullable Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId
   * @return ownerId
   */
  
  @Schema(name = "ownerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ownerId")
  public @Nullable Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(@Nullable Long ownerId) {
    this.ownerId = ownerId;
  }

  public AlbumFullResponse owner(@Nullable AccountShortResponse owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @Valid 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public @Nullable AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(@Nullable AccountShortResponse owner) {
    this.owner = owner;
  }

  public AlbumFullResponse title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public AlbumFullResponse description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public AlbumFullResponse coverAsset(@Nullable AssetResponse coverAsset) {
    this.coverAsset = coverAsset;
    return this;
  }

  /**
   * Get coverAsset
   * @return coverAsset
   */
  @Valid 
  @Schema(name = "coverAsset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("coverAsset")
  public @Nullable AssetResponse getCoverAsset() {
    return coverAsset;
  }

  public void setCoverAsset(@Nullable AssetResponse coverAsset) {
    this.coverAsset = coverAsset;
  }

  public AlbumFullResponse tags(@Nullable String tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  
  @Schema(name = "tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public @Nullable String getTags() {
    return tags;
  }

  public void setTags(@Nullable String tags) {
    this.tags = tags;
  }

  public AlbumFullResponse visibility(@Nullable VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Get visibility
   * @return visibility
   */
  
  @Schema(name = "visibility", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visibility")
  public @Nullable VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(@Nullable VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public AlbumFullResponse startDate(@Nullable Long startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public @Nullable Long getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable Long startDate) {
    this.startDate = startDate;
  }

  public AlbumFullResponse endDate(@Nullable Long endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  
  @Schema(name = "endDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public @Nullable Long getEndDate() {
    return endDate;
  }

  public void setEndDate(@Nullable Long endDate) {
    this.endDate = endDate;
  }

  public AlbumFullResponse assetCount(@Nullable Integer assetCount) {
    this.assetCount = assetCount;
    return this;
  }

  /**
   * Get assetCount
   * @return assetCount
   */
  
  @Schema(name = "assetCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assetCount")
  public @Nullable Integer getAssetCount() {
    return assetCount;
  }

  public void setAssetCount(@Nullable Integer assetCount) {
    this.assetCount = assetCount;
  }

  public AlbumFullResponse likeCount(@Nullable Long likeCount) {
    this.likeCount = likeCount;
    return this;
  }

  /**
   * Get likeCount
   * @return likeCount
   */
  
  @Schema(name = "likeCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("likeCount")
  public @Nullable Long getLikeCount() {
    return likeCount;
  }

  public void setLikeCount(@Nullable Long likeCount) {
    this.likeCount = likeCount;
  }

  public AlbumFullResponse dislikeCount(@Nullable Long dislikeCount) {
    this.dislikeCount = dislikeCount;
    return this;
  }

  /**
   * Get dislikeCount
   * @return dislikeCount
   */
  
  @Schema(name = "dislikeCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dislikeCount")
  public @Nullable Long getDislikeCount() {
    return dislikeCount;
  }

  public void setDislikeCount(@Nullable Long dislikeCount) {
    this.dislikeCount = dislikeCount;
  }

  public AlbumFullResponse commentsCount(@Nullable Long commentsCount) {
    this.commentsCount = commentsCount;
    return this;
  }

  /**
   * Get commentsCount
   * @return commentsCount
   */
  
  @Schema(name = "commentsCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commentsCount")
  public @Nullable Long getCommentsCount() {
    return commentsCount;
  }

  public void setCommentsCount(@Nullable Long commentsCount) {
    this.commentsCount = commentsCount;
  }

  public AlbumFullResponse userCount(@Nullable Integer userCount) {
    this.userCount = userCount;
    return this;
  }

  /**
   * Get userCount
   * @return userCount
   */
  
  @Schema(name = "userCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userCount")
  public @Nullable Integer getUserCount() {
    return userCount;
  }

  public void setUserCount(@Nullable Integer userCount) {
    this.userCount = userCount;
  }

  public AlbumFullResponse notifications(@Nullable Boolean notifications) {
    this.notifications = notifications;
    return this;
  }

  /**
   * Get notifications
   * @return notifications
   */
  
  @Schema(name = "notifications", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifications")
  public @Nullable Boolean getNotifications() {
    return notifications;
  }

  public void setNotifications(@Nullable Boolean notifications) {
    this.notifications = notifications;
  }

  public AlbumFullResponse latitude(@Nullable Double latitude) {
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

  public AlbumFullResponse longitude(@Nullable Double longitude) {
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

  public AlbumFullResponse locationDescription(@Nullable String locationDescription) {
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

  public AlbumFullResponse distance(@Nullable Double distance) {
    this.distance = distance;
    return this;
  }

  /**
   * Get distance
   * @return distance
   */
  
  @Schema(name = "distance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("distance")
  public @Nullable Double getDistance() {
    return distance;
  }

  public void setDistance(@Nullable Double distance) {
    this.distance = distance;
  }

  public AlbumFullResponse dateCreated(@Nullable Long dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * Get dateCreated
   * @return dateCreated
   */
  
  @Schema(name = "dateCreated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateCreated")
  public @Nullable Long getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(@Nullable Long dateCreated) {
    this.dateCreated = dateCreated;
  }

  public AlbumFullResponse dateUpdated(@Nullable Long dateUpdated) {
    this.dateUpdated = dateUpdated;
    return this;
  }

  /**
   * Get dateUpdated
   * @return dateUpdated
   */
  
  @Schema(name = "dateUpdated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateUpdated")
  public @Nullable Long getDateUpdated() {
    return dateUpdated;
  }

  public void setDateUpdated(@Nullable Long dateUpdated) {
    this.dateUpdated = dateUpdated;
  }

  public AlbumFullResponse cellPhone(@Nullable String cellPhone) {
    this.cellPhone = cellPhone;
    return this;
  }

  /**
   * Get cellPhone
   * @return cellPhone
   */
  
  @Schema(name = "cellPhone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cellPhone")
  public @Nullable String getCellPhone() {
    return cellPhone;
  }

  public void setCellPhone(@Nullable String cellPhone) {
    this.cellPhone = cellPhone;
  }

  public AlbumFullResponse fullAddress(@Nullable String fullAddress) {
    this.fullAddress = fullAddress;
    return this;
  }

  /**
   * Get fullAddress
   * @return fullAddress
   */
  
  @Schema(name = "fullAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fullAddress")
  public @Nullable String getFullAddress() {
    return fullAddress;
  }

  public void setFullAddress(@Nullable String fullAddress) {
    this.fullAddress = fullAddress;
  }

  public AlbumFullResponse approvalStatus(@Nullable ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

  /**
   * Get approvalStatus
   * @return approvalStatus
   */
  
  @Schema(name = "approvalStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approvalStatus")
  public @Nullable ApprovalStatusEnum getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(@Nullable ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public AlbumFullResponse favoriteCount(@Nullable Long favoriteCount) {
    this.favoriteCount = favoriteCount;
    return this;
  }

  /**
   * Get favoriteCount
   * @return favoriteCount
   */
  
  @Schema(name = "favoriteCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("favoriteCount")
  public @Nullable Long getFavoriteCount() {
    return favoriteCount;
  }

  public void setFavoriteCount(@Nullable Long favoriteCount) {
    this.favoriteCount = favoriteCount;
  }

  public AlbumFullResponse liked(@Nullable Boolean liked) {
    this.liked = liked;
    return this;
  }

  /**
   * Get liked
   * @return liked
   */
  
  @Schema(name = "liked", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("liked")
  public @Nullable Boolean getLiked() {
    return liked;
  }

  public void setLiked(@Nullable Boolean liked) {
    this.liked = liked;
  }

  public AlbumFullResponse favorite(@Nullable Boolean favorite) {
    this.favorite = favorite;
    return this;
  }

  /**
   * Get favorite
   * @return favorite
   */
  
  @Schema(name = "favorite", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("favorite")
  public @Nullable Boolean getFavorite() {
    return favorite;
  }

  public void setFavorite(@Nullable Boolean favorite) {
    this.favorite = favorite;
  }

  public AlbumFullResponse favoriteId(@Nullable Long favoriteId) {
    this.favoriteId = favoriteId;
    return this;
  }

  /**
   * Get favoriteId
   * @return favoriteId
   */
  
  @Schema(name = "favoriteId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("favoriteId")
  public @Nullable Long getFavoriteId() {
    return favoriteId;
  }

  public void setFavoriteId(@Nullable Long favoriteId) {
    this.favoriteId = favoriteId;
  }

  public AlbumFullResponse anonymous(@Nullable Boolean anonymous) {
    this.anonymous = anonymous;
    return this;
  }

  /**
   * Get anonymous
   * @return anonymous
   */
  
  @Schema(name = "anonymous", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("anonymous")
  public @Nullable Boolean getAnonymous() {
    return anonymous;
  }

  public void setAnonymous(@Nullable Boolean anonymous) {
    this.anonymous = anonymous;
  }

  public AlbumFullResponse flagCount(@Nullable Long flagCount) {
    this.flagCount = flagCount;
    return this;
  }

  /**
   * Get flagCount
   * @return flagCount
   */
  
  @Schema(name = "flagCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flagCount")
  public @Nullable Long getFlagCount() {
    return flagCount;
  }

  public void setFlagCount(@Nullable Long flagCount) {
    this.flagCount = flagCount;
  }

  public AlbumFullResponse viewedCount(@Nullable Long viewedCount) {
    this.viewedCount = viewedCount;
    return this;
  }

  /**
   * Get viewedCount
   * @return viewedCount
   */
  
  @Schema(name = "viewedCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("viewedCount")
  public @Nullable Long getViewedCount() {
    return viewedCount;
  }

  public void setViewedCount(@Nullable Long viewedCount) {
    this.viewedCount = viewedCount;
  }

  public AlbumFullResponse clickedCount(@Nullable Long clickedCount) {
    this.clickedCount = clickedCount;
    return this;
  }

  /**
   * Get clickedCount
   * @return clickedCount
   */
  
  @Schema(name = "clickedCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clickedCount")
  public @Nullable Long getClickedCount() {
    return clickedCount;
  }

  public void setClickedCount(@Nullable Long clickedCount) {
    this.clickedCount = clickedCount;
  }

  public AlbumFullResponse sharedCount(@Nullable Long sharedCount) {
    this.sharedCount = sharedCount;
    return this;
  }

  /**
   * Get sharedCount
   * @return sharedCount
   */
  
  @Schema(name = "sharedCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sharedCount")
  public @Nullable Long getSharedCount() {
    return sharedCount;
  }

  public void setSharedCount(@Nullable Long sharedCount) {
    this.sharedCount = sharedCount;
  }

  public AlbumFullResponse assets(List<@Valid AssetResponse> assets) {
    this.assets = assets;
    return this;
  }

  public AlbumFullResponse addAssetsItem(AssetResponse assetsItem) {
    if (this.assets == null) {
      this.assets = new ArrayList<>();
    }
    this.assets.add(assetsItem);
    return this;
  }

  /**
   * Get assets
   * @return assets
   */
  @Valid 
  @Schema(name = "assets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assets")
  public List<@Valid AssetResponse> getAssets() {
    return assets;
  }

  public void setAssets(List<@Valid AssetResponse> assets) {
    this.assets = assets;
  }

  public AlbumFullResponse comments(List<@Valid NoteFullResponse> comments) {
    this.comments = comments;
    return this;
  }

  public AlbumFullResponse addCommentsItem(NoteFullResponse commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<>();
    }
    this.comments.add(commentsItem);
    return this;
  }

  /**
   * Get comments
   * @return comments
   */
  @Valid 
  @Schema(name = "comments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comments")
  public List<@Valid NoteFullResponse> getComments() {
    return comments;
  }

  public void setComments(List<@Valid NoteFullResponse> comments) {
    this.comments = comments;
  }

  public AlbumFullResponse likes(List<@Valid LikeResponse> likes) {
    this.likes = likes;
    return this;
  }

  public AlbumFullResponse addLikesItem(LikeResponse likesItem) {
    if (this.likes == null) {
      this.likes = new ArrayList<>();
    }
    this.likes.add(likesItem);
    return this;
  }

  /**
   * Get likes
   * @return likes
   */
  @Valid 
  @Schema(name = "likes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("likes")
  public List<@Valid LikeResponse> getLikes() {
    return likes;
  }

  public void setLikes(List<@Valid LikeResponse> likes) {
    this.likes = likes;
  }

  public AlbumFullResponse connectionGroups(List<@Valid ConnectionGroupShortResponse> connectionGroups) {
    this.connectionGroups = connectionGroups;
    return this;
  }

  public AlbumFullResponse addConnectionGroupsItem(ConnectionGroupShortResponse connectionGroupsItem) {
    if (this.connectionGroups == null) {
      this.connectionGroups = new ArrayList<>();
    }
    this.connectionGroups.add(connectionGroupsItem);
    return this;
  }

  /**
   * Get connectionGroups
   * @return connectionGroups
   */
  @Valid 
  @Schema(name = "connectionGroups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectionGroups")
  public List<@Valid ConnectionGroupShortResponse> getConnectionGroups() {
    return connectionGroups;
  }

  public void setConnectionGroups(List<@Valid ConnectionGroupShortResponse> connectionGroups) {
    this.connectionGroups = connectionGroups;
  }

  public AlbumFullResponse connections(List<@Valid ConnectionResponse> connections) {
    this.connections = connections;
    return this;
  }

  public AlbumFullResponse addConnectionsItem(ConnectionResponse connectionsItem) {
    if (this.connections == null) {
      this.connections = new ArrayList<>();
    }
    this.connections.add(connectionsItem);
    return this;
  }

  /**
   * Get connections
   * @return connections
   */
  @Valid 
  @Schema(name = "connections", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connections")
  public List<@Valid ConnectionResponse> getConnections() {
    return connections;
  }

  public void setConnections(List<@Valid ConnectionResponse> connections) {
    this.connections = connections;
  }

  public AlbumFullResponse hasLiked(@Nullable Boolean hasLiked) {
    this.hasLiked = hasLiked;
    return this;
  }

  /**
   * Get hasLiked
   * @return hasLiked
   */
  
  @Schema(name = "hasLiked", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasLiked")
  public @Nullable Boolean getHasLiked() {
    return hasLiked;
  }

  public void setHasLiked(@Nullable Boolean hasLiked) {
    this.hasLiked = hasLiked;
  }

  public AlbumFullResponse hasDisliked(@Nullable Boolean hasDisliked) {
    this.hasDisliked = hasDisliked;
    return this;
  }

  /**
   * Get hasDisliked
   * @return hasDisliked
   */
  
  @Schema(name = "hasDisliked", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasDisliked")
  public @Nullable Boolean getHasDisliked() {
    return hasDisliked;
  }

  public void setHasDisliked(@Nullable Boolean hasDisliked) {
    this.hasDisliked = hasDisliked;
  }

  public AlbumFullResponse userPermissions(@Nullable Permissions userPermissions) {
    this.userPermissions = userPermissions;
    return this;
  }

  /**
   * Get userPermissions
   * @return userPermissions
   */
  @Valid 
  @Schema(name = "userPermissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userPermissions")
  public @Nullable Permissions getUserPermissions() {
    return userPermissions;
  }

  public void setUserPermissions(@Nullable Permissions userPermissions) {
    this.userPermissions = userPermissions;
  }

  public AlbumFullResponse publicPermissions(@Nullable Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
    return this;
  }

  /**
   * Get publicPermissions
   * @return publicPermissions
   */
  @Valid 
  @Schema(name = "publicPermissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publicPermissions")
  public @Nullable Permissions getPublicPermissions() {
    return publicPermissions;
  }

  public void setPublicPermissions(@Nullable Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
  }

  public AlbumFullResponse returning(@Nullable String returning) {
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
    AlbumFullResponse albumFullResponse = (AlbumFullResponse) o;
    return Objects.equals(this.valid, albumFullResponse.valid) &&
        Objects.equals(this.message, albumFullResponse.message) &&
        Objects.equals(this.version, albumFullResponse.version) &&
        Objects.equals(this.serializeNulls, albumFullResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, albumFullResponse.startTimeLog) &&
        Objects.equals(this.errorCode, albumFullResponse.errorCode) &&
        Objects.equals(this.request, albumFullResponse.request) &&
        Objects.equals(this.albumId, albumFullResponse.albumId) &&
        Objects.equals(this.albumType, albumFullResponse.albumType) &&
        Objects.equals(this.ownerId, albumFullResponse.ownerId) &&
        Objects.equals(this.owner, albumFullResponse.owner) &&
        Objects.equals(this.title, albumFullResponse.title) &&
        Objects.equals(this.description, albumFullResponse.description) &&
        Objects.equals(this.coverAsset, albumFullResponse.coverAsset) &&
        Objects.equals(this.tags, albumFullResponse.tags) &&
        Objects.equals(this.visibility, albumFullResponse.visibility) &&
        Objects.equals(this.startDate, albumFullResponse.startDate) &&
        Objects.equals(this.endDate, albumFullResponse.endDate) &&
        Objects.equals(this.assetCount, albumFullResponse.assetCount) &&
        Objects.equals(this.likeCount, albumFullResponse.likeCount) &&
        Objects.equals(this.dislikeCount, albumFullResponse.dislikeCount) &&
        Objects.equals(this.commentsCount, albumFullResponse.commentsCount) &&
        Objects.equals(this.userCount, albumFullResponse.userCount) &&
        Objects.equals(this.notifications, albumFullResponse.notifications) &&
        Objects.equals(this.latitude, albumFullResponse.latitude) &&
        Objects.equals(this.longitude, albumFullResponse.longitude) &&
        Objects.equals(this.locationDescription, albumFullResponse.locationDescription) &&
        Objects.equals(this.distance, albumFullResponse.distance) &&
        Objects.equals(this.dateCreated, albumFullResponse.dateCreated) &&
        Objects.equals(this.dateUpdated, albumFullResponse.dateUpdated) &&
        Objects.equals(this.cellPhone, albumFullResponse.cellPhone) &&
        Objects.equals(this.fullAddress, albumFullResponse.fullAddress) &&
        Objects.equals(this.approvalStatus, albumFullResponse.approvalStatus) &&
        Objects.equals(this.favoriteCount, albumFullResponse.favoriteCount) &&
        Objects.equals(this.liked, albumFullResponse.liked) &&
        Objects.equals(this.favorite, albumFullResponse.favorite) &&
        Objects.equals(this.favoriteId, albumFullResponse.favoriteId) &&
        Objects.equals(this.anonymous, albumFullResponse.anonymous) &&
        Objects.equals(this.flagCount, albumFullResponse.flagCount) &&
        Objects.equals(this.viewedCount, albumFullResponse.viewedCount) &&
        Objects.equals(this.clickedCount, albumFullResponse.clickedCount) &&
        Objects.equals(this.sharedCount, albumFullResponse.sharedCount) &&
        Objects.equals(this.assets, albumFullResponse.assets) &&
        Objects.equals(this.comments, albumFullResponse.comments) &&
        Objects.equals(this.likes, albumFullResponse.likes) &&
        Objects.equals(this.connectionGroups, albumFullResponse.connectionGroups) &&
        Objects.equals(this.connections, albumFullResponse.connections) &&
        Objects.equals(this.hasLiked, albumFullResponse.hasLiked) &&
        Objects.equals(this.hasDisliked, albumFullResponse.hasDisliked) &&
        Objects.equals(this.userPermissions, albumFullResponse.userPermissions) &&
        Objects.equals(this.publicPermissions, albumFullResponse.publicPermissions) &&
        Objects.equals(this.returning, albumFullResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, albumId, albumType, ownerId, owner, title, description, coverAsset, tags, visibility, startDate, endDate, assetCount, likeCount, dislikeCount, commentsCount, userCount, notifications, latitude, longitude, locationDescription, distance, dateCreated, dateUpdated, cellPhone, fullAddress, approvalStatus, favoriteCount, liked, favorite, favoriteId, anonymous, flagCount, viewedCount, clickedCount, sharedCount, assets, comments, likes, connectionGroups, connections, hasLiked, hasDisliked, userPermissions, publicPermissions, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlbumFullResponse {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    albumId: ").append(toIndentedString(albumId)).append("\n");
    sb.append("    albumType: ").append(toIndentedString(albumType)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    coverAsset: ").append(toIndentedString(coverAsset)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    assetCount: ").append(toIndentedString(assetCount)).append("\n");
    sb.append("    likeCount: ").append(toIndentedString(likeCount)).append("\n");
    sb.append("    dislikeCount: ").append(toIndentedString(dislikeCount)).append("\n");
    sb.append("    commentsCount: ").append(toIndentedString(commentsCount)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    cellPhone: ").append(toIndentedString(cellPhone)).append("\n");
    sb.append("    fullAddress: ").append(toIndentedString(fullAddress)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    favoriteCount: ").append(toIndentedString(favoriteCount)).append("\n");
    sb.append("    liked: ").append(toIndentedString(liked)).append("\n");
    sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
    sb.append("    favoriteId: ").append(toIndentedString(favoriteId)).append("\n");
    sb.append("    anonymous: ").append(toIndentedString(anonymous)).append("\n");
    sb.append("    flagCount: ").append(toIndentedString(flagCount)).append("\n");
    sb.append("    viewedCount: ").append(toIndentedString(viewedCount)).append("\n");
    sb.append("    clickedCount: ").append(toIndentedString(clickedCount)).append("\n");
    sb.append("    sharedCount: ").append(toIndentedString(sharedCount)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    connectionGroups: ").append(toIndentedString(connectionGroups)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    hasLiked: ").append(toIndentedString(hasLiked)).append("\n");
    sb.append("    hasDisliked: ").append(toIndentedString(hasDisliked)).append("\n");
    sb.append("    userPermissions: ").append(toIndentedString(userPermissions)).append("\n");
    sb.append("    publicPermissions: ").append(toIndentedString(publicPermissions)).append("\n");
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

