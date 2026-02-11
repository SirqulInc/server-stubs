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
import org.openapitools.model.Asset;
import org.openapitools.model.Note;
import org.openapitools.model.Program;
import org.openapitools.model.Region;
import org.openapitools.model.ServiceHub;
import org.openapitools.model.Shipment;
import org.openapitools.model.Stop;
import org.openapitools.model.Vehicle;
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
 * Route
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Route {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable String name;

  private @Nullable String externalId;

  private @Nullable ServiceHub hub;

  private @Nullable Program program;

  private @Nullable Region zone;

  private @Nullable Vehicle vehicle;

  private @Nullable Account driver;

  private @Nullable Account concierge;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime scheduled;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime approved;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime started;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime completed;

  private @Nullable Float totalDistance;

  private @Nullable Long totalTime;

  private @Nullable Double estimatedDistance;

  private @Nullable Long estimatedTime;

  private @Nullable Stop startStop;

  private @Nullable Stop endStop;

  @Valid
  private List<@Valid Stop> stops = new ArrayList<>();

  @Valid
  private List<@Valid Shipment> shipments = new ArrayList<>();

  private @Nullable Boolean allShipmentsConfirmed;

  private @Nullable Integer shipmentOrderCount;

  private @Nullable String polyline;

  @Valid
  private List<@Valid Note> notes = new ArrayList<>();

  private @Nullable Long noteCount;

  private @Nullable String glympseToken;

  private @Nullable Boolean enableOptimization;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime optimizedDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime optimizationStarted;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime optimizationCompleted;

  private @Nullable Boolean featured;

  private @Nullable Asset image;

  private @Nullable Route parent;

  private @Nullable String contentName;

  public Route id(@Nullable Long id) {
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

  public Route active(@Nullable Boolean active) {
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

  public Route valid(@Nullable Boolean valid) {
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

  public Route name(@Nullable String name) {
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

  public Route externalId(@Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
   */
  
  @Schema(name = "externalId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalId")
  public @Nullable String getExternalId() {
    return externalId;
  }

  public void setExternalId(@Nullable String externalId) {
    this.externalId = externalId;
  }

  public Route hub(@Nullable ServiceHub hub) {
    this.hub = hub;
    return this;
  }

  /**
   * Get hub
   * @return hub
   */
  @Valid 
  @Schema(name = "hub", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hub")
  public @Nullable ServiceHub getHub() {
    return hub;
  }

  public void setHub(@Nullable ServiceHub hub) {
    this.hub = hub;
  }

  public Route program(@Nullable Program program) {
    this.program = program;
    return this;
  }

  /**
   * Get program
   * @return program
   */
  @Valid 
  @Schema(name = "program", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("program")
  public @Nullable Program getProgram() {
    return program;
  }

  public void setProgram(@Nullable Program program) {
    this.program = program;
  }

  public Route zone(@Nullable Region zone) {
    this.zone = zone;
    return this;
  }

  /**
   * Get zone
   * @return zone
   */
  @Valid 
  @Schema(name = "zone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("zone")
  public @Nullable Region getZone() {
    return zone;
  }

  public void setZone(@Nullable Region zone) {
    this.zone = zone;
  }

  public Route vehicle(@Nullable Vehicle vehicle) {
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
  public @Nullable Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(@Nullable Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public Route driver(@Nullable Account driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Get driver
   * @return driver
   */
  @Valid 
  @Schema(name = "driver", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("driver")
  public @Nullable Account getDriver() {
    return driver;
  }

  public void setDriver(@Nullable Account driver) {
    this.driver = driver;
  }

  public Route concierge(@Nullable Account concierge) {
    this.concierge = concierge;
    return this;
  }

  /**
   * Get concierge
   * @return concierge
   */
  @Valid 
  @Schema(name = "concierge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("concierge")
  public @Nullable Account getConcierge() {
    return concierge;
  }

  public void setConcierge(@Nullable Account concierge) {
    this.concierge = concierge;
  }

  public Route scheduled(@Nullable OffsetDateTime scheduled) {
    this.scheduled = scheduled;
    return this;
  }

  /**
   * Get scheduled
   * @return scheduled
   */
  @Valid 
  @Schema(name = "scheduled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduled")
  public @Nullable OffsetDateTime getScheduled() {
    return scheduled;
  }

  public void setScheduled(@Nullable OffsetDateTime scheduled) {
    this.scheduled = scheduled;
  }

  public Route approved(@Nullable OffsetDateTime approved) {
    this.approved = approved;
    return this;
  }

  /**
   * Get approved
   * @return approved
   */
  @Valid 
  @Schema(name = "approved", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approved")
  public @Nullable OffsetDateTime getApproved() {
    return approved;
  }

  public void setApproved(@Nullable OffsetDateTime approved) {
    this.approved = approved;
  }

  public Route started(@Nullable OffsetDateTime started) {
    this.started = started;
    return this;
  }

  /**
   * Get started
   * @return started
   */
  @Valid 
  @Schema(name = "started", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("started")
  public @Nullable OffsetDateTime getStarted() {
    return started;
  }

  public void setStarted(@Nullable OffsetDateTime started) {
    this.started = started;
  }

  public Route completed(@Nullable OffsetDateTime completed) {
    this.completed = completed;
    return this;
  }

  /**
   * Get completed
   * @return completed
   */
  @Valid 
  @Schema(name = "completed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completed")
  public @Nullable OffsetDateTime getCompleted() {
    return completed;
  }

  public void setCompleted(@Nullable OffsetDateTime completed) {
    this.completed = completed;
  }

  public Route totalDistance(@Nullable Float totalDistance) {
    this.totalDistance = totalDistance;
    return this;
  }

  /**
   * Get totalDistance
   * @return totalDistance
   */
  
  @Schema(name = "totalDistance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalDistance")
  public @Nullable Float getTotalDistance() {
    return totalDistance;
  }

  public void setTotalDistance(@Nullable Float totalDistance) {
    this.totalDistance = totalDistance;
  }

  public Route totalTime(@Nullable Long totalTime) {
    this.totalTime = totalTime;
    return this;
  }

  /**
   * Get totalTime
   * @return totalTime
   */
  
  @Schema(name = "totalTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalTime")
  public @Nullable Long getTotalTime() {
    return totalTime;
  }

  public void setTotalTime(@Nullable Long totalTime) {
    this.totalTime = totalTime;
  }

  public Route estimatedDistance(@Nullable Double estimatedDistance) {
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

  public Route estimatedTime(@Nullable Long estimatedTime) {
    this.estimatedTime = estimatedTime;
    return this;
  }

  /**
   * Get estimatedTime
   * @return estimatedTime
   */
  
  @Schema(name = "estimatedTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedTime")
  public @Nullable Long getEstimatedTime() {
    return estimatedTime;
  }

  public void setEstimatedTime(@Nullable Long estimatedTime) {
    this.estimatedTime = estimatedTime;
  }

  public Route startStop(@Nullable Stop startStop) {
    this.startStop = startStop;
    return this;
  }

  /**
   * Get startStop
   * @return startStop
   */
  @Valid 
  @Schema(name = "startStop", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startStop")
  public @Nullable Stop getStartStop() {
    return startStop;
  }

  public void setStartStop(@Nullable Stop startStop) {
    this.startStop = startStop;
  }

  public Route endStop(@Nullable Stop endStop) {
    this.endStop = endStop;
    return this;
  }

  /**
   * Get endStop
   * @return endStop
   */
  @Valid 
  @Schema(name = "endStop", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endStop")
  public @Nullable Stop getEndStop() {
    return endStop;
  }

  public void setEndStop(@Nullable Stop endStop) {
    this.endStop = endStop;
  }

  public Route stops(List<@Valid Stop> stops) {
    this.stops = stops;
    return this;
  }

  public Route addStopsItem(Stop stopsItem) {
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
  public List<@Valid Stop> getStops() {
    return stops;
  }

  public void setStops(List<@Valid Stop> stops) {
    this.stops = stops;
  }

  public Route shipments(List<@Valid Shipment> shipments) {
    this.shipments = shipments;
    return this;
  }

  public Route addShipmentsItem(Shipment shipmentsItem) {
    if (this.shipments == null) {
      this.shipments = new ArrayList<>();
    }
    this.shipments.add(shipmentsItem);
    return this;
  }

  /**
   * Get shipments
   * @return shipments
   */
  @Valid 
  @Schema(name = "shipments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipments")
  public List<@Valid Shipment> getShipments() {
    return shipments;
  }

  public void setShipments(List<@Valid Shipment> shipments) {
    this.shipments = shipments;
  }

  public Route allShipmentsConfirmed(@Nullable Boolean allShipmentsConfirmed) {
    this.allShipmentsConfirmed = allShipmentsConfirmed;
    return this;
  }

  /**
   * Get allShipmentsConfirmed
   * @return allShipmentsConfirmed
   */
  
  @Schema(name = "allShipmentsConfirmed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allShipmentsConfirmed")
  public @Nullable Boolean getAllShipmentsConfirmed() {
    return allShipmentsConfirmed;
  }

  public void setAllShipmentsConfirmed(@Nullable Boolean allShipmentsConfirmed) {
    this.allShipmentsConfirmed = allShipmentsConfirmed;
  }

  public Route shipmentOrderCount(@Nullable Integer shipmentOrderCount) {
    this.shipmentOrderCount = shipmentOrderCount;
    return this;
  }

  /**
   * Get shipmentOrderCount
   * @return shipmentOrderCount
   */
  
  @Schema(name = "shipmentOrderCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipmentOrderCount")
  public @Nullable Integer getShipmentOrderCount() {
    return shipmentOrderCount;
  }

  public void setShipmentOrderCount(@Nullable Integer shipmentOrderCount) {
    this.shipmentOrderCount = shipmentOrderCount;
  }

  public Route polyline(@Nullable String polyline) {
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

  public Route notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public Route addNotesItem(Note notesItem) {
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

  public Route noteCount(@Nullable Long noteCount) {
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

  public Route glympseToken(@Nullable String glympseToken) {
    this.glympseToken = glympseToken;
    return this;
  }

  /**
   * Get glympseToken
   * @return glympseToken
   */
  
  @Schema(name = "glympseToken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("glympseToken")
  public @Nullable String getGlympseToken() {
    return glympseToken;
  }

  public void setGlympseToken(@Nullable String glympseToken) {
    this.glympseToken = glympseToken;
  }

  public Route enableOptimization(@Nullable Boolean enableOptimization) {
    this.enableOptimization = enableOptimization;
    return this;
  }

  /**
   * Get enableOptimization
   * @return enableOptimization
   */
  
  @Schema(name = "enableOptimization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enableOptimization")
  public @Nullable Boolean getEnableOptimization() {
    return enableOptimization;
  }

  public void setEnableOptimization(@Nullable Boolean enableOptimization) {
    this.enableOptimization = enableOptimization;
  }

  public Route optimizedDate(@Nullable OffsetDateTime optimizedDate) {
    this.optimizedDate = optimizedDate;
    return this;
  }

  /**
   * Get optimizedDate
   * @return optimizedDate
   */
  @Valid 
  @Schema(name = "optimizedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optimizedDate")
  public @Nullable OffsetDateTime getOptimizedDate() {
    return optimizedDate;
  }

  public void setOptimizedDate(@Nullable OffsetDateTime optimizedDate) {
    this.optimizedDate = optimizedDate;
  }

  public Route optimizationStarted(@Nullable OffsetDateTime optimizationStarted) {
    this.optimizationStarted = optimizationStarted;
    return this;
  }

  /**
   * Get optimizationStarted
   * @return optimizationStarted
   */
  @Valid 
  @Schema(name = "optimizationStarted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optimizationStarted")
  public @Nullable OffsetDateTime getOptimizationStarted() {
    return optimizationStarted;
  }

  public void setOptimizationStarted(@Nullable OffsetDateTime optimizationStarted) {
    this.optimizationStarted = optimizationStarted;
  }

  public Route optimizationCompleted(@Nullable OffsetDateTime optimizationCompleted) {
    this.optimizationCompleted = optimizationCompleted;
    return this;
  }

  /**
   * Get optimizationCompleted
   * @return optimizationCompleted
   */
  @Valid 
  @Schema(name = "optimizationCompleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optimizationCompleted")
  public @Nullable OffsetDateTime getOptimizationCompleted() {
    return optimizationCompleted;
  }

  public void setOptimizationCompleted(@Nullable OffsetDateTime optimizationCompleted) {
    this.optimizationCompleted = optimizationCompleted;
  }

  public Route featured(@Nullable Boolean featured) {
    this.featured = featured;
    return this;
  }

  /**
   * Get featured
   * @return featured
   */
  
  @Schema(name = "featured", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("featured")
  public @Nullable Boolean getFeatured() {
    return featured;
  }

  public void setFeatured(@Nullable Boolean featured) {
    this.featured = featured;
  }

  public Route image(@Nullable Asset image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @Valid 
  @Schema(name = "image", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image")
  public @Nullable Asset getImage() {
    return image;
  }

  public void setImage(@Nullable Asset image) {
    this.image = image;
  }

  public Route parent(@Nullable Route parent) {
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
  public @Nullable Route getParent() {
    return parent;
  }

  public void setParent(@Nullable Route parent) {
    this.parent = parent;
  }

  public Route contentName(@Nullable String contentName) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Route route = (Route) o;
    return Objects.equals(this.id, route.id) &&
        Objects.equals(this.active, route.active) &&
        Objects.equals(this.valid, route.valid) &&
        Objects.equals(this.name, route.name) &&
        Objects.equals(this.externalId, route.externalId) &&
        Objects.equals(this.hub, route.hub) &&
        Objects.equals(this.program, route.program) &&
        Objects.equals(this.zone, route.zone) &&
        Objects.equals(this.vehicle, route.vehicle) &&
        Objects.equals(this.driver, route.driver) &&
        Objects.equals(this.concierge, route.concierge) &&
        Objects.equals(this.scheduled, route.scheduled) &&
        Objects.equals(this.approved, route.approved) &&
        Objects.equals(this.started, route.started) &&
        Objects.equals(this.completed, route.completed) &&
        Objects.equals(this.totalDistance, route.totalDistance) &&
        Objects.equals(this.totalTime, route.totalTime) &&
        Objects.equals(this.estimatedDistance, route.estimatedDistance) &&
        Objects.equals(this.estimatedTime, route.estimatedTime) &&
        Objects.equals(this.startStop, route.startStop) &&
        Objects.equals(this.endStop, route.endStop) &&
        Objects.equals(this.stops, route.stops) &&
        Objects.equals(this.shipments, route.shipments) &&
        Objects.equals(this.allShipmentsConfirmed, route.allShipmentsConfirmed) &&
        Objects.equals(this.shipmentOrderCount, route.shipmentOrderCount) &&
        Objects.equals(this.polyline, route.polyline) &&
        Objects.equals(this.notes, route.notes) &&
        Objects.equals(this.noteCount, route.noteCount) &&
        Objects.equals(this.glympseToken, route.glympseToken) &&
        Objects.equals(this.enableOptimization, route.enableOptimization) &&
        Objects.equals(this.optimizedDate, route.optimizedDate) &&
        Objects.equals(this.optimizationStarted, route.optimizationStarted) &&
        Objects.equals(this.optimizationCompleted, route.optimizationCompleted) &&
        Objects.equals(this.featured, route.featured) &&
        Objects.equals(this.image, route.image) &&
        Objects.equals(this.parent, route.parent) &&
        Objects.equals(this.contentName, route.contentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, name, externalId, hub, program, zone, vehicle, driver, concierge, scheduled, approved, started, completed, totalDistance, totalTime, estimatedDistance, estimatedTime, startStop, endStop, stops, shipments, allShipmentsConfirmed, shipmentOrderCount, polyline, notes, noteCount, glympseToken, enableOptimization, optimizedDate, optimizationStarted, optimizationCompleted, featured, image, parent, contentName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Route {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    hub: ").append(toIndentedString(hub)).append("\n");
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    vehicle: ").append(toIndentedString(vehicle)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    concierge: ").append(toIndentedString(concierge)).append("\n");
    sb.append("    scheduled: ").append(toIndentedString(scheduled)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    totalDistance: ").append(toIndentedString(totalDistance)).append("\n");
    sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
    sb.append("    estimatedDistance: ").append(toIndentedString(estimatedDistance)).append("\n");
    sb.append("    estimatedTime: ").append(toIndentedString(estimatedTime)).append("\n");
    sb.append("    startStop: ").append(toIndentedString(startStop)).append("\n");
    sb.append("    endStop: ").append(toIndentedString(endStop)).append("\n");
    sb.append("    stops: ").append(toIndentedString(stops)).append("\n");
    sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
    sb.append("    allShipmentsConfirmed: ").append(toIndentedString(allShipmentsConfirmed)).append("\n");
    sb.append("    shipmentOrderCount: ").append(toIndentedString(shipmentOrderCount)).append("\n");
    sb.append("    polyline: ").append(toIndentedString(polyline)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    noteCount: ").append(toIndentedString(noteCount)).append("\n");
    sb.append("    glympseToken: ").append(toIndentedString(glympseToken)).append("\n");
    sb.append("    enableOptimization: ").append(toIndentedString(enableOptimization)).append("\n");
    sb.append("    optimizedDate: ").append(toIndentedString(optimizedDate)).append("\n");
    sb.append("    optimizationStarted: ").append(toIndentedString(optimizationStarted)).append("\n");
    sb.append("    optimizationCompleted: ").append(toIndentedString(optimizationCompleted)).append("\n");
    sb.append("    featured: ").append(toIndentedString(featured)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
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

