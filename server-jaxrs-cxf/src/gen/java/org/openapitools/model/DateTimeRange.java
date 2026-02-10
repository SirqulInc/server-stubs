package org.openapitools.model;

import java.util.Date;
import org.openapitools.model.Interval;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DateTimeRange  {
  
  @ApiModelProperty(value = "")

  private Date start;

  @ApiModelProperty(value = "")

  private Date end;

  @ApiModelProperty(value = "")

  @Valid

  private Interval interval;
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

  public DateTimeRange start(Date start) {
    this.start = start;
    return this;
  }

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

  public DateTimeRange end(Date end) {
    this.end = end;
    return this;
  }

 /**
   * Get interval
   * @return interval
  **/
  @JsonProperty("interval")
  public Interval getInterval() {
    return interval;
  }

  public void setInterval(Interval interval) {
    this.interval = interval;
  }

  public DateTimeRange interval(Interval interval) {
    this.interval = interval;
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
    DateTimeRange dateTimeRange = (DateTimeRange) o;
    return Objects.equals(this.start, dateTimeRange.start) &&
        Objects.equals(this.end, dateTimeRange.end) &&
        Objects.equals(this.interval, dateTimeRange.interval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, interval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeRange {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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

