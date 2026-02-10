package org.openapitools.model;

import org.openapitools.model.DurationFieldType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DurationField  {
  
  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  @Valid

  private DurationFieldType type;

  @ApiModelProperty(value = "")

  private Boolean supported;

  @ApiModelProperty(value = "")

  private Boolean precise;

  @ApiModelProperty(value = "")

  private Long unitMillis;
 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DurationField name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public DurationFieldType getType() {
    return type;
  }

  public void setType(DurationFieldType type) {
    this.type = type;
  }

  public DurationField type(DurationFieldType type) {
    this.type = type;
    return this;
  }

 /**
   * Get supported
   * @return supported
  **/
  @JsonProperty("supported")
  public Boolean getSupported() {
    return supported;
  }

  public void setSupported(Boolean supported) {
    this.supported = supported;
  }

  public DurationField supported(Boolean supported) {
    this.supported = supported;
    return this;
  }

 /**
   * Get precise
   * @return precise
  **/
  @JsonProperty("precise")
  public Boolean getPrecise() {
    return precise;
  }

  public void setPrecise(Boolean precise) {
    this.precise = precise;
  }

  public DurationField precise(Boolean precise) {
    this.precise = precise;
    return this;
  }

 /**
   * Get unitMillis
   * @return unitMillis
  **/
  @JsonProperty("unitMillis")
  public Long getUnitMillis() {
    return unitMillis;
  }

  public void setUnitMillis(Long unitMillis) {
    this.unitMillis = unitMillis;
  }

  public DurationField unitMillis(Long unitMillis) {
    this.unitMillis = unitMillis;
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
    DurationField durationField = (DurationField) o;
    return Objects.equals(this.name, durationField.name) &&
        Objects.equals(this.type, durationField.type) &&
        Objects.equals(this.supported, durationField.supported) &&
        Objects.equals(this.precise, durationField.precise) &&
        Objects.equals(this.unitMillis, durationField.unitMillis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, supported, precise, unitMillis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DurationField {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
    sb.append("    precise: ").append(toIndentedString(precise)).append("\n");
    sb.append("    unitMillis: ").append(toIndentedString(unitMillis)).append("\n");
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

