package apimodels;

import apimodels.Chronology;
import apimodels.DateTimeField;
import apimodels.DateTimeFieldType;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModelLocalTime
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ModelLocalTime   {
  @JsonProperty("chronology")
  @Valid

  private Chronology chronology;

  @JsonProperty("hourOfDay")
  
  private Integer hourOfDay;

  @JsonProperty("minuteOfHour")
  
  private Integer minuteOfHour;

  @JsonProperty("secondOfMinute")
  
  private Integer secondOfMinute;

  @JsonProperty("millisOfSecond")
  
  private Integer millisOfSecond;

  @JsonProperty("millisOfDay")
  
  private Integer millisOfDay;

  @JsonProperty("fields")
  @Valid

  private List<@Valid DateTimeField> fields = null;

  @JsonProperty("values")
  
  private List<Integer> values = null;

  @JsonProperty("fieldTypes")
  @Valid

  private List<@Valid DateTimeFieldType> fieldTypes = null;

  public ModelLocalTime chronology(Chronology chronology) {
    this.chronology = chronology;
    return this;
  }

   /**
   * Get chronology
   * @return chronology
  **/
  public Chronology getChronology() {
    return chronology;
  }

  public void setChronology(Chronology chronology) {
    this.chronology = chronology;
  }

  public ModelLocalTime hourOfDay(Integer hourOfDay) {
    this.hourOfDay = hourOfDay;
    return this;
  }

   /**
   * Get hourOfDay
   * @return hourOfDay
  **/
  public Integer getHourOfDay() {
    return hourOfDay;
  }

  public void setHourOfDay(Integer hourOfDay) {
    this.hourOfDay = hourOfDay;
  }

  public ModelLocalTime minuteOfHour(Integer minuteOfHour) {
    this.minuteOfHour = minuteOfHour;
    return this;
  }

   /**
   * Get minuteOfHour
   * @return minuteOfHour
  **/
  public Integer getMinuteOfHour() {
    return minuteOfHour;
  }

  public void setMinuteOfHour(Integer minuteOfHour) {
    this.minuteOfHour = minuteOfHour;
  }

  public ModelLocalTime secondOfMinute(Integer secondOfMinute) {
    this.secondOfMinute = secondOfMinute;
    return this;
  }

   /**
   * Get secondOfMinute
   * @return secondOfMinute
  **/
  public Integer getSecondOfMinute() {
    return secondOfMinute;
  }

  public void setSecondOfMinute(Integer secondOfMinute) {
    this.secondOfMinute = secondOfMinute;
  }

  public ModelLocalTime millisOfSecond(Integer millisOfSecond) {
    this.millisOfSecond = millisOfSecond;
    return this;
  }

   /**
   * Get millisOfSecond
   * @return millisOfSecond
  **/
  public Integer getMillisOfSecond() {
    return millisOfSecond;
  }

  public void setMillisOfSecond(Integer millisOfSecond) {
    this.millisOfSecond = millisOfSecond;
  }

  public ModelLocalTime millisOfDay(Integer millisOfDay) {
    this.millisOfDay = millisOfDay;
    return this;
  }

   /**
   * Get millisOfDay
   * @return millisOfDay
  **/
  public Integer getMillisOfDay() {
    return millisOfDay;
  }

  public void setMillisOfDay(Integer millisOfDay) {
    this.millisOfDay = millisOfDay;
  }

  public ModelLocalTime fields(List<@Valid DateTimeField> fields) {
    this.fields = fields;
    return this;
  }

  public ModelLocalTime addFieldsItem(DateTimeField fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  public List<@Valid DateTimeField> getFields() {
    return fields;
  }

  public void setFields(List<@Valid DateTimeField> fields) {
    this.fields = fields;
  }

  public ModelLocalTime values(List<Integer> values) {
    this.values = values;
    return this;
  }

  public ModelLocalTime addValuesItem(Integer valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  public List<Integer> getValues() {
    return values;
  }

  public void setValues(List<Integer> values) {
    this.values = values;
  }

  public ModelLocalTime fieldTypes(List<@Valid DateTimeFieldType> fieldTypes) {
    this.fieldTypes = fieldTypes;
    return this;
  }

  public ModelLocalTime addFieldTypesItem(DateTimeFieldType fieldTypesItem) {
    if (this.fieldTypes == null) {
      this.fieldTypes = new ArrayList<>();
    }
    this.fieldTypes.add(fieldTypesItem);
    return this;
  }

   /**
   * Get fieldTypes
   * @return fieldTypes
  **/
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
    return Objects.equals(chronology, _localTime.chronology) &&
        Objects.equals(hourOfDay, _localTime.hourOfDay) &&
        Objects.equals(minuteOfHour, _localTime.minuteOfHour) &&
        Objects.equals(secondOfMinute, _localTime.secondOfMinute) &&
        Objects.equals(millisOfSecond, _localTime.millisOfSecond) &&
        Objects.equals(millisOfDay, _localTime.millisOfDay) &&
        Objects.equals(fields, _localTime.fields) &&
        Objects.equals(values, _localTime.values) &&
        Objects.equals(fieldTypes, _localTime.fieldTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chronology, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond, millisOfDay, fields, values, fieldTypes);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

