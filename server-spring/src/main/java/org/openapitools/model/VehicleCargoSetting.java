package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CargoType;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * VehicleCargoSetting
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class VehicleCargoSetting {

  private @Nullable Boolean valid;

  private @Nullable CargoType cargoType;

  private @Nullable Integer maxUnit;

  public VehicleCargoSetting valid(@Nullable Boolean valid) {
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

  public VehicleCargoSetting cargoType(@Nullable CargoType cargoType) {
    this.cargoType = cargoType;
    return this;
  }

  /**
   * Get cargoType
   * @return cargoType
   */
  @Valid 
  @Schema(name = "cargoType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cargoType")
  public @Nullable CargoType getCargoType() {
    return cargoType;
  }

  public void setCargoType(@Nullable CargoType cargoType) {
    this.cargoType = cargoType;
  }

  public VehicleCargoSetting maxUnit(@Nullable Integer maxUnit) {
    this.maxUnit = maxUnit;
    return this;
  }

  /**
   * Get maxUnit
   * @return maxUnit
   */
  
  @Schema(name = "maxUnit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxUnit")
  public @Nullable Integer getMaxUnit() {
    return maxUnit;
  }

  public void setMaxUnit(@Nullable Integer maxUnit) {
    this.maxUnit = maxUnit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleCargoSetting vehicleCargoSetting = (VehicleCargoSetting) o;
    return Objects.equals(this.valid, vehicleCargoSetting.valid) &&
        Objects.equals(this.cargoType, vehicleCargoSetting.cargoType) &&
        Objects.equals(this.maxUnit, vehicleCargoSetting.maxUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, cargoType, maxUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleCargoSetting {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    cargoType: ").append(toIndentedString(cargoType)).append("\n");
    sb.append("    maxUnit: ").append(toIndentedString(maxUnit)).append("\n");
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

