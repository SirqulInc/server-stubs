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
public class PredictedLocationResponse   {
  
  private Long ownerId;
  private String onDate;
  private Long onDateMilli;
  private Integer hour;
  private Double latitude;
  private Double longitude;
  private Double distance;
  private Long matches;
  private Double averageDuration;
  private Double weightedScore;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ownerId")
  public Long getOwnerId() {
    return ownerId;
  }
  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("onDate")
  public String getOnDate() {
    return onDate;
  }
  public void setOnDate(String onDate) {
    this.onDate = onDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("onDateMilli")
  public Long getOnDateMilli() {
    return onDateMilli;
  }
  public void setOnDateMilli(Long onDateMilli) {
    this.onDateMilli = onDateMilli;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hour")
  public Integer getHour() {
    return hour;
  }
  public void setHour(Integer hour) {
    this.hour = hour;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("distance")
  public Double getDistance() {
    return distance;
  }
  public void setDistance(Double distance) {
    this.distance = distance;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("matches")
  public Long getMatches() {
    return matches;
  }
  public void setMatches(Long matches) {
    this.matches = matches;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("averageDuration")
  public Double getAverageDuration() {
    return averageDuration;
  }
  public void setAverageDuration(Double averageDuration) {
    this.averageDuration = averageDuration;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("weightedScore")
  public Double getWeightedScore() {
    return weightedScore;
  }
  public void setWeightedScore(Double weightedScore) {
    this.weightedScore = weightedScore;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

