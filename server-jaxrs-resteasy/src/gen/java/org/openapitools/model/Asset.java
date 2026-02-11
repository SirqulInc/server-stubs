package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Asset   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Double latitude;
  private Double longitude;
  private String locationDescription;
  private Long premigrationId;
  private Long newOwnerId;
  private String folderUri;
  private String fileName;
  private String mediaType;
  private String mimeType;
  private String metaData;
  private String caption;
  private Integer versionCode;
  private String versionName;
  private Long likeCount;
  private Long dislikeCount;
  private Long noteCount;
  private Account owner;
  private List<@Valid Note> notes = new ArrayList<>();
  private List<@Valid YayOrNay> likes = new ArrayList<>();
  private Long attachedAssetId;
  private List<@Valid Flag> flags = new ArrayList<>();
  private Long flagCount;
  private FlagThreshold flagThreshold;

  /**
   * Gets or Sets defaultAlbumType
   */
  public enum DefaultAlbumTypeEnum {
    PROFILE("PROFILE"),

        DEFAULT_PROFILE_AVATAR("DEFAULT_PROFILE_AVATAR"),

        DEFAULT_APP_ICON("DEFAULT_APP_ICON"),

        DEFAULT_APP_LOGO("DEFAULT_APP_LOGO");
    private String value;

    DefaultAlbumTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private DefaultAlbumTypeEnum defaultAlbumType;
  private Album album;
  private Assignment assignment;
  private Application application;
  private String display;
  private String appKey;
  private Long billableId;
  private String subType;
  private String contentName;
  private URI urifolder;
  private Long defaultThreshold;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationDescription")
  public String getLocationDescription() {
    return locationDescription;
  }
  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("premigrationId")
  public Long getPremigrationId() {
    return premigrationId;
  }
  public void setPremigrationId(Long premigrationId) {
    this.premigrationId = premigrationId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("newOwnerId")
  public Long getNewOwnerId() {
    return newOwnerId;
  }
  public void setNewOwnerId(Long newOwnerId) {
    this.newOwnerId = newOwnerId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("folderUri")
  public String getFolderUri() {
    return folderUri;
  }
  public void setFolderUri(String folderUri) {
    this.folderUri = folderUri;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mediaType")
  public String getMediaType() {
    return mediaType;
  }
  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mimeType")
  public String getMimeType() {
    return mimeType;
  }
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("metaData")
  public String getMetaData() {
    return metaData;
  }
  public void setMetaData(String metaData) {
    this.metaData = metaData;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("caption")
  public String getCaption() {
    return caption;
  }
  public void setCaption(String caption) {
    this.caption = caption;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("versionCode")
  public Integer getVersionCode() {
    return versionCode;
  }
  public void setVersionCode(Integer versionCode) {
    this.versionCode = versionCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("versionName")
  public String getVersionName() {
    return versionName;
  }
  public void setVersionName(String versionName) {
    this.versionName = versionName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("likeCount")
  public Long getLikeCount() {
    return likeCount;
  }
  public void setLikeCount(Long likeCount) {
    this.likeCount = likeCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dislikeCount")
  public Long getDislikeCount() {
    return dislikeCount;
  }
  public void setDislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("noteCount")
  public Long getNoteCount() {
    return noteCount;
  }
  public void setNoteCount(Long noteCount) {
    this.noteCount = noteCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("owner")
  @Valid
  public Account getOwner() {
    return owner;
  }
  public void setOwner(Account owner) {
    this.owner = owner;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notes")
  @Valid
  public List<@Valid Note> getNotes() {
    return notes;
  }
  public void setNotes(List<@Valid Note> notes) {
    this.notes = notes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("likes")
  @Valid
  public List<@Valid YayOrNay> getLikes() {
    return likes;
  }
  public void setLikes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("attachedAssetId")
  public Long getAttachedAssetId() {
    return attachedAssetId;
  }
  public void setAttachedAssetId(Long attachedAssetId) {
    this.attachedAssetId = attachedAssetId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flags")
  @Valid
  public List<@Valid Flag> getFlags() {
    return flags;
  }
  public void setFlags(List<@Valid Flag> flags) {
    this.flags = flags;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flagCount")
  public Long getFlagCount() {
    return flagCount;
  }
  public void setFlagCount(Long flagCount) {
    this.flagCount = flagCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flagThreshold")
  @Valid
  public FlagThreshold getFlagThreshold() {
    return flagThreshold;
  }
  public void setFlagThreshold(FlagThreshold flagThreshold) {
    this.flagThreshold = flagThreshold;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultAlbumType")
  public DefaultAlbumTypeEnum getDefaultAlbumType() {
    return defaultAlbumType;
  }
  public void setDefaultAlbumType(DefaultAlbumTypeEnum defaultAlbumType) {
    this.defaultAlbumType = defaultAlbumType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("album")
  @Valid
  public Album getAlbum() {
    return album;
  }
  public void setAlbum(Album album) {
    this.album = album;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("assignment")
  @Valid
  public Assignment getAssignment() {
    return assignment;
  }
  public void setAssignment(Assignment assignment) {
    this.assignment = assignment;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("application")
  @Valid
  public Application getApplication() {
    return application;
  }
  public void setApplication(Application application) {
    this.application = application;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }
  public void setDisplay(String display) {
    this.display = display;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appKey")
  public String getAppKey() {
    return appKey;
  }
  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billableId")
  public Long getBillableId() {
    return billableId;
  }
  public void setBillableId(Long billableId) {
    this.billableId = billableId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("subType")
  public String getSubType() {
    return subType;
  }
  public void setSubType(String subType) {
    this.subType = subType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contentName")
  public String getContentName() {
    return contentName;
  }
  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("urifolder")
  public URI getUrifolder() {
    return urifolder;
  }
  public void setUrifolder(URI urifolder) {
    this.urifolder = urifolder;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultThreshold")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

