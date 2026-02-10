package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrderPackage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderPackage   {
  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("PackageTypeName")
  
  private String packageTypeName;

  @JsonProperty("PackageCount")
  
  private Integer packageCount;

  @JsonProperty("CubicFeet")
  
  private Double cubicFeet;

  public OrderPackage valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public OrderPackage packageTypeName(String packageTypeName) {
    this.packageTypeName = packageTypeName;
    return this;
  }

   /**
   * Get packageTypeName
   * @return packageTypeName
  **/
  public String getPackageTypeName() {
    return packageTypeName;
  }

  public void setPackageTypeName(String packageTypeName) {
    this.packageTypeName = packageTypeName;
  }

  public OrderPackage packageCount(Integer packageCount) {
    this.packageCount = packageCount;
    return this;
  }

   /**
   * Get packageCount
   * @return packageCount
  **/
  public Integer getPackageCount() {
    return packageCount;
  }

  public void setPackageCount(Integer packageCount) {
    this.packageCount = packageCount;
  }

  public OrderPackage cubicFeet(Double cubicFeet) {
    this.cubicFeet = cubicFeet;
    return this;
  }

   /**
   * Get cubicFeet
   * @return cubicFeet
  **/
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
    return Objects.equals(valid, orderPackage.valid) &&
        Objects.equals(packageTypeName, orderPackage.packageTypeName) &&
        Objects.equals(packageCount, orderPackage.packageCount) &&
        Objects.equals(cubicFeet, orderPackage.cubicFeet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, packageTypeName, packageCount, cubicFeet);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

