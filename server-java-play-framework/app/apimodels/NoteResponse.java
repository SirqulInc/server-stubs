package apimodels;

import apimodels.AccountShortResponse;
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
 * NoteResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class NoteResponse   {
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

  @JsonProperty("returning")
  
  private String returning;

  public NoteResponse valid(Boolean valid) {
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

  public NoteResponse message(String message) {
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

  public NoteResponse version(Double version) {
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

  public NoteResponse serializeNulls(Boolean serializeNulls) {
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

  public NoteResponse startTimeLog(Long startTimeLog) {
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

  public NoteResponse errorCode(String errorCode) {
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

  public NoteResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public NoteResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public NoteResponse noteId(Long noteId) {
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

  public NoteResponse comment(String comment) {
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

  public NoteResponse tags(String tags) {
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

  public NoteResponse likesCount(Long likesCount) {
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

  public NoteResponse dislikesCount(Long dislikesCount) {
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

  public NoteResponse dateCreated(Long dateCreated) {
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

  public NoteResponse createdDate(Long createdDate) {
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

  public NoteResponse updatedDate(Long updatedDate) {
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

  public NoteResponse owner(AccountShortResponse owner) {
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

  public NoteResponse latitude(Double latitude) {
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

  public NoteResponse longitude(Double longitude) {
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

  public NoteResponse locationDescription(String locationDescription) {
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

  public NoteResponse returning(String returning) {
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
    NoteResponse noteResponse = (NoteResponse) o;
    return Objects.equals(valid, noteResponse.valid) &&
        Objects.equals(message, noteResponse.message) &&
        Objects.equals(version, noteResponse.version) &&
        Objects.equals(serializeNulls, noteResponse.serializeNulls) &&
        Objects.equals(startTimeLog, noteResponse.startTimeLog) &&
        Objects.equals(errorCode, noteResponse.errorCode) &&
        Objects.equals(request, noteResponse.request) &&
        Objects.equals(noteId, noteResponse.noteId) &&
        Objects.equals(comment, noteResponse.comment) &&
        Objects.equals(tags, noteResponse.tags) &&
        Objects.equals(likesCount, noteResponse.likesCount) &&
        Objects.equals(dislikesCount, noteResponse.dislikesCount) &&
        Objects.equals(dateCreated, noteResponse.dateCreated) &&
        Objects.equals(createdDate, noteResponse.createdDate) &&
        Objects.equals(updatedDate, noteResponse.updatedDate) &&
        Objects.equals(owner, noteResponse.owner) &&
        Objects.equals(latitude, noteResponse.latitude) &&
        Objects.equals(longitude, noteResponse.longitude) &&
        Objects.equals(locationDescription, noteResponse.locationDescription) &&
        Objects.equals(returning, noteResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, noteId, comment, tags, likesCount, dislikesCount, dateCreated, createdDate, updatedDate, owner, latitude, longitude, locationDescription, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

