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
import org.openapitools.model.Assignment;
import org.openapitools.model.Building;
import org.openapitools.model.Category;
import org.openapitools.model.Filter;
import org.openapitools.model.Note;
import org.openapitools.model.OfferLocation;
import org.openapitools.model.Region;
import org.openapitools.model.Retailer;
import org.openapitools.model.RetailerProfile;
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
 * RetailerLocation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RetailerLocation {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable String locationDescription;

  @Valid
  private List<@Valid Category> categories = new ArrayList<>();

  @Valid
  private List<@Valid Filter> filters = new ArrayList<>();

  @Valid
  private List<@Valid OfferLocation> offerLocations = new ArrayList<>();

  private @Nullable Asset logo;

  private @Nullable Asset picture1;

  private @Nullable Asset picture2;

  private @Nullable Asset qrCode;

  private @Nullable String name;

  private @Nullable String locationId;

  private @Nullable String code;

  private @Nullable Retailer retailer;

  @Valid
  private List<@Valid Assignment> assignments = new ArrayList<>();

  private @Nullable Assignment currentAssignment;

  private @Nullable RetailerProfile profile;

  @Valid
  private List<@Valid Region> regions = new ArrayList<>();

  private @Nullable String offerPrintKeyPrefix;

  @Valid
  private List<@Valid Account> administrators = new ArrayList<>();

  private @Nullable Long sqootId;

  private @Nullable Long yipitId;

  private @Nullable String locationToken;

  private @Nullable Building building;

  @Valid
  private List<@Valid Note> notes = new ArrayList<>();

  private @Nullable Long noteCount;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime searchIndexUpdated;

  private @Nullable Boolean inSearchIndex;

  private @Nullable Long favoriteCount;

  private @Nullable Boolean hasRatings;

  private @Nullable String googlePlaceId;

  private @Nullable String yelpId;

  private @Nullable String display;

  private @Nullable String appKey;

  private @Nullable String categoryTree;

  private @Nullable String filterTree;

  private @Nullable String addressDisplay;

  private @Nullable String mapQuery;

  private @Nullable String sortName;

  private @Nullable String fullDisplay;

  private @Nullable Boolean hasOffers;

  private @Nullable Long billableId;

  private @Nullable String subType;

  private @Nullable String contentName;

  private @Nullable Account owner;

  private @Nullable String secondaryType;

  private @Nullable String locationAddress;

  @Valid
  private List<Long> validOfferLocationIds = new ArrayList<>();

  public RetailerLocation id(@Nullable Long id) {
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

  public RetailerLocation active(@Nullable Boolean active) {
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

  public RetailerLocation valid(@Nullable Boolean valid) {
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

  public RetailerLocation latitude(@Nullable Double latitude) {
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

  public RetailerLocation longitude(@Nullable Double longitude) {
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

  public RetailerLocation locationDescription(@Nullable String locationDescription) {
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
   */
  @Valid 
  @Schema(name = "categories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categories")
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
   */
  @Valid 
  @Schema(name = "filters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filters")
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
   */
  @Valid 
  @Schema(name = "offerLocations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerLocations")
  public List<@Valid OfferLocation> getOfferLocations() {
    return offerLocations;
  }

  public void setOfferLocations(List<@Valid OfferLocation> offerLocations) {
    this.offerLocations = offerLocations;
  }

  public RetailerLocation logo(@Nullable Asset logo) {
    this.logo = logo;
    return this;
  }

  /**
   * Get logo
   * @return logo
   */
  @Valid 
  @Schema(name = "logo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logo")
  public @Nullable Asset getLogo() {
    return logo;
  }

  public void setLogo(@Nullable Asset logo) {
    this.logo = logo;
  }

  public RetailerLocation picture1(@Nullable Asset picture1) {
    this.picture1 = picture1;
    return this;
  }

  /**
   * Get picture1
   * @return picture1
   */
  @Valid 
  @Schema(name = "picture1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("picture1")
  public @Nullable Asset getPicture1() {
    return picture1;
  }

  public void setPicture1(@Nullable Asset picture1) {
    this.picture1 = picture1;
  }

  public RetailerLocation picture2(@Nullable Asset picture2) {
    this.picture2 = picture2;
    return this;
  }

  /**
   * Get picture2
   * @return picture2
   */
  @Valid 
  @Schema(name = "picture2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("picture2")
  public @Nullable Asset getPicture2() {
    return picture2;
  }

  public void setPicture2(@Nullable Asset picture2) {
    this.picture2 = picture2;
  }

  public RetailerLocation qrCode(@Nullable Asset qrCode) {
    this.qrCode = qrCode;
    return this;
  }

  /**
   * Get qrCode
   * @return qrCode
   */
  @Valid 
  @Schema(name = "qrCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("qrCode")
  public @Nullable Asset getQrCode() {
    return qrCode;
  }

  public void setQrCode(@Nullable Asset qrCode) {
    this.qrCode = qrCode;
  }

  public RetailerLocation name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public RetailerLocation locationId(@Nullable String locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Get locationId
   * @return locationId
   */
  
  @Schema(name = "locationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationId")
  public @Nullable String getLocationId() {
    return locationId;
  }

  public void setLocationId(@Nullable String locationId) {
    this.locationId = locationId;
  }

  public RetailerLocation code(@Nullable String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  
  @Schema(name = "code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public @Nullable String getCode() {
    return code;
  }

  public void setCode(@Nullable String code) {
    this.code = code;
  }

  public RetailerLocation retailer(@Nullable Retailer retailer) {
    this.retailer = retailer;
    return this;
  }

  /**
   * Get retailer
   * @return retailer
   */
  @Valid 
  @Schema(name = "retailer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retailer")
  public @Nullable Retailer getRetailer() {
    return retailer;
  }

  public void setRetailer(@Nullable Retailer retailer) {
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
   */
  @Valid 
  @Schema(name = "assignments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignments")
  public List<@Valid Assignment> getAssignments() {
    return assignments;
  }

  public void setAssignments(List<@Valid Assignment> assignments) {
    this.assignments = assignments;
  }

  public RetailerLocation currentAssignment(@Nullable Assignment currentAssignment) {
    this.currentAssignment = currentAssignment;
    return this;
  }

  /**
   * Get currentAssignment
   * @return currentAssignment
   */
  @Valid 
  @Schema(name = "currentAssignment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentAssignment")
  public @Nullable Assignment getCurrentAssignment() {
    return currentAssignment;
  }

  public void setCurrentAssignment(@Nullable Assignment currentAssignment) {
    this.currentAssignment = currentAssignment;
  }

  public RetailerLocation profile(@Nullable RetailerProfile profile) {
    this.profile = profile;
    return this;
  }

  /**
   * Get profile
   * @return profile
   */
  @Valid 
  @Schema(name = "profile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profile")
  public @Nullable RetailerProfile getProfile() {
    return profile;
  }

  public void setProfile(@Nullable RetailerProfile profile) {
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
   */
  @Valid 
  @Schema(name = "regions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regions")
  public List<@Valid Region> getRegions() {
    return regions;
  }

  public void setRegions(List<@Valid Region> regions) {
    this.regions = regions;
  }

  public RetailerLocation offerPrintKeyPrefix(@Nullable String offerPrintKeyPrefix) {
    this.offerPrintKeyPrefix = offerPrintKeyPrefix;
    return this;
  }

  /**
   * Get offerPrintKeyPrefix
   * @return offerPrintKeyPrefix
   */
  
  @Schema(name = "offerPrintKeyPrefix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerPrintKeyPrefix")
  public @Nullable String getOfferPrintKeyPrefix() {
    return offerPrintKeyPrefix;
  }

  public void setOfferPrintKeyPrefix(@Nullable String offerPrintKeyPrefix) {
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
   */
  @Valid 
  @Schema(name = "administrators", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("administrators")
  public List<@Valid Account> getAdministrators() {
    return administrators;
  }

  public void setAdministrators(List<@Valid Account> administrators) {
    this.administrators = administrators;
  }

  public RetailerLocation sqootId(@Nullable Long sqootId) {
    this.sqootId = sqootId;
    return this;
  }

  /**
   * Get sqootId
   * @return sqootId
   */
  
  @Schema(name = "sqootId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sqootId")
  public @Nullable Long getSqootId() {
    return sqootId;
  }

  public void setSqootId(@Nullable Long sqootId) {
    this.sqootId = sqootId;
  }

  public RetailerLocation yipitId(@Nullable Long yipitId) {
    this.yipitId = yipitId;
    return this;
  }

  /**
   * Get yipitId
   * @return yipitId
   */
  
  @Schema(name = "yipitId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yipitId")
  public @Nullable Long getYipitId() {
    return yipitId;
  }

  public void setYipitId(@Nullable Long yipitId) {
    this.yipitId = yipitId;
  }

  public RetailerLocation locationToken(@Nullable String locationToken) {
    this.locationToken = locationToken;
    return this;
  }

  /**
   * Get locationToken
   * @return locationToken
   */
  
  @Schema(name = "locationToken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationToken")
  public @Nullable String getLocationToken() {
    return locationToken;
  }

  public void setLocationToken(@Nullable String locationToken) {
    this.locationToken = locationToken;
  }

  public RetailerLocation building(@Nullable Building building) {
    this.building = building;
    return this;
  }

  /**
   * Get building
   * @return building
   */
  @Valid 
  @Schema(name = "building", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("building")
  public @Nullable Building getBuilding() {
    return building;
  }

  public void setBuilding(@Nullable Building building) {
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

  public RetailerLocation noteCount(@Nullable Long noteCount) {
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

  public RetailerLocation searchIndexUpdated(@Nullable OffsetDateTime searchIndexUpdated) {
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

  public RetailerLocation inSearchIndex(@Nullable Boolean inSearchIndex) {
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

  public RetailerLocation favoriteCount(@Nullable Long favoriteCount) {
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

  public RetailerLocation hasRatings(@Nullable Boolean hasRatings) {
    this.hasRatings = hasRatings;
    return this;
  }

  /**
   * Get hasRatings
   * @return hasRatings
   */
  
  @Schema(name = "hasRatings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasRatings")
  public @Nullable Boolean getHasRatings() {
    return hasRatings;
  }

  public void setHasRatings(@Nullable Boolean hasRatings) {
    this.hasRatings = hasRatings;
  }

  public RetailerLocation googlePlaceId(@Nullable String googlePlaceId) {
    this.googlePlaceId = googlePlaceId;
    return this;
  }

  /**
   * Get googlePlaceId
   * @return googlePlaceId
   */
  
  @Schema(name = "googlePlaceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("googlePlaceId")
  public @Nullable String getGooglePlaceId() {
    return googlePlaceId;
  }

  public void setGooglePlaceId(@Nullable String googlePlaceId) {
    this.googlePlaceId = googlePlaceId;
  }

  public RetailerLocation yelpId(@Nullable String yelpId) {
    this.yelpId = yelpId;
    return this;
  }

  /**
   * Get yelpId
   * @return yelpId
   */
  
  @Schema(name = "yelpId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yelpId")
  public @Nullable String getYelpId() {
    return yelpId;
  }

  public void setYelpId(@Nullable String yelpId) {
    this.yelpId = yelpId;
  }

  public RetailerLocation display(@Nullable String display) {
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

  public RetailerLocation appKey(@Nullable String appKey) {
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

  public RetailerLocation categoryTree(@Nullable String categoryTree) {
    this.categoryTree = categoryTree;
    return this;
  }

  /**
   * Get categoryTree
   * @return categoryTree
   */
  
  @Schema(name = "categoryTree", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryTree")
  public @Nullable String getCategoryTree() {
    return categoryTree;
  }

  public void setCategoryTree(@Nullable String categoryTree) {
    this.categoryTree = categoryTree;
  }

  public RetailerLocation filterTree(@Nullable String filterTree) {
    this.filterTree = filterTree;
    return this;
  }

  /**
   * Get filterTree
   * @return filterTree
   */
  
  @Schema(name = "filterTree", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filterTree")
  public @Nullable String getFilterTree() {
    return filterTree;
  }

  public void setFilterTree(@Nullable String filterTree) {
    this.filterTree = filterTree;
  }

  public RetailerLocation addressDisplay(@Nullable String addressDisplay) {
    this.addressDisplay = addressDisplay;
    return this;
  }

  /**
   * Get addressDisplay
   * @return addressDisplay
   */
  
  @Schema(name = "addressDisplay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addressDisplay")
  public @Nullable String getAddressDisplay() {
    return addressDisplay;
  }

  public void setAddressDisplay(@Nullable String addressDisplay) {
    this.addressDisplay = addressDisplay;
  }

  public RetailerLocation mapQuery(@Nullable String mapQuery) {
    this.mapQuery = mapQuery;
    return this;
  }

  /**
   * Get mapQuery
   * @return mapQuery
   */
  
  @Schema(name = "mapQuery", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mapQuery")
  public @Nullable String getMapQuery() {
    return mapQuery;
  }

  public void setMapQuery(@Nullable String mapQuery) {
    this.mapQuery = mapQuery;
  }

  public RetailerLocation sortName(@Nullable String sortName) {
    this.sortName = sortName;
    return this;
  }

  /**
   * Get sortName
   * @return sortName
   */
  
  @Schema(name = "sortName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sortName")
  public @Nullable String getSortName() {
    return sortName;
  }

  public void setSortName(@Nullable String sortName) {
    this.sortName = sortName;
  }

  public RetailerLocation fullDisplay(@Nullable String fullDisplay) {
    this.fullDisplay = fullDisplay;
    return this;
  }

  /**
   * Get fullDisplay
   * @return fullDisplay
   */
  
  @Schema(name = "fullDisplay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fullDisplay")
  public @Nullable String getFullDisplay() {
    return fullDisplay;
  }

  public void setFullDisplay(@Nullable String fullDisplay) {
    this.fullDisplay = fullDisplay;
  }

  public RetailerLocation hasOffers(@Nullable Boolean hasOffers) {
    this.hasOffers = hasOffers;
    return this;
  }

  /**
   * Get hasOffers
   * @return hasOffers
   */
  
  @Schema(name = "hasOffers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasOffers")
  public @Nullable Boolean getHasOffers() {
    return hasOffers;
  }

  public void setHasOffers(@Nullable Boolean hasOffers) {
    this.hasOffers = hasOffers;
  }

  public RetailerLocation billableId(@Nullable Long billableId) {
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

  public RetailerLocation subType(@Nullable String subType) {
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

  public RetailerLocation contentName(@Nullable String contentName) {
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

  public RetailerLocation owner(@Nullable Account owner) {
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

  public RetailerLocation secondaryType(@Nullable String secondaryType) {
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

  public RetailerLocation locationAddress(@Nullable String locationAddress) {
    this.locationAddress = locationAddress;
    return this;
  }

  /**
   * Get locationAddress
   * @return locationAddress
   */
  
  @Schema(name = "locationAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationAddress")
  public @Nullable String getLocationAddress() {
    return locationAddress;
  }

  public void setLocationAddress(@Nullable String locationAddress) {
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
   */
  
  @Schema(name = "validOfferLocationIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

