package apimodels;

import apimodels.Account;
import apimodels.Category;
import apimodels.Filter;
import apimodels.GeoBox;
import apimodels.PostalCode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Region
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Region   {
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

  @JsonProperty("owner")
  @Valid

  private Account owner;

  @JsonProperty("shortName")
  
  private String shortName;

  @JsonProperty("fullName")
  
  private String fullName;

  @JsonProperty("bounds")
  @Valid

  private GeoBox bounds;

  @JsonProperty("start")
  @Valid

  private OffsetDateTime start;

  @JsonProperty("end")
  @Valid

  private OffsetDateTime end;

  @JsonProperty("polygon")
  
  private String polygon;

  @JsonProperty("metaData")
  
  private String metaData;

  @JsonProperty("children")
  @Valid

  private Set<@Valid Region> children = null;

  @JsonProperty("parents")
  @Valid

  private Set<@Valid Region> parents = null;

  @JsonProperty("postalCodes")
  @Valid

  private Set<@Valid PostalCode> postalCodes = null;

  /**
   * Gets or Sets regionClass
   */
  public enum RegionClassEnum {
    NATIONAL("NATIONAL"),
    
    STATE("STATE"),
    
    COUNTY("COUNTY"),
    
    METRO_AREA("METRO_AREA"),
    
    CITY("CITY"),
    
    NEIGHBORHOOD("NEIGHBORHOOD"),
    
    TERRITORY("TERRITORY"),
    
    CUSTOM("CUSTOM"),
    
    ZONE("ZONE");

    private final String value;

    RegionClassEnum(String value) {
      this.value = value;
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

  @JsonProperty("regionClass")
  
  private RegionClassEnum regionClass;

  @JsonProperty("root")
  
  private Boolean root;

  @JsonProperty("webActive")
  
  private Boolean webActive;

  @JsonProperty("adminActive")
  
  private Boolean adminActive;

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

  @JsonProperty("categories")
  @Valid

  private List<@Valid Category> categories = null;

  @JsonProperty("filters")
  @Valid

  private List<@Valid Filter> filters = null;

  @JsonProperty("truncatedLatitude")
  
  private Double truncatedLatitude;

  @JsonProperty("truncatedLongitude")
  
  private Double truncatedLongitude;

  @JsonProperty("versionCode")
  
  private Integer versionCode;

  @JsonProperty("display")
  
  private String display;

  @JsonProperty("contentName")
  
  private String contentName;

  public Region id(Long id) {
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

  public Region active(Boolean active) {
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

  public Region valid(Boolean valid) {
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

  public Region latitude(Double latitude) {
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

  public Region longitude(Double longitude) {
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

  public Region locationDescription(String locationDescription) {
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

  public Region owner(Account owner) {
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

  public Region shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public Region fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Region bounds(GeoBox bounds) {
    this.bounds = bounds;
    return this;
  }

   /**
   * Get bounds
   * @return bounds
  **/
  public GeoBox getBounds() {
    return bounds;
  }

  public void setBounds(GeoBox bounds) {
    this.bounds = bounds;
  }

  public Region start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public Region end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  public Region polygon(String polygon) {
    this.polygon = polygon;
    return this;
  }

   /**
   * Get polygon
   * @return polygon
  **/
  public String getPolygon() {
    return polygon;
  }

  public void setPolygon(String polygon) {
    this.polygon = polygon;
  }

  public Region metaData(String metaData) {
    this.metaData = metaData;
    return this;
  }

   /**
   * Get metaData
   * @return metaData
  **/
  public String getMetaData() {
    return metaData;
  }

  public void setMetaData(String metaData) {
    this.metaData = metaData;
  }

  public Region children(Set<@Valid Region> children) {
    this.children = children;
    return this;
  }

  public Region addChildrenItem(Region childrenItem) {
    if (this.children == null) {
      this.children = new LinkedHashSet<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  public Set<@Valid Region> getChildren() {
    return children;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setChildren(Set<@Valid Region> children) {
    this.children = children;
  }

  public Region parents(Set<@Valid Region> parents) {
    this.parents = parents;
    return this;
  }

  public Region addParentsItem(Region parentsItem) {
    if (this.parents == null) {
      this.parents = new LinkedHashSet<>();
    }
    this.parents.add(parentsItem);
    return this;
  }

   /**
   * Get parents
   * @return parents
  **/
  public Set<@Valid Region> getParents() {
    return parents;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setParents(Set<@Valid Region> parents) {
    this.parents = parents;
  }

  public Region postalCodes(Set<@Valid PostalCode> postalCodes) {
    this.postalCodes = postalCodes;
    return this;
  }

  public Region addPostalCodesItem(PostalCode postalCodesItem) {
    if (this.postalCodes == null) {
      this.postalCodes = new LinkedHashSet<>();
    }
    this.postalCodes.add(postalCodesItem);
    return this;
  }

   /**
   * Get postalCodes
   * @return postalCodes
  **/
  public Set<@Valid PostalCode> getPostalCodes() {
    return postalCodes;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setPostalCodes(Set<@Valid PostalCode> postalCodes) {
    this.postalCodes = postalCodes;
  }

  public Region regionClass(RegionClassEnum regionClass) {
    this.regionClass = regionClass;
    return this;
  }

   /**
   * Get regionClass
   * @return regionClass
  **/
  public RegionClassEnum getRegionClass() {
    return regionClass;
  }

  public void setRegionClass(RegionClassEnum regionClass) {
    this.regionClass = regionClass;
  }

  public Region root(Boolean root) {
    this.root = root;
    return this;
  }

   /**
   * Get root
   * @return root
  **/
  public Boolean getRoot() {
    return root;
  }

  public void setRoot(Boolean root) {
    this.root = root;
  }

  public Region webActive(Boolean webActive) {
    this.webActive = webActive;
    return this;
  }

   /**
   * Get webActive
   * @return webActive
  **/
  public Boolean getWebActive() {
    return webActive;
  }

  public void setWebActive(Boolean webActive) {
    this.webActive = webActive;
  }

  public Region adminActive(Boolean adminActive) {
    this.adminActive = adminActive;
    return this;
  }

   /**
   * Get adminActive
   * @return adminActive
  **/
  public Boolean getAdminActive() {
    return adminActive;
  }

  public void setAdminActive(Boolean adminActive) {
    this.adminActive = adminActive;
  }

  public Region visibility(VisibilityEnum visibility) {
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

  public Region categories(List<@Valid Category> categories) {
    this.categories = categories;
    return this;
  }

  public Region addCategoriesItem(Category categoriesItem) {
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

  public Region filters(List<@Valid Filter> filters) {
    this.filters = filters;
    return this;
  }

  public Region addFiltersItem(Filter filtersItem) {
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

  public Region truncatedLatitude(Double truncatedLatitude) {
    this.truncatedLatitude = truncatedLatitude;
    return this;
  }

   /**
   * Get truncatedLatitude
   * @return truncatedLatitude
  **/
  public Double getTruncatedLatitude() {
    return truncatedLatitude;
  }

  public void setTruncatedLatitude(Double truncatedLatitude) {
    this.truncatedLatitude = truncatedLatitude;
  }

  public Region truncatedLongitude(Double truncatedLongitude) {
    this.truncatedLongitude = truncatedLongitude;
    return this;
  }

   /**
   * Get truncatedLongitude
   * @return truncatedLongitude
  **/
  public Double getTruncatedLongitude() {
    return truncatedLongitude;
  }

  public void setTruncatedLongitude(Double truncatedLongitude) {
    this.truncatedLongitude = truncatedLongitude;
  }

  public Region versionCode(Integer versionCode) {
    this.versionCode = versionCode;
    return this;
  }

   /**
   * Get versionCode
   * @return versionCode
  **/
  public Integer getVersionCode() {
    return versionCode;
  }

  public void setVersionCode(Integer versionCode) {
    this.versionCode = versionCode;
  }

  public Region display(String display) {
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

  public Region contentName(String contentName) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Region region = (Region) o;
    return Objects.equals(id, region.id) &&
        Objects.equals(active, region.active) &&
        Objects.equals(valid, region.valid) &&
        Objects.equals(latitude, region.latitude) &&
        Objects.equals(longitude, region.longitude) &&
        Objects.equals(locationDescription, region.locationDescription) &&
        Objects.equals(owner, region.owner) &&
        Objects.equals(shortName, region.shortName) &&
        Objects.equals(fullName, region.fullName) &&
        Objects.equals(bounds, region.bounds) &&
        Objects.equals(start, region.start) &&
        Objects.equals(end, region.end) &&
        Objects.equals(polygon, region.polygon) &&
        Objects.equals(metaData, region.metaData) &&
        Objects.equals(children, region.children) &&
        Objects.equals(parents, region.parents) &&
        Objects.equals(postalCodes, region.postalCodes) &&
        Objects.equals(regionClass, region.regionClass) &&
        Objects.equals(root, region.root) &&
        Objects.equals(webActive, region.webActive) &&
        Objects.equals(adminActive, region.adminActive) &&
        Objects.equals(visibility, region.visibility) &&
        Objects.equals(categories, region.categories) &&
        Objects.equals(filters, region.filters) &&
        Objects.equals(truncatedLatitude, region.truncatedLatitude) &&
        Objects.equals(truncatedLongitude, region.truncatedLongitude) &&
        Objects.equals(versionCode, region.versionCode) &&
        Objects.equals(display, region.display) &&
        Objects.equals(contentName, region.contentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, latitude, longitude, locationDescription, owner, shortName, fullName, bounds, start, end, polygon, metaData, children, parents, postalCodes, regionClass, root, webActive, adminActive, visibility, categories, filters, truncatedLatitude, truncatedLongitude, versionCode, display, contentName);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

