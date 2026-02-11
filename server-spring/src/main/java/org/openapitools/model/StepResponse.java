package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.LegResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * StepResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class StepResponse {

  private @Nullable LegResponse leg;

  private @Nullable Double distance;

  private @Nullable Long duration;

  private @Nullable Double startLat;

  private @Nullable Double startLng;

  private @Nullable Double startAlt;

  private @Nullable Long startDate;

  private @Nullable Double endLat;

  private @Nullable Double endLng;

  private @Nullable Double endAlt;

  private @Nullable Long endDate;

  private @Nullable Integer accuracy;

  public StepResponse leg(@Nullable LegResponse leg) {
    this.leg = leg;
    return this;
  }

  /**
   * Get leg
   * @return leg
   */
  @Valid 
  @Schema(name = "leg", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("leg")
  public @Nullable LegResponse getLeg() {
    return leg;
  }

  public void setLeg(@Nullable LegResponse leg) {
    this.leg = leg;
  }

  public StepResponse distance(@Nullable Double distance) {
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

  public StepResponse duration(@Nullable Long duration) {
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

  public StepResponse startLat(@Nullable Double startLat) {
    this.startLat = startLat;
    return this;
  }

  /**
   * Get startLat
   * @return startLat
   */
  
  @Schema(name = "startLat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startLat")
  public @Nullable Double getStartLat() {
    return startLat;
  }

  public void setStartLat(@Nullable Double startLat) {
    this.startLat = startLat;
  }

  public StepResponse startLng(@Nullable Double startLng) {
    this.startLng = startLng;
    return this;
  }

  /**
   * Get startLng
   * @return startLng
   */
  
  @Schema(name = "startLng", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startLng")
  public @Nullable Double getStartLng() {
    return startLng;
  }

  public void setStartLng(@Nullable Double startLng) {
    this.startLng = startLng;
  }

  public StepResponse startAlt(@Nullable Double startAlt) {
    this.startAlt = startAlt;
    return this;
  }

  /**
   * Get startAlt
   * @return startAlt
   */
  
  @Schema(name = "startAlt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startAlt")
  public @Nullable Double getStartAlt() {
    return startAlt;
  }

  public void setStartAlt(@Nullable Double startAlt) {
    this.startAlt = startAlt;
  }

  public StepResponse startDate(@Nullable Long startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public @Nullable Long getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable Long startDate) {
    this.startDate = startDate;
  }

  public StepResponse endLat(@Nullable Double endLat) {
    this.endLat = endLat;
    return this;
  }

  /**
   * Get endLat
   * @return endLat
   */
  
  @Schema(name = "endLat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endLat")
  public @Nullable Double getEndLat() {
    return endLat;
  }

  public void setEndLat(@Nullable Double endLat) {
    this.endLat = endLat;
  }

  public StepResponse endLng(@Nullable Double endLng) {
    this.endLng = endLng;
    return this;
  }

  /**
   * Get endLng
   * @return endLng
   */
  
  @Schema(name = "endLng", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endLng")
  public @Nullable Double getEndLng() {
    return endLng;
  }

  public void setEndLng(@Nullable Double endLng) {
    this.endLng = endLng;
  }

  public StepResponse endAlt(@Nullable Double endAlt) {
    this.endAlt = endAlt;
    return this;
  }

  /**
   * Get endAlt
   * @return endAlt
   */
  
  @Schema(name = "endAlt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endAlt")
  public @Nullable Double getEndAlt() {
    return endAlt;
  }

  public void setEndAlt(@Nullable Double endAlt) {
    this.endAlt = endAlt;
  }

  public StepResponse endDate(@Nullable Long endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  
  @Schema(name = "endDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public @Nullable Long getEndDate() {
    return endDate;
  }

  public void setEndDate(@Nullable Long endDate) {
    this.endDate = endDate;
  }

  public StepResponse accuracy(@Nullable Integer accuracy) {
    this.accuracy = accuracy;
    return this;
  }

  /**
   * Get accuracy
   * @return accuracy
   */
  
  @Schema(name = "accuracy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accuracy")
  public @Nullable Integer getAccuracy() {
    return accuracy;
  }

  public void setAccuracy(@Nullable Integer accuracy) {
    this.accuracy = accuracy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StepResponse stepResponse = (StepResponse) o;
    return Objects.equals(this.leg, stepResponse.leg) &&
        Objects.equals(this.distance, stepResponse.distance) &&
        Objects.equals(this.duration, stepResponse.duration) &&
        Objects.equals(this.startLat, stepResponse.startLat) &&
        Objects.equals(this.startLng, stepResponse.startLng) &&
        Objects.equals(this.startAlt, stepResponse.startAlt) &&
        Objects.equals(this.startDate, stepResponse.startDate) &&
        Objects.equals(this.endLat, stepResponse.endLat) &&
        Objects.equals(this.endLng, stepResponse.endLng) &&
        Objects.equals(this.endAlt, stepResponse.endAlt) &&
        Objects.equals(this.endDate, stepResponse.endDate) &&
        Objects.equals(this.accuracy, stepResponse.accuracy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leg, distance, duration, startLat, startLng, startAlt, startDate, endLat, endLng, endAlt, endDate, accuracy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StepResponse {\n");
    sb.append("    leg: ").append(toIndentedString(leg)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    startLat: ").append(toIndentedString(startLat)).append("\n");
    sb.append("    startLng: ").append(toIndentedString(startLng)).append("\n");
    sb.append("    startAlt: ").append(toIndentedString(startAlt)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endLat: ").append(toIndentedString(endLat)).append("\n");
    sb.append("    endLng: ").append(toIndentedString(endLng)).append("\n");
    sb.append("    endAlt: ").append(toIndentedString(endAlt)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
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

