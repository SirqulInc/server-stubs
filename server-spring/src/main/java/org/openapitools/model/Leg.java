package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Application;
import org.openapitools.model.Step;
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
 * Leg
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Leg {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Account owner;

  private @Nullable Account parentOwner;

  private @Nullable Application application;

  private @Nullable String deviceId;

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

  private @Nullable String type;

  private @Nullable Long retailerLocationId;

  private @Nullable String floorId;

  @Valid
  private List<@Valid Step> steps = new ArrayList<>();

  public Leg id(@Nullable Long id) {
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

  public Leg active(@Nullable Boolean active) {
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

  public Leg valid(@Nullable Boolean valid) {
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

  public Leg owner(@Nullable Account owner) {
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

  public Leg parentOwner(@Nullable Account parentOwner) {
    this.parentOwner = parentOwner;
    return this;
  }

  /**
   * Get parentOwner
   * @return parentOwner
   */
  @Valid 
  @Schema(name = "parentOwner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentOwner")
  public @Nullable Account getParentOwner() {
    return parentOwner;
  }

  public void setParentOwner(@Nullable Account parentOwner) {
    this.parentOwner = parentOwner;
  }

  public Leg application(@Nullable Application application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
   */
  @Valid 
  @Schema(name = "application", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("application")
  public @Nullable Application getApplication() {
    return application;
  }

  public void setApplication(@Nullable Application application) {
    this.application = application;
  }

  public Leg deviceId(@Nullable String deviceId) {
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

  public Leg distance(@Nullable Double distance) {
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

  public Leg duration(@Nullable Long duration) {
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

  public Leg startLatitude(@Nullable Double startLatitude) {
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

  public Leg startLongitude(@Nullable Double startLongitude) {
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

  public Leg startAltitude(@Nullable Double startAltitude) {
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

  public Leg startDate(@Nullable OffsetDateTime startDate) {
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

  public Leg endLatitude(@Nullable Double endLatitude) {
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

  public Leg endLongitude(@Nullable Double endLongitude) {
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

  public Leg endAltitude(@Nullable Double endAltitude) {
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

  public Leg endDate(@Nullable OffsetDateTime endDate) {
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

  public Leg type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable String getType() {
    return type;
  }

  public void setType(@Nullable String type) {
    this.type = type;
  }

  public Leg retailerLocationId(@Nullable Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
    return this;
  }

  /**
   * Get retailerLocationId
   * @return retailerLocationId
   */
  
  @Schema(name = "retailerLocationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retailerLocationId")
  public @Nullable Long getRetailerLocationId() {
    return retailerLocationId;
  }

  public void setRetailerLocationId(@Nullable Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
  }

  public Leg floorId(@Nullable String floorId) {
    this.floorId = floorId;
    return this;
  }

  /**
   * Get floorId
   * @return floorId
   */
  
  @Schema(name = "floorId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("floorId")
  public @Nullable String getFloorId() {
    return floorId;
  }

  public void setFloorId(@Nullable String floorId) {
    this.floorId = floorId;
  }

  public Leg steps(List<@Valid Step> steps) {
    this.steps = steps;
    return this;
  }

  public Leg addStepsItem(Step stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

  /**
   * Get steps
   * @return steps
   */
  @Valid 
  @Schema(name = "steps", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("steps")
  public List<@Valid Step> getSteps() {
    return steps;
  }

  public void setSteps(List<@Valid Step> steps) {
    this.steps = steps;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Leg leg = (Leg) o;
    return Objects.equals(this.id, leg.id) &&
        Objects.equals(this.active, leg.active) &&
        Objects.equals(this.valid, leg.valid) &&
        Objects.equals(this.owner, leg.owner) &&
        Objects.equals(this.parentOwner, leg.parentOwner) &&
        Objects.equals(this.application, leg.application) &&
        Objects.equals(this.deviceId, leg.deviceId) &&
        Objects.equals(this.distance, leg.distance) &&
        Objects.equals(this.duration, leg.duration) &&
        Objects.equals(this.startLatitude, leg.startLatitude) &&
        Objects.equals(this.startLongitude, leg.startLongitude) &&
        Objects.equals(this.startAltitude, leg.startAltitude) &&
        Objects.equals(this.startDate, leg.startDate) &&
        Objects.equals(this.endLatitude, leg.endLatitude) &&
        Objects.equals(this.endLongitude, leg.endLongitude) &&
        Objects.equals(this.endAltitude, leg.endAltitude) &&
        Objects.equals(this.endDate, leg.endDate) &&
        Objects.equals(this.type, leg.type) &&
        Objects.equals(this.retailerLocationId, leg.retailerLocationId) &&
        Objects.equals(this.floorId, leg.floorId) &&
        Objects.equals(this.steps, leg.steps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, owner, parentOwner, application, deviceId, distance, duration, startLatitude, startLongitude, startAltitude, startDate, endLatitude, endLongitude, endAltitude, endDate, type, retailerLocationId, floorId, steps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Leg {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    parentOwner: ").append(toIndentedString(parentOwner)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
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
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    retailerLocationId: ").append(toIndentedString(retailerLocationId)).append("\n");
    sb.append("    floorId: ").append(toIndentedString(floorId)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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

