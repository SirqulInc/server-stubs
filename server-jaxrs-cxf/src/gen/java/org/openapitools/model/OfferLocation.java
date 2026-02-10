package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Asset;
import org.openapitools.model.Audience;
import org.openapitools.model.Note;
import org.openapitools.model.Offer;
import org.openapitools.model.RetailerLocation;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OfferLocation  {
  
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

  private Offer offer;

  @ApiModelProperty(value = "")

  @Valid

  private RetailerLocation location;

  @ApiModelProperty(value = "")

  private Double distance;

  @ApiModelProperty(value = "")

  private Double altitude;

  @ApiModelProperty(value = "")

  private Double customValue;

  @ApiModelProperty(value = "")

  private String locationDetail;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Audience> audiences = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private Asset qrInviteCode;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Note> notes = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long noteCount;

  @ApiModelProperty(value = "")

  private Date searchIndexUpdated;

  @ApiModelProperty(value = "")

  private Boolean inSearchIndex;

  @ApiModelProperty(value = "")

  private Long favoriteCount;

  @ApiModelProperty(value = "")

  private Integer addedCount;

  @ApiModelProperty(value = "")

  private String display;

  @ApiModelProperty(value = "")

  private String appKey;

  @ApiModelProperty(value = "")

  private Double devicePower;

  @ApiModelProperty(value = "")

  private Double powerLoss;

  @ApiModelProperty(value = "")

  private String udid;

  @ApiModelProperty(value = "")

  private Long billableId;

  @ApiModelProperty(value = "")

  private String subType;

  @ApiModelProperty(value = "")

  private String contentName;

  @ApiModelProperty(value = "")

  @Valid

  private Asset contentAsset;

  @ApiModelProperty(value = "")

  @Valid

  private Account owner;

  @ApiModelProperty(value = "")

  private String secondaryType;

  @ApiModelProperty(value = "")

  private List<Long> categoryIds = new ArrayList<>();

  @ApiModelProperty(value = "")

  private List<Long> filterIds = new ArrayList<>();
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

  public OfferLocation id(Long id) {
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

  public OfferLocation active(Boolean active) {
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

  public OfferLocation valid(Boolean valid) {
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

  public OfferLocation latitude(Double latitude) {
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

  public OfferLocation longitude(Double longitude) {
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

  public OfferLocation locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

 /**
   * Get offer
   * @return offer
  **/
  @JsonProperty("offer")
  public Offer getOffer() {
    return offer;
  }

  public void setOffer(Offer offer) {
    this.offer = offer;
  }

  public OfferLocation offer(Offer offer) {
    this.offer = offer;
    return this;
  }

 /**
   * Get location
   * @return location
  **/
  @JsonProperty("location")
  public RetailerLocation getLocation() {
    return location;
  }

  public void setLocation(RetailerLocation location) {
    this.location = location;
  }

  public OfferLocation location(RetailerLocation location) {
    this.location = location;
    return this;
  }

 /**
   * Get distance
   * @return distance
  **/
  @JsonProperty("distance")
  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public OfferLocation distance(Double distance) {
    this.distance = distance;
    return this;
  }

 /**
   * Get altitude
   * @return altitude
  **/
  @JsonProperty("altitude")
  public Double getAltitude() {
    return altitude;
  }

  public void setAltitude(Double altitude) {
    this.altitude = altitude;
  }

  public OfferLocation altitude(Double altitude) {
    this.altitude = altitude;
    return this;
  }

 /**
   * Get customValue
   * @return customValue
  **/
  @JsonProperty("customValue")
  public Double getCustomValue() {
    return customValue;
  }

  public void setCustomValue(Double customValue) {
    this.customValue = customValue;
  }

  public OfferLocation customValue(Double customValue) {
    this.customValue = customValue;
    return this;
  }

 /**
   * Get locationDetail
   * @return locationDetail
  **/
  @JsonProperty("locationDetail")
  public String getLocationDetail() {
    return locationDetail;
  }

  public void setLocationDetail(String locationDetail) {
    this.locationDetail = locationDetail;
  }

  public OfferLocation locationDetail(String locationDetail) {
    this.locationDetail = locationDetail;
    return this;
  }

 /**
   * Get audiences
   * @return audiences
  **/
  @JsonProperty("audiences")
  public List<@Valid Audience> getAudiences() {
    return audiences;
  }

  public void setAudiences(List<@Valid Audience> audiences) {
    this.audiences = audiences;
  }

  public OfferLocation audiences(List<@Valid Audience> audiences) {
    this.audiences = audiences;
    return this;
  }

  public OfferLocation addAudiencesItem(Audience audiencesItem) {
    this.audiences.add(audiencesItem);
    return this;
  }

 /**
   * Get qrInviteCode
   * @return qrInviteCode
  **/
  @JsonProperty("qrInviteCode")
  public Asset getQrInviteCode() {
    return qrInviteCode;
  }

  public void setQrInviteCode(Asset qrInviteCode) {
    this.qrInviteCode = qrInviteCode;
  }

  public OfferLocation qrInviteCode(Asset qrInviteCode) {
    this.qrInviteCode = qrInviteCode;
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

  public OfferLocation notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public OfferLocation addNotesItem(Note notesItem) {
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

  public OfferLocation noteCount(Long noteCount) {
    this.noteCount = noteCount;
    return this;
  }

 /**
   * Get searchIndexUpdated
   * @return searchIndexUpdated
  **/
  @JsonProperty("searchIndexUpdated")
  public Date getSearchIndexUpdated() {
    return searchIndexUpdated;
  }

  public void setSearchIndexUpdated(Date searchIndexUpdated) {
    this.searchIndexUpdated = searchIndexUpdated;
  }

  public OfferLocation searchIndexUpdated(Date searchIndexUpdated) {
    this.searchIndexUpdated = searchIndexUpdated;
    return this;
  }

 /**
   * Get inSearchIndex
   * @return inSearchIndex
  **/
  @JsonProperty("inSearchIndex")
  public Boolean getInSearchIndex() {
    return inSearchIndex;
  }

  public void setInSearchIndex(Boolean inSearchIndex) {
    this.inSearchIndex = inSearchIndex;
  }

  public OfferLocation inSearchIndex(Boolean inSearchIndex) {
    this.inSearchIndex = inSearchIndex;
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

  public OfferLocation favoriteCount(Long favoriteCount) {
    this.favoriteCount = favoriteCount;
    return this;
  }

 /**
   * Get addedCount
   * @return addedCount
  **/
  @JsonProperty("addedCount")
  public Integer getAddedCount() {
    return addedCount;
  }

  public void setAddedCount(Integer addedCount) {
    this.addedCount = addedCount;
  }

  public OfferLocation addedCount(Integer addedCount) {
    this.addedCount = addedCount;
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

  public OfferLocation display(String display) {
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

  public OfferLocation appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

 /**
   * Get devicePower
   * @return devicePower
  **/
  @JsonProperty("devicePower")
  public Double getDevicePower() {
    return devicePower;
  }

  public void setDevicePower(Double devicePower) {
    this.devicePower = devicePower;
  }

  public OfferLocation devicePower(Double devicePower) {
    this.devicePower = devicePower;
    return this;
  }

 /**
   * Get powerLoss
   * @return powerLoss
  **/
  @JsonProperty("powerLoss")
  public Double getPowerLoss() {
    return powerLoss;
  }

  public void setPowerLoss(Double powerLoss) {
    this.powerLoss = powerLoss;
  }

  public OfferLocation powerLoss(Double powerLoss) {
    this.powerLoss = powerLoss;
    return this;
  }

 /**
   * Get udid
   * @return udid
  **/
  @JsonProperty("udid")
  public String getUdid() {
    return udid;
  }

  public void setUdid(String udid) {
    this.udid = udid;
  }

  public OfferLocation udid(String udid) {
    this.udid = udid;
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

  public OfferLocation billableId(Long billableId) {
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

  public OfferLocation subType(String subType) {
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

  public OfferLocation contentName(String contentName) {
    this.contentName = contentName;
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

  public OfferLocation contentAsset(Asset contentAsset) {
    this.contentAsset = contentAsset;
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

  public OfferLocation owner(Account owner) {
    this.owner = owner;
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

  public OfferLocation secondaryType(String secondaryType) {
    this.secondaryType = secondaryType;
    return this;
  }

 /**
   * Get categoryIds
   * @return categoryIds
  **/
  @JsonProperty("categoryIds")
  public List<Long> getCategoryIds() {
    return categoryIds;
  }

  public void setCategoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
  }

  public OfferLocation categoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  public OfferLocation addCategoryIdsItem(Long categoryIdsItem) {
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

 /**
   * Get filterIds
   * @return filterIds
  **/
  @JsonProperty("filterIds")
  public List<Long> getFilterIds() {
    return filterIds;
  }

  public void setFilterIds(List<Long> filterIds) {
    this.filterIds = filterIds;
  }

  public OfferLocation filterIds(List<Long> filterIds) {
    this.filterIds = filterIds;
    return this;
  }

  public OfferLocation addFilterIdsItem(Long filterIdsItem) {
    this.filterIds.add(filterIdsItem);
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
    OfferLocation offerLocation = (OfferLocation) o;
    return Objects.equals(this.id, offerLocation.id) &&
        Objects.equals(this.active, offerLocation.active) &&
        Objects.equals(this.valid, offerLocation.valid) &&
        Objects.equals(this.latitude, offerLocation.latitude) &&
        Objects.equals(this.longitude, offerLocation.longitude) &&
        Objects.equals(this.locationDescription, offerLocation.locationDescription) &&
        Objects.equals(this.offer, offerLocation.offer) &&
        Objects.equals(this.location, offerLocation.location) &&
        Objects.equals(this.distance, offerLocation.distance) &&
        Objects.equals(this.altitude, offerLocation.altitude) &&
        Objects.equals(this.customValue, offerLocation.customValue) &&
        Objects.equals(this.locationDetail, offerLocation.locationDetail) &&
        Objects.equals(this.audiences, offerLocation.audiences) &&
        Objects.equals(this.qrInviteCode, offerLocation.qrInviteCode) &&
        Objects.equals(this.notes, offerLocation.notes) &&
        Objects.equals(this.noteCount, offerLocation.noteCount) &&
        Objects.equals(this.searchIndexUpdated, offerLocation.searchIndexUpdated) &&
        Objects.equals(this.inSearchIndex, offerLocation.inSearchIndex) &&
        Objects.equals(this.favoriteCount, offerLocation.favoriteCount) &&
        Objects.equals(this.addedCount, offerLocation.addedCount) &&
        Objects.equals(this.display, offerLocation.display) &&
        Objects.equals(this.appKey, offerLocation.appKey) &&
        Objects.equals(this.devicePower, offerLocation.devicePower) &&
        Objects.equals(this.powerLoss, offerLocation.powerLoss) &&
        Objects.equals(this.udid, offerLocation.udid) &&
        Objects.equals(this.billableId, offerLocation.billableId) &&
        Objects.equals(this.subType, offerLocation.subType) &&
        Objects.equals(this.contentName, offerLocation.contentName) &&
        Objects.equals(this.contentAsset, offerLocation.contentAsset) &&
        Objects.equals(this.owner, offerLocation.owner) &&
        Objects.equals(this.secondaryType, offerLocation.secondaryType) &&
        Objects.equals(this.categoryIds, offerLocation.categoryIds) &&
        Objects.equals(this.filterIds, offerLocation.filterIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, latitude, longitude, locationDescription, offer, location, distance, altitude, customValue, locationDetail, audiences, qrInviteCode, notes, noteCount, searchIndexUpdated, inSearchIndex, favoriteCount, addedCount, display, appKey, devicePower, powerLoss, udid, billableId, subType, contentName, contentAsset, owner, secondaryType, categoryIds, filterIds);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

