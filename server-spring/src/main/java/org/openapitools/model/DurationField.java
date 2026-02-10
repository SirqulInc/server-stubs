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
 * DurationField
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class DurationField {

  private @Nullable String name;

  private @Nullable DurationFieldType type;

  private @Nullable Boolean supported;

  private @Nullable Boolean precise;

  private @Nullable Long unitMillis;

  public DurationField name(@Nullable String name) {
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

  public DurationField type(@Nullable DurationFieldType type) {
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
  public @Nullable DurationFieldType getType() {
    return type;
  }

  public void setType(@Nullable DurationFieldType type) {
    this.type = type;
  }

  public DurationField supported(@Nullable Boolean supported) {
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

  public DurationField precise(@Nullable Boolean precise) {
    this.precise = precise;
    return this;
  }

  /**
   * Get precise
   * @return precise
   */
  
  @Schema(name = "precise", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("precise")
  public @Nullable Boolean getPrecise() {
    return precise;
  }

  public void setPrecise(@Nullable Boolean precise) {
    this.precise = precise;
  }

  public DurationField unitMillis(@Nullable Long unitMillis) {
    this.unitMillis = unitMillis;
    return this;
  }

  /**
   * Get unitMillis
   * @return unitMillis
   */
  
  @Schema(name = "unitMillis", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unitMillis")
  public @Nullable Long getUnitMillis() {
    return unitMillis;
  }

  public void setUnitMillis(@Nullable Long unitMillis) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

