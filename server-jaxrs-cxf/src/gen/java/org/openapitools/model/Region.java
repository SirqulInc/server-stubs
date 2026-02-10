package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.model.Account;
import org.openapitools.model.Category;
import org.openapitools.model.Filter;
import org.openapitools.model.GeoBox;
import org.openapitools.model.PostalCode;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Region  {
  
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

  private Account owner;

  @ApiModelProperty(value = "")

  private String shortName;

  @ApiModelProperty(value = "")

  private String fullName;

  @ApiModelProperty(value = "")

  @Valid

  private GeoBox bounds;

  @ApiModelProperty(value = "")

  private Date start;

  @ApiModelProperty(value = "")

  private Date end;

  @ApiModelProperty(value = "")

  private String polygon;

  @ApiModelProperty(value = "")

  private String metaData;

  @ApiModelProperty(value = "")

  @Valid

  private Set<@Valid Region> children = new LinkedHashSet<>();

  @ApiModelProperty(value = "")

  @Valid

  private Set<@Valid Region> parents = new LinkedHashSet<>();

  @ApiModelProperty(value = "")

  @Valid

  private Set<@Valid PostalCode> postalCodes = new LinkedHashSet<>();

public enum RegionClassEnum {

NATIONAL(String.valueOf("NATIONAL")), STATE(String.valueOf("STATE")), COUNTY(String.valueOf("COUNTY")), METRO_AREA(String.valueOf("METRO_AREA")), CITY(String.valueOf("CITY")), NEIGHBORHOOD(String.valueOf("NEIGHBORHOOD")), TERRITORY(String.valueOf("TERRITORY")), CUSTOM(String.valueOf("CUSTOM")), ZONE(String.valueOf("ZONE"));


    private String value;

    RegionClassEnum (String v) {
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
    public static RegionClassEnum fromValue(String value) {
        for (RegionClassEnum b : RegionClassEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private RegionClassEnum regionClass;

  @ApiModelProperty(value = "")

  private Boolean root;

  @ApiModelProperty(value = "")

  private Boolean webActive;

  @ApiModelProperty(value = "")

  private Boolean adminActive;

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

  private List<@Valid Category> categories = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Filter> filters = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Double truncatedLatitude;

  @ApiModelProperty(value = "")

  private Double truncatedLongitude;

  @ApiModelProperty(value = "")

  private Integer versionCode;

  @ApiModelProperty(value = "")

  private String display;

  @ApiModelProperty(value = "")

  private String contentName;
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

  public Region id(Long id) {
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

  public Region active(Boolean active) {
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

  public Region valid(Boolean valid) {
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

  public Region latitude(Double latitude) {
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

  public Region longitude(Double longitude) {
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

  public Region locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
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

  public Region owner(Account owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get shortName
   * @return shortName
  **/
  @JsonProperty("shortName")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public Region shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

 /**
   * Get fullName
   * @return fullName
  **/
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Region fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

 /**
   * Get bounds
   * @return bounds
  **/
  @JsonProperty("bounds")
  public GeoBox getBounds() {
    return bounds;
  }

  public void setBounds(GeoBox bounds) {
    this.bounds = bounds;
  }

  public Region bounds(GeoBox bounds) {
    this.bounds = bounds;
    return this;
  }

 /**
   * Get start
   * @return start
  **/
  @JsonProperty("start")
  public Date getStart() {
    return start;
  }

  public void setStart(Date start) {
    this.start = start;
  }

  public Region start(Date start) {
    this.start = start;
    return this;
  }

 /**
   * Get end
   * @return end
  **/
  @JsonProperty("end")
  public Date getEnd() {
    return end;
  }

  public void setEnd(Date end) {
    this.end = end;
  }

  public Region end(Date end) {
    this.end = end;
    return this;
  }

 /**
   * Get polygon
   * @return polygon
  **/
  @JsonProperty("polygon")
  public String getPolygon() {
    return polygon;
  }

  public void setPolygon(String polygon) {
    this.polygon = polygon;
  }

  public Region polygon(String polygon) {
    this.polygon = polygon;
    return this;
  }

 /**
   * Get metaData
   * @return metaData
  **/
  @JsonProperty("metaData")
  public String getMetaData() {
    return metaData;
  }

  public void setMetaData(String metaData) {
    this.metaData = metaData;
  }

  public Region metaData(String metaData) {
    this.metaData = metaData;
    return this;
  }

 /**
   * Get children
   * @return children
  **/
  @JsonProperty("children")
  public Set<@Valid Region> getChildren() {
    return children;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setChildren(Set<@Valid Region> children) {
    this.children = children;
  }

  public Region children(Set<@Valid Region> children) {
    this.children = children;
    return this;
  }

  public Region addChildrenItem(Region childrenItem) {
    this.children.add(childrenItem);
    return this;
  }

 /**
   * Get parents
   * @return parents
  **/
  @JsonProperty("parents")
  public Set<@Valid Region> getParents() {
    return parents;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setParents(Set<@Valid Region> parents) {
    this.parents = parents;
  }

  public Region parents(Set<@Valid Region> parents) {
    this.parents = parents;
    return this;
  }

  public Region addParentsItem(Region parentsItem) {
    this.parents.add(parentsItem);
    return this;
  }

 /**
   * Get postalCodes
   * @return postalCodes
  **/
  @JsonProperty("postalCodes")
  public Set<@Valid PostalCode> getPostalCodes() {
    return postalCodes;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setPostalCodes(Set<@Valid PostalCode> postalCodes) {
    this.postalCodes = postalCodes;
  }

  public Region postalCodes(Set<@Valid PostalCode> postalCodes) {
    this.postalCodes = postalCodes;
    return this;
  }

  public Region addPostalCodesItem(PostalCode postalCodesItem) {
    this.postalCodes.add(postalCodesItem);
    return this;
  }

 /**
   * Get regionClass
   * @return regionClass
  **/
  @JsonProperty("regionClass")
  public String getRegionClass() {
    if (regionClass == null) {
      return null;
    }
    return regionClass.value();
  }

  public void setRegionClass(RegionClassEnum regionClass) {
    this.regionClass = regionClass;
  }

  public Region regionClass(RegionClassEnum regionClass) {
    this.regionClass = regionClass;
    return this;
  }

 /**
   * Get root
   * @return root
  **/
  @JsonProperty("root")
  public Boolean getRoot() {
    return root;
  }

  public void setRoot(Boolean root) {
    this.root = root;
  }

  public Region root(Boolean root) {
    this.root = root;
    return this;
  }

 /**
   * Get webActive
   * @return webActive
  **/
  @JsonProperty("webActive")
  public Boolean getWebActive() {
    return webActive;
  }

  public void setWebActive(Boolean webActive) {
    this.webActive = webActive;
  }

  public Region webActive(Boolean webActive) {
    this.webActive = webActive;
    return this;
  }

 /**
   * Get adminActive
   * @return adminActive
  **/
  @JsonProperty("adminActive")
  public Boolean getAdminActive() {
    return adminActive;
  }

  public void setAdminActive(Boolean adminActive) {
    this.adminActive = adminActive;
  }

  public Region adminActive(Boolean adminActive) {
    this.adminActive = adminActive;
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

  public Region visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
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

  public Region categories(List<@Valid Category> categories) {
    this.categories = categories;
    return this;
  }

  public Region addCategoriesItem(Category categoriesItem) {
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

  public Region filters(List<@Valid Filter> filters) {
    this.filters = filters;
    return this;
  }

  public Region addFiltersItem(Filter filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

 /**
   * Get truncatedLatitude
   * @return truncatedLatitude
  **/
  @JsonProperty("truncatedLatitude")
  public Double getTruncatedLatitude() {
    return truncatedLatitude;
  }

  public void setTruncatedLatitude(Double truncatedLatitude) {
    this.truncatedLatitude = truncatedLatitude;
  }

  public Region truncatedLatitude(Double truncatedLatitude) {
    this.truncatedLatitude = truncatedLatitude;
    return this;
  }

 /**
   * Get truncatedLongitude
   * @return truncatedLongitude
  **/
  @JsonProperty("truncatedLongitude")
  public Double getTruncatedLongitude() {
    return truncatedLongitude;
  }

  public void setTruncatedLongitude(Double truncatedLongitude) {
    this.truncatedLongitude = truncatedLongitude;
  }

  public Region truncatedLongitude(Double truncatedLongitude) {
    this.truncatedLongitude = truncatedLongitude;
    return this;
  }

 /**
   * Get versionCode
   * @return versionCode
  **/
  @JsonProperty("versionCode")
  public Integer getVersionCode() {
    return versionCode;
  }

  public void setVersionCode(Integer versionCode) {
    this.versionCode = versionCode;
  }

  public Region versionCode(Integer versionCode) {
    this.versionCode = versionCode;
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

  public Region display(String display) {
    this.display = display;
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

  public Region contentName(String contentName) {
    this.contentName = contentName;
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
    Region region = (Region) o;
    return Objects.equals(this.id, region.id) &&
        Objects.equals(this.active, region.active) &&
        Objects.equals(this.valid, region.valid) &&
        Objects.equals(this.latitude, region.latitude) &&
        Objects.equals(this.longitude, region.longitude) &&
        Objects.equals(this.locationDescription, region.locationDescription) &&
        Objects.equals(this.owner, region.owner) &&
        Objects.equals(this.shortName, region.shortName) &&
        Objects.equals(this.fullName, region.fullName) &&
        Objects.equals(this.bounds, region.bounds) &&
        Objects.equals(this.start, region.start) &&
        Objects.equals(this.end, region.end) &&
        Objects.equals(this.polygon, region.polygon) &&
        Objects.equals(this.metaData, region.metaData) &&
        Objects.equals(this.children, region.children) &&
        Objects.equals(this.parents, region.parents) &&
        Objects.equals(this.postalCodes, region.postalCodes) &&
        Objects.equals(this.regionClass, region.regionClass) &&
        Objects.equals(this.root, region.root) &&
        Objects.equals(this.webActive, region.webActive) &&
        Objects.equals(this.adminActive, region.adminActive) &&
        Objects.equals(this.visibility, region.visibility) &&
        Objects.equals(this.categories, region.categories) &&
        Objects.equals(this.filters, region.filters) &&
        Objects.equals(this.truncatedLatitude, region.truncatedLatitude) &&
        Objects.equals(this.truncatedLongitude, region.truncatedLongitude) &&
        Objects.equals(this.versionCode, region.versionCode) &&
        Objects.equals(this.display, region.display) &&
        Objects.equals(this.contentName, region.contentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, latitude, longitude, locationDescription, owner, shortName, fullName, bounds, start, end, polygon, metaData, children, parents, postalCodes, regionClass, root, webActive, adminActive, visibility, categories, filters, truncatedLatitude, truncatedLongitude, versionCode, display, contentName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Region {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    bounds: ").append(toIndentedString(bounds)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    polygon: ").append(toIndentedString(polygon)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
    sb.append("    postalCodes: ").append(toIndentedString(postalCodes)).append("\n");
    sb.append("    regionClass: ").append(toIndentedString(regionClass)).append("\n");
    sb.append("    root: ").append(toIndentedString(root)).append("\n");
    sb.append("    webActive: ").append(toIndentedString(webActive)).append("\n");
    sb.append("    adminActive: ").append(toIndentedString(adminActive)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    truncatedLatitude: ").append(toIndentedString(truncatedLatitude)).append("\n");
    sb.append("    truncatedLongitude: ").append(toIndentedString(truncatedLongitude)).append("\n");
    sb.append("    versionCode: ").append(toIndentedString(versionCode)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
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

