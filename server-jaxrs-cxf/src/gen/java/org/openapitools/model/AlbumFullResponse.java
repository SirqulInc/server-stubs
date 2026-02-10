package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AlbumFullResponse  {
  
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

  private Long albumId;

  @ApiModelProperty(value = "")

  private String albumType;

  @ApiModelProperty(value = "")

  private Long ownerId;

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse owner;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  @Valid

  private AssetResponse coverAsset;

  @ApiModelProperty(value = "")

  private String tags;

public enum VisibilityEnum {

PUBLIC(String.valueOf("PUBLIC")), PRIVATE(String.valueOf("PRIVATE")), FRIENDS(String.valueOf("FRIENDS"));


    private String value;

    VisibilityEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

  @ApiModelProperty(value = "")

  private VisibilityEnum visibility;

  @ApiModelProperty(value = "")

  private Long startDate;

  @ApiModelProperty(value = "")

  private Long endDate;

  @ApiModelProperty(value = "")

  private Integer assetCount;

  @ApiModelProperty(value = "")

  private Long likeCount;

  @ApiModelProperty(value = "")

  private Long dislikeCount;

  @ApiModelProperty(value = "")

  private Long commentsCount;

  @ApiModelProperty(value = "")

  private Integer userCount;

  @ApiModelProperty(value = "")

  private Boolean notifications;

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;

  @ApiModelProperty(value = "")

  private String locationDescription;

  @ApiModelProperty(value = "")

  private Double distance;

  @ApiModelProperty(value = "")

  private Long dateCreated;

  @ApiModelProperty(value = "")

  private Long dateUpdated;

  @ApiModelProperty(value = "")

  private String cellPhone;

  @ApiModelProperty(value = "")

  private String fullAddress;

public enum ApprovalStatusEnum {

PENDING(String.valueOf("PENDING")), REJECTED(String.valueOf("REJECTED")), APPROVED(String.valueOf("APPROVED")), FEATURED(String.valueOf("FEATURED"));


    private String value;

    ApprovalStatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

  @ApiModelProperty(value = "")

  private ApprovalStatusEnum approvalStatus;

  @ApiModelProperty(value = "")

  private Long favoriteCount;

  @ApiModelProperty(value = "")

  private Boolean liked;

  @ApiModelProperty(value = "")

  private Boolean favorite;

  @ApiModelProperty(value = "")

  private Long favoriteId;

  @ApiModelProperty(value = "")

  private Boolean anonymous;

  @ApiModelProperty(value = "")

  private Long flagCount;

  @ApiModelProperty(value = "")

  private Long viewedCount;

  @ApiModelProperty(value = "")

  private Long clickedCount;

  @ApiModelProperty(value = "")

  private Long sharedCount;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid AssetResponse> assets = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid NoteFullResponse> comments = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid LikeResponse> likes = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid ConnectionGroupShortResponse> connectionGroups = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid ConnectionResponse> connections = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Boolean hasLiked;

  @ApiModelProperty(value = "")

  private Boolean hasDisliked;

  @ApiModelProperty(value = "")

  @Valid

  private Permissions userPermissions;

  @ApiModelProperty(value = "")

  @Valid

  private Permissions publicPermissions;

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

  public AlbumFullResponse valid(Boolean valid) {
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

  public AlbumFullResponse message(String message) {
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

  public AlbumFullResponse version(Double version) {
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

  public AlbumFullResponse serializeNulls(Boolean serializeNulls) {
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

  public AlbumFullResponse startTimeLog(Long startTimeLog) {
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

  public AlbumFullResponse errorCode(String errorCode) {
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

  public AlbumFullResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public AlbumFullResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get albumId
   * @return albumId
  **/
  @JsonProperty("albumId")
  public Long getAlbumId() {
    return albumId;
  }

  public void setAlbumId(Long albumId) {
    this.albumId = albumId;
  }

  public AlbumFullResponse albumId(Long albumId) {
    this.albumId = albumId;
    return this;
  }

 /**
   * Get albumType
   * @return albumType
  **/
  @JsonProperty("albumType")
  public String getAlbumType() {
    return albumType;
  }

  public void setAlbumType(String albumType) {
    this.albumType = albumType;
  }

  public AlbumFullResponse albumType(String albumType) {
    this.albumType = albumType;
    return this;
  }

 /**
   * Get ownerId
   * @return ownerId
  **/
  @JsonProperty("ownerId")
  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public AlbumFullResponse ownerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  public AlbumFullResponse owner(AccountShortResponse owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AlbumFullResponse title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AlbumFullResponse description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get coverAsset
   * @return coverAsset
  **/
  @JsonProperty("coverAsset")
  public AssetResponse getCoverAsset() {
    return coverAsset;
  }

  public void setCoverAsset(AssetResponse coverAsset) {
    this.coverAsset = coverAsset;
  }

  public AlbumFullResponse coverAsset(AssetResponse coverAsset) {
    this.coverAsset = coverAsset;
    return this;
  }

 /**
   * Get tags
   * @return tags
  **/
  @JsonProperty("tags")
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public AlbumFullResponse tags(String tags) {
    this.tags = tags;
    return this;
  }

 /**
   * Get visibility
   * @return visibility
  **/
  @JsonProperty("visibility")
  public String getVisibility() {
    if (visibility == null) {
      return null;
    }
    return visibility.value();
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public AlbumFullResponse visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

 /**
   * Get startDate
   * @return startDate
  **/
  @JsonProperty("startDate")
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public AlbumFullResponse startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * Get endDate
   * @return endDate
  **/
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public AlbumFullResponse endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * Get assetCount
   * @return assetCount
  **/
  @JsonProperty("assetCount")
  public Integer getAssetCount() {
    return assetCount;
  }

  public void setAssetCount(Integer assetCount) {
    this.assetCount = assetCount;
  }

  public AlbumFullResponse assetCount(Integer assetCount) {
    this.assetCount = assetCount;
    return this;
  }

 /**
   * Get likeCount
   * @return likeCount
  **/
  @JsonProperty("likeCount")
  public Long getLikeCount() {
    return likeCount;
  }

  public void setLikeCount(Long likeCount) {
    this.likeCount = likeCount;
  }

  public AlbumFullResponse likeCount(Long likeCount) {
    this.likeCount = likeCount;
    return this;
  }

 /**
   * Get dislikeCount
   * @return dislikeCount
  **/
  @JsonProperty("dislikeCount")
  public Long getDislikeCount() {
    return dislikeCount;
  }

  public void setDislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
  }

  public AlbumFullResponse dislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
    return this;
  }

 /**
   * Get commentsCount
   * @return commentsCount
  **/
  @JsonProperty("commentsCount")
  public Long getCommentsCount() {
    return commentsCount;
  }

  public void setCommentsCount(Long commentsCount) {
    this.commentsCount = commentsCount;
  }

  public AlbumFullResponse commentsCount(Long commentsCount) {
    this.commentsCount = commentsCount;
    return this;
  }

 /**
   * Get userCount
   * @return userCount
  **/
  @JsonProperty("userCount")
  public Integer getUserCount() {
    return userCount;
  }

  public void setUserCount(Integer userCount) {
    this.userCount = userCount;
  }

  public AlbumFullResponse userCount(Integer userCount) {
    this.userCount = userCount;
    return this;
  }

 /**
   * Get notifications
   * @return notifications
  **/
  @JsonProperty("notifications")
  public Boolean getNotifications() {
    return notifications;
  }

  public void setNotifications(Boolean notifications) {
    this.notifications = notifications;
  }

  public AlbumFullResponse notifications(Boolean notifications) {
    this.notifications = notifications;
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

  public AlbumFullResponse latitude(Double latitude) {
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

  public AlbumFullResponse longitude(Double longitude) {
    this.longitude = longitude;
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

  public AlbumFullResponse locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

 /**
   * Get distance
   * @return distance
  **/
  @JsonProperty("distance")
  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public AlbumFullResponse distance(Double distance) {
    this.distance = distance;
    return this;
  }

 /**
   * Get dateCreated
   * @return dateCreated
  **/
  @JsonProperty("dateCreated")
  public Long getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(Long dateCreated) {
    this.dateCreated = dateCreated;
  }

  public AlbumFullResponse dateCreated(Long dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

 /**
   * Get dateUpdated
   * @return dateUpdated
  **/
  @JsonProperty("dateUpdated")
  public Long getDateUpdated() {
    return dateUpdated;
  }

  public void setDateUpdated(Long dateUpdated) {
    this.dateUpdated = dateUpdated;
  }

  public AlbumFullResponse dateUpdated(Long dateUpdated) {
    this.dateUpdated = dateUpdated;
    return this;
  }

 /**
   * Get cellPhone
   * @return cellPhone
  **/
  @JsonProperty("cellPhone")
  public String getCellPhone() {
    return cellPhone;
  }

  public void setCellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
  }

  public AlbumFullResponse cellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
    return this;
  }

 /**
   * Get fullAddress
   * @return fullAddress
  **/
  @JsonProperty("fullAddress")
  public String getFullAddress() {
    return fullAddress;
  }

  public void setFullAddress(String fullAddress) {
    this.fullAddress = fullAddress;
  }

  public AlbumFullResponse fullAddress(String fullAddress) {
    this.fullAddress = fullAddress;
    return this;
  }

 /**
   * Get approvalStatus
   * @return approvalStatus
  **/
  @JsonProperty("approvalStatus")
  public String getApprovalStatus() {
    if (approvalStatus == null) {
      return null;
    }
    return approvalStatus.value();
  }

  public void setApprovalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public AlbumFullResponse approvalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

 /**
   * Get favoriteCount
   * @return favoriteCount
  **/
  @JsonProperty("favoriteCount")
  public Long getFavoriteCount() {
    return favoriteCount;
  }

  public void setFavoriteCount(Long favoriteCount) {
    this.favoriteCount = favoriteCount;
  }

  public AlbumFullResponse favoriteCount(Long favoriteCount) {
    this.favoriteCount = favoriteCount;
    return this;
  }

 /**
   * Get liked
   * @return liked
  **/
  @JsonProperty("liked")
  public Boolean getLiked() {
    return liked;
  }

  public void setLiked(Boolean liked) {
    this.liked = liked;
  }

  public AlbumFullResponse liked(Boolean liked) {
    this.liked = liked;
    return this;
  }

 /**
   * Get favorite
   * @return favorite
  **/
  @JsonProperty("favorite")
  public Boolean getFavorite() {
    return favorite;
  }

  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }

  public AlbumFullResponse favorite(Boolean favorite) {
    this.favorite = favorite;
    return this;
  }

 /**
   * Get favoriteId
   * @return favoriteId
  **/
  @JsonProperty("favoriteId")
  public Long getFavoriteId() {
    return favoriteId;
  }

  public void setFavoriteId(Long favoriteId) {
    this.favoriteId = favoriteId;
  }

  public AlbumFullResponse favoriteId(Long favoriteId) {
    this.favoriteId = favoriteId;
    return this;
  }

 /**
   * Get anonymous
   * @return anonymous
  **/
  @JsonProperty("anonymous")
  public Boolean getAnonymous() {
    return anonymous;
  }

  public void setAnonymous(Boolean anonymous) {
    this.anonymous = anonymous;
  }

  public AlbumFullResponse anonymous(Boolean anonymous) {
    this.anonymous = anonymous;
    return this;
  }

 /**
   * Get flagCount
   * @return flagCount
  **/
  @JsonProperty("flagCount")
  public Long getFlagCount() {
    return flagCount;
  }

  public void setFlagCount(Long flagCount) {
    this.flagCount = flagCount;
  }

  public AlbumFullResponse flagCount(Long flagCount) {
    this.flagCount = flagCount;
    return this;
  }

 /**
   * Get viewedCount
   * @return viewedCount
  **/
  @JsonProperty("viewedCount")
  public Long getViewedCount() {
    return viewedCount;
  }

  public void setViewedCount(Long viewedCount) {
    this.viewedCount = viewedCount;
  }

  public AlbumFullResponse viewedCount(Long viewedCount) {
    this.viewedCount = viewedCount;
    return this;
  }

 /**
   * Get clickedCount
   * @return clickedCount
  **/
  @JsonProperty("clickedCount")
  public Long getClickedCount() {
    return clickedCount;
  }

  public void setClickedCount(Long clickedCount) {
    this.clickedCount = clickedCount;
  }

  public AlbumFullResponse clickedCount(Long clickedCount) {
    this.clickedCount = clickedCount;
    return this;
  }

 /**
   * Get sharedCount
   * @return sharedCount
  **/
  @JsonProperty("sharedCount")
  public Long getSharedCount() {
    return sharedCount;
  }

  public void setSharedCount(Long sharedCount) {
    this.sharedCount = sharedCount;
  }

  public AlbumFullResponse sharedCount(Long sharedCount) {
    this.sharedCount = sharedCount;
    return this;
  }

 /**
   * Get assets
   * @return assets
  **/
  @JsonProperty("assets")
  public List<@Valid AssetResponse> getAssets() {
    return assets;
  }

  public void setAssets(List<@Valid AssetResponse> assets) {
    this.assets = assets;
  }

  public AlbumFullResponse assets(List<@Valid AssetResponse> assets) {
    this.assets = assets;
    return this;
  }

  public AlbumFullResponse addAssetsItem(AssetResponse assetsItem) {
    this.assets.add(assetsItem);
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

  public AlbumFullResponse comments(List<@Valid NoteFullResponse> comments) {
    this.comments = comments;
    return this;
  }

  public AlbumFullResponse addCommentsItem(NoteFullResponse commentsItem) {
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

  public AlbumFullResponse likes(List<@Valid LikeResponse> likes) {
    this.likes = likes;
    return this;
  }

  public AlbumFullResponse addLikesItem(LikeResponse likesItem) {
    this.likes.add(likesItem);
    return this;
  }

 /**
   * Get connectionGroups
   * @return connectionGroups
  **/
  @JsonProperty("connectionGroups")
  public List<@Valid ConnectionGroupShortResponse> getConnectionGroups() {
    return connectionGroups;
  }

  public void setConnectionGroups(List<@Valid ConnectionGroupShortResponse> connectionGroups) {
    this.connectionGroups = connectionGroups;
  }

  public AlbumFullResponse connectionGroups(List<@Valid ConnectionGroupShortResponse> connectionGroups) {
    this.connectionGroups = connectionGroups;
    return this;
  }

  public AlbumFullResponse addConnectionGroupsItem(ConnectionGroupShortResponse connectionGroupsItem) {
    this.connectionGroups.add(connectionGroupsItem);
    return this;
  }

 /**
   * Get connections
   * @return connections
  **/
  @JsonProperty("connections")
  public List<@Valid ConnectionResponse> getConnections() {
    return connections;
  }

  public void setConnections(List<@Valid ConnectionResponse> connections) {
    this.connections = connections;
  }

  public AlbumFullResponse connections(List<@Valid ConnectionResponse> connections) {
    this.connections = connections;
    return this;
  }

  public AlbumFullResponse addConnectionsItem(ConnectionResponse connectionsItem) {
    this.connections.add(connectionsItem);
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

  public AlbumFullResponse hasLiked(Boolean hasLiked) {
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

  public AlbumFullResponse hasDisliked(Boolean hasDisliked) {
    this.hasDisliked = hasDisliked;
    return this;
  }

 /**
   * Get userPermissions
   * @return userPermissions
  **/
  @JsonProperty("userPermissions")
  public Permissions getUserPermissions() {
    return userPermissions;
  }

  public void setUserPermissions(Permissions userPermissions) {
    this.userPermissions = userPermissions;
  }

  public AlbumFullResponse userPermissions(Permissions userPermissions) {
    this.userPermissions = userPermissions;
    return this;
  }

 /**
   * Get publicPermissions
   * @return publicPermissions
  **/
  @JsonProperty("publicPermissions")
  public Permissions getPublicPermissions() {
    return publicPermissions;
  }

  public void setPublicPermissions(Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
  }

  public AlbumFullResponse publicPermissions(Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
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

  public AlbumFullResponse returning(String returning) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

