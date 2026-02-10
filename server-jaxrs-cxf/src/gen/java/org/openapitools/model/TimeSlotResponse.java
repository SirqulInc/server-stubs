package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TimeSlotResponse  {
  
  @ApiModelProperty(value = "")

  private Long scheduledDate;

  @ApiModelProperty(value = "")

  private Long startTime;

  @ApiModelProperty(value = "")

  private Long endTime;

  @ApiModelProperty(value = "")

  private Integer dayOfWeek;

  @ApiModelProperty(value = "")

  private String timeZone;

  @ApiModelProperty(value = "")

  private Integer reservationCount;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid AccountShortResponse> reservations = new ArrayList<>();
 /**
   * Get scheduledDate
   * @return scheduledDate
  **/
  @JsonProperty("scheduledDate")
  public Long getScheduledDate() {
    return scheduledDate;
  }

  public void setScheduledDate(Long scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

  public TimeSlotResponse scheduledDate(Long scheduledDate) {
    this.scheduledDate = scheduledDate;
    return this;
  }

 /**
   * Get startTime
   * @return startTime
  **/
  @JsonProperty("startTime")
  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public TimeSlotResponse startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

 /**
   * Get endTime
   * @return endTime
  **/
  @JsonProperty("endTime")
  public Long getEndTime() {
    return endTime;
  }

  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  public TimeSlotResponse endTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

 /**
   * Get dayOfWeek
   * @return dayOfWeek
  **/
  @JsonProperty("dayOfWeek")
  public Integer getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(Integer dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public TimeSlotResponse dayOfWeek(Integer dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

 /**
   * Get timeZone
   * @return timeZone
  **/
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public TimeSlotResponse timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

 /**
   * Get reservationCount
   * @return reservationCount
  **/
  @JsonProperty("reservationCount")
  public Integer getReservationCount() {
    return reservationCount;
  }

  public void setReservationCount(Integer reservationCount) {
    this.reservationCount = reservationCount;
  }

  public TimeSlotResponse reservationCount(Integer reservationCount) {
    this.reservationCount = reservationCount;
    return this;
  }

 /**
   * Get reservations
   * @return reservations
  **/
  @JsonProperty("reservations")
  public List<@Valid AccountShortResponse> getReservations() {
    return reservations;
  }

  public void setReservations(List<@Valid AccountShortResponse> reservations) {
    this.reservations = reservations;
  }

  public TimeSlotResponse reservations(List<@Valid AccountShortResponse> reservations) {
    this.reservations = reservations;
    return this;
  }

  public TimeSlotResponse addReservationsItem(AccountShortResponse reservationsItem) {
    this.reservations.add(reservationsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

