package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PredictedLocationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PredictedLocationResponse   {
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

  @JsonProperty("matches")
  
  private Long matches;

  @JsonProperty("averageDuration")
  
  private Double averageDuration;

  @JsonProperty("weightedScore")
  
  private Double weightedScore;

  public PredictedLocationResponse ownerId(Long ownerId) {
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

  public PredictedLocationResponse onDate(String onDate) {
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

  public PredictedLocationResponse onDateMilli(Long onDateMilli) {
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

  public PredictedLocationResponse hour(Integer hour) {
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

  public PredictedLocationResponse latitude(Double latitude) {
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

  public PredictedLocationResponse longitude(Double longitude) {
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

  public PredictedLocationResponse distance(Double distance) {
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

  public PredictedLocationResponse matches(Long matches) {
    this.matches = matches;
    return this;
  }

   /**
   * Get matches
   * @return matches
  **/
  public Long getMatches() {
    return matches;
  }

  public void setMatches(Long matches) {
    this.matches = matches;
  }

  public PredictedLocationResponse averageDuration(Double averageDuration) {
    this.averageDuration = averageDuration;
    return this;
  }

   /**
   * Get averageDuration
   * @return averageDuration
  **/
  public Double getAverageDuration() {
    return averageDuration;
  }

  public void setAverageDuration(Double averageDuration) {
    this.averageDuration = averageDuration;
  }

  public PredictedLocationResponse weightedScore(Double weightedScore) {
    this.weightedScore = weightedScore;
    return this;
  }

   /**
   * Get weightedScore
   * @return weightedScore
  **/
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
    return Objects.equals(ownerId, predictedLocationResponse.ownerId) &&
        Objects.equals(onDate, predictedLocationResponse.onDate) &&
        Objects.equals(onDateMilli, predictedLocationResponse.onDateMilli) &&
        Objects.equals(hour, predictedLocationResponse.hour) &&
        Objects.equals(latitude, predictedLocationResponse.latitude) &&
        Objects.equals(longitude, predictedLocationResponse.longitude) &&
        Objects.equals(distance, predictedLocationResponse.distance) &&
        Objects.equals(matches, predictedLocationResponse.matches) &&
        Objects.equals(averageDuration, predictedLocationResponse.averageDuration) &&
        Objects.equals(weightedScore, predictedLocationResponse.weightedScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerId, onDate, onDateMilli, hour, latitude, longitude, distance, matches, averageDuration, weightedScore);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

