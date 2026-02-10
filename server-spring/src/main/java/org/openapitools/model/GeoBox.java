package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GeoBox
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class GeoBox {

  private @Nullable Double north;

  private @Nullable Double east;

  private @Nullable Double south;

  private @Nullable Double west;

  public GeoBox north(@Nullable Double north) {
    this.north = north;
    return this;
  }

  /**
   * Get north
   * @return north
   */
  
  @Schema(name = "north", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("north")
  public @Nullable Double getNorth() {
    return north;
  }

  public void setNorth(@Nullable Double north) {
    this.north = north;
  }

  public GeoBox east(@Nullable Double east) {
    this.east = east;
    return this;
  }

  /**
   * Get east
   * @return east
   */
  
  @Schema(name = "east", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("east")
  public @Nullable Double getEast() {
    return east;
  }

  public void setEast(@Nullable Double east) {
    this.east = east;
  }

  public GeoBox south(@Nullable Double south) {
    this.south = south;
    return this;
  }

  /**
   * Get south
   * @return south
   */
  
  @Schema(name = "south", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("south")
  public @Nullable Double getSouth() {
    return south;
  }

  public void setSouth(@Nullable Double south) {
    this.south = south;
  }

  public GeoBox west(@Nullable Double west) {
    this.west = west;
    return this;
  }

  /**
   * Get west
   * @return west
   */
  
  @Schema(name = "west", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("west")
  public @Nullable Double getWest() {
    return west;
  }

  public void setWest(@Nullable Double west) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

