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
 * PredictedLocationResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PredictedLocationResponse {

  private @Nullable Long ownerId;

  private @Nullable String onDate;

  private @Nullable Long onDateMilli;

  private @Nullable Integer hour;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable Double distance;

  private @Nullable Long matches;

  private @Nullable Double averageDuration;

  private @Nullable Double weightedScore;

  public PredictedLocationResponse ownerId(@Nullable Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId
   * @return ownerId
   */
  
  @Schema(name = "ownerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ownerId")
  public @Nullable Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(@Nullable Long ownerId) {
    this.ownerId = ownerId;
  }

  public PredictedLocationResponse onDate(@Nullable String onDate) {
    this.onDate = onDate;
    return this;
  }

  /**
   * Get onDate
   * @return onDate
   */
  
  @Schema(name = "onDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("onDate")
  public @Nullable String getOnDate() {
    return onDate;
  }

  public void setOnDate(@Nullable String onDate) {
    this.onDate = onDate;
  }

  public PredictedLocationResponse onDateMilli(@Nullable Long onDateMilli) {
    this.onDateMilli = onDateMilli;
    return this;
  }

  /**
   * Get onDateMilli
   * @return onDateMilli
   */
  
  @Schema(name = "onDateMilli", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("onDateMilli")
  public @Nullable Long getOnDateMilli() {
    return onDateMilli;
  }

  public void setOnDateMilli(@Nullable Long onDateMilli) {
    this.onDateMilli = onDateMilli;
  }

  public PredictedLocationResponse hour(@Nullable Integer hour) {
    this.hour = hour;
    return this;
  }

  /**
   * Get hour
   * @return hour
   */
  
  @Schema(name = "hour", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hour")
  public @Nullable Integer getHour() {
    return hour;
  }

  public void setHour(@Nullable Integer hour) {
    this.hour = hour;
  }

  public PredictedLocationResponse latitude(@Nullable Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   */
  
  @Schema(name = "latitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public @Nullable Double getLatitude() {
    return latitude;
  }

  public void setLatitude(@Nullable Double latitude) {
    this.latitude = latitude;
  }

  public PredictedLocationResponse longitude(@Nullable Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
   */
  
  @Schema(name = "longitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public @Nullable Double getLongitude() {
    return longitude;
  }

  public void setLongitude(@Nullable Double longitude) {
    this.longitude = longitude;
  }

  public PredictedLocationResponse distance(@Nullable Double distance) {
    this.distance = distance;
    return this;
  }

  /**
   * Get distance
   * @return distance
   */
  
  @Schema(name = "distance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("distance")
  public @Nullable Double getDistance() {
    return distance;
  }

  public void setDistance(@Nullable Double distance) {
    this.distance = distance;
  }

  public PredictedLocationResponse matches(@Nullable Long matches) {
    this.matches = matches;
    return this;
  }

  /**
   * Get matches
   * @return matches
   */
  
  @Schema(name = "matches", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("matches")
  public @Nullable Long getMatches() {
    return matches;
  }

  public void setMatches(@Nullable Long matches) {
    this.matches = matches;
  }

  public PredictedLocationResponse averageDuration(@Nullable Double averageDuration) {
    this.averageDuration = averageDuration;
    return this;
  }

  /**
   * Get averageDuration
   * @return averageDuration
   */
  
  @Schema(name = "averageDuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("averageDuration")
  public @Nullable Double getAverageDuration() {
    return averageDuration;
  }

  public void setAverageDuration(@Nullable Double averageDuration) {
    this.averageDuration = averageDuration;
  }

  public PredictedLocationResponse weightedScore(@Nullable Double weightedScore) {
    this.weightedScore = weightedScore;
    return this;
  }

  /**
   * Get weightedScore
   * @return weightedScore
   */
  
  @Schema(name = "weightedScore", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weightedScore")
  public @Nullable Double getWeightedScore() {
    return weightedScore;
  }

  public void setWeightedScore(@Nullable Double weightedScore) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

