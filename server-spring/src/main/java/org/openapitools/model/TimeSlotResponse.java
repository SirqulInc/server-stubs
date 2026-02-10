package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TimeSlotResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TimeSlotResponse {

  private @Nullable Long scheduledDate;

  private @Nullable Long startTime;

  private @Nullable Long endTime;

  private @Nullable Integer dayOfWeek;

  private @Nullable String timeZone;

  private @Nullable Integer reservationCount;

  @Valid
  private List<@Valid AccountShortResponse> reservations = new ArrayList<>();

  public TimeSlotResponse scheduledDate(@Nullable Long scheduledDate) {
    this.scheduledDate = scheduledDate;
    return this;
  }

  /**
   * Get scheduledDate
   * @return scheduledDate
   */
  
  @Schema(name = "scheduledDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduledDate")
  public @Nullable Long getScheduledDate() {
    return scheduledDate;
  }

  public void setScheduledDate(@Nullable Long scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

  public TimeSlotResponse startTime(@Nullable Long startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
   */
  
  @Schema(name = "startTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTime")
  public @Nullable Long getStartTime() {
    return startTime;
  }

  public void setStartTime(@Nullable Long startTime) {
    this.startTime = startTime;
  }

  public TimeSlotResponse endTime(@Nullable Long endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
   */
  
  @Schema(name = "endTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endTime")
  public @Nullable Long getEndTime() {
    return endTime;
  }

  public void setEndTime(@Nullable Long endTime) {
    this.endTime = endTime;
  }

  public TimeSlotResponse dayOfWeek(@Nullable Integer dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  /**
   * Get dayOfWeek
   * @return dayOfWeek
   */
  
  @Schema(name = "dayOfWeek", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dayOfWeek")
  public @Nullable Integer getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(@Nullable Integer dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public TimeSlotResponse timeZone(@Nullable String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Get timeZone
   * @return timeZone
   */
  
  @Schema(name = "timeZone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeZone")
  public @Nullable String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(@Nullable String timeZone) {
    this.timeZone = timeZone;
  }

  public TimeSlotResponse reservationCount(@Nullable Integer reservationCount) {
    this.reservationCount = reservationCount;
    return this;
  }

  /**
   * Get reservationCount
   * @return reservationCount
   */
  
  @Schema(name = "reservationCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reservationCount")
  public @Nullable Integer getReservationCount() {
    return reservationCount;
  }

  public void setReservationCount(@Nullable Integer reservationCount) {
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
   */
  @Valid 
  @Schema(name = "reservations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reservations")
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

