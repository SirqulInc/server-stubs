package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AssetShortResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GeoPointResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class GeoPointResponse {

  private @Nullable String objectId;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable Double altitude;

  private @Nullable String locationDescription;

  private @Nullable Long locatableId;

  private @Nullable String locatableObjectId;

  private @Nullable String locatableObjectName;

  private @Nullable String locatableDisplay;

  private @Nullable AssetShortResponse asset;

  private @Nullable Double distance;

  public GeoPointResponse objectId(@Nullable String objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * Get objectId
   * @return objectId
   */
  
  @Schema(name = "objectId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("objectId")
  public @Nullable String getObjectId() {
    return objectId;
  }

  public void setObjectId(@Nullable String objectId) {
    this.objectId = objectId;
  }

  public GeoPointResponse latitude(@Nullable Double latitude) {
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

  public GeoPointResponse longitude(@Nullable Double longitude) {
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

  public GeoPointResponse altitude(@Nullable Double altitude) {
    this.altitude = altitude;
    return this;
  }

  /**
   * Get altitude
   * @return altitude
   */
  
  @Schema(name = "altitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("altitude")
  public @Nullable Double getAltitude() {
    return altitude;
  }

  public void setAltitude(@Nullable Double altitude) {
    this.altitude = altitude;
  }

  public GeoPointResponse locationDescription(@Nullable String locationDescription) {
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

  public GeoPointResponse locatableId(@Nullable Long locatableId) {
    this.locatableId = locatableId;
    return this;
  }

  /**
   * Get locatableId
   * @return locatableId
   */
  
  @Schema(name = "locatableId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locatableId")
  public @Nullable Long getLocatableId() {
    return locatableId;
  }

  public void setLocatableId(@Nullable Long locatableId) {
    this.locatableId = locatableId;
  }

  public GeoPointResponse locatableObjectId(@Nullable String locatableObjectId) {
    this.locatableObjectId = locatableObjectId;
    return this;
  }

  /**
   * Get locatableObjectId
   * @return locatableObjectId
   */
  
  @Schema(name = "locatableObjectId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locatableObjectId")
  public @Nullable String getLocatableObjectId() {
    return locatableObjectId;
  }

  public void setLocatableObjectId(@Nullable String locatableObjectId) {
    this.locatableObjectId = locatableObjectId;
  }

  public GeoPointResponse locatableObjectName(@Nullable String locatableObjectName) {
    this.locatableObjectName = locatableObjectName;
    return this;
  }

  /**
   * Get locatableObjectName
   * @return locatableObjectName
   */
  
  @Schema(name = "locatableObjectName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locatableObjectName")
  public @Nullable String getLocatableObjectName() {
    return locatableObjectName;
  }

  public void setLocatableObjectName(@Nullable String locatableObjectName) {
    this.locatableObjectName = locatableObjectName;
  }

  public GeoPointResponse locatableDisplay(@Nullable String locatableDisplay) {
    this.locatableDisplay = locatableDisplay;
    return this;
  }

  /**
   * Get locatableDisplay
   * @return locatableDisplay
   */
  
  @Schema(name = "locatableDisplay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locatableDisplay")
  public @Nullable String getLocatableDisplay() {
    return locatableDisplay;
  }

  public void setLocatableDisplay(@Nullable String locatableDisplay) {
    this.locatableDisplay = locatableDisplay;
  }

  public GeoPointResponse asset(@Nullable AssetShortResponse asset) {
    this.asset = asset;
    return this;
  }

  /**
   * Get asset
   * @return asset
   */
  @Valid 
  @Schema(name = "asset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asset")
  public @Nullable AssetShortResponse getAsset() {
    return asset;
  }

  public void setAsset(@Nullable AssetShortResponse asset) {
    this.asset = asset;
  }

  public GeoPointResponse distance(@Nullable Double distance) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

