package apimodels;

import apimodels.AssetShortResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GeoPointResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GeoPointResponse   {
  @JsonProperty("objectId")
  
  private String objectId;

  @JsonProperty("latitude")
  
  private Double latitude;

  @JsonProperty("longitude")
  
  private Double longitude;

  @JsonProperty("altitude")
  
  private Double altitude;

  @JsonProperty("locationDescription")
  
  private String locationDescription;

  @JsonProperty("locatableId")
  
  private Long locatableId;

  @JsonProperty("locatableObjectId")
  
  private String locatableObjectId;

  @JsonProperty("locatableObjectName")
  
  private String locatableObjectName;

  @JsonProperty("locatableDisplay")
  
  private String locatableDisplay;

  @JsonProperty("asset")
  @Valid

  private AssetShortResponse asset;

  @JsonProperty("distance")
  
  private Double distance;

  public GeoPointResponse objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public GeoPointResponse latitude(Double latitude) {
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

  public GeoPointResponse longitude(Double longitude) {
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

  public GeoPointResponse altitude(Double altitude) {
    this.altitude = altitude;
    return this;
  }

   /**
   * Get altitude
   * @return altitude
  **/
  public Double getAltitude() {
    return altitude;
  }

  public void setAltitude(Double altitude) {
    this.altitude = altitude;
  }

  public GeoPointResponse locationDescription(String locationDescription) {
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

  public GeoPointResponse locatableId(Long locatableId) {
    this.locatableId = locatableId;
    return this;
  }

   /**
   * Get locatableId
   * @return locatableId
  **/
  public Long getLocatableId() {
    return locatableId;
  }

  public void setLocatableId(Long locatableId) {
    this.locatableId = locatableId;
  }

  public GeoPointResponse locatableObjectId(String locatableObjectId) {
    this.locatableObjectId = locatableObjectId;
    return this;
  }

   /**
   * Get locatableObjectId
   * @return locatableObjectId
  **/
  public String getLocatableObjectId() {
    return locatableObjectId;
  }

  public void setLocatableObjectId(String locatableObjectId) {
    this.locatableObjectId = locatableObjectId;
  }

  public GeoPointResponse locatableObjectName(String locatableObjectName) {
    this.locatableObjectName = locatableObjectName;
    return this;
  }

   /**
   * Get locatableObjectName
   * @return locatableObjectName
  **/
  public String getLocatableObjectName() {
    return locatableObjectName;
  }

  public void setLocatableObjectName(String locatableObjectName) {
    this.locatableObjectName = locatableObjectName;
  }

  public GeoPointResponse locatableDisplay(String locatableDisplay) {
    this.locatableDisplay = locatableDisplay;
    return this;
  }

   /**
   * Get locatableDisplay
   * @return locatableDisplay
  **/
  public String getLocatableDisplay() {
    return locatableDisplay;
  }

  public void setLocatableDisplay(String locatableDisplay) {
    this.locatableDisplay = locatableDisplay;
  }

  public GeoPointResponse asset(AssetShortResponse asset) {
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  public AssetShortResponse getAsset() {
    return asset;
  }

  public void setAsset(AssetShortResponse asset) {
    this.asset = asset;
  }

  public GeoPointResponse distance(Double distance) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoPointResponse geoPointResponse = (GeoPointResponse) o;
    return Objects.equals(objectId, geoPointResponse.objectId) &&
        Objects.equals(latitude, geoPointResponse.latitude) &&
        Objects.equals(longitude, geoPointResponse.longitude) &&
        Objects.equals(altitude, geoPointResponse.altitude) &&
        Objects.equals(locationDescription, geoPointResponse.locationDescription) &&
        Objects.equals(locatableId, geoPointResponse.locatableId) &&
        Objects.equals(locatableObjectId, geoPointResponse.locatableObjectId) &&
        Objects.equals(locatableObjectName, geoPointResponse.locatableObjectName) &&
        Objects.equals(locatableDisplay, geoPointResponse.locatableDisplay) &&
        Objects.equals(asset, geoPointResponse.asset) &&
        Objects.equals(distance, geoPointResponse.distance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, latitude, longitude, altitude, locationDescription, locatableId, locatableObjectId, locatableObjectName, locatableDisplay, asset, distance);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

