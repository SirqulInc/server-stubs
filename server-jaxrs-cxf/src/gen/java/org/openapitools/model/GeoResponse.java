package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GeoResponse  {
  
  @ApiModelProperty(value = "")

  private String geoId;

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;
 /**
   * Get geoId
   * @return geoId
  **/
  @JsonProperty("geoId")
  public String getGeoId() {
    return geoId;
  }

  public void setGeoId(String geoId) {
    this.geoId = geoId;
  }

  public GeoResponse geoId(String geoId) {
    this.geoId = geoId;
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

  public GeoResponse latitude(Double latitude) {
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

  public GeoResponse longitude(Double longitude) {
    this.longitude = longitude;
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
    GeoResponse geoResponse = (GeoResponse) o;
    return Objects.equals(this.geoId, geoResponse.geoId) &&
        Objects.equals(this.latitude, geoResponse.latitude) &&
        Objects.equals(this.longitude, geoResponse.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geoId, latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoResponse {\n");
    
    sb.append("    geoId: ").append(toIndentedString(geoId)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

