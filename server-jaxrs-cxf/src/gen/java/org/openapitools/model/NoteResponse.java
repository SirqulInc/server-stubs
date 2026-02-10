package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NoteResponse  {
  
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

  public NoteResponse valid(Boolean valid) {
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

  public NoteResponse message(String message) {
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

  public NoteResponse version(Double version) {
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

  public NoteResponse serializeNulls(Boolean serializeNulls) {
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

  public NoteResponse startTimeLog(Long startTimeLog) {
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

  public NoteResponse errorCode(String errorCode) {
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

  public NoteResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public NoteResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public NoteResponse noteId(Long noteId) {
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

  public NoteResponse comment(String comment) {
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

  public NoteResponse tags(String tags) {
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

  public NoteResponse likesCount(Long likesCount) {
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

  public NoteResponse dislikesCount(Long dislikesCount) {
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

  public NoteResponse dateCreated(Long dateCreated) {
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

  public NoteResponse createdDate(Long createdDate) {
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

  public NoteResponse updatedDate(Long updatedDate) {
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

  public NoteResponse owner(AccountShortResponse owner) {
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

  public NoteResponse latitude(Double latitude) {
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

  public NoteResponse longitude(Double longitude) {
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

  public NoteResponse locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
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

  public NoteResponse returning(String returning) {
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
    NoteResponse noteResponse = (NoteResponse) o;
    return Objects.equals(this.valid, noteResponse.valid) &&
        Objects.equals(this.message, noteResponse.message) &&
        Objects.equals(this.version, noteResponse.version) &&
        Objects.equals(this.serializeNulls, noteResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, noteResponse.startTimeLog) &&
        Objects.equals(this.errorCode, noteResponse.errorCode) &&
        Objects.equals(this.request, noteResponse.request) &&
        Objects.equals(this.noteId, noteResponse.noteId) &&
        Objects.equals(this.comment, noteResponse.comment) &&
        Objects.equals(this.tags, noteResponse.tags) &&
        Objects.equals(this.likesCount, noteResponse.likesCount) &&
        Objects.equals(this.dislikesCount, noteResponse.dislikesCount) &&
        Objects.equals(this.dateCreated, noteResponse.dateCreated) &&
        Objects.equals(this.createdDate, noteResponse.createdDate) &&
        Objects.equals(this.updatedDate, noteResponse.updatedDate) &&
        Objects.equals(this.owner, noteResponse.owner) &&
        Objects.equals(this.latitude, noteResponse.latitude) &&
        Objects.equals(this.longitude, noteResponse.longitude) &&
        Objects.equals(this.locationDescription, noteResponse.locationDescription) &&
        Objects.equals(this.returning, noteResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, noteId, comment, tags, likesCount, dislikesCount, dateCreated, createdDate, updatedDate, owner, latitude, longitude, locationDescription, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoteResponse {\n");
    
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

