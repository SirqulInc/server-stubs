package apimodels;

import apimodels.Account;
import apimodels.Asset;
import apimodels.Assignment;
import apimodels.Building;
import apimodels.Category;
import apimodels.Filter;
import apimodels.Note;
import apimodels.OfferLocation;
import apimodels.Region;
import apimodels.Retailer;
import apimodels.RetailerProfile;
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
 * RetailerLocation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RetailerLocation   {
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

  @JsonProperty("categories")
  @Valid

  private List<@Valid Category> categories = null;

  @JsonProperty("filters")
  @Valid

  private List<@Valid Filter> filters = null;

  @JsonProperty("offerLocations")
  @Valid

  private List<@Valid OfferLocation> offerLocations = null;

  @JsonProperty("logo")
  @Valid

  private Asset logo;

  @JsonProperty("picture1")
  @Valid

  private Asset picture1;

  @JsonProperty("picture2")
  @Valid

  private Asset picture2;

  @JsonProperty("qrCode")
  @Valid

  private Asset qrCode;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("locationId")
  
  private String locationId;

  @JsonProperty("code")
  
  private String code;

  @JsonProperty("retailer")
  @Valid

  private Retailer retailer;

  @JsonProperty("assignments")
  @Valid

  private List<@Valid Assignment> assignments = null;

  @JsonProperty("currentAssignment")
  @Valid

  private Assignment currentAssignment;

  @JsonProperty("profile")
  @Valid

  private RetailerProfile profile;

  @JsonProperty("regions")
  @Valid

  private List<@Valid Region> regions = null;

  @JsonProperty("offerPrintKeyPrefix")
  
  private String offerPrintKeyPrefix;

  @JsonProperty("administrators")
  @Valid

  private List<@Valid Account> administrators = null;

  @JsonProperty("sqootId")
  
  private Long sqootId;

  @JsonProperty("yipitId")
  
  private Long yipitId;

  @JsonProperty("locationToken")
  
  private String locationToken;

  @JsonProperty("building")
  @Valid

  private Building building;

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

  @JsonProperty("hasRatings")
  
  private Boolean hasRatings;

  @JsonProperty("googlePlaceId")
  
  private String googlePlaceId;

  @JsonProperty("yelpId")
  
  private String yelpId;

  @JsonProperty("display")
  
  private String display;

  @JsonProperty("appKey")
  
  private String appKey;

  @JsonProperty("categoryTree")
  
  private String categoryTree;

  @JsonProperty("filterTree")
  
  private String filterTree;

  @JsonProperty("addressDisplay")
  
  private String addressDisplay;

  @JsonProperty("mapQuery")
  
  private String mapQuery;

  @JsonProperty("sortName")
  
  private String sortName;

  @JsonProperty("fullDisplay")
  
  private String fullDisplay;

  @JsonProperty("hasOffers")
  
  private Boolean hasOffers;

  @JsonProperty("billableId")
  
  private Long billableId;

  @JsonProperty("subType")
  
  private String subType;

  @JsonProperty("contentName")
  
  private String contentName;

  @JsonProperty("owner")
  @Valid

  private Account owner;

  @JsonProperty("secondaryType")
  
  private String secondaryType;

  @JsonProperty("locationAddress")
  
  private String locationAddress;

  @JsonProperty("validOfferLocationIds")
  
  private List<Long> validOfferLocationIds = null;

  public RetailerLocation id(Long id) {
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

  public RetailerLocation active(Boolean active) {
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

  public RetailerLocation valid(Boolean valid) {
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

  public RetailerLocation latitude(Double latitude) {
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

  public RetailerLocation longitude(Double longitude) {
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

  public RetailerLocation locationDescription(String locationDescription) {
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

  public RetailerLocation categories(List<@Valid Category> categories) {
    this.categories = categories;
    return this;
  }

  public RetailerLocation addCategoriesItem(Category categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  public List<@Valid Category> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid Category> categories) {
    this.categories = categories;
  }

  public RetailerLocation filters(List<@Valid Filter> filters) {
    this.filters = filters;
    return this;
  }

  public RetailerLocation addFiltersItem(Filter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  public List<@Valid Filter> getFilters() {
    return filters;
  }

  public void setFilters(List<@Valid Filter> filters) {
    this.filters = filters;
  }

  public RetailerLocation offerLocations(List<@Valid OfferLocation> offerLocations) {
    this.offerLocations = offerLocations;
    return this;
  }

  public RetailerLocation addOfferLocationsItem(OfferLocation offerLocationsItem) {
    if (this.offerLocations == null) {
      this.offerLocations = new ArrayList<>();
    }
    this.offerLocations.add(offerLocationsItem);
    return this;
  }

   /**
   * Get offerLocations
   * @return offerLocations
  **/
  public List<@Valid OfferLocation> getOfferLocations() {
    return offerLocations;
  }

  public void setOfferLocations(List<@Valid OfferLocation> offerLocations) {
    this.offerLocations = offerLocations;
  }

  public RetailerLocation logo(Asset logo) {
    this.logo = logo;
    return this;
  }

   /**
   * Get logo
   * @return logo
  **/
  public Asset getLogo() {
    return logo;
  }

  public void setLogo(Asset logo) {
    this.logo = logo;
  }

  public RetailerLocation picture1(Asset picture1) {
    this.picture1 = picture1;
    return this;
  }

   /**
   * Get picture1
   * @return picture1
  **/
  public Asset getPicture1() {
    return picture1;
  }

  public void setPicture1(Asset picture1) {
    this.picture1 = picture1;
  }

  public RetailerLocation picture2(Asset picture2) {
    this.picture2 = picture2;
    return this;
  }

   /**
   * Get picture2
   * @return picture2
  **/
  public Asset getPicture2() {
    return picture2;
  }

  public void setPicture2(Asset picture2) {
    this.picture2 = picture2;
  }

  public RetailerLocation qrCode(Asset qrCode) {
    this.qrCode = qrCode;
    return this;
  }

   /**
   * Get qrCode
   * @return qrCode
  **/
  public Asset getQrCode() {
    return qrCode;
  }

  public void setQrCode(Asset qrCode) {
    this.qrCode = qrCode;
  }

  public RetailerLocation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RetailerLocation locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * Get locationId
   * @return locationId
  **/
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public RetailerLocation code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public RetailerLocation retailer(Retailer retailer) {
    this.retailer = retailer;
    return this;
  }

   /**
   * Get retailer
   * @return retailer
  **/
  public Retailer getRetailer() {
    return retailer;
  }

  public void setRetailer(Retailer retailer) {
    this.retailer = retailer;
  }

  public RetailerLocation assignments(List<@Valid Assignment> assignments) {
    this.assignments = assignments;
    return this;
  }

  public RetailerLocation addAssignmentsItem(Assignment assignmentsItem) {
    if (this.assignments == null) {
      this.assignments = new ArrayList<>();
    }
    this.assignments.add(assignmentsItem);
    return this;
  }

   /**
   * Get assignments
   * @return assignments
  **/
  public List<@Valid Assignment> getAssignments() {
    return assignments;
  }

  public void setAssignments(List<@Valid Assignment> assignments) {
    this.assignments = assignments;
  }

  public RetailerLocation currentAssignment(Assignment currentAssignment) {
    this.currentAssignment = currentAssignment;
    return this;
  }

   /**
   * Get currentAssignment
   * @return currentAssignment
  **/
  public Assignment getCurrentAssignment() {
    return currentAssignment;
  }

  public void setCurrentAssignment(Assignment currentAssignment) {
    this.currentAssignment = currentAssignment;
  }

  public RetailerLocation profile(RetailerProfile profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  public RetailerProfile getProfile() {
    return profile;
  }

  public void setProfile(RetailerProfile profile) {
    this.profile = profile;
  }

  public RetailerLocation regions(List<@Valid Region> regions) {
    this.regions = regions;
    return this;
  }

  public RetailerLocation addRegionsItem(Region regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<>();
    }
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * Get regions
   * @return regions
  **/
  public List<@Valid Region> getRegions() {
    return regions;
  }

  public void setRegions(List<@Valid Region> regions) {
    this.regions = regions;
  }

  public RetailerLocation offerPrintKeyPrefix(String offerPrintKeyPrefix) {
    this.offerPrintKeyPrefix = offerPrintKeyPrefix;
    return this;
  }

   /**
   * Get offerPrintKeyPrefix
   * @return offerPrintKeyPrefix
  **/
  public String getOfferPrintKeyPrefix() {
    return offerPrintKeyPrefix;
  }

  public void setOfferPrintKeyPrefix(String offerPrintKeyPrefix) {
    this.offerPrintKeyPrefix = offerPrintKeyPrefix;
  }

  public RetailerLocation administrators(List<@Valid Account> administrators) {
    this.administrators = administrators;
    return this;
  }

  public RetailerLocation addAdministratorsItem(Account administratorsItem) {
    if (this.administrators == null) {
      this.administrators = new ArrayList<>();
    }
    this.administrators.add(administratorsItem);
    return this;
  }

   /**
   * Get administrators
   * @return administrators
  **/
  public List<@Valid Account> getAdministrators() {
    return administrators;
  }

  public void setAdministrators(List<@Valid Account> administrators) {
    this.administrators = administrators;
  }

  public RetailerLocation sqootId(Long sqootId) {
    this.sqootId = sqootId;
    return this;
  }

   /**
   * Get sqootId
   * @return sqootId
  **/
  public Long getSqootId() {
    return sqootId;
  }

  public void setSqootId(Long sqootId) {
    this.sqootId = sqootId;
  }

  public RetailerLocation yipitId(Long yipitId) {
    this.yipitId = yipitId;
    return this;
  }

   /**
   * Get yipitId
   * @return yipitId
  **/
  public Long getYipitId() {
    return yipitId;
  }

  public void setYipitId(Long yipitId) {
    this.yipitId = yipitId;
  }

  public RetailerLocation locationToken(String locationToken) {
    this.locationToken = locationToken;
    return this;
  }

   /**
   * Get locationToken
   * @return locationToken
  **/
  public String getLocationToken() {
    return locationToken;
  }

  public void setLocationToken(String locationToken) {
    this.locationToken = locationToken;
  }

  public RetailerLocation building(Building building) {
    this.building = building;
    return this;
  }

   /**
   * Get building
   * @return building
  **/
  public Building getBuilding() {
    return building;
  }

  public void setBuilding(Building building) {
    this.building = building;
  }

  public RetailerLocation notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public RetailerLocation addNotesItem(Note notesItem) {
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

  public RetailerLocation noteCount(Long noteCount) {
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

  public RetailerLocation searchIndexUpdated(OffsetDateTime searchIndexUpdated) {
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

  public RetailerLocation inSearchIndex(Boolean inSearchIndex) {
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

  public RetailerLocation favoriteCount(Long favoriteCount) {
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

  public RetailerLocation hasRatings(Boolean hasRatings) {
    this.hasRatings = hasRatings;
    return this;
  }

   /**
   * Get hasRatings
   * @return hasRatings
  **/
  public Boolean getHasRatings() {
    return hasRatings;
  }

  public void setHasRatings(Boolean hasRatings) {
    this.hasRatings = hasRatings;
  }

  public RetailerLocation googlePlaceId(String googlePlaceId) {
    this.googlePlaceId = googlePlaceId;
    return this;
  }

   /**
   * Get googlePlaceId
   * @return googlePlaceId
  **/
  public String getGooglePlaceId() {
    return googlePlaceId;
  }

  public void setGooglePlaceId(String googlePlaceId) {
    this.googlePlaceId = googlePlaceId;
  }

  public RetailerLocation yelpId(String yelpId) {
    this.yelpId = yelpId;
    return this;
  }

   /**
   * Get yelpId
   * @return yelpId
  **/
  public String getYelpId() {
    return yelpId;
  }

  public void setYelpId(String yelpId) {
    this.yelpId = yelpId;
  }

  public RetailerLocation display(String display) {
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

  public RetailerLocation appKey(String appKey) {
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

  public RetailerLocation categoryTree(String categoryTree) {
    this.categoryTree = categoryTree;
    return this;
  }

   /**
   * Get categoryTree
   * @return categoryTree
  **/
  public String getCategoryTree() {
    return categoryTree;
  }

  public void setCategoryTree(String categoryTree) {
    this.categoryTree = categoryTree;
  }

  public RetailerLocation filterTree(String filterTree) {
    this.filterTree = filterTree;
    return this;
  }

   /**
   * Get filterTree
   * @return filterTree
  **/
  public String getFilterTree() {
    return filterTree;
  }

  public void setFilterTree(String filterTree) {
    this.filterTree = filterTree;
  }

  public RetailerLocation addressDisplay(String addressDisplay) {
    this.addressDisplay = addressDisplay;
    return this;
  }

   /**
   * Get addressDisplay
   * @return addressDisplay
  **/
  public String getAddressDisplay() {
    return addressDisplay;
  }

  public void setAddressDisplay(String addressDisplay) {
    this.addressDisplay = addressDisplay;
  }

  public RetailerLocation mapQuery(String mapQuery) {
    this.mapQuery = mapQuery;
    return this;
  }

   /**
   * Get mapQuery
   * @return mapQuery
  **/
  public String getMapQuery() {
    return mapQuery;
  }

  public void setMapQuery(String mapQuery) {
    this.mapQuery = mapQuery;
  }

  public RetailerLocation sortName(String sortName) {
    this.sortName = sortName;
    return this;
  }

   /**
   * Get sortName
   * @return sortName
  **/
  public String getSortName() {
    return sortName;
  }

  public void setSortName(String sortName) {
    this.sortName = sortName;
  }

  public RetailerLocation fullDisplay(String fullDisplay) {
    this.fullDisplay = fullDisplay;
    return this;
  }

   /**
   * Get fullDisplay
   * @return fullDisplay
  **/
  public String getFullDisplay() {
    return fullDisplay;
  }

  public void setFullDisplay(String fullDisplay) {
    this.fullDisplay = fullDisplay;
  }

  public RetailerLocation hasOffers(Boolean hasOffers) {
    this.hasOffers = hasOffers;
    return this;
  }

   /**
   * Get hasOffers
   * @return hasOffers
  **/
  public Boolean getHasOffers() {
    return hasOffers;
  }

  public void setHasOffers(Boolean hasOffers) {
    this.hasOffers = hasOffers;
  }

  public RetailerLocation billableId(Long billableId) {
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

  public RetailerLocation subType(String subType) {
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

  public RetailerLocation contentName(String contentName) {
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

  public RetailerLocation owner(Account owner) {
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

  public RetailerLocation secondaryType(String secondaryType) {
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

  public RetailerLocation locationAddress(String locationAddress) {
    this.locationAddress = locationAddress;
    return this;
  }

   /**
   * Get locationAddress
   * @return locationAddress
  **/
  public String getLocationAddress() {
    return locationAddress;
  }

  public void setLocationAddress(String locationAddress) {
    this.locationAddress = locationAddress;
  }

  public RetailerLocation validOfferLocationIds(List<Long> validOfferLocationIds) {
    this.validOfferLocationIds = validOfferLocationIds;
    return this;
  }

  public RetailerLocation addValidOfferLocationIdsItem(Long validOfferLocationIdsItem) {
    if (this.validOfferLocationIds == null) {
      this.validOfferLocationIds = new ArrayList<>();
    }
    this.validOfferLocationIds.add(validOfferLocationIdsItem);
    return this;
  }

   /**
   * Get validOfferLocationIds
   * @return validOfferLocationIds
  **/
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
    return Objects.equals(id, retailerLocation.id) &&
        Objects.equals(active, retailerLocation.active) &&
        Objects.equals(valid, retailerLocation.valid) &&
        Objects.equals(latitude, retailerLocation.latitude) &&
        Objects.equals(longitude, retailerLocation.longitude) &&
        Objects.equals(locationDescription, retailerLocation.locationDescription) &&
        Objects.equals(categories, retailerLocation.categories) &&
        Objects.equals(filters, retailerLocation.filters) &&
        Objects.equals(offerLocations, retailerLocation.offerLocations) &&
        Objects.equals(logo, retailerLocation.logo) &&
        Objects.equals(picture1, retailerLocation.picture1) &&
        Objects.equals(picture2, retailerLocation.picture2) &&
        Objects.equals(qrCode, retailerLocation.qrCode) &&
        Objects.equals(name, retailerLocation.name) &&
        Objects.equals(locationId, retailerLocation.locationId) &&
        Objects.equals(code, retailerLocation.code) &&
        Objects.equals(retailer, retailerLocation.retailer) &&
        Objects.equals(assignments, retailerLocation.assignments) &&
        Objects.equals(currentAssignment, retailerLocation.currentAssignment) &&
        Objects.equals(profile, retailerLocation.profile) &&
        Objects.equals(regions, retailerLocation.regions) &&
        Objects.equals(offerPrintKeyPrefix, retailerLocation.offerPrintKeyPrefix) &&
        Objects.equals(administrators, retailerLocation.administrators) &&
        Objects.equals(sqootId, retailerLocation.sqootId) &&
        Objects.equals(yipitId, retailerLocation.yipitId) &&
        Objects.equals(locationToken, retailerLocation.locationToken) &&
        Objects.equals(building, retailerLocation.building) &&
        Objects.equals(notes, retailerLocation.notes) &&
        Objects.equals(noteCount, retailerLocation.noteCount) &&
        Objects.equals(searchIndexUpdated, retailerLocation.searchIndexUpdated) &&
        Objects.equals(inSearchIndex, retailerLocation.inSearchIndex) &&
        Objects.equals(favoriteCount, retailerLocation.favoriteCount) &&
        Objects.equals(hasRatings, retailerLocation.hasRatings) &&
        Objects.equals(googlePlaceId, retailerLocation.googlePlaceId) &&
        Objects.equals(yelpId, retailerLocation.yelpId) &&
        Objects.equals(display, retailerLocation.display) &&
        Objects.equals(appKey, retailerLocation.appKey) &&
        Objects.equals(categoryTree, retailerLocation.categoryTree) &&
        Objects.equals(filterTree, retailerLocation.filterTree) &&
        Objects.equals(addressDisplay, retailerLocation.addressDisplay) &&
        Objects.equals(mapQuery, retailerLocation.mapQuery) &&
        Objects.equals(sortName, retailerLocation.sortName) &&
        Objects.equals(fullDisplay, retailerLocation.fullDisplay) &&
        Objects.equals(hasOffers, retailerLocation.hasOffers) &&
        Objects.equals(billableId, retailerLocation.billableId) &&
        Objects.equals(subType, retailerLocation.subType) &&
        Objects.equals(contentName, retailerLocation.contentName) &&
        Objects.equals(owner, retailerLocation.owner) &&
        Objects.equals(secondaryType, retailerLocation.secondaryType) &&
        Objects.equals(locationAddress, retailerLocation.locationAddress) &&
        Objects.equals(validOfferLocationIds, retailerLocation.validOfferLocationIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, latitude, longitude, locationDescription, categories, filters, offerLocations, logo, picture1, picture2, qrCode, name, locationId, code, retailer, assignments, currentAssignment, profile, regions, offerPrintKeyPrefix, administrators, sqootId, yipitId, locationToken, building, notes, noteCount, searchIndexUpdated, inSearchIndex, favoriteCount, hasRatings, googlePlaceId, yelpId, display, appKey, categoryTree, filterTree, addressDisplay, mapQuery, sortName, fullDisplay, hasOffers, billableId, subType, contentName, owner, secondaryType, locationAddress, validOfferLocationIds);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

