package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Album   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Double latitude;
  private Double longitude;
  private String locationDescription;
  private Account owner;
  private String title;
  private Application application;

  /**
   * Gets or Sets approvalStatus
   */
  public enum ApprovalStatusEnum {
    PENDING("PENDING"),

        REJECTED("REJECTED"),

        APPROVED("APPROVED"),

        FEATURED("FEATURED");
    private String value;

    ApprovalStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ApprovalStatusEnum approvalStatus;
  private Permissions publicPermissions;
  private List<@Valid UserPermissions> userPermissions = new ArrayList<>();

  /**
   * Gets or Sets visibility
   */
  public enum VisibilityEnum {
    PUBLIC("PUBLIC"),

        PRIVATE("PRIVATE"),

        FRIENDS("FRIENDS");
    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private VisibilityEnum visibility;
  private List<@Valid Note> notes = new ArrayList<>();
  private Long noteCount;
  private List<@Valid YayOrNay> likes = new ArrayList<>();
  private Long likeCount;
  private Long dislikeCount;
  private List<@Valid Flag> flags = new ArrayList<>();
  private Long flagCount;
  private FlagThreshold flagThreshold;
  private String description;
  private String albumType;
  private List<@Valid Asset> assets = new ArrayList<>();
  private Asset coverAsset;
  private String tags;
  private Date startDate;
  private Date endDate;
  private ContactInfo contactInfo;
  private Long assetCount;
  private Long favoriteCount;
  private Long viewedCount;
  private Long clickedCount;
  private Long sharedCount;
  private Boolean anonymous;
  private String ownerUsername;
  private String display;
  private String appKey;
  private Long billableId;
  private String subType;
  private Asset contentAsset;
  private String secondaryType;
  private String contentName;
  private String applicationTitle;
  private String shortTitle;
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
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
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
  @JsonProperty("approvalStatus")
  public ApprovalStatusEnum getApprovalStatus() {
    return approvalStatus;
  }
  public void setApprovalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("publicPermissions")
  @Valid
  public Permissions getPublicPermissions() {
    return publicPermissions;
  }
  public void setPublicPermissions(Permissions publicPermissions) {
    this.publicPermissions = publicPermissions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userPermissions")
  @Valid
  public List<@Valid UserPermissions> getUserPermissions() {
    return userPermissions;
  }
  public void setUserPermissions(List<@Valid UserPermissions> userPermissions) {
    this.userPermissions = userPermissions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("visibility")
  public VisibilityEnum getVisibility() {
    return visibility;
  }
  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
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
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("albumType")
  public String getAlbumType() {
    return albumType;
  }
  public void setAlbumType(String albumType) {
    this.albumType = albumType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("assets")
  @Valid
  public List<@Valid Asset> getAssets() {
    return assets;
  }
  public void setAssets(List<@Valid Asset> assets) {
    this.assets = assets;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("coverAsset")
  @Valid
  public Asset getCoverAsset() {
    return coverAsset;
  }
  public void setCoverAsset(Asset coverAsset) {
    this.coverAsset = coverAsset;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tags")
  public String getTags() {
    return tags;
  }
  public void setTags(String tags) {
    this.tags = tags;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contactInfo")
  @Valid
  public ContactInfo getContactInfo() {
    return contactInfo;
  }
  public void setContactInfo(ContactInfo contactInfo) {
    this.contactInfo = contactInfo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("assetCount")
  public Long getAssetCount() {
    return assetCount;
  }
  public void setAssetCount(Long assetCount) {
    this.assetCount = assetCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("favoriteCount")
  public Long getFavoriteCount() {
    return favoriteCount;
  }
  public void setFavoriteCount(Long favoriteCount) {
    this.favoriteCount = favoriteCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("viewedCount")
  public Long getViewedCount() {
    return viewedCount;
  }
  public void setViewedCount(Long viewedCount) {
    this.viewedCount = viewedCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("clickedCount")
  public Long getClickedCount() {
    return clickedCount;
  }
  public void setClickedCount(Long clickedCount) {
    this.clickedCount = clickedCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sharedCount")
  public Long getSharedCount() {
    return sharedCount;
  }
  public void setSharedCount(Long sharedCount) {
    this.sharedCount = sharedCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("anonymous")
  public Boolean getAnonymous() {
    return anonymous;
  }
  public void setAnonymous(Boolean anonymous) {
    this.anonymous = anonymous;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ownerUsername")
  public String getOwnerUsername() {
    return ownerUsername;
  }
  public void setOwnerUsername(String ownerUsername) {
    this.ownerUsername = ownerUsername;
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
  @JsonProperty("contentAsset")
  @Valid
  public Asset getContentAsset() {
    return contentAsset;
  }
  public void setContentAsset(Asset contentAsset) {
    this.contentAsset = contentAsset;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("secondaryType")
  public String getSecondaryType() {
    return secondaryType;
  }
  public void setSecondaryType(String secondaryType) {
    this.secondaryType = secondaryType;
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
  @JsonProperty("applicationTitle")
  public String getApplicationTitle() {
    return applicationTitle;
  }
  public void setApplicationTitle(String applicationTitle) {
    this.applicationTitle = applicationTitle;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shortTitle")
  public String getShortTitle() {
    return shortTitle;
  }
  public void setShortTitle(String shortTitle) {
    this.shortTitle = shortTitle;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

