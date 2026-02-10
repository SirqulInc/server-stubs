package apimodels;

import apimodels.AccountShortResponse;
import apimodels.AssetResponse;
import apimodels.ConnectionGroupShortResponse;
import apimodels.ConnectionResponse;
import apimodels.LikeResponse;
import apimodels.NameStringValueResponse;
import apimodels.NoteFullResponse;
import apimodels.Permissions;
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
 * AlbumFullResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AlbumFullResponse   {
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

  @JsonProperty("albumId")
  
  private Long albumId;

  @JsonProperty("albumType")
  
  private String albumType;

  @JsonProperty("ownerId")
  
  private Long ownerId;

  @JsonProperty("owner")
  @Valid

  private AccountShortResponse owner;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("coverAsset")
  @Valid

  private AssetResponse coverAsset;

  @JsonProperty("tags")
  
  private String tags;

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

  @JsonProperty("visibility")
  
  private VisibilityEnum visibility;

  @JsonProperty("startDate")
  
  private Long startDate;

  @JsonProperty("endDate")
  
  private Long endDate;

  @JsonProperty("assetCount")
  
  private Integer assetCount;

  @JsonProperty("likeCount")
  
  private Long likeCount;

  @JsonProperty("dislikeCount")
  
  private Long dislikeCount;

  @JsonProperty("commentsCount")
  
  private Long commentsCount;

  @JsonProperty("userCount")
  
  private Integer userCount;

  @JsonProperty("notifications")
  
  private Boolean notifications;

  @JsonProperty("latitude")
  
  private Double latitude;

  @JsonProperty("longitude")
  
  private Double longitude;

  @JsonProperty("locationDescription")
  
  private String locationDescription;

  @JsonProperty("distance")
  
  private Double distance;

  @JsonProperty("dateCreated")
  
  private Long dateCreated;

  @JsonProperty("dateUpdated")
  
  private Long dateUpdated;

  @JsonProperty("cellPhone")
  
  private String cellPhone;

  @JsonProperty("fullAddress")
  
  private String fullAddress;

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

  @JsonProperty("approvalStatus")
  
  private ApprovalStatusEnum approvalStatus;

  @JsonProperty("favoriteCount")
  
  private Long favoriteCount;

  @JsonProperty("liked")
  
  private Boolean liked;

  @JsonProperty("favorite")
  
  private Boolean favorite;

  @JsonProperty("favoriteId")
  
  private Long favoriteId;

  @JsonProperty("anonymous")
  
  private Boolean anonymous;

  @JsonProperty("flagCount")
  
  private Long flagCount;

  @JsonProperty("viewedCount")
  
  private Long viewedCount;

  @JsonProperty("clickedCount")
  
  private Long clickedCount;

  @JsonProperty("sharedCount")
  
  private Long sharedCount;

  @JsonProperty("assets")
  @Valid

  private List<@Valid AssetResponse> assets = null;

  @JsonProperty("comments")
  @Valid

  private List<@Valid NoteFullResponse> comments = null;

  @JsonProperty("likes")
  @Valid

  private List<@Valid LikeResponse> likes = null;

  @JsonProperty("connectionGroups")
  @Valid

  private List<@Valid ConnectionGroupShortResponse> connectionGroups = null;

  @JsonProperty("connections")
  @Valid

  private List<@Valid ConnectionResponse> connections = null;

  @JsonProperty("hasLiked")
  
  private Boolean hasLiked;

  @JsonProperty("hasDisliked")
  
  private Boolean hasDisliked;

  @JsonProperty("userPermissions")
  @Valid

  private Permissions userPermissions;

  @JsonProperty("publicPermissions")
  @Valid

  private Permissions publicPermissions;

  @JsonProperty("returning")
  
  private String returning;

  public AlbumFullResponse valid(Boolean valid) {
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

  public AlbumFullResponse message(String message) {
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

  public AlbumFullResponse version(Double version) {
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

  public AlbumFullResponse serializeNulls(Boolean serializeNulls) {
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

  public AlbumFullResponse startTimeLog(Long startTimeLog) {
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

  public AlbumFullResponse errorCode(String errorCode) {
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
  **/
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public AlbumFullResponse albumId(Long albumId) {
    this.albumId = albumId;
    return this;
  }

   /**
   * Get albumId
   * @return albumId
  **/
  public Long getAlbumId() {
    return albumId;
  }

  public void setAlbumId(Long albumId) {
    this.albumId = albumId;
  }

  public AlbumFullResponse albumType(String albumType) {
    this.albumType = albumType;
    return this;
  }

   /**
   * Get albumType
   * @return albumType
  **/
  public String getAlbumType() {
    return albumType;
  }

  public void setAlbumType(String albumType) {
    this.albumType = albumType;
  }

  public AlbumFullResponse ownerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public AlbumFullResponse owner(AccountShortResponse owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  public AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  public AlbumFullResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AlbumFullResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AlbumFullResponse coverAsset(AssetResponse coverAsset) {
    this.coverAsset = coverAsset;
    return this;
  }

   /**
   * Get coverAsset
   * @return coverAsset
  **/
  public AssetResponse getCoverAsset() {
    return coverAsset;
  }

  public void setCoverAsset(AssetResponse coverAsset) {
    this.coverAsset = coverAsset;
  }

  public AlbumFullResponse tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public AlbumFullResponse visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public AlbumFullResponse startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public AlbumFullResponse endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public AlbumFullResponse assetCount(Integer assetCount) {
    this.assetCount = assetCount;
    return this;
  }

   /**
   * Get assetCount
   * @return assetCount
  **/
  public Integer getAssetCount() {
    return assetCount;
  }

  public void setAssetCount(Integer assetCount) {
    this.assetCount = assetCount;
  }

  public AlbumFullResponse likeCount(Long likeCount) {
    this.likeCount = likeCount;
    return this;
  }

   /**
   * Get likeCount
   * @return likeCount
  **/
  public Long getLikeCount() {
    return likeCount;
  }

  public void setLikeCount(Long likeCount) {
    this.likeCount = likeCount;
  }

  public AlbumFullResponse dislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
    return this;
  }

   /**
   * Get dislikeCount
   * @return dislikeCount
  **/
  public Long getDislikeCount() {
    return dislikeCount;
  }

  public void setDislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
  }

  public AlbumFullResponse commentsCount(Long commentsCount) {
    this.commentsCount = commentsCount;
    return this;
  }

   /**
   * Get commentsCount
   * @return commentsCount
  **/
  public Long getCommentsCount() {
    return commentsCount;
  }

  public void setCommentsCount(Long commentsCount) {
    this.commentsCount = commentsCount;
  }

  public AlbumFullResponse userCount(Integer userCount) {
    this.userCount = userCount;
    return this;
  }

   /**
   * Get userCount
   * @return userCount
  **/
  public Integer getUserCount() {
    return userCount;
  }

  public void setUserCount(Integer userCount) {
    this.userCount = userCount;
  }

  public AlbumFullResponse notifications(Boolean notifications) {
    this.notifications = notifications;
    return this;
  }

   /**
   * Get notifications
   * @return notifications
  **/
  public Boolean getNotifications() {
    return notifications;
  }

  public void setNotifications(Boolean notifications) {
    this.notifications = notifications;
  }

  public AlbumFullResponse latitude(Double latitude) {
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

  public AlbumFullResponse longitude(Double longitude) {
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

  public AlbumFullResponse locationDescription(String locationDescription) {
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

  public AlbumFullResponse distance(Double distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public AlbumFullResponse dateCreated(Long dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  public Long getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(Long dateCreated) {
    this.dateCreated = dateCreated;
  }

  public AlbumFullResponse dateUpdated(Long dateUpdated) {
    this.dateUpdated = dateUpdated;
    return this;
  }

   /**
   * Get dateUpdated
   * @return dateUpdated
  **/
  public Long getDateUpdated() {
    return dateUpdated;
  }

  public void setDateUpdated(Long dateUpdated) {
    this.dateUpdated = dateUpdated;
  }

  public AlbumFullResponse cellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
    return this;
  }

   /**
   * Get cellPhone
   * @return cellPhone
  **/
  public String getCellPhone() {
    return cellPhone;
  }

  public void setCellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
  }

  public AlbumFullResponse fullAddress(String fullAddress) {
    this.fullAddress = fullAddress;
    return this;
  }

   /**
   * Get fullAddress
   * @return fullAddress
  **/
  public String getFullAddress() {
    return fullAddress;
  }

  public void setFullAddress(String fullAddress) {
    this.fullAddress = fullAddress;
  }

  public AlbumFullResponse approvalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

   /**
   * Get approvalStatus
   * @return approvalStatus
  **/
  public ApprovalStatusEnum getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public AlbumFullResponse favoriteCount(Long favoriteCount) {
    this.favoriteCount = favoriteCount;
    return this;
  }

   /**
   * Get favoriteCount
   * @return favoriteCount
  **/
  public Long getFavoriteCount() {
    return favoriteCount;
  }

  public void setFavoriteCount(Long favoriteCount) {
    this.favoriteCount = favoriteCount;
  }

  public AlbumFullResponse liked(Boolean liked) {
    this.liked = liked;
    return this;
  }

   /**
   * Get liked
   * @return liked
  **/
  public Boolean getLiked() {
    return liked;
  }

  public void setLiked(Boolean liked) {
    this.liked = liked;
  }

  public AlbumFullResponse favorite(Boolean favorite) {
    this.favorite = favorite;
    return this;
  }

   /**
   * Get favorite
   * @return favorite
  **/
  public Boolean getFavorite() {
    return favorite;
  }

  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }

  public AlbumFullResponse favoriteId(Long favoriteId) {
    this.favoriteId = favoriteId;
    return this;
  }

   /**
   * Get favoriteId
   * @return favoriteId
  **/
  public Long getFavoriteId() {
    return favoriteId;
  }

  public void setFavoriteId(Long favoriteId) {
    this.favoriteId = favoriteId;
  }

  public AlbumFullResponse anonymous(Boolean anonymous) {
    this.anonymous = anonymous;
    return this;
  }

   /**
   * Get anonymous
   * @return anonymous
  **/
  public Boolean getAnonymous() {
    return anonymous;
  }

  public void setAnonymous(Boolean anonymous) {
    this.anonymous = anonymous;
  }

  public AlbumFullResponse flagCount(Long flagCount) {
    this.flagCount = flagCount;
    return this;
  }

   /**
   * Get flagCount
   * @return flagCount
  **/
  public Long getFlagCount() {
    return flagCount;
  }

  public void setFlagCount(Long flagCount) {
    this.flagCount = flagCount;
  }

  public AlbumFullResponse viewedCount(Long viewedCount) {
    this.viewedCount = viewedCount;
    return this;
  }

   /**
   * Get viewedCount
   * @return viewedCount
  **/
  public Long getViewedCount() {
    return viewedCount;
  }

  public void setViewedCount(Long viewedCount) {
    this.viewedCount = viewedCount;
  }

  public AlbumFullResponse clickedCount(Long clickedCount) {
    this.clickedCount = clickedCount;
    return this;
  }

   /**
   * Get clickedCount
   * @return clickedCount
  **/
  public Long getClickedCount() {
    return clickedCount;
  }

  public void setClickedCount(Long clickedCount) {
    this.clickedCount = clickedCount;
  }

  public AlbumFullResponse sharedCount(Long sharedCount) {
    this.sharedCount = sharedCount;
    return this;
  }

   /**
   * Get sharedCount
   * @return sharedCount
  **/
  public Long getSharedCount() {
    return sharedCount;
  }

  public void setSharedCount(Long sharedCount) {
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
  public List<@Valid ConnectionResponse> getConnections() {
    return connections;
  }

  public void setConnections(List<@Valid ConnectionResponse> connections) {
    this.connections = connections;
  }

  public AlbumFullResponse hasLiked(Boolean hasLiked) {
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

  public AlbumFullResponse hasDisliked(Boolean hasDisliked) {
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

  public AlbumFullResponse userPermissions(Permissions userPermissions) {
    this.userPermissions = userPermissions;
    return this;
  }

   /**
   * Get userPermissions
   * @return userPermissions
  **/
  public Permissions getUserPermissions() {
    return userPermissions;
  }

  public void setUserPermissions(Permissions userPermissions) {
    this.userPermissions = userPermissions;
  }

  public AlbumFullResponse publicPermissions(Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
    return this;
  }

   /**
   * Get publicPermissions
   * @return publicPermissions
  **/
  public Permissions getPublicPermissions() {
    return publicPermissions;
  }

  public void setPublicPermissions(Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
  }

  public AlbumFullResponse returning(String returning) {
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
    AlbumFullResponse albumFullResponse = (AlbumFullResponse) o;
    return Objects.equals(valid, albumFullResponse.valid) &&
        Objects.equals(message, albumFullResponse.message) &&
        Objects.equals(version, albumFullResponse.version) &&
        Objects.equals(serializeNulls, albumFullResponse.serializeNulls) &&
        Objects.equals(startTimeLog, albumFullResponse.startTimeLog) &&
        Objects.equals(errorCode, albumFullResponse.errorCode) &&
        Objects.equals(request, albumFullResponse.request) &&
        Objects.equals(albumId, albumFullResponse.albumId) &&
        Objects.equals(albumType, albumFullResponse.albumType) &&
        Objects.equals(ownerId, albumFullResponse.ownerId) &&
        Objects.equals(owner, albumFullResponse.owner) &&
        Objects.equals(title, albumFullResponse.title) &&
        Objects.equals(description, albumFullResponse.description) &&
        Objects.equals(coverAsset, albumFullResponse.coverAsset) &&
        Objects.equals(tags, albumFullResponse.tags) &&
        Objects.equals(visibility, albumFullResponse.visibility) &&
        Objects.equals(startDate, albumFullResponse.startDate) &&
        Objects.equals(endDate, albumFullResponse.endDate) &&
        Objects.equals(assetCount, albumFullResponse.assetCount) &&
        Objects.equals(likeCount, albumFullResponse.likeCount) &&
        Objects.equals(dislikeCount, albumFullResponse.dislikeCount) &&
        Objects.equals(commentsCount, albumFullResponse.commentsCount) &&
        Objects.equals(userCount, albumFullResponse.userCount) &&
        Objects.equals(notifications, albumFullResponse.notifications) &&
        Objects.equals(latitude, albumFullResponse.latitude) &&
        Objects.equals(longitude, albumFullResponse.longitude) &&
        Objects.equals(locationDescription, albumFullResponse.locationDescription) &&
        Objects.equals(distance, albumFullResponse.distance) &&
        Objects.equals(dateCreated, albumFullResponse.dateCreated) &&
        Objects.equals(dateUpdated, albumFullResponse.dateUpdated) &&
        Objects.equals(cellPhone, albumFullResponse.cellPhone) &&
        Objects.equals(fullAddress, albumFullResponse.fullAddress) &&
        Objects.equals(approvalStatus, albumFullResponse.approvalStatus) &&
        Objects.equals(favoriteCount, albumFullResponse.favoriteCount) &&
        Objects.equals(liked, albumFullResponse.liked) &&
        Objects.equals(favorite, albumFullResponse.favorite) &&
        Objects.equals(favoriteId, albumFullResponse.favoriteId) &&
        Objects.equals(anonymous, albumFullResponse.anonymous) &&
        Objects.equals(flagCount, albumFullResponse.flagCount) &&
        Objects.equals(viewedCount, albumFullResponse.viewedCount) &&
        Objects.equals(clickedCount, albumFullResponse.clickedCount) &&
        Objects.equals(sharedCount, albumFullResponse.sharedCount) &&
        Objects.equals(assets, albumFullResponse.assets) &&
        Objects.equals(comments, albumFullResponse.comments) &&
        Objects.equals(likes, albumFullResponse.likes) &&
        Objects.equals(connectionGroups, albumFullResponse.connectionGroups) &&
        Objects.equals(connections, albumFullResponse.connections) &&
        Objects.equals(hasLiked, albumFullResponse.hasLiked) &&
        Objects.equals(hasDisliked, albumFullResponse.hasDisliked) &&
        Objects.equals(userPermissions, albumFullResponse.userPermissions) &&
        Objects.equals(publicPermissions, albumFullResponse.publicPermissions) &&
        Objects.equals(returning, albumFullResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, albumId, albumType, ownerId, owner, title, description, coverAsset, tags, visibility, startDate, endDate, assetCount, likeCount, dislikeCount, commentsCount, userCount, notifications, latitude, longitude, locationDescription, distance, dateCreated, dateUpdated, cellPhone, fullAddress, approvalStatus, favoriteCount, liked, favorite, favoriteId, anonymous, flagCount, viewedCount, clickedCount, sharedCount, assets, comments, likes, connectionGroups, connections, hasLiked, hasDisliked, userPermissions, publicPermissions, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

