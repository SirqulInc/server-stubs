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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Dimensions   {
  
  private Double width;
  private Double height;
  private Double depth;
  private Double volume;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("width")
  public Double getWidth() {
    return width;
  }
  public void setWidth(Double width) {
    this.width = width;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("height")
  public Double getHeight() {
    return height;
  }
  public void setHeight(Double height) {
    this.height = height;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("depth")
  public Double getDepth() {
    return depth;
  }
  public void setDepth(Double depth) {
    this.depth = depth;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("volume")
  public Double getVolume() {
    return volume;
  }
  public void setVolume(Double volume) {
    this.volume = volume;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

