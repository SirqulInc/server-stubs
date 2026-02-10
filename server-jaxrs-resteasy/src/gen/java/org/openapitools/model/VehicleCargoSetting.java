package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CargoType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class VehicleCargoSetting   {
  
  private Boolean valid;
  private CargoType cargoType;
  private Integer maxUnit;

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
  @JsonProperty("cargoType")
  @Valid
  public CargoType getCargoType() {
    return cargoType;
  }
  public void setCargoType(CargoType cargoType) {
    this.cargoType = cargoType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxUnit")
  public Integer getMaxUnit() {
    return maxUnit;
  }
  public void setMaxUnit(Integer maxUnit) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

