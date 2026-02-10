package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GeocodeLatLngResponse  {
  
  @ApiModelProperty(value = "")

  private Double lat;

  @ApiModelProperty(value = "")

  private Double lng;
 /**
   * Get lat
   * @return lat
  **/
  @JsonProperty("lat")
  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public GeocodeLatLngResponse lat(Double lat) {
    this.lat = lat;
    return this;
  }

 /**
   * Get lng
   * @return lng
  **/
  @JsonProperty("lng")
  public Double getLng() {
    return lng;
  }

  public void setLng(Double lng) {
    this.lng = lng;
  }

  public GeocodeLatLngResponse lng(Double lng) {
    this.lng = lng;
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
    GeocodeLatLngResponse geocodeLatLngResponse = (GeocodeLatLngResponse) o;
    return Objects.equals(this.lat, geocodeLatLngResponse.lat) &&
        Objects.equals(this.lng, geocodeLatLngResponse.lng);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lng);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeocodeLatLngResponse {\n");
    
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
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

