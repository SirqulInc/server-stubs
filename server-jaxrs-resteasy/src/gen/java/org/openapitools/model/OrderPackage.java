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
public class OrderPackage   {
  
  private Boolean valid;
  private String packageTypeName;
  private Integer packageCount;
  private Double cubicFeet;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("PackageTypeName")
  public String getPackageTypeName() {
    return packageTypeName;
  }
  public void setPackageTypeName(String packageTypeName) {
    this.packageTypeName = packageTypeName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("PackageCount")
  public Integer getPackageCount() {
    return packageCount;
  }
  public void setPackageCount(Integer packageCount) {
    this.packageCount = packageCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("CubicFeet")
  public Double getCubicFeet() {
    return cubicFeet;
  }
  public void setCubicFeet(Double cubicFeet) {
    this.cubicFeet = cubicFeet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderPackage orderPackage = (OrderPackage) o;
    return Objects.equals(this.valid, orderPackage.valid) &&
        Objects.equals(this.packageTypeName, orderPackage.packageTypeName) &&
        Objects.equals(this.packageCount, orderPackage.packageCount) &&
        Objects.equals(this.cubicFeet, orderPackage.cubicFeet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, packageTypeName, packageCount, cubicFeet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPackage {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    packageTypeName: ").append(toIndentedString(packageTypeName)).append("\n");
    sb.append("    packageCount: ").append(toIndentedString(packageCount)).append("\n");
    sb.append("    cubicFeet: ").append(toIndentedString(cubicFeet)).append("\n");
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

