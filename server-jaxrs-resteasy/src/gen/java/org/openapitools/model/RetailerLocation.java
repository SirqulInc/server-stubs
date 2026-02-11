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
import org.openapitools.model.Assignment;
import org.openapitools.model.Building;
import org.openapitools.model.Category;
import org.openapitools.model.Filter;
import org.openapitools.model.Note;
import org.openapitools.model.OfferLocation;
import org.openapitools.model.Region;
import org.openapitools.model.Retailer;
import org.openapitools.model.RetailerProfile;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RetailerLocation   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Double latitude;
  private Double longitude;
  private String locationDescription;
  private List<@Valid Category> categories = new ArrayList<>();
  private List<@Valid Filter> filters = new ArrayList<>();
  private List<@Valid OfferLocation> offerLocations = new ArrayList<>();
  private Asset logo;
  private Asset picture1;
  private Asset picture2;
  private Asset qrCode;
  private String name;
  private String locationId;
  private String code;
  private Retailer retailer;
  private List<@Valid Assignment> assignments = new ArrayList<>();
  private Assignment currentAssignment;
  private RetailerProfile profile;
  private List<@Valid Region> regions = new ArrayList<>();
  private String offerPrintKeyPrefix;
  private List<@Valid Account> administrators = new ArrayList<>();
  private Long sqootId;
  private Long yipitId;
  private String locationToken;
  private Building building;
  private List<@Valid Note> notes = new ArrayList<>();
  private Long noteCount;
  private Date searchIndexUpdated;
  private Boolean inSearchIndex;
  private Long favoriteCount;
  private Boolean hasRatings;
  private String googlePlaceId;
  private String yelpId;
  private String display;
  private String appKey;
  private String categoryTree;
  private String filterTree;
  private String addressDisplay;
  private String mapQuery;
  private String sortName;
  private String fullDisplay;
  private Boolean hasOffers;
  private Long billableId;
  private String subType;
  private String contentName;
  private Account owner;
  private String secondaryType;
  private String locationAddress;
  private List<Long> validOfferLocationIds = new ArrayList<>();

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
  @JsonProperty("categories")
  @Valid
  public List<@Valid Category> getCategories() {
    return categories;
  }
  public void setCategories(List<@Valid Category> categories) {
    this.categories = categories;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("filters")
  @Valid
  public List<@Valid Filter> getFilters() {
    return filters;
  }
  public void setFilters(List<@Valid Filter> filters) {
    this.filters = filters;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offerLocations")
  @Valid
  public List<@Valid OfferLocation> getOfferLocations() {
    return offerLocations;
  }
  public void setOfferLocations(List<@Valid OfferLocation> offerLocations) {
    this.offerLocations = offerLocations;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("logo")
  @Valid
  public Asset getLogo() {
    return logo;
  }
  public void setLogo(Asset logo) {
    this.logo = logo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("picture1")
  @Valid
  public Asset getPicture1() {
    return picture1;
  }
  public void setPicture1(Asset picture1) {
    this.picture1 = picture1;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("picture2")
  @Valid
  public Asset getPicture2() {
    return picture2;
  }
  public void setPicture2(Asset picture2) {
    this.picture2 = picture2;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("qrCode")
  @Valid
  public Asset getQrCode() {
    return qrCode;
  }
  public void setQrCode(Asset qrCode) {
    this.qrCode = qrCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationId")
  public String getLocationId() {
    return locationId;
  }
  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("retailer")
  @Valid
  public Retailer getRetailer() {
    return retailer;
  }
  public void setRetailer(Retailer retailer) {
    this.retailer = retailer;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("assignments")
  @Valid
  public List<@Valid Assignment> getAssignments() {
    return assignments;
  }
  public void setAssignments(List<@Valid Assignment> assignments) {
    this.assignments = assignments;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currentAssignment")
  @Valid
  public Assignment getCurrentAssignment() {
    return currentAssignment;
  }
  public void setCurrentAssignment(Assignment currentAssignment) {
    this.currentAssignment = currentAssignment;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("profile")
  @Valid
  public RetailerProfile getProfile() {
    return profile;
  }
  public void setProfile(RetailerProfile profile) {
    this.profile = profile;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("regions")
  @Valid
  public List<@Valid Region> getRegions() {
    return regions;
  }
  public void setRegions(List<@Valid Region> regions) {
    this.regions = regions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offerPrintKeyPrefix")
  public String getOfferPrintKeyPrefix() {
    return offerPrintKeyPrefix;
  }
  public void setOfferPrintKeyPrefix(String offerPrintKeyPrefix) {
    this.offerPrintKeyPrefix = offerPrintKeyPrefix;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("administrators")
  @Valid
  public List<@Valid Account> getAdministrators() {
    return administrators;
  }
  public void setAdministrators(List<@Valid Account> administrators) {
    this.administrators = administrators;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sqootId")
  public Long getSqootId() {
    return sqootId;
  }
  public void setSqootId(Long sqootId) {
    this.sqootId = sqootId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("yipitId")
  public Long getYipitId() {
    return yipitId;
  }
  public void setYipitId(Long yipitId) {
    this.yipitId = yipitId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationToken")
  public String getLocationToken() {
    return locationToken;
  }
  public void setLocationToken(String locationToken) {
    this.locationToken = locationToken;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("building")
  @Valid
  public Building getBuilding() {
    return building;
  }
  public void setBuilding(Building building) {
    this.building = building;
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
  @JsonProperty("hasRatings")
  public Boolean getHasRatings() {
    return hasRatings;
  }
  public void setHasRatings(Boolean hasRatings) {
    this.hasRatings = hasRatings;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("googlePlaceId")
  public String getGooglePlaceId() {
    return googlePlaceId;
  }
  public void setGooglePlaceId(String googlePlaceId) {
    this.googlePlaceId = googlePlaceId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("yelpId")
  public String getYelpId() {
    return yelpId;
  }
  public void setYelpId(String yelpId) {
    this.yelpId = yelpId;
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
  @JsonProperty("categoryTree")
  public String getCategoryTree() {
    return categoryTree;
  }
  public void setCategoryTree(String categoryTree) {
    this.categoryTree = categoryTree;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("filterTree")
  public String getFilterTree() {
    return filterTree;
  }
  public void setFilterTree(String filterTree) {
    this.filterTree = filterTree;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("addressDisplay")
  public String getAddressDisplay() {
    return addressDisplay;
  }
  public void setAddressDisplay(String addressDisplay) {
    this.addressDisplay = addressDisplay;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mapQuery")
  public String getMapQuery() {
    return mapQuery;
  }
  public void setMapQuery(String mapQuery) {
    this.mapQuery = mapQuery;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sortName")
  public String getSortName() {
    return sortName;
  }
  public void setSortName(String sortName) {
    this.sortName = sortName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fullDisplay")
  public String getFullDisplay() {
    return fullDisplay;
  }
  public void setFullDisplay(String fullDisplay) {
    this.fullDisplay = fullDisplay;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hasOffers")
  public Boolean getHasOffers() {
    return hasOffers;
  }
  public void setHasOffers(Boolean hasOffers) {
    this.hasOffers = hasOffers;
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
  @JsonProperty("locationAddress")
  public String getLocationAddress() {
    return locationAddress;
  }
  public void setLocationAddress(String locationAddress) {
    this.locationAddress = locationAddress;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("validOfferLocationIds")
  public List<Long> getValidOfferLocationIds() {
    return validOfferLocationIds;
  }
  public void setValidOfferLocationIds(List<Long> validOfferLocationIds) {
    this.validOfferLocationIds = validOfferLocationIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetailerLocation retailerLocation = (RetailerLocation) o;
    return Objects.equals(this.id, retailerLocation.id) &&
        Objects.equals(this.active, retailerLocation.active) &&
        Objects.equals(this.valid, retailerLocation.valid) &&
        Objects.equals(this.latitude, retailerLocation.latitude) &&
        Objects.equals(this.longitude, retailerLocation.longitude) &&
        Objects.equals(this.locationDescription, retailerLocation.locationDescription) &&
        Objects.equals(this.categories, retailerLocation.categories) &&
        Objects.equals(this.filters, retailerLocation.filters) &&
        Objects.equals(this.offerLocations, retailerLocation.offerLocations) &&
        Objects.equals(this.logo, retailerLocation.logo) &&
        Objects.equals(this.picture1, retailerLocation.picture1) &&
        Objects.equals(this.picture2, retailerLocation.picture2) &&
        Objects.equals(this.qrCode, retailerLocation.qrCode) &&
        Objects.equals(this.name, retailerLocation.name) &&
        Objects.equals(this.locationId, retailerLocation.locationId) &&
        Objects.equals(this.code, retailerLocation.code) &&
        Objects.equals(this.retailer, retailerLocation.retailer) &&
        Objects.equals(this.assignments, retailerLocation.assignments) &&
        Objects.equals(this.currentAssignment, retailerLocation.currentAssignment) &&
        Objects.equals(this.profile, retailerLocation.profile) &&
        Objects.equals(this.regions, retailerLocation.regions) &&
        Objects.equals(this.offerPrintKeyPrefix, retailerLocation.offerPrintKeyPrefix) &&
        Objects.equals(this.administrators, retailerLocation.administrators) &&
        Objects.equals(this.sqootId, retailerLocation.sqootId) &&
        Objects.equals(this.yipitId, retailerLocation.yipitId) &&
        Objects.equals(this.locationToken, retailerLocation.locationToken) &&
        Objects.equals(this.building, retailerLocation.building) &&
        Objects.equals(this.notes, retailerLocation.notes) &&
        Objects.equals(this.noteCount, retailerLocation.noteCount) &&
        Objects.equals(this.searchIndexUpdated, retailerLocation.searchIndexUpdated) &&
        Objects.equals(this.inSearchIndex, retailerLocation.inSearchIndex) &&
        Objects.equals(this.favoriteCount, retailerLocation.favoriteCount) &&
        Objects.equals(this.hasRatings, retailerLocation.hasRatings) &&
        Objects.equals(this.googlePlaceId, retailerLocation.googlePlaceId) &&
        Objects.equals(this.yelpId, retailerLocation.yelpId) &&
        Objects.equals(this.display, retailerLocation.display) &&
        Objects.equals(this.appKey, retailerLocation.appKey) &&
        Objects.equals(this.categoryTree, retailerLocation.categoryTree) &&
        Objects.equals(this.filterTree, retailerLocation.filterTree) &&
        Objects.equals(this.addressDisplay, retailerLocation.addressDisplay) &&
        Objects.equals(this.mapQuery, retailerLocation.mapQuery) &&
        Objects.equals(this.sortName, retailerLocation.sortName) &&
        Objects.equals(this.fullDisplay, retailerLocation.fullDisplay) &&
        Objects.equals(this.hasOffers, retailerLocation.hasOffers) &&
        Objects.equals(this.billableId, retailerLocation.billableId) &&
        Objects.equals(this.subType, retailerLocation.subType) &&
        Objects.equals(this.contentName, retailerLocation.contentName) &&
        Objects.equals(this.owner, retailerLocation.owner) &&
        Objects.equals(this.secondaryType, retailerLocation.secondaryType) &&
        Objects.equals(this.locationAddress, retailerLocation.locationAddress) &&
        Objects.equals(this.validOfferLocationIds, retailerLocation.validOfferLocationIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, latitude, longitude, locationDescription, categories, filters, offerLocations, logo, picture1, picture2, qrCode, name, locationId, code, retailer, assignments, currentAssignment, profile, regions, offerPrintKeyPrefix, administrators, sqootId, yipitId, locationToken, building, notes, noteCount, searchIndexUpdated, inSearchIndex, favoriteCount, hasRatings, googlePlaceId, yelpId, display, appKey, categoryTree, filterTree, addressDisplay, mapQuery, sortName, fullDisplay, hasOffers, billableId, subType, contentName, owner, secondaryType, locationAddress, validOfferLocationIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailerLocation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    offerLocations: ").append(toIndentedString(offerLocations)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    picture1: ").append(toIndentedString(picture1)).append("\n");
    sb.append("    picture2: ").append(toIndentedString(picture2)).append("\n");
    sb.append("    qrCode: ").append(toIndentedString(qrCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    retailer: ").append(toIndentedString(retailer)).append("\n");
    sb.append("    assignments: ").append(toIndentedString(assignments)).append("\n");
    sb.append("    currentAssignment: ").append(toIndentedString(currentAssignment)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    offerPrintKeyPrefix: ").append(toIndentedString(offerPrintKeyPrefix)).append("\n");
    sb.append("    administrators: ").append(toIndentedString(administrators)).append("\n");
    sb.append("    sqootId: ").append(toIndentedString(sqootId)).append("\n");
    sb.append("    yipitId: ").append(toIndentedString(yipitId)).append("\n");
    sb.append("    locationToken: ").append(toIndentedString(locationToken)).append("\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    noteCount: ").append(toIndentedString(noteCount)).append("\n");
    sb.append("    searchIndexUpdated: ").append(toIndentedString(searchIndexUpdated)).append("\n");
    sb.append("    inSearchIndex: ").append(toIndentedString(inSearchIndex)).append("\n");
    sb.append("    favoriteCount: ").append(toIndentedString(favoriteCount)).append("\n");
    sb.append("    hasRatings: ").append(toIndentedString(hasRatings)).append("\n");
    sb.append("    googlePlaceId: ").append(toIndentedString(googlePlaceId)).append("\n");
    sb.append("    yelpId: ").append(toIndentedString(yelpId)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    categoryTree: ").append(toIndentedString(categoryTree)).append("\n");
    sb.append("    filterTree: ").append(toIndentedString(filterTree)).append("\n");
    sb.append("    addressDisplay: ").append(toIndentedString(addressDisplay)).append("\n");
    sb.append("    mapQuery: ").append(toIndentedString(mapQuery)).append("\n");
    sb.append("    sortName: ").append(toIndentedString(sortName)).append("\n");
    sb.append("    fullDisplay: ").append(toIndentedString(fullDisplay)).append("\n");
    sb.append("    hasOffers: ").append(toIndentedString(hasOffers)).append("\n");
    sb.append("    billableId: ").append(toIndentedString(billableId)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    secondaryType: ").append(toIndentedString(secondaryType)).append("\n");
    sb.append("    locationAddress: ").append(toIndentedString(locationAddress)).append("\n");
    sb.append("    validOfferLocationIds: ").append(toIndentedString(validOfferLocationIds)).append("\n");
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

