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
 * PreferredLocationResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PreferredLocationResponse {

  private @Nullable Long ownerId;

  private @Nullable String onDate;

  private @Nullable Long onDateMilli;

  private @Nullable Integer hour;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable Double distance;

  private @Nullable Long duration;

  private @Nullable Long startStepId;

  private @Nullable Long endStepId;

  public PreferredLocationResponse ownerId(@Nullable Long ownerId) {
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

  public PreferredLocationResponse onDate(@Nullable String onDate) {
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

  public PreferredLocationResponse onDateMilli(@Nullable Long onDateMilli) {
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

  public PreferredLocationResponse hour(@Nullable Integer hour) {
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

  public PreferredLocationResponse latitude(@Nullable Double latitude) {
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

  public PreferredLocationResponse longitude(@Nullable Double longitude) {
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

  public PreferredLocationResponse distance(@Nullable Double distance) {
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

  public PreferredLocationResponse duration(@Nullable Long duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
   */
  
  @Schema(name = "duration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("duration")
  public @Nullable Long getDuration() {
    return duration;
  }

  public void setDuration(@Nullable Long duration) {
    this.duration = duration;
  }

  public PreferredLocationResponse startStepId(@Nullable Long startStepId) {
    this.startStepId = startStepId;
    return this;
  }

  /**
   * Get startStepId
   * @return startStepId
   */
  
  @Schema(name = "startStepId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startStepId")
  public @Nullable Long getStartStepId() {
    return startStepId;
  }

  public void setStartStepId(@Nullable Long startStepId) {
    this.startStepId = startStepId;
  }

  public PreferredLocationResponse endStepId(@Nullable Long endStepId) {
    this.endStepId = endStepId;
    return this;
  }

  /**
   * Get endStepId
   * @return endStepId
   */
  
  @Schema(name = "endStepId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endStepId")
  public @Nullable Long getEndStepId() {
    return endStepId;
  }

  public void setEndStepId(@Nullable Long endStepId) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

