package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.openapitools.model.Account;
import org.openapitools.model.Leg;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Step
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Step {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Account owner;

  private @Nullable String deviceId;

  private @Nullable Leg leg;

  private @Nullable Double distance;

  private @Nullable Long duration;

  private @Nullable Double startLatitude;

  private @Nullable Double startLongitude;

  private @Nullable Double startAltitude;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime startDate;

  private @Nullable Double endLatitude;

  private @Nullable Double endLongitude;

  private @Nullable Double endAltitude;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime endDate;

  public Step id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public Step active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  public Step valid(@Nullable Boolean valid) {
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

  public Step owner(@Nullable Account owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @Valid 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public @Nullable Account getOwner() {
    return owner;
  }

  public void setOwner(@Nullable Account owner) {
    this.owner = owner;
  }

  public Step deviceId(@Nullable String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * Get deviceId
   * @return deviceId
   */
  
  @Schema(name = "deviceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceId")
  public @Nullable String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(@Nullable String deviceId) {
    this.deviceId = deviceId;
  }

  public Step leg(@Nullable Leg leg) {
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
  public @Nullable Leg getLeg() {
    return leg;
  }

  public void setLeg(@Nullable Leg leg) {
    this.leg = leg;
  }

  public Step distance(@Nullable Double distance) {
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

  public Step duration(@Nullable Long duration) {
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

  public Step startLatitude(@Nullable Double startLatitude) {
    this.startLatitude = startLatitude;
    return this;
  }

  /**
   * Get startLatitude
   * @return startLatitude
   */
  
  @Schema(name = "startLatitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startLatitude")
  public @Nullable Double getStartLatitude() {
    return startLatitude;
  }

  public void setStartLatitude(@Nullable Double startLatitude) {
    this.startLatitude = startLatitude;
  }

  public Step startLongitude(@Nullable Double startLongitude) {
    this.startLongitude = startLongitude;
    return this;
  }

  /**
   * Get startLongitude
   * @return startLongitude
   */
  
  @Schema(name = "startLongitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startLongitude")
  public @Nullable Double getStartLongitude() {
    return startLongitude;
  }

  public void setStartLongitude(@Nullable Double startLongitude) {
    this.startLongitude = startLongitude;
  }

  public Step startAltitude(@Nullable Double startAltitude) {
    this.startAltitude = startAltitude;
    return this;
  }

  /**
   * Get startAltitude
   * @return startAltitude
   */
  
  @Schema(name = "startAltitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startAltitude")
  public @Nullable Double getStartAltitude() {
    return startAltitude;
  }

  public void setStartAltitude(@Nullable Double startAltitude) {
    this.startAltitude = startAltitude;
  }

  public Step startDate(@Nullable OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  @Valid 
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public @Nullable OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public Step endLatitude(@Nullable Double endLatitude) {
    this.endLatitude = endLatitude;
    return this;
  }

  /**
   * Get endLatitude
   * @return endLatitude
   */
  
  @Schema(name = "endLatitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endLatitude")
  public @Nullable Double getEndLatitude() {
    return endLatitude;
  }

  public void setEndLatitude(@Nullable Double endLatitude) {
    this.endLatitude = endLatitude;
  }

  public Step endLongitude(@Nullable Double endLongitude) {
    this.endLongitude = endLongitude;
    return this;
  }

  /**
   * Get endLongitude
   * @return endLongitude
   */
  
  @Schema(name = "endLongitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endLongitude")
  public @Nullable Double getEndLongitude() {
    return endLongitude;
  }

  public void setEndLongitude(@Nullable Double endLongitude) {
    this.endLongitude = endLongitude;
  }

  public Step endAltitude(@Nullable Double endAltitude) {
    this.endAltitude = endAltitude;
    return this;
  }

  /**
   * Get endAltitude
   * @return endAltitude
   */
  
  @Schema(name = "endAltitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endAltitude")
  public @Nullable Double getEndAltitude() {
    return endAltitude;
  }

  public void setEndAltitude(@Nullable Double endAltitude) {
    this.endAltitude = endAltitude;
  }

  public Step endDate(@Nullable OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  @Valid 
  @Schema(name = "endDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public @Nullable OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(@Nullable OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Step step = (Step) o;
    return Objects.equals(this.id, step.id) &&
        Objects.equals(this.active, step.active) &&
        Objects.equals(this.valid, step.valid) &&
        Objects.equals(this.owner, step.owner) &&
        Objects.equals(this.deviceId, step.deviceId) &&
        Objects.equals(this.leg, step.leg) &&
        Objects.equals(this.distance, step.distance) &&
        Objects.equals(this.duration, step.duration) &&
        Objects.equals(this.startLatitude, step.startLatitude) &&
        Objects.equals(this.startLongitude, step.startLongitude) &&
        Objects.equals(this.startAltitude, step.startAltitude) &&
        Objects.equals(this.startDate, step.startDate) &&
        Objects.equals(this.endLatitude, step.endLatitude) &&
        Objects.equals(this.endLongitude, step.endLongitude) &&
        Objects.equals(this.endAltitude, step.endAltitude) &&
        Objects.equals(this.endDate, step.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, owner, deviceId, leg, distance, duration, startLatitude, startLongitude, startAltitude, startDate, endLatitude, endLongitude, endAltitude, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Step {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    leg: ").append(toIndentedString(leg)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    startLatitude: ").append(toIndentedString(startLatitude)).append("\n");
    sb.append("    startLongitude: ").append(toIndentedString(startLongitude)).append("\n");
    sb.append("    startAltitude: ").append(toIndentedString(startAltitude)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endLatitude: ").append(toIndentedString(endLatitude)).append("\n");
    sb.append("    endLongitude: ").append(toIndentedString(endLongitude)).append("\n");
    sb.append("    endAltitude: ").append(toIndentedString(endAltitude)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

