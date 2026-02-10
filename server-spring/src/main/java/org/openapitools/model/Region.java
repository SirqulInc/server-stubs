package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.model.Account;
import org.openapitools.model.Category;
import org.openapitools.model.Filter;
import org.openapitools.model.GeoBox;
import org.openapitools.model.PostalCode;
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
 * Region
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Region {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable String locationDescription;

  private @Nullable Account owner;

  private @Nullable String shortName;

  private @Nullable String fullName;

  private @Nullable GeoBox bounds;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime start;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime end;

  private @Nullable String polygon;

  private @Nullable String metaData;

  @Valid
  private Set<@Valid Region> children = new LinkedHashSet<>();

  @Valid
  private Set<@Valid Region> parents = new LinkedHashSet<>();

  @Valid
  private Set<@Valid PostalCode> postalCodes = new LinkedHashSet<>();

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable RegionClassEnum regionClass;

  private @Nullable Boolean root;

  private @Nullable Boolean webActive;

  private @Nullable Boolean adminActive;

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
  private List<@Valid Category> categories = new ArrayList<>();

  @Valid
  private List<@Valid Filter> filters = new ArrayList<>();

  private @Nullable Double truncatedLatitude;

  private @Nullable Double truncatedLongitude;

  private @Nullable Integer versionCode;

  private @Nullable String display;

  private @Nullable String contentName;

  public Region id(@Nullable Long id) {
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

  public Region active(@Nullable Boolean active) {
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

  public Region valid(@Nullable Boolean valid) {
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

  public Region latitude(@Nullable Double latitude) {
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

  public Region longitude(@Nullable Double longitude) {
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

  public Region locationDescription(@Nullable String locationDescription) {
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

  public Region owner(@Nullable Account owner) {
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

  public Region shortName(@Nullable String shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * Get shortName
   * @return shortName
   */
  
  @Schema(name = "shortName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shortName")
  public @Nullable String getShortName() {
    return shortName;
  }

  public void setShortName(@Nullable String shortName) {
    this.shortName = shortName;
  }

  public Region fullName(@Nullable String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Get fullName
   * @return fullName
   */
  
  @Schema(name = "fullName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fullName")
  public @Nullable String getFullName() {
    return fullName;
  }

  public void setFullName(@Nullable String fullName) {
    this.fullName = fullName;
  }

  public Region bounds(@Nullable GeoBox bounds) {
    this.bounds = bounds;
    return this;
  }

  /**
   * Get bounds
   * @return bounds
   */
  @Valid 
  @Schema(name = "bounds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bounds")
  public @Nullable GeoBox getBounds() {
    return bounds;
  }

  public void setBounds(@Nullable GeoBox bounds) {
    this.bounds = bounds;
  }

  public Region start(@Nullable OffsetDateTime start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
   */
  @Valid 
  @Schema(name = "start", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start")
  public @Nullable OffsetDateTime getStart() {
    return start;
  }

  public void setStart(@Nullable OffsetDateTime start) {
    this.start = start;
  }

  public Region end(@Nullable OffsetDateTime end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
   */
  @Valid 
  @Schema(name = "end", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end")
  public @Nullable OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(@Nullable OffsetDateTime end) {
    this.end = end;
  }

  public Region polygon(@Nullable String polygon) {
    this.polygon = polygon;
    return this;
  }

  /**
   * Get polygon
   * @return polygon
   */
  
  @Schema(name = "polygon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("polygon")
  public @Nullable String getPolygon() {
    return polygon;
  }

  public void setPolygon(@Nullable String polygon) {
    this.polygon = polygon;
  }

  public Region metaData(@Nullable String metaData) {
    this.metaData = metaData;
    return this;
  }

  /**
   * Get metaData
   * @return metaData
   */
  
  @Schema(name = "metaData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metaData")
  public @Nullable String getMetaData() {
    return metaData;
  }

  public void setMetaData(@Nullable String metaData) {
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
   */
  @Valid 
  @Schema(name = "children", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("children")
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
   */
  @Valid 
  @Schema(name = "parents", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parents")
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
   */
  @Valid 
  @Schema(name = "postalCodes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postalCodes")
  public Set<@Valid PostalCode> getPostalCodes() {
    return postalCodes;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setPostalCodes(Set<@Valid PostalCode> postalCodes) {
    this.postalCodes = postalCodes;
  }

  public Region regionClass(@Nullable RegionClassEnum regionClass) {
    this.regionClass = regionClass;
    return this;
  }

  /**
   * Get regionClass
   * @return regionClass
   */
  
  @Schema(name = "regionClass", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regionClass")
  public @Nullable RegionClassEnum getRegionClass() {
    return regionClass;
  }

  public void setRegionClass(@Nullable RegionClassEnum regionClass) {
    this.regionClass = regionClass;
  }

  public Region root(@Nullable Boolean root) {
    this.root = root;
    return this;
  }

  /**
   * Get root
   * @return root
   */
  
  @Schema(name = "root", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("root")
  public @Nullable Boolean getRoot() {
    return root;
  }

  public void setRoot(@Nullable Boolean root) {
    this.root = root;
  }

  public Region webActive(@Nullable Boolean webActive) {
    this.webActive = webActive;
    return this;
  }

  /**
   * Get webActive
   * @return webActive
   */
  
  @Schema(name = "webActive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("webActive")
  public @Nullable Boolean getWebActive() {
    return webActive;
  }

  public void setWebActive(@Nullable Boolean webActive) {
    this.webActive = webActive;
  }

  public Region adminActive(@Nullable Boolean adminActive) {
    this.adminActive = adminActive;
    return this;
  }

  /**
   * Get adminActive
   * @return adminActive
   */
  
  @Schema(name = "adminActive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adminActive")
  public @Nullable Boolean getAdminActive() {
    return adminActive;
  }

  public void setAdminActive(@Nullable Boolean adminActive) {
    this.adminActive = adminActive;
  }

  public Region visibility(@Nullable VisibilityEnum visibility) {
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

  public Region truncatedLatitude(@Nullable Double truncatedLatitude) {
    this.truncatedLatitude = truncatedLatitude;
    return this;
  }

  /**
   * Get truncatedLatitude
   * @return truncatedLatitude
   */
  
  @Schema(name = "truncatedLatitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("truncatedLatitude")
  public @Nullable Double getTruncatedLatitude() {
    return truncatedLatitude;
  }

  public void setTruncatedLatitude(@Nullable Double truncatedLatitude) {
    this.truncatedLatitude = truncatedLatitude;
  }

  public Region truncatedLongitude(@Nullable Double truncatedLongitude) {
    this.truncatedLongitude = truncatedLongitude;
    return this;
  }

  /**
   * Get truncatedLongitude
   * @return truncatedLongitude
   */
  
  @Schema(name = "truncatedLongitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("truncatedLongitude")
  public @Nullable Double getTruncatedLongitude() {
    return truncatedLongitude;
  }

  public void setTruncatedLongitude(@Nullable Double truncatedLongitude) {
    this.truncatedLongitude = truncatedLongitude;
  }

  public Region versionCode(@Nullable Integer versionCode) {
    this.versionCode = versionCode;
    return this;
  }

  /**
   * Get versionCode
   * @return versionCode
   */
  
  @Schema(name = "versionCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionCode")
  public @Nullable Integer getVersionCode() {
    return versionCode;
  }

  public void setVersionCode(@Nullable Integer versionCode) {
    this.versionCode = versionCode;
  }

  public Region display(@Nullable String display) {
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

  public Region contentName(@Nullable String contentName) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

