package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AvailabilityResponse   {
  
  private Long availabilityId;
  private Long startDate;
  private Long endDate;
  private Integer dayOfWeek;
  private Long startTime;
  private Long endTime;
  private String timeZone;
  private Boolean deleted;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("availabilityId")
  public Long getAvailabilityId() {
    return availabilityId;
  }
  public void setAvailabilityId(Long availabilityId) {
    this.availabilityId = availabilityId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startDate")
  public Long getStartDate() {
    return startDate;
  }
  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }
  public void setEndDate(Long endDate) {
    this.endDate = endDate;
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
  @JsonProperty("deleted")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

