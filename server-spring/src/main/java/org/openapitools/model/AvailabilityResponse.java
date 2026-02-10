package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AvailabilityResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AvailabilityResponse {

  private @Nullable Long availabilityId;

  private @Nullable Long startDate;

  private @Nullable Long endDate;

  private @Nullable Integer dayOfWeek;

  private @Nullable Long startTime;

  private @Nullable Long endTime;

  private @Nullable String timeZone;

  private @Nullable Boolean deleted;

  public AvailabilityResponse availabilityId(@Nullable Long availabilityId) {
    this.availabilityId = availabilityId;
    return this;
  }

  /**
   * Get availabilityId
   * @return availabilityId
   */
  
  @Schema(name = "availabilityId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availabilityId")
  public @Nullable Long getAvailabilityId() {
    return availabilityId;
  }

  public void setAvailabilityId(@Nullable Long availabilityId) {
    this.availabilityId = availabilityId;
  }

  public AvailabilityResponse startDate(@Nullable Long startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public @Nullable Long getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable Long startDate) {
    this.startDate = startDate;
  }

  public AvailabilityResponse endDate(@Nullable Long endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  
  @Schema(name = "endDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public @Nullable Long getEndDate() {
    return endDate;
  }

  public void setEndDate(@Nullable Long endDate) {
    this.endDate = endDate;
  }

  public AvailabilityResponse dayOfWeek(@Nullable Integer dayOfWeek) {
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

  public AvailabilityResponse startTime(@Nullable Long startTime) {
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

  public AvailabilityResponse endTime(@Nullable Long endTime) {
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

  public AvailabilityResponse timeZone(@Nullable String timeZone) {
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

  public AvailabilityResponse deleted(@Nullable Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Get deleted
   * @return deleted
   */
  
  @Schema(name = "deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deleted")
  public @Nullable Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(@Nullable Boolean deleted) {
    this.deleted = deleted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailabilityResponse availabilityResponse = (AvailabilityResponse) o;
    return Objects.equals(this.availabilityId, availabilityResponse.availabilityId) &&
        Objects.equals(this.startDate, availabilityResponse.startDate) &&
        Objects.equals(this.endDate, availabilityResponse.endDate) &&
        Objects.equals(this.dayOfWeek, availabilityResponse.dayOfWeek) &&
        Objects.equals(this.startTime, availabilityResponse.startTime) &&
        Objects.equals(this.endTime, availabilityResponse.endTime) &&
        Objects.equals(this.timeZone, availabilityResponse.timeZone) &&
        Objects.equals(this.deleted, availabilityResponse.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityId, startDate, endDate, dayOfWeek, startTime, endTime, timeZone, deleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailabilityResponse {\n");
    sb.append("    availabilityId: ").append(toIndentedString(availabilityId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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

