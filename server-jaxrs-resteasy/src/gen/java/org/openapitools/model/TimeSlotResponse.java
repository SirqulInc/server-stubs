package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TimeSlotResponse   {
  
  private Long scheduledDate;
  private Long startTime;
  private Long endTime;
  private Integer dayOfWeek;
  private String timeZone;
  private Integer reservationCount;
  private List<@Valid AccountShortResponse> reservations = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduledDate")
  public Long getScheduledDate() {
    return scheduledDate;
  }
  public void setScheduledDate(Long scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startTime")
  public Long getStartTime() {
    return startTime;
  }
  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endTime")
  public Long getEndTime() {
    return endTime;
  }
  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dayOfWeek")
  public Integer getDayOfWeek() {
    return dayOfWeek;
  }
  public void setDayOfWeek(Integer dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("reservationCount")
  public Integer getReservationCount() {
    return reservationCount;
  }
  public void setReservationCount(Integer reservationCount) {
    this.reservationCount = reservationCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("reservations")
  @Valid
  public List<@Valid AccountShortResponse> getReservations() {
    return reservations;
  }
  public void setReservations(List<@Valid AccountShortResponse> reservations) {
    this.reservations = reservations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSlotResponse timeSlotResponse = (TimeSlotResponse) o;
    return Objects.equals(this.scheduledDate, timeSlotResponse.scheduledDate) &&
        Objects.equals(this.startTime, timeSlotResponse.startTime) &&
        Objects.equals(this.endTime, timeSlotResponse.endTime) &&
        Objects.equals(this.dayOfWeek, timeSlotResponse.dayOfWeek) &&
        Objects.equals(this.timeZone, timeSlotResponse.timeZone) &&
        Objects.equals(this.reservationCount, timeSlotResponse.reservationCount) &&
        Objects.equals(this.reservations, timeSlotResponse.reservations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduledDate, startTime, endTime, dayOfWeek, timeZone, reservationCount, reservations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSlotResponse {\n");
    
    sb.append("    scheduledDate: ").append(toIndentedString(scheduledDate)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    reservationCount: ").append(toIndentedString(reservationCount)).append("\n");
    sb.append("    reservations: ").append(toIndentedString(reservations)).append("\n");
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

