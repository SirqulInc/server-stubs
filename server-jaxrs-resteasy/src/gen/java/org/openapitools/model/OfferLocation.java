package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OfferLocation   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Double latitude;
  private Double longitude;
  private String locationDescription;
  private Offer offer;
  private RetailerLocation location;
  private Double distance;
  private Double altitude;
  private Double customValue;
  private String locationDetail;
  private List<@Valid Audience> audiences = new ArrayList<>();
  private Asset qrInviteCode;
  private List<@Valid Note> notes = new ArrayList<>();
  private Long noteCount;
  private Date searchIndexUpdated;
  private Boolean inSearchIndex;
  private Long favoriteCount;
  private Integer addedCount;
  private String display;
  private String appKey;
  private Double devicePower;
  private Double powerLoss;
  private String udid;
  private Long billableId;
  private String subType;
  private String contentName;
  private Asset contentAsset;
  private Account owner;
  private String secondaryType;
  private List<Long> categoryIds = new ArrayList<>();
  private List<Long> filterIds = new ArrayList<>();

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
  @JsonProperty("offer")
  @Valid
  public Offer getOffer() {
    return offer;
  }
  public void setOffer(Offer offer) {
    this.offer = offer;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("location")
  @Valid
  public RetailerLocation getLocation() {
    return location;
  }
  public void setLocation(RetailerLocation location) {
    this.location = location;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("distance")
  public Double getDistance() {
    return distance;
  }
  public void setDistance(Double distance) {
    this.distance = distance;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("altitude")
  public Double getAltitude() {
    return altitude;
  }
  public void setAltitude(Double altitude) {
    this.altitude = altitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customValue")
  public Double getCustomValue() {
    return customValue;
  }
  public void setCustomValue(Double customValue) {
    this.customValue = customValue;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationDetail")
  public String getLocationDetail() {
    return locationDetail;
  }
  public void setLocationDetail(String locationDetail) {
    this.locationDetail = locationDetail;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("audiences")
  @Valid
  public List<@Valid Audience> getAudiences() {
    return audiences;
  }
  public void setAudiences(List<@Valid Audience> audiences) {
    this.audiences = audiences;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("qrInviteCode")
  @Valid
  public Asset getQrInviteCode() {
    return qrInviteCode;
  }
  public void setQrInviteCode(Asset qrInviteCode) {
    this.qrInviteCode = qrInviteCode;
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
  @JsonProperty("searchIndexUpdated")
  public Date getSearchIndexUpdated() {
    return searchIndexUpdated;
  }
  public void setSearchIndexUpdated(Date searchIndexUpdated) {
    this.searchIndexUpdated = searchIndexUpdated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("inSearchIndex")
  public Boolean getInSearchIndex() {
    return inSearchIndex;
  }
  public void setInSearchIndex(Boolean inSearchIndex) {
    this.inSearchIndex = inSearchIndex;
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
  @JsonProperty("addedCount")
  public Integer getAddedCount() {
    return addedCount;
  }
  public void setAddedCount(Integer addedCount) {
    this.addedCount = addedCount;
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
  @JsonProperty("devicePower")
  public Double getDevicePower() {
    return devicePower;
  }
  public void setDevicePower(Double devicePower) {
    this.devicePower = devicePower;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("powerLoss")
  public Double getPowerLoss() {
    return powerLoss;
  }
  public void setPowerLoss(Double powerLoss) {
    this.powerLoss = powerLoss;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("udid")
  public String getUdid() {
    return udid;
  }
  public void setUdid(String udid) {
    this.udid = udid;
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
  @JsonProperty("categoryIds")
  public List<Long> getCategoryIds() {
    return categoryIds;
  }
  public void setCategoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

