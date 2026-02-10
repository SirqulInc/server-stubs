package apimodels;

import apimodels.Chronology;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Interval
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Interval   {
  @JsonProperty("end")
  @Valid

  private OffsetDateTime end;

  @JsonProperty("start")
  @Valid

  private OffsetDateTime start;

  @JsonProperty("chronology")
  @Valid

  private Chronology chronology;

  @JsonProperty("startMillis")
  
  private Long startMillis;

  @JsonProperty("endMillis")
  
  private Long endMillis;

  @JsonProperty("beforeNow")
  
  private Boolean beforeNow;

  @JsonProperty("afterNow")
  
  private Boolean afterNow;

  public Interval end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  public Interval start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public Interval chronology(Chronology chronology) {
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

  public Interval startMillis(Long startMillis) {
    this.startMillis = startMillis;
    return this;
  }

   /**
   * Get startMillis
   * @return startMillis
  **/
  public Long getStartMillis() {
    return startMillis;
  }

  public void setStartMillis(Long startMillis) {
    this.startMillis = startMillis;
  }

  public Interval endMillis(Long endMillis) {
    this.endMillis = endMillis;
    return this;
  }

   /**
   * Get endMillis
   * @return endMillis
  **/
  public Long getEndMillis() {
    return endMillis;
  }

  public void setEndMillis(Long endMillis) {
    this.endMillis = endMillis;
  }

  public Interval beforeNow(Boolean beforeNow) {
    this.beforeNow = beforeNow;
    return this;
  }

   /**
   * Get beforeNow
   * @return beforeNow
  **/
  public Boolean getBeforeNow() {
    return beforeNow;
  }

  public void setBeforeNow(Boolean beforeNow) {
    this.beforeNow = beforeNow;
  }

  public Interval afterNow(Boolean afterNow) {
    this.afterNow = afterNow;
    return this;
  }

   /**
   * Get afterNow
   * @return afterNow
  **/
  public Boolean getAfterNow() {
    return afterNow;
  }

  public void setAfterNow(Boolean afterNow) {
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
    return Objects.equals(end, interval.end) &&
        Objects.equals(start, interval.start) &&
        Objects.equals(chronology, interval.chronology) &&
        Objects.equals(startMillis, interval.startMillis) &&
        Objects.equals(endMillis, interval.endMillis) &&
        Objects.equals(beforeNow, interval.beforeNow) &&
        Objects.equals(afterNow, interval.afterNow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, start, chronology, startMillis, endMillis, beforeNow, afterNow);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

