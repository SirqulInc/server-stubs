package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GeoBox
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GeoBox   {
  @JsonProperty("north")
  
  private Double north;

  @JsonProperty("east")
  
  private Double east;

  @JsonProperty("south")
  
  private Double south;

  @JsonProperty("west")
  
  private Double west;

  public GeoBox north(Double north) {
    this.north = north;
    return this;
  }

   /**
   * Get north
   * @return north
  **/
  public Double getNorth() {
    return north;
  }

  public void setNorth(Double north) {
    this.north = north;
  }

  public GeoBox east(Double east) {
    this.east = east;
    return this;
  }

   /**
   * Get east
   * @return east
  **/
  public Double getEast() {
    return east;
  }

  public void setEast(Double east) {
    this.east = east;
  }

  public GeoBox south(Double south) {
    this.south = south;
    return this;
  }

   /**
   * Get south
   * @return south
  **/
  public Double getSouth() {
    return south;
  }

  public void setSouth(Double south) {
    this.south = south;
  }

  public GeoBox west(Double west) {
    this.west = west;
    return this;
  }

   /**
   * Get west
   * @return west
  **/
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
    return Objects.equals(north, geoBox.north) &&
        Objects.equals(east, geoBox.east) &&
        Objects.equals(south, geoBox.south) &&
        Objects.equals(west, geoBox.west);
  }

  @Override
  public int hashCode() {
    return Objects.hash(north, east, south, west);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

