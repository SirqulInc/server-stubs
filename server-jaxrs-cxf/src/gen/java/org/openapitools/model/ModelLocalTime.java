package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Chronology;
import org.openapitools.model.DateTimeField;
import org.openapitools.model.DateTimeFieldType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ModelLocalTime  {
  
  @ApiModelProperty(value = "")

  @Valid

  private Chronology chronology;

  @ApiModelProperty(value = "")

  private Integer hourOfDay;

  @ApiModelProperty(value = "")

  private Integer minuteOfHour;

  @ApiModelProperty(value = "")

  private Integer secondOfMinute;

  @ApiModelProperty(value = "")

  private Integer millisOfSecond;

  @ApiModelProperty(value = "")

  private Integer millisOfDay;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid DateTimeField> fields = new ArrayList<>();

  @ApiModelProperty(value = "")

  private List<Integer> values = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid DateTimeFieldType> fieldTypes = new ArrayList<>();
 /**
   * Get chronology
   * @return chronology
  **/
  @JsonProperty("chronology")
  public Chronology getChronology() {
    return chronology;
  }

  public void setChronology(Chronology chronology) {
    this.chronology = chronology;
  }

  public ModelLocalTime chronology(Chronology chronology) {
    this.chronology = chronology;
    return this;
  }

 /**
   * Get hourOfDay
   * @return hourOfDay
  **/
  @JsonProperty("hourOfDay")
  public Integer getHourOfDay() {
    return hourOfDay;
  }

  public void setHourOfDay(Integer hourOfDay) {
    this.hourOfDay = hourOfDay;
  }

  public ModelLocalTime hourOfDay(Integer hourOfDay) {
    this.hourOfDay = hourOfDay;
    return this;
  }

 /**
   * Get minuteOfHour
   * @return minuteOfHour
  **/
  @JsonProperty("minuteOfHour")
  public Integer getMinuteOfHour() {
    return minuteOfHour;
  }

  public void setMinuteOfHour(Integer minuteOfHour) {
    this.minuteOfHour = minuteOfHour;
  }

  public ModelLocalTime minuteOfHour(Integer minuteOfHour) {
    this.minuteOfHour = minuteOfHour;
    return this;
  }

 /**
   * Get secondOfMinute
   * @return secondOfMinute
  **/
  @JsonProperty("secondOfMinute")
  public Integer getSecondOfMinute() {
    return secondOfMinute;
  }

  public void setSecondOfMinute(Integer secondOfMinute) {
    this.secondOfMinute = secondOfMinute;
  }

  public ModelLocalTime secondOfMinute(Integer secondOfMinute) {
    this.secondOfMinute = secondOfMinute;
    return this;
  }

 /**
   * Get millisOfSecond
   * @return millisOfSecond
  **/
  @JsonProperty("millisOfSecond")
  public Integer getMillisOfSecond() {
    return millisOfSecond;
  }

  public void setMillisOfSecond(Integer millisOfSecond) {
    this.millisOfSecond = millisOfSecond;
  }

  public ModelLocalTime millisOfSecond(Integer millisOfSecond) {
    this.millisOfSecond = millisOfSecond;
    return this;
  }

 /**
   * Get millisOfDay
   * @return millisOfDay
  **/
  @JsonProperty("millisOfDay")
  public Integer getMillisOfDay() {
    return millisOfDay;
  }

  public void setMillisOfDay(Integer millisOfDay) {
    this.millisOfDay = millisOfDay;
  }

  public ModelLocalTime millisOfDay(Integer millisOfDay) {
    this.millisOfDay = millisOfDay;
    return this;
  }

 /**
   * Get fields
   * @return fields
  **/
  @JsonProperty("fields")
  public List<@Valid DateTimeField> getFields() {
    return fields;
  }

  public void setFields(List<@Valid DateTimeField> fields) {
    this.fields = fields;
  }

  public ModelLocalTime fields(List<@Valid DateTimeField> fields) {
    this.fields = fields;
    return this;
  }

  public ModelLocalTime addFieldsItem(DateTimeField fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

 /**
   * Get values
   * @return values
  **/
  @JsonProperty("values")
  public List<Integer> getValues() {
    return values;
  }

  public void setValues(List<Integer> values) {
    this.values = values;
  }

  public ModelLocalTime values(List<Integer> values) {
    this.values = values;
    return this;
  }

  public ModelLocalTime addValuesItem(Integer valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

 /**
   * Get fieldTypes
   * @return fieldTypes
  **/
  @JsonProperty("fieldTypes")
  public List<@Valid DateTimeFieldType> getFieldTypes() {
    return fieldTypes;
  }

  public void setFieldTypes(List<@Valid DateTimeFieldType> fieldTypes) {
    this.fieldTypes = fieldTypes;
  }

  public ModelLocalTime fieldTypes(List<@Valid DateTimeFieldType> fieldTypes) {
    this.fieldTypes = fieldTypes;
    return this;
  }

  public ModelLocalTime addFieldTypesItem(DateTimeFieldType fieldTypesItem) {
    this.fieldTypes.add(fieldTypesItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

