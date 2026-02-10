package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Address;
import org.openapitools.model.Category;
import org.openapitools.model.CellCarrier;
import org.openapitools.model.Note;
import org.openapitools.model.RetailerLocation;
import org.openapitools.model.Territory;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Retailer
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Retailer {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable String locationDescription;

  private @Nullable String name;

  private @Nullable Account responsible;

  private @Nullable Account manager;

  private @Nullable String detailsHeader;

  private @Nullable String detailsBody;

  private @Nullable String detailsLineLeft1;

  private @Nullable String detailsLineLeft2;

  private @Nullable String detailsLineRight1;

  private @Nullable String metaDescription;

  private @Nullable String directions;

  private @Nullable String hours;

  private @Nullable String homePhone;

  private @Nullable String cellPhone;

  private @Nullable CellCarrier cellCarrier;

  private @Nullable String businessPhone;

  private @Nullable String businessPhoneExt;

  private @Nullable String faxNumber;

  private @Nullable String timeZone;

  private @Nullable String utcOffset;

  private @Nullable String code501c3;

  private @Nullable String emailAddress;

  private @Nullable Address address;

  private @Nullable String web;

  private @Nullable Boolean featured;

  private @Nullable Boolean listed;

  @Valid
  private List<@Valid Category> categories = new ArrayList<>();

  private @Nullable Territory territory;

  @Valid
  private List<@Valid RetailerLocation> locations = new ArrayList<>();

  private @Nullable Long yipitId;

  private @Nullable String facebookUrl;

  private @Nullable String twitterUrl;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable VisibilityEnum visibility;

  @Valid
  private List<@Valid Note> notes = new ArrayList<>();

  private @Nullable Long noteCount;

  private @Nullable String appKey;

  private @Nullable String categoryTree;

  private @Nullable String filterTree;

  private @Nullable Long billableId;

  private @Nullable String subType;

  private @Nullable String contentName;

  private @Nullable Account owner;

  public Retailer id(@Nullable Long id) {
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

  public Retailer active(@Nullable Boolean active) {
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

  public Retailer valid(@Nullable Boolean valid) {
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

  public Retailer latitude(@Nullable Double latitude) {
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

  public Retailer longitude(@Nullable Double longitude) {
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

  public Retailer locationDescription(@Nullable String locationDescription) {
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

  public Retailer name(@Nullable String name) {
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

  public Retailer responsible(@Nullable Account responsible) {
    this.responsible = responsible;
    return this;
  }

  /**
   * Get responsible
   * @return responsible
   */
  @Valid 
  @Schema(name = "responsible", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("responsible")
  public @Nullable Account getResponsible() {
    return responsible;
  }

  public void setResponsible(@Nullable Account responsible) {
    this.responsible = responsible;
  }

  public Retailer manager(@Nullable Account manager) {
    this.manager = manager;
    return this;
  }

  /**
   * Get manager
   * @return manager
   */
  @Valid 
  @Schema(name = "manager", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("manager")
  public @Nullable Account getManager() {
    return manager;
  }

  public void setManager(@Nullable Account manager) {
    this.manager = manager;
  }

  public Retailer detailsHeader(@Nullable String detailsHeader) {
    this.detailsHeader = detailsHeader;
    return this;
  }

  /**
   * Get detailsHeader
   * @return detailsHeader
   */
  
  @Schema(name = "detailsHeader", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detailsHeader")
  public @Nullable String getDetailsHeader() {
    return detailsHeader;
  }

  public void setDetailsHeader(@Nullable String detailsHeader) {
    this.detailsHeader = detailsHeader;
  }

  public Retailer detailsBody(@Nullable String detailsBody) {
    this.detailsBody = detailsBody;
    return this;
  }

  /**
   * Get detailsBody
   * @return detailsBody
   */
  
  @Schema(name = "detailsBody", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detailsBody")
  public @Nullable String getDetailsBody() {
    return detailsBody;
  }

  public void setDetailsBody(@Nullable String detailsBody) {
    this.detailsBody = detailsBody;
  }

  public Retailer detailsLineLeft1(@Nullable String detailsLineLeft1) {
    this.detailsLineLeft1 = detailsLineLeft1;
    return this;
  }

  /**
   * Get detailsLineLeft1
   * @return detailsLineLeft1
   */
  
  @Schema(name = "detailsLineLeft1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detailsLineLeft1")
  public @Nullable String getDetailsLineLeft1() {
    return detailsLineLeft1;
  }

  public void setDetailsLineLeft1(@Nullable String detailsLineLeft1) {
    this.detailsLineLeft1 = detailsLineLeft1;
  }

  public Retailer detailsLineLeft2(@Nullable String detailsLineLeft2) {
    this.detailsLineLeft2 = detailsLineLeft2;
    return this;
  }

  /**
   * Get detailsLineLeft2
   * @return detailsLineLeft2
   */
  
  @Schema(name = "detailsLineLeft2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detailsLineLeft2")
  public @Nullable String getDetailsLineLeft2() {
    return detailsLineLeft2;
  }

  public void setDetailsLineLeft2(@Nullable String detailsLineLeft2) {
    this.detailsLineLeft2 = detailsLineLeft2;
  }

  public Retailer detailsLineRight1(@Nullable String detailsLineRight1) {
    this.detailsLineRight1 = detailsLineRight1;
    return this;
  }

  /**
   * Get detailsLineRight1
   * @return detailsLineRight1
   */
  
  @Schema(name = "detailsLineRight1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detailsLineRight1")
  public @Nullable String getDetailsLineRight1() {
    return detailsLineRight1;
  }

  public void setDetailsLineRight1(@Nullable String detailsLineRight1) {
    this.detailsLineRight1 = detailsLineRight1;
  }

  public Retailer metaDescription(@Nullable String metaDescription) {
    this.metaDescription = metaDescription;
    return this;
  }

  /**
   * Get metaDescription
   * @return metaDescription
   */
  
  @Schema(name = "metaDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metaDescription")
  public @Nullable String getMetaDescription() {
    return metaDescription;
  }

  public void setMetaDescription(@Nullable String metaDescription) {
    this.metaDescription = metaDescription;
  }

  public Retailer directions(@Nullable String directions) {
    this.directions = directions;
    return this;
  }

  /**
   * Get directions
   * @return directions
   */
  
  @Schema(name = "directions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("directions")
  public @Nullable String getDirections() {
    return directions;
  }

  public void setDirections(@Nullable String directions) {
    this.directions = directions;
  }

  public Retailer hours(@Nullable String hours) {
    this.hours = hours;
    return this;
  }

  /**
   * Get hours
   * @return hours
   */
  
  @Schema(name = "hours", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hours")
  public @Nullable String getHours() {
    return hours;
  }

  public void setHours(@Nullable String hours) {
    this.hours = hours;
  }

  public Retailer homePhone(@Nullable String homePhone) {
    this.homePhone = homePhone;
    return this;
  }

  /**
   * Get homePhone
   * @return homePhone
   */
  
  @Schema(name = "homePhone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("homePhone")
  public @Nullable String getHomePhone() {
    return homePhone;
  }

  public void setHomePhone(@Nullable String homePhone) {
    this.homePhone = homePhone;
  }

  public Retailer cellPhone(@Nullable String cellPhone) {
    this.cellPhone = cellPhone;
    return this;
  }

  /**
   * Get cellPhone
   * @return cellPhone
   */
  
  @Schema(name = "cellPhone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cellPhone")
  public @Nullable String getCellPhone() {
    return cellPhone;
  }

  public void setCellPhone(@Nullable String cellPhone) {
    this.cellPhone = cellPhone;
  }

  public Retailer cellCarrier(@Nullable CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
    return this;
  }

  /**
   * Get cellCarrier
   * @return cellCarrier
   */
  @Valid 
  @Schema(name = "cellCarrier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cellCarrier")
  public @Nullable CellCarrier getCellCarrier() {
    return cellCarrier;
  }

  public void setCellCarrier(@Nullable CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
  }

  public Retailer businessPhone(@Nullable String businessPhone) {
    this.businessPhone = businessPhone;
    return this;
  }

  /**
   * Get businessPhone
   * @return businessPhone
   */
  
  @Schema(name = "businessPhone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("businessPhone")
  public @Nullable String getBusinessPhone() {
    return businessPhone;
  }

  public void setBusinessPhone(@Nullable String businessPhone) {
    this.businessPhone = businessPhone;
  }

  public Retailer businessPhoneExt(@Nullable String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
    return this;
  }

  /**
   * Get businessPhoneExt
   * @return businessPhoneExt
   */
  
  @Schema(name = "businessPhoneExt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("businessPhoneExt")
  public @Nullable String getBusinessPhoneExt() {
    return businessPhoneExt;
  }

  public void setBusinessPhoneExt(@Nullable String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
  }

  public Retailer faxNumber(@Nullable String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

  /**
   * Get faxNumber
   * @return faxNumber
   */
  
  @Schema(name = "faxNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("faxNumber")
  public @Nullable String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(@Nullable String faxNumber) {
    this.faxNumber = faxNumber;
  }

  public Retailer timeZone(@Nullable String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Get timeZone
   * @return timeZone
   */
  
  @Schema(name = "timeZone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeZone")
  public @Nullable String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(@Nullable String timeZone) {
    this.timeZone = timeZone;
  }

  public Retailer utcOffset(@Nullable String utcOffset) {
    this.utcOffset = utcOffset;
    return this;
  }

  /**
   * Get utcOffset
   * @return utcOffset
   */
  
  @Schema(name = "utcOffset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("utcOffset")
  public @Nullable String getUtcOffset() {
    return utcOffset;
  }

  public void setUtcOffset(@Nullable String utcOffset) {
    this.utcOffset = utcOffset;
  }

  public Retailer code501c3(@Nullable String code501c3) {
    this.code501c3 = code501c3;
    return this;
  }

  /**
   * Get code501c3
   * @return code501c3
   */
  
  @Schema(name = "code501c3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code501c3")
  public @Nullable String getCode501c3() {
    return code501c3;
  }

  public void setCode501c3(@Nullable String code501c3) {
    this.code501c3 = code501c3;
  }

  public Retailer emailAddress(@Nullable String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Get emailAddress
   * @return emailAddress
   */
  
  @Schema(name = "emailAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailAddress")
  public @Nullable String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(@Nullable String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Retailer address(@Nullable Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public @Nullable Address getAddress() {
    return address;
  }

  public void setAddress(@Nullable Address address) {
    this.address = address;
  }

  public Retailer web(@Nullable String web) {
    this.web = web;
    return this;
  }

  /**
   * Get web
   * @return web
   */
  
  @Schema(name = "web", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("web")
  public @Nullable String getWeb() {
    return web;
  }

  public void setWeb(@Nullable String web) {
    this.web = web;
  }

  public Retailer featured(@Nullable Boolean featured) {
    this.featured = featured;
    return this;
  }

  /**
   * Get featured
   * @return featured
   */
  
  @Schema(name = "featured", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("featured")
  public @Nullable Boolean getFeatured() {
    return featured;
  }

  public void setFeatured(@Nullable Boolean featured) {
    this.featured = featured;
  }

  public Retailer listed(@Nullable Boolean listed) {
    this.listed = listed;
    return this;
  }

  /**
   * Get listed
   * @return listed
   */
  
  @Schema(name = "listed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("listed")
  public @Nullable Boolean getListed() {
    return listed;
  }

  public void setListed(@Nullable Boolean listed) {
    this.listed = listed;
  }

  public Retailer categories(List<@Valid Category> categories) {
    this.categories = categories;
    return this;
  }

  public Retailer addCategoriesItem(Category categoriesItem) {
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

  public Retailer territory(@Nullable Territory territory) {
    this.territory = territory;
    return this;
  }

  /**
   * Get territory
   * @return territory
   */
  @Valid 
  @Schema(name = "territory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("territory")
  public @Nullable Territory getTerritory() {
    return territory;
  }

  public void setTerritory(@Nullable Territory territory) {
    this.territory = territory;
  }

  public Retailer locations(List<@Valid RetailerLocation> locations) {
    this.locations = locations;
    return this;
  }

  public Retailer addLocationsItem(RetailerLocation locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    return this;
  }

  /**
   * Get locations
   * @return locations
   */
  @Valid 
  @Schema(name = "locations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locations")
  public List<@Valid RetailerLocation> getLocations() {
    return locations;
  }

  public void setLocations(List<@Valid RetailerLocation> locations) {
    this.locations = locations;
  }

  public Retailer yipitId(@Nullable Long yipitId) {
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

  public Retailer facebookUrl(@Nullable String facebookUrl) {
    this.facebookUrl = facebookUrl;
    return this;
  }

  /**
   * Get facebookUrl
   * @return facebookUrl
   */
  
  @Schema(name = "facebookUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("facebookUrl")
  public @Nullable String getFacebookUrl() {
    return facebookUrl;
  }

  public void setFacebookUrl(@Nullable String facebookUrl) {
    this.facebookUrl = facebookUrl;
  }

  public Retailer twitterUrl(@Nullable String twitterUrl) {
    this.twitterUrl = twitterUrl;
    return this;
  }

  /**
   * Get twitterUrl
   * @return twitterUrl
   */
  
  @Schema(name = "twitterUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("twitterUrl")
  public @Nullable String getTwitterUrl() {
    return twitterUrl;
  }

  public void setTwitterUrl(@Nullable String twitterUrl) {
    this.twitterUrl = twitterUrl;
  }

  public Retailer visibility(@Nullable VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Get visibility
   * @return visibility
   */
  
  @Schema(name = "visibility", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visibility")
  public @Nullable VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(@Nullable VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public Retailer notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public Retailer addNotesItem(Note notesItem) {
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

  public Retailer noteCount(@Nullable Long noteCount) {
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

  public Retailer appKey(@Nullable String appKey) {
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

  public Retailer categoryTree(@Nullable String categoryTree) {
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

  public Retailer filterTree(@Nullable String filterTree) {
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

  public Retailer billableId(@Nullable Long billableId) {
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

  public Retailer subType(@Nullable String subType) {
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

  public Retailer contentName(@Nullable String contentName) {
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

  public Retailer owner(@Nullable Account owner) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Retailer retailer = (Retailer) o;
    return Objects.equals(this.id, retailer.id) &&
        Objects.equals(this.active, retailer.active) &&
        Objects.equals(this.valid, retailer.valid) &&
        Objects.equals(this.latitude, retailer.latitude) &&
        Objects.equals(this.longitude, retailer.longitude) &&
        Objects.equals(this.locationDescription, retailer.locationDescription) &&
        Objects.equals(this.name, retailer.name) &&
        Objects.equals(this.responsible, retailer.responsible) &&
        Objects.equals(this.manager, retailer.manager) &&
        Objects.equals(this.detailsHeader, retailer.detailsHeader) &&
        Objects.equals(this.detailsBody, retailer.detailsBody) &&
        Objects.equals(this.detailsLineLeft1, retailer.detailsLineLeft1) &&
        Objects.equals(this.detailsLineLeft2, retailer.detailsLineLeft2) &&
        Objects.equals(this.detailsLineRight1, retailer.detailsLineRight1) &&
        Objects.equals(this.metaDescription, retailer.metaDescription) &&
        Objects.equals(this.directions, retailer.directions) &&
        Objects.equals(this.hours, retailer.hours) &&
        Objects.equals(this.homePhone, retailer.homePhone) &&
        Objects.equals(this.cellPhone, retailer.cellPhone) &&
        Objects.equals(this.cellCarrier, retailer.cellCarrier) &&
        Objects.equals(this.businessPhone, retailer.businessPhone) &&
        Objects.equals(this.businessPhoneExt, retailer.businessPhoneExt) &&
        Objects.equals(this.faxNumber, retailer.faxNumber) &&
        Objects.equals(this.timeZone, retailer.timeZone) &&
        Objects.equals(this.utcOffset, retailer.utcOffset) &&
        Objects.equals(this.code501c3, retailer.code501c3) &&
        Objects.equals(this.emailAddress, retailer.emailAddress) &&
        Objects.equals(this.address, retailer.address) &&
        Objects.equals(this.web, retailer.web) &&
        Objects.equals(this.featured, retailer.featured) &&
        Objects.equals(this.listed, retailer.listed) &&
        Objects.equals(this.categories, retailer.categories) &&
        Objects.equals(this.territory, retailer.territory) &&
        Objects.equals(this.locations, retailer.locations) &&
        Objects.equals(this.yipitId, retailer.yipitId) &&
        Objects.equals(this.facebookUrl, retailer.facebookUrl) &&
        Objects.equals(this.twitterUrl, retailer.twitterUrl) &&
        Objects.equals(this.visibility, retailer.visibility) &&
        Objects.equals(this.notes, retailer.notes) &&
        Objects.equals(this.noteCount, retailer.noteCount) &&
        Objects.equals(this.appKey, retailer.appKey) &&
        Objects.equals(this.categoryTree, retailer.categoryTree) &&
        Objects.equals(this.filterTree, retailer.filterTree) &&
        Objects.equals(this.billableId, retailer.billableId) &&
        Objects.equals(this.subType, retailer.subType) &&
        Objects.equals(this.contentName, retailer.contentName) &&
        Objects.equals(this.owner, retailer.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, latitude, longitude, locationDescription, name, responsible, manager, detailsHeader, detailsBody, detailsLineLeft1, detailsLineLeft2, detailsLineRight1, metaDescription, directions, hours, homePhone, cellPhone, cellCarrier, businessPhone, businessPhoneExt, faxNumber, timeZone, utcOffset, code501c3, emailAddress, address, web, featured, listed, categories, territory, locations, yipitId, facebookUrl, twitterUrl, visibility, notes, noteCount, appKey, categoryTree, filterTree, billableId, subType, contentName, owner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Retailer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    responsible: ").append(toIndentedString(responsible)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    detailsHeader: ").append(toIndentedString(detailsHeader)).append("\n");
    sb.append("    detailsBody: ").append(toIndentedString(detailsBody)).append("\n");
    sb.append("    detailsLineLeft1: ").append(toIndentedString(detailsLineLeft1)).append("\n");
    sb.append("    detailsLineLeft2: ").append(toIndentedString(detailsLineLeft2)).append("\n");
    sb.append("    detailsLineRight1: ").append(toIndentedString(detailsLineRight1)).append("\n");
    sb.append("    metaDescription: ").append(toIndentedString(metaDescription)).append("\n");
    sb.append("    directions: ").append(toIndentedString(directions)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    homePhone: ").append(toIndentedString(homePhone)).append("\n");
    sb.append("    cellPhone: ").append(toIndentedString(cellPhone)).append("\n");
    sb.append("    cellCarrier: ").append(toIndentedString(cellCarrier)).append("\n");
    sb.append("    businessPhone: ").append(toIndentedString(businessPhone)).append("\n");
    sb.append("    businessPhoneExt: ").append(toIndentedString(businessPhoneExt)).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    utcOffset: ").append(toIndentedString(utcOffset)).append("\n");
    sb.append("    code501c3: ").append(toIndentedString(code501c3)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    web: ").append(toIndentedString(web)).append("\n");
    sb.append("    featured: ").append(toIndentedString(featured)).append("\n");
    sb.append("    listed: ").append(toIndentedString(listed)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    territory: ").append(toIndentedString(territory)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    yipitId: ").append(toIndentedString(yipitId)).append("\n");
    sb.append("    facebookUrl: ").append(toIndentedString(facebookUrl)).append("\n");
    sb.append("    twitterUrl: ").append(toIndentedString(twitterUrl)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    noteCount: ").append(toIndentedString(noteCount)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    categoryTree: ").append(toIndentedString(categoryTree)).append("\n");
    sb.append("    filterTree: ").append(toIndentedString(filterTree)).append("\n");
    sb.append("    billableId: ").append(toIndentedString(billableId)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

