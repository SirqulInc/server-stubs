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
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AlbumResponse   {
  
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
    AlbumResponse albumResponse = (AlbumResponse) o;
    return Objects.equals(this.valid, albumResponse.valid) &&
        Objects.equals(this.message, albumResponse.message) &&
        Objects.equals(this.version, albumResponse.version) &&
        Objects.equals(this.serializeNulls, albumResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, albumResponse.startTimeLog) &&
        Objects.equals(this.errorCode, albumResponse.errorCode) &&
        Objects.equals(this.request, albumResponse.request) &&
        Objects.equals(this.albumId, albumResponse.albumId) &&
        Objects.equals(this.albumType, albumResponse.albumType) &&
        Objects.equals(this.ownerId, albumResponse.ownerId) &&
        Objects.equals(this.owner, albumResponse.owner) &&
        Objects.equals(this.title, albumResponse.title) &&
        Objects.equals(this.description, albumResponse.description) &&
        Objects.equals(this.coverAsset, albumResponse.coverAsset) &&
        Objects.equals(this.tags, albumResponse.tags) &&
        Objects.equals(this.visibility, albumResponse.visibility) &&
        Objects.equals(this.startDate, albumResponse.startDate) &&
        Objects.equals(this.endDate, albumResponse.endDate) &&
        Objects.equals(this.assetCount, albumResponse.assetCount) &&
        Objects.equals(this.likeCount, albumResponse.likeCount) &&
        Objects.equals(this.dislikeCount, albumResponse.dislikeCount) &&
        Objects.equals(this.commentsCount, albumResponse.commentsCount) &&
        Objects.equals(this.userCount, albumResponse.userCount) &&
        Objects.equals(this.notifications, albumResponse.notifications) &&
        Objects.equals(this.latitude, albumResponse.latitude) &&
        Objects.equals(this.longitude, albumResponse.longitude) &&
        Objects.equals(this.locationDescription, albumResponse.locationDescription) &&
        Objects.equals(this.distance, albumResponse.distance) &&
        Objects.equals(this.dateCreated, albumResponse.dateCreated) &&
        Objects.equals(this.dateUpdated, albumResponse.dateUpdated) &&
        Objects.equals(this.cellPhone, albumResponse.cellPhone) &&
        Objects.equals(this.fullAddress, albumResponse.fullAddress) &&
        Objects.equals(this.approvalStatus, albumResponse.approvalStatus) &&
        Objects.equals(this.favoriteCount, albumResponse.favoriteCount) &&
        Objects.equals(this.liked, albumResponse.liked) &&
        Objects.equals(this.favorite, albumResponse.favorite) &&
        Objects.equals(this.favoriteId, albumResponse.favoriteId) &&
        Objects.equals(this.anonymous, albumResponse.anonymous) &&
        Objects.equals(this.flagCount, albumResponse.flagCount) &&
        Objects.equals(this.viewedCount, albumResponse.viewedCount) &&
        Objects.equals(this.clickedCount, albumResponse.clickedCount) &&
        Objects.equals(this.sharedCount, albumResponse.sharedCount) &&
        Objects.equals(this.returning, albumResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, albumId, albumType, ownerId, owner, title, description, coverAsset, tags, visibility, startDate, endDate, assetCount, likeCount, dislikeCount, commentsCount, userCount, notifications, latitude, longitude, locationDescription, distance, dateCreated, dateUpdated, cellPhone, fullAddress, approvalStatus, favoriteCount, liked, favorite, favoriteId, anonymous, flagCount, viewedCount, clickedCount, sharedCount, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlbumResponse {\n");
    
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

