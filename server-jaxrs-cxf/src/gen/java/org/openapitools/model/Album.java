package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Application;
import org.openapitools.model.Asset;
import org.openapitools.model.ContactInfo;
import org.openapitools.model.Flag;
import org.openapitools.model.FlagThreshold;
import org.openapitools.model.Note;
import org.openapitools.model.Permissions;
import org.openapitools.model.UserPermissions;
import org.openapitools.model.YayOrNay;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Album  {
  
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

  private String title;

  @ApiModelProperty(value = "")

  @Valid

  private Application application;

public enum ApprovalStatusEnum {

PENDING(String.valueOf("PENDING")), REJECTED(String.valueOf("REJECTED")), APPROVED(String.valueOf("APPROVED")), FEATURED(String.valueOf("FEATURED"));


    private String value;

    ApprovalStatusEnum (String v) {
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
    public static ApprovalStatusEnum fromValue(String value) {
        for (ApprovalStatusEnum b : ApprovalStatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ApprovalStatusEnum approvalStatus;

  @ApiModelProperty(value = "")

  @Valid

  private Permissions publicPermissions;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid UserPermissions> userPermissions = new ArrayList<>();

public enum VisibilityEnum {

PUBLIC(String.valueOf("PUBLIC")), PRIVATE(String.valueOf("PRIVATE")), FRIENDS(String.valueOf("FRIENDS"));


    private String value;

    VisibilityEnum (String v) {
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
    public static VisibilityEnum fromValue(String value) {
        for (VisibilityEnum b : VisibilityEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private VisibilityEnum visibility;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Note> notes = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long noteCount;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid YayOrNay> likes = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long likeCount;

  @ApiModelProperty(value = "")

  private Long dislikeCount;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Flag> flags = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long flagCount;

  @ApiModelProperty(value = "")

  @Valid

  private FlagThreshold flagThreshold;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private String albumType;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Asset> assets = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private Asset coverAsset;

  @ApiModelProperty(value = "")

  private String tags;

  @ApiModelProperty(value = "")

  private Date startDate;

  @ApiModelProperty(value = "")

  private Date endDate;

  @ApiModelProperty(value = "")

  @Valid

  private ContactInfo contactInfo;

  @ApiModelProperty(value = "")

  private Long assetCount;

  @ApiModelProperty(value = "")

  private Long favoriteCount;

  @ApiModelProperty(value = "")

  private Long viewedCount;

  @ApiModelProperty(value = "")

  private Long clickedCount;

  @ApiModelProperty(value = "")

  private Long sharedCount;

  @ApiModelProperty(value = "")

  private Boolean anonymous;

  @ApiModelProperty(value = "")

  private String ownerUsername;

  @ApiModelProperty(value = "")

  private String display;

  @ApiModelProperty(value = "")

  private String appKey;

  @ApiModelProperty(value = "")

  private Long billableId;

  @ApiModelProperty(value = "")

  private String subType;

  @ApiModelProperty(value = "")

  @Valid

  private Asset contentAsset;

  @ApiModelProperty(value = "")

  private String secondaryType;

  @ApiModelProperty(value = "")

  private String contentName;

  @ApiModelProperty(value = "")

  private String applicationTitle;

  @ApiModelProperty(value = "")

  private String shortTitle;

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

  public Album id(Long id) {
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

  public Album active(Boolean active) {
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

  public Album valid(Boolean valid) {
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

  public Album latitude(Double latitude) {
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

  public Album longitude(Double longitude) {
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

  public Album locationDescription(String locationDescription) {
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

  public Album owner(Account owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Album title(String title) {
    this.title = title;
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

  public Album application(Application application) {
    this.application = application;
    return this;
  }

 /**
   * Get approvalStatus
   * @return approvalStatus
  **/
  @JsonProperty("approvalStatus")
  public String getApprovalStatus() {
    if (approvalStatus == null) {
      return null;
    }
    return approvalStatus.value();
  }

  public void setApprovalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public Album approvalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

 /**
   * Get publicPermissions
   * @return publicPermissions
  **/
  @JsonProperty("publicPermissions")
  public Permissions getPublicPermissions() {
    return publicPermissions;
  }

  public void setPublicPermissions(Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
  }

  public Album publicPermissions(Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
    return this;
  }

 /**
   * Get userPermissions
   * @return userPermissions
  **/
  @JsonProperty("userPermissions")
  public List<@Valid UserPermissions> getUserPermissions() {
    return userPermissions;
  }

  public void setUserPermissions(List<@Valid UserPermissions> userPermissions) {
    this.userPermissions = userPermissions;
  }

  public Album userPermissions(List<@Valid UserPermissions> userPermissions) {
    this.userPermissions = userPermissions;
    return this;
  }

  public Album addUserPermissionsItem(UserPermissions userPermissionsItem) {
    this.userPermissions.add(userPermissionsItem);
    return this;
  }

 /**
   * Get visibility
   * @return visibility
  **/
  @JsonProperty("visibility")
  public String getVisibility() {
    if (visibility == null) {
      return null;
    }
    return visibility.value();
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public Album visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
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

  public Album notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public Album addNotesItem(Note notesItem) {
    this.notes.add(notesItem);
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

  public Album noteCount(Long noteCount) {
    this.noteCount = noteCount;
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

  public Album likes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
    return this;
  }

  public Album addLikesItem(YayOrNay likesItem) {
    this.likes.add(likesItem);
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

  public Album likeCount(Long likeCount) {
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

  public Album dislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
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

  public Album flags(List<@Valid Flag> flags) {
    this.flags = flags;
    return this;
  }

  public Album addFlagsItem(Flag flagsItem) {
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

  public Album flagCount(Long flagCount) {
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

  public Album flagThreshold(FlagThreshold flagThreshold) {
    this.flagThreshold = flagThreshold;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Album description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get albumType
   * @return albumType
  **/
  @JsonProperty("albumType")
  public String getAlbumType() {
    return albumType;
  }

  public void setAlbumType(String albumType) {
    this.albumType = albumType;
  }

  public Album albumType(String albumType) {
    this.albumType = albumType;
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

  public Album assets(List<@Valid Asset> assets) {
    this.assets = assets;
    return this;
  }

  public Album addAssetsItem(Asset assetsItem) {
    this.assets.add(assetsItem);
    return this;
  }

 /**
   * Get coverAsset
   * @return coverAsset
  **/
  @JsonProperty("coverAsset")
  public Asset getCoverAsset() {
    return coverAsset;
  }

  public void setCoverAsset(Asset coverAsset) {
    this.coverAsset = coverAsset;
  }

  public Album coverAsset(Asset coverAsset) {
    this.coverAsset = coverAsset;
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

  public Album tags(String tags) {
    this.tags = tags;
    return this;
  }

 /**
   * Get startDate
   * @return startDate
  **/
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Album startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * Get endDate
   * @return endDate
  **/
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public Album endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * Get contactInfo
   * @return contactInfo
  **/
  @JsonProperty("contactInfo")
  public ContactInfo getContactInfo() {
    return contactInfo;
  }

  public void setContactInfo(ContactInfo contactInfo) {
    this.contactInfo = contactInfo;
  }

  public Album contactInfo(ContactInfo contactInfo) {
    this.contactInfo = contactInfo;
    return this;
  }

 /**
   * Get assetCount
   * @return assetCount
  **/
  @JsonProperty("assetCount")
  public Long getAssetCount() {
    return assetCount;
  }

  public void setAssetCount(Long assetCount) {
    this.assetCount = assetCount;
  }

  public Album assetCount(Long assetCount) {
    this.assetCount = assetCount;
    return this;
  }

 /**
   * Get favoriteCount
   * @return favoriteCount
  **/
  @JsonProperty("favoriteCount")
  public Long getFavoriteCount() {
    return favoriteCount;
  }

  public void setFavoriteCount(Long favoriteCount) {
    this.favoriteCount = favoriteCount;
  }

  public Album favoriteCount(Long favoriteCount) {
    this.favoriteCount = favoriteCount;
    return this;
  }

 /**
   * Get viewedCount
   * @return viewedCount
  **/
  @JsonProperty("viewedCount")
  public Long getViewedCount() {
    return viewedCount;
  }

  public void setViewedCount(Long viewedCount) {
    this.viewedCount = viewedCount;
  }

  public Album viewedCount(Long viewedCount) {
    this.viewedCount = viewedCount;
    return this;
  }

 /**
   * Get clickedCount
   * @return clickedCount
  **/
  @JsonProperty("clickedCount")
  public Long getClickedCount() {
    return clickedCount;
  }

  public void setClickedCount(Long clickedCount) {
    this.clickedCount = clickedCount;
  }

  public Album clickedCount(Long clickedCount) {
    this.clickedCount = clickedCount;
    return this;
  }

 /**
   * Get sharedCount
   * @return sharedCount
  **/
  @JsonProperty("sharedCount")
  public Long getSharedCount() {
    return sharedCount;
  }

  public void setSharedCount(Long sharedCount) {
    this.sharedCount = sharedCount;
  }

  public Album sharedCount(Long sharedCount) {
    this.sharedCount = sharedCount;
    return this;
  }

 /**
   * Get anonymous
   * @return anonymous
  **/
  @JsonProperty("anonymous")
  public Boolean getAnonymous() {
    return anonymous;
  }

  public void setAnonymous(Boolean anonymous) {
    this.anonymous = anonymous;
  }

  public Album anonymous(Boolean anonymous) {
    this.anonymous = anonymous;
    return this;
  }

 /**
   * Get ownerUsername
   * @return ownerUsername
  **/
  @JsonProperty("ownerUsername")
  public String getOwnerUsername() {
    return ownerUsername;
  }

  public void setOwnerUsername(String ownerUsername) {
    this.ownerUsername = ownerUsername;
  }

  public Album ownerUsername(String ownerUsername) {
    this.ownerUsername = ownerUsername;
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

  public Album display(String display) {
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

  public Album appKey(String appKey) {
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

  public Album billableId(Long billableId) {
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

  public Album subType(String subType) {
    this.subType = subType;
    return this;
  }

 /**
   * Get contentAsset
   * @return contentAsset
  **/
  @JsonProperty("contentAsset")
  public Asset getContentAsset() {
    return contentAsset;
  }

  public void setContentAsset(Asset contentAsset) {
    this.contentAsset = contentAsset;
  }

  public Album contentAsset(Asset contentAsset) {
    this.contentAsset = contentAsset;
    return this;
  }

 /**
   * Get secondaryType
   * @return secondaryType
  **/
  @JsonProperty("secondaryType")
  public String getSecondaryType() {
    return secondaryType;
  }

  public void setSecondaryType(String secondaryType) {
    this.secondaryType = secondaryType;
  }

  public Album secondaryType(String secondaryType) {
    this.secondaryType = secondaryType;
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

  public Album contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

 /**
   * Get applicationTitle
   * @return applicationTitle
  **/
  @JsonProperty("applicationTitle")
  public String getApplicationTitle() {
    return applicationTitle;
  }

  public void setApplicationTitle(String applicationTitle) {
    this.applicationTitle = applicationTitle;
  }

  public Album applicationTitle(String applicationTitle) {
    this.applicationTitle = applicationTitle;
    return this;
  }

 /**
   * Get shortTitle
   * @return shortTitle
  **/
  @JsonProperty("shortTitle")
  public String getShortTitle() {
    return shortTitle;
  }

  public void setShortTitle(String shortTitle) {
    this.shortTitle = shortTitle;
  }

  public Album shortTitle(String shortTitle) {
    this.shortTitle = shortTitle;
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

  public Album defaultThreshold(Long defaultThreshold) {
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
    Album album = (Album) o;
    return Objects.equals(this.id, album.id) &&
        Objects.equals(this.active, album.active) &&
        Objects.equals(this.valid, album.valid) &&
        Objects.equals(this.latitude, album.latitude) &&
        Objects.equals(this.longitude, album.longitude) &&
        Objects.equals(this.locationDescription, album.locationDescription) &&
        Objects.equals(this.owner, album.owner) &&
        Objects.equals(this.title, album.title) &&
        Objects.equals(this.application, album.application) &&
        Objects.equals(this.approvalStatus, album.approvalStatus) &&
        Objects.equals(this.publicPermissions, album.publicPermissions) &&
        Objects.equals(this.userPermissions, album.userPermissions) &&
        Objects.equals(this.visibility, album.visibility) &&
        Objects.equals(this.notes, album.notes) &&
        Objects.equals(this.noteCount, album.noteCount) &&
        Objects.equals(this.likes, album.likes) &&
        Objects.equals(this.likeCount, album.likeCount) &&
        Objects.equals(this.dislikeCount, album.dislikeCount) &&
        Objects.equals(this.flags, album.flags) &&
        Objects.equals(this.flagCount, album.flagCount) &&
        Objects.equals(this.flagThreshold, album.flagThreshold) &&
        Objects.equals(this.description, album.description) &&
        Objects.equals(this.albumType, album.albumType) &&
        Objects.equals(this.assets, album.assets) &&
        Objects.equals(this.coverAsset, album.coverAsset) &&
        Objects.equals(this.tags, album.tags) &&
        Objects.equals(this.startDate, album.startDate) &&
        Objects.equals(this.endDate, album.endDate) &&
        Objects.equals(this.contactInfo, album.contactInfo) &&
        Objects.equals(this.assetCount, album.assetCount) &&
        Objects.equals(this.favoriteCount, album.favoriteCount) &&
        Objects.equals(this.viewedCount, album.viewedCount) &&
        Objects.equals(this.clickedCount, album.clickedCount) &&
        Objects.equals(this.sharedCount, album.sharedCount) &&
        Objects.equals(this.anonymous, album.anonymous) &&
        Objects.equals(this.ownerUsername, album.ownerUsername) &&
        Objects.equals(this.display, album.display) &&
        Objects.equals(this.appKey, album.appKey) &&
        Objects.equals(this.billableId, album.billableId) &&
        Objects.equals(this.subType, album.subType) &&
        Objects.equals(this.contentAsset, album.contentAsset) &&
        Objects.equals(this.secondaryType, album.secondaryType) &&
        Objects.equals(this.contentName, album.contentName) &&
        Objects.equals(this.applicationTitle, album.applicationTitle) &&
        Objects.equals(this.shortTitle, album.shortTitle) &&
        Objects.equals(this.defaultThreshold, album.defaultThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, latitude, longitude, locationDescription, owner, title, application, approvalStatus, publicPermissions, userPermissions, visibility, notes, noteCount, likes, likeCount, dislikeCount, flags, flagCount, flagThreshold, description, albumType, assets, coverAsset, tags, startDate, endDate, contactInfo, assetCount, favoriteCount, viewedCount, clickedCount, sharedCount, anonymous, ownerUsername, display, appKey, billableId, subType, contentAsset, secondaryType, contentName, applicationTitle, shortTitle, defaultThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Album {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    publicPermissions: ").append(toIndentedString(publicPermissions)).append("\n");
    sb.append("    userPermissions: ").append(toIndentedString(userPermissions)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    noteCount: ").append(toIndentedString(noteCount)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    likeCount: ").append(toIndentedString(likeCount)).append("\n");
    sb.append("    dislikeCount: ").append(toIndentedString(dislikeCount)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    flagCount: ").append(toIndentedString(flagCount)).append("\n");
    sb.append("    flagThreshold: ").append(toIndentedString(flagThreshold)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    albumType: ").append(toIndentedString(albumType)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    coverAsset: ").append(toIndentedString(coverAsset)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    contactInfo: ").append(toIndentedString(contactInfo)).append("\n");
    sb.append("    assetCount: ").append(toIndentedString(assetCount)).append("\n");
    sb.append("    favoriteCount: ").append(toIndentedString(favoriteCount)).append("\n");
    sb.append("    viewedCount: ").append(toIndentedString(viewedCount)).append("\n");
    sb.append("    clickedCount: ").append(toIndentedString(clickedCount)).append("\n");
    sb.append("    sharedCount: ").append(toIndentedString(sharedCount)).append("\n");
    sb.append("    anonymous: ").append(toIndentedString(anonymous)).append("\n");
    sb.append("    ownerUsername: ").append(toIndentedString(ownerUsername)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    billableId: ").append(toIndentedString(billableId)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    contentAsset: ").append(toIndentedString(contentAsset)).append("\n");
    sb.append("    secondaryType: ").append(toIndentedString(secondaryType)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
    sb.append("    applicationTitle: ").append(toIndentedString(applicationTitle)).append("\n");
    sb.append("    shortTitle: ").append(toIndentedString(shortTitle)).append("\n");
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

