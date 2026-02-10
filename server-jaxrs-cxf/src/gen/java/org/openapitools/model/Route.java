package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Route  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String externalId;

  @ApiModelProperty(value = "")

  @Valid

  private ServiceHub hub;

  @ApiModelProperty(value = "")

  @Valid

  private Program program;

  @ApiModelProperty(value = "")

  @Valid

  private Region zone;

  @ApiModelProperty(value = "")

  @Valid

  private Vehicle vehicle;

  @ApiModelProperty(value = "")

  @Valid

  private Account driver;

  @ApiModelProperty(value = "")

  @Valid

  private Account concierge;

  @ApiModelProperty(value = "")

  private Date scheduled;

  @ApiModelProperty(value = "")

  private Date approved;

  @ApiModelProperty(value = "")

  private Date started;

  @ApiModelProperty(value = "")

  private Date completed;

  @ApiModelProperty(value = "")

  private Float totalDistance;

  @ApiModelProperty(value = "")

  private Long totalTime;

  @ApiModelProperty(value = "")

  private Double estimatedDistance;

  @ApiModelProperty(value = "")

  private Long estimatedTime;

  @ApiModelProperty(value = "")

  @Valid

  private Stop startStop;

  @ApiModelProperty(value = "")

  @Valid

  private Stop endStop;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Stop> stops = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Shipment> shipments = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Boolean allShipmentsConfirmed;

  @ApiModelProperty(value = "")

  private Integer shipmentOrderCount;

  @ApiModelProperty(value = "")

  private String polyline;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Note> notes = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long noteCount;

  @ApiModelProperty(value = "")

  private String glympseToken;

  @ApiModelProperty(value = "")

  private Boolean enableOptimization;

  @ApiModelProperty(value = "")

  private Date optimizedDate;

  @ApiModelProperty(value = "")

  private Date optimizationStarted;

  @ApiModelProperty(value = "")

  private Date optimizationCompleted;

  @ApiModelProperty(value = "")

  private Boolean featured;

  @ApiModelProperty(value = "")

  @Valid

  private Asset image;

  @ApiModelProperty(value = "")

  @Valid

  private Route parent;

  @ApiModelProperty(value = "")

  private String contentName;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Route id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Route active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public Route valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Route name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get externalId
   * @return externalId
  **/
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public Route externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

 /**
   * Get hub
   * @return hub
  **/
  @JsonProperty("hub")
  public ServiceHub getHub() {
    return hub;
  }

  public void setHub(ServiceHub hub) {
    this.hub = hub;
  }

  public Route hub(ServiceHub hub) {
    this.hub = hub;
    return this;
  }

 /**
   * Get program
   * @return program
  **/
  @JsonProperty("program")
  public Program getProgram() {
    return program;
  }

  public void setProgram(Program program) {
    this.program = program;
  }

  public Route program(Program program) {
    this.program = program;
    return this;
  }

 /**
   * Get zone
   * @return zone
  **/
  @JsonProperty("zone")
  public Region getZone() {
    return zone;
  }

  public void setZone(Region zone) {
    this.zone = zone;
  }

  public Route zone(Region zone) {
    this.zone = zone;
    return this;
  }

 /**
   * Get vehicle
   * @return vehicle
  **/
  @JsonProperty("vehicle")
  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public Route vehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
    return this;
  }

 /**
   * Get driver
   * @return driver
  **/
  @JsonProperty("driver")
  public Account getDriver() {
    return driver;
  }

  public void setDriver(Account driver) {
    this.driver = driver;
  }

  public Route driver(Account driver) {
    this.driver = driver;
    return this;
  }

 /**
   * Get concierge
   * @return concierge
  **/
  @JsonProperty("concierge")
  public Account getConcierge() {
    return concierge;
  }

  public void setConcierge(Account concierge) {
    this.concierge = concierge;
  }

  public Route concierge(Account concierge) {
    this.concierge = concierge;
    return this;
  }

 /**
   * Get scheduled
   * @return scheduled
  **/
  @JsonProperty("scheduled")
  public Date getScheduled() {
    return scheduled;
  }

  public void setScheduled(Date scheduled) {
    this.scheduled = scheduled;
  }

  public Route scheduled(Date scheduled) {
    this.scheduled = scheduled;
    return this;
  }

 /**
   * Get approved
   * @return approved
  **/
  @JsonProperty("approved")
  public Date getApproved() {
    return approved;
  }

  public void setApproved(Date approved) {
    this.approved = approved;
  }

  public Route approved(Date approved) {
    this.approved = approved;
    return this;
  }

 /**
   * Get started
   * @return started
  **/
  @JsonProperty("started")
  public Date getStarted() {
    return started;
  }

  public void setStarted(Date started) {
    this.started = started;
  }

  public Route started(Date started) {
    this.started = started;
    return this;
  }

 /**
   * Get completed
   * @return completed
  **/
  @JsonProperty("completed")
  public Date getCompleted() {
    return completed;
  }

  public void setCompleted(Date completed) {
    this.completed = completed;
  }

  public Route completed(Date completed) {
    this.completed = completed;
    return this;
  }

 /**
   * Get totalDistance
   * @return totalDistance
  **/
  @JsonProperty("totalDistance")
  public Float getTotalDistance() {
    return totalDistance;
  }

  public void setTotalDistance(Float totalDistance) {
    this.totalDistance = totalDistance;
  }

  public Route totalDistance(Float totalDistance) {
    this.totalDistance = totalDistance;
    return this;
  }

 /**
   * Get totalTime
   * @return totalTime
  **/
  @JsonProperty("totalTime")
  public Long getTotalTime() {
    return totalTime;
  }

  public void setTotalTime(Long totalTime) {
    this.totalTime = totalTime;
  }

  public Route totalTime(Long totalTime) {
    this.totalTime = totalTime;
    return this;
  }

 /**
   * Get estimatedDistance
   * @return estimatedDistance
  **/
  @JsonProperty("estimatedDistance")
  public Double getEstimatedDistance() {
    return estimatedDistance;
  }

  public void setEstimatedDistance(Double estimatedDistance) {
    this.estimatedDistance = estimatedDistance;
  }

  public Route estimatedDistance(Double estimatedDistance) {
    this.estimatedDistance = estimatedDistance;
    return this;
  }

 /**
   * Get estimatedTime
   * @return estimatedTime
  **/
  @JsonProperty("estimatedTime")
  public Long getEstimatedTime() {
    return estimatedTime;
  }

  public void setEstimatedTime(Long estimatedTime) {
    this.estimatedTime = estimatedTime;
  }

  public Route estimatedTime(Long estimatedTime) {
    this.estimatedTime = estimatedTime;
    return this;
  }

 /**
   * Get startStop
   * @return startStop
  **/
  @JsonProperty("startStop")
  public Stop getStartStop() {
    return startStop;
  }

  public void setStartStop(Stop startStop) {
    this.startStop = startStop;
  }

  public Route startStop(Stop startStop) {
    this.startStop = startStop;
    return this;
  }

 /**
   * Get endStop
   * @return endStop
  **/
  @JsonProperty("endStop")
  public Stop getEndStop() {
    return endStop;
  }

  public void setEndStop(Stop endStop) {
    this.endStop = endStop;
  }

  public Route endStop(Stop endStop) {
    this.endStop = endStop;
    return this;
  }

 /**
   * Get stops
   * @return stops
  **/
  @JsonProperty("stops")
  public List<@Valid Stop> getStops() {
    return stops;
  }

  public void setStops(List<@Valid Stop> stops) {
    this.stops = stops;
  }

  public Route stops(List<@Valid Stop> stops) {
    this.stops = stops;
    return this;
  }

  public Route addStopsItem(Stop stopsItem) {
    this.stops.add(stopsItem);
    return this;
  }

 /**
   * Get shipments
   * @return shipments
  **/
  @JsonProperty("shipments")
  public List<@Valid Shipment> getShipments() {
    return shipments;
  }

  public void setShipments(List<@Valid Shipment> shipments) {
    this.shipments = shipments;
  }

  public Route shipments(List<@Valid Shipment> shipments) {
    this.shipments = shipments;
    return this;
  }

  public Route addShipmentsItem(Shipment shipmentsItem) {
    this.shipments.add(shipmentsItem);
    return this;
  }

 /**
   * Get allShipmentsConfirmed
   * @return allShipmentsConfirmed
  **/
  @JsonProperty("allShipmentsConfirmed")
  public Boolean getAllShipmentsConfirmed() {
    return allShipmentsConfirmed;
  }

  public void setAllShipmentsConfirmed(Boolean allShipmentsConfirmed) {
    this.allShipmentsConfirmed = allShipmentsConfirmed;
  }

  public Route allShipmentsConfirmed(Boolean allShipmentsConfirmed) {
    this.allShipmentsConfirmed = allShipmentsConfirmed;
    return this;
  }

 /**
   * Get shipmentOrderCount
   * @return shipmentOrderCount
  **/
  @JsonProperty("shipmentOrderCount")
  public Integer getShipmentOrderCount() {
    return shipmentOrderCount;
  }

  public void setShipmentOrderCount(Integer shipmentOrderCount) {
    this.shipmentOrderCount = shipmentOrderCount;
  }

  public Route shipmentOrderCount(Integer shipmentOrderCount) {
    this.shipmentOrderCount = shipmentOrderCount;
    return this;
  }

 /**
   * Get polyline
   * @return polyline
  **/
  @JsonProperty("polyline")
  public String getPolyline() {
    return polyline;
  }

  public void setPolyline(String polyline) {
    this.polyline = polyline;
  }

  public Route polyline(String polyline) {
    this.polyline = polyline;
    return this;
  }

 /**
   * Get notes
   * @return notes
  **/
  @JsonProperty("notes")
  public List<@Valid Note> getNotes() {
    return notes;
  }

  public void setNotes(List<@Valid Note> notes) {
    this.notes = notes;
  }

  public Route notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public Route addNotesItem(Note notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get noteCount
   * @return noteCount
  **/
  @JsonProperty("noteCount")
  public Long getNoteCount() {
    return noteCount;
  }

  public void setNoteCount(Long noteCount) {
    this.noteCount = noteCount;
  }

  public Route noteCount(Long noteCount) {
    this.noteCount = noteCount;
    return this;
  }

 /**
   * Get glympseToken
   * @return glympseToken
  **/
  @JsonProperty("glympseToken")
  public String getGlympseToken() {
    return glympseToken;
  }

  public void setGlympseToken(String glympseToken) {
    this.glympseToken = glympseToken;
  }

  public Route glympseToken(String glympseToken) {
    this.glympseToken = glympseToken;
    return this;
  }

 /**
   * Get enableOptimization
   * @return enableOptimization
  **/
  @JsonProperty("enableOptimization")
  public Boolean getEnableOptimization() {
    return enableOptimization;
  }

  public void setEnableOptimization(Boolean enableOptimization) {
    this.enableOptimization = enableOptimization;
  }

  public Route enableOptimization(Boolean enableOptimization) {
    this.enableOptimization = enableOptimization;
    return this;
  }

 /**
   * Get optimizedDate
   * @return optimizedDate
  **/
  @JsonProperty("optimizedDate")
  public Date getOptimizedDate() {
    return optimizedDate;
  }

  public void setOptimizedDate(Date optimizedDate) {
    this.optimizedDate = optimizedDate;
  }

  public Route optimizedDate(Date optimizedDate) {
    this.optimizedDate = optimizedDate;
    return this;
  }

 /**
   * Get optimizationStarted
   * @return optimizationStarted
  **/
  @JsonProperty("optimizationStarted")
  public Date getOptimizationStarted() {
    return optimizationStarted;
  }

  public void setOptimizationStarted(Date optimizationStarted) {
    this.optimizationStarted = optimizationStarted;
  }

  public Route optimizationStarted(Date optimizationStarted) {
    this.optimizationStarted = optimizationStarted;
    return this;
  }

 /**
   * Get optimizationCompleted
   * @return optimizationCompleted
  **/
  @JsonProperty("optimizationCompleted")
  public Date getOptimizationCompleted() {
    return optimizationCompleted;
  }

  public void setOptimizationCompleted(Date optimizationCompleted) {
    this.optimizationCompleted = optimizationCompleted;
  }

  public Route optimizationCompleted(Date optimizationCompleted) {
    this.optimizationCompleted = optimizationCompleted;
    return this;
  }

 /**
   * Get featured
   * @return featured
  **/
  @JsonProperty("featured")
  public Boolean getFeatured() {
    return featured;
  }

  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }

  public Route featured(Boolean featured) {
    this.featured = featured;
    return this;
  }

 /**
   * Get image
   * @return image
  **/
  @JsonProperty("image")
  public Asset getImage() {
    return image;
  }

  public void setImage(Asset image) {
    this.image = image;
  }

  public Route image(Asset image) {
    this.image = image;
    return this;
  }

 /**
   * Get parent
   * @return parent
  **/
  @JsonProperty("parent")
  public Route getParent() {
    return parent;
  }

  public void setParent(Route parent) {
    this.parent = parent;
  }

  public Route parent(Route parent) {
    this.parent = parent;
    return this;
  }

 /**
   * Get contentName
   * @return contentName
  **/
  @JsonProperty("contentName")
  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  public Route contentName(String contentName) {
    this.contentName = contentName;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

