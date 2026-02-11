package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.openapitools.model.Chronology;
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
 * Interval
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Interval {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime end;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime start;

  private @Nullable Chronology chronology;

  private @Nullable Long startMillis;

  private @Nullable Long endMillis;

  private @Nullable Boolean beforeNow;

  private @Nullable Boolean afterNow;

  public Interval end(@Nullable OffsetDateTime end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
   */
  @Valid 
  @Schema(name = "end", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end")
  public @Nullable OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(@Nullable OffsetDateTime end) {
    this.end = end;
  }

  public Interval start(@Nullable OffsetDateTime start) {
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
  public @Nullable OffsetDateTime getStart() {
    return start;
  }

  public void setStart(@Nullable OffsetDateTime start) {
    this.start = start;
  }

  public Interval chronology(@Nullable Chronology chronology) {
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

  public Interval startMillis(@Nullable Long startMillis) {
    this.startMillis = startMillis;
    return this;
  }

  /**
   * Get startMillis
   * @return startMillis
   */
  
  @Schema(name = "startMillis", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startMillis")
  public @Nullable Long getStartMillis() {
    return startMillis;
  }

  public void setStartMillis(@Nullable Long startMillis) {
    this.startMillis = startMillis;
  }

  public Interval endMillis(@Nullable Long endMillis) {
    this.endMillis = endMillis;
    return this;
  }

  /**
   * Get endMillis
   * @return endMillis
   */
  
  @Schema(name = "endMillis", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endMillis")
  public @Nullable Long getEndMillis() {
    return endMillis;
  }

  public void setEndMillis(@Nullable Long endMillis) {
    this.endMillis = endMillis;
  }

  public Interval beforeNow(@Nullable Boolean beforeNow) {
    this.beforeNow = beforeNow;
    return this;
  }

  /**
   * Get beforeNow
   * @return beforeNow
   */
  
  @Schema(name = "beforeNow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("beforeNow")
  public @Nullable Boolean getBeforeNow() {
    return beforeNow;
  }

  public void setBeforeNow(@Nullable Boolean beforeNow) {
    this.beforeNow = beforeNow;
  }

  public Interval afterNow(@Nullable Boolean afterNow) {
    this.afterNow = afterNow;
    return this;
  }

  /**
   * Get afterNow
   * @return afterNow
   */
  
  @Schema(name = "afterNow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("afterNow")
  public @Nullable Boolean getAfterNow() {
    return afterNow;
  }

  public void setAfterNow(@Nullable Boolean afterNow) {
    this.afterNow = afterNow;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Interval interval = (Interval) o;
    return Objects.equals(this.end, interval.end) &&
        Objects.equals(this.start, interval.start) &&
        Objects.equals(this.chronology, interval.chronology) &&
        Objects.equals(this.startMillis, interval.startMillis) &&
        Objects.equals(this.endMillis, interval.endMillis) &&
        Objects.equals(this.beforeNow, interval.beforeNow) &&
        Objects.equals(this.afterNow, interval.afterNow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, start, chronology, startMillis, endMillis, beforeNow, afterNow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Interval {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    chronology: ").append(toIndentedString(chronology)).append("\n");
    sb.append("    startMillis: ").append(toIndentedString(startMillis)).append("\n");
    sb.append("    endMillis: ").append(toIndentedString(endMillis)).append("\n");
    sb.append("    beforeNow: ").append(toIndentedString(beforeNow)).append("\n");
    sb.append("    afterNow: ").append(toIndentedString(afterNow)).append("\n");
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

