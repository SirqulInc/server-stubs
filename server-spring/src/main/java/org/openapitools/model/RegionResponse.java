package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PostalCodeResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RegionResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RegionResponse {

  private @Nullable Long id;

  private @Nullable String shortName;

  private @Nullable String fullName;

  private @Nullable RegionResponse parent;

  @Valid
  private List<@Valid RegionResponse> children = new ArrayList<>();

  @Valid
  private List<@Valid PostalCodeResponse> postalCodes = new ArrayList<>();

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable Boolean active;

  private @Nullable Boolean root;

  private @Nullable String regionClass;

  private @Nullable Long start;

  private @Nullable Long end;

  private @Nullable String polygon;

  private @Nullable String metaData;

  private @Nullable Double distance;

  private @Nullable Integer versionCode;

  public RegionResponse id(@Nullable Long id) {
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

  public RegionResponse shortName(@Nullable String shortName) {
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

  public RegionResponse fullName(@Nullable String fullName) {
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

  public RegionResponse parent(@Nullable RegionResponse parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
   */
  @Valid 
  @Schema(name = "parent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent")
  public @Nullable RegionResponse getParent() {
    return parent;
  }

  public void setParent(@Nullable RegionResponse parent) {
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
   */
  @Valid 
  @Schema(name = "children", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("children")
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
   */
  @Valid 
  @Schema(name = "postalCodes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postalCodes")
  public List<@Valid PostalCodeResponse> getPostalCodes() {
    return postalCodes;
  }

  public void setPostalCodes(List<@Valid PostalCodeResponse> postalCodes) {
    this.postalCodes = postalCodes;
  }

  public RegionResponse latitude(@Nullable Double latitude) {
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

  public RegionResponse longitude(@Nullable Double longitude) {
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

  public RegionResponse active(@Nullable Boolean active) {
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

  public RegionResponse root(@Nullable Boolean root) {
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

  public RegionResponse regionClass(@Nullable String regionClass) {
    this.regionClass = regionClass;
    return this;
  }

  /**
   * Get regionClass
   * @return regionClass
   */
  
  @Schema(name = "regionClass", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regionClass")
  public @Nullable String getRegionClass() {
    return regionClass;
  }

  public void setRegionClass(@Nullable String regionClass) {
    this.regionClass = regionClass;
  }

  public RegionResponse start(@Nullable Long start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
   */
  
  @Schema(name = "start", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start")
  public @Nullable Long getStart() {
    return start;
  }

  public void setStart(@Nullable Long start) {
    this.start = start;
  }

  public RegionResponse end(@Nullable Long end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
   */
  
  @Schema(name = "end", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end")
  public @Nullable Long getEnd() {
    return end;
  }

  public void setEnd(@Nullable Long end) {
    this.end = end;
  }

  public RegionResponse polygon(@Nullable String polygon) {
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

  public RegionResponse metaData(@Nullable String metaData) {
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

  public RegionResponse distance(@Nullable Double distance) {
    this.distance = distance;
    return this;
  }

  /**
   * Get distance
   * @return distance
   */
  
  @Schema(name = "distance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("distance")
  public @Nullable Double getDistance() {
    return distance;
  }

  public void setDistance(@Nullable Double distance) {
    this.distance = distance;
  }

  public RegionResponse versionCode(@Nullable Integer versionCode) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

