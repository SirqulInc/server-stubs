package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Route   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private String name;
  private String externalId;
  private ServiceHub hub;
  private Program program;
  private Region zone;
  private Vehicle vehicle;
  private Account driver;
  private Account concierge;
  private Date scheduled;
  private Date approved;
  private Date started;
  private Date completed;
  private Float totalDistance;
  private Long totalTime;
  private Double estimatedDistance;
  private Long estimatedTime;
  private Stop startStop;
  private Stop endStop;
  private List<@Valid Stop> stops = new ArrayList<>();
  private List<@Valid Shipment> shipments = new ArrayList<>();
  private Boolean allShipmentsConfirmed;
  private Integer shipmentOrderCount;
  private String polyline;
  private List<@Valid Note> notes = new ArrayList<>();
  private Long noteCount;
  private String glympseToken;
  private Boolean enableOptimization;
  private Date optimizedDate;
  private Date optimizationStarted;
  private Date optimizationCompleted;
  private Boolean featured;
  private Asset image;
  private Route parent;
  private String contentName;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hub")
  @Valid
  public ServiceHub getHub() {
    return hub;
  }
  public void setHub(ServiceHub hub) {
    this.hub = hub;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("program")
  @Valid
  public Program getProgram() {
    return program;
  }
  public void setProgram(Program program) {
    this.program = program;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("zone")
  @Valid
  public Region getZone() {
    return zone;
  }
  public void setZone(Region zone) {
    this.zone = zone;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("vehicle")
  @Valid
  public Vehicle getVehicle() {
    return vehicle;
  }
  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("driver")
  @Valid
  public Account getDriver() {
    return driver;
  }
  public void setDriver(Account driver) {
    this.driver = driver;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("concierge")
  @Valid
  public Account getConcierge() {
    return concierge;
  }
  public void setConcierge(Account concierge) {
    this.concierge = concierge;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduled")
  public Date getScheduled() {
    return scheduled;
  }
  public void setScheduled(Date scheduled) {
    this.scheduled = scheduled;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("approved")
  public Date getApproved() {
    return approved;
  }
  public void setApproved(Date approved) {
    this.approved = approved;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("started")
  public Date getStarted() {
    return started;
  }
  public void setStarted(Date started) {
    this.started = started;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("completed")
  public Date getCompleted() {
    return completed;
  }
  public void setCompleted(Date completed) {
    this.completed = completed;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalDistance")
  public Float getTotalDistance() {
    return totalDistance;
  }
  public void setTotalDistance(Float totalDistance) {
    this.totalDistance = totalDistance;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalTime")
  public Long getTotalTime() {
    return totalTime;
  }
  public void setTotalTime(Long totalTime) {
    this.totalTime = totalTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("estimatedDistance")
  public Double getEstimatedDistance() {
    return estimatedDistance;
  }
  public void setEstimatedDistance(Double estimatedDistance) {
    this.estimatedDistance = estimatedDistance;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("estimatedTime")
  public Long getEstimatedTime() {
    return estimatedTime;
  }
  public void setEstimatedTime(Long estimatedTime) {
    this.estimatedTime = estimatedTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startStop")
  @Valid
  public Stop getStartStop() {
    return startStop;
  }
  public void setStartStop(Stop startStop) {
    this.startStop = startStop;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endStop")
  @Valid
  public Stop getEndStop() {
    return endStop;
  }
  public void setEndStop(Stop endStop) {
    this.endStop = endStop;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stops")
  @Valid
  public List<@Valid Stop> getStops() {
    return stops;
  }
  public void setStops(List<@Valid Stop> stops) {
    this.stops = stops;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipments")
  @Valid
  public List<@Valid Shipment> getShipments() {
    return shipments;
  }
  public void setShipments(List<@Valid Shipment> shipments) {
    this.shipments = shipments;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allShipmentsConfirmed")
  public Boolean getAllShipmentsConfirmed() {
    return allShipmentsConfirmed;
  }
  public void setAllShipmentsConfirmed(Boolean allShipmentsConfirmed) {
    this.allShipmentsConfirmed = allShipmentsConfirmed;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipmentOrderCount")
  public Integer getShipmentOrderCount() {
    return shipmentOrderCount;
  }
  public void setShipmentOrderCount(Integer shipmentOrderCount) {
    this.shipmentOrderCount = shipmentOrderCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("polyline")
  public String getPolyline() {
    return polyline;
  }
  public void setPolyline(String polyline) {
    this.polyline = polyline;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notes")
  @Valid
  public List<@Valid Note> getNotes() {
    return notes;
  }
  public void setNotes(List<@Valid Note> notes) {
    this.notes = notes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("noteCount")
  public Long getNoteCount() {
    return noteCount;
  }
  public void setNoteCount(Long noteCount) {
    this.noteCount = noteCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("glympseToken")
  public String getGlympseToken() {
    return glympseToken;
  }
  public void setGlympseToken(String glympseToken) {
    this.glympseToken = glympseToken;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enableOptimization")
  public Boolean getEnableOptimization() {
    return enableOptimization;
  }
  public void setEnableOptimization(Boolean enableOptimization) {
    this.enableOptimization = enableOptimization;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("optimizedDate")
  public Date getOptimizedDate() {
    return optimizedDate;
  }
  public void setOptimizedDate(Date optimizedDate) {
    this.optimizedDate = optimizedDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("optimizationStarted")
  public Date getOptimizationStarted() {
    return optimizationStarted;
  }
  public void setOptimizationStarted(Date optimizationStarted) {
    this.optimizationStarted = optimizationStarted;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("optimizationCompleted")
  public Date getOptimizationCompleted() {
    return optimizationCompleted;
  }
  public void setOptimizationCompleted(Date optimizationCompleted) {
    this.optimizationCompleted = optimizationCompleted;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("featured")
  public Boolean getFeatured() {
    return featured;
  }
  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("image")
  @Valid
  public Asset getImage() {
    return image;
  }
  public void setImage(Asset image) {
    this.image = image;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("parent")
  @Valid
  public Route getParent() {
    return parent;
  }
  public void setParent(Route parent) {
    this.parent = parent;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contentName")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

