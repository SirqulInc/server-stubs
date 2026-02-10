package apimodels;

import apimodels.Account;
import apimodels.Asset;
import apimodels.Note;
import apimodels.Program;
import apimodels.Region;
import apimodels.ServiceHub;
import apimodels.Shipment;
import apimodels.Stop;
import apimodels.Vehicle;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Route
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Route   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("externalId")
  
  private String externalId;

  @JsonProperty("hub")
  @Valid

  private ServiceHub hub;

  @JsonProperty("program")
  @Valid

  private Program program;

  @JsonProperty("zone")
  @Valid

  private Region zone;

  @JsonProperty("vehicle")
  @Valid

  private Vehicle vehicle;

  @JsonProperty("driver")
  @Valid

  private Account driver;

  @JsonProperty("concierge")
  @Valid

  private Account concierge;

  @JsonProperty("scheduled")
  @Valid

  private OffsetDateTime scheduled;

  @JsonProperty("approved")
  @Valid

  private OffsetDateTime approved;

  @JsonProperty("started")
  @Valid

  private OffsetDateTime started;

  @JsonProperty("completed")
  @Valid

  private OffsetDateTime completed;

  @JsonProperty("totalDistance")
  
  private Float totalDistance;

  @JsonProperty("totalTime")
  
  private Long totalTime;

  @JsonProperty("estimatedDistance")
  
  private Double estimatedDistance;

  @JsonProperty("estimatedTime")
  
  private Long estimatedTime;

  @JsonProperty("startStop")
  @Valid

  private Stop startStop;

  @JsonProperty("endStop")
  @Valid

  private Stop endStop;

  @JsonProperty("stops")
  @Valid

  private List<@Valid Stop> stops = null;

  @JsonProperty("shipments")
  @Valid

  private List<@Valid Shipment> shipments = null;

  @JsonProperty("allShipmentsConfirmed")
  
  private Boolean allShipmentsConfirmed;

  @JsonProperty("shipmentOrderCount")
  
  private Integer shipmentOrderCount;

  @JsonProperty("polyline")
  
  private String polyline;

  @JsonProperty("notes")
  @Valid

  private List<@Valid Note> notes = null;

  @JsonProperty("noteCount")
  
  private Long noteCount;

  @JsonProperty("glympseToken")
  
  private String glympseToken;

  @JsonProperty("enableOptimization")
  
  private Boolean enableOptimization;

  @JsonProperty("optimizedDate")
  @Valid

  private OffsetDateTime optimizedDate;

  @JsonProperty("optimizationStarted")
  @Valid

  private OffsetDateTime optimizationStarted;

  @JsonProperty("optimizationCompleted")
  @Valid

  private OffsetDateTime optimizationCompleted;

  @JsonProperty("featured")
  
  private Boolean featured;

  @JsonProperty("image")
  @Valid

  private Asset image;

  @JsonProperty("parent")
  @Valid

  private Route parent;

  @JsonProperty("contentName")
  
  private String contentName;

  public Route id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Route active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Route valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public Route name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Route externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public Route hub(ServiceHub hub) {
    this.hub = hub;
    return this;
  }

   /**
   * Get hub
   * @return hub
  **/
  public ServiceHub getHub() {
    return hub;
  }

  public void setHub(ServiceHub hub) {
    this.hub = hub;
  }

  public Route program(Program program) {
    this.program = program;
    return this;
  }

   /**
   * Get program
   * @return program
  **/
  public Program getProgram() {
    return program;
  }

  public void setProgram(Program program) {
    this.program = program;
  }

  public Route zone(Region zone) {
    this.zone = zone;
    return this;
  }

   /**
   * Get zone
   * @return zone
  **/
  public Region getZone() {
    return zone;
  }

  public void setZone(Region zone) {
    this.zone = zone;
  }

  public Route vehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
    return this;
  }

   /**
   * Get vehicle
   * @return vehicle
  **/
  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public Route driver(Account driver) {
    this.driver = driver;
    return this;
  }

   /**
   * Get driver
   * @return driver
  **/
  public Account getDriver() {
    return driver;
  }

  public void setDriver(Account driver) {
    this.driver = driver;
  }

  public Route concierge(Account concierge) {
    this.concierge = concierge;
    return this;
  }

   /**
   * Get concierge
   * @return concierge
  **/
  public Account getConcierge() {
    return concierge;
  }

  public void setConcierge(Account concierge) {
    this.concierge = concierge;
  }

  public Route scheduled(OffsetDateTime scheduled) {
    this.scheduled = scheduled;
    return this;
  }

   /**
   * Get scheduled
   * @return scheduled
  **/
  public OffsetDateTime getScheduled() {
    return scheduled;
  }

  public void setScheduled(OffsetDateTime scheduled) {
    this.scheduled = scheduled;
  }

  public Route approved(OffsetDateTime approved) {
    this.approved = approved;
    return this;
  }

   /**
   * Get approved
   * @return approved
  **/
  public OffsetDateTime getApproved() {
    return approved;
  }

  public void setApproved(OffsetDateTime approved) {
    this.approved = approved;
  }

  public Route started(OffsetDateTime started) {
    this.started = started;
    return this;
  }

   /**
   * Get started
   * @return started
  **/
  public OffsetDateTime getStarted() {
    return started;
  }

  public void setStarted(OffsetDateTime started) {
    this.started = started;
  }

  public Route completed(OffsetDateTime completed) {
    this.completed = completed;
    return this;
  }

   /**
   * Get completed
   * @return completed
  **/
  public OffsetDateTime getCompleted() {
    return completed;
  }

  public void setCompleted(OffsetDateTime completed) {
    this.completed = completed;
  }

  public Route totalDistance(Float totalDistance) {
    this.totalDistance = totalDistance;
    return this;
  }

   /**
   * Get totalDistance
   * @return totalDistance
  **/
  public Float getTotalDistance() {
    return totalDistance;
  }

  public void setTotalDistance(Float totalDistance) {
    this.totalDistance = totalDistance;
  }

  public Route totalTime(Long totalTime) {
    this.totalTime = totalTime;
    return this;
  }

   /**
   * Get totalTime
   * @return totalTime
  **/
  public Long getTotalTime() {
    return totalTime;
  }

  public void setTotalTime(Long totalTime) {
    this.totalTime = totalTime;
  }

  public Route estimatedDistance(Double estimatedDistance) {
    this.estimatedDistance = estimatedDistance;
    return this;
  }

   /**
   * Get estimatedDistance
   * @return estimatedDistance
  **/
  public Double getEstimatedDistance() {
    return estimatedDistance;
  }

  public void setEstimatedDistance(Double estimatedDistance) {
    this.estimatedDistance = estimatedDistance;
  }

  public Route estimatedTime(Long estimatedTime) {
    this.estimatedTime = estimatedTime;
    return this;
  }

   /**
   * Get estimatedTime
   * @return estimatedTime
  **/
  public Long getEstimatedTime() {
    return estimatedTime;
  }

  public void setEstimatedTime(Long estimatedTime) {
    this.estimatedTime = estimatedTime;
  }

  public Route startStop(Stop startStop) {
    this.startStop = startStop;
    return this;
  }

   /**
   * Get startStop
   * @return startStop
  **/
  public Stop getStartStop() {
    return startStop;
  }

  public void setStartStop(Stop startStop) {
    this.startStop = startStop;
  }

  public Route endStop(Stop endStop) {
    this.endStop = endStop;
    return this;
  }

   /**
   * Get endStop
   * @return endStop
  **/
  public Stop getEndStop() {
    return endStop;
  }

  public void setEndStop(Stop endStop) {
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
  **/
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
  **/
  public List<@Valid Shipment> getShipments() {
    return shipments;
  }

  public void setShipments(List<@Valid Shipment> shipments) {
    this.shipments = shipments;
  }

  public Route allShipmentsConfirmed(Boolean allShipmentsConfirmed) {
    this.allShipmentsConfirmed = allShipmentsConfirmed;
    return this;
  }

   /**
   * Get allShipmentsConfirmed
   * @return allShipmentsConfirmed
  **/
  public Boolean getAllShipmentsConfirmed() {
    return allShipmentsConfirmed;
  }

  public void setAllShipmentsConfirmed(Boolean allShipmentsConfirmed) {
    this.allShipmentsConfirmed = allShipmentsConfirmed;
  }

  public Route shipmentOrderCount(Integer shipmentOrderCount) {
    this.shipmentOrderCount = shipmentOrderCount;
    return this;
  }

   /**
   * Get shipmentOrderCount
   * @return shipmentOrderCount
  **/
  public Integer getShipmentOrderCount() {
    return shipmentOrderCount;
  }

  public void setShipmentOrderCount(Integer shipmentOrderCount) {
    this.shipmentOrderCount = shipmentOrderCount;
  }

  public Route polyline(String polyline) {
    this.polyline = polyline;
    return this;
  }

   /**
   * Get polyline
   * @return polyline
  **/
  public String getPolyline() {
    return polyline;
  }

  public void setPolyline(String polyline) {
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
  **/
  public List<@Valid Note> getNotes() {
    return notes;
  }

  public void setNotes(List<@Valid Note> notes) {
    this.notes = notes;
  }

  public Route noteCount(Long noteCount) {
    this.noteCount = noteCount;
    return this;
  }

   /**
   * Get noteCount
   * @return noteCount
  **/
  public Long getNoteCount() {
    return noteCount;
  }

  public void setNoteCount(Long noteCount) {
    this.noteCount = noteCount;
  }

  public Route glympseToken(String glympseToken) {
    this.glympseToken = glympseToken;
    return this;
  }

   /**
   * Get glympseToken
   * @return glympseToken
  **/
  public String getGlympseToken() {
    return glympseToken;
  }

  public void setGlympseToken(String glympseToken) {
    this.glympseToken = glympseToken;
  }

  public Route enableOptimization(Boolean enableOptimization) {
    this.enableOptimization = enableOptimization;
    return this;
  }

   /**
   * Get enableOptimization
   * @return enableOptimization
  **/
  public Boolean getEnableOptimization() {
    return enableOptimization;
  }

  public void setEnableOptimization(Boolean enableOptimization) {
    this.enableOptimization = enableOptimization;
  }

  public Route optimizedDate(OffsetDateTime optimizedDate) {
    this.optimizedDate = optimizedDate;
    return this;
  }

   /**
   * Get optimizedDate
   * @return optimizedDate
  **/
  public OffsetDateTime getOptimizedDate() {
    return optimizedDate;
  }

  public void setOptimizedDate(OffsetDateTime optimizedDate) {
    this.optimizedDate = optimizedDate;
  }

  public Route optimizationStarted(OffsetDateTime optimizationStarted) {
    this.optimizationStarted = optimizationStarted;
    return this;
  }

   /**
   * Get optimizationStarted
   * @return optimizationStarted
  **/
  public OffsetDateTime getOptimizationStarted() {
    return optimizationStarted;
  }

  public void setOptimizationStarted(OffsetDateTime optimizationStarted) {
    this.optimizationStarted = optimizationStarted;
  }

  public Route optimizationCompleted(OffsetDateTime optimizationCompleted) {
    this.optimizationCompleted = optimizationCompleted;
    return this;
  }

   /**
   * Get optimizationCompleted
   * @return optimizationCompleted
  **/
  public OffsetDateTime getOptimizationCompleted() {
    return optimizationCompleted;
  }

  public void setOptimizationCompleted(OffsetDateTime optimizationCompleted) {
    this.optimizationCompleted = optimizationCompleted;
  }

  public Route featured(Boolean featured) {
    this.featured = featured;
    return this;
  }

   /**
   * Get featured
   * @return featured
  **/
  public Boolean getFeatured() {
    return featured;
  }

  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }

  public Route image(Asset image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  public Asset getImage() {
    return image;
  }

  public void setImage(Asset image) {
    this.image = image;
  }

  public Route parent(Route parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  public Route getParent() {
    return parent;
  }

  public void setParent(Route parent) {
    this.parent = parent;
  }

  public Route contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

   /**
   * Get contentName
   * @return contentName
  **/
  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
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
    return Objects.equals(id, route.id) &&
        Objects.equals(active, route.active) &&
        Objects.equals(valid, route.valid) &&
        Objects.equals(name, route.name) &&
        Objects.equals(externalId, route.externalId) &&
        Objects.equals(hub, route.hub) &&
        Objects.equals(program, route.program) &&
        Objects.equals(zone, route.zone) &&
        Objects.equals(vehicle, route.vehicle) &&
        Objects.equals(driver, route.driver) &&
        Objects.equals(concierge, route.concierge) &&
        Objects.equals(scheduled, route.scheduled) &&
        Objects.equals(approved, route.approved) &&
        Objects.equals(started, route.started) &&
        Objects.equals(completed, route.completed) &&
        Objects.equals(totalDistance, route.totalDistance) &&
        Objects.equals(totalTime, route.totalTime) &&
        Objects.equals(estimatedDistance, route.estimatedDistance) &&
        Objects.equals(estimatedTime, route.estimatedTime) &&
        Objects.equals(startStop, route.startStop) &&
        Objects.equals(endStop, route.endStop) &&
        Objects.equals(stops, route.stops) &&
        Objects.equals(shipments, route.shipments) &&
        Objects.equals(allShipmentsConfirmed, route.allShipmentsConfirmed) &&
        Objects.equals(shipmentOrderCount, route.shipmentOrderCount) &&
        Objects.equals(polyline, route.polyline) &&
        Objects.equals(notes, route.notes) &&
        Objects.equals(noteCount, route.noteCount) &&
        Objects.equals(glympseToken, route.glympseToken) &&
        Objects.equals(enableOptimization, route.enableOptimization) &&
        Objects.equals(optimizedDate, route.optimizedDate) &&
        Objects.equals(optimizationStarted, route.optimizationStarted) &&
        Objects.equals(optimizationCompleted, route.optimizationCompleted) &&
        Objects.equals(featured, route.featured) &&
        Objects.equals(image, route.image) &&
        Objects.equals(parent, route.parent) &&
        Objects.equals(contentName, route.contentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, name, externalId, hub, program, zone, vehicle, driver, concierge, scheduled, approved, started, completed, totalDistance, totalTime, estimatedDistance, estimatedTime, startStop, endStop, stops, shipments, allShipmentsConfirmed, shipmentOrderCount, polyline, notes, noteCount, glympseToken, enableOptimization, optimizedDate, optimizationStarted, optimizationCompleted, featured, image, parent, contentName);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

