package apimodels;

import apimodels.PostalCodeResponse;
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
 * RegionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RegionResponse   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("shortName")
  
  private String shortName;

  @JsonProperty("fullName")
  
  private String fullName;

  @JsonProperty("parent")
  @Valid

  private RegionResponse parent;

  @JsonProperty("children")
  @Valid

  private List<@Valid RegionResponse> children = null;

  @JsonProperty("postalCodes")
  @Valid

  private List<@Valid PostalCodeResponse> postalCodes = null;

  @JsonProperty("latitude")
  
  private Double latitude;

  @JsonProperty("longitude")
  
  private Double longitude;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("root")
  
  private Boolean root;

  @JsonProperty("regionClass")
  
  private String regionClass;

  @JsonProperty("start")
  
  private Long start;

  @JsonProperty("end")
  
  private Long end;

  @JsonProperty("polygon")
  
  private String polygon;

  @JsonProperty("metaData")
  
  private String metaData;

  @JsonProperty("distance")
  
  private Double distance;

  @JsonProperty("versionCode")
  
  private Integer versionCode;

  public RegionResponse id(Long id) {
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

  public RegionResponse shortName(String shortName) {
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

  public RegionResponse fullName(String fullName) {
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

  public RegionResponse parent(RegionResponse parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  public RegionResponse getParent() {
    return parent;
  }

  public void setParent(RegionResponse parent) {
    this.parent = parent;
  }

  public RegionResponse children(List<@Valid RegionResponse> children) {
    this.children = children;
    return this;
  }

  public RegionResponse addChildrenItem(RegionResponse childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  public List<@Valid RegionResponse> getChildren() {
    return children;
  }

  public void setChildren(List<@Valid RegionResponse> children) {
    this.children = children;
  }

  public RegionResponse postalCodes(List<@Valid PostalCodeResponse> postalCodes) {
    this.postalCodes = postalCodes;
    return this;
  }

  public RegionResponse addPostalCodesItem(PostalCodeResponse postalCodesItem) {
    if (this.postalCodes == null) {
      this.postalCodes = new ArrayList<>();
    }
    this.postalCodes.add(postalCodesItem);
    return this;
  }

   /**
   * Get postalCodes
   * @return postalCodes
  **/
  public List<@Valid PostalCodeResponse> getPostalCodes() {
    return postalCodes;
  }

  public void setPostalCodes(List<@Valid PostalCodeResponse> postalCodes) {
    this.postalCodes = postalCodes;
  }

  public RegionResponse latitude(Double latitude) {
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

  public RegionResponse longitude(Double longitude) {
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

  public RegionResponse active(Boolean active) {
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

  public RegionResponse root(Boolean root) {
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

  public RegionResponse regionClass(String regionClass) {
    this.regionClass = regionClass;
    return this;
  }

   /**
   * Get regionClass
   * @return regionClass
  **/
  public String getRegionClass() {
    return regionClass;
  }

  public void setRegionClass(String regionClass) {
    this.regionClass = regionClass;
  }

  public RegionResponse start(Long start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
  }

  public RegionResponse end(Long end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  public Long getEnd() {
    return end;
  }

  public void setEnd(Long end) {
    this.end = end;
  }

  public RegionResponse polygon(String polygon) {
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

  public RegionResponse metaData(String metaData) {
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

  public RegionResponse distance(Double distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public RegionResponse versionCode(Integer versionCode) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegionResponse regionResponse = (RegionResponse) o;
    return Objects.equals(id, regionResponse.id) &&
        Objects.equals(shortName, regionResponse.shortName) &&
        Objects.equals(fullName, regionResponse.fullName) &&
        Objects.equals(parent, regionResponse.parent) &&
        Objects.equals(children, regionResponse.children) &&
        Objects.equals(postalCodes, regionResponse.postalCodes) &&
        Objects.equals(latitude, regionResponse.latitude) &&
        Objects.equals(longitude, regionResponse.longitude) &&
        Objects.equals(active, regionResponse.active) &&
        Objects.equals(root, regionResponse.root) &&
        Objects.equals(regionClass, regionResponse.regionClass) &&
        Objects.equals(start, regionResponse.start) &&
        Objects.equals(end, regionResponse.end) &&
        Objects.equals(polygon, regionResponse.polygon) &&
        Objects.equals(metaData, regionResponse.metaData) &&
        Objects.equals(distance, regionResponse.distance) &&
        Objects.equals(versionCode, regionResponse.versionCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, shortName, fullName, parent, children, postalCodes, latitude, longitude, active, root, regionClass, start, end, polygon, metaData, distance, versionCode);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    postalCodes: ").append(toIndentedString(postalCodes)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    root: ").append(toIndentedString(root)).append("\n");
    sb.append("    regionClass: ").append(toIndentedString(regionClass)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    polygon: ").append(toIndentedString(polygon)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    versionCode: ").append(toIndentedString(versionCode)).append("\n");
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

