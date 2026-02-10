package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Chronology;
import org.openapitools.model.DateTimeField;
import org.openapitools.model.DateTimeFieldType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ModelLocalTime   {
  
  private Chronology chronology;
  private Integer hourOfDay;
  private Integer minuteOfHour;
  private Integer secondOfMinute;
  private Integer millisOfSecond;
  private Integer millisOfDay;
  private List<@Valid DateTimeField> fields = new ArrayList<>();
  private List<Integer> values = new ArrayList<>();
  private List<@Valid DateTimeFieldType> fieldTypes = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("chronology")
  @Valid
  public Chronology getChronology() {
    return chronology;
  }
  public void setChronology(Chronology chronology) {
    this.chronology = chronology;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hourOfDay")
  public Integer getHourOfDay() {
    return hourOfDay;
  }
  public void setHourOfDay(Integer hourOfDay) {
    this.hourOfDay = hourOfDay;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("minuteOfHour")
  public Integer getMinuteOfHour() {
    return minuteOfHour;
  }
  public void setMinuteOfHour(Integer minuteOfHour) {
    this.minuteOfHour = minuteOfHour;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("secondOfMinute")
  public Integer getSecondOfMinute() {
    return secondOfMinute;
  }
  public void setSecondOfMinute(Integer secondOfMinute) {
    this.secondOfMinute = secondOfMinute;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("millisOfSecond")
  public Integer getMillisOfSecond() {
    return millisOfSecond;
  }
  public void setMillisOfSecond(Integer millisOfSecond) {
    this.millisOfSecond = millisOfSecond;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("millisOfDay")
  public Integer getMillisOfDay() {
    return millisOfDay;
  }
  public void setMillisOfDay(Integer millisOfDay) {
    this.millisOfDay = millisOfDay;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fields")
  @Valid
  public List<@Valid DateTimeField> getFields() {
    return fields;
  }
  public void setFields(List<@Valid DateTimeField> fields) {
    this.fields = fields;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("values")
  public List<Integer> getValues() {
    return values;
  }
  public void setValues(List<Integer> values) {
    this.values = values;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fieldTypes")
  @Valid
  public List<@Valid DateTimeFieldType> getFieldTypes() {
    return fieldTypes;
  }
  public void setFieldTypes(List<@Valid DateTimeFieldType> fieldTypes) {
    this.fieldTypes = fieldTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelLocalTime _localTime = (ModelLocalTime) o;
    return Objects.equals(this.chronology, _localTime.chronology) &&
        Objects.equals(this.hourOfDay, _localTime.hourOfDay) &&
        Objects.equals(this.minuteOfHour, _localTime.minuteOfHour) &&
        Objects.equals(this.secondOfMinute, _localTime.secondOfMinute) &&
        Objects.equals(this.millisOfSecond, _localTime.millisOfSecond) &&
        Objects.equals(this.millisOfDay, _localTime.millisOfDay) &&
        Objects.equals(this.fields, _localTime.fields) &&
        Objects.equals(this.values, _localTime.values) &&
        Objects.equals(this.fieldTypes, _localTime.fieldTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chronology, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond, millisOfDay, fields, values, fieldTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelLocalTime {\n");
    
    sb.append("    chronology: ").append(toIndentedString(chronology)).append("\n");
    sb.append("    hourOfDay: ").append(toIndentedString(hourOfDay)).append("\n");
    sb.append("    minuteOfHour: ").append(toIndentedString(minuteOfHour)).append("\n");
    sb.append("    secondOfMinute: ").append(toIndentedString(secondOfMinute)).append("\n");
    sb.append("    millisOfSecond: ").append(toIndentedString(millisOfSecond)).append("\n");
    sb.append("    millisOfDay: ").append(toIndentedString(millisOfDay)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    fieldTypes: ").append(toIndentedString(fieldTypes)).append("\n");
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

