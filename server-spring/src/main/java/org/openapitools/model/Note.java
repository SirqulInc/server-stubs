package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Asset;
import org.openapitools.model.Flag;
import org.openapitools.model.FlagThreshold;
import org.openapitools.model.YayOrNay;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Note
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Note {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable String locationDescription;

  private @Nullable Account owner;

  private @Nullable String notableType;

  private @Nullable Long notableId;

  private @Nullable String noteTag;

  @Valid
  private List<@Valid Note> notes = new ArrayList<>();

  @Valid
  private List<@Valid YayOrNay> likes = new ArrayList<>();

  @Valid
  private List<@Valid Asset> assets = new ArrayList<>();

  private @Nullable String noteDescription;

  private @Nullable Long likeCount;

  private @Nullable Long dislikeCount;

  private @Nullable Long noteCount;

  @Valid
  private List<@Valid Flag> flags = new ArrayList<>();

  private @Nullable Long flagCount;

  private @Nullable FlagThreshold flagThreshold;

  private @Nullable String contentName;

  private @Nullable Long defaultThreshold;

  public Note id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public Note active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  public Note valid(@Nullable Boolean valid) {
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

  public Note latitude(@Nullable Double latitude) {
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

  public Note longitude(@Nullable Double longitude) {
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

  public Note locationDescription(@Nullable String locationDescription) {
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

  public Note owner(@Nullable Account owner) {
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
  public @Nullable Account getOwner() {
    return owner;
  }

  public void setOwner(@Nullable Account owner) {
    this.owner = owner;
  }

  public Note notableType(@Nullable String notableType) {
    this.notableType = notableType;
    return this;
  }

  /**
   * Get notableType
   * @return notableType
   */
  
  @Schema(name = "notableType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notableType")
  public @Nullable String getNotableType() {
    return notableType;
  }

  public void setNotableType(@Nullable String notableType) {
    this.notableType = notableType;
  }

  public Note notableId(@Nullable Long notableId) {
    this.notableId = notableId;
    return this;
  }

  /**
   * Get notableId
   * @return notableId
   */
  
  @Schema(name = "notableId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notableId")
  public @Nullable Long getNotableId() {
    return notableId;
  }

  public void setNotableId(@Nullable Long notableId) {
    this.notableId = notableId;
  }

  public Note noteTag(@Nullable String noteTag) {
    this.noteTag = noteTag;
    return this;
  }

  /**
   * Get noteTag
   * @return noteTag
   */
  
  @Schema(name = "noteTag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("noteTag")
  public @Nullable String getNoteTag() {
    return noteTag;
  }

  public void setNoteTag(@Nullable String noteTag) {
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
   */
  @Valid 
  @Schema(name = "notes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notes")
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
   */
  @Valid 
  @Schema(name = "likes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("likes")
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
   */
  @Valid 
  @Schema(name = "assets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assets")
  public List<@Valid Asset> getAssets() {
    return assets;
  }

  public void setAssets(List<@Valid Asset> assets) {
    this.assets = assets;
  }

  public Note noteDescription(@Nullable String noteDescription) {
    this.noteDescription = noteDescription;
    return this;
  }

  /**
   * Get noteDescription
   * @return noteDescription
   */
  
  @Schema(name = "noteDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("noteDescription")
  public @Nullable String getNoteDescription() {
    return noteDescription;
  }

  public void setNoteDescription(@Nullable String noteDescription) {
    this.noteDescription = noteDescription;
  }

  public Note likeCount(@Nullable Long likeCount) {
    this.likeCount = likeCount;
    return this;
  }

  /**
   * Get likeCount
   * @return likeCount
   */
  
  @Schema(name = "likeCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("likeCount")
  public @Nullable Long getLikeCount() {
    return likeCount;
  }

  public void setLikeCount(@Nullable Long likeCount) {
    this.likeCount = likeCount;
  }

  public Note dislikeCount(@Nullable Long dislikeCount) {
    this.dislikeCount = dislikeCount;
    return this;
  }

  /**
   * Get dislikeCount
   * @return dislikeCount
   */
  
  @Schema(name = "dislikeCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dislikeCount")
  public @Nullable Long getDislikeCount() {
    return dislikeCount;
  }

  public void setDislikeCount(@Nullable Long dislikeCount) {
    this.dislikeCount = dislikeCount;
  }

  public Note noteCount(@Nullable Long noteCount) {
    this.noteCount = noteCount;
    return this;
  }

  /**
   * Get noteCount
   * @return noteCount
   */
  
  @Schema(name = "noteCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("noteCount")
  public @Nullable Long getNoteCount() {
    return noteCount;
  }

  public void setNoteCount(@Nullable Long noteCount) {
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
   */
  @Valid 
  @Schema(name = "flags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flags")
  public List<@Valid Flag> getFlags() {
    return flags;
  }

  public void setFlags(List<@Valid Flag> flags) {
    this.flags = flags;
  }

  public Note flagCount(@Nullable Long flagCount) {
    this.flagCount = flagCount;
    return this;
  }

  /**
   * Get flagCount
   * @return flagCount
   */
  
  @Schema(name = "flagCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flagCount")
  public @Nullable Long getFlagCount() {
    return flagCount;
  }

  public void setFlagCount(@Nullable Long flagCount) {
    this.flagCount = flagCount;
  }

  public Note flagThreshold(@Nullable FlagThreshold flagThreshold) {
    this.flagThreshold = flagThreshold;
    return this;
  }

  /**
   * Get flagThreshold
   * @return flagThreshold
   */
  @Valid 
  @Schema(name = "flagThreshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flagThreshold")
  public @Nullable FlagThreshold getFlagThreshold() {
    return flagThreshold;
  }

  public void setFlagThreshold(@Nullable FlagThreshold flagThreshold) {
    this.flagThreshold = flagThreshold;
  }

  public Note contentName(@Nullable String contentName) {
    this.contentName = contentName;
    return this;
  }

  /**
   * Get contentName
   * @return contentName
   */
  
  @Schema(name = "contentName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentName")
  public @Nullable String getContentName() {
    return contentName;
  }

  public void setContentName(@Nullable String contentName) {
    this.contentName = contentName;
  }

  public Note defaultThreshold(@Nullable Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
    return this;
  }

  /**
   * Get defaultThreshold
   * @return defaultThreshold
   */
  
  @Schema(name = "defaultThreshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultThreshold")
  public @Nullable Long getDefaultThreshold() {
    return defaultThreshold;
  }

  public void setDefaultThreshold(@Nullable Long defaultThreshold) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

