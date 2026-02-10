package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AlbumContestResponse  {
  
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

  private Long albumContestId;

  @ApiModelProperty(value = "")

  private String contestType;

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse owner;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String description;

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

  private Long likeCount;

  @ApiModelProperty(value = "")

  private Long dislikeCount;

  @ApiModelProperty(value = "")

  private Integer commentsCount;

  @ApiModelProperty(value = "")

  private Integer userCount;

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

  @Valid

  private Permissions userPermissions;

  @ApiModelProperty(value = "")

  @Valid

  private Permissions publicPermissions;

  @ApiModelProperty(value = "")

  @Valid

  private AlbumFullResponse album1;

  @ApiModelProperty(value = "")

  @Valid

  private AlbumFullResponse album2;

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

  private Long voteCount;

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

  public AlbumContestResponse valid(Boolean valid) {
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

  public AlbumContestResponse message(String message) {
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

  public AlbumContestResponse version(Double version) {
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

  public AlbumContestResponse serializeNulls(Boolean serializeNulls) {
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

  public AlbumContestResponse startTimeLog(Long startTimeLog) {
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

  public AlbumContestResponse errorCode(String errorCode) {
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

  public AlbumContestResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public AlbumContestResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get albumContestId
   * @return albumContestId
  **/
  @JsonProperty("albumContestId")
  public Long getAlbumContestId() {
    return albumContestId;
  }

  public void setAlbumContestId(Long albumContestId) {
    this.albumContestId = albumContestId;
  }

  public AlbumContestResponse albumContestId(Long albumContestId) {
    this.albumContestId = albumContestId;
    return this;
  }

 /**
   * Get contestType
   * @return contestType
  **/
  @JsonProperty("contestType")
  public String getContestType() {
    return contestType;
  }

  public void setContestType(String contestType) {
    this.contestType = contestType;
  }

  public AlbumContestResponse contestType(String contestType) {
    this.contestType = contestType;
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

  public AlbumContestResponse owner(AccountShortResponse owner) {
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

  public AlbumContestResponse title(String title) {
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

  public AlbumContestResponse description(String description) {
    this.description = description;
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

  public AlbumContestResponse visibility(VisibilityEnum visibility) {
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

  public AlbumContestResponse startDate(Long startDate) {
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

  public AlbumContestResponse endDate(Long endDate) {
    this.endDate = endDate;
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

  public AlbumContestResponse likeCount(Long likeCount) {
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

  public AlbumContestResponse dislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
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

  public AlbumContestResponse commentsCount(Integer commentsCount) {
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

  public AlbumContestResponse userCount(Integer userCount) {
    this.userCount = userCount;
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

  public AlbumContestResponse comments(List<@Valid NoteFullResponse> comments) {
    this.comments = comments;
    return this;
  }

  public AlbumContestResponse addCommentsItem(NoteFullResponse commentsItem) {
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

  public AlbumContestResponse likes(List<@Valid LikeResponse> likes) {
    this.likes = likes;
    return this;
  }

  public AlbumContestResponse addLikesItem(LikeResponse likesItem) {
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

  public AlbumContestResponse connectionGroups(List<@Valid ConnectionGroupShortResponse> connectionGroups) {
    this.connectionGroups = connectionGroups;
    return this;
  }

  public AlbumContestResponse addConnectionGroupsItem(ConnectionGroupShortResponse connectionGroupsItem) {
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

  public AlbumContestResponse connections(List<@Valid ConnectionResponse> connections) {
    this.connections = connections;
    return this;
  }

  public AlbumContestResponse addConnectionsItem(ConnectionResponse connectionsItem) {
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

  public AlbumContestResponse hasLiked(Boolean hasLiked) {
    this.hasLiked = hasLiked;
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

  public AlbumContestResponse userPermissions(Permissions userPermissions) {
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

  public AlbumContestResponse publicPermissions(Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
    return this;
  }

 /**
   * Get album1
   * @return album1
  **/
  @JsonProperty("album1")
  public AlbumFullResponse getAlbum1() {
    return album1;
  }

  public void setAlbum1(AlbumFullResponse album1) {
    this.album1 = album1;
  }

  public AlbumContestResponse album1(AlbumFullResponse album1) {
    this.album1 = album1;
    return this;
  }

 /**
   * Get album2
   * @return album2
  **/
  @JsonProperty("album2")
  public AlbumFullResponse getAlbum2() {
    return album2;
  }

  public void setAlbum2(AlbumFullResponse album2) {
    this.album2 = album2;
  }

  public AlbumContestResponse album2(AlbumFullResponse album2) {
    this.album2 = album2;
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

  public AlbumContestResponse latitude(Double latitude) {
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

  public AlbumContestResponse longitude(Double longitude) {
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

  public AlbumContestResponse locationDescription(String locationDescription) {
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

  public AlbumContestResponse distance(Double distance) {
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

  public AlbumContestResponse dateCreated(Long dateCreated) {
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

  public AlbumContestResponse dateUpdated(Long dateUpdated) {
    this.dateUpdated = dateUpdated;
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

  public AlbumContestResponse approvalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

 /**
   * Get voteCount
   * @return voteCount
  **/
  @JsonProperty("voteCount")
  public Long getVoteCount() {
    return voteCount;
  }

  public void setVoteCount(Long voteCount) {
    this.voteCount = voteCount;
  }

  public AlbumContestResponse voteCount(Long voteCount) {
    this.voteCount = voteCount;
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

  public AlbumContestResponse returning(String returning) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

