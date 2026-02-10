package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GeoBox  {
  
  @ApiModelProperty(value = "")

  private Double north;

  @ApiModelProperty(value = "")

  private Double east;

  @ApiModelProperty(value = "")

  private Double south;

  @ApiModelProperty(value = "")

  private Double west;
 /**
   * Get north
   * @return north
  **/
  @JsonProperty("north")
  public Double getNorth() {
    return north;
  }

  public void setNorth(Double north) {
    this.north = north;
  }

  public GeoBox north(Double north) {
    this.north = north;
    return this;
  }

 /**
   * Get east
   * @return east
  **/
  @JsonProperty("east")
  public Double getEast() {
    return east;
  }

  public void setEast(Double east) {
    this.east = east;
  }

  public GeoBox east(Double east) {
    this.east = east;
    return this;
  }

 /**
   * Get south
   * @return south
  **/
  @JsonProperty("south")
  public Double getSouth() {
    return south;
  }

  public void setSouth(Double south) {
    this.south = south;
  }

  public GeoBox south(Double south) {
    this.south = south;
    return this;
  }

 /**
   * Get west
   * @return west
  **/
  @JsonProperty("west")
  public Double getWest() {
    return west;
  }

  public void setWest(Double west) {
    this.west = west;
  }

  public GeoBox west(Double west) {
    this.west = west;
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
    GeoBox geoBox = (GeoBox) o;
    return Objects.equals(this.north, geoBox.north) &&
        Objects.equals(this.east, geoBox.east) &&
        Objects.equals(this.south, geoBox.south) &&
        Objects.equals(this.west, geoBox.west);
  }

  @Override
  public int hashCode() {
    return Objects.hash(north, east, south, west);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoBox {\n");
    
    sb.append("    north: ").append(toIndentedString(north)).append("\n");
    sb.append("    east: ").append(toIndentedString(east)).append("\n");
    sb.append("    south: ").append(toIndentedString(south)).append("\n");
    sb.append("    west: ").append(toIndentedString(west)).append("\n");
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

