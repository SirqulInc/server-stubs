package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AssetShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class GeoPointResponse   {
  
  private String objectId;
  private Double latitude;
  private Double longitude;
  private Double altitude;
  private String locationDescription;
  private Long locatableId;
  private String locatableObjectId;
  private String locatableObjectName;
  private String locatableDisplay;
  private AssetShortResponse asset;
  private Double distance;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("objectId")
  public String getObjectId() {
    return objectId;
  }
  public void setObjectId(String objectId) {
    this.objectId = objectId;
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
  @JsonProperty("altitude")
  public Double getAltitude() {
    return altitude;
  }
  public void setAltitude(Double altitude) {
    this.altitude = altitude;
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
  @JsonProperty("locatableId")
  public Long getLocatableId() {
    return locatableId;
  }
  public void setLocatableId(Long locatableId) {
    this.locatableId = locatableId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locatableObjectId")
  public String getLocatableObjectId() {
    return locatableObjectId;
  }
  public void setLocatableObjectId(String locatableObjectId) {
    this.locatableObjectId = locatableObjectId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locatableObjectName")
  public String getLocatableObjectName() {
    return locatableObjectName;
  }
  public void setLocatableObjectName(String locatableObjectName) {
    this.locatableObjectName = locatableObjectName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locatableDisplay")
  public String getLocatableDisplay() {
    return locatableDisplay;
  }
  public void setLocatableDisplay(String locatableDisplay) {
    this.locatableDisplay = locatableDisplay;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asset")
  @Valid
  public AssetShortResponse getAsset() {
    return asset;
  }
  public void setAsset(AssetShortResponse asset) {
    this.asset = asset;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

