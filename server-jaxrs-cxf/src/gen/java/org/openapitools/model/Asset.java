package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Asset  {
  
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

  private Long premigrationId;

  @ApiModelProperty(value = "")

  private Long newOwnerId;

  @ApiModelProperty(value = "")

  private String folderUri;

  @ApiModelProperty(value = "")

  private String fileName;

  @ApiModelProperty(value = "")

  private String mediaType;

  @ApiModelProperty(value = "")

  private String mimeType;

  @ApiModelProperty(value = "")

  private String metaData;

  @ApiModelProperty(value = "")

  private String caption;

  @ApiModelProperty(value = "")

  private Integer versionCode;

  @ApiModelProperty(value = "")

  private String versionName;

  @ApiModelProperty(value = "")

  private Long likeCount;

  @ApiModelProperty(value = "")

  private Long dislikeCount;

  @ApiModelProperty(value = "")

  private Long noteCount;

  @ApiModelProperty(value = "")

  @Valid

  private Account owner;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Note> notes = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid YayOrNay> likes = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long attachedAssetId;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Flag> flags = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long flagCount;

  @ApiModelProperty(value = "")

  @Valid

  private FlagThreshold flagThreshold;

public enum DefaultAlbumTypeEnum {

PROFILE(String.valueOf("PROFILE")), DEFAULT_PROFILE_AVATAR(String.valueOf("DEFAULT_PROFILE_AVATAR")), DEFAULT_APP_ICON(String.valueOf("DEFAULT_APP_ICON")), DEFAULT_APP_LOGO(String.valueOf("DEFAULT_APP_LOGO"));


    private String value;

    DefaultAlbumTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

  @ApiModelProperty(value = "")

  private DefaultAlbumTypeEnum defaultAlbumType;

  @ApiModelProperty(value = "")

  @Valid

  private Album album;

  @ApiModelProperty(value = "")

  @Valid

  private Assignment assignment;

  @ApiModelProperty(value = "")

  @Valid

  private Application application;

  @ApiModelProperty(value = "")

  private String display;

  @ApiModelProperty(value = "")

  private String appKey;

  @ApiModelProperty(value = "")

  private Long billableId;

  @ApiModelProperty(value = "")

  private String subType;

  @ApiModelProperty(value = "")

  private String contentName;

  @ApiModelProperty(value = "")

  private URI urifolder;

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

  public Asset id(Long id) {
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

  public Asset active(Boolean active) {
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

  public Asset valid(Boolean valid) {
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

  public Asset latitude(Double latitude) {
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

  public Asset longitude(Double longitude) {
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

  public Asset locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

 /**
   * Get premigrationId
   * @return premigrationId
  **/
  @JsonProperty("premigrationId")
  public Long getPremigrationId() {
    return premigrationId;
  }

  public void setPremigrationId(Long premigrationId) {
    this.premigrationId = premigrationId;
  }

  public Asset premigrationId(Long premigrationId) {
    this.premigrationId = premigrationId;
    return this;
  }

 /**
   * Get newOwnerId
   * @return newOwnerId
  **/
  @JsonProperty("newOwnerId")
  public Long getNewOwnerId() {
    return newOwnerId;
  }

  public void setNewOwnerId(Long newOwnerId) {
    this.newOwnerId = newOwnerId;
  }

  public Asset newOwnerId(Long newOwnerId) {
    this.newOwnerId = newOwnerId;
    return this;
  }

 /**
   * Get folderUri
   * @return folderUri
  **/
  @JsonProperty("folderUri")
  public String getFolderUri() {
    return folderUri;
  }

  public void setFolderUri(String folderUri) {
    this.folderUri = folderUri;
  }

  public Asset folderUri(String folderUri) {
    this.folderUri = folderUri;
    return this;
  }

 /**
   * Get fileName
   * @return fileName
  **/
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public Asset fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

 /**
   * Get mediaType
   * @return mediaType
  **/
  @JsonProperty("mediaType")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public Asset mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

 /**
   * Get mimeType
   * @return mimeType
  **/
  @JsonProperty("mimeType")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public Asset mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

 /**
   * Get metaData
   * @return metaData
  **/
  @JsonProperty("metaData")
  public String getMetaData() {
    return metaData;
  }

  public void setMetaData(String metaData) {
    this.metaData = metaData;
  }

  public Asset metaData(String metaData) {
    this.metaData = metaData;
    return this;
  }

 /**
   * Get caption
   * @return caption
  **/
  @JsonProperty("caption")
  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public Asset caption(String caption) {
    this.caption = caption;
    return this;
  }

 /**
   * Get versionCode
   * @return versionCode
  **/
  @JsonProperty("versionCode")
  public Integer getVersionCode() {
    return versionCode;
  }

  public void setVersionCode(Integer versionCode) {
    this.versionCode = versionCode;
  }

  public Asset versionCode(Integer versionCode) {
    this.versionCode = versionCode;
    return this;
  }

 /**
   * Get versionName
   * @return versionName
  **/
  @JsonProperty("versionName")
  public String getVersionName() {
    return versionName;
  }

  public void setVersionName(String versionName) {
    this.versionName = versionName;
  }

  public Asset versionName(String versionName) {
    this.versionName = versionName;
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

  public Asset likeCount(Long likeCount) {
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

  public Asset dislikeCount(Long dislikeCount) {
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

  public Asset noteCount(Long noteCount) {
    this.noteCount = noteCount;
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

  public Asset owner(Account owner) {
    this.owner = owner;
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

  public Asset notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public Asset addNotesItem(Note notesItem) {
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

  public Asset likes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
    return this;
  }

  public Asset addLikesItem(YayOrNay likesItem) {
    this.likes.add(likesItem);
    return this;
  }

 /**
   * Get attachedAssetId
   * @return attachedAssetId
  **/
  @JsonProperty("attachedAssetId")
  public Long getAttachedAssetId() {
    return attachedAssetId;
  }

  public void setAttachedAssetId(Long attachedAssetId) {
    this.attachedAssetId = attachedAssetId;
  }

  public Asset attachedAssetId(Long attachedAssetId) {
    this.attachedAssetId = attachedAssetId;
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

  public Asset flags(List<@Valid Flag> flags) {
    this.flags = flags;
    return this;
  }

  public Asset addFlagsItem(Flag flagsItem) {
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

  public Asset flagCount(Long flagCount) {
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

  public Asset flagThreshold(FlagThreshold flagThreshold) {
    this.flagThreshold = flagThreshold;
    return this;
  }

 /**
   * Get defaultAlbumType
   * @return defaultAlbumType
  **/
  @JsonProperty("defaultAlbumType")
  public String getDefaultAlbumType() {
    if (defaultAlbumType == null) {
      return null;
    }
    return defaultAlbumType.value();
  }

  public void setDefaultAlbumType(DefaultAlbumTypeEnum defaultAlbumType) {
    this.defaultAlbumType = defaultAlbumType;
  }

  public Asset defaultAlbumType(DefaultAlbumTypeEnum defaultAlbumType) {
    this.defaultAlbumType = defaultAlbumType;
    return this;
  }

 /**
   * Get album
   * @return album
  **/
  @JsonProperty("album")
  public Album getAlbum() {
    return album;
  }

  public void setAlbum(Album album) {
    this.album = album;
  }

  public Asset album(Album album) {
    this.album = album;
    return this;
  }

 /**
   * Get assignment
   * @return assignment
  **/
  @JsonProperty("assignment")
  public Assignment getAssignment() {
    return assignment;
  }

  public void setAssignment(Assignment assignment) {
    this.assignment = assignment;
  }

  public Asset assignment(Assignment assignment) {
    this.assignment = assignment;
    return this;
  }

 /**
   * Get application
   * @return application
  **/
  @JsonProperty("application")
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }

  public Asset application(Application application) {
    this.application = application;
    return this;
  }

 /**
   * Get display
   * @return display
  **/
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public Asset display(String display) {
    this.display = display;
    return this;
  }

 /**
   * Get appKey
   * @return appKey
  **/
  @JsonProperty("appKey")
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public Asset appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

 /**
   * Get billableId
   * @return billableId
  **/
  @JsonProperty("billableId")
  public Long getBillableId() {
    return billableId;
  }

  public void setBillableId(Long billableId) {
    this.billableId = billableId;
  }

  public Asset billableId(Long billableId) {
    this.billableId = billableId;
    return this;
  }

 /**
   * Get subType
   * @return subType
  **/
  @JsonProperty("subType")
  public String getSubType() {
    return subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
  }

  public Asset subType(String subType) {
    this.subType = subType;
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

  public Asset contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

 /**
   * Get urifolder
   * @return urifolder
  **/
  @JsonProperty("urifolder")
  public URI getUrifolder() {
    return urifolder;
  }

  public void setUrifolder(URI urifolder) {
    this.urifolder = urifolder;
  }

  public Asset urifolder(URI urifolder) {
    this.urifolder = urifolder;
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

  public Asset defaultThreshold(Long defaultThreshold) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

