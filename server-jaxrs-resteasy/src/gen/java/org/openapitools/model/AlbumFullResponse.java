package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AlbumFullResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private Long albumId;
  private String albumType;
  private Long ownerId;
  private AccountShortResponse owner;
  private String title;
  private String description;
  private AssetResponse coverAsset;
  private String tags;

  /**
   * Gets or Sets visibility
   */
  public enum VisibilityEnum {
    PUBLIC("PUBLIC"),

        PRIVATE("PRIVATE"),

        FRIENDS("FRIENDS");
    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private VisibilityEnum visibility;
  private Long startDate;
  private Long endDate;
  private Integer assetCount;
  private Long likeCount;
  private Long dislikeCount;
  private Long commentsCount;
  private Integer userCount;
  private Boolean notifications;
  private Double latitude;
  private Double longitude;
  private String locationDescription;
  private Double distance;
  private Long dateCreated;
  private Long dateUpdated;
  private String cellPhone;
  private String fullAddress;

  /**
   * Gets or Sets approvalStatus
   */
  public enum ApprovalStatusEnum {
    PENDING("PENDING"),

        REJECTED("REJECTED"),

        APPROVED("APPROVED"),

        FEATURED("FEATURED");
    private String value;

    ApprovalStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ApprovalStatusEnum approvalStatus;
  private Long favoriteCount;
  private Boolean liked;
  private Boolean favorite;
  private Long favoriteId;
  private Boolean anonymous;
  private Long flagCount;
  private Long viewedCount;
  private Long clickedCount;
  private Long sharedCount;
  private List<@Valid AssetResponse> assets = new ArrayList<>();
  private List<@Valid NoteFullResponse> comments = new ArrayList<>();
  private List<@Valid LikeResponse> likes = new ArrayList<>();
  private List<@Valid ConnectionGroupShortResponse> connectionGroups = new ArrayList<>();
  private List<@Valid ConnectionResponse> connections = new ArrayList<>();
  private Boolean hasLiked;
  private Boolean hasDisliked;
  private Permissions userPermissions;
  private Permissions publicPermissions;
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
  @JsonProperty("albumId")
  public Long getAlbumId() {
    return albumId;
  }
  public void setAlbumId(Long albumId) {
    this.albumId = albumId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("albumType")
  public String getAlbumType() {
    return albumType;
  }
  public void setAlbumType(String albumType) {
    this.albumType = albumType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ownerId")
  public Long getOwnerId() {
    return ownerId;
  }
  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("owner")
  @Valid
  public AccountShortResponse getOwner() {
    return owner;
  }
  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("coverAsset")
  @Valid
  public AssetResponse getCoverAsset() {
    return coverAsset;
  }
  public void setCoverAsset(AssetResponse coverAsset) {
    this.coverAsset = coverAsset;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tags")
  public String getTags() {
    return tags;
  }
  public void setTags(String tags) {
    this.tags = tags;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("visibility")
  public VisibilityEnum getVisibility() {
    return visibility;
  }
  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startDate")
  public Long getStartDate() {
    return startDate;
  }
  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }
  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("assetCount")
  public Integer getAssetCount() {
    return assetCount;
  }
  public void setAssetCount(Integer assetCount) {
    this.assetCount = assetCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("likeCount")
  public Long getLikeCount() {
    return likeCount;
  }
  public void setLikeCount(Long likeCount) {
    this.likeCount = likeCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dislikeCount")
  public Long getDislikeCount() {
    return dislikeCount;
  }
  public void setDislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("commentsCount")
  public Long getCommentsCount() {
    return commentsCount;
  }
  public void setCommentsCount(Long commentsCount) {
    this.commentsCount = commentsCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userCount")
  public Integer getUserCount() {
    return userCount;
  }
  public void setUserCount(Integer userCount) {
    this.userCount = userCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notifications")
  public Boolean getNotifications() {
    return notifications;
  }
  public void setNotifications(Boolean notifications) {
    this.notifications = notifications;
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
  @JsonProperty("distance")
  public Double getDistance() {
    return distance;
  }
  public void setDistance(Double distance) {
    this.distance = distance;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dateCreated")
  public Long getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Long dateCreated) {
    this.dateCreated = dateCreated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dateUpdated")
  public Long getDateUpdated() {
    return dateUpdated;
  }
  public void setDateUpdated(Long dateUpdated) {
    this.dateUpdated = dateUpdated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cellPhone")
  public String getCellPhone() {
    return cellPhone;
  }
  public void setCellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fullAddress")
  public String getFullAddress() {
    return fullAddress;
  }
  public void setFullAddress(String fullAddress) {
    this.fullAddress = fullAddress;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("approvalStatus")
  public ApprovalStatusEnum getApprovalStatus() {
    return approvalStatus;
  }
  public void setApprovalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("favoriteCount")
  public Long getFavoriteCount() {
    return favoriteCount;
  }
  public void setFavoriteCount(Long favoriteCount) {
    this.favoriteCount = favoriteCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("liked")
  public Boolean getLiked() {
    return liked;
  }
  public void setLiked(Boolean liked) {
    this.liked = liked;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("favorite")
  public Boolean getFavorite() {
    return favorite;
  }
  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("favoriteId")
  public Long getFavoriteId() {
    return favoriteId;
  }
  public void setFavoriteId(Long favoriteId) {
    this.favoriteId = favoriteId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("anonymous")
  public Boolean getAnonymous() {
    return anonymous;
  }
  public void setAnonymous(Boolean anonymous) {
    this.anonymous = anonymous;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flagCount")
  public Long getFlagCount() {
    return flagCount;
  }
  public void setFlagCount(Long flagCount) {
    this.flagCount = flagCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("viewedCount")
  public Long getViewedCount() {
    return viewedCount;
  }
  public void setViewedCount(Long viewedCount) {
    this.viewedCount = viewedCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("clickedCount")
  public Long getClickedCount() {
    return clickedCount;
  }
  public void setClickedCount(Long clickedCount) {
    this.clickedCount = clickedCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sharedCount")
  public Long getSharedCount() {
    return sharedCount;
  }
  public void setSharedCount(Long sharedCount) {
    this.sharedCount = sharedCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("assets")
  @Valid
  public List<@Valid AssetResponse> getAssets() {
    return assets;
  }
  public void setAssets(List<@Valid AssetResponse> assets) {
    this.assets = assets;
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
  @JsonProperty("connectionGroups")
  @Valid
  public List<@Valid ConnectionGroupShortResponse> getConnectionGroups() {
    return connectionGroups;
  }
  public void setConnectionGroups(List<@Valid ConnectionGroupShortResponse> connectionGroups) {
    this.connectionGroups = connectionGroups;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connections")
  @Valid
  public List<@Valid ConnectionResponse> getConnections() {
    return connections;
  }
  public void setConnections(List<@Valid ConnectionResponse> connections) {
    this.connections = connections;
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
  @JsonProperty("userPermissions")
  @Valid
  public Permissions getUserPermissions() {
    return userPermissions;
  }
  public void setUserPermissions(Permissions userPermissions) {
    this.userPermissions = userPermissions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("publicPermissions")
  @Valid
  public Permissions getPublicPermissions() {
    return publicPermissions;
  }
  public void setPublicPermissions(Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

