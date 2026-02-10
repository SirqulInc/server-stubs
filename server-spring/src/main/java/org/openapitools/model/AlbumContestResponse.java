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
import org.openapitools.model.AlbumFullResponse;
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
 * AlbumContestResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AlbumContestResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  private @Nullable Long albumContestId;

  private @Nullable String contestType;

  private @Nullable AccountShortResponse owner;

  private @Nullable String title;

  private @Nullable String description;

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

  private @Nullable Long likeCount;

  private @Nullable Long dislikeCount;

  private @Nullable Integer commentsCount;

  private @Nullable Integer userCount;

  @Valid
  private List<@Valid NoteFullResponse> comments = new ArrayList<>();

  @Valid
  private List<@Valid LikeResponse> likes = new ArrayList<>();

  @Valid
  private List<@Valid ConnectionGroupShortResponse> connectionGroups = new ArrayList<>();

  @Valid
  private List<@Valid ConnectionResponse> connections = new ArrayList<>();

  private @Nullable Boolean hasLiked;

  private @Nullable Permissions userPermissions;

  private @Nullable Permissions publicPermissions;

  private @Nullable AlbumFullResponse album1;

  private @Nullable AlbumFullResponse album2;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable String locationDescription;

  private @Nullable Double distance;

  private @Nullable Long dateCreated;

  private @Nullable Long dateUpdated;

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

  private @Nullable Long voteCount;

  private @Nullable String returning;

  public AlbumContestResponse valid(@Nullable Boolean valid) {
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

  public AlbumContestResponse message(@Nullable String message) {
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

  public AlbumContestResponse version(@Nullable Double version) {
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

  public AlbumContestResponse serializeNulls(@Nullable Boolean serializeNulls) {
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

  public AlbumContestResponse startTimeLog(@Nullable Long startTimeLog) {
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

  public AlbumContestResponse errorCode(@Nullable String errorCode) {
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

  public AlbumContestResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public AlbumContestResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public AlbumContestResponse albumContestId(@Nullable Long albumContestId) {
    this.albumContestId = albumContestId;
    return this;
  }

  /**
   * Get albumContestId
   * @return albumContestId
   */
  
  @Schema(name = "albumContestId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("albumContestId")
  public @Nullable Long getAlbumContestId() {
    return albumContestId;
  }

  public void setAlbumContestId(@Nullable Long albumContestId) {
    this.albumContestId = albumContestId;
  }

  public AlbumContestResponse contestType(@Nullable String contestType) {
    this.contestType = contestType;
    return this;
  }

  /**
   * Get contestType
   * @return contestType
   */
  
  @Schema(name = "contestType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contestType")
  public @Nullable String getContestType() {
    return contestType;
  }

  public void setContestType(@Nullable String contestType) {
    this.contestType = contestType;
  }

  public AlbumContestResponse owner(@Nullable AccountShortResponse owner) {
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

  public AlbumContestResponse title(@Nullable String title) {
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

  public AlbumContestResponse description(@Nullable String description) {
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

  public AlbumContestResponse visibility(@Nullable VisibilityEnum visibility) {
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

  public AlbumContestResponse startDate(@Nullable Long startDate) {
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

  public AlbumContestResponse endDate(@Nullable Long endDate) {
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

  public AlbumContestResponse likeCount(@Nullable Long likeCount) {
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

  public AlbumContestResponse dislikeCount(@Nullable Long dislikeCount) {
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

  public AlbumContestResponse commentsCount(@Nullable Integer commentsCount) {
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

  public AlbumContestResponse userCount(@Nullable Integer userCount) {
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

  public AlbumContestResponse comments(List<@Valid NoteFullResponse> comments) {
    this.comments = comments;
    return this;
  }

  public AlbumContestResponse addCommentsItem(NoteFullResponse commentsItem) {
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

  public AlbumContestResponse likes(List<@Valid LikeResponse> likes) {
    this.likes = likes;
    return this;
  }

  public AlbumContestResponse addLikesItem(LikeResponse likesItem) {
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

  public AlbumContestResponse connectionGroups(List<@Valid ConnectionGroupShortResponse> connectionGroups) {
    this.connectionGroups = connectionGroups;
    return this;
  }

  public AlbumContestResponse addConnectionGroupsItem(ConnectionGroupShortResponse connectionGroupsItem) {
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

  public AlbumContestResponse connections(List<@Valid ConnectionResponse> connections) {
    this.connections = connections;
    return this;
  }

  public AlbumContestResponse addConnectionsItem(ConnectionResponse connectionsItem) {
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

  public AlbumContestResponse hasLiked(@Nullable Boolean hasLiked) {
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

  public AlbumContestResponse userPermissions(@Nullable Permissions userPermissions) {
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

  public AlbumContestResponse publicPermissions(@Nullable Permissions publicPermissions) {
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

  public AlbumContestResponse album1(@Nullable AlbumFullResponse album1) {
    this.album1 = album1;
    return this;
  }

  /**
   * Get album1
   * @return album1
   */
  @Valid 
  @Schema(name = "album1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("album1")
  public @Nullable AlbumFullResponse getAlbum1() {
    return album1;
  }

  public void setAlbum1(@Nullable AlbumFullResponse album1) {
    this.album1 = album1;
  }

  public AlbumContestResponse album2(@Nullable AlbumFullResponse album2) {
    this.album2 = album2;
    return this;
  }

  /**
   * Get album2
   * @return album2
   */
  @Valid 
  @Schema(name = "album2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("album2")
  public @Nullable AlbumFullResponse getAlbum2() {
    return album2;
  }

  public void setAlbum2(@Nullable AlbumFullResponse album2) {
    this.album2 = album2;
  }

  public AlbumContestResponse latitude(@Nullable Double latitude) {
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

  public AlbumContestResponse longitude(@Nullable Double longitude) {
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

  public AlbumContestResponse locationDescription(@Nullable String locationDescription) {
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

  public AlbumContestResponse distance(@Nullable Double distance) {
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

  public AlbumContestResponse dateCreated(@Nullable Long dateCreated) {
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

  public AlbumContestResponse dateUpdated(@Nullable Long dateUpdated) {
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

  public AlbumContestResponse approvalStatus(@Nullable ApprovalStatusEnum approvalStatus) {
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

  public AlbumContestResponse voteCount(@Nullable Long voteCount) {
    this.voteCount = voteCount;
    return this;
  }

  /**
   * Get voteCount
   * @return voteCount
   */
  
  @Schema(name = "voteCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("voteCount")
  public @Nullable Long getVoteCount() {
    return voteCount;
  }

  public void setVoteCount(@Nullable Long voteCount) {
    this.voteCount = voteCount;
  }

  public AlbumContestResponse returning(@Nullable String returning) {
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
    AlbumContestResponse albumContestResponse = (AlbumContestResponse) o;
    return Objects.equals(this.valid, albumContestResponse.valid) &&
        Objects.equals(this.message, albumContestResponse.message) &&
        Objects.equals(this.version, albumContestResponse.version) &&
        Objects.equals(this.serializeNulls, albumContestResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, albumContestResponse.startTimeLog) &&
        Objects.equals(this.errorCode, albumContestResponse.errorCode) &&
        Objects.equals(this.request, albumContestResponse.request) &&
        Objects.equals(this.albumContestId, albumContestResponse.albumContestId) &&
        Objects.equals(this.contestType, albumContestResponse.contestType) &&
        Objects.equals(this.owner, albumContestResponse.owner) &&
        Objects.equals(this.title, albumContestResponse.title) &&
        Objects.equals(this.description, albumContestResponse.description) &&
        Objects.equals(this.visibility, albumContestResponse.visibility) &&
        Objects.equals(this.startDate, albumContestResponse.startDate) &&
        Objects.equals(this.endDate, albumContestResponse.endDate) &&
        Objects.equals(this.likeCount, albumContestResponse.likeCount) &&
        Objects.equals(this.dislikeCount, albumContestResponse.dislikeCount) &&
        Objects.equals(this.commentsCount, albumContestResponse.commentsCount) &&
        Objects.equals(this.userCount, albumContestResponse.userCount) &&
        Objects.equals(this.comments, albumContestResponse.comments) &&
        Objects.equals(this.likes, albumContestResponse.likes) &&
        Objects.equals(this.connectionGroups, albumContestResponse.connectionGroups) &&
        Objects.equals(this.connections, albumContestResponse.connections) &&
        Objects.equals(this.hasLiked, albumContestResponse.hasLiked) &&
        Objects.equals(this.userPermissions, albumContestResponse.userPermissions) &&
        Objects.equals(this.publicPermissions, albumContestResponse.publicPermissions) &&
        Objects.equals(this.album1, albumContestResponse.album1) &&
        Objects.equals(this.album2, albumContestResponse.album2) &&
        Objects.equals(this.latitude, albumContestResponse.latitude) &&
        Objects.equals(this.longitude, albumContestResponse.longitude) &&
        Objects.equals(this.locationDescription, albumContestResponse.locationDescription) &&
        Objects.equals(this.distance, albumContestResponse.distance) &&
        Objects.equals(this.dateCreated, albumContestResponse.dateCreated) &&
        Objects.equals(this.dateUpdated, albumContestResponse.dateUpdated) &&
        Objects.equals(this.approvalStatus, albumContestResponse.approvalStatus) &&
        Objects.equals(this.voteCount, albumContestResponse.voteCount) &&
        Objects.equals(this.returning, albumContestResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, albumContestId, contestType, owner, title, description, visibility, startDate, endDate, likeCount, dislikeCount, commentsCount, userCount, comments, likes, connectionGroups, connections, hasLiked, userPermissions, publicPermissions, album1, album2, latitude, longitude, locationDescription, distance, dateCreated, dateUpdated, approvalStatus, voteCount, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlbumContestResponse {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    albumContestId: ").append(toIndentedString(albumContestId)).append("\n");
    sb.append("    contestType: ").append(toIndentedString(contestType)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    likeCount: ").append(toIndentedString(likeCount)).append("\n");
    sb.append("    dislikeCount: ").append(toIndentedString(dislikeCount)).append("\n");
    sb.append("    commentsCount: ").append(toIndentedString(commentsCount)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    connectionGroups: ").append(toIndentedString(connectionGroups)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    hasLiked: ").append(toIndentedString(hasLiked)).append("\n");
    sb.append("    userPermissions: ").append(toIndentedString(userPermissions)).append("\n");
    sb.append("    publicPermissions: ").append(toIndentedString(publicPermissions)).append("\n");
    sb.append("    album1: ").append(toIndentedString(album1)).append("\n");
    sb.append("    album2: ").append(toIndentedString(album2)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
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

