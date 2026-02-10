package apimodels;

import apimodels.Account;
import apimodels.Asset;
import apimodels.Audience;
import apimodels.Note;
import apimodels.Offer;
import apimodels.RetailerLocation;
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
 * OfferLocation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OfferLocation   {
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

  @JsonProperty("offer")
  @Valid

  private Offer offer;

  @JsonProperty("location")
  @Valid

  private RetailerLocation location;

  @JsonProperty("distance")
  
  private Double distance;

  @JsonProperty("altitude")
  
  private Double altitude;

  @JsonProperty("customValue")
  
  private Double customValue;

  @JsonProperty("locationDetail")
  
  private String locationDetail;

  @JsonProperty("audiences")
  @Valid

  private List<@Valid Audience> audiences = null;

  @JsonProperty("qrInviteCode")
  @Valid

  private Asset qrInviteCode;

  @JsonProperty("notes")
  @Valid

  private List<@Valid Note> notes = null;

  @JsonProperty("noteCount")
  
  private Long noteCount;

  @JsonProperty("searchIndexUpdated")
  @Valid

  private OffsetDateTime searchIndexUpdated;

  @JsonProperty("inSearchIndex")
  
  private Boolean inSearchIndex;

  @JsonProperty("favoriteCount")
  
  private Long favoriteCount;

  @JsonProperty("addedCount")
  
  private Integer addedCount;

  @JsonProperty("display")
  
  private String display;

  @JsonProperty("appKey")
  
  private String appKey;

  @JsonProperty("devicePower")
  
  private Double devicePower;

  @JsonProperty("powerLoss")
  
  private Double powerLoss;

  @JsonProperty("udid")
  
  private String udid;

  @JsonProperty("billableId")
  
  private Long billableId;

  @JsonProperty("subType")
  
  private String subType;

  @JsonProperty("contentName")
  
  private String contentName;

  @JsonProperty("contentAsset")
  @Valid

  private Asset contentAsset;

  @JsonProperty("owner")
  @Valid

  private Account owner;

  @JsonProperty("secondaryType")
  
  private String secondaryType;

  @JsonProperty("categoryIds")
  
  private List<Long> categoryIds = null;

  @JsonProperty("filterIds")
  
  private List<Long> filterIds = null;

  public OfferLocation id(Long id) {
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

  public OfferLocation active(Boolean active) {
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

  public OfferLocation valid(Boolean valid) {
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

  public OfferLocation latitude(Double latitude) {
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

  public OfferLocation longitude(Double longitude) {
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

  public OfferLocation locationDescription(String locationDescription) {
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

  public OfferLocation offer(Offer offer) {
    this.offer = offer;
    return this;
  }

   /**
   * Get offer
   * @return offer
  **/
  public Offer getOffer() {
    return offer;
  }

  public void setOffer(Offer offer) {
    this.offer = offer;
  }

  public OfferLocation location(RetailerLocation location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  public RetailerLocation getLocation() {
    return location;
  }

  public void setLocation(RetailerLocation location) {
    this.location = location;
  }

  public OfferLocation distance(Double distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public OfferLocation altitude(Double altitude) {
    this.altitude = altitude;
    return this;
  }

   /**
   * Get altitude
   * @return altitude
  **/
  public Double getAltitude() {
    return altitude;
  }

  public void setAltitude(Double altitude) {
    this.altitude = altitude;
  }

  public OfferLocation customValue(Double customValue) {
    this.customValue = customValue;
    return this;
  }

   /**
   * Get customValue
   * @return customValue
  **/
  public Double getCustomValue() {
    return customValue;
  }

  public void setCustomValue(Double customValue) {
    this.customValue = customValue;
  }

  public OfferLocation locationDetail(String locationDetail) {
    this.locationDetail = locationDetail;
    return this;
  }

   /**
   * Get locationDetail
   * @return locationDetail
  **/
  public String getLocationDetail() {
    return locationDetail;
  }

  public void setLocationDetail(String locationDetail) {
    this.locationDetail = locationDetail;
  }

  public OfferLocation audiences(List<@Valid Audience> audiences) {
    this.audiences = audiences;
    return this;
  }

  public OfferLocation addAudiencesItem(Audience audiencesItem) {
    if (this.audiences == null) {
      this.audiences = new ArrayList<>();
    }
    this.audiences.add(audiencesItem);
    return this;
  }

   /**
   * Get audiences
   * @return audiences
  **/
  public List<@Valid Audience> getAudiences() {
    return audiences;
  }

  public void setAudiences(List<@Valid Audience> audiences) {
    this.audiences = audiences;
  }

  public OfferLocation qrInviteCode(Asset qrInviteCode) {
    this.qrInviteCode = qrInviteCode;
    return this;
  }

   /**
   * Get qrInviteCode
   * @return qrInviteCode
  **/
  public Asset getQrInviteCode() {
    return qrInviteCode;
  }

  public void setQrInviteCode(Asset qrInviteCode) {
    this.qrInviteCode = qrInviteCode;
  }

  public OfferLocation notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public OfferLocation addNotesItem(Note notesItem) {
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

  public OfferLocation noteCount(Long noteCount) {
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

  public OfferLocation searchIndexUpdated(OffsetDateTime searchIndexUpdated) {
    this.searchIndexUpdated = searchIndexUpdated;
    return this;
  }

   /**
   * Get searchIndexUpdated
   * @return searchIndexUpdated
  **/
  public OffsetDateTime getSearchIndexUpdated() {
    return searchIndexUpdated;
  }

  public void setSearchIndexUpdated(OffsetDateTime searchIndexUpdated) {
    this.searchIndexUpdated = searchIndexUpdated;
  }

  public OfferLocation inSearchIndex(Boolean inSearchIndex) {
    this.inSearchIndex = inSearchIndex;
    return this;
  }

   /**
   * Get inSearchIndex
   * @return inSearchIndex
  **/
  public Boolean getInSearchIndex() {
    return inSearchIndex;
  }

  public void setInSearchIndex(Boolean inSearchIndex) {
    this.inSearchIndex = inSearchIndex;
  }

  public OfferLocation favoriteCount(Long favoriteCount) {
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

  public OfferLocation addedCount(Integer addedCount) {
    this.addedCount = addedCount;
    return this;
  }

   /**
   * Get addedCount
   * @return addedCount
  **/
  public Integer getAddedCount() {
    return addedCount;
  }

  public void setAddedCount(Integer addedCount) {
    this.addedCount = addedCount;
  }

  public OfferLocation display(String display) {
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

  public OfferLocation appKey(String appKey) {
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

  public OfferLocation devicePower(Double devicePower) {
    this.devicePower = devicePower;
    return this;
  }

   /**
   * Get devicePower
   * @return devicePower
  **/
  public Double getDevicePower() {
    return devicePower;
  }

  public void setDevicePower(Double devicePower) {
    this.devicePower = devicePower;
  }

  public OfferLocation powerLoss(Double powerLoss) {
    this.powerLoss = powerLoss;
    return this;
  }

   /**
   * Get powerLoss
   * @return powerLoss
  **/
  public Double getPowerLoss() {
    return powerLoss;
  }

  public void setPowerLoss(Double powerLoss) {
    this.powerLoss = powerLoss;
  }

  public OfferLocation udid(String udid) {
    this.udid = udid;
    return this;
  }

   /**
   * Get udid
   * @return udid
  **/
  public String getUdid() {
    return udid;
  }

  public void setUdid(String udid) {
    this.udid = udid;
  }

  public OfferLocation billableId(Long billableId) {
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

  public OfferLocation subType(String subType) {
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

  public OfferLocation contentName(String contentName) {
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

  public OfferLocation contentAsset(Asset contentAsset) {
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

  public OfferLocation owner(Account owner) {
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

  public OfferLocation secondaryType(String secondaryType) {
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

  public OfferLocation categoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  public OfferLocation addCategoryIdsItem(Long categoryIdsItem) {
    if (this.categoryIds == null) {
      this.categoryIds = new ArrayList<>();
    }
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

   /**
   * Get categoryIds
   * @return categoryIds
  **/
  public List<Long> getCategoryIds() {
    return categoryIds;
  }

  public void setCategoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
  }

  public OfferLocation filterIds(List<Long> filterIds) {
    this.filterIds = filterIds;
    return this;
  }

  public OfferLocation addFilterIdsItem(Long filterIdsItem) {
    if (this.filterIds == null) {
      this.filterIds = new ArrayList<>();
    }
    this.filterIds.add(filterIdsItem);
    return this;
  }

   /**
   * Get filterIds
   * @return filterIds
  **/
  public List<Long> getFilterIds() {
    return filterIds;
  }

  public void setFilterIds(List<Long> filterIds) {
    this.filterIds = filterIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferLocation offerLocation = (OfferLocation) o;
    return Objects.equals(id, offerLocation.id) &&
        Objects.equals(active, offerLocation.active) &&
        Objects.equals(valid, offerLocation.valid) &&
        Objects.equals(latitude, offerLocation.latitude) &&
        Objects.equals(longitude, offerLocation.longitude) &&
        Objects.equals(locationDescription, offerLocation.locationDescription) &&
        Objects.equals(offer, offerLocation.offer) &&
        Objects.equals(location, offerLocation.location) &&
        Objects.equals(distance, offerLocation.distance) &&
        Objects.equals(altitude, offerLocation.altitude) &&
        Objects.equals(customValue, offerLocation.customValue) &&
        Objects.equals(locationDetail, offerLocation.locationDetail) &&
        Objects.equals(audiences, offerLocation.audiences) &&
        Objects.equals(qrInviteCode, offerLocation.qrInviteCode) &&
        Objects.equals(notes, offerLocation.notes) &&
        Objects.equals(noteCount, offerLocation.noteCount) &&
        Objects.equals(searchIndexUpdated, offerLocation.searchIndexUpdated) &&
        Objects.equals(inSearchIndex, offerLocation.inSearchIndex) &&
        Objects.equals(favoriteCount, offerLocation.favoriteCount) &&
        Objects.equals(addedCount, offerLocation.addedCount) &&
        Objects.equals(display, offerLocation.display) &&
        Objects.equals(appKey, offerLocation.appKey) &&
        Objects.equals(devicePower, offerLocation.devicePower) &&
        Objects.equals(powerLoss, offerLocation.powerLoss) &&
        Objects.equals(udid, offerLocation.udid) &&
        Objects.equals(billableId, offerLocation.billableId) &&
        Objects.equals(subType, offerLocation.subType) &&
        Objects.equals(contentName, offerLocation.contentName) &&
        Objects.equals(contentAsset, offerLocation.contentAsset) &&
        Objects.equals(owner, offerLocation.owner) &&
        Objects.equals(secondaryType, offerLocation.secondaryType) &&
        Objects.equals(categoryIds, offerLocation.categoryIds) &&
        Objects.equals(filterIds, offerLocation.filterIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, latitude, longitude, locationDescription, offer, location, distance, altitude, customValue, locationDetail, audiences, qrInviteCode, notes, noteCount, searchIndexUpdated, inSearchIndex, favoriteCount, addedCount, display, appKey, devicePower, powerLoss, udid, billableId, subType, contentName, contentAsset, owner, secondaryType, categoryIds, filterIds);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferLocation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
    sb.append("    customValue: ").append(toIndentedString(customValue)).append("\n");
    sb.append("    locationDetail: ").append(toIndentedString(locationDetail)).append("\n");
    sb.append("    audiences: ").append(toIndentedString(audiences)).append("\n");
    sb.append("    qrInviteCode: ").append(toIndentedString(qrInviteCode)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    noteCount: ").append(toIndentedString(noteCount)).append("\n");
    sb.append("    searchIndexUpdated: ").append(toIndentedString(searchIndexUpdated)).append("\n");
    sb.append("    inSearchIndex: ").append(toIndentedString(inSearchIndex)).append("\n");
    sb.append("    favoriteCount: ").append(toIndentedString(favoriteCount)).append("\n");
    sb.append("    addedCount: ").append(toIndentedString(addedCount)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    devicePower: ").append(toIndentedString(devicePower)).append("\n");
    sb.append("    powerLoss: ").append(toIndentedString(powerLoss)).append("\n");
    sb.append("    udid: ").append(toIndentedString(udid)).append("\n");
    sb.append("    billableId: ").append(toIndentedString(billableId)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
    sb.append("    contentAsset: ").append(toIndentedString(contentAsset)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    secondaryType: ").append(toIndentedString(secondaryType)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
    sb.append("    filterIds: ").append(toIndentedString(filterIds)).append("\n");
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

