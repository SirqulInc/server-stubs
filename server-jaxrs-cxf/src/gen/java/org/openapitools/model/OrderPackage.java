package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrderPackage  {
  
  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String packageTypeName;

  @ApiModelProperty(value = "")

  private Integer packageCount;

  @ApiModelProperty(value = "")

  private Double cubicFeet;
 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public OrderPackage valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get packageTypeName
   * @return packageTypeName
  **/
  @JsonProperty("PackageTypeName")
  public String getPackageTypeName() {
    return packageTypeName;
  }

  public void setPackageTypeName(String packageTypeName) {
    this.packageTypeName = packageTypeName;
  }

  public OrderPackage packageTypeName(String packageTypeName) {
    this.packageTypeName = packageTypeName;
    return this;
  }

 /**
   * Get packageCount
   * @return packageCount
  **/
  @JsonProperty("PackageCount")
  public Integer getPackageCount() {
    return packageCount;
  }

  public void setPackageCount(Integer packageCount) {
    this.packageCount = packageCount;
  }

  public OrderPackage packageCount(Integer packageCount) {
    this.packageCount = packageCount;
    return this;
  }

 /**
   * Get cubicFeet
   * @return cubicFeet
  **/
  @JsonProperty("CubicFeet")
  public Double getCubicFeet() {
    return cubicFeet;
  }

  public void setCubicFeet(Double cubicFeet) {
    this.cubicFeet = cubicFeet;
  }

  public OrderPackage cubicFeet(Double cubicFeet) {
    this.cubicFeet = cubicFeet;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

