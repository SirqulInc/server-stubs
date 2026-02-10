package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.DurationFieldType;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DateTimeFieldType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class DateTimeFieldType {

  private @Nullable String name;

  private @Nullable DurationFieldType rangeDurationType;

  private @Nullable DurationFieldType durationType;

  public DateTimeFieldType name(@Nullable String name) {
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

  public DateTimeFieldType rangeDurationType(@Nullable DurationFieldType rangeDurationType) {
    this.rangeDurationType = rangeDurationType;
    return this;
  }

  /**
   * Get rangeDurationType
   * @return rangeDurationType
   */
  @Valid 
  @Schema(name = "rangeDurationType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rangeDurationType")
  public @Nullable DurationFieldType getRangeDurationType() {
    return rangeDurationType;
  }

  public void setRangeDurationType(@Nullable DurationFieldType rangeDurationType) {
    this.rangeDurationType = rangeDurationType;
  }

  public DateTimeFieldType durationType(@Nullable DurationFieldType durationType) {
    this.durationType = durationType;
    return this;
  }

  /**
   * Get durationType
   * @return durationType
   */
  @Valid 
  @Schema(name = "durationType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("durationType")
  public @Nullable DurationFieldType getDurationType() {
    return durationType;
  }

  public void setDurationType(@Nullable DurationFieldType durationType) {
    this.durationType = durationType;
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

