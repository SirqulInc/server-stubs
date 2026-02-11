package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.DateTimeFieldType;
import org.openapitools.model.DurationField;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DateTimeField
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class DateTimeField {

  private @Nullable String name;

  private @Nullable DateTimeFieldType type;

  private @Nullable Boolean supported;

  private @Nullable Integer minimumValue;

  private @Nullable Integer maximumValue;

  private @Nullable DurationField durationField;

  private @Nullable DurationField leapDurationField;

  private @Nullable DurationField rangeDurationField;

  private @Nullable Boolean lenient;

  public DateTimeField name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public DateTimeField type(@Nullable DateTimeFieldType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable DateTimeFieldType getType() {
    return type;
  }

  public void setType(@Nullable DateTimeFieldType type) {
    this.type = type;
  }

  public DateTimeField supported(@Nullable Boolean supported) {
    this.supported = supported;
    return this;
  }

  /**
   * Get supported
   * @return supported
   */
  
  @Schema(name = "supported", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supported")
  public @Nullable Boolean getSupported() {
    return supported;
  }

  public void setSupported(@Nullable Boolean supported) {
    this.supported = supported;
  }

  public DateTimeField minimumValue(@Nullable Integer minimumValue) {
    this.minimumValue = minimumValue;
    return this;
  }

  /**
   * Get minimumValue
   * @return minimumValue
   */
  
  @Schema(name = "minimumValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minimumValue")
  public @Nullable Integer getMinimumValue() {
    return minimumValue;
  }

  public void setMinimumValue(@Nullable Integer minimumValue) {
    this.minimumValue = minimumValue;
  }

  public DateTimeField maximumValue(@Nullable Integer maximumValue) {
    this.maximumValue = maximumValue;
    return this;
  }

  /**
   * Get maximumValue
   * @return maximumValue
   */
  
  @Schema(name = "maximumValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maximumValue")
  public @Nullable Integer getMaximumValue() {
    return maximumValue;
  }

  public void setMaximumValue(@Nullable Integer maximumValue) {
    this.maximumValue = maximumValue;
  }

  public DateTimeField durationField(@Nullable DurationField durationField) {
    this.durationField = durationField;
    return this;
  }

  /**
   * Get durationField
   * @return durationField
   */
  @Valid 
  @Schema(name = "durationField", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("durationField")
  public @Nullable DurationField getDurationField() {
    return durationField;
  }

  public void setDurationField(@Nullable DurationField durationField) {
    this.durationField = durationField;
  }

  public DateTimeField leapDurationField(@Nullable DurationField leapDurationField) {
    this.leapDurationField = leapDurationField;
    return this;
  }

  /**
   * Get leapDurationField
   * @return leapDurationField
   */
  @Valid 
  @Schema(name = "leapDurationField", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("leapDurationField")
  public @Nullable DurationField getLeapDurationField() {
    return leapDurationField;
  }

  public void setLeapDurationField(@Nullable DurationField leapDurationField) {
    this.leapDurationField = leapDurationField;
  }

  public DateTimeField rangeDurationField(@Nullable DurationField rangeDurationField) {
    this.rangeDurationField = rangeDurationField;
    return this;
  }

  /**
   * Get rangeDurationField
   * @return rangeDurationField
   */
  @Valid 
  @Schema(name = "rangeDurationField", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rangeDurationField")
  public @Nullable DurationField getRangeDurationField() {
    return rangeDurationField;
  }

  public void setRangeDurationField(@Nullable DurationField rangeDurationField) {
    this.rangeDurationField = rangeDurationField;
  }

  public DateTimeField lenient(@Nullable Boolean lenient) {
    this.lenient = lenient;
    return this;
  }

  /**
   * Get lenient
   * @return lenient
   */
  
  @Schema(name = "lenient", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lenient")
  public @Nullable Boolean getLenient() {
    return lenient;
  }

  public void setLenient(@Nullable Boolean lenient) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

