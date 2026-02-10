package org.openapitools.model;

import org.openapitools.model.AssetShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GeoPointResponse  {
  
  @ApiModelProperty(value = "")

  private String objectId;

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;

  @ApiModelProperty(value = "")

  private Double altitude;

  @ApiModelProperty(value = "")

  private String locationDescription;

  @ApiModelProperty(value = "")

  private Long locatableId;

  @ApiModelProperty(value = "")

  private String locatableObjectId;

  @ApiModelProperty(value = "")

  private String locatableObjectName;

  @ApiModelProperty(value = "")

  private String locatableDisplay;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse asset;

  @ApiModelProperty(value = "")

  private Double distance;
 /**
   * Get objectId
   * @return objectId
  **/
  @JsonProperty("objectId")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public GeoPointResponse objectId(String objectId) {
    this.objectId = objectId;
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

  public GeoPointResponse latitude(Double latitude) {
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

  public GeoPointResponse longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Get altitude
   * @return altitude
  **/
  @JsonProperty("altitude")
  public Double getAltitude() {
    return altitude;
  }

  public void setAltitude(Double altitude) {
    this.altitude = altitude;
  }

  public GeoPointResponse altitude(Double altitude) {
    this.altitude = altitude;
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

  public GeoPointResponse locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

 /**
   * Get locatableId
   * @return locatableId
  **/
  @JsonProperty("locatableId")
  public Long getLocatableId() {
    return locatableId;
  }

  public void setLocatableId(Long locatableId) {
    this.locatableId = locatableId;
  }

  public GeoPointResponse locatableId(Long locatableId) {
    this.locatableId = locatableId;
    return this;
  }

 /**
   * Get locatableObjectId
   * @return locatableObjectId
  **/
  @JsonProperty("locatableObjectId")
  public String getLocatableObjectId() {
    return locatableObjectId;
  }

  public void setLocatableObjectId(String locatableObjectId) {
    this.locatableObjectId = locatableObjectId;
  }

  public GeoPointResponse locatableObjectId(String locatableObjectId) {
    this.locatableObjectId = locatableObjectId;
    return this;
  }

 /**
   * Get locatableObjectName
   * @return locatableObjectName
  **/
  @JsonProperty("locatableObjectName")
  public String getLocatableObjectName() {
    return locatableObjectName;
  }

  public void setLocatableObjectName(String locatableObjectName) {
    this.locatableObjectName = locatableObjectName;
  }

  public GeoPointResponse locatableObjectName(String locatableObjectName) {
    this.locatableObjectName = locatableObjectName;
    return this;
  }

 /**
   * Get locatableDisplay
   * @return locatableDisplay
  **/
  @JsonProperty("locatableDisplay")
  public String getLocatableDisplay() {
    return locatableDisplay;
  }

  public void setLocatableDisplay(String locatableDisplay) {
    this.locatableDisplay = locatableDisplay;
  }

  public GeoPointResponse locatableDisplay(String locatableDisplay) {
    this.locatableDisplay = locatableDisplay;
    return this;
  }

 /**
   * Get asset
   * @return asset
  **/
  @JsonProperty("asset")
  public AssetShortResponse getAsset() {
    return asset;
  }

  public void setAsset(AssetShortResponse asset) {
    this.asset = asset;
  }

  public GeoPointResponse asset(AssetShortResponse asset) {
    this.asset = asset;
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

  public GeoPointResponse distance(Double distance) {
    this.distance = distance;
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
    GeoPointResponse geoPointResponse = (GeoPointResponse) o;
    return Objects.equals(this.objectId, geoPointResponse.objectId) &&
        Objects.equals(this.latitude, geoPointResponse.latitude) &&
        Objects.equals(this.longitude, geoPointResponse.longitude) &&
        Objects.equals(this.altitude, geoPointResponse.altitude) &&
        Objects.equals(this.locationDescription, geoPointResponse.locationDescription) &&
        Objects.equals(this.locatableId, geoPointResponse.locatableId) &&
        Objects.equals(this.locatableObjectId, geoPointResponse.locatableObjectId) &&
        Objects.equals(this.locatableObjectName, geoPointResponse.locatableObjectName) &&
        Objects.equals(this.locatableDisplay, geoPointResponse.locatableDisplay) &&
        Objects.equals(this.asset, geoPointResponse.asset) &&
        Objects.equals(this.distance, geoPointResponse.distance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, latitude, longitude, altitude, locationDescription, locatableId, locatableObjectId, locatableObjectName, locatableDisplay, asset, distance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoPointResponse {\n");
    
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    locatableId: ").append(toIndentedString(locatableId)).append("\n");
    sb.append("    locatableObjectId: ").append(toIndentedString(locatableObjectId)).append("\n");
    sb.append("    locatableObjectName: ").append(toIndentedString(locatableObjectName)).append("\n");
    sb.append("    locatableDisplay: ").append(toIndentedString(locatableDisplay)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
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

