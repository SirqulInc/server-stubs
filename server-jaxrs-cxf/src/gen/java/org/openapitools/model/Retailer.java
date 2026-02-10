package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Retailer  {
  
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

  private String name;

  @ApiModelProperty(value = "")

  @Valid

  private Account responsible;

  @ApiModelProperty(value = "")

  @Valid

  private Account manager;

  @ApiModelProperty(value = "")

  private String detailsHeader;

  @ApiModelProperty(value = "")

  private String detailsBody;

  @ApiModelProperty(value = "")

  private String detailsLineLeft1;

  @ApiModelProperty(value = "")

  private String detailsLineLeft2;

  @ApiModelProperty(value = "")

  private String detailsLineRight1;

  @ApiModelProperty(value = "")

  private String metaDescription;

  @ApiModelProperty(value = "")

  private String directions;

  @ApiModelProperty(value = "")

  private String hours;

  @ApiModelProperty(value = "")

  private String homePhone;

  @ApiModelProperty(value = "")

  private String cellPhone;

  @ApiModelProperty(value = "")

  @Valid

  private CellCarrier cellCarrier;

  @ApiModelProperty(value = "")

  private String businessPhone;

  @ApiModelProperty(value = "")

  private String businessPhoneExt;

  @ApiModelProperty(value = "")

  private String faxNumber;

  @ApiModelProperty(value = "")

  private String timeZone;

  @ApiModelProperty(value = "")

  private String utcOffset;

  @ApiModelProperty(value = "")

  private String code501c3;

  @ApiModelProperty(value = "")

  private String emailAddress;

  @ApiModelProperty(value = "")

  @Valid

  private Address address;

  @ApiModelProperty(value = "")

  private String web;

  @ApiModelProperty(value = "")

  private Boolean featured;

  @ApiModelProperty(value = "")

  private Boolean listed;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Category> categories = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private Territory territory;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid RetailerLocation> locations = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long yipitId;

  @ApiModelProperty(value = "")

  private String facebookUrl;

  @ApiModelProperty(value = "")

  private String twitterUrl;

public enum VisibilityEnum {

PUBLIC(String.valueOf("PUBLIC")), PRIVATE(String.valueOf("PRIVATE")), FRIENDS(String.valueOf("FRIENDS"));


    private String value;

    VisibilityEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

  @ApiModelProperty(value = "")

  private VisibilityEnum visibility;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Note> notes = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long noteCount;

  @ApiModelProperty(value = "")

  private String appKey;

  @ApiModelProperty(value = "")

  private String categoryTree;

  @ApiModelProperty(value = "")

  private String filterTree;

  @ApiModelProperty(value = "")

  private Long billableId;

  @ApiModelProperty(value = "")

  private String subType;

  @ApiModelProperty(value = "")

  private String contentName;

  @ApiModelProperty(value = "")

  @Valid

  private Account owner;
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

  public Retailer id(Long id) {
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

  public Retailer active(Boolean active) {
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

  public Retailer valid(Boolean valid) {
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

  public Retailer latitude(Double latitude) {
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

  public Retailer longitude(Double longitude) {
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

  public Retailer locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
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

  public Retailer name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get responsible
   * @return responsible
  **/
  @JsonProperty("responsible")
  public Account getResponsible() {
    return responsible;
  }

  public void setResponsible(Account responsible) {
    this.responsible = responsible;
  }

  public Retailer responsible(Account responsible) {
    this.responsible = responsible;
    return this;
  }

 /**
   * Get manager
   * @return manager
  **/
  @JsonProperty("manager")
  public Account getManager() {
    return manager;
  }

  public void setManager(Account manager) {
    this.manager = manager;
  }

  public Retailer manager(Account manager) {
    this.manager = manager;
    return this;
  }

 /**
   * Get detailsHeader
   * @return detailsHeader
  **/
  @JsonProperty("detailsHeader")
  public String getDetailsHeader() {
    return detailsHeader;
  }

  public void setDetailsHeader(String detailsHeader) {
    this.detailsHeader = detailsHeader;
  }

  public Retailer detailsHeader(String detailsHeader) {
    this.detailsHeader = detailsHeader;
    return this;
  }

 /**
   * Get detailsBody
   * @return detailsBody
  **/
  @JsonProperty("detailsBody")
  public String getDetailsBody() {
    return detailsBody;
  }

  public void setDetailsBody(String detailsBody) {
    this.detailsBody = detailsBody;
  }

  public Retailer detailsBody(String detailsBody) {
    this.detailsBody = detailsBody;
    return this;
  }

 /**
   * Get detailsLineLeft1
   * @return detailsLineLeft1
  **/
  @JsonProperty("detailsLineLeft1")
  public String getDetailsLineLeft1() {
    return detailsLineLeft1;
  }

  public void setDetailsLineLeft1(String detailsLineLeft1) {
    this.detailsLineLeft1 = detailsLineLeft1;
  }

  public Retailer detailsLineLeft1(String detailsLineLeft1) {
    this.detailsLineLeft1 = detailsLineLeft1;
    return this;
  }

 /**
   * Get detailsLineLeft2
   * @return detailsLineLeft2
  **/
  @JsonProperty("detailsLineLeft2")
  public String getDetailsLineLeft2() {
    return detailsLineLeft2;
  }

  public void setDetailsLineLeft2(String detailsLineLeft2) {
    this.detailsLineLeft2 = detailsLineLeft2;
  }

  public Retailer detailsLineLeft2(String detailsLineLeft2) {
    this.detailsLineLeft2 = detailsLineLeft2;
    return this;
  }

 /**
   * Get detailsLineRight1
   * @return detailsLineRight1
  **/
  @JsonProperty("detailsLineRight1")
  public String getDetailsLineRight1() {
    return detailsLineRight1;
  }

  public void setDetailsLineRight1(String detailsLineRight1) {
    this.detailsLineRight1 = detailsLineRight1;
  }

  public Retailer detailsLineRight1(String detailsLineRight1) {
    this.detailsLineRight1 = detailsLineRight1;
    return this;
  }

 /**
   * Get metaDescription
   * @return metaDescription
  **/
  @JsonProperty("metaDescription")
  public String getMetaDescription() {
    return metaDescription;
  }

  public void setMetaDescription(String metaDescription) {
    this.metaDescription = metaDescription;
  }

  public Retailer metaDescription(String metaDescription) {
    this.metaDescription = metaDescription;
    return this;
  }

 /**
   * Get directions
   * @return directions
  **/
  @JsonProperty("directions")
  public String getDirections() {
    return directions;
  }

  public void setDirections(String directions) {
    this.directions = directions;
  }

  public Retailer directions(String directions) {
    this.directions = directions;
    return this;
  }

 /**
   * Get hours
   * @return hours
  **/
  @JsonProperty("hours")
  public String getHours() {
    return hours;
  }

  public void setHours(String hours) {
    this.hours = hours;
  }

  public Retailer hours(String hours) {
    this.hours = hours;
    return this;
  }

 /**
   * Get homePhone
   * @return homePhone
  **/
  @JsonProperty("homePhone")
  public String getHomePhone() {
    return homePhone;
  }

  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  public Retailer homePhone(String homePhone) {
    this.homePhone = homePhone;
    return this;
  }

 /**
   * Get cellPhone
   * @return cellPhone
  **/
  @JsonProperty("cellPhone")
  public String getCellPhone() {
    return cellPhone;
  }

  public void setCellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
  }

  public Retailer cellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
    return this;
  }

 /**
   * Get cellCarrier
   * @return cellCarrier
  **/
  @JsonProperty("cellCarrier")
  public CellCarrier getCellCarrier() {
    return cellCarrier;
  }

  public void setCellCarrier(CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
  }

  public Retailer cellCarrier(CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
    return this;
  }

 /**
   * Get businessPhone
   * @return businessPhone
  **/
  @JsonProperty("businessPhone")
  public String getBusinessPhone() {
    return businessPhone;
  }

  public void setBusinessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
  }

  public Retailer businessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
    return this;
  }

 /**
   * Get businessPhoneExt
   * @return businessPhoneExt
  **/
  @JsonProperty("businessPhoneExt")
  public String getBusinessPhoneExt() {
    return businessPhoneExt;
  }

  public void setBusinessPhoneExt(String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
  }

  public Retailer businessPhoneExt(String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
    return this;
  }

 /**
   * Get faxNumber
   * @return faxNumber
  **/
  @JsonProperty("faxNumber")
  public String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  public Retailer faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

 /**
   * Get timeZone
   * @return timeZone
  **/
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public Retailer timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

 /**
   * Get utcOffset
   * @return utcOffset
  **/
  @JsonProperty("utcOffset")
  public String getUtcOffset() {
    return utcOffset;
  }

  public void setUtcOffset(String utcOffset) {
    this.utcOffset = utcOffset;
  }

  public Retailer utcOffset(String utcOffset) {
    this.utcOffset = utcOffset;
    return this;
  }

 /**
   * Get code501c3
   * @return code501c3
  **/
  @JsonProperty("code501c3")
  public String getCode501c3() {
    return code501c3;
  }

  public void setCode501c3(String code501c3) {
    this.code501c3 = code501c3;
  }

  public Retailer code501c3(String code501c3) {
    this.code501c3 = code501c3;
    return this;
  }

 /**
   * Get emailAddress
   * @return emailAddress
  **/
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Retailer emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

 /**
   * Get address
   * @return address
  **/
  @JsonProperty("address")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Retailer address(Address address) {
    this.address = address;
    return this;
  }

 /**
   * Get web
   * @return web
  **/
  @JsonProperty("web")
  public String getWeb() {
    return web;
  }

  public void setWeb(String web) {
    this.web = web;
  }

  public Retailer web(String web) {
    this.web = web;
    return this;
  }

 /**
   * Get featured
   * @return featured
  **/
  @JsonProperty("featured")
  public Boolean getFeatured() {
    return featured;
  }

  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }

  public Retailer featured(Boolean featured) {
    this.featured = featured;
    return this;
  }

 /**
   * Get listed
   * @return listed
  **/
  @JsonProperty("listed")
  public Boolean getListed() {
    return listed;
  }

  public void setListed(Boolean listed) {
    this.listed = listed;
  }

  public Retailer listed(Boolean listed) {
    this.listed = listed;
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

  public Retailer categories(List<@Valid Category> categories) {
    this.categories = categories;
    return this;
  }

  public Retailer addCategoriesItem(Category categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

 /**
   * Get territory
   * @return territory
  **/
  @JsonProperty("territory")
  public Territory getTerritory() {
    return territory;
  }

  public void setTerritory(Territory territory) {
    this.territory = territory;
  }

  public Retailer territory(Territory territory) {
    this.territory = territory;
    return this;
  }

 /**
   * Get locations
   * @return locations
  **/
  @JsonProperty("locations")
  public List<@Valid RetailerLocation> getLocations() {
    return locations;
  }

  public void setLocations(List<@Valid RetailerLocation> locations) {
    this.locations = locations;
  }

  public Retailer locations(List<@Valid RetailerLocation> locations) {
    this.locations = locations;
    return this;
  }

  public Retailer addLocationsItem(RetailerLocation locationsItem) {
    this.locations.add(locationsItem);
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

  public Retailer yipitId(Long yipitId) {
    this.yipitId = yipitId;
    return this;
  }

 /**
   * Get facebookUrl
   * @return facebookUrl
  **/
  @JsonProperty("facebookUrl")
  public String getFacebookUrl() {
    return facebookUrl;
  }

  public void setFacebookUrl(String facebookUrl) {
    this.facebookUrl = facebookUrl;
  }

  public Retailer facebookUrl(String facebookUrl) {
    this.facebookUrl = facebookUrl;
    return this;
  }

 /**
   * Get twitterUrl
   * @return twitterUrl
  **/
  @JsonProperty("twitterUrl")
  public String getTwitterUrl() {
    return twitterUrl;
  }

  public void setTwitterUrl(String twitterUrl) {
    this.twitterUrl = twitterUrl;
  }

  public Retailer twitterUrl(String twitterUrl) {
    this.twitterUrl = twitterUrl;
    return this;
  }

 /**
   * Get visibility
   * @return visibility
  **/
  @JsonProperty("visibility")
  public String getVisibility() {
    if (visibility == null) {
      return null;
    }
    return visibility.value();
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public Retailer visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
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

  public Retailer notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public Retailer addNotesItem(Note notesItem) {
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

  public Retailer noteCount(Long noteCount) {
    this.noteCount = noteCount;
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

  public Retailer appKey(String appKey) {
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

  public Retailer categoryTree(String categoryTree) {
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

  public Retailer filterTree(String filterTree) {
    this.filterTree = filterTree;
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

  public Retailer billableId(Long billableId) {
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

  public Retailer subType(String subType) {
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

  public Retailer contentName(String contentName) {
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

  public Retailer owner(Account owner) {
    this.owner = owner;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

