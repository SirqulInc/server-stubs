package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.LikeResponse;
import org.openapitools.model.NameStringValueResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NoteFullResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class NoteFullResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  private @Nullable Long noteId;

  private @Nullable String comment;

  private @Nullable String tags;

  private @Nullable Long likesCount;

  private @Nullable Long dislikesCount;

  private @Nullable Long dateCreated;

  private @Nullable Long createdDate;

  private @Nullable Long updatedDate;

  private @Nullable AccountShortResponse owner;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable String locationDescription;

  @Valid
  private List<@Valid AssetShortResponse> attachedAssets = new ArrayList<>();

  @Valid
  private List<@Valid LikeResponse> likes = new ArrayList<>();

  private @Nullable Boolean hasLiked;

  private @Nullable Boolean hasDisliked;

  private @Nullable String returning;

  public NoteFullResponse valid(@Nullable Boolean valid) {
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

  public NoteFullResponse message(@Nullable String message) {
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

  public NoteFullResponse version(@Nullable Double version) {
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

  public NoteFullResponse serializeNulls(@Nullable Boolean serializeNulls) {
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

  public NoteFullResponse startTimeLog(@Nullable Long startTimeLog) {
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

  public NoteFullResponse errorCode(@Nullable String errorCode) {
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

  public NoteFullResponse noteId(@Nullable Long noteId) {
    this.noteId = noteId;
    return this;
  }

  /**
   * Get noteId
   * @return noteId
   */
  
  @Schema(name = "noteId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("noteId")
  public @Nullable Long getNoteId() {
    return noteId;
  }

  public void setNoteId(@Nullable Long noteId) {
    this.noteId = noteId;
  }

  public NoteFullResponse comment(@Nullable String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  
  @Schema(name = "comment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public @Nullable String getComment() {
    return comment;
  }

  public void setComment(@Nullable String comment) {
    this.comment = comment;
  }

  public NoteFullResponse tags(@Nullable String tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  
  @Schema(name = "tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public @Nullable String getTags() {
    return tags;
  }

  public void setTags(@Nullable String tags) {
    this.tags = tags;
  }

  public NoteFullResponse likesCount(@Nullable Long likesCount) {
    this.likesCount = likesCount;
    return this;
  }

  /**
   * Get likesCount
   * @return likesCount
   */
  
  @Schema(name = "likesCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("likesCount")
  public @Nullable Long getLikesCount() {
    return likesCount;
  }

  public void setLikesCount(@Nullable Long likesCount) {
    this.likesCount = likesCount;
  }

  public NoteFullResponse dislikesCount(@Nullable Long dislikesCount) {
    this.dislikesCount = dislikesCount;
    return this;
  }

  /**
   * Get dislikesCount
   * @return dislikesCount
   */
  
  @Schema(name = "dislikesCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dislikesCount")
  public @Nullable Long getDislikesCount() {
    return dislikesCount;
  }

  public void setDislikesCount(@Nullable Long dislikesCount) {
    this.dislikesCount = dislikesCount;
  }

  public NoteFullResponse dateCreated(@Nullable Long dateCreated) {
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

  public NoteFullResponse createdDate(@Nullable Long createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
   */
  
  @Schema(name = "createdDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdDate")
  public @Nullable Long getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(@Nullable Long createdDate) {
    this.createdDate = createdDate;
  }

  public NoteFullResponse updatedDate(@Nullable Long updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

  /**
   * Get updatedDate
   * @return updatedDate
   */
  
  @Schema(name = "updatedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedDate")
  public @Nullable Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(@Nullable Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  public NoteFullResponse owner(@Nullable AccountShortResponse owner) {
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

  public NoteFullResponse latitude(@Nullable Double latitude) {
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

  public NoteFullResponse longitude(@Nullable Double longitude) {
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

  public NoteFullResponse locationDescription(@Nullable String locationDescription) {
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
   */
  @Valid 
  @Schema(name = "attachedAssets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attachedAssets")
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

  public NoteFullResponse hasLiked(@Nullable Boolean hasLiked) {
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

  public NoteFullResponse hasDisliked(@Nullable Boolean hasDisliked) {
    this.hasDisliked = hasDisliked;
    return this;
  }

  /**
   * Get hasDisliked
   * @return hasDisliked
   */
  
  @Schema(name = "hasDisliked", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasDisliked")
  public @Nullable Boolean getHasDisliked() {
    return hasDisliked;
  }

  public void setHasDisliked(@Nullable Boolean hasDisliked) {
    this.hasDisliked = hasDisliked;
  }

  public NoteFullResponse returning(@Nullable String returning) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

