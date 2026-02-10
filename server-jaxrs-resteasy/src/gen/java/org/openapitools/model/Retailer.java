package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Retailer   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Double latitude;
  private Double longitude;
  private String locationDescription;
  private String name;
  private Account responsible;
  private Account manager;
  private String detailsHeader;
  private String detailsBody;
  private String detailsLineLeft1;
  private String detailsLineLeft2;
  private String detailsLineRight1;
  private String metaDescription;
  private String directions;
  private String hours;
  private String homePhone;
  private String cellPhone;
  private CellCarrier cellCarrier;
  private String businessPhone;
  private String businessPhoneExt;
  private String faxNumber;
  private String timeZone;
  private String utcOffset;
  private String code501c3;
  private String emailAddress;
  private Address address;
  private String web;
  private Boolean featured;
  private Boolean listed;
  private List<@Valid Category> categories = new ArrayList<>();
  private Territory territory;
  private List<@Valid RetailerLocation> locations = new ArrayList<>();
  private Long yipitId;
  private String facebookUrl;
  private String twitterUrl;

  /**
   * Gets or Sets visibility
   */
  public enum VisibilityEnum {
    PUBLIC("PUBLIC"),

        PRIVATE("PRIVATE"),

        FRIENDS("FRIENDS");
    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private VisibilityEnum visibility;
  private List<@Valid Note> notes = new ArrayList<>();
  private Long noteCount;
  private String appKey;
  private String categoryTree;
  private String filterTree;
  private Long billableId;
  private String subType;
  private String contentName;
  private Account owner;

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
  @JsonProperty("responsible")
  @Valid
  public Account getResponsible() {
    return responsible;
  }
  public void setResponsible(Account responsible) {
    this.responsible = responsible;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("manager")
  @Valid
  public Account getManager() {
    return manager;
  }
  public void setManager(Account manager) {
    this.manager = manager;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("detailsHeader")
  public String getDetailsHeader() {
    return detailsHeader;
  }
  public void setDetailsHeader(String detailsHeader) {
    this.detailsHeader = detailsHeader;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("detailsBody")
  public String getDetailsBody() {
    return detailsBody;
  }
  public void setDetailsBody(String detailsBody) {
    this.detailsBody = detailsBody;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("detailsLineLeft1")
  public String getDetailsLineLeft1() {
    return detailsLineLeft1;
  }
  public void setDetailsLineLeft1(String detailsLineLeft1) {
    this.detailsLineLeft1 = detailsLineLeft1;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("detailsLineLeft2")
  public String getDetailsLineLeft2() {
    return detailsLineLeft2;
  }
  public void setDetailsLineLeft2(String detailsLineLeft2) {
    this.detailsLineLeft2 = detailsLineLeft2;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("detailsLineRight1")
  public String getDetailsLineRight1() {
    return detailsLineRight1;
  }
  public void setDetailsLineRight1(String detailsLineRight1) {
    this.detailsLineRight1 = detailsLineRight1;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("metaDescription")
  public String getMetaDescription() {
    return metaDescription;
  }
  public void setMetaDescription(String metaDescription) {
    this.metaDescription = metaDescription;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("directions")
  public String getDirections() {
    return directions;
  }
  public void setDirections(String directions) {
    this.directions = directions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hours")
  public String getHours() {
    return hours;
  }
  public void setHours(String hours) {
    this.hours = hours;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("homePhone")
  public String getHomePhone() {
    return homePhone;
  }
  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cellPhone")
  public String getCellPhone() {
    return cellPhone;
  }
  public void setCellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cellCarrier")
  @Valid
  public CellCarrier getCellCarrier() {
    return cellCarrier;
  }
  public void setCellCarrier(CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("businessPhone")
  public String getBusinessPhone() {
    return businessPhone;
  }
  public void setBusinessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("businessPhoneExt")
  public String getBusinessPhoneExt() {
    return businessPhoneExt;
  }
  public void setBusinessPhoneExt(String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("faxNumber")
  public String getFaxNumber() {
    return faxNumber;
  }
  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("utcOffset")
  public String getUtcOffset() {
    return utcOffset;
  }
  public void setUtcOffset(String utcOffset) {
    this.utcOffset = utcOffset;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("code501c3")
  public String getCode501c3() {
    return code501c3;
  }
  public void setCode501c3(String code501c3) {
    this.code501c3 = code501c3;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("address")
  @Valid
  public Address getAddress() {
    return address;
  }
  public void setAddress(Address address) {
    this.address = address;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("web")
  public String getWeb() {
    return web;
  }
  public void setWeb(String web) {
    this.web = web;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("featured")
  public Boolean getFeatured() {
    return featured;
  }
  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("listed")
  public Boolean getListed() {
    return listed;
  }
  public void setListed(Boolean listed) {
    this.listed = listed;
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
  @JsonProperty("territory")
  @Valid
  public Territory getTerritory() {
    return territory;
  }
  public void setTerritory(Territory territory) {
    this.territory = territory;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locations")
  @Valid
  public List<@Valid RetailerLocation> getLocations() {
    return locations;
  }
  public void setLocations(List<@Valid RetailerLocation> locations) {
    this.locations = locations;
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
  @JsonProperty("facebookUrl")
  public String getFacebookUrl() {
    return facebookUrl;
  }
  public void setFacebookUrl(String facebookUrl) {
    this.facebookUrl = facebookUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("twitterUrl")
  public String getTwitterUrl() {
    return twitterUrl;
  }
  public void setTwitterUrl(String twitterUrl) {
    this.twitterUrl = twitterUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("visibility")
  public VisibilityEnum getVisibility() {
    return visibility;
  }
  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

