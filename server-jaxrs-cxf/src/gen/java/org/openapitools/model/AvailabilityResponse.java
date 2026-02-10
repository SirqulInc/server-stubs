package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AvailabilityResponse  {
  
  @ApiModelProperty(value = "")

  private Long availabilityId;

  @ApiModelProperty(value = "")

  private Long startDate;

  @ApiModelProperty(value = "")

  private Long endDate;

  @ApiModelProperty(value = "")

  private Integer dayOfWeek;

  @ApiModelProperty(value = "")

  private Long startTime;

  @ApiModelProperty(value = "")

  private Long endTime;

  @ApiModelProperty(value = "")

  private String timeZone;

  @ApiModelProperty(value = "")

  private Boolean deleted;
 /**
   * Get availabilityId
   * @return availabilityId
  **/
  @JsonProperty("availabilityId")
  public Long getAvailabilityId() {
    return availabilityId;
  }

  public void setAvailabilityId(Long availabilityId) {
    this.availabilityId = availabilityId;
  }

  public AvailabilityResponse availabilityId(Long availabilityId) {
    this.availabilityId = availabilityId;
    return this;
  }

 /**
   * Get startDate
   * @return startDate
  **/
  @JsonProperty("startDate")
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public AvailabilityResponse startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * Get endDate
   * @return endDate
  **/
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public AvailabilityResponse endDate(Long endDate) {
    this.endDate = endDate;
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

  public AvailabilityResponse dayOfWeek(Integer dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
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

  public AvailabilityResponse startTime(Long startTime) {
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

  public AvailabilityResponse endTime(Long endTime) {
    this.endTime = endTime;
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

  public AvailabilityResponse timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

 /**
   * Get deleted
   * @return deleted
  **/
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public AvailabilityResponse deleted(Boolean deleted) {
    this.deleted = deleted;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

