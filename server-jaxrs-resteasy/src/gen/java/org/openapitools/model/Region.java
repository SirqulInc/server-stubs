package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Region   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Double latitude;
  private Double longitude;
  private String locationDescription;
  private Account owner;
  private String shortName;
  private String fullName;
  private GeoBox bounds;
  private Date start;
  private Date end;
  private String polygon;
  private String metaData;
  private Set<@Valid Region> children = new LinkedHashSet<>();
  private Set<@Valid Region> parents = new LinkedHashSet<>();
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
    private String value;

    RegionClassEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private RegionClassEnum regionClass;
  private Boolean root;
  private Boolean webActive;
  private Boolean adminActive;

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
  private List<@Valid Category> categories = new ArrayList<>();
  private List<@Valid Filter> filters = new ArrayList<>();
  private Double truncatedLatitude;
  private Double truncatedLongitude;
  private Integer versionCode;
  private String display;
  private String contentName;

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
  @JsonProperty("owner")
  @Valid
  public Account getOwner() {
    return owner;
  }
  public void setOwner(Account owner) {
    this.owner = owner;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shortName")
  public String getShortName() {
    return shortName;
  }
  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bounds")
  @Valid
  public GeoBox getBounds() {
    return bounds;
  }
  public void setBounds(GeoBox bounds) {
    this.bounds = bounds;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("start")
  public Date getStart() {
    return start;
  }
  public void setStart(Date start) {
    this.start = start;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("end")
  public Date getEnd() {
    return end;
  }
  public void setEnd(Date end) {
    this.end = end;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("polygon")
  public String getPolygon() {
    return polygon;
  }
  public void setPolygon(String polygon) {
    this.polygon = polygon;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("metaData")
  public String getMetaData() {
    return metaData;
  }
  public void setMetaData(String metaData) {
    this.metaData = metaData;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("children")
  @Valid
  public Set<@Valid Region> getChildren() {
    return children;
  }
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setChildren(Set<@Valid Region> children) {
    this.children = children;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("parents")
  @Valid
  public Set<@Valid Region> getParents() {
    return parents;
  }
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setParents(Set<@Valid Region> parents) {
    this.parents = parents;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("postalCodes")
  @Valid
  public Set<@Valid PostalCode> getPostalCodes() {
    return postalCodes;
  }
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setPostalCodes(Set<@Valid PostalCode> postalCodes) {
    this.postalCodes = postalCodes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("regionClass")
  public RegionClassEnum getRegionClass() {
    return regionClass;
  }
  public void setRegionClass(RegionClassEnum regionClass) {
    this.regionClass = regionClass;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("root")
  public Boolean getRoot() {
    return root;
  }
  public void setRoot(Boolean root) {
    this.root = root;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("webActive")
  public Boolean getWebActive() {
    return webActive;
  }
  public void setWebActive(Boolean webActive) {
    this.webActive = webActive;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("adminActive")
  public Boolean getAdminActive() {
    return adminActive;
  }
  public void setAdminActive(Boolean adminActive) {
    this.adminActive = adminActive;
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
  @JsonProperty("filters")
  @Valid
  public List<@Valid Filter> getFilters() {
    return filters;
  }
  public void setFilters(List<@Valid Filter> filters) {
    this.filters = filters;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("truncatedLatitude")
  public Double getTruncatedLatitude() {
    return truncatedLatitude;
  }
  public void setTruncatedLatitude(Double truncatedLatitude) {
    this.truncatedLatitude = truncatedLatitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("truncatedLongitude")
  public Double getTruncatedLongitude() {
    return truncatedLongitude;
  }
  public void setTruncatedLongitude(Double truncatedLongitude) {
    this.truncatedLongitude = truncatedLongitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("versionCode")
  public Integer getVersionCode() {
    return versionCode;
  }
  public void setVersionCode(Integer versionCode) {
    this.versionCode = versionCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }
  public void setDisplay(String display) {
    this.display = display;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

