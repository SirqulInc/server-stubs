package apimodels;

import apimodels.CargoType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * VehicleCargoSetting
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class VehicleCargoSetting   {
  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("cargoType")
  @Valid

  private CargoType cargoType;

  @JsonProperty("maxUnit")
  
  private Integer maxUnit;

  public VehicleCargoSetting valid(Boolean valid) {
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

  public VehicleCargoSetting cargoType(CargoType cargoType) {
    this.cargoType = cargoType;
    return this;
  }

   /**
   * Get cargoType
   * @return cargoType
  **/
  public CargoType getCargoType() {
    return cargoType;
  }

  public void setCargoType(CargoType cargoType) {
    this.cargoType = cargoType;
  }

  public VehicleCargoSetting maxUnit(Integer maxUnit) {
    this.maxUnit = maxUnit;
    return this;
  }

   /**
   * Get maxUnit
   * @return maxUnit
  **/
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
    return Objects.equals(valid, vehicleCargoSetting.valid) &&
        Objects.equals(cargoType, vehicleCargoSetting.cargoType) &&
        Objects.equals(maxUnit, vehicleCargoSetting.maxUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, cargoType, maxUnit);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

