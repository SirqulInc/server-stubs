package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Recurrence  {
  
public enum FrequencyEnum {

DAILY(String.valueOf("DAILY")), WEEKLY(String.valueOf("WEEKLY")), MONTHLY(String.valueOf("MONTHLY")), ANNUALLY(String.valueOf("ANNUALLY")), WEEK_DAY_ONLY(String.valueOf("WEEK_DAY_ONLY"));


    private String value;

    FrequencyEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

  @ApiModelProperty(value = "")

  private FrequencyEnum frequency;

  @ApiModelProperty(value = "")

  private List<Integer> daysOfWeek = new ArrayList<>();

  @ApiModelProperty(value = "")

  private LocalDate start;

  @ApiModelProperty(value = "")

  private Integer count;

  @ApiModelProperty(value = "")

  private LocalDate until;
 /**
   * Get frequency
   * @return frequency
  **/
  @JsonProperty("frequency")
  public String getFrequency() {
    if (frequency == null) {
      return null;
    }
    return frequency.value();
  }

  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }

  public Recurrence frequency(FrequencyEnum frequency) {
    this.frequency = frequency;
    return this;
  }

 /**
   * Get daysOfWeek
   * @return daysOfWeek
  **/
  @JsonProperty("daysOfWeek")
  public List<Integer> getDaysOfWeek() {
    return daysOfWeek;
  }

  public void setDaysOfWeek(List<Integer> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }

  public Recurrence daysOfWeek(List<Integer> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }

  public Recurrence addDaysOfWeekItem(Integer daysOfWeekItem) {
    this.daysOfWeek.add(daysOfWeekItem);
    return this;
  }

 /**
   * Get start
   * @return start
  **/
  @JsonProperty("start")
  public LocalDate getStart() {
    return start;
  }

  public void setStart(LocalDate start) {
    this.start = start;
  }

  public Recurrence start(LocalDate start) {
    this.start = start;
    return this;
  }

 /**
   * Get count
   * @return count
  **/
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public Recurrence count(Integer count) {
    this.count = count;
    return this;
  }

 /**
   * Get until
   * @return until
  **/
  @JsonProperty("until")
  public LocalDate getUntil() {
    return until;
  }

  public void setUntil(LocalDate until) {
    this.until = until;
  }

  public Recurrence until(LocalDate until) {
    this.until = until;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

