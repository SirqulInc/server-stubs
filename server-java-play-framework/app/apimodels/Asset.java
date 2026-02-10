package apimodels;

import apimodels.Account;
import apimodels.Album;
import apimodels.Application;
import apimodels.Assignment;
import apimodels.Flag;
import apimodels.FlagThreshold;
import apimodels.Note;
import apimodels.YayOrNay;
import java.net.URI;
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
 * Asset
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Asset   {
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

  @JsonProperty("premigrationId")
  
  private Long premigrationId;

  @JsonProperty("newOwnerId")
  
  private Long newOwnerId;

  @JsonProperty("folderUri")
  
  private String folderUri;

  @JsonProperty("fileName")
  
  private String fileName;

  @JsonProperty("mediaType")
  
  private String mediaType;

  @JsonProperty("mimeType")
  
  private String mimeType;

  @JsonProperty("metaData")
  
  private String metaData;

  @JsonProperty("caption")
  
  private String caption;

  @JsonProperty("versionCode")
  
  private Integer versionCode;

  @JsonProperty("versionName")
  
  private String versionName;

  @JsonProperty("likeCount")
  
  private Long likeCount;

  @JsonProperty("dislikeCount")
  
  private Long dislikeCount;

  @JsonProperty("noteCount")
  
  private Long noteCount;

  @JsonProperty("owner")
  @Valid

  private Account owner;

  @JsonProperty("notes")
  @Valid

  private List<@Valid Note> notes = null;

  @JsonProperty("likes")
  @Valid

  private List<@Valid YayOrNay> likes = null;

  @JsonProperty("attachedAssetId")
  
  private Long attachedAssetId;

  @JsonProperty("flags")
  @Valid

  private List<@Valid Flag> flags = null;

  @JsonProperty("flagCount")
  
  private Long flagCount;

  @JsonProperty("flagThreshold")
  @Valid

  private FlagThreshold flagThreshold;

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

  @JsonProperty("defaultAlbumType")
  
  private DefaultAlbumTypeEnum defaultAlbumType;

  @JsonProperty("album")
  @Valid

  private Album album;

  @JsonProperty("assignment")
  @Valid

  private Assignment assignment;

  @JsonProperty("application")
  @Valid

  private Application application;

  @JsonProperty("display")
  
  private String display;

  @JsonProperty("appKey")
  
  private String appKey;

  @JsonProperty("billableId")
  
  private Long billableId;

  @JsonProperty("subType")
  
  private String subType;

  @JsonProperty("contentName")
  
  private String contentName;

  @JsonProperty("urifolder")
  @Valid

  private URI urifolder;

  @JsonProperty("defaultThreshold")
  
  private Long defaultThreshold;

  public Asset id(Long id) {
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

  public Asset active(Boolean active) {
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

  public Asset valid(Boolean valid) {
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

  public Asset latitude(Double latitude) {
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

  public Asset longitude(Double longitude) {
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

  public Asset locationDescription(String locationDescription) {
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

  public Asset premigrationId(Long premigrationId) {
    this.premigrationId = premigrationId;
    return this;
  }

   /**
   * Get premigrationId
   * @return premigrationId
  **/
  public Long getPremigrationId() {
    return premigrationId;
  }

  public void setPremigrationId(Long premigrationId) {
    this.premigrationId = premigrationId;
  }

  public Asset newOwnerId(Long newOwnerId) {
    this.newOwnerId = newOwnerId;
    return this;
  }

   /**
   * Get newOwnerId
   * @return newOwnerId
  **/
  public Long getNewOwnerId() {
    return newOwnerId;
  }

  public void setNewOwnerId(Long newOwnerId) {
    this.newOwnerId = newOwnerId;
  }

  public Asset folderUri(String folderUri) {
    this.folderUri = folderUri;
    return this;
  }

   /**
   * Get folderUri
   * @return folderUri
  **/
  public String getFolderUri() {
    return folderUri;
  }

  public void setFolderUri(String folderUri) {
    this.folderUri = folderUri;
  }

  public Asset fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public Asset mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public Asset mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Get mimeType
   * @return mimeType
  **/
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public Asset metaData(String metaData) {
    this.metaData = metaData;
    return this;
  }

   /**
   * Get metaData
   * @return metaData
  **/
  public String getMetaData() {
    return metaData;
  }

  public void setMetaData(String metaData) {
    this.metaData = metaData;
  }

  public Asset caption(String caption) {
    this.caption = caption;
    return this;
  }

   /**
   * Get caption
   * @return caption
  **/
  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public Asset versionCode(Integer versionCode) {
    this.versionCode = versionCode;
    return this;
  }

   /**
   * Get versionCode
   * @return versionCode
  **/
  public Integer getVersionCode() {
    return versionCode;
  }

  public void setVersionCode(Integer versionCode) {
    this.versionCode = versionCode;
  }

  public Asset versionName(String versionName) {
    this.versionName = versionName;
    return this;
  }

   /**
   * Get versionName
   * @return versionName
  **/
  public String getVersionName() {
    return versionName;
  }

  public void setVersionName(String versionName) {
    this.versionName = versionName;
  }

  public Asset likeCount(Long likeCount) {
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

  public Asset dislikeCount(Long dislikeCount) {
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

  public Asset noteCount(Long noteCount) {
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

  public Asset owner(Account owner) {
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
  **/
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
  **/
  public List<@Valid YayOrNay> getLikes() {
    return likes;
  }

  public void setLikes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
  }

  public Asset attachedAssetId(Long attachedAssetId) {
    this.attachedAssetId = attachedAssetId;
    return this;
  }

   /**
   * Get attachedAssetId
   * @return attachedAssetId
  **/
  public Long getAttachedAssetId() {
    return attachedAssetId;
  }

  public void setAttachedAssetId(Long attachedAssetId) {
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
  **/
  public List<@Valid Flag> getFlags() {
    return flags;
  }

  public void setFlags(List<@Valid Flag> flags) {
    this.flags = flags;
  }

  public Asset flagCount(Long flagCount) {
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

  public Asset flagThreshold(FlagThreshold flagThreshold) {
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

  public Asset defaultAlbumType(DefaultAlbumTypeEnum defaultAlbumType) {
    this.defaultAlbumType = defaultAlbumType;
    return this;
  }

   /**
   * Get defaultAlbumType
   * @return defaultAlbumType
  **/
  public DefaultAlbumTypeEnum getDefaultAlbumType() {
    return defaultAlbumType;
  }

  public void setDefaultAlbumType(DefaultAlbumTypeEnum defaultAlbumType) {
    this.defaultAlbumType = defaultAlbumType;
  }

  public Asset album(Album album) {
    this.album = album;
    return this;
  }

   /**
   * Get album
   * @return album
  **/
  public Album getAlbum() {
    return album;
  }

  public void setAlbum(Album album) {
    this.album = album;
  }

  public Asset assignment(Assignment assignment) {
    this.assignment = assignment;
    return this;
  }

   /**
   * Get assignment
   * @return assignment
  **/
  public Assignment getAssignment() {
    return assignment;
  }

  public void setAssignment(Assignment assignment) {
    this.assignment = assignment;
  }

  public Asset application(Application application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }

  public Asset display(String display) {
    this.display = display;
    return this;
  }

   /**
   * Get display
   * @return display
  **/
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public Asset appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

   /**
   * Get appKey
   * @return appKey
  **/
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public Asset billableId(Long billableId) {
    this.billableId = billableId;
    return this;
  }

   /**
   * Get billableId
   * @return billableId
  **/
  public Long getBillableId() {
    return billableId;
  }

  public void setBillableId(Long billableId) {
    this.billableId = billableId;
  }

  public Asset subType(String subType) {
    this.subType = subType;
    return this;
  }

   /**
   * Get subType
   * @return subType
  **/
  public String getSubType() {
    return subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
  }

  public Asset contentName(String contentName) {
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

  public Asset urifolder(URI urifolder) {
    this.urifolder = urifolder;
    return this;
  }

   /**
   * Get urifolder
   * @return urifolder
  **/
  public URI getUrifolder() {
    return urifolder;
  }

  public void setUrifolder(URI urifolder) {
    this.urifolder = urifolder;
  }

  public Asset defaultThreshold(Long defaultThreshold) {
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
    Asset asset = (Asset) o;
    return Objects.equals(id, asset.id) &&
        Objects.equals(active, asset.active) &&
        Objects.equals(valid, asset.valid) &&
        Objects.equals(latitude, asset.latitude) &&
        Objects.equals(longitude, asset.longitude) &&
        Objects.equals(locationDescription, asset.locationDescription) &&
        Objects.equals(premigrationId, asset.premigrationId) &&
        Objects.equals(newOwnerId, asset.newOwnerId) &&
        Objects.equals(folderUri, asset.folderUri) &&
        Objects.equals(fileName, asset.fileName) &&
        Objects.equals(mediaType, asset.mediaType) &&
        Objects.equals(mimeType, asset.mimeType) &&
        Objects.equals(metaData, asset.metaData) &&
        Objects.equals(caption, asset.caption) &&
        Objects.equals(versionCode, asset.versionCode) &&
        Objects.equals(versionName, asset.versionName) &&
        Objects.equals(likeCount, asset.likeCount) &&
        Objects.equals(dislikeCount, asset.dislikeCount) &&
        Objects.equals(noteCount, asset.noteCount) &&
        Objects.equals(owner, asset.owner) &&
        Objects.equals(notes, asset.notes) &&
        Objects.equals(likes, asset.likes) &&
        Objects.equals(attachedAssetId, asset.attachedAssetId) &&
        Objects.equals(flags, asset.flags) &&
        Objects.equals(flagCount, asset.flagCount) &&
        Objects.equals(flagThreshold, asset.flagThreshold) &&
        Objects.equals(defaultAlbumType, asset.defaultAlbumType) &&
        Objects.equals(album, asset.album) &&
        Objects.equals(assignment, asset.assignment) &&
        Objects.equals(application, asset.application) &&
        Objects.equals(display, asset.display) &&
        Objects.equals(appKey, asset.appKey) &&
        Objects.equals(billableId, asset.billableId) &&
        Objects.equals(subType, asset.subType) &&
        Objects.equals(contentName, asset.contentName) &&
        Objects.equals(urifolder, asset.urifolder) &&
        Objects.equals(defaultThreshold, asset.defaultThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, latitude, longitude, locationDescription, premigrationId, newOwnerId, folderUri, fileName, mediaType, mimeType, metaData, caption, versionCode, versionName, likeCount, dislikeCount, noteCount, owner, notes, likes, attachedAssetId, flags, flagCount, flagThreshold, defaultAlbumType, album, assignment, application, display, appKey, billableId, subType, contentName, urifolder, defaultThreshold);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

