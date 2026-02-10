package apimodels;

import apimodels.Account;
import apimodels.Application;
import apimodels.Asset;
import apimodels.ContactInfo;
import apimodels.Flag;
import apimodels.FlagThreshold;
import apimodels.Note;
import apimodels.Permissions;
import apimodels.UserPermissions;
import apimodels.YayOrNay;
import java.time.OffsetDateTime;
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
 * Album
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Album   {
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

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("application")
  @Valid

  private Application application;

  /**
   * Gets or Sets approvalStatus
   */
  public enum ApprovalStatusEnum {
    PENDING("PENDING"),
    
    REJECTED("REJECTED"),
    
    APPROVED("APPROVED"),
    
    FEATURED("FEATURED");

    private final String value;

    ApprovalStatusEnum(String value) {
      this.value = value;
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

  @JsonProperty("approvalStatus")
  
  private ApprovalStatusEnum approvalStatus;

  @JsonProperty("publicPermissions")
  @Valid

  private Permissions publicPermissions;

  @JsonProperty("userPermissions")
  @Valid

  private List<@Valid UserPermissions> userPermissions = null;

  /**
   * Gets or Sets visibility
   */
  public enum VisibilityEnum {
    PUBLIC("PUBLIC"),
    
    PRIVATE("PRIVATE"),
    
    FRIENDS("FRIENDS");

    private final String value;

    VisibilityEnum(String value) {
      this.value = value;
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

  @JsonProperty("visibility")
  
  private VisibilityEnum visibility;

  @JsonProperty("notes")
  @Valid

  private List<@Valid Note> notes = null;

  @JsonProperty("noteCount")
  
  private Long noteCount;

  @JsonProperty("likes")
  @Valid

  private List<@Valid YayOrNay> likes = null;

  @JsonProperty("likeCount")
  
  private Long likeCount;

  @JsonProperty("dislikeCount")
  
  private Long dislikeCount;

  @JsonProperty("flags")
  @Valid

  private List<@Valid Flag> flags = null;

  @JsonProperty("flagCount")
  
  private Long flagCount;

  @JsonProperty("flagThreshold")
  @Valid

  private FlagThreshold flagThreshold;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("albumType")
  
  private String albumType;

  @JsonProperty("assets")
  @Valid

  private List<@Valid Asset> assets = null;

  @JsonProperty("coverAsset")
  @Valid

  private Asset coverAsset;

  @JsonProperty("tags")
  
  private String tags;

  @JsonProperty("startDate")
  @Valid

  private OffsetDateTime startDate;

  @JsonProperty("endDate")
  @Valid

  private OffsetDateTime endDate;

  @JsonProperty("contactInfo")
  @Valid

  private ContactInfo contactInfo;

  @JsonProperty("assetCount")
  
  private Long assetCount;

  @JsonProperty("favoriteCount")
  
  private Long favoriteCount;

  @JsonProperty("viewedCount")
  
  private Long viewedCount;

  @JsonProperty("clickedCount")
  
  private Long clickedCount;

  @JsonProperty("sharedCount")
  
  private Long sharedCount;

  @JsonProperty("anonymous")
  
  private Boolean anonymous;

  @JsonProperty("ownerUsername")
  
  private String ownerUsername;

  @JsonProperty("display")
  
  private String display;

  @JsonProperty("appKey")
  
  private String appKey;

  @JsonProperty("billableId")
  
  private Long billableId;

  @JsonProperty("subType")
  
  private String subType;

  @JsonProperty("contentAsset")
  @Valid

  private Asset contentAsset;

  @JsonProperty("secondaryType")
  
  private String secondaryType;

  @JsonProperty("contentName")
  
  private String contentName;

  @JsonProperty("applicationTitle")
  
  private String applicationTitle;

  @JsonProperty("shortTitle")
  
  private String shortTitle;

  @JsonProperty("defaultThreshold")
  
  private Long defaultThreshold;

  public Album id(Long id) {
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

  public Album active(Boolean active) {
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

  public Album valid(Boolean valid) {
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

  public Album latitude(Double latitude) {
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

  public Album longitude(Double longitude) {
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

  public Album locationDescription(String locationDescription) {
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

  public Album owner(Account owner) {
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

  public Album title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Album application(Application application) {
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

  public Album approvalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

   /**
   * Get approvalStatus
   * @return approvalStatus
  **/
  public ApprovalStatusEnum getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public Album publicPermissions(Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
    return this;
  }

   /**
   * Get publicPermissions
   * @return publicPermissions
  **/
  public Permissions getPublicPermissions() {
    return publicPermissions;
  }

  public void setPublicPermissions(Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
  }

  public Album userPermissions(List<@Valid UserPermissions> userPermissions) {
    this.userPermissions = userPermissions;
    return this;
  }

  public Album addUserPermissionsItem(UserPermissions userPermissionsItem) {
    if (this.userPermissions == null) {
      this.userPermissions = new ArrayList<>();
    }
    this.userPermissions.add(userPermissionsItem);
    return this;
  }

   /**
   * Get userPermissions
   * @return userPermissions
  **/
  public List<@Valid UserPermissions> getUserPermissions() {
    return userPermissions;
  }

  public void setUserPermissions(List<@Valid UserPermissions> userPermissions) {
    this.userPermissions = userPermissions;
  }

  public Album visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public Album notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public Album addNotesItem(Note notesItem) {
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

  public Album noteCount(Long noteCount) {
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

  public Album likes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
    return this;
  }

  public Album addLikesItem(YayOrNay likesItem) {
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

  public Album likeCount(Long likeCount) {
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

  public Album dislikeCount(Long dislikeCount) {
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

  public Album flags(List<@Valid Flag> flags) {
    this.flags = flags;
    return this;
  }

  public Album addFlagsItem(Flag flagsItem) {
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

  public Album flagCount(Long flagCount) {
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

  public Album flagThreshold(FlagThreshold flagThreshold) {
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

  public Album description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Album albumType(String albumType) {
    this.albumType = albumType;
    return this;
  }

   /**
   * Get albumType
   * @return albumType
  **/
  public String getAlbumType() {
    return albumType;
  }

  public void setAlbumType(String albumType) {
    this.albumType = albumType;
  }

  public Album assets(List<@Valid Asset> assets) {
    this.assets = assets;
    return this;
  }

  public Album addAssetsItem(Asset assetsItem) {
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

  public Album coverAsset(Asset coverAsset) {
    this.coverAsset = coverAsset;
    return this;
  }

   /**
   * Get coverAsset
   * @return coverAsset
  **/
  public Asset getCoverAsset() {
    return coverAsset;
  }

  public void setCoverAsset(Asset coverAsset) {
    this.coverAsset = coverAsset;
  }

  public Album tags(String tags) {
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

  public Album startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public Album endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public Album contactInfo(ContactInfo contactInfo) {
    this.contactInfo = contactInfo;
    return this;
  }

   /**
   * Get contactInfo
   * @return contactInfo
  **/
  public ContactInfo getContactInfo() {
    return contactInfo;
  }

  public void setContactInfo(ContactInfo contactInfo) {
    this.contactInfo = contactInfo;
  }

  public Album assetCount(Long assetCount) {
    this.assetCount = assetCount;
    return this;
  }

   /**
   * Get assetCount
   * @return assetCount
  **/
  public Long getAssetCount() {
    return assetCount;
  }

  public void setAssetCount(Long assetCount) {
    this.assetCount = assetCount;
  }

  public Album favoriteCount(Long favoriteCount) {
    this.favoriteCount = favoriteCount;
    return this;
  }

   /**
   * Get favoriteCount
   * @return favoriteCount
  **/
  public Long getFavoriteCount() {
    return favoriteCount;
  }

  public void setFavoriteCount(Long favoriteCount) {
    this.favoriteCount = favoriteCount;
  }

  public Album viewedCount(Long viewedCount) {
    this.viewedCount = viewedCount;
    return this;
  }

   /**
   * Get viewedCount
   * @return viewedCount
  **/
  public Long getViewedCount() {
    return viewedCount;
  }

  public void setViewedCount(Long viewedCount) {
    this.viewedCount = viewedCount;
  }

  public Album clickedCount(Long clickedCount) {
    this.clickedCount = clickedCount;
    return this;
  }

   /**
   * Get clickedCount
   * @return clickedCount
  **/
  public Long getClickedCount() {
    return clickedCount;
  }

  public void setClickedCount(Long clickedCount) {
    this.clickedCount = clickedCount;
  }

  public Album sharedCount(Long sharedCount) {
    this.sharedCount = sharedCount;
    return this;
  }

   /**
   * Get sharedCount
   * @return sharedCount
  **/
  public Long getSharedCount() {
    return sharedCount;
  }

  public void setSharedCount(Long sharedCount) {
    this.sharedCount = sharedCount;
  }

  public Album anonymous(Boolean anonymous) {
    this.anonymous = anonymous;
    return this;
  }

   /**
   * Get anonymous
   * @return anonymous
  **/
  public Boolean getAnonymous() {
    return anonymous;
  }

  public void setAnonymous(Boolean anonymous) {
    this.anonymous = anonymous;
  }

  public Album ownerUsername(String ownerUsername) {
    this.ownerUsername = ownerUsername;
    return this;
  }

   /**
   * Get ownerUsername
   * @return ownerUsername
  **/
  public String getOwnerUsername() {
    return ownerUsername;
  }

  public void setOwnerUsername(String ownerUsername) {
    this.ownerUsername = ownerUsername;
  }

  public Album display(String display) {
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

  public Album appKey(String appKey) {
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

  public Album billableId(Long billableId) {
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

  public Album subType(String subType) {
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

  public Album contentAsset(Asset contentAsset) {
    this.contentAsset = contentAsset;
    return this;
  }

   /**
   * Get contentAsset
   * @return contentAsset
  **/
  public Asset getContentAsset() {
    return contentAsset;
  }

  public void setContentAsset(Asset contentAsset) {
    this.contentAsset = contentAsset;
  }

  public Album secondaryType(String secondaryType) {
    this.secondaryType = secondaryType;
    return this;
  }

   /**
   * Get secondaryType
   * @return secondaryType
  **/
  public String getSecondaryType() {
    return secondaryType;
  }

  public void setSecondaryType(String secondaryType) {
    this.secondaryType = secondaryType;
  }

  public Album contentName(String contentName) {
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

  public Album applicationTitle(String applicationTitle) {
    this.applicationTitle = applicationTitle;
    return this;
  }

   /**
   * Get applicationTitle
   * @return applicationTitle
  **/
  public String getApplicationTitle() {
    return applicationTitle;
  }

  public void setApplicationTitle(String applicationTitle) {
    this.applicationTitle = applicationTitle;
  }

  public Album shortTitle(String shortTitle) {
    this.shortTitle = shortTitle;
    return this;
  }

   /**
   * Get shortTitle
   * @return shortTitle
  **/
  public String getShortTitle() {
    return shortTitle;
  }

  public void setShortTitle(String shortTitle) {
    this.shortTitle = shortTitle;
  }

  public Album defaultThreshold(Long defaultThreshold) {
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
    Album album = (Album) o;
    return Objects.equals(id, album.id) &&
        Objects.equals(active, album.active) &&
        Objects.equals(valid, album.valid) &&
        Objects.equals(latitude, album.latitude) &&
        Objects.equals(longitude, album.longitude) &&
        Objects.equals(locationDescription, album.locationDescription) &&
        Objects.equals(owner, album.owner) &&
        Objects.equals(title, album.title) &&
        Objects.equals(application, album.application) &&
        Objects.equals(approvalStatus, album.approvalStatus) &&
        Objects.equals(publicPermissions, album.publicPermissions) &&
        Objects.equals(userPermissions, album.userPermissions) &&
        Objects.equals(visibility, album.visibility) &&
        Objects.equals(notes, album.notes) &&
        Objects.equals(noteCount, album.noteCount) &&
        Objects.equals(likes, album.likes) &&
        Objects.equals(likeCount, album.likeCount) &&
        Objects.equals(dislikeCount, album.dislikeCount) &&
        Objects.equals(flags, album.flags) &&
        Objects.equals(flagCount, album.flagCount) &&
        Objects.equals(flagThreshold, album.flagThreshold) &&
        Objects.equals(description, album.description) &&
        Objects.equals(albumType, album.albumType) &&
        Objects.equals(assets, album.assets) &&
        Objects.equals(coverAsset, album.coverAsset) &&
        Objects.equals(tags, album.tags) &&
        Objects.equals(startDate, album.startDate) &&
        Objects.equals(endDate, album.endDate) &&
        Objects.equals(contactInfo, album.contactInfo) &&
        Objects.equals(assetCount, album.assetCount) &&
        Objects.equals(favoriteCount, album.favoriteCount) &&
        Objects.equals(viewedCount, album.viewedCount) &&
        Objects.equals(clickedCount, album.clickedCount) &&
        Objects.equals(sharedCount, album.sharedCount) &&
        Objects.equals(anonymous, album.anonymous) &&
        Objects.equals(ownerUsername, album.ownerUsername) &&
        Objects.equals(display, album.display) &&
        Objects.equals(appKey, album.appKey) &&
        Objects.equals(billableId, album.billableId) &&
        Objects.equals(subType, album.subType) &&
        Objects.equals(contentAsset, album.contentAsset) &&
        Objects.equals(secondaryType, album.secondaryType) &&
        Objects.equals(contentName, album.contentName) &&
        Objects.equals(applicationTitle, album.applicationTitle) &&
        Objects.equals(shortTitle, album.shortTitle) &&
        Objects.equals(defaultThreshold, album.defaultThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, latitude, longitude, locationDescription, owner, title, application, approvalStatus, publicPermissions, userPermissions, visibility, notes, noteCount, likes, likeCount, dislikeCount, flags, flagCount, flagThreshold, description, albumType, assets, coverAsset, tags, startDate, endDate, contactInfo, assetCount, favoriteCount, viewedCount, clickedCount, sharedCount, anonymous, ownerUsername, display, appKey, billableId, subType, contentAsset, secondaryType, contentName, applicationTitle, shortTitle, defaultThreshold);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

