package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class GeoBox   {
  
  private Double north;
  private Double east;
  private Double south;
  private Double west;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("north")
  public Double getNorth() {
    return north;
  }
  public void setNorth(Double north) {
    this.north = north;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("east")
  public Double getEast() {
    return east;
  }
  public void setEast(Double east) {
    this.east = east;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("south")
  public Double getSouth() {
    return south;
  }
  public void setSouth(Double south) {
    this.south = south;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("west")
  public Double getWest() {
    return west;
  }
  public void setWest(Double west) {
    this.west = west;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

