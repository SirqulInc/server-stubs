package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Recurrence
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Recurrence {

  /**
   * Gets or Sets frequency
   */
  public enum FrequencyEnum {
    DAILY("DAILY"),
    
    WEEKLY("WEEKLY"),
    
    MONTHLY("MONTHLY"),
    
    ANNUALLY("ANNUALLY"),
    
    WEEK_DAY_ONLY("WEEK_DAY_ONLY");

    private final String value;

    FrequencyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FrequencyEnum fromValue(String value) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable FrequencyEnum frequency;

  @Valid
  private List<Integer> daysOfWeek = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate start;

  private @Nullable Integer count;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate until;

  public Recurrence frequency(@Nullable FrequencyEnum frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
   */
  
  @Schema(name = "frequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("frequency")
  public @Nullable FrequencyEnum getFrequency() {
    return frequency;
  }

  public void setFrequency(@Nullable FrequencyEnum frequency) {
    this.frequency = frequency;
  }

  public Recurrence daysOfWeek(List<Integer> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }

  public Recurrence addDaysOfWeekItem(Integer daysOfWeekItem) {
    if (this.daysOfWeek == null) {
      this.daysOfWeek = new ArrayList<>();
    }
    this.daysOfWeek.add(daysOfWeekItem);
    return this;
  }

  /**
   * Get daysOfWeek
   * @return daysOfWeek
   */
  
  @Schema(name = "daysOfWeek", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("daysOfWeek")
  public List<Integer> getDaysOfWeek() {
    return daysOfWeek;
  }

  public void setDaysOfWeek(List<Integer> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }

  public Recurrence start(@Nullable LocalDate start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
   */
  @Valid 
  @Schema(name = "start", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start")
  public @Nullable LocalDate getStart() {
    return start;
  }

  public void setStart(@Nullable LocalDate start) {
    this.start = start;
  }

  public Recurrence count(@Nullable Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
   */
  
  @Schema(name = "count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public @Nullable Integer getCount() {
    return count;
  }

  public void setCount(@Nullable Integer count) {
    this.count = count;
  }

  public Recurrence until(@Nullable LocalDate until) {
    this.until = until;
    return this;
  }

  /**
   * Get until
   * @return until
   */
  @Valid 
  @Schema(name = "until", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("until")
  public @Nullable LocalDate getUntil() {
    return until;
  }

  public void setUntil(@Nullable LocalDate until) {
    this.until = until;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recurrence recurrence = (Recurrence) o;
    return Objects.equals(this.frequency, recurrence.frequency) &&
        Objects.equals(this.daysOfWeek, recurrence.daysOfWeek) &&
        Objects.equals(this.start, recurrence.start) &&
        Objects.equals(this.count, recurrence.count) &&
        Objects.equals(this.until, recurrence.until);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequency, daysOfWeek, start, count, until);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recurrence {\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    until: ").append(toIndentedString(until)).append("\n");
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

