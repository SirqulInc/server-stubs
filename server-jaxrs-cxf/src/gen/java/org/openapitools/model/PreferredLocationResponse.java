package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PreferredLocationResponse  {
  
  @ApiModelProperty(value = "")

  private Long ownerId;

  @ApiModelProperty(value = "")

  private String onDate;

  @ApiModelProperty(value = "")

  private Long onDateMilli;

  @ApiModelProperty(value = "")

  private Integer hour;

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;

  @ApiModelProperty(value = "")

  private Double distance;

  @ApiModelProperty(value = "")

  private Long duration;

  @ApiModelProperty(value = "")

  private Long startStepId;

  @ApiModelProperty(value = "")

  private Long endStepId;
 /**
   * Get ownerId
   * @return ownerId
  **/
  @JsonProperty("ownerId")
  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public PreferredLocationResponse ownerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

 /**
   * Get onDate
   * @return onDate
  **/
  @JsonProperty("onDate")
  public String getOnDate() {
    return onDate;
  }

  public void setOnDate(String onDate) {
    this.onDate = onDate;
  }

  public PreferredLocationResponse onDate(String onDate) {
    this.onDate = onDate;
    return this;
  }

 /**
   * Get onDateMilli
   * @return onDateMilli
  **/
  @JsonProperty("onDateMilli")
  public Long getOnDateMilli() {
    return onDateMilli;
  }

  public void setOnDateMilli(Long onDateMilli) {
    this.onDateMilli = onDateMilli;
  }

  public PreferredLocationResponse onDateMilli(Long onDateMilli) {
    this.onDateMilli = onDateMilli;
    return this;
  }

 /**
   * Get hour
   * @return hour
  **/
  @JsonProperty("hour")
  public Integer getHour() {
    return hour;
  }

  public void setHour(Integer hour) {
    this.hour = hour;
  }

  public PreferredLocationResponse hour(Integer hour) {
    this.hour = hour;
    return this;
  }

 /**
   * Get latitude
   * @return latitude
  **/
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public PreferredLocationResponse latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Get longitude
   * @return longitude
  **/
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public PreferredLocationResponse longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Get distance
   * @return distance
  **/
  @JsonProperty("distance")
  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public PreferredLocationResponse distance(Double distance) {
    this.distance = distance;
    return this;
  }

 /**
   * Get duration
   * @return duration
  **/
  @JsonProperty("duration")
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public PreferredLocationResponse duration(Long duration) {
    this.duration = duration;
    return this;
  }

 /**
   * Get startStepId
   * @return startStepId
  **/
  @JsonProperty("startStepId")
  public Long getStartStepId() {
    return startStepId;
  }

  public void setStartStepId(Long startStepId) {
    this.startStepId = startStepId;
  }

  public PreferredLocationResponse startStepId(Long startStepId) {
    this.startStepId = startStepId;
    return this;
  }

 /**
   * Get endStepId
   * @return endStepId
  **/
  @JsonProperty("endStepId")
  public Long getEndStepId() {
    return endStepId;
  }

  public void setEndStepId(Long endStepId) {
    this.endStepId = endStepId;
  }

  public PreferredLocationResponse endStepId(Long endStepId) {
    this.endStepId = endStepId;
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
    PreferredLocationResponse preferredLocationResponse = (PreferredLocationResponse) o;
    return Objects.equals(this.ownerId, preferredLocationResponse.ownerId) &&
        Objects.equals(this.onDate, preferredLocationResponse.onDate) &&
        Objects.equals(this.onDateMilli, preferredLocationResponse.onDateMilli) &&
        Objects.equals(this.hour, preferredLocationResponse.hour) &&
        Objects.equals(this.latitude, preferredLocationResponse.latitude) &&
        Objects.equals(this.longitude, preferredLocationResponse.longitude) &&
        Objects.equals(this.distance, preferredLocationResponse.distance) &&
        Objects.equals(this.duration, preferredLocationResponse.duration) &&
        Objects.equals(this.startStepId, preferredLocationResponse.startStepId) &&
        Objects.equals(this.endStepId, preferredLocationResponse.endStepId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerId, onDate, onDateMilli, hour, latitude, longitude, distance, duration, startStepId, endStepId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreferredLocationResponse {\n");
    
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    onDate: ").append(toIndentedString(onDate)).append("\n");
    sb.append("    onDateMilli: ").append(toIndentedString(onDateMilli)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    startStepId: ").append(toIndentedString(startStepId)).append("\n");
    sb.append("    endStepId: ").append(toIndentedString(endStepId)).append("\n");
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

