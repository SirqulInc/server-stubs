package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PredictedLocationResponse  {
  
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

  private Long matches;

  @ApiModelProperty(value = "")

  private Double averageDuration;

  @ApiModelProperty(value = "")

  private Double weightedScore;
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

  public PredictedLocationResponse ownerId(Long ownerId) {
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

  public PredictedLocationResponse onDate(String onDate) {
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

  public PredictedLocationResponse onDateMilli(Long onDateMilli) {
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

  public PredictedLocationResponse hour(Integer hour) {
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

  public PredictedLocationResponse latitude(Double latitude) {
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

  public PredictedLocationResponse longitude(Double longitude) {
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

  public PredictedLocationResponse distance(Double distance) {
    this.distance = distance;
    return this;
  }

 /**
   * Get matches
   * @return matches
  **/
  @JsonProperty("matches")
  public Long getMatches() {
    return matches;
  }

  public void setMatches(Long matches) {
    this.matches = matches;
  }

  public PredictedLocationResponse matches(Long matches) {
    this.matches = matches;
    return this;
  }

 /**
   * Get averageDuration
   * @return averageDuration
  **/
  @JsonProperty("averageDuration")
  public Double getAverageDuration() {
    return averageDuration;
  }

  public void setAverageDuration(Double averageDuration) {
    this.averageDuration = averageDuration;
  }

  public PredictedLocationResponse averageDuration(Double averageDuration) {
    this.averageDuration = averageDuration;
    return this;
  }

 /**
   * Get weightedScore
   * @return weightedScore
  **/
  @JsonProperty("weightedScore")
  public Double getWeightedScore() {
    return weightedScore;
  }

  public void setWeightedScore(Double weightedScore) {
    this.weightedScore = weightedScore;
  }

  public PredictedLocationResponse weightedScore(Double weightedScore) {
    this.weightedScore = weightedScore;
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
    PredictedLocationResponse predictedLocationResponse = (PredictedLocationResponse) o;
    return Objects.equals(this.ownerId, predictedLocationResponse.ownerId) &&
        Objects.equals(this.onDate, predictedLocationResponse.onDate) &&
        Objects.equals(this.onDateMilli, predictedLocationResponse.onDateMilli) &&
        Objects.equals(this.hour, predictedLocationResponse.hour) &&
        Objects.equals(this.latitude, predictedLocationResponse.latitude) &&
        Objects.equals(this.longitude, predictedLocationResponse.longitude) &&
        Objects.equals(this.distance, predictedLocationResponse.distance) &&
        Objects.equals(this.matches, predictedLocationResponse.matches) &&
        Objects.equals(this.averageDuration, predictedLocationResponse.averageDuration) &&
        Objects.equals(this.weightedScore, predictedLocationResponse.weightedScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerId, onDate, onDateMilli, hour, latitude, longitude, distance, matches, averageDuration, weightedScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredictedLocationResponse {\n");
    
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    onDate: ").append(toIndentedString(onDate)).append("\n");
    sb.append("    onDateMilli: ").append(toIndentedString(onDateMilli)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
    sb.append("    averageDuration: ").append(toIndentedString(averageDuration)).append("\n");
    sb.append("    weightedScore: ").append(toIndentedString(weightedScore)).append("\n");
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

