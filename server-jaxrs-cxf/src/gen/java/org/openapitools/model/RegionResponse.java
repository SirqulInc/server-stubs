package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PostalCodeResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RegionResponse  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private String shortName;

  @ApiModelProperty(value = "")

  private String fullName;

  @ApiModelProperty(value = "")

  @Valid

  private RegionResponse parent;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid RegionResponse> children = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid PostalCodeResponse> postalCodes = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean root;

  @ApiModelProperty(value = "")

  private String regionClass;

  @ApiModelProperty(value = "")

  private Long start;

  @ApiModelProperty(value = "")

  private Long end;

  @ApiModelProperty(value = "")

  private String polygon;

  @ApiModelProperty(value = "")

  private String metaData;

  @ApiModelProperty(value = "")

  private Double distance;

  @ApiModelProperty(value = "")

  private Integer versionCode;
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

  public RegionResponse id(Long id) {
    this.id = id;
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

  public RegionResponse shortName(String shortName) {
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

  public RegionResponse fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

 /**
   * Get parent
   * @return parent
  **/
  @JsonProperty("parent")
  public RegionResponse getParent() {
    return parent;
  }

  public void setParent(RegionResponse parent) {
    this.parent = parent;
  }

  public RegionResponse parent(RegionResponse parent) {
    this.parent = parent;
    return this;
  }

 /**
   * Get children
   * @return children
  **/
  @JsonProperty("children")
  public List<@Valid RegionResponse> getChildren() {
    return children;
  }

  public void setChildren(List<@Valid RegionResponse> children) {
    this.children = children;
  }

  public RegionResponse children(List<@Valid RegionResponse> children) {
    this.children = children;
    return this;
  }

  public RegionResponse addChildrenItem(RegionResponse childrenItem) {
    this.children.add(childrenItem);
    return this;
  }

 /**
   * Get postalCodes
   * @return postalCodes
  **/
  @JsonProperty("postalCodes")
  public List<@Valid PostalCodeResponse> getPostalCodes() {
    return postalCodes;
  }

  public void setPostalCodes(List<@Valid PostalCodeResponse> postalCodes) {
    this.postalCodes = postalCodes;
  }

  public RegionResponse postalCodes(List<@Valid PostalCodeResponse> postalCodes) {
    this.postalCodes = postalCodes;
    return this;
  }

  public RegionResponse addPostalCodesItem(PostalCodeResponse postalCodesItem) {
    this.postalCodes.add(postalCodesItem);
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

  public RegionResponse latitude(Double latitude) {
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

  public RegionResponse longitude(Double longitude) {
    this.longitude = longitude;
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

  public RegionResponse active(Boolean active) {
    this.active = active;
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

  public RegionResponse root(Boolean root) {
    this.root = root;
    return this;
  }

 /**
   * Get regionClass
   * @return regionClass
  **/
  @JsonProperty("regionClass")
  public String getRegionClass() {
    return regionClass;
  }

  public void setRegionClass(String regionClass) {
    this.regionClass = regionClass;
  }

  public RegionResponse regionClass(String regionClass) {
    this.regionClass = regionClass;
    return this;
  }

 /**
   * Get start
   * @return start
  **/
  @JsonProperty("start")
  public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
  }

  public RegionResponse start(Long start) {
    this.start = start;
    return this;
  }

 /**
   * Get end
   * @return end
  **/
  @JsonProperty("end")
  public Long getEnd() {
    return end;
  }

  public void setEnd(Long end) {
    this.end = end;
  }

  public RegionResponse end(Long end) {
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

  public RegionResponse polygon(String polygon) {
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

  public RegionResponse metaData(String metaData) {
    this.metaData = metaData;
    return this;
  }

 /**
   * Get distance
   * @return distance
  **/
  @JsonProperty("distance")
  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public RegionResponse distance(Double distance) {
    this.distance = distance;
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

  public RegionResponse versionCode(Integer versionCode) {
    this.versionCode = versionCode;
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
    RegionResponse regionResponse = (RegionResponse) o;
    return Objects.equals(this.id, regionResponse.id) &&
        Objects.equals(this.shortName, regionResponse.shortName) &&
        Objects.equals(this.fullName, regionResponse.fullName) &&
        Objects.equals(this.parent, regionResponse.parent) &&
        Objects.equals(this.children, regionResponse.children) &&
        Objects.equals(this.postalCodes, regionResponse.postalCodes) &&
        Objects.equals(this.latitude, regionResponse.latitude) &&
        Objects.equals(this.longitude, regionResponse.longitude) &&
        Objects.equals(this.active, regionResponse.active) &&
        Objects.equals(this.root, regionResponse.root) &&
        Objects.equals(this.regionClass, regionResponse.regionClass) &&
        Objects.equals(this.start, regionResponse.start) &&
        Objects.equals(this.end, regionResponse.end) &&
        Objects.equals(this.polygon, regionResponse.polygon) &&
        Objects.equals(this.metaData, regionResponse.metaData) &&
        Objects.equals(this.distance, regionResponse.distance) &&
        Objects.equals(this.versionCode, regionResponse.versionCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, shortName, fullName, parent, children, postalCodes, latitude, longitude, active, root, regionClass, start, end, polygon, metaData, distance, versionCode);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

