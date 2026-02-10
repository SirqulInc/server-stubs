package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DurationFieldType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class DurationField   {
  
  private String name;
  private DurationFieldType type;
  private Boolean supported;
  private Boolean precise;
  private Long unitMillis;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  @Valid
  public DurationFieldType getType() {
    return type;
  }
  public void setType(DurationFieldType type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("supported")
  public Boolean getSupported() {
    return supported;
  }
  public void setSupported(Boolean supported) {
    this.supported = supported;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("precise")
  public Boolean getPrecise() {
    return precise;
  }
  public void setPrecise(Boolean precise) {
    this.precise = precise;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("unitMillis")
  public Long getUnitMillis() {
    return unitMillis;
  }
  public void setUnitMillis(Long unitMillis) {
    this.unitMillis = unitMillis;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

