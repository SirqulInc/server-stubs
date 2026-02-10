package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ReportTypeResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ReportTypeResponse {

  private @Nullable String type;

  private @Nullable String javaType;

  private @Nullable String label;

  private @Nullable Boolean number;

  private @Nullable Boolean majorAxis;

  public ReportTypeResponse type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable String getType() {
    return type;
  }

  public void setType(@Nullable String type) {
    this.type = type;
  }

  public ReportTypeResponse javaType(@Nullable String javaType) {
    this.javaType = javaType;
    return this;
  }

  /**
   * Get javaType
   * @return javaType
   */
  
  @Schema(name = "javaType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("javaType")
  public @Nullable String getJavaType() {
    return javaType;
  }

  public void setJavaType(@Nullable String javaType) {
    this.javaType = javaType;
  }

  public ReportTypeResponse label(@Nullable String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
   */
  
  @Schema(name = "label", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("label")
  public @Nullable String getLabel() {
    return label;
  }

  public void setLabel(@Nullable String label) {
    this.label = label;
  }

  public ReportTypeResponse number(@Nullable Boolean number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
   */
  
  @Schema(name = "number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number")
  public @Nullable Boolean getNumber() {
    return number;
  }

  public void setNumber(@Nullable Boolean number) {
    this.number = number;
  }

  public ReportTypeResponse majorAxis(@Nullable Boolean majorAxis) {
    this.majorAxis = majorAxis;
    return this;
  }

  /**
   * Get majorAxis
   * @return majorAxis
   */
  
  @Schema(name = "majorAxis", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("majorAxis")
  public @Nullable Boolean getMajorAxis() {
    return majorAxis;
  }

  public void setMajorAxis(@Nullable Boolean majorAxis) {
    this.majorAxis = majorAxis;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportTypeResponse reportTypeResponse = (ReportTypeResponse) o;
    return Objects.equals(this.type, reportTypeResponse.type) &&
        Objects.equals(this.javaType, reportTypeResponse.javaType) &&
        Objects.equals(this.label, reportTypeResponse.label) &&
        Objects.equals(this.number, reportTypeResponse.number) &&
        Objects.equals(this.majorAxis, reportTypeResponse.majorAxis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, javaType, label, number, majorAxis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportTypeResponse {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    javaType: ").append(toIndentedString(javaType)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    majorAxis: ").append(toIndentedString(majorAxis)).append("\n");
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

