package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Chronology;
import org.openapitools.model.DateTimeField;
import org.openapitools.model.DateTimeFieldType;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ModelLocalTime
 */

@JsonTypeName("LocalTime")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ModelLocalTime {

  private @Nullable Chronology chronology;

  private @Nullable Integer hourOfDay;

  private @Nullable Integer minuteOfHour;

  private @Nullable Integer secondOfMinute;

  private @Nullable Integer millisOfSecond;

  private @Nullable Integer millisOfDay;

  @Valid
  private List<@Valid DateTimeField> fields = new ArrayList<>();

  @Valid
  private List<Integer> values = new ArrayList<>();

  @Valid
  private List<@Valid DateTimeFieldType> fieldTypes = new ArrayList<>();

  public ModelLocalTime chronology(@Nullable Chronology chronology) {
    this.chronology = chronology;
    return this;
  }

  /**
   * Get chronology
   * @return chronology
   */
  @Valid 
  @Schema(name = "chronology", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("chronology")
  public @Nullable Chronology getChronology() {
    return chronology;
  }

  public void setChronology(@Nullable Chronology chronology) {
    this.chronology = chronology;
  }

  public ModelLocalTime hourOfDay(@Nullable Integer hourOfDay) {
    this.hourOfDay = hourOfDay;
    return this;
  }

  /**
   * Get hourOfDay
   * @return hourOfDay
   */
  
  @Schema(name = "hourOfDay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hourOfDay")
  public @Nullable Integer getHourOfDay() {
    return hourOfDay;
  }

  public void setHourOfDay(@Nullable Integer hourOfDay) {
    this.hourOfDay = hourOfDay;
  }

  public ModelLocalTime minuteOfHour(@Nullable Integer minuteOfHour) {
    this.minuteOfHour = minuteOfHour;
    return this;
  }

  /**
   * Get minuteOfHour
   * @return minuteOfHour
   */
  
  @Schema(name = "minuteOfHour", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minuteOfHour")
  public @Nullable Integer getMinuteOfHour() {
    return minuteOfHour;
  }

  public void setMinuteOfHour(@Nullable Integer minuteOfHour) {
    this.minuteOfHour = minuteOfHour;
  }

  public ModelLocalTime secondOfMinute(@Nullable Integer secondOfMinute) {
    this.secondOfMinute = secondOfMinute;
    return this;
  }

  /**
   * Get secondOfMinute
   * @return secondOfMinute
   */
  
  @Schema(name = "secondOfMinute", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondOfMinute")
  public @Nullable Integer getSecondOfMinute() {
    return secondOfMinute;
  }

  public void setSecondOfMinute(@Nullable Integer secondOfMinute) {
    this.secondOfMinute = secondOfMinute;
  }

  public ModelLocalTime millisOfSecond(@Nullable Integer millisOfSecond) {
    this.millisOfSecond = millisOfSecond;
    return this;
  }

  /**
   * Get millisOfSecond
   * @return millisOfSecond
   */
  
  @Schema(name = "millisOfSecond", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("millisOfSecond")
  public @Nullable Integer getMillisOfSecond() {
    return millisOfSecond;
  }

  public void setMillisOfSecond(@Nullable Integer millisOfSecond) {
    this.millisOfSecond = millisOfSecond;
  }

  public ModelLocalTime millisOfDay(@Nullable Integer millisOfDay) {
    this.millisOfDay = millisOfDay;
    return this;
  }

  /**
   * Get millisOfDay
   * @return millisOfDay
   */
  
  @Schema(name = "millisOfDay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("millisOfDay")
  public @Nullable Integer getMillisOfDay() {
    return millisOfDay;
  }

  public void setMillisOfDay(@Nullable Integer millisOfDay) {
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
   */
  @Valid 
  @Schema(name = "fields", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fields")
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
   */
  
  @Schema(name = "values", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("values")
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
   */
  @Valid 
  @Schema(name = "fieldTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fieldTypes")
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

