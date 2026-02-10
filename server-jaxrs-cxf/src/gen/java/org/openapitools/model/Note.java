package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Asset;
import org.openapitools.model.Flag;
import org.openapitools.model.FlagThreshold;
import org.openapitools.model.YayOrNay;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Note  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;

  @ApiModelProperty(value = "")

  private String locationDescription;

  @ApiModelProperty(value = "")

  @Valid

  private Account owner;

  @ApiModelProperty(value = "")

  private String notableType;

  @ApiModelProperty(value = "")

  private Long notableId;

  @ApiModelProperty(value = "")

  private String noteTag;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Note> notes = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid YayOrNay> likes = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Asset> assets = new ArrayList<>();

  @ApiModelProperty(value = "")

  private String noteDescription;

  @ApiModelProperty(value = "")

  private Long likeCount;

  @ApiModelProperty(value = "")

  private Long dislikeCount;

  @ApiModelProperty(value = "")

  private Long noteCount;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Flag> flags = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long flagCount;

  @ApiModelProperty(value = "")

  @Valid

  private FlagThreshold flagThreshold;

  @ApiModelProperty(value = "")

  private String contentName;

  @ApiModelProperty(value = "")

  private Long defaultThreshold;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Note id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Note active(Boolean active) {
    this.active = active;
    return this;
  }

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

  public Note valid(Boolean valid) {
    this.valid = valid;
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

  public Note latitude(Double latitude) {
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

  public Note longitude(Double longitude) {
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

  public Note locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public Note owner(Account owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get notableType
   * @return notableType
  **/
  @JsonProperty("notableType")
  public String getNotableType() {
    return notableType;
  }

  public void setNotableType(String notableType) {
    this.notableType = notableType;
  }

  public Note notableType(String notableType) {
    this.notableType = notableType;
    return this;
  }

 /**
   * Get notableId
   * @return notableId
  **/
  @JsonProperty("notableId")
  public Long getNotableId() {
    return notableId;
  }

  public void setNotableId(Long notableId) {
    this.notableId = notableId;
  }

  public Note notableId(Long notableId) {
    this.notableId = notableId;
    return this;
  }

 /**
   * Get noteTag
   * @return noteTag
  **/
  @JsonProperty("noteTag")
  public String getNoteTag() {
    return noteTag;
  }

  public void setNoteTag(String noteTag) {
    this.noteTag = noteTag;
  }

  public Note noteTag(String noteTag) {
    this.noteTag = noteTag;
    return this;
  }

 /**
   * Get notes
   * @return notes
  **/
  @JsonProperty("notes")
  public List<@Valid Note> getNotes() {
    return notes;
  }

  public void setNotes(List<@Valid Note> notes) {
    this.notes = notes;
  }

  public Note notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public Note addNotesItem(Note notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get likes
   * @return likes
  **/
  @JsonProperty("likes")
  public List<@Valid YayOrNay> getLikes() {
    return likes;
  }

  public void setLikes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
  }

  public Note likes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
    return this;
  }

  public Note addLikesItem(YayOrNay likesItem) {
    this.likes.add(likesItem);
    return this;
  }

 /**
   * Get assets
   * @return assets
  **/
  @JsonProperty("assets")
  public List<@Valid Asset> getAssets() {
    return assets;
  }

  public void setAssets(List<@Valid Asset> assets) {
    this.assets = assets;
  }

  public Note assets(List<@Valid Asset> assets) {
    this.assets = assets;
    return this;
  }

  public Note addAssetsItem(Asset assetsItem) {
    this.assets.add(assetsItem);
    return this;
  }

 /**
   * Get noteDescription
   * @return noteDescription
  **/
  @JsonProperty("noteDescription")
  public String getNoteDescription() {
    return noteDescription;
  }

  public void setNoteDescription(String noteDescription) {
    this.noteDescription = noteDescription;
  }

  public Note noteDescription(String noteDescription) {
    this.noteDescription = noteDescription;
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

  public Note likeCount(Long likeCount) {
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

  public Note dislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
    return this;
  }

 /**
   * Get noteCount
   * @return noteCount
  **/
  @JsonProperty("noteCount")
  public Long getNoteCount() {
    return noteCount;
  }

  public void setNoteCount(Long noteCount) {
    this.noteCount = noteCount;
  }

  public Note noteCount(Long noteCount) {
    this.noteCount = noteCount;
    return this;
  }

 /**
   * Get flags
   * @return flags
  **/
  @JsonProperty("flags")
  public List<@Valid Flag> getFlags() {
    return flags;
  }

  public void setFlags(List<@Valid Flag> flags) {
    this.flags = flags;
  }

  public Note flags(List<@Valid Flag> flags) {
    this.flags = flags;
    return this;
  }

  public Note addFlagsItem(Flag flagsItem) {
    this.flags.add(flagsItem);
    return this;
  }

 /**
   * Get flagCount
   * @return flagCount
  **/
  @JsonProperty("flagCount")
  public Long getFlagCount() {
    return flagCount;
  }

  public void setFlagCount(Long flagCount) {
    this.flagCount = flagCount;
  }

  public Note flagCount(Long flagCount) {
    this.flagCount = flagCount;
    return this;
  }

 /**
   * Get flagThreshold
   * @return flagThreshold
  **/
  @JsonProperty("flagThreshold")
  public FlagThreshold getFlagThreshold() {
    return flagThreshold;
  }

  public void setFlagThreshold(FlagThreshold flagThreshold) {
    this.flagThreshold = flagThreshold;
  }

  public Note flagThreshold(FlagThreshold flagThreshold) {
    this.flagThreshold = flagThreshold;
    return this;
  }

 /**
   * Get contentName
   * @return contentName
  **/
  @JsonProperty("contentName")
  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  public Note contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

 /**
   * Get defaultThreshold
   * @return defaultThreshold
  **/
  @JsonProperty("defaultThreshold")
  public Long getDefaultThreshold() {
    return defaultThreshold;
  }

  public void setDefaultThreshold(Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
  }

  public Note defaultThreshold(Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
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
    Note note = (Note) o;
    return Objects.equals(this.id, note.id) &&
        Objects.equals(this.active, note.active) &&
        Objects.equals(this.valid, note.valid) &&
        Objects.equals(this.latitude, note.latitude) &&
        Objects.equals(this.longitude, note.longitude) &&
        Objects.equals(this.locationDescription, note.locationDescription) &&
        Objects.equals(this.owner, note.owner) &&
        Objects.equals(this.notableType, note.notableType) &&
        Objects.equals(this.notableId, note.notableId) &&
        Objects.equals(this.noteTag, note.noteTag) &&
        Objects.equals(this.notes, note.notes) &&
        Objects.equals(this.likes, note.likes) &&
        Objects.equals(this.assets, note.assets) &&
        Objects.equals(this.noteDescription, note.noteDescription) &&
        Objects.equals(this.likeCount, note.likeCount) &&
        Objects.equals(this.dislikeCount, note.dislikeCount) &&
        Objects.equals(this.noteCount, note.noteCount) &&
        Objects.equals(this.flags, note.flags) &&
        Objects.equals(this.flagCount, note.flagCount) &&
        Objects.equals(this.flagThreshold, note.flagThreshold) &&
        Objects.equals(this.contentName, note.contentName) &&
        Objects.equals(this.defaultThreshold, note.defaultThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, latitude, longitude, locationDescription, owner, notableType, notableId, noteTag, notes, likes, assets, noteDescription, likeCount, dislikeCount, noteCount, flags, flagCount, flagThreshold, contentName, defaultThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Note {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    notableType: ").append(toIndentedString(notableType)).append("\n");
    sb.append("    notableId: ").append(toIndentedString(notableId)).append("\n");
    sb.append("    noteTag: ").append(toIndentedString(noteTag)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    noteDescription: ").append(toIndentedString(noteDescription)).append("\n");
    sb.append("    likeCount: ").append(toIndentedString(likeCount)).append("\n");
    sb.append("    dislikeCount: ").append(toIndentedString(dislikeCount)).append("\n");
    sb.append("    noteCount: ").append(toIndentedString(noteCount)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    flagCount: ").append(toIndentedString(flagCount)).append("\n");
    sb.append("    flagThreshold: ").append(toIndentedString(flagThreshold)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
    sb.append("    defaultThreshold: ").append(toIndentedString(defaultThreshold)).append("\n");
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

