package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DateTimeFieldType;
import org.openapitools.model.DurationField;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class DateTimeField   {
  
  private String name;
  private DateTimeFieldType type;
  private Boolean supported;
  private Integer minimumValue;
  private Integer maximumValue;
  private DurationField durationField;
  private DurationField leapDurationField;
  private DurationField rangeDurationField;
  private Boolean lenient;

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
  public DateTimeFieldType getType() {
    return type;
  }
  public void setType(DateTimeFieldType type) {
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
  @JsonProperty("minimumValue")
  public Integer getMinimumValue() {
    return minimumValue;
  }
  public void setMinimumValue(Integer minimumValue) {
    this.minimumValue = minimumValue;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maximumValue")
  public Integer getMaximumValue() {
    return maximumValue;
  }
  public void setMaximumValue(Integer maximumValue) {
    this.maximumValue = maximumValue;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("durationField")
  @Valid
  public DurationField getDurationField() {
    return durationField;
  }
  public void setDurationField(DurationField durationField) {
    this.durationField = durationField;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("leapDurationField")
  @Valid
  public DurationField getLeapDurationField() {
    return leapDurationField;
  }
  public void setLeapDurationField(DurationField leapDurationField) {
    this.leapDurationField = leapDurationField;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rangeDurationField")
  @Valid
  public DurationField getRangeDurationField() {
    return rangeDurationField;
  }
  public void setRangeDurationField(DurationField rangeDurationField) {
    this.rangeDurationField = rangeDurationField;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lenient")
  public Boolean getLenient() {
    return lenient;
  }
  public void setLenient(Boolean lenient) {
    this.lenient = lenient;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

