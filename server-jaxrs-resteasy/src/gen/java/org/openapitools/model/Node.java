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
public class Node   {
  
  private Integer x;
  private Integer y;
  private Integer z;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("x")
  public Integer getX() {
    return x;
  }
  public void setX(Integer x) {
    this.x = x;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("y")
  public Integer getY() {
    return y;
  }
  public void setY(Integer y) {
    this.y = y;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("z")
  public Integer getZ() {
    return z;
  }
  public void setZ(Integer z) {
    this.z = z;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node node = (Node) o;
    return Objects.equals(this.x, node.x) &&
        Objects.equals(this.y, node.y) &&
        Objects.equals(this.z, node.z);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Node {\n");
    
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    z: ").append(toIndentedString(z)).append("\n");
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

