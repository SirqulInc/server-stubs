package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.StopResponse;
import org.openapitools.model.VehicleResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ItineraryResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ItineraryResponse {

  private @Nullable String itineraryId;

  private @Nullable Long waypointCount;

  private @Nullable Long score;

  private @Nullable String errorCode;

  private @Nullable String error;

  private @Nullable Integer itemCount;

  private @Nullable VehicleResponse vehicle;

  @Valid
  private List<@Valid StopResponse> stops = new ArrayList<>();

  private @Nullable Long estimatedStartTime;

  private @Nullable Long estimatedEndTime;

  private @Nullable Long estimatedDuration;

  private @Nullable Double estimatedDistance;

  private @Nullable Long waitTime;

  private @Nullable Boolean generated;

  private @Nullable Boolean valid;

  public ItineraryResponse itineraryId(@Nullable String itineraryId) {
    this.itineraryId = itineraryId;
    return this;
  }

  /**
   * Get itineraryId
   * @return itineraryId
   */
  
  @Schema(name = "itineraryId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itineraryId")
  public @Nullable String getItineraryId() {
    return itineraryId;
  }

  public void setItineraryId(@Nullable String itineraryId) {
    this.itineraryId = itineraryId;
  }

  public ItineraryResponse waypointCount(@Nullable Long waypointCount) {
    this.waypointCount = waypointCount;
    return this;
  }

  /**
   * Get waypointCount
   * @return waypointCount
   */
  
  @Schema(name = "waypointCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("waypointCount")
  public @Nullable Long getWaypointCount() {
    return waypointCount;
  }

  public void setWaypointCount(@Nullable Long waypointCount) {
    this.waypointCount = waypointCount;
  }

  public ItineraryResponse score(@Nullable Long score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
   * @return score
   */
  
  @Schema(name = "score", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("score")
  public @Nullable Long getScore() {
    return score;
  }

  public void setScore(@Nullable Long score) {
    this.score = score;
  }

  public ItineraryResponse errorCode(@Nullable String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
   */
  
  @Schema(name = "errorCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCode")
  public @Nullable String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(@Nullable String errorCode) {
    this.errorCode = errorCode;
  }

  public ItineraryResponse error(@Nullable String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  
  @Schema(name = "error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
  public @Nullable String getError() {
    return error;
  }

  public void setError(@Nullable String error) {
    this.error = error;
  }

  public ItineraryResponse itemCount(@Nullable Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

  /**
   * Get itemCount
   * @return itemCount
   */
  
  @Schema(name = "itemCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemCount")
  public @Nullable Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(@Nullable Integer itemCount) {
    this.itemCount = itemCount;
  }

  public ItineraryResponse vehicle(@Nullable VehicleResponse vehicle) {
    this.vehicle = vehicle;
    return this;
  }

  /**
   * Get vehicle
   * @return vehicle
   */
  @Valid 
  @Schema(name = "vehicle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicle")
  public @Nullable VehicleResponse getVehicle() {
    return vehicle;
  }

  public void setVehicle(@Nullable VehicleResponse vehicle) {
    this.vehicle = vehicle;
  }

  public ItineraryResponse stops(List<@Valid StopResponse> stops) {
    this.stops = stops;
    return this;
  }

  public ItineraryResponse addStopsItem(StopResponse stopsItem) {
    if (this.stops == null) {
      this.stops = new ArrayList<>();
    }
    this.stops.add(stopsItem);
    return this;
  }

  /**
   * Get stops
   * @return stops
   */
  @Valid 
  @Schema(name = "stops", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stops")
  public List<@Valid StopResponse> getStops() {
    return stops;
  }

  public void setStops(List<@Valid StopResponse> stops) {
    this.stops = stops;
  }

  public ItineraryResponse estimatedStartTime(@Nullable Long estimatedStartTime) {
    this.estimatedStartTime = estimatedStartTime;
    return this;
  }

  /**
   * Get estimatedStartTime
   * @return estimatedStartTime
   */
  
  @Schema(name = "estimatedStartTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedStartTime")
  public @Nullable Long getEstimatedStartTime() {
    return estimatedStartTime;
  }

  public void setEstimatedStartTime(@Nullable Long estimatedStartTime) {
    this.estimatedStartTime = estimatedStartTime;
  }

  public ItineraryResponse estimatedEndTime(@Nullable Long estimatedEndTime) {
    this.estimatedEndTime = estimatedEndTime;
    return this;
  }

  /**
   * Get estimatedEndTime
   * @return estimatedEndTime
   */
  
  @Schema(name = "estimatedEndTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedEndTime")
  public @Nullable Long getEstimatedEndTime() {
    return estimatedEndTime;
  }

  public void setEstimatedEndTime(@Nullable Long estimatedEndTime) {
    this.estimatedEndTime = estimatedEndTime;
  }

  public ItineraryResponse estimatedDuration(@Nullable Long estimatedDuration) {
    this.estimatedDuration = estimatedDuration;
    return this;
  }

  /**
   * Get estimatedDuration
   * @return estimatedDuration
   */
  
  @Schema(name = "estimatedDuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedDuration")
  public @Nullable Long getEstimatedDuration() {
    return estimatedDuration;
  }

  public void setEstimatedDuration(@Nullable Long estimatedDuration) {
    this.estimatedDuration = estimatedDuration;
  }

  public ItineraryResponse estimatedDistance(@Nullable Double estimatedDistance) {
    this.estimatedDistance = estimatedDistance;
    return this;
  }

  /**
   * Get estimatedDistance
   * @return estimatedDistance
   */
  
  @Schema(name = "estimatedDistance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedDistance")
  public @Nullable Double getEstimatedDistance() {
    return estimatedDistance;
  }

  public void setEstimatedDistance(@Nullable Double estimatedDistance) {
    this.estimatedDistance = estimatedDistance;
  }

  public ItineraryResponse waitTime(@Nullable Long waitTime) {
    this.waitTime = waitTime;
    return this;
  }

  /**
   * Get waitTime
   * @return waitTime
   */
  
  @Schema(name = "waitTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("waitTime")
  public @Nullable Long getWaitTime() {
    return waitTime;
  }

  public void setWaitTime(@Nullable Long waitTime) {
    this.waitTime = waitTime;
  }

  public ItineraryResponse generated(@Nullable Boolean generated) {
    this.generated = generated;
    return this;
  }

  /**
   * Get generated
   * @return generated
   */
  
  @Schema(name = "generated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generated")
  public @Nullable Boolean getGenerated() {
    return generated;
  }

  public void setGenerated(@Nullable Boolean generated) {
    this.generated = generated;
  }

  public ItineraryResponse valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItineraryResponse itineraryResponse = (ItineraryResponse) o;
    return Objects.equals(this.itineraryId, itineraryResponse.itineraryId) &&
        Objects.equals(this.waypointCount, itineraryResponse.waypointCount) &&
        Objects.equals(this.score, itineraryResponse.score) &&
        Objects.equals(this.errorCode, itineraryResponse.errorCode) &&
        Objects.equals(this.error, itineraryResponse.error) &&
        Objects.equals(this.itemCount, itineraryResponse.itemCount) &&
        Objects.equals(this.vehicle, itineraryResponse.vehicle) &&
        Objects.equals(this.stops, itineraryResponse.stops) &&
        Objects.equals(this.estimatedStartTime, itineraryResponse.estimatedStartTime) &&
        Objects.equals(this.estimatedEndTime, itineraryResponse.estimatedEndTime) &&
        Objects.equals(this.estimatedDuration, itineraryResponse.estimatedDuration) &&
        Objects.equals(this.estimatedDistance, itineraryResponse.estimatedDistance) &&
        Objects.equals(this.waitTime, itineraryResponse.waitTime) &&
        Objects.equals(this.generated, itineraryResponse.generated) &&
        Objects.equals(this.valid, itineraryResponse.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itineraryId, waypointCount, score, errorCode, error, itemCount, vehicle, stops, estimatedStartTime, estimatedEndTime, estimatedDuration, estimatedDistance, waitTime, generated, valid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItineraryResponse {\n");
    sb.append("    itineraryId: ").append(toIndentedString(itineraryId)).append("\n");
    sb.append("    waypointCount: ").append(toIndentedString(waypointCount)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    vehicle: ").append(toIndentedString(vehicle)).append("\n");
    sb.append("    stops: ").append(toIndentedString(stops)).append("\n");
    sb.append("    estimatedStartTime: ").append(toIndentedString(estimatedStartTime)).append("\n");
    sb.append("    estimatedEndTime: ").append(toIndentedString(estimatedEndTime)).append("\n");
    sb.append("    estimatedDuration: ").append(toIndentedString(estimatedDuration)).append("\n");
    sb.append("    estimatedDistance: ").append(toIndentedString(estimatedDistance)).append("\n");
    sb.append("    waitTime: ").append(toIndentedString(waitTime)).append("\n");
    sb.append("    generated: ").append(toIndentedString(generated)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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

