package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Album;
import org.openapitools.model.Application;
import org.openapitools.model.Assignment;
import org.openapitools.model.Flag;
import org.openapitools.model.FlagThreshold;
import org.openapitools.model.Note;
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
 * Asset
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Asset {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable String locationDescription;

  private @Nullable Long premigrationId;

  private @Nullable Long newOwnerId;

  private @Nullable String folderUri;

  private @Nullable String fileName;

  private @Nullable String mediaType;

  private @Nullable String mimeType;

  private @Nullable String metaData;

  private @Nullable String caption;

  private @Nullable Integer versionCode;

  private @Nullable String versionName;

  private @Nullable Long likeCount;

  private @Nullable Long dislikeCount;

  private @Nullable Long noteCount;

  private @Nullable Account owner;

  @Valid
  private List<@Valid Note> notes = new ArrayList<>();

  @Valid
  private List<@Valid YayOrNay> likes = new ArrayList<>();

  private @Nullable Long attachedAssetId;

  @Valid
  private List<@Valid Flag> flags = new ArrayList<>();

  private @Nullable Long flagCount;

  private @Nullable FlagThreshold flagThreshold;

  /**
   * Gets or Sets defaultAlbumType
   */
  public enum DefaultAlbumTypeEnum {
    PROFILE("PROFILE"),
    
    DEFAULT_PROFILE_AVATAR("DEFAULT_PROFILE_AVATAR"),
    
    DEFAULT_APP_ICON("DEFAULT_APP_ICON"),
    
    DEFAULT_APP_LOGO("DEFAULT_APP_LOGO");

    private final String value;

    DefaultAlbumTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DefaultAlbumTypeEnum fromValue(String value) {
      for (DefaultAlbumTypeEnum b : DefaultAlbumTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable DefaultAlbumTypeEnum defaultAlbumType;

  private @Nullable Album album;

  private @Nullable Assignment assignment;

  private @Nullable Application application;

  private @Nullable String display;

  private @Nullable String appKey;

  private @Nullable Long billableId;

  private @Nullable String subType;

  private @Nullable String contentName;

  private @Nullable URI urifolder;

  private @Nullable Long defaultThreshold;

  public Asset id(@Nullable Long id) {
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

  public Asset active(@Nullable Boolean active) {
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

  public Asset valid(@Nullable Boolean valid) {
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

  public Asset latitude(@Nullable Double latitude) {
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

  public Asset longitude(@Nullable Double longitude) {
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

  public Asset locationDescription(@Nullable String locationDescription) {
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

  public Asset premigrationId(@Nullable Long premigrationId) {
    this.premigrationId = premigrationId;
    return this;
  }

  /**
   * Get premigrationId
   * @return premigrationId
   */
  
  @Schema(name = "premigrationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("premigrationId")
  public @Nullable Long getPremigrationId() {
    return premigrationId;
  }

  public void setPremigrationId(@Nullable Long premigrationId) {
    this.premigrationId = premigrationId;
  }

  public Asset newOwnerId(@Nullable Long newOwnerId) {
    this.newOwnerId = newOwnerId;
    return this;
  }

  /**
   * Get newOwnerId
   * @return newOwnerId
   */
  
  @Schema(name = "newOwnerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("newOwnerId")
  public @Nullable Long getNewOwnerId() {
    return newOwnerId;
  }

  public void setNewOwnerId(@Nullable Long newOwnerId) {
    this.newOwnerId = newOwnerId;
  }

  public Asset folderUri(@Nullable String folderUri) {
    this.folderUri = folderUri;
    return this;
  }

  /**
   * Get folderUri
   * @return folderUri
   */
  
  @Schema(name = "folderUri", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("folderUri")
  public @Nullable String getFolderUri() {
    return folderUri;
  }

  public void setFolderUri(@Nullable String folderUri) {
    this.folderUri = folderUri;
  }

  public Asset fileName(@Nullable String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * @return fileName
   */
  
  @Schema(name = "fileName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fileName")
  public @Nullable String getFileName() {
    return fileName;
  }

  public void setFileName(@Nullable String fileName) {
    this.fileName = fileName;
  }

  public Asset mediaType(@Nullable String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * Get mediaType
   * @return mediaType
   */
  
  @Schema(name = "mediaType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mediaType")
  public @Nullable String getMediaType() {
    return mediaType;
  }

  public void setMediaType(@Nullable String mediaType) {
    this.mediaType = mediaType;
  }

  public Asset mimeType(@Nullable String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * Get mimeType
   * @return mimeType
   */
  
  @Schema(name = "mimeType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mimeType")
  public @Nullable String getMimeType() {
    return mimeType;
  }

  public void setMimeType(@Nullable String mimeType) {
    this.mimeType = mimeType;
  }

  public Asset metaData(@Nullable String metaData) {
    this.metaData = metaData;
    return this;
  }

  /**
   * Get metaData
   * @return metaData
   */
  
  @Schema(name = "metaData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metaData")
  public @Nullable String getMetaData() {
    return metaData;
  }

  public void setMetaData(@Nullable String metaData) {
    this.metaData = metaData;
  }

  public Asset caption(@Nullable String caption) {
    this.caption = caption;
    return this;
  }

  /**
   * Get caption
   * @return caption
   */
  
  @Schema(name = "caption", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caption")
  public @Nullable String getCaption() {
    return caption;
  }

  public void setCaption(@Nullable String caption) {
    this.caption = caption;
  }

  public Asset versionCode(@Nullable Integer versionCode) {
    this.versionCode = versionCode;
    return this;
  }

  /**
   * Get versionCode
   * @return versionCode
   */
  
  @Schema(name = "versionCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionCode")
  public @Nullable Integer getVersionCode() {
    return versionCode;
  }

  public void setVersionCode(@Nullable Integer versionCode) {
    this.versionCode = versionCode;
  }

  public Asset versionName(@Nullable String versionName) {
    this.versionName = versionName;
    return this;
  }

  /**
   * Get versionName
   * @return versionName
   */
  
  @Schema(name = "versionName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionName")
  public @Nullable String getVersionName() {
    return versionName;
  }

  public void setVersionName(@Nullable String versionName) {
    this.versionName = versionName;
  }

  public Asset likeCount(@Nullable Long likeCount) {
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

  public Asset dislikeCount(@Nullable Long dislikeCount) {
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

  public Asset noteCount(@Nullable Long noteCount) {
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

  public Asset owner(@Nullable Account owner) {
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

  public Asset notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public Asset addNotesItem(Note notesItem) {
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

  public Asset likes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
    return this;
  }

  public Asset addLikesItem(YayOrNay likesItem) {
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

  public Asset attachedAssetId(@Nullable Long attachedAssetId) {
    this.attachedAssetId = attachedAssetId;
    return this;
  }

  /**
   * Get attachedAssetId
   * @return attachedAssetId
   */
  
  @Schema(name = "attachedAssetId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attachedAssetId")
  public @Nullable Long getAttachedAssetId() {
    return attachedAssetId;
  }

  public void setAttachedAssetId(@Nullable Long attachedAssetId) {
    this.attachedAssetId = attachedAssetId;
  }

  public Asset flags(List<@Valid Flag> flags) {
    this.flags = flags;
    return this;
  }

  public Asset addFlagsItem(Flag flagsItem) {
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

  public Asset flagCount(@Nullable Long flagCount) {
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

  public Asset flagThreshold(@Nullable FlagThreshold flagThreshold) {
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

  public Asset defaultAlbumType(@Nullable DefaultAlbumTypeEnum defaultAlbumType) {
    this.defaultAlbumType = defaultAlbumType;
    return this;
  }

  /**
   * Get defaultAlbumType
   * @return defaultAlbumType
   */
  
  @Schema(name = "defaultAlbumType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultAlbumType")
  public @Nullable DefaultAlbumTypeEnum getDefaultAlbumType() {
    return defaultAlbumType;
  }

  public void setDefaultAlbumType(@Nullable DefaultAlbumTypeEnum defaultAlbumType) {
    this.defaultAlbumType = defaultAlbumType;
  }

  public Asset album(@Nullable Album album) {
    this.album = album;
    return this;
  }

  /**
   * Get album
   * @return album
   */
  @Valid 
  @Schema(name = "album", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("album")
  public @Nullable Album getAlbum() {
    return album;
  }

  public void setAlbum(@Nullable Album album) {
    this.album = album;
  }

  public Asset assignment(@Nullable Assignment assignment) {
    this.assignment = assignment;
    return this;
  }

  /**
   * Get assignment
   * @return assignment
   */
  @Valid 
  @Schema(name = "assignment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignment")
  public @Nullable Assignment getAssignment() {
    return assignment;
  }

  public void setAssignment(@Nullable Assignment assignment) {
    this.assignment = assignment;
  }

  public Asset application(@Nullable Application application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
   */
  @Valid 
  @Schema(name = "application", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("application")
  public @Nullable Application getApplication() {
    return application;
  }

  public void setApplication(@Nullable Application application) {
    this.application = application;
  }

  public Asset display(@Nullable String display) {
    this.display = display;
    return this;
  }

  /**
   * Get display
   * @return display
   */
  
  @Schema(name = "display", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display")
  public @Nullable String getDisplay() {
    return display;
  }

  public void setDisplay(@Nullable String display) {
    this.display = display;
  }

  public Asset appKey(@Nullable String appKey) {
    this.appKey = appKey;
    return this;
  }

  /**
   * Get appKey
   * @return appKey
   */
  
  @Schema(name = "appKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appKey")
  public @Nullable String getAppKey() {
    return appKey;
  }

  public void setAppKey(@Nullable String appKey) {
    this.appKey = appKey;
  }

  public Asset billableId(@Nullable Long billableId) {
    this.billableId = billableId;
    return this;
  }

  /**
   * Get billableId
   * @return billableId
   */
  
  @Schema(name = "billableId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billableId")
  public @Nullable Long getBillableId() {
    return billableId;
  }

  public void setBillableId(@Nullable Long billableId) {
    this.billableId = billableId;
  }

  public Asset subType(@Nullable String subType) {
    this.subType = subType;
    return this;
  }

  /**
   * Get subType
   * @return subType
   */
  
  @Schema(name = "subType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subType")
  public @Nullable String getSubType() {
    return subType;
  }

  public void setSubType(@Nullable String subType) {
    this.subType = subType;
  }

  public Asset contentName(@Nullable String contentName) {
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

  public Asset urifolder(@Nullable URI urifolder) {
    this.urifolder = urifolder;
    return this;
  }

  /**
   * Get urifolder
   * @return urifolder
   */
  @Valid 
  @Schema(name = "urifolder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("urifolder")
  public @Nullable URI getUrifolder() {
    return urifolder;
  }

  public void setUrifolder(@Nullable URI urifolder) {
    this.urifolder = urifolder;
  }

  public Asset defaultThreshold(@Nullable Long defaultThreshold) {
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
    Asset asset = (Asset) o;
    return Objects.equals(this.id, asset.id) &&
        Objects.equals(this.active, asset.active) &&
        Objects.equals(this.valid, asset.valid) &&
        Objects.equals(this.latitude, asset.latitude) &&
        Objects.equals(this.longitude, asset.longitude) &&
        Objects.equals(this.locationDescription, asset.locationDescription) &&
        Objects.equals(this.premigrationId, asset.premigrationId) &&
        Objects.equals(this.newOwnerId, asset.newOwnerId) &&
        Objects.equals(this.folderUri, asset.folderUri) &&
        Objects.equals(this.fileName, asset.fileName) &&
        Objects.equals(this.mediaType, asset.mediaType) &&
        Objects.equals(this.mimeType, asset.mimeType) &&
        Objects.equals(this.metaData, asset.metaData) &&
        Objects.equals(this.caption, asset.caption) &&
        Objects.equals(this.versionCode, asset.versionCode) &&
        Objects.equals(this.versionName, asset.versionName) &&
        Objects.equals(this.likeCount, asset.likeCount) &&
        Objects.equals(this.dislikeCount, asset.dislikeCount) &&
        Objects.equals(this.noteCount, asset.noteCount) &&
        Objects.equals(this.owner, asset.owner) &&
        Objects.equals(this.notes, asset.notes) &&
        Objects.equals(this.likes, asset.likes) &&
        Objects.equals(this.attachedAssetId, asset.attachedAssetId) &&
        Objects.equals(this.flags, asset.flags) &&
        Objects.equals(this.flagCount, asset.flagCount) &&
        Objects.equals(this.flagThreshold, asset.flagThreshold) &&
        Objects.equals(this.defaultAlbumType, asset.defaultAlbumType) &&
        Objects.equals(this.album, asset.album) &&
        Objects.equals(this.assignment, asset.assignment) &&
        Objects.equals(this.application, asset.application) &&
        Objects.equals(this.display, asset.display) &&
        Objects.equals(this.appKey, asset.appKey) &&
        Objects.equals(this.billableId, asset.billableId) &&
        Objects.equals(this.subType, asset.subType) &&
        Objects.equals(this.contentName, asset.contentName) &&
        Objects.equals(this.urifolder, asset.urifolder) &&
        Objects.equals(this.defaultThreshold, asset.defaultThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, latitude, longitude, locationDescription, premigrationId, newOwnerId, folderUri, fileName, mediaType, mimeType, metaData, caption, versionCode, versionName, likeCount, dislikeCount, noteCount, owner, notes, likes, attachedAssetId, flags, flagCount, flagThreshold, defaultAlbumType, album, assignment, application, display, appKey, billableId, subType, contentName, urifolder, defaultThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Asset {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    premigrationId: ").append(toIndentedString(premigrationId)).append("\n");
    sb.append("    newOwnerId: ").append(toIndentedString(newOwnerId)).append("\n");
    sb.append("    folderUri: ").append(toIndentedString(folderUri)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    versionCode: ").append(toIndentedString(versionCode)).append("\n");
    sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
    sb.append("    likeCount: ").append(toIndentedString(likeCount)).append("\n");
    sb.append("    dislikeCount: ").append(toIndentedString(dislikeCount)).append("\n");
    sb.append("    noteCount: ").append(toIndentedString(noteCount)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    attachedAssetId: ").append(toIndentedString(attachedAssetId)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    flagCount: ").append(toIndentedString(flagCount)).append("\n");
    sb.append("    flagThreshold: ").append(toIndentedString(flagThreshold)).append("\n");
    sb.append("    defaultAlbumType: ").append(toIndentedString(defaultAlbumType)).append("\n");
    sb.append("    album: ").append(toIndentedString(album)).append("\n");
    sb.append("    assignment: ").append(toIndentedString(assignment)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    billableId: ").append(toIndentedString(billableId)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
    sb.append("    urifolder: ").append(toIndentedString(urifolder)).append("\n");
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

