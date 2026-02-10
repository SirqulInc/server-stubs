package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AvailabilityResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AvailabilityResponse   {
  @JsonProperty("availabilityId")
  
  private Long availabilityId;

  @JsonProperty("startDate")
  
  private Long startDate;

  @JsonProperty("endDate")
  
  private Long endDate;

  @JsonProperty("dayOfWeek")
  
  private Integer dayOfWeek;

  @JsonProperty("startTime")
  
  private Long startTime;

  @JsonProperty("endTime")
  
  private Long endTime;

  @JsonProperty("timeZone")
  
  private String timeZone;

  @JsonProperty("deleted")
  
  private Boolean deleted;

  public AvailabilityResponse availabilityId(Long availabilityId) {
    this.availabilityId = availabilityId;
    return this;
  }

   /**
   * Get availabilityId
   * @return availabilityId
  **/
  public Long getAvailabilityId() {
    return availabilityId;
  }

  public void setAvailabilityId(Long availabilityId) {
    this.availabilityId = availabilityId;
  }

  public AvailabilityResponse startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public AvailabilityResponse endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public AvailabilityResponse dayOfWeek(Integer dayOfWeek) {
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

  public AvailabilityResponse startTime(Long startTime) {
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

  public AvailabilityResponse endTime(Long endTime) {
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

  public AvailabilityResponse timeZone(String timeZone) {
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

  public AvailabilityResponse deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
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
    return Objects.equals(availabilityId, availabilityResponse.availabilityId) &&
        Objects.equals(startDate, availabilityResponse.startDate) &&
        Objects.equals(endDate, availabilityResponse.endDate) &&
        Objects.equals(dayOfWeek, availabilityResponse.dayOfWeek) &&
        Objects.equals(startTime, availabilityResponse.startTime) &&
        Objects.equals(endTime, availabilityResponse.endTime) &&
        Objects.equals(timeZone, availabilityResponse.timeZone) &&
        Objects.equals(deleted, availabilityResponse.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityId, startDate, endDate, dayOfWeek, startTime, endTime, timeZone, deleted);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

