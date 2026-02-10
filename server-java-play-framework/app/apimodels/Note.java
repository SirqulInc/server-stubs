package apimodels;

import apimodels.Account;
import apimodels.Asset;
import apimodels.Flag;
import apimodels.FlagThreshold;
import apimodels.YayOrNay;
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
 * Note
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Note   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("latitude")
  
  private Double latitude;

  @JsonProperty("longitude")
  
  private Double longitude;

  @JsonProperty("locationDescription")
  
  private String locationDescription;

  @JsonProperty("owner")
  @Valid

  private Account owner;

  @JsonProperty("notableType")
  
  private String notableType;

  @JsonProperty("notableId")
  
  private Long notableId;

  @JsonProperty("noteTag")
  
  private String noteTag;

  @JsonProperty("notes")
  @Valid

  private List<@Valid Note> notes = null;

  @JsonProperty("likes")
  @Valid

  private List<@Valid YayOrNay> likes = null;

  @JsonProperty("assets")
  @Valid

  private List<@Valid Asset> assets = null;

  @JsonProperty("noteDescription")
  
  private String noteDescription;

  @JsonProperty("likeCount")
  
  private Long likeCount;

  @JsonProperty("dislikeCount")
  
  private Long dislikeCount;

  @JsonProperty("noteCount")
  
  private Long noteCount;

  @JsonProperty("flags")
  @Valid

  private List<@Valid Flag> flags = null;

  @JsonProperty("flagCount")
  
  private Long flagCount;

  @JsonProperty("flagThreshold")
  @Valid

  private FlagThreshold flagThreshold;

  @JsonProperty("contentName")
  
  private String contentName;

  @JsonProperty("defaultThreshold")
  
  private Long defaultThreshold;

  public Note id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Note active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Note valid(Boolean valid) {
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

  public Note latitude(Double latitude) {
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

  public Note longitude(Double longitude) {
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

  public Note locationDescription(String locationDescription) {
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

  public Note owner(Account owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public Note notableType(String notableType) {
    this.notableType = notableType;
    return this;
  }

   /**
   * Get notableType
   * @return notableType
  **/
  public String getNotableType() {
    return notableType;
  }

  public void setNotableType(String notableType) {
    this.notableType = notableType;
  }

  public Note notableId(Long notableId) {
    this.notableId = notableId;
    return this;
  }

   /**
   * Get notableId
   * @return notableId
  **/
  public Long getNotableId() {
    return notableId;
  }

  public void setNotableId(Long notableId) {
    this.notableId = notableId;
  }

  public Note noteTag(String noteTag) {
    this.noteTag = noteTag;
    return this;
  }

   /**
   * Get noteTag
   * @return noteTag
  **/
  public String getNoteTag() {
    return noteTag;
  }

  public void setNoteTag(String noteTag) {
    this.noteTag = noteTag;
  }

  public Note notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public Note addNotesItem(Note notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  public List<@Valid Note> getNotes() {
    return notes;
  }

  public void setNotes(List<@Valid Note> notes) {
    this.notes = notes;
  }

  public Note likes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
    return this;
  }

  public Note addLikesItem(YayOrNay likesItem) {
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
  public List<@Valid YayOrNay> getLikes() {
    return likes;
  }

  public void setLikes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
  }

  public Note assets(List<@Valid Asset> assets) {
    this.assets = assets;
    return this;
  }

  public Note addAssetsItem(Asset assetsItem) {
    if (this.assets == null) {
      this.assets = new ArrayList<>();
    }
    this.assets.add(assetsItem);
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  public List<@Valid Asset> getAssets() {
    return assets;
  }

  public void setAssets(List<@Valid Asset> assets) {
    this.assets = assets;
  }

  public Note noteDescription(String noteDescription) {
    this.noteDescription = noteDescription;
    return this;
  }

   /**
   * Get noteDescription
   * @return noteDescription
  **/
  public String getNoteDescription() {
    return noteDescription;
  }

  public void setNoteDescription(String noteDescription) {
    this.noteDescription = noteDescription;
  }

  public Note likeCount(Long likeCount) {
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

  public Note dislikeCount(Long dislikeCount) {
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

  public Note noteCount(Long noteCount) {
    this.noteCount = noteCount;
    return this;
  }

   /**
   * Get noteCount
   * @return noteCount
  **/
  public Long getNoteCount() {
    return noteCount;
  }

  public void setNoteCount(Long noteCount) {
    this.noteCount = noteCount;
  }

  public Note flags(List<@Valid Flag> flags) {
    this.flags = flags;
    return this;
  }

  public Note addFlagsItem(Flag flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<>();
    }
    this.flags.add(flagsItem);
    return this;
  }

   /**
   * Get flags
   * @return flags
  **/
  public List<@Valid Flag> getFlags() {
    return flags;
  }

  public void setFlags(List<@Valid Flag> flags) {
    this.flags = flags;
  }

  public Note flagCount(Long flagCount) {
    this.flagCount = flagCount;
    return this;
  }

   /**
   * Get flagCount
   * @return flagCount
  **/
  public Long getFlagCount() {
    return flagCount;
  }

  public void setFlagCount(Long flagCount) {
    this.flagCount = flagCount;
  }

  public Note flagThreshold(FlagThreshold flagThreshold) {
    this.flagThreshold = flagThreshold;
    return this;
  }

   /**
   * Get flagThreshold
   * @return flagThreshold
  **/
  public FlagThreshold getFlagThreshold() {
    return flagThreshold;
  }

  public void setFlagThreshold(FlagThreshold flagThreshold) {
    this.flagThreshold = flagThreshold;
  }

  public Note contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

   /**
   * Get contentName
   * @return contentName
  **/
  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  public Note defaultThreshold(Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
    return this;
  }

   /**
   * Get defaultThreshold
   * @return defaultThreshold
  **/
  public Long getDefaultThreshold() {
    return defaultThreshold;
  }

  public void setDefaultThreshold(Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
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
    return Objects.equals(id, note.id) &&
        Objects.equals(active, note.active) &&
        Objects.equals(valid, note.valid) &&
        Objects.equals(latitude, note.latitude) &&
        Objects.equals(longitude, note.longitude) &&
        Objects.equals(locationDescription, note.locationDescription) &&
        Objects.equals(owner, note.owner) &&
        Objects.equals(notableType, note.notableType) &&
        Objects.equals(notableId, note.notableId) &&
        Objects.equals(noteTag, note.noteTag) &&
        Objects.equals(notes, note.notes) &&
        Objects.equals(likes, note.likes) &&
        Objects.equals(assets, note.assets) &&
        Objects.equals(noteDescription, note.noteDescription) &&
        Objects.equals(likeCount, note.likeCount) &&
        Objects.equals(dislikeCount, note.dislikeCount) &&
        Objects.equals(noteCount, note.noteCount) &&
        Objects.equals(flags, note.flags) &&
        Objects.equals(flagCount, note.flagCount) &&
        Objects.equals(flagThreshold, note.flagThreshold) &&
        Objects.equals(contentName, note.contentName) &&
        Objects.equals(defaultThreshold, note.defaultThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, latitude, longitude, locationDescription, owner, notableType, notableId, noteTag, notes, likes, assets, noteDescription, likeCount, dislikeCount, noteCount, flags, flagCount, flagThreshold, contentName, defaultThreshold);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

