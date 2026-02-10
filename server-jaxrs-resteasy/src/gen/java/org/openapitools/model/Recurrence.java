package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Recurrence   {
  

  /**
   * Gets or Sets frequency
   */
  public enum FrequencyEnum {
    DAILY("DAILY"),

        WEEKLY("WEEKLY"),

        MONTHLY("MONTHLY"),

        ANNUALLY("ANNUALLY"),

        WEEK_DAY_ONLY("WEEK_DAY_ONLY");
    private String value;

    FrequencyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private FrequencyEnum frequency;
  private List<Integer> daysOfWeek = new ArrayList<>();
  private Date start;
  private Integer count;
  private Date until;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("frequency")
  public FrequencyEnum getFrequency() {
    return frequency;
  }
  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("daysOfWeek")
  public List<Integer> getDaysOfWeek() {
    return daysOfWeek;
  }
  public void setDaysOfWeek(List<Integer> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("start")
  public Date getStart() {
    return start;
  }
  public void setStart(Date start) {
    this.start = start;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("until")
  public Date getUntil() {
    return until;
  }
  public void setUntil(Date until) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

