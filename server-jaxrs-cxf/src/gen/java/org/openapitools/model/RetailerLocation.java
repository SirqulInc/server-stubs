package org.openapitools.model;

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

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RetailerLocation  {
  
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

  private List<@Valid Category> categories = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Filter> filters = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid OfferLocation> offerLocations = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private Asset logo;

  @ApiModelProperty(value = "")

  @Valid

  private Asset picture1;

  @ApiModelProperty(value = "")

  @Valid

  private Asset picture2;

  @ApiModelProperty(value = "")

  @Valid

  private Asset qrCode;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String locationId;

  @ApiModelProperty(value = "")

  private String code;

  @ApiModelProperty(value = "")

  @Valid

  private Retailer retailer;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Assignment> assignments = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private Assignment currentAssignment;

  @ApiModelProperty(value = "")

  @Valid

  private RetailerProfile profile;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Region> regions = new ArrayList<>();

  @ApiModelProperty(value = "")

  private String offerPrintKeyPrefix;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Account> administrators = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long sqootId;

  @ApiModelProperty(value = "")

  private Long yipitId;

  @ApiModelProperty(value = "")

  private String locationToken;

  @ApiModelProperty(value = "")

  @Valid

  private Building building;

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

  private Boolean hasRatings;

  @ApiModelProperty(value = "")

  private String googlePlaceId;

  @ApiModelProperty(value = "")

  private String yelpId;

  @ApiModelProperty(value = "")

  private String display;

  @ApiModelProperty(value = "")

  private String appKey;

  @ApiModelProperty(value = "")

  private String categoryTree;

  @ApiModelProperty(value = "")

  private String filterTree;

  @ApiModelProperty(value = "")

  private String addressDisplay;

  @ApiModelProperty(value = "")

  private String mapQuery;

  @ApiModelProperty(value = "")

  private String sortName;

  @ApiModelProperty(value = "")

  private String fullDisplay;

  @ApiModelProperty(value = "")

  private Boolean hasOffers;

  @ApiModelProperty(value = "")

  private Long billableId;

  @ApiModelProperty(value = "")

  private String subType;

  @ApiModelProperty(value = "")

  private String contentName;

  @ApiModelProperty(value = "")

  @Valid

  private Account owner;

  @ApiModelProperty(value = "")

  private String secondaryType;

  @ApiModelProperty(value = "")

  private String locationAddress;

  @ApiModelProperty(value = "")

  private List<Long> validOfferLocationIds = new ArrayList<>();
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

  public RetailerLocation id(Long id) {
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

  public RetailerLocation active(Boolean active) {
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

  public RetailerLocation valid(Boolean valid) {
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

  public RetailerLocation latitude(Double latitude) {
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

  public RetailerLocation longitude(Double longitude) {
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

  public RetailerLocation locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

 /**
   * Get categories
   * @return categories
  **/
  @JsonProperty("categories")
  public List<@Valid Category> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid Category> categories) {
    this.categories = categories;
  }

  public RetailerLocation categories(List<@Valid Category> categories) {
    this.categories = categories;
    return this;
  }

  public RetailerLocation addCategoriesItem(Category categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

 /**
   * Get filters
   * @return filters
  **/
  @JsonProperty("filters")
  public List<@Valid Filter> getFilters() {
    return filters;
  }

  public void setFilters(List<@Valid Filter> filters) {
    this.filters = filters;
  }

  public RetailerLocation filters(List<@Valid Filter> filters) {
    this.filters = filters;
    return this;
  }

  public RetailerLocation addFiltersItem(Filter filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

 /**
   * Get offerLocations
   * @return offerLocations
  **/
  @JsonProperty("offerLocations")
  public List<@Valid OfferLocation> getOfferLocations() {
    return offerLocations;
  }

  public void setOfferLocations(List<@Valid OfferLocation> offerLocations) {
    this.offerLocations = offerLocations;
  }

  public RetailerLocation offerLocations(List<@Valid OfferLocation> offerLocations) {
    this.offerLocations = offerLocations;
    return this;
  }

  public RetailerLocation addOfferLocationsItem(OfferLocation offerLocationsItem) {
    this.offerLocations.add(offerLocationsItem);
    return this;
  }

 /**
   * Get logo
   * @return logo
  **/
  @JsonProperty("logo")
  public Asset getLogo() {
    return logo;
  }

  public void setLogo(Asset logo) {
    this.logo = logo;
  }

  public RetailerLocation logo(Asset logo) {
    this.logo = logo;
    return this;
  }

 /**
   * Get picture1
   * @return picture1
  **/
  @JsonProperty("picture1")
  public Asset getPicture1() {
    return picture1;
  }

  public void setPicture1(Asset picture1) {
    this.picture1 = picture1;
  }

  public RetailerLocation picture1(Asset picture1) {
    this.picture1 = picture1;
    return this;
  }

 /**
   * Get picture2
   * @return picture2
  **/
  @JsonProperty("picture2")
  public Asset getPicture2() {
    return picture2;
  }

  public void setPicture2(Asset picture2) {
    this.picture2 = picture2;
  }

  public RetailerLocation picture2(Asset picture2) {
    this.picture2 = picture2;
    return this;
  }

 /**
   * Get qrCode
   * @return qrCode
  **/
  @JsonProperty("qrCode")
  public Asset getQrCode() {
    return qrCode;
  }

  public void setQrCode(Asset qrCode) {
    this.qrCode = qrCode;
  }

  public RetailerLocation qrCode(Asset qrCode) {
    this.qrCode = qrCode;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RetailerLocation name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get locationId
   * @return locationId
  **/
  @JsonProperty("locationId")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public RetailerLocation locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

 /**
   * Get code
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public RetailerLocation code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Get retailer
   * @return retailer
  **/
  @JsonProperty("retailer")
  public Retailer getRetailer() {
    return retailer;
  }

  public void setRetailer(Retailer retailer) {
    this.retailer = retailer;
  }

  public RetailerLocation retailer(Retailer retailer) {
    this.retailer = retailer;
    return this;
  }

 /**
   * Get assignments
   * @return assignments
  **/
  @JsonProperty("assignments")
  public List<@Valid Assignment> getAssignments() {
    return assignments;
  }

  public void setAssignments(List<@Valid Assignment> assignments) {
    this.assignments = assignments;
  }

  public RetailerLocation assignments(List<@Valid Assignment> assignments) {
    this.assignments = assignments;
    return this;
  }

  public RetailerLocation addAssignmentsItem(Assignment assignmentsItem) {
    this.assignments.add(assignmentsItem);
    return this;
  }

 /**
   * Get currentAssignment
   * @return currentAssignment
  **/
  @JsonProperty("currentAssignment")
  public Assignment getCurrentAssignment() {
    return currentAssignment;
  }

  public void setCurrentAssignment(Assignment currentAssignment) {
    this.currentAssignment = currentAssignment;
  }

  public RetailerLocation currentAssignment(Assignment currentAssignment) {
    this.currentAssignment = currentAssignment;
    return this;
  }

 /**
   * Get profile
   * @return profile
  **/
  @JsonProperty("profile")
  public RetailerProfile getProfile() {
    return profile;
  }

  public void setProfile(RetailerProfile profile) {
    this.profile = profile;
  }

  public RetailerLocation profile(RetailerProfile profile) {
    this.profile = profile;
    return this;
  }

 /**
   * Get regions
   * @return regions
  **/
  @JsonProperty("regions")
  public List<@Valid Region> getRegions() {
    return regions;
  }

  public void setRegions(List<@Valid Region> regions) {
    this.regions = regions;
  }

  public RetailerLocation regions(List<@Valid Region> regions) {
    this.regions = regions;
    return this;
  }

  public RetailerLocation addRegionsItem(Region regionsItem) {
    this.regions.add(regionsItem);
    return this;
  }

 /**
   * Get offerPrintKeyPrefix
   * @return offerPrintKeyPrefix
  **/
  @JsonProperty("offerPrintKeyPrefix")
  public String getOfferPrintKeyPrefix() {
    return offerPrintKeyPrefix;
  }

  public void setOfferPrintKeyPrefix(String offerPrintKeyPrefix) {
    this.offerPrintKeyPrefix = offerPrintKeyPrefix;
  }

  public RetailerLocation offerPrintKeyPrefix(String offerPrintKeyPrefix) {
    this.offerPrintKeyPrefix = offerPrintKeyPrefix;
    return this;
  }

 /**
   * Get administrators
   * @return administrators
  **/
  @JsonProperty("administrators")
  public List<@Valid Account> getAdministrators() {
    return administrators;
  }

  public void setAdministrators(List<@Valid Account> administrators) {
    this.administrators = administrators;
  }

  public RetailerLocation administrators(List<@Valid Account> administrators) {
    this.administrators = administrators;
    return this;
  }

  public RetailerLocation addAdministratorsItem(Account administratorsItem) {
    this.administrators.add(administratorsItem);
    return this;
  }

 /**
   * Get sqootId
   * @return sqootId
  **/
  @JsonProperty("sqootId")
  public Long getSqootId() {
    return sqootId;
  }

  public void setSqootId(Long sqootId) {
    this.sqootId = sqootId;
  }

  public RetailerLocation sqootId(Long sqootId) {
    this.sqootId = sqootId;
    return this;
  }

 /**
   * Get yipitId
   * @return yipitId
  **/
  @JsonProperty("yipitId")
  public Long getYipitId() {
    return yipitId;
  }

  public void setYipitId(Long yipitId) {
    this.yipitId = yipitId;
  }

  public RetailerLocation yipitId(Long yipitId) {
    this.yipitId = yipitId;
    return this;
  }

 /**
   * Get locationToken
   * @return locationToken
  **/
  @JsonProperty("locationToken")
  public String getLocationToken() {
    return locationToken;
  }

  public void setLocationToken(String locationToken) {
    this.locationToken = locationToken;
  }

  public RetailerLocation locationToken(String locationToken) {
    this.locationToken = locationToken;
    return this;
  }

 /**
   * Get building
   * @return building
  **/
  @JsonProperty("building")
  public Building getBuilding() {
    return building;
  }

  public void setBuilding(Building building) {
    this.building = building;
  }

  public RetailerLocation building(Building building) {
    this.building = building;
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

  public RetailerLocation notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public RetailerLocation addNotesItem(Note notesItem) {
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

  public RetailerLocation noteCount(Long noteCount) {
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

  public RetailerLocation searchIndexUpdated(Date searchIndexUpdated) {
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

  public RetailerLocation inSearchIndex(Boolean inSearchIndex) {
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

  public RetailerLocation favoriteCount(Long favoriteCount) {
    this.favoriteCount = favoriteCount;
    return this;
  }

 /**
   * Get hasRatings
   * @return hasRatings
  **/
  @JsonProperty("hasRatings")
  public Boolean getHasRatings() {
    return hasRatings;
  }

  public void setHasRatings(Boolean hasRatings) {
    this.hasRatings = hasRatings;
  }

  public RetailerLocation hasRatings(Boolean hasRatings) {
    this.hasRatings = hasRatings;
    return this;
  }

 /**
   * Get googlePlaceId
   * @return googlePlaceId
  **/
  @JsonProperty("googlePlaceId")
  public String getGooglePlaceId() {
    return googlePlaceId;
  }

  public void setGooglePlaceId(String googlePlaceId) {
    this.googlePlaceId = googlePlaceId;
  }

  public RetailerLocation googlePlaceId(String googlePlaceId) {
    this.googlePlaceId = googlePlaceId;
    return this;
  }

 /**
   * Get yelpId
   * @return yelpId
  **/
  @JsonProperty("yelpId")
  public String getYelpId() {
    return yelpId;
  }

  public void setYelpId(String yelpId) {
    this.yelpId = yelpId;
  }

  public RetailerLocation yelpId(String yelpId) {
    this.yelpId = yelpId;
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

  public RetailerLocation display(String display) {
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

  public RetailerLocation appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

 /**
   * Get categoryTree
   * @return categoryTree
  **/
  @JsonProperty("categoryTree")
  public String getCategoryTree() {
    return categoryTree;
  }

  public void setCategoryTree(String categoryTree) {
    this.categoryTree = categoryTree;
  }

  public RetailerLocation categoryTree(String categoryTree) {
    this.categoryTree = categoryTree;
    return this;
  }

 /**
   * Get filterTree
   * @return filterTree
  **/
  @JsonProperty("filterTree")
  public String getFilterTree() {
    return filterTree;
  }

  public void setFilterTree(String filterTree) {
    this.filterTree = filterTree;
  }

  public RetailerLocation filterTree(String filterTree) {
    this.filterTree = filterTree;
    return this;
  }

 /**
   * Get addressDisplay
   * @return addressDisplay
  **/
  @JsonProperty("addressDisplay")
  public String getAddressDisplay() {
    return addressDisplay;
  }

  public void setAddressDisplay(String addressDisplay) {
    this.addressDisplay = addressDisplay;
  }

  public RetailerLocation addressDisplay(String addressDisplay) {
    this.addressDisplay = addressDisplay;
    return this;
  }

 /**
   * Get mapQuery
   * @return mapQuery
  **/
  @JsonProperty("mapQuery")
  public String getMapQuery() {
    return mapQuery;
  }

  public void setMapQuery(String mapQuery) {
    this.mapQuery = mapQuery;
  }

  public RetailerLocation mapQuery(String mapQuery) {
    this.mapQuery = mapQuery;
    return this;
  }

 /**
   * Get sortName
   * @return sortName
  **/
  @JsonProperty("sortName")
  public String getSortName() {
    return sortName;
  }

  public void setSortName(String sortName) {
    this.sortName = sortName;
  }

  public RetailerLocation sortName(String sortName) {
    this.sortName = sortName;
    return this;
  }

 /**
   * Get fullDisplay
   * @return fullDisplay
  **/
  @JsonProperty("fullDisplay")
  public String getFullDisplay() {
    return fullDisplay;
  }

  public void setFullDisplay(String fullDisplay) {
    this.fullDisplay = fullDisplay;
  }

  public RetailerLocation fullDisplay(String fullDisplay) {
    this.fullDisplay = fullDisplay;
    return this;
  }

 /**
   * Get hasOffers
   * @return hasOffers
  **/
  @JsonProperty("hasOffers")
  public Boolean getHasOffers() {
    return hasOffers;
  }

  public void setHasOffers(Boolean hasOffers) {
    this.hasOffers = hasOffers;
  }

  public RetailerLocation hasOffers(Boolean hasOffers) {
    this.hasOffers = hasOffers;
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

  public RetailerLocation billableId(Long billableId) {
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

  public RetailerLocation subType(String subType) {
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

  public RetailerLocation contentName(String contentName) {
    this.contentName = contentName;
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

  public RetailerLocation owner(Account owner) {
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

  public RetailerLocation secondaryType(String secondaryType) {
    this.secondaryType = secondaryType;
    return this;
  }

 /**
   * Get locationAddress
   * @return locationAddress
  **/
  @JsonProperty("locationAddress")
  public String getLocationAddress() {
    return locationAddress;
  }

  public void setLocationAddress(String locationAddress) {
    this.locationAddress = locationAddress;
  }

  public RetailerLocation locationAddress(String locationAddress) {
    this.locationAddress = locationAddress;
    return this;
  }

 /**
   * Get validOfferLocationIds
   * @return validOfferLocationIds
  **/
  @JsonProperty("validOfferLocationIds")
  public List<Long> getValidOfferLocationIds() {
    return validOfferLocationIds;
  }

  public void setValidOfferLocationIds(List<Long> validOfferLocationIds) {
    this.validOfferLocationIds = validOfferLocationIds;
  }

  public RetailerLocation validOfferLocationIds(List<Long> validOfferLocationIds) {
    this.validOfferLocationIds = validOfferLocationIds;
    return this;
  }

  public RetailerLocation addValidOfferLocationIdsItem(Long validOfferLocationIdsItem) {
    this.validOfferLocationIds.add(validOfferLocationIdsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

