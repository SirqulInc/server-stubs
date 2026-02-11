package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Asset;
import org.openapitools.model.Audience;
import org.openapitools.model.Note;
import org.openapitools.model.Offer;
import org.openapitools.model.RetailerLocation;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OfferLocation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OfferLocation {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable String locationDescription;

  private @Nullable Offer offer;

  private @Nullable RetailerLocation location;

  private @Nullable Double distance;

  private @Nullable Double altitude;

  private @Nullable Double customValue;

  private @Nullable String locationDetail;

  @Valid
  private List<@Valid Audience> audiences = new ArrayList<>();

  private @Nullable Asset qrInviteCode;

  @Valid
  private List<@Valid Note> notes = new ArrayList<>();

  private @Nullable Long noteCount;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime searchIndexUpdated;

  private @Nullable Boolean inSearchIndex;

  private @Nullable Long favoriteCount;

  private @Nullable Integer addedCount;

  private @Nullable String display;

  private @Nullable String appKey;

  private @Nullable Double devicePower;

  private @Nullable Double powerLoss;

  private @Nullable String udid;

  private @Nullable Long billableId;

  private @Nullable String subType;

  private @Nullable String contentName;

  private @Nullable Asset contentAsset;

  private @Nullable Account owner;

  private @Nullable String secondaryType;

  @Valid
  private List<Long> categoryIds = new ArrayList<>();

  @Valid
  private List<Long> filterIds = new ArrayList<>();

  public OfferLocation id(@Nullable Long id) {
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

  public OfferLocation active(@Nullable Boolean active) {
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

  public OfferLocation valid(@Nullable Boolean valid) {
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

  public OfferLocation latitude(@Nullable Double latitude) {
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

  public OfferLocation longitude(@Nullable Double longitude) {
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

  public OfferLocation locationDescription(@Nullable String locationDescription) {
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

  public OfferLocation offer(@Nullable Offer offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Get offer
   * @return offer
   */
  @Valid 
  @Schema(name = "offer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offer")
  public @Nullable Offer getOffer() {
    return offer;
  }

  public void setOffer(@Nullable Offer offer) {
    this.offer = offer;
  }

  public OfferLocation location(@Nullable RetailerLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @Valid 
  @Schema(name = "location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public @Nullable RetailerLocation getLocation() {
    return location;
  }

  public void setLocation(@Nullable RetailerLocation location) {
    this.location = location;
  }

  public OfferLocation distance(@Nullable Double distance) {
    this.distance = distance;
    return this;
  }

  /**
   * Get distance
   * @return distance
   */
  
  @Schema(name = "distance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("distance")
  public @Nullable Double getDistance() {
    return distance;
  }

  public void setDistance(@Nullable Double distance) {
    this.distance = distance;
  }

  public OfferLocation altitude(@Nullable Double altitude) {
    this.altitude = altitude;
    return this;
  }

  /**
   * Get altitude
   * @return altitude
   */
  
  @Schema(name = "altitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("altitude")
  public @Nullable Double getAltitude() {
    return altitude;
  }

  public void setAltitude(@Nullable Double altitude) {
    this.altitude = altitude;
  }

  public OfferLocation customValue(@Nullable Double customValue) {
    this.customValue = customValue;
    return this;
  }

  /**
   * Get customValue
   * @return customValue
   */
  
  @Schema(name = "customValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customValue")
  public @Nullable Double getCustomValue() {
    return customValue;
  }

  public void setCustomValue(@Nullable Double customValue) {
    this.customValue = customValue;
  }

  public OfferLocation locationDetail(@Nullable String locationDetail) {
    this.locationDetail = locationDetail;
    return this;
  }

  /**
   * Get locationDetail
   * @return locationDetail
   */
  
  @Schema(name = "locationDetail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationDetail")
  public @Nullable String getLocationDetail() {
    return locationDetail;
  }

  public void setLocationDetail(@Nullable String locationDetail) {
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
   */
  @Valid 
  @Schema(name = "audiences", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("audiences")
  public List<@Valid Audience> getAudiences() {
    return audiences;
  }

  public void setAudiences(List<@Valid Audience> audiences) {
    this.audiences = audiences;
  }

  public OfferLocation qrInviteCode(@Nullable Asset qrInviteCode) {
    this.qrInviteCode = qrInviteCode;
    return this;
  }

  /**
   * Get qrInviteCode
   * @return qrInviteCode
   */
  @Valid 
  @Schema(name = "qrInviteCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("qrInviteCode")
  public @Nullable Asset getQrInviteCode() {
    return qrInviteCode;
  }

  public void setQrInviteCode(@Nullable Asset qrInviteCode) {
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

  public OfferLocation noteCount(@Nullable Long noteCount) {
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

  public OfferLocation searchIndexUpdated(@Nullable OffsetDateTime searchIndexUpdated) {
    this.searchIndexUpdated = searchIndexUpdated;
    return this;
  }

  /**
   * Get searchIndexUpdated
   * @return searchIndexUpdated
   */
  @Valid 
  @Schema(name = "searchIndexUpdated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("searchIndexUpdated")
  public @Nullable OffsetDateTime getSearchIndexUpdated() {
    return searchIndexUpdated;
  }

  public void setSearchIndexUpdated(@Nullable OffsetDateTime searchIndexUpdated) {
    this.searchIndexUpdated = searchIndexUpdated;
  }

  public OfferLocation inSearchIndex(@Nullable Boolean inSearchIndex) {
    this.inSearchIndex = inSearchIndex;
    return this;
  }

  /**
   * Get inSearchIndex
   * @return inSearchIndex
   */
  
  @Schema(name = "inSearchIndex", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inSearchIndex")
  public @Nullable Boolean getInSearchIndex() {
    return inSearchIndex;
  }

  public void setInSearchIndex(@Nullable Boolean inSearchIndex) {
    this.inSearchIndex = inSearchIndex;
  }

  public OfferLocation favoriteCount(@Nullable Long favoriteCount) {
    this.favoriteCount = favoriteCount;
    return this;
  }

  /**
   * Get favoriteCount
   * @return favoriteCount
   */
  
  @Schema(name = "favoriteCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("favoriteCount")
  public @Nullable Long getFavoriteCount() {
    return favoriteCount;
  }

  public void setFavoriteCount(@Nullable Long favoriteCount) {
    this.favoriteCount = favoriteCount;
  }

  public OfferLocation addedCount(@Nullable Integer addedCount) {
    this.addedCount = addedCount;
    return this;
  }

  /**
   * Get addedCount
   * @return addedCount
   */
  
  @Schema(name = "addedCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addedCount")
  public @Nullable Integer getAddedCount() {
    return addedCount;
  }

  public void setAddedCount(@Nullable Integer addedCount) {
    this.addedCount = addedCount;
  }

  public OfferLocation display(@Nullable String display) {
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

  public OfferLocation appKey(@Nullable String appKey) {
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

  public OfferLocation devicePower(@Nullable Double devicePower) {
    this.devicePower = devicePower;
    return this;
  }

  /**
   * Get devicePower
   * @return devicePower
   */
  
  @Schema(name = "devicePower", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("devicePower")
  public @Nullable Double getDevicePower() {
    return devicePower;
  }

  public void setDevicePower(@Nullable Double devicePower) {
    this.devicePower = devicePower;
  }

  public OfferLocation powerLoss(@Nullable Double powerLoss) {
    this.powerLoss = powerLoss;
    return this;
  }

  /**
   * Get powerLoss
   * @return powerLoss
   */
  
  @Schema(name = "powerLoss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("powerLoss")
  public @Nullable Double getPowerLoss() {
    return powerLoss;
  }

  public void setPowerLoss(@Nullable Double powerLoss) {
    this.powerLoss = powerLoss;
  }

  public OfferLocation udid(@Nullable String udid) {
    this.udid = udid;
    return this;
  }

  /**
   * Get udid
   * @return udid
   */
  
  @Schema(name = "udid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("udid")
  public @Nullable String getUdid() {
    return udid;
  }

  public void setUdid(@Nullable String udid) {
    this.udid = udid;
  }

  public OfferLocation billableId(@Nullable Long billableId) {
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

  public OfferLocation subType(@Nullable String subType) {
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

  public OfferLocation contentName(@Nullable String contentName) {
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

  public OfferLocation contentAsset(@Nullable Asset contentAsset) {
    this.contentAsset = contentAsset;
    return this;
  }

  /**
   * Get contentAsset
   * @return contentAsset
   */
  @Valid 
  @Schema(name = "contentAsset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentAsset")
  public @Nullable Asset getContentAsset() {
    return contentAsset;
  }

  public void setContentAsset(@Nullable Asset contentAsset) {
    this.contentAsset = contentAsset;
  }

  public OfferLocation owner(@Nullable Account owner) {
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

  public OfferLocation secondaryType(@Nullable String secondaryType) {
    this.secondaryType = secondaryType;
    return this;
  }

  /**
   * Get secondaryType
   * @return secondaryType
   */
  
  @Schema(name = "secondaryType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondaryType")
  public @Nullable String getSecondaryType() {
    return secondaryType;
  }

  public void setSecondaryType(@Nullable String secondaryType) {
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
   */
  
  @Schema(name = "categoryIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryIds")
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
   */
  
  @Schema(name = "filterIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filterIds")
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

