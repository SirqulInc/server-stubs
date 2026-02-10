package org.openapitools.model;

import org.openapitools.model.DurationFieldType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DateTimeFieldType  {
  
  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  @Valid

  private DurationFieldType rangeDurationType;

  @ApiModelProperty(value = "")

  @Valid

  private DurationFieldType durationType;
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

  public DateTimeFieldType name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get rangeDurationType
   * @return rangeDurationType
  **/
  @JsonProperty("rangeDurationType")
  public DurationFieldType getRangeDurationType() {
    return rangeDurationType;
  }

  public void setRangeDurationType(DurationFieldType rangeDurationType) {
    this.rangeDurationType = rangeDurationType;
  }

  public DateTimeFieldType rangeDurationType(DurationFieldType rangeDurationType) {
    this.rangeDurationType = rangeDurationType;
    return this;
  }

 /**
   * Get durationType
   * @return durationType
  **/
  @JsonProperty("durationType")
  public DurationFieldType getDurationType() {
    return durationType;
  }

  public void setDurationType(DurationFieldType durationType) {
    this.durationType = durationType;
  }

  public DateTimeFieldType durationType(DurationFieldType durationType) {
    this.durationType = durationType;
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
    DateTimeFieldType dateTimeFieldType = (DateTimeFieldType) o;
    return Objects.equals(this.name, dateTimeFieldType.name) &&
        Objects.equals(this.rangeDurationType, dateTimeFieldType.rangeDurationType) &&
        Objects.equals(this.durationType, dateTimeFieldType.durationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, rangeDurationType, durationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeFieldType {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rangeDurationType: ").append(toIndentedString(rangeDurationType)).append("\n");
    sb.append("    durationType: ").append(toIndentedString(durationType)).append("\n");
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

