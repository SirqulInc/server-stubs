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
import org.openapitools.model.AlbumFullResponse;
import org.openapitools.model.ConnectionGroupShortResponse;
import org.openapitools.model.ConnectionResponse;
import org.openapitools.model.LikeResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.NoteFullResponse;
import org.openapitools.model.Permissions;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AlbumContestResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private Long albumContestId;
  private String contestType;
  private AccountShortResponse owner;
  private String title;
  private String description;

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
  private Long likeCount;
  private Long dislikeCount;
  private Integer commentsCount;
  private Integer userCount;
  private List<@Valid NoteFullResponse> comments = new ArrayList<>();
  private List<@Valid LikeResponse> likes = new ArrayList<>();
  private List<@Valid ConnectionGroupShortResponse> connectionGroups = new ArrayList<>();
  private List<@Valid ConnectionResponse> connections = new ArrayList<>();
  private Boolean hasLiked;
  private Permissions userPermissions;
  private Permissions publicPermissions;
  private AlbumFullResponse album1;
  private AlbumFullResponse album2;
  private Double latitude;
  private Double longitude;
  private String locationDescription;
  private Double distance;
  private Long dateCreated;
  private Long dateUpdated;

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
  private Long voteCount;
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
  @JsonProperty("albumContestId")
  public Long getAlbumContestId() {
    return albumContestId;
  }
  public void setAlbumContestId(Long albumContestId) {
    this.albumContestId = albumContestId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contestType")
  public String getContestType() {
    return contestType;
  }
  public void setContestType(String contestType) {
    this.contestType = contestType;
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
  public Integer getCommentsCount() {
    return commentsCount;
  }
  public void setCommentsCount(Integer commentsCount) {
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
  @JsonProperty("album1")
  @Valid
  public AlbumFullResponse getAlbum1() {
    return album1;
  }
  public void setAlbum1(AlbumFullResponse album1) {
    this.album1 = album1;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("album2")
  @Valid
  public AlbumFullResponse getAlbum2() {
    return album2;
  }
  public void setAlbum2(AlbumFullResponse album2) {
    this.album2 = album2;
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
  @JsonProperty("voteCount")
  public Long getVoteCount() {
    return voteCount;
  }
  public void setVoteCount(Long voteCount) {
    this.voteCount = voteCount;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

