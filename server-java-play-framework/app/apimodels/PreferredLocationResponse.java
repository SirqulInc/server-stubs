package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PreferredLocationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PreferredLocationResponse   {
  @JsonProperty("ownerId")
  
  private Long ownerId;

  @JsonProperty("onDate")
  
  private String onDate;

  @JsonProperty("onDateMilli")
  
  private Long onDateMilli;

  @JsonProperty("hour")
  
  private Integer hour;

  @JsonProperty("latitude")
  
  private Double latitude;

  @JsonProperty("longitude")
  
  private Double longitude;

  @JsonProperty("distance")
  
  private Double distance;

  @JsonProperty("duration")
  
  private Long duration;

  @JsonProperty("startStepId")
  
  private Long startStepId;

  @JsonProperty("endStepId")
  
  private Long endStepId;

  public PreferredLocationResponse ownerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public PreferredLocationResponse onDate(String onDate) {
    this.onDate = onDate;
    return this;
  }

   /**
   * Get onDate
   * @return onDate
  **/
  public String getOnDate() {
    return onDate;
  }

  public void setOnDate(String onDate) {
    this.onDate = onDate;
  }

  public PreferredLocationResponse onDateMilli(Long onDateMilli) {
    this.onDateMilli = onDateMilli;
    return this;
  }

   /**
   * Get onDateMilli
   * @return onDateMilli
  **/
  public Long getOnDateMilli() {
    return onDateMilli;
  }

  public void setOnDateMilli(Long onDateMilli) {
    this.onDateMilli = onDateMilli;
  }

  public PreferredLocationResponse hour(Integer hour) {
    this.hour = hour;
    return this;
  }

   /**
   * Get hour
   * @return hour
  **/
  public Integer getHour() {
    return hour;
  }

  public void setHour(Integer hour) {
    this.hour = hour;
  }

  public PreferredLocationResponse latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public PreferredLocationResponse longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public PreferredLocationResponse distance(Double distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public PreferredLocationResponse duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public PreferredLocationResponse startStepId(Long startStepId) {
    this.startStepId = startStepId;
    return this;
  }

   /**
   * Get startStepId
   * @return startStepId
  **/
  public Long getStartStepId() {
    return startStepId;
  }

  public void setStartStepId(Long startStepId) {
    this.startStepId = startStepId;
  }

  public PreferredLocationResponse endStepId(Long endStepId) {
    this.endStepId = endStepId;
    return this;
  }

   /**
   * Get endStepId
   * @return endStepId
  **/
  public Long getEndStepId() {
    return endStepId;
  }

  public void setEndStepId(Long endStepId) {
    this.endStepId = endStepId;
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
    return Objects.equals(ownerId, preferredLocationResponse.ownerId) &&
        Objects.equals(onDate, preferredLocationResponse.onDate) &&
        Objects.equals(onDateMilli, preferredLocationResponse.onDateMilli) &&
        Objects.equals(hour, preferredLocationResponse.hour) &&
        Objects.equals(latitude, preferredLocationResponse.latitude) &&
        Objects.equals(longitude, preferredLocationResponse.longitude) &&
        Objects.equals(distance, preferredLocationResponse.distance) &&
        Objects.equals(duration, preferredLocationResponse.duration) &&
        Objects.equals(startStepId, preferredLocationResponse.startStepId) &&
        Objects.equals(endStepId, preferredLocationResponse.endStepId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerId, onDate, onDateMilli, hour, latitude, longitude, distance, duration, startStepId, endStepId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

