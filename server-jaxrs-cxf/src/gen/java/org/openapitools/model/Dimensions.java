package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Dimensions  {
  
  @ApiModelProperty(value = "")

  private Double width;

  @ApiModelProperty(value = "")

  private Double height;

  @ApiModelProperty(value = "")

  private Double depth;

  @ApiModelProperty(value = "")

  private Double volume;
 /**
   * Get width
   * @return width
  **/
  @JsonProperty("width")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public Dimensions width(Double width) {
    this.width = width;
    return this;
  }

 /**
   * Get height
   * @return height
  **/
  @JsonProperty("height")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public Dimensions height(Double height) {
    this.height = height;
    return this;
  }

 /**
   * Get depth
   * @return depth
  **/
  @JsonProperty("depth")
  public Double getDepth() {
    return depth;
  }

  public void setDepth(Double depth) {
    this.depth = depth;
  }

  public Dimensions depth(Double depth) {
    this.depth = depth;
    return this;
  }

 /**
   * Get volume
   * @return volume
  **/
  @JsonProperty("volume")
  public Double getVolume() {
    return volume;
  }

  public void setVolume(Double volume) {
    this.volume = volume;
  }

  public Dimensions volume(Double volume) {
    this.volume = volume;
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
    Dimensions dimensions = (Dimensions) o;
    return Objects.equals(this.width, dimensions.width) &&
        Objects.equals(this.height, dimensions.height) &&
        Objects.equals(this.depth, dimensions.depth) &&
        Objects.equals(this.volume, dimensions.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, depth, volume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dimensions {\n");
    
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

