package org.openapitools.model;

import org.openapitools.model.DateTimeFieldType;
import org.openapitools.model.DurationField;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DateTimeField  {
  
  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  @Valid

  private DateTimeFieldType type;

  @ApiModelProperty(value = "")

  private Boolean supported;

  @ApiModelProperty(value = "")

  private Integer minimumValue;

  @ApiModelProperty(value = "")

  private Integer maximumValue;

  @ApiModelProperty(value = "")

  @Valid

  private DurationField durationField;

  @ApiModelProperty(value = "")

  @Valid

  private DurationField leapDurationField;

  @ApiModelProperty(value = "")

  @Valid

  private DurationField rangeDurationField;

  @ApiModelProperty(value = "")

  private Boolean lenient;
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

  public DateTimeField name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public DateTimeFieldType getType() {
    return type;
  }

  public void setType(DateTimeFieldType type) {
    this.type = type;
  }

  public DateTimeField type(DateTimeFieldType type) {
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

  public DateTimeField supported(Boolean supported) {
    this.supported = supported;
    return this;
  }

 /**
   * Get minimumValue
   * @return minimumValue
  **/
  @JsonProperty("minimumValue")
  public Integer getMinimumValue() {
    return minimumValue;
  }

  public void setMinimumValue(Integer minimumValue) {
    this.minimumValue = minimumValue;
  }

  public DateTimeField minimumValue(Integer minimumValue) {
    this.minimumValue = minimumValue;
    return this;
  }

 /**
   * Get maximumValue
   * @return maximumValue
  **/
  @JsonProperty("maximumValue")
  public Integer getMaximumValue() {
    return maximumValue;
  }

  public void setMaximumValue(Integer maximumValue) {
    this.maximumValue = maximumValue;
  }

  public DateTimeField maximumValue(Integer maximumValue) {
    this.maximumValue = maximumValue;
    return this;
  }

 /**
   * Get durationField
   * @return durationField
  **/
  @JsonProperty("durationField")
  public DurationField getDurationField() {
    return durationField;
  }

  public void setDurationField(DurationField durationField) {
    this.durationField = durationField;
  }

  public DateTimeField durationField(DurationField durationField) {
    this.durationField = durationField;
    return this;
  }

 /**
   * Get leapDurationField
   * @return leapDurationField
  **/
  @JsonProperty("leapDurationField")
  public DurationField getLeapDurationField() {
    return leapDurationField;
  }

  public void setLeapDurationField(DurationField leapDurationField) {
    this.leapDurationField = leapDurationField;
  }

  public DateTimeField leapDurationField(DurationField leapDurationField) {
    this.leapDurationField = leapDurationField;
    return this;
  }

 /**
   * Get rangeDurationField
   * @return rangeDurationField
  **/
  @JsonProperty("rangeDurationField")
  public DurationField getRangeDurationField() {
    return rangeDurationField;
  }

  public void setRangeDurationField(DurationField rangeDurationField) {
    this.rangeDurationField = rangeDurationField;
  }

  public DateTimeField rangeDurationField(DurationField rangeDurationField) {
    this.rangeDurationField = rangeDurationField;
    return this;
  }

 /**
   * Get lenient
   * @return lenient
  **/
  @JsonProperty("lenient")
  public Boolean getLenient() {
    return lenient;
  }

  public void setLenient(Boolean lenient) {
    this.lenient = lenient;
  }

  public DateTimeField lenient(Boolean lenient) {
    this.lenient = lenient;
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
    DateTimeField dateTimeField = (DateTimeField) o;
    return Objects.equals(this.name, dateTimeField.name) &&
        Objects.equals(this.type, dateTimeField.type) &&
        Objects.equals(this.supported, dateTimeField.supported) &&
        Objects.equals(this.minimumValue, dateTimeField.minimumValue) &&
        Objects.equals(this.maximumValue, dateTimeField.maximumValue) &&
        Objects.equals(this.durationField, dateTimeField.durationField) &&
        Objects.equals(this.leapDurationField, dateTimeField.leapDurationField) &&
        Objects.equals(this.rangeDurationField, dateTimeField.rangeDurationField) &&
        Objects.equals(this.lenient, dateTimeField.lenient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, supported, minimumValue, maximumValue, durationField, leapDurationField, rangeDurationField, lenient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeField {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
    sb.append("    minimumValue: ").append(toIndentedString(minimumValue)).append("\n");
    sb.append("    maximumValue: ").append(toIndentedString(maximumValue)).append("\n");
    sb.append("    durationField: ").append(toIndentedString(durationField)).append("\n");
    sb.append("    leapDurationField: ").append(toIndentedString(leapDurationField)).append("\n");
    sb.append("    rangeDurationField: ").append(toIndentedString(rangeDurationField)).append("\n");
    sb.append("    lenient: ").append(toIndentedString(lenient)).append("\n");
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

