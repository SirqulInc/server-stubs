package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.LikeResponse;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NoteFullResponse  {
  
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

  private Long noteId;

  @ApiModelProperty(value = "")

  private String comment;

  @ApiModelProperty(value = "")

  private String tags;

  @ApiModelProperty(value = "")

  private Long likesCount;

  @ApiModelProperty(value = "")

  private Long dislikesCount;

  @ApiModelProperty(value = "")

  private Long dateCreated;

  @ApiModelProperty(value = "")

  private Long createdDate;

  @ApiModelProperty(value = "")

  private Long updatedDate;

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse owner;

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;

  @ApiModelProperty(value = "")

  private String locationDescription;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid AssetShortResponse> attachedAssets = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid LikeResponse> likes = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Boolean hasLiked;

  @ApiModelProperty(value = "")

  private Boolean hasDisliked;

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

  public NoteFullResponse valid(Boolean valid) {
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

  public NoteFullResponse message(String message) {
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

  public NoteFullResponse version(Double version) {
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

  public NoteFullResponse serializeNulls(Boolean serializeNulls) {
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

  public NoteFullResponse startTimeLog(Long startTimeLog) {
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

  public NoteFullResponse errorCode(String errorCode) {
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

  public NoteFullResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public NoteFullResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get noteId
   * @return noteId
  **/
  @JsonProperty("noteId")
  public Long getNoteId() {
    return noteId;
  }

  public void setNoteId(Long noteId) {
    this.noteId = noteId;
  }

  public NoteFullResponse noteId(Long noteId) {
    this.noteId = noteId;
    return this;
  }

 /**
   * Get comment
   * @return comment
  **/
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public NoteFullResponse comment(String comment) {
    this.comment = comment;
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

  public NoteFullResponse tags(String tags) {
    this.tags = tags;
    return this;
  }

 /**
   * Get likesCount
   * @return likesCount
  **/
  @JsonProperty("likesCount")
  public Long getLikesCount() {
    return likesCount;
  }

  public void setLikesCount(Long likesCount) {
    this.likesCount = likesCount;
  }

  public NoteFullResponse likesCount(Long likesCount) {
    this.likesCount = likesCount;
    return this;
  }

 /**
   * Get dislikesCount
   * @return dislikesCount
  **/
  @JsonProperty("dislikesCount")
  public Long getDislikesCount() {
    return dislikesCount;
  }

  public void setDislikesCount(Long dislikesCount) {
    this.dislikesCount = dislikesCount;
  }

  public NoteFullResponse dislikesCount(Long dislikesCount) {
    this.dislikesCount = dislikesCount;
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

  public NoteFullResponse dateCreated(Long dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

 /**
   * Get createdDate
   * @return createdDate
  **/
  @JsonProperty("createdDate")
  public Long getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  public NoteFullResponse createdDate(Long createdDate) {
    this.createdDate = createdDate;
    return this;
  }

 /**
   * Get updatedDate
   * @return updatedDate
  **/
  @JsonProperty("updatedDate")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  public NoteFullResponse updatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
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

  public NoteFullResponse owner(AccountShortResponse owner) {
    this.owner = owner;
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

  public NoteFullResponse latitude(Double latitude) {
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

  public NoteFullResponse longitude(Double longitude) {
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

  public NoteFullResponse locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

 /**
   * Get attachedAssets
   * @return attachedAssets
  **/
  @JsonProperty("attachedAssets")
  public List<@Valid AssetShortResponse> getAttachedAssets() {
    return attachedAssets;
  }

  public void setAttachedAssets(List<@Valid AssetShortResponse> attachedAssets) {
    this.attachedAssets = attachedAssets;
  }

  public NoteFullResponse attachedAssets(List<@Valid AssetShortResponse> attachedAssets) {
    this.attachedAssets = attachedAssets;
    return this;
  }

  public NoteFullResponse addAttachedAssetsItem(AssetShortResponse attachedAssetsItem) {
    this.attachedAssets.add(attachedAssetsItem);
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

  public NoteFullResponse likes(List<@Valid LikeResponse> likes) {
    this.likes = likes;
    return this;
  }

  public NoteFullResponse addLikesItem(LikeResponse likesItem) {
    this.likes.add(likesItem);
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

  public NoteFullResponse hasLiked(Boolean hasLiked) {
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

  public NoteFullResponse hasDisliked(Boolean hasDisliked) {
    this.hasDisliked = hasDisliked;
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

  public NoteFullResponse returning(String returning) {
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
    NoteFullResponse noteFullResponse = (NoteFullResponse) o;
    return Objects.equals(this.valid, noteFullResponse.valid) &&
        Objects.equals(this.message, noteFullResponse.message) &&
        Objects.equals(this.version, noteFullResponse.version) &&
        Objects.equals(this.serializeNulls, noteFullResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, noteFullResponse.startTimeLog) &&
        Objects.equals(this.errorCode, noteFullResponse.errorCode) &&
        Objects.equals(this.request, noteFullResponse.request) &&
        Objects.equals(this.noteId, noteFullResponse.noteId) &&
        Objects.equals(this.comment, noteFullResponse.comment) &&
        Objects.equals(this.tags, noteFullResponse.tags) &&
        Objects.equals(this.likesCount, noteFullResponse.likesCount) &&
        Objects.equals(this.dislikesCount, noteFullResponse.dislikesCount) &&
        Objects.equals(this.dateCreated, noteFullResponse.dateCreated) &&
        Objects.equals(this.createdDate, noteFullResponse.createdDate) &&
        Objects.equals(this.updatedDate, noteFullResponse.updatedDate) &&
        Objects.equals(this.owner, noteFullResponse.owner) &&
        Objects.equals(this.latitude, noteFullResponse.latitude) &&
        Objects.equals(this.longitude, noteFullResponse.longitude) &&
        Objects.equals(this.locationDescription, noteFullResponse.locationDescription) &&
        Objects.equals(this.attachedAssets, noteFullResponse.attachedAssets) &&
        Objects.equals(this.likes, noteFullResponse.likes) &&
        Objects.equals(this.hasLiked, noteFullResponse.hasLiked) &&
        Objects.equals(this.hasDisliked, noteFullResponse.hasDisliked) &&
        Objects.equals(this.returning, noteFullResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, noteId, comment, tags, likesCount, dislikesCount, dateCreated, createdDate, updatedDate, owner, latitude, longitude, locationDescription, attachedAssets, likes, hasLiked, hasDisliked, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoteFullResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    noteId: ").append(toIndentedString(noteId)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    likesCount: ").append(toIndentedString(likesCount)).append("\n");
    sb.append("    dislikesCount: ").append(toIndentedString(dislikesCount)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    attachedAssets: ").append(toIndentedString(attachedAssets)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    hasLiked: ").append(toIndentedString(hasLiked)).append("\n");
    sb.append("    hasDisliked: ").append(toIndentedString(hasDisliked)).append("\n");
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

