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
 * OrderPackage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrderPackage {

  private @Nullable Boolean valid;

  private @Nullable String packageTypeName;

  private @Nullable Integer packageCount;

  private @Nullable Double cubicFeet;

  public OrderPackage valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public OrderPackage packageTypeName(@Nullable String packageTypeName) {
    this.packageTypeName = packageTypeName;
    return this;
  }

  /**
   * Get packageTypeName
   * @return packageTypeName
   */
  
  @Schema(name = "PackageTypeName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PackageTypeName")
  public @Nullable String getPackageTypeName() {
    return packageTypeName;
  }

  public void setPackageTypeName(@Nullable String packageTypeName) {
    this.packageTypeName = packageTypeName;
  }

  public OrderPackage packageCount(@Nullable Integer packageCount) {
    this.packageCount = packageCount;
    return this;
  }

  /**
   * Get packageCount
   * @return packageCount
   */
  
  @Schema(name = "PackageCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PackageCount")
  public @Nullable Integer getPackageCount() {
    return packageCount;
  }

  public void setPackageCount(@Nullable Integer packageCount) {
    this.packageCount = packageCount;
  }

  public OrderPackage cubicFeet(@Nullable Double cubicFeet) {
    this.cubicFeet = cubicFeet;
    return this;
  }

  /**
   * Get cubicFeet
   * @return cubicFeet
   */
  
  @Schema(name = "CubicFeet", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CubicFeet")
  public @Nullable Double getCubicFeet() {
    return cubicFeet;
  }

  public void setCubicFeet(@Nullable Double cubicFeet) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

