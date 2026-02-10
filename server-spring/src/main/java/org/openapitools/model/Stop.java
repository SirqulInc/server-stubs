package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Location;
import org.openapitools.model.Note;
import org.openapitools.model.Route;
import org.openapitools.model.Shipment;
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
 * Stop
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Stop {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable String locationDescription;

  private @Nullable String name;

  private @Nullable Account owner;

  private @Nullable Location location;

  @Valid
  private List<@Valid Note> notes = new ArrayList<>();

  private @Nullable Long noteCount;

  /**
   * Gets or Sets stopType
   */
  public enum StopTypeEnum {
    PICKUP("PICKUP"),
    
    DROPOFF("DROPOFF"),
    
    START("START"),
    
    END("END"),
    
    ROUTING("ROUTING");

    private final String value;

    StopTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StopTypeEnum fromValue(String value) {
      for (StopTypeEnum b : StopTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable StopTypeEnum stopType;

  private @Nullable Long orderIndex;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime startTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime endTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime estimatedTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime estimatedArrivalTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime estimatedDepartureTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime actualTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime desiredTime;

  private @Nullable Integer timePadding;

  private @Nullable Route route;

  private @Nullable Shipment shipment;

  /**
   * Gets or Sets progressStatus
   */
  public enum ProgressStatusEnum {
    PENDING("PENDING"),
    
    COMPLETE("COMPLETE"),
    
    INVALID("INVALID");

    private final String value;

    ProgressStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProgressStatusEnum fromValue(String value) {
      for (ProgressStatusEnum b : ProgressStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ProgressStatusEnum progressStatus;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime compareEstimatedTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime compareEstimatedArrivalTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime compareEstimiatedDepartureTime;

  private @Nullable String polyline;

  private @Nullable Stop parent;

  private @Nullable String locationDisplay;

  private @Nullable Boolean complete;

  private @Nullable String contentName;

  private @Nullable String locationAddress;

  public Stop id(@Nullable Long id) {
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

  public Stop active(@Nullable Boolean active) {
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

  public Stop valid(@Nullable Boolean valid) {
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

  public Stop latitude(@Nullable Double latitude) {
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

  public Stop longitude(@Nullable Double longitude) {
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

  public Stop locationDescription(@Nullable String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

  /**
   * Get locationDescription
   * @return locationDescription
   */
  
  @Schema(name = "locationDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationDescription")
  public @Nullable String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(@Nullable String locationDescription) {
    this.locationDescription = locationDescription;
  }

  public Stop name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public Stop owner(@Nullable Account owner) {
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

  public Stop location(@Nullable Location location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @Valid 
  @Schema(name = "location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public @Nullable Location getLocation() {
    return location;
  }

  public void setLocation(@Nullable Location location) {
    this.location = location;
  }

  public Stop notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public Stop addNotesItem(Note notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Get notes
   * @return notes
   */
  @Valid 
  @Schema(name = "notes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notes")
  public List<@Valid Note> getNotes() {
    return notes;
  }

  public void setNotes(List<@Valid Note> notes) {
    this.notes = notes;
  }

  public Stop noteCount(@Nullable Long noteCount) {
    this.noteCount = noteCount;
    return this;
  }

  /**
   * Get noteCount
   * @return noteCount
   */
  
  @Schema(name = "noteCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("noteCount")
  public @Nullable Long getNoteCount() {
    return noteCount;
  }

  public void setNoteCount(@Nullable Long noteCount) {
    this.noteCount = noteCount;
  }

  public Stop stopType(@Nullable StopTypeEnum stopType) {
    this.stopType = stopType;
    return this;
  }

  /**
   * Get stopType
   * @return stopType
   */
  
  @Schema(name = "stopType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stopType")
  public @Nullable StopTypeEnum getStopType() {
    return stopType;
  }

  public void setStopType(@Nullable StopTypeEnum stopType) {
    this.stopType = stopType;
  }

  public Stop orderIndex(@Nullable Long orderIndex) {
    this.orderIndex = orderIndex;
    return this;
  }

  /**
   * Get orderIndex
   * @return orderIndex
   */
  
  @Schema(name = "orderIndex", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderIndex")
  public @Nullable Long getOrderIndex() {
    return orderIndex;
  }

  public void setOrderIndex(@Nullable Long orderIndex) {
    this.orderIndex = orderIndex;
  }

  public Stop startTime(@Nullable OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
   */
  @Valid 
  @Schema(name = "startTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTime")
  public @Nullable OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(@Nullable OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public Stop endTime(@Nullable OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
   */
  @Valid 
  @Schema(name = "endTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endTime")
  public @Nullable OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(@Nullable OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public Stop estimatedTime(@Nullable OffsetDateTime estimatedTime) {
    this.estimatedTime = estimatedTime;
    return this;
  }

  /**
   * Get estimatedTime
   * @return estimatedTime
   */
  @Valid 
  @Schema(name = "estimatedTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedTime")
  public @Nullable OffsetDateTime getEstimatedTime() {
    return estimatedTime;
  }

  public void setEstimatedTime(@Nullable OffsetDateTime estimatedTime) {
    this.estimatedTime = estimatedTime;
  }

  public Stop estimatedArrivalTime(@Nullable OffsetDateTime estimatedArrivalTime) {
    this.estimatedArrivalTime = estimatedArrivalTime;
    return this;
  }

  /**
   * Get estimatedArrivalTime
   * @return estimatedArrivalTime
   */
  @Valid 
  @Schema(name = "estimatedArrivalTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedArrivalTime")
  public @Nullable OffsetDateTime getEstimatedArrivalTime() {
    return estimatedArrivalTime;
  }

  public void setEstimatedArrivalTime(@Nullable OffsetDateTime estimatedArrivalTime) {
    this.estimatedArrivalTime = estimatedArrivalTime;
  }

  public Stop estimatedDepartureTime(@Nullable OffsetDateTime estimatedDepartureTime) {
    this.estimatedDepartureTime = estimatedDepartureTime;
    return this;
  }

  /**
   * Get estimatedDepartureTime
   * @return estimatedDepartureTime
   */
  @Valid 
  @Schema(name = "estimatedDepartureTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedDepartureTime")
  public @Nullable OffsetDateTime getEstimatedDepartureTime() {
    return estimatedDepartureTime;
  }

  public void setEstimatedDepartureTime(@Nullable OffsetDateTime estimatedDepartureTime) {
    this.estimatedDepartureTime = estimatedDepartureTime;
  }

  public Stop actualTime(@Nullable OffsetDateTime actualTime) {
    this.actualTime = actualTime;
    return this;
  }

  /**
   * Get actualTime
   * @return actualTime
   */
  @Valid 
  @Schema(name = "actualTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actualTime")
  public @Nullable OffsetDateTime getActualTime() {
    return actualTime;
  }

  public void setActualTime(@Nullable OffsetDateTime actualTime) {
    this.actualTime = actualTime;
  }

  public Stop desiredTime(@Nullable OffsetDateTime desiredTime) {
    this.desiredTime = desiredTime;
    return this;
  }

  /**
   * Get desiredTime
   * @return desiredTime
   */
  @Valid 
  @Schema(name = "desiredTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("desiredTime")
  public @Nullable OffsetDateTime getDesiredTime() {
    return desiredTime;
  }

  public void setDesiredTime(@Nullable OffsetDateTime desiredTime) {
    this.desiredTime = desiredTime;
  }

  public Stop timePadding(@Nullable Integer timePadding) {
    this.timePadding = timePadding;
    return this;
  }

  /**
   * Get timePadding
   * @return timePadding
   */
  
  @Schema(name = "timePadding", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timePadding")
  public @Nullable Integer getTimePadding() {
    return timePadding;
  }

  public void setTimePadding(@Nullable Integer timePadding) {
    this.timePadding = timePadding;
  }

  public Stop route(@Nullable Route route) {
    this.route = route;
    return this;
  }

  /**
   * Get route
   * @return route
   */
  @Valid 
  @Schema(name = "route", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("route")
  public @Nullable Route getRoute() {
    return route;
  }

  public void setRoute(@Nullable Route route) {
    this.route = route;
  }

  public Stop shipment(@Nullable Shipment shipment) {
    this.shipment = shipment;
    return this;
  }

  /**
   * Get shipment
   * @return shipment
   */
  @Valid 
  @Schema(name = "shipment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipment")
  public @Nullable Shipment getShipment() {
    return shipment;
  }

  public void setShipment(@Nullable Shipment shipment) {
    this.shipment = shipment;
  }

  public Stop progressStatus(@Nullable ProgressStatusEnum progressStatus) {
    this.progressStatus = progressStatus;
    return this;
  }

  /**
   * Get progressStatus
   * @return progressStatus
   */
  
  @Schema(name = "progressStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("progressStatus")
  public @Nullable ProgressStatusEnum getProgressStatus() {
    return progressStatus;
  }

  public void setProgressStatus(@Nullable ProgressStatusEnum progressStatus) {
    this.progressStatus = progressStatus;
  }

  public Stop compareEstimatedTime(@Nullable OffsetDateTime compareEstimatedTime) {
    this.compareEstimatedTime = compareEstimatedTime;
    return this;
  }

  /**
   * Get compareEstimatedTime
   * @return compareEstimatedTime
   */
  @Valid 
  @Schema(name = "compareEstimatedTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compareEstimatedTime")
  public @Nullable OffsetDateTime getCompareEstimatedTime() {
    return compareEstimatedTime;
  }

  public void setCompareEstimatedTime(@Nullable OffsetDateTime compareEstimatedTime) {
    this.compareEstimatedTime = compareEstimatedTime;
  }

  public Stop compareEstimatedArrivalTime(@Nullable OffsetDateTime compareEstimatedArrivalTime) {
    this.compareEstimatedArrivalTime = compareEstimatedArrivalTime;
    return this;
  }

  /**
   * Get compareEstimatedArrivalTime
   * @return compareEstimatedArrivalTime
   */
  @Valid 
  @Schema(name = "compareEstimatedArrivalTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compareEstimatedArrivalTime")
  public @Nullable OffsetDateTime getCompareEstimatedArrivalTime() {
    return compareEstimatedArrivalTime;
  }

  public void setCompareEstimatedArrivalTime(@Nullable OffsetDateTime compareEstimatedArrivalTime) {
    this.compareEstimatedArrivalTime = compareEstimatedArrivalTime;
  }

  public Stop compareEstimiatedDepartureTime(@Nullable OffsetDateTime compareEstimiatedDepartureTime) {
    this.compareEstimiatedDepartureTime = compareEstimiatedDepartureTime;
    return this;
  }

  /**
   * Get compareEstimiatedDepartureTime
   * @return compareEstimiatedDepartureTime
   */
  @Valid 
  @Schema(name = "compareEstimiatedDepartureTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compareEstimiatedDepartureTime")
  public @Nullable OffsetDateTime getCompareEstimiatedDepartureTime() {
    return compareEstimiatedDepartureTime;
  }

  public void setCompareEstimiatedDepartureTime(@Nullable OffsetDateTime compareEstimiatedDepartureTime) {
    this.compareEstimiatedDepartureTime = compareEstimiatedDepartureTime;
  }

  public Stop polyline(@Nullable String polyline) {
    this.polyline = polyline;
    return this;
  }

  /**
   * Get polyline
   * @return polyline
   */
  
  @Schema(name = "polyline", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("polyline")
  public @Nullable String getPolyline() {
    return polyline;
  }

  public void setPolyline(@Nullable String polyline) {
    this.polyline = polyline;
  }

  public Stop parent(@Nullable Stop parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
   */
  @Valid 
  @Schema(name = "parent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent")
  public @Nullable Stop getParent() {
    return parent;
  }

  public void setParent(@Nullable Stop parent) {
    this.parent = parent;
  }

  public Stop locationDisplay(@Nullable String locationDisplay) {
    this.locationDisplay = locationDisplay;
    return this;
  }

  /**
   * Get locationDisplay
   * @return locationDisplay
   */
  
  @Schema(name = "locationDisplay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationDisplay")
  public @Nullable String getLocationDisplay() {
    return locationDisplay;
  }

  public void setLocationDisplay(@Nullable String locationDisplay) {
    this.locationDisplay = locationDisplay;
  }

  public Stop complete(@Nullable Boolean complete) {
    this.complete = complete;
    return this;
  }

  /**
   * Get complete
   * @return complete
   */
  
  @Schema(name = "complete", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("complete")
  public @Nullable Boolean getComplete() {
    return complete;
  }

  public void setComplete(@Nullable Boolean complete) {
    this.complete = complete;
  }

  public Stop contentName(@Nullable String contentName) {
    this.contentName = contentName;
    return this;
  }

  /**
   * Get contentName
   * @return contentName
   */
  
  @Schema(name = "contentName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentName")
  public @Nullable String getContentName() {
    return contentName;
  }

  public void setContentName(@Nullable String contentName) {
    this.contentName = contentName;
  }

  public Stop locationAddress(@Nullable String locationAddress) {
    this.locationAddress = locationAddress;
    return this;
  }

  /**
   * Get locationAddress
   * @return locationAddress
   */
  
  @Schema(name = "locationAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationAddress")
  public @Nullable String getLocationAddress() {
    return locationAddress;
  }

  public void setLocationAddress(@Nullable String locationAddress) {
    this.locationAddress = locationAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stop stop = (Stop) o;
    return Objects.equals(this.id, stop.id) &&
        Objects.equals(this.active, stop.active) &&
        Objects.equals(this.valid, stop.valid) &&
        Objects.equals(this.latitude, stop.latitude) &&
        Objects.equals(this.longitude, stop.longitude) &&
        Objects.equals(this.locationDescription, stop.locationDescription) &&
        Objects.equals(this.name, stop.name) &&
        Objects.equals(this.owner, stop.owner) &&
        Objects.equals(this.location, stop.location) &&
        Objects.equals(this.notes, stop.notes) &&
        Objects.equals(this.noteCount, stop.noteCount) &&
        Objects.equals(this.stopType, stop.stopType) &&
        Objects.equals(this.orderIndex, stop.orderIndex) &&
        Objects.equals(this.startTime, stop.startTime) &&
        Objects.equals(this.endTime, stop.endTime) &&
        Objects.equals(this.estimatedTime, stop.estimatedTime) &&
        Objects.equals(this.estimatedArrivalTime, stop.estimatedArrivalTime) &&
        Objects.equals(this.estimatedDepartureTime, stop.estimatedDepartureTime) &&
        Objects.equals(this.actualTime, stop.actualTime) &&
        Objects.equals(this.desiredTime, stop.desiredTime) &&
        Objects.equals(this.timePadding, stop.timePadding) &&
        Objects.equals(this.route, stop.route) &&
        Objects.equals(this.shipment, stop.shipment) &&
        Objects.equals(this.progressStatus, stop.progressStatus) &&
        Objects.equals(this.compareEstimatedTime, stop.compareEstimatedTime) &&
        Objects.equals(this.compareEstimatedArrivalTime, stop.compareEstimatedArrivalTime) &&
        Objects.equals(this.compareEstimiatedDepartureTime, stop.compareEstimiatedDepartureTime) &&
        Objects.equals(this.polyline, stop.polyline) &&
        Objects.equals(this.parent, stop.parent) &&
        Objects.equals(this.locationDisplay, stop.locationDisplay) &&
        Objects.equals(this.complete, stop.complete) &&
        Objects.equals(this.contentName, stop.contentName) &&
        Objects.equals(this.locationAddress, stop.locationAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, latitude, longitude, locationDescription, name, owner, location, notes, noteCount, stopType, orderIndex, startTime, endTime, estimatedTime, estimatedArrivalTime, estimatedDepartureTime, actualTime, desiredTime, timePadding, route, shipment, progressStatus, compareEstimatedTime, compareEstimatedArrivalTime, compareEstimiatedDepartureTime, polyline, parent, locationDisplay, complete, contentName, locationAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stop {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    noteCount: ").append(toIndentedString(noteCount)).append("\n");
    sb.append("    stopType: ").append(toIndentedString(stopType)).append("\n");
    sb.append("    orderIndex: ").append(toIndentedString(orderIndex)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    estimatedTime: ").append(toIndentedString(estimatedTime)).append("\n");
    sb.append("    estimatedArrivalTime: ").append(toIndentedString(estimatedArrivalTime)).append("\n");
    sb.append("    estimatedDepartureTime: ").append(toIndentedString(estimatedDepartureTime)).append("\n");
    sb.append("    actualTime: ").append(toIndentedString(actualTime)).append("\n");
    sb.append("    desiredTime: ").append(toIndentedString(desiredTime)).append("\n");
    sb.append("    timePadding: ").append(toIndentedString(timePadding)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    shipment: ").append(toIndentedString(shipment)).append("\n");
    sb.append("    progressStatus: ").append(toIndentedString(progressStatus)).append("\n");
    sb.append("    compareEstimatedTime: ").append(toIndentedString(compareEstimatedTime)).append("\n");
    sb.append("    compareEstimatedArrivalTime: ").append(toIndentedString(compareEstimatedArrivalTime)).append("\n");
    sb.append("    compareEstimiatedDepartureTime: ").append(toIndentedString(compareEstimiatedDepartureTime)).append("\n");
    sb.append("    polyline: ").append(toIndentedString(polyline)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    locationDisplay: ").append(toIndentedString(locationDisplay)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
    sb.append("    locationAddress: ").append(toIndentedString(locationAddress)).append("\n");
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

