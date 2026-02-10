package org.openapitools.model;

import java.util.Date;
import org.openapitools.model.Chronology;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Interval  {
  
  @ApiModelProperty(value = "")

  private Date end;

  @ApiModelProperty(value = "")

  private Date start;

  @ApiModelProperty(value = "")

  @Valid

  private Chronology chronology;

  @ApiModelProperty(value = "")

  private Long startMillis;

  @ApiModelProperty(value = "")

  private Long endMillis;

  @ApiModelProperty(value = "")

  private Boolean beforeNow;

  @ApiModelProperty(value = "")

  private Boolean afterNow;
 /**
   * Get end
   * @return end
  **/
  @JsonProperty("end")
  public Date getEnd() {
    return end;
  }

  public void setEnd(Date end) {
    this.end = end;
  }

  public Interval end(Date end) {
    this.end = end;
    return this;
  }

 /**
   * Get start
   * @return start
  **/
  @JsonProperty("start")
  public Date getStart() {
    return start;
  }

  public void setStart(Date start) {
    this.start = start;
  }

  public Interval start(Date start) {
    this.start = start;
    return this;
  }

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

  public Interval chronology(Chronology chronology) {
    this.chronology = chronology;
    return this;
  }

 /**
   * Get startMillis
   * @return startMillis
  **/
  @JsonProperty("startMillis")
  public Long getStartMillis() {
    return startMillis;
  }

  public void setStartMillis(Long startMillis) {
    this.startMillis = startMillis;
  }

  public Interval startMillis(Long startMillis) {
    this.startMillis = startMillis;
    return this;
  }

 /**
   * Get endMillis
   * @return endMillis
  **/
  @JsonProperty("endMillis")
  public Long getEndMillis() {
    return endMillis;
  }

  public void setEndMillis(Long endMillis) {
    this.endMillis = endMillis;
  }

  public Interval endMillis(Long endMillis) {
    this.endMillis = endMillis;
    return this;
  }

 /**
   * Get beforeNow
   * @return beforeNow
  **/
  @JsonProperty("beforeNow")
  public Boolean getBeforeNow() {
    return beforeNow;
  }

  public void setBeforeNow(Boolean beforeNow) {
    this.beforeNow = beforeNow;
  }

  public Interval beforeNow(Boolean beforeNow) {
    this.beforeNow = beforeNow;
    return this;
  }

 /**
   * Get afterNow
   * @return afterNow
  **/
  @JsonProperty("afterNow")
  public Boolean getAfterNow() {
    return afterNow;
  }

  public void setAfterNow(Boolean afterNow) {
    this.afterNow = afterNow;
  }

  public Interval afterNow(Boolean afterNow) {
    this.afterNow = afterNow;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

