package apimodels;

import apimodels.AccountShortResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TimeSlotResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TimeSlotResponse   {
  @JsonProperty("scheduledDate")
  
  private Long scheduledDate;

  @JsonProperty("startTime")
  
  private Long startTime;

  @JsonProperty("endTime")
  
  private Long endTime;

  @JsonProperty("dayOfWeek")
  
  private Integer dayOfWeek;

  @JsonProperty("timeZone")
  
  private String timeZone;

  @JsonProperty("reservationCount")
  
  private Integer reservationCount;

  @JsonProperty("reservations")
  @Valid

  private List<@Valid AccountShortResponse> reservations = null;

  public TimeSlotResponse scheduledDate(Long scheduledDate) {
    this.scheduledDate = scheduledDate;
    return this;
  }

   /**
   * Get scheduledDate
   * @return scheduledDate
  **/
  public Long getScheduledDate() {
    return scheduledDate;
  }

  public void setScheduledDate(Long scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

  public TimeSlotResponse startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public TimeSlotResponse endTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  public Long getEndTime() {
    return endTime;
  }

  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  public TimeSlotResponse dayOfWeek(Integer dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

   /**
   * Get dayOfWeek
   * @return dayOfWeek
  **/
  public Integer getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(Integer dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public TimeSlotResponse timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public TimeSlotResponse reservationCount(Integer reservationCount) {
    this.reservationCount = reservationCount;
    return this;
  }

   /**
   * Get reservationCount
   * @return reservationCount
  **/
  public Integer getReservationCount() {
    return reservationCount;
  }

  public void setReservationCount(Integer reservationCount) {
    this.reservationCount = reservationCount;
  }

  public TimeSlotResponse reservations(List<@Valid AccountShortResponse> reservations) {
    this.reservations = reservations;
    return this;
  }

  public TimeSlotResponse addReservationsItem(AccountShortResponse reservationsItem) {
    if (this.reservations == null) {
      this.reservations = new ArrayList<>();
    }
    this.reservations.add(reservationsItem);
    return this;
  }

   /**
   * Get reservations
   * @return reservations
  **/
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
    return Objects.equals(scheduledDate, timeSlotResponse.scheduledDate) &&
        Objects.equals(startTime, timeSlotResponse.startTime) &&
        Objects.equals(endTime, timeSlotResponse.endTime) &&
        Objects.equals(dayOfWeek, timeSlotResponse.dayOfWeek) &&
        Objects.equals(timeZone, timeSlotResponse.timeZone) &&
        Objects.equals(reservationCount, timeSlotResponse.reservationCount) &&
        Objects.equals(reservations, timeSlotResponse.reservations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduledDate, startTime, endTime, dayOfWeek, timeZone, reservationCount, reservations);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

