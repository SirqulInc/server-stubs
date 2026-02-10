package apimodels;

import apimodels.Account;
import apimodels.Address;
import apimodels.Category;
import apimodels.CellCarrier;
import apimodels.Note;
import apimodels.RetailerLocation;
import apimodels.Territory;
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
 * Retailer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Retailer   {
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

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("responsible")
  @Valid

  private Account responsible;

  @JsonProperty("manager")
  @Valid

  private Account manager;

  @JsonProperty("detailsHeader")
  
  private String detailsHeader;

  @JsonProperty("detailsBody")
  
  private String detailsBody;

  @JsonProperty("detailsLineLeft1")
  
  private String detailsLineLeft1;

  @JsonProperty("detailsLineLeft2")
  
  private String detailsLineLeft2;

  @JsonProperty("detailsLineRight1")
  
  private String detailsLineRight1;

  @JsonProperty("metaDescription")
  
  private String metaDescription;

  @JsonProperty("directions")
  
  private String directions;

  @JsonProperty("hours")
  
  private String hours;

  @JsonProperty("homePhone")
  
  private String homePhone;

  @JsonProperty("cellPhone")
  
  private String cellPhone;

  @JsonProperty("cellCarrier")
  @Valid

  private CellCarrier cellCarrier;

  @JsonProperty("businessPhone")
  
  private String businessPhone;

  @JsonProperty("businessPhoneExt")
  
  private String businessPhoneExt;

  @JsonProperty("faxNumber")
  
  private String faxNumber;

  @JsonProperty("timeZone")
  
  private String timeZone;

  @JsonProperty("utcOffset")
  
  private String utcOffset;

  @JsonProperty("code501c3")
  
  private String code501c3;

  @JsonProperty("emailAddress")
  
  private String emailAddress;

  @JsonProperty("address")
  @Valid

  private Address address;

  @JsonProperty("web")
  
  private String web;

  @JsonProperty("featured")
  
  private Boolean featured;

  @JsonProperty("listed")
  
  private Boolean listed;

  @JsonProperty("categories")
  @Valid

  private List<@Valid Category> categories = null;

  @JsonProperty("territory")
  @Valid

  private Territory territory;

  @JsonProperty("locations")
  @Valid

  private List<@Valid RetailerLocation> locations = null;

  @JsonProperty("yipitId")
  
  private Long yipitId;

  @JsonProperty("facebookUrl")
  
  private String facebookUrl;

  @JsonProperty("twitterUrl")
  
  private String twitterUrl;

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

  @JsonProperty("visibility")
  
  private VisibilityEnum visibility;

  @JsonProperty("notes")
  @Valid

  private List<@Valid Note> notes = null;

  @JsonProperty("noteCount")
  
  private Long noteCount;

  @JsonProperty("appKey")
  
  private String appKey;

  @JsonProperty("categoryTree")
  
  private String categoryTree;

  @JsonProperty("filterTree")
  
  private String filterTree;

  @JsonProperty("billableId")
  
  private Long billableId;

  @JsonProperty("subType")
  
  private String subType;

  @JsonProperty("contentName")
  
  private String contentName;

  @JsonProperty("owner")
  @Valid

  private Account owner;

  public Retailer id(Long id) {
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

  public Retailer active(Boolean active) {
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

  public Retailer valid(Boolean valid) {
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

  public Retailer latitude(Double latitude) {
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

  public Retailer longitude(Double longitude) {
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

  public Retailer locationDescription(String locationDescription) {
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

  public Retailer name(String name) {
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

  public Retailer responsible(Account responsible) {
    this.responsible = responsible;
    return this;
  }

   /**
   * Get responsible
   * @return responsible
  **/
  public Account getResponsible() {
    return responsible;
  }

  public void setResponsible(Account responsible) {
    this.responsible = responsible;
  }

  public Retailer manager(Account manager) {
    this.manager = manager;
    return this;
  }

   /**
   * Get manager
   * @return manager
  **/
  public Account getManager() {
    return manager;
  }

  public void setManager(Account manager) {
    this.manager = manager;
  }

  public Retailer detailsHeader(String detailsHeader) {
    this.detailsHeader = detailsHeader;
    return this;
  }

   /**
   * Get detailsHeader
   * @return detailsHeader
  **/
  public String getDetailsHeader() {
    return detailsHeader;
  }

  public void setDetailsHeader(String detailsHeader) {
    this.detailsHeader = detailsHeader;
  }

  public Retailer detailsBody(String detailsBody) {
    this.detailsBody = detailsBody;
    return this;
  }

   /**
   * Get detailsBody
   * @return detailsBody
  **/
  public String getDetailsBody() {
    return detailsBody;
  }

  public void setDetailsBody(String detailsBody) {
    this.detailsBody = detailsBody;
  }

  public Retailer detailsLineLeft1(String detailsLineLeft1) {
    this.detailsLineLeft1 = detailsLineLeft1;
    return this;
  }

   /**
   * Get detailsLineLeft1
   * @return detailsLineLeft1
  **/
  public String getDetailsLineLeft1() {
    return detailsLineLeft1;
  }

  public void setDetailsLineLeft1(String detailsLineLeft1) {
    this.detailsLineLeft1 = detailsLineLeft1;
  }

  public Retailer detailsLineLeft2(String detailsLineLeft2) {
    this.detailsLineLeft2 = detailsLineLeft2;
    return this;
  }

   /**
   * Get detailsLineLeft2
   * @return detailsLineLeft2
  **/
  public String getDetailsLineLeft2() {
    return detailsLineLeft2;
  }

  public void setDetailsLineLeft2(String detailsLineLeft2) {
    this.detailsLineLeft2 = detailsLineLeft2;
  }

  public Retailer detailsLineRight1(String detailsLineRight1) {
    this.detailsLineRight1 = detailsLineRight1;
    return this;
  }

   /**
   * Get detailsLineRight1
   * @return detailsLineRight1
  **/
  public String getDetailsLineRight1() {
    return detailsLineRight1;
  }

  public void setDetailsLineRight1(String detailsLineRight1) {
    this.detailsLineRight1 = detailsLineRight1;
  }

  public Retailer metaDescription(String metaDescription) {
    this.metaDescription = metaDescription;
    return this;
  }

   /**
   * Get metaDescription
   * @return metaDescription
  **/
  public String getMetaDescription() {
    return metaDescription;
  }

  public void setMetaDescription(String metaDescription) {
    this.metaDescription = metaDescription;
  }

  public Retailer directions(String directions) {
    this.directions = directions;
    return this;
  }

   /**
   * Get directions
   * @return directions
  **/
  public String getDirections() {
    return directions;
  }

  public void setDirections(String directions) {
    this.directions = directions;
  }

  public Retailer hours(String hours) {
    this.hours = hours;
    return this;
  }

   /**
   * Get hours
   * @return hours
  **/
  public String getHours() {
    return hours;
  }

  public void setHours(String hours) {
    this.hours = hours;
  }

  public Retailer homePhone(String homePhone) {
    this.homePhone = homePhone;
    return this;
  }

   /**
   * Get homePhone
   * @return homePhone
  **/
  public String getHomePhone() {
    return homePhone;
  }

  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  public Retailer cellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
    return this;
  }

   /**
   * Get cellPhone
   * @return cellPhone
  **/
  public String getCellPhone() {
    return cellPhone;
  }

  public void setCellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
  }

  public Retailer cellCarrier(CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
    return this;
  }

   /**
   * Get cellCarrier
   * @return cellCarrier
  **/
  public CellCarrier getCellCarrier() {
    return cellCarrier;
  }

  public void setCellCarrier(CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
  }

  public Retailer businessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
    return this;
  }

   /**
   * Get businessPhone
   * @return businessPhone
  **/
  public String getBusinessPhone() {
    return businessPhone;
  }

  public void setBusinessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
  }

  public Retailer businessPhoneExt(String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
    return this;
  }

   /**
   * Get businessPhoneExt
   * @return businessPhoneExt
  **/
  public String getBusinessPhoneExt() {
    return businessPhoneExt;
  }

  public void setBusinessPhoneExt(String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
  }

  public Retailer faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

   /**
   * Get faxNumber
   * @return faxNumber
  **/
  public String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  public Retailer timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public Retailer utcOffset(String utcOffset) {
    this.utcOffset = utcOffset;
    return this;
  }

   /**
   * Get utcOffset
   * @return utcOffset
  **/
  public String getUtcOffset() {
    return utcOffset;
  }

  public void setUtcOffset(String utcOffset) {
    this.utcOffset = utcOffset;
  }

  public Retailer code501c3(String code501c3) {
    this.code501c3 = code501c3;
    return this;
  }

   /**
   * Get code501c3
   * @return code501c3
  **/
  public String getCode501c3() {
    return code501c3;
  }

  public void setCode501c3(String code501c3) {
    this.code501c3 = code501c3;
  }

  public Retailer emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Retailer address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Retailer web(String web) {
    this.web = web;
    return this;
  }

   /**
   * Get web
   * @return web
  **/
  public String getWeb() {
    return web;
  }

  public void setWeb(String web) {
    this.web = web;
  }

  public Retailer featured(Boolean featured) {
    this.featured = featured;
    return this;
  }

   /**
   * Get featured
   * @return featured
  **/
  public Boolean getFeatured() {
    return featured;
  }

  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }

  public Retailer listed(Boolean listed) {
    this.listed = listed;
    return this;
  }

   /**
   * Get listed
   * @return listed
  **/
  public Boolean getListed() {
    return listed;
  }

  public void setListed(Boolean listed) {
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
  **/
  public List<@Valid Category> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid Category> categories) {
    this.categories = categories;
  }

  public Retailer territory(Territory territory) {
    this.territory = territory;
    return this;
  }

   /**
   * Get territory
   * @return territory
  **/
  public Territory getTerritory() {
    return territory;
  }

  public void setTerritory(Territory territory) {
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
  **/
  public List<@Valid RetailerLocation> getLocations() {
    return locations;
  }

  public void setLocations(List<@Valid RetailerLocation> locations) {
    this.locations = locations;
  }

  public Retailer yipitId(Long yipitId) {
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

  public Retailer facebookUrl(String facebookUrl) {
    this.facebookUrl = facebookUrl;
    return this;
  }

   /**
   * Get facebookUrl
   * @return facebookUrl
  **/
  public String getFacebookUrl() {
    return facebookUrl;
  }

  public void setFacebookUrl(String facebookUrl) {
    this.facebookUrl = facebookUrl;
  }

  public Retailer twitterUrl(String twitterUrl) {
    this.twitterUrl = twitterUrl;
    return this;
  }

   /**
   * Get twitterUrl
   * @return twitterUrl
  **/
  public String getTwitterUrl() {
    return twitterUrl;
  }

  public void setTwitterUrl(String twitterUrl) {
    this.twitterUrl = twitterUrl;
  }

  public Retailer visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
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
  **/
  public List<@Valid Note> getNotes() {
    return notes;
  }

  public void setNotes(List<@Valid Note> notes) {
    this.notes = notes;
  }

  public Retailer noteCount(Long noteCount) {
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

  public Retailer appKey(String appKey) {
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

  public Retailer categoryTree(String categoryTree) {
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

  public Retailer filterTree(String filterTree) {
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

  public Retailer billableId(Long billableId) {
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

  public Retailer subType(String subType) {
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

  public Retailer contentName(String contentName) {
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

  public Retailer owner(Account owner) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Retailer retailer = (Retailer) o;
    return Objects.equals(id, retailer.id) &&
        Objects.equals(active, retailer.active) &&
        Objects.equals(valid, retailer.valid) &&
        Objects.equals(latitude, retailer.latitude) &&
        Objects.equals(longitude, retailer.longitude) &&
        Objects.equals(locationDescription, retailer.locationDescription) &&
        Objects.equals(name, retailer.name) &&
        Objects.equals(responsible, retailer.responsible) &&
        Objects.equals(manager, retailer.manager) &&
        Objects.equals(detailsHeader, retailer.detailsHeader) &&
        Objects.equals(detailsBody, retailer.detailsBody) &&
        Objects.equals(detailsLineLeft1, retailer.detailsLineLeft1) &&
        Objects.equals(detailsLineLeft2, retailer.detailsLineLeft2) &&
        Objects.equals(detailsLineRight1, retailer.detailsLineRight1) &&
        Objects.equals(metaDescription, retailer.metaDescription) &&
        Objects.equals(directions, retailer.directions) &&
        Objects.equals(hours, retailer.hours) &&
        Objects.equals(homePhone, retailer.homePhone) &&
        Objects.equals(cellPhone, retailer.cellPhone) &&
        Objects.equals(cellCarrier, retailer.cellCarrier) &&
        Objects.equals(businessPhone, retailer.businessPhone) &&
        Objects.equals(businessPhoneExt, retailer.businessPhoneExt) &&
        Objects.equals(faxNumber, retailer.faxNumber) &&
        Objects.equals(timeZone, retailer.timeZone) &&
        Objects.equals(utcOffset, retailer.utcOffset) &&
        Objects.equals(code501c3, retailer.code501c3) &&
        Objects.equals(emailAddress, retailer.emailAddress) &&
        Objects.equals(address, retailer.address) &&
        Objects.equals(web, retailer.web) &&
        Objects.equals(featured, retailer.featured) &&
        Objects.equals(listed, retailer.listed) &&
        Objects.equals(categories, retailer.categories) &&
        Objects.equals(territory, retailer.territory) &&
        Objects.equals(locations, retailer.locations) &&
        Objects.equals(yipitId, retailer.yipitId) &&
        Objects.equals(facebookUrl, retailer.facebookUrl) &&
        Objects.equals(twitterUrl, retailer.twitterUrl) &&
        Objects.equals(visibility, retailer.visibility) &&
        Objects.equals(notes, retailer.notes) &&
        Objects.equals(noteCount, retailer.noteCount) &&
        Objects.equals(appKey, retailer.appKey) &&
        Objects.equals(categoryTree, retailer.categoryTree) &&
        Objects.equals(filterTree, retailer.filterTree) &&
        Objects.equals(billableId, retailer.billableId) &&
        Objects.equals(subType, retailer.subType) &&
        Objects.equals(contentName, retailer.contentName) &&
        Objects.equals(owner, retailer.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, latitude, longitude, locationDescription, name, responsible, manager, detailsHeader, detailsBody, detailsLineLeft1, detailsLineLeft2, detailsLineRight1, metaDescription, directions, hours, homePhone, cellPhone, cellCarrier, businessPhone, businessPhoneExt, faxNumber, timeZone, utcOffset, code501c3, emailAddress, address, web, featured, listed, categories, territory, locations, yipitId, facebookUrl, twitterUrl, visibility, notes, noteCount, appKey, categoryTree, filterTree, billableId, subType, contentName, owner);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

