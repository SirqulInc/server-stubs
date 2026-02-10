package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PostalCodeResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RegionResponse   {
  
  private Long id;
  private String shortName;
  private String fullName;
  private RegionResponse parent;
  private List<@Valid RegionResponse> children = new ArrayList<>();
  private List<@Valid PostalCodeResponse> postalCodes = new ArrayList<>();
  private Double latitude;
  private Double longitude;
  private Boolean active;
  private Boolean root;
  private String regionClass;
  private Long start;
  private Long end;
  private String polygon;
  private String metaData;
  private Double distance;
  private Integer versionCode;

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
  @JsonProperty("parent")
  @Valid
  public RegionResponse getParent() {
    return parent;
  }
  public void setParent(RegionResponse parent) {
    this.parent = parent;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("children")
  @Valid
  public List<@Valid RegionResponse> getChildren() {
    return children;
  }
  public void setChildren(List<@Valid RegionResponse> children) {
    this.children = children;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("postalCodes")
  @Valid
  public List<@Valid PostalCodeResponse> getPostalCodes() {
    return postalCodes;
  }
  public void setPostalCodes(List<@Valid PostalCodeResponse> postalCodes) {
    this.postalCodes = postalCodes;
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
  @JsonProperty("regionClass")
  public String getRegionClass() {
    return regionClass;
  }
  public void setRegionClass(String regionClass) {
    this.regionClass = regionClass;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("start")
  public Long getStart() {
    return start;
  }
  public void setStart(Long start) {
    this.start = start;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("end")
  public Long getEnd() {
    return end;
  }
  public void setEnd(Long end) {
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
  @JsonProperty("distance")
  public Double getDistance() {
    return distance;
  }
  public void setDistance(Double distance) {
    this.distance = distance;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

