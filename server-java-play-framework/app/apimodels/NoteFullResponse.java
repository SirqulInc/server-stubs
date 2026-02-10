package apimodels;

import apimodels.AccountShortResponse;
import apimodels.AssetShortResponse;
import apimodels.LikeResponse;
import apimodels.NameStringValueResponse;
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
 * NoteFullResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class NoteFullResponse   {
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

  @JsonProperty("noteId")
  
  private Long noteId;

  @JsonProperty("comment")
  
  private String comment;

  @JsonProperty("tags")
  
  private String tags;

  @JsonProperty("likesCount")
  
  private Long likesCount;

  @JsonProperty("dislikesCount")
  
  private Long dislikesCount;

  @JsonProperty("dateCreated")
  
  private Long dateCreated;

  @JsonProperty("createdDate")
  
  private Long createdDate;

  @JsonProperty("updatedDate")
  
  private Long updatedDate;

  @JsonProperty("owner")
  @Valid

  private AccountShortResponse owner;

  @JsonProperty("latitude")
  
  private Double latitude;

  @JsonProperty("longitude")
  
  private Double longitude;

  @JsonProperty("locationDescription")
  
  private String locationDescription;

  @JsonProperty("attachedAssets")
  @Valid

  private List<@Valid AssetShortResponse> attachedAssets = null;

  @JsonProperty("likes")
  @Valid

  private List<@Valid LikeResponse> likes = null;

  @JsonProperty("hasLiked")
  
  private Boolean hasLiked;

  @JsonProperty("hasDisliked")
  
  private Boolean hasDisliked;

  @JsonProperty("returning")
  
  private String returning;

  public NoteFullResponse valid(Boolean valid) {
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

  public NoteFullResponse message(String message) {
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

  public NoteFullResponse version(Double version) {
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

  public NoteFullResponse serializeNulls(Boolean serializeNulls) {
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

  public NoteFullResponse startTimeLog(Long startTimeLog) {
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

  public NoteFullResponse errorCode(String errorCode) {
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

  public NoteFullResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public NoteFullResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public NoteFullResponse noteId(Long noteId) {
    this.noteId = noteId;
    return this;
  }

   /**
   * Get noteId
   * @return noteId
  **/
  public Long getNoteId() {
    return noteId;
  }

  public void setNoteId(Long noteId) {
    this.noteId = noteId;
  }

  public NoteFullResponse comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public NoteFullResponse tags(String tags) {
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

  public NoteFullResponse likesCount(Long likesCount) {
    this.likesCount = likesCount;
    return this;
  }

   /**
   * Get likesCount
   * @return likesCount
  **/
  public Long getLikesCount() {
    return likesCount;
  }

  public void setLikesCount(Long likesCount) {
    this.likesCount = likesCount;
  }

  public NoteFullResponse dislikesCount(Long dislikesCount) {
    this.dislikesCount = dislikesCount;
    return this;
  }

   /**
   * Get dislikesCount
   * @return dislikesCount
  **/
  public Long getDislikesCount() {
    return dislikesCount;
  }

  public void setDislikesCount(Long dislikesCount) {
    this.dislikesCount = dislikesCount;
  }

  public NoteFullResponse dateCreated(Long dateCreated) {
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

  public NoteFullResponse createdDate(Long createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  public Long getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  public NoteFullResponse updatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

   /**
   * Get updatedDate
   * @return updatedDate
  **/
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  public NoteFullResponse owner(AccountShortResponse owner) {
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

  public NoteFullResponse latitude(Double latitude) {
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

  public NoteFullResponse longitude(Double longitude) {
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

  public NoteFullResponse locationDescription(String locationDescription) {
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

  public NoteFullResponse attachedAssets(List<@Valid AssetShortResponse> attachedAssets) {
    this.attachedAssets = attachedAssets;
    return this;
  }

  public NoteFullResponse addAttachedAssetsItem(AssetShortResponse attachedAssetsItem) {
    if (this.attachedAssets == null) {
      this.attachedAssets = new ArrayList<>();
    }
    this.attachedAssets.add(attachedAssetsItem);
    return this;
  }

   /**
   * Get attachedAssets
   * @return attachedAssets
  **/
  public List<@Valid AssetShortResponse> getAttachedAssets() {
    return attachedAssets;
  }

  public void setAttachedAssets(List<@Valid AssetShortResponse> attachedAssets) {
    this.attachedAssets = attachedAssets;
  }

  public NoteFullResponse likes(List<@Valid LikeResponse> likes) {
    this.likes = likes;
    return this;
  }

  public NoteFullResponse addLikesItem(LikeResponse likesItem) {
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

  public NoteFullResponse hasLiked(Boolean hasLiked) {
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

  public NoteFullResponse hasDisliked(Boolean hasDisliked) {
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

  public NoteFullResponse returning(String returning) {
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
    NoteFullResponse noteFullResponse = (NoteFullResponse) o;
    return Objects.equals(valid, noteFullResponse.valid) &&
        Objects.equals(message, noteFullResponse.message) &&
        Objects.equals(version, noteFullResponse.version) &&
        Objects.equals(serializeNulls, noteFullResponse.serializeNulls) &&
        Objects.equals(startTimeLog, noteFullResponse.startTimeLog) &&
        Objects.equals(errorCode, noteFullResponse.errorCode) &&
        Objects.equals(request, noteFullResponse.request) &&
        Objects.equals(noteId, noteFullResponse.noteId) &&
        Objects.equals(comment, noteFullResponse.comment) &&
        Objects.equals(tags, noteFullResponse.tags) &&
        Objects.equals(likesCount, noteFullResponse.likesCount) &&
        Objects.equals(dislikesCount, noteFullResponse.dislikesCount) &&
        Objects.equals(dateCreated, noteFullResponse.dateCreated) &&
        Objects.equals(createdDate, noteFullResponse.createdDate) &&
        Objects.equals(updatedDate, noteFullResponse.updatedDate) &&
        Objects.equals(owner, noteFullResponse.owner) &&
        Objects.equals(latitude, noteFullResponse.latitude) &&
        Objects.equals(longitude, noteFullResponse.longitude) &&
        Objects.equals(locationDescription, noteFullResponse.locationDescription) &&
        Objects.equals(attachedAssets, noteFullResponse.attachedAssets) &&
        Objects.equals(likes, noteFullResponse.likes) &&
        Objects.equals(hasLiked, noteFullResponse.hasLiked) &&
        Objects.equals(hasDisliked, noteFullResponse.hasDisliked) &&
        Objects.equals(returning, noteFullResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, noteId, comment, tags, likesCount, dislikesCount, dateCreated, createdDate, updatedDate, owner, latitude, longitude, locationDescription, attachedAssets, likes, hasLiked, hasDisliked, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

