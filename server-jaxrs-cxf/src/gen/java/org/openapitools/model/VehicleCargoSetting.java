package org.openapitools.model;

import org.openapitools.model.CargoType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class VehicleCargoSetting  {
  
  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  @Valid

  private CargoType cargoType;

  @ApiModelProperty(value = "")

  private Integer maxUnit;
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

  public VehicleCargoSetting valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get cargoType
   * @return cargoType
  **/
  @JsonProperty("cargoType")
  public CargoType getCargoType() {
    return cargoType;
  }

  public void setCargoType(CargoType cargoType) {
    this.cargoType = cargoType;
  }

  public VehicleCargoSetting cargoType(CargoType cargoType) {
    this.cargoType = cargoType;
    return this;
  }

 /**
   * Get maxUnit
   * @return maxUnit
  **/
  @JsonProperty("maxUnit")
  public Integer getMaxUnit() {
    return maxUnit;
  }

  public void setMaxUnit(Integer maxUnit) {
    this.maxUnit = maxUnit;
  }

  public VehicleCargoSetting maxUnit(Integer maxUnit) {
    this.maxUnit = maxUnit;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

