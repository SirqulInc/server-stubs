package apimodels;

import apimodels.AccountShortResponse;
import apimodels.AlbumFullResponse;
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
 * AlbumContestResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AlbumContestResponse   {
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

  @JsonProperty("albumContestId")
  
  private Long albumContestId;

  @JsonProperty("contestType")
  
  private String contestType;

  @JsonProperty("owner")
  @Valid

  private AccountShortResponse owner;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("description")
  
  private String description;

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

  @JsonProperty("likeCount")
  
  private Long likeCount;

  @JsonProperty("dislikeCount")
  
  private Long dislikeCount;

  @JsonProperty("commentsCount")
  
  private Integer commentsCount;

  @JsonProperty("userCount")
  
  private Integer userCount;

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

  @JsonProperty("userPermissions")
  @Valid

  private Permissions userPermissions;

  @JsonProperty("publicPermissions")
  @Valid

  private Permissions publicPermissions;

  @JsonProperty("album1")
  @Valid

  private AlbumFullResponse album1;

  @JsonProperty("album2")
  @Valid

  private AlbumFullResponse album2;

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

  @JsonProperty("voteCount")
  
  private Long voteCount;

  @JsonProperty("returning")
  
  private String returning;

  public AlbumContestResponse valid(Boolean valid) {
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

  public AlbumContestResponse message(String message) {
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

  public AlbumContestResponse version(Double version) {
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

  public AlbumContestResponse serializeNulls(Boolean serializeNulls) {
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

  public AlbumContestResponse startTimeLog(Long startTimeLog) {
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

  public AlbumContestResponse errorCode(String errorCode) {
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
  **/
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public AlbumContestResponse albumContestId(Long albumContestId) {
    this.albumContestId = albumContestId;
    return this;
  }

   /**
   * Get albumContestId
   * @return albumContestId
  **/
  public Long getAlbumContestId() {
    return albumContestId;
  }

  public void setAlbumContestId(Long albumContestId) {
    this.albumContestId = albumContestId;
  }

  public AlbumContestResponse contestType(String contestType) {
    this.contestType = contestType;
    return this;
  }

   /**
   * Get contestType
   * @return contestType
  **/
  public String getContestType() {
    return contestType;
  }

  public void setContestType(String contestType) {
    this.contestType = contestType;
  }

  public AlbumContestResponse owner(AccountShortResponse owner) {
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

  public AlbumContestResponse title(String title) {
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

  public AlbumContestResponse description(String description) {
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

  public AlbumContestResponse visibility(VisibilityEnum visibility) {
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

  public AlbumContestResponse startDate(Long startDate) {
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

  public AlbumContestResponse endDate(Long endDate) {
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

  public AlbumContestResponse likeCount(Long likeCount) {
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

  public AlbumContestResponse dislikeCount(Long dislikeCount) {
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

  public AlbumContestResponse commentsCount(Integer commentsCount) {
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

  public AlbumContestResponse userCount(Integer userCount) {
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
  **/
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
  **/
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
  **/
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
  **/
  public List<@Valid ConnectionResponse> getConnections() {
    return connections;
  }

  public void setConnections(List<@Valid ConnectionResponse> connections) {
    this.connections = connections;
  }

  public AlbumContestResponse hasLiked(Boolean hasLiked) {
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

  public AlbumContestResponse userPermissions(Permissions userPermissions) {
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

  public AlbumContestResponse publicPermissions(Permissions publicPermissions) {
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

  public AlbumContestResponse album1(AlbumFullResponse album1) {
    this.album1 = album1;
    return this;
  }

   /**
   * Get album1
   * @return album1
  **/
  public AlbumFullResponse getAlbum1() {
    return album1;
  }

  public void setAlbum1(AlbumFullResponse album1) {
    this.album1 = album1;
  }

  public AlbumContestResponse album2(AlbumFullResponse album2) {
    this.album2 = album2;
    return this;
  }

   /**
   * Get album2
   * @return album2
  **/
  public AlbumFullResponse getAlbum2() {
    return album2;
  }

  public void setAlbum2(AlbumFullResponse album2) {
    this.album2 = album2;
  }

  public AlbumContestResponse latitude(Double latitude) {
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

  public AlbumContestResponse longitude(Double longitude) {
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

  public AlbumContestResponse locationDescription(String locationDescription) {
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

  public AlbumContestResponse distance(Double distance) {
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

  public AlbumContestResponse dateCreated(Long dateCreated) {
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

  public AlbumContestResponse dateUpdated(Long dateUpdated) {
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

  public AlbumContestResponse approvalStatus(ApprovalStatusEnum approvalStatus) {
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

  public AlbumContestResponse voteCount(Long voteCount) {
    this.voteCount = voteCount;
    return this;
  }

   /**
   * Get voteCount
   * @return voteCount
  **/
  public Long getVoteCount() {
    return voteCount;
  }

  public void setVoteCount(Long voteCount) {
    this.voteCount = voteCount;
  }

  public AlbumContestResponse returning(String returning) {
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
    AlbumContestResponse albumContestResponse = (AlbumContestResponse) o;
    return Objects.equals(valid, albumContestResponse.valid) &&
        Objects.equals(message, albumContestResponse.message) &&
        Objects.equals(version, albumContestResponse.version) &&
        Objects.equals(serializeNulls, albumContestResponse.serializeNulls) &&
        Objects.equals(startTimeLog, albumContestResponse.startTimeLog) &&
        Objects.equals(errorCode, albumContestResponse.errorCode) &&
        Objects.equals(request, albumContestResponse.request) &&
        Objects.equals(albumContestId, albumContestResponse.albumContestId) &&
        Objects.equals(contestType, albumContestResponse.contestType) &&
        Objects.equals(owner, albumContestResponse.owner) &&
        Objects.equals(title, albumContestResponse.title) &&
        Objects.equals(description, albumContestResponse.description) &&
        Objects.equals(visibility, albumContestResponse.visibility) &&
        Objects.equals(startDate, albumContestResponse.startDate) &&
        Objects.equals(endDate, albumContestResponse.endDate) &&
        Objects.equals(likeCount, albumContestResponse.likeCount) &&
        Objects.equals(dislikeCount, albumContestResponse.dislikeCount) &&
        Objects.equals(commentsCount, albumContestResponse.commentsCount) &&
        Objects.equals(userCount, albumContestResponse.userCount) &&
        Objects.equals(comments, albumContestResponse.comments) &&
        Objects.equals(likes, albumContestResponse.likes) &&
        Objects.equals(connectionGroups, albumContestResponse.connectionGroups) &&
        Objects.equals(connections, albumContestResponse.connections) &&
        Objects.equals(hasLiked, albumContestResponse.hasLiked) &&
        Objects.equals(userPermissions, albumContestResponse.userPermissions) &&
        Objects.equals(publicPermissions, albumContestResponse.publicPermissions) &&
        Objects.equals(album1, albumContestResponse.album1) &&
        Objects.equals(album2, albumContestResponse.album2) &&
        Objects.equals(latitude, albumContestResponse.latitude) &&
        Objects.equals(longitude, albumContestResponse.longitude) &&
        Objects.equals(locationDescription, albumContestResponse.locationDescription) &&
        Objects.equals(distance, albumContestResponse.distance) &&
        Objects.equals(dateCreated, albumContestResponse.dateCreated) &&
        Objects.equals(dateUpdated, albumContestResponse.dateUpdated) &&
        Objects.equals(approvalStatus, albumContestResponse.approvalStatus) &&
        Objects.equals(voteCount, albumContestResponse.voteCount) &&
        Objects.equals(returning, albumContestResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, albumContestId, contestType, owner, title, description, visibility, startDate, endDate, likeCount, dislikeCount, commentsCount, userCount, comments, likes, connectionGroups, connections, hasLiked, userPermissions, publicPermissions, album1, album2, latitude, longitude, locationDescription, distance, dateCreated, dateUpdated, approvalStatus, voteCount, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

