package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Location;
import org.openapitools.model.Note;
import org.openapitools.model.Route;
import org.openapitools.model.Shipment;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Stop  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;

  @ApiModelProperty(value = "")

  private String locationDescription;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  @Valid

  private Account owner;

  @ApiModelProperty(value = "")

  @Valid

  private Location location;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Note> notes = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long noteCount;

public enum StopTypeEnum {

PICKUP(String.valueOf("PICKUP")), DROPOFF(String.valueOf("DROPOFF")), START(String.valueOf("START")), END(String.valueOf("END")), ROUTING(String.valueOf("ROUTING"));


    private String value;

    StopTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

  @ApiModelProperty(value = "")

  private StopTypeEnum stopType;

  @ApiModelProperty(value = "")

  private Long orderIndex;

  @ApiModelProperty(value = "")

  private Date startTime;

  @ApiModelProperty(value = "")

  private Date endTime;

  @ApiModelProperty(value = "")

  private Date estimatedTime;

  @ApiModelProperty(value = "")

  private Date estimatedArrivalTime;

  @ApiModelProperty(value = "")

  private Date estimatedDepartureTime;

  @ApiModelProperty(value = "")

  private Date actualTime;

  @ApiModelProperty(value = "")

  private Date desiredTime;

  @ApiModelProperty(value = "")

  private Integer timePadding;

  @ApiModelProperty(value = "")

  @Valid

  private Route route;

  @ApiModelProperty(value = "")

  @Valid

  private Shipment shipment;

public enum ProgressStatusEnum {

PENDING(String.valueOf("PENDING")), COMPLETE(String.valueOf("COMPLETE")), INVALID(String.valueOf("INVALID"));


    private String value;

    ProgressStatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

  @ApiModelProperty(value = "")

  private ProgressStatusEnum progressStatus;

  @ApiModelProperty(value = "")

  private Date compareEstimatedTime;

  @ApiModelProperty(value = "")

  private Date compareEstimatedArrivalTime;

  @ApiModelProperty(value = "")

  private Date compareEstimiatedDepartureTime;

  @ApiModelProperty(value = "")

  private String polyline;

  @ApiModelProperty(value = "")

  @Valid

  private Stop parent;

  @ApiModelProperty(value = "")

  private String locationDisplay;

  @ApiModelProperty(value = "")

  private Boolean complete;

  @ApiModelProperty(value = "")

  private String contentName;

  @ApiModelProperty(value = "")

  private String locationAddress;
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

  public Stop id(Long id) {
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

  public Stop active(Boolean active) {
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

  public Stop valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get latitude
   * @return latitude
  **/
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Stop latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Get longitude
   * @return longitude
  **/
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public Stop longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Get locationDescription
   * @return locationDescription
  **/
  @JsonProperty("locationDescription")
  public String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }

  public Stop locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
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

  public Stop name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public Stop owner(Account owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get location
   * @return location
  **/
  @JsonProperty("location")
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public Stop location(Location location) {
    this.location = location;
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

  public Stop notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public Stop addNotesItem(Note notesItem) {
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

  public Stop noteCount(Long noteCount) {
    this.noteCount = noteCount;
    return this;
  }

 /**
   * Get stopType
   * @return stopType
  **/
  @JsonProperty("stopType")
  public String getStopType() {
    if (stopType == null) {
      return null;
    }
    return stopType.value();
  }

  public void setStopType(StopTypeEnum stopType) {
    this.stopType = stopType;
  }

  public Stop stopType(StopTypeEnum stopType) {
    this.stopType = stopType;
    return this;
  }

 /**
   * Get orderIndex
   * @return orderIndex
  **/
  @JsonProperty("orderIndex")
  public Long getOrderIndex() {
    return orderIndex;
  }

  public void setOrderIndex(Long orderIndex) {
    this.orderIndex = orderIndex;
  }

  public Stop orderIndex(Long orderIndex) {
    this.orderIndex = orderIndex;
    return this;
  }

 /**
   * Get startTime
   * @return startTime
  **/
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }

  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  public Stop startTime(Date startTime) {
    this.startTime = startTime;
    return this;
  }

 /**
   * Get endTime
   * @return endTime
  **/
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  public Stop endTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }

 /**
   * Get estimatedTime
   * @return estimatedTime
  **/
  @JsonProperty("estimatedTime")
  public Date getEstimatedTime() {
    return estimatedTime;
  }

  public void setEstimatedTime(Date estimatedTime) {
    this.estimatedTime = estimatedTime;
  }

  public Stop estimatedTime(Date estimatedTime) {
    this.estimatedTime = estimatedTime;
    return this;
  }

 /**
   * Get estimatedArrivalTime
   * @return estimatedArrivalTime
  **/
  @JsonProperty("estimatedArrivalTime")
  public Date getEstimatedArrivalTime() {
    return estimatedArrivalTime;
  }

  public void setEstimatedArrivalTime(Date estimatedArrivalTime) {
    this.estimatedArrivalTime = estimatedArrivalTime;
  }

  public Stop estimatedArrivalTime(Date estimatedArrivalTime) {
    this.estimatedArrivalTime = estimatedArrivalTime;
    return this;
  }

 /**
   * Get estimatedDepartureTime
   * @return estimatedDepartureTime
  **/
  @JsonProperty("estimatedDepartureTime")
  public Date getEstimatedDepartureTime() {
    return estimatedDepartureTime;
  }

  public void setEstimatedDepartureTime(Date estimatedDepartureTime) {
    this.estimatedDepartureTime = estimatedDepartureTime;
  }

  public Stop estimatedDepartureTime(Date estimatedDepartureTime) {
    this.estimatedDepartureTime = estimatedDepartureTime;
    return this;
  }

 /**
   * Get actualTime
   * @return actualTime
  **/
  @JsonProperty("actualTime")
  public Date getActualTime() {
    return actualTime;
  }

  public void setActualTime(Date actualTime) {
    this.actualTime = actualTime;
  }

  public Stop actualTime(Date actualTime) {
    this.actualTime = actualTime;
    return this;
  }

 /**
   * Get desiredTime
   * @return desiredTime
  **/
  @JsonProperty("desiredTime")
  public Date getDesiredTime() {
    return desiredTime;
  }

  public void setDesiredTime(Date desiredTime) {
    this.desiredTime = desiredTime;
  }

  public Stop desiredTime(Date desiredTime) {
    this.desiredTime = desiredTime;
    return this;
  }

 /**
   * Get timePadding
   * @return timePadding
  **/
  @JsonProperty("timePadding")
  public Integer getTimePadding() {
    return timePadding;
  }

  public void setTimePadding(Integer timePadding) {
    this.timePadding = timePadding;
  }

  public Stop timePadding(Integer timePadding) {
    this.timePadding = timePadding;
    return this;
  }

 /**
   * Get route
   * @return route
  **/
  @JsonProperty("route")
  public Route getRoute() {
    return route;
  }

  public void setRoute(Route route) {
    this.route = route;
  }

  public Stop route(Route route) {
    this.route = route;
    return this;
  }

 /**
   * Get shipment
   * @return shipment
  **/
  @JsonProperty("shipment")
  public Shipment getShipment() {
    return shipment;
  }

  public void setShipment(Shipment shipment) {
    this.shipment = shipment;
  }

  public Stop shipment(Shipment shipment) {
    this.shipment = shipment;
    return this;
  }

 /**
   * Get progressStatus
   * @return progressStatus
  **/
  @JsonProperty("progressStatus")
  public String getProgressStatus() {
    if (progressStatus == null) {
      return null;
    }
    return progressStatus.value();
  }

  public void setProgressStatus(ProgressStatusEnum progressStatus) {
    this.progressStatus = progressStatus;
  }

  public Stop progressStatus(ProgressStatusEnum progressStatus) {
    this.progressStatus = progressStatus;
    return this;
  }

 /**
   * Get compareEstimatedTime
   * @return compareEstimatedTime
  **/
  @JsonProperty("compareEstimatedTime")
  public Date getCompareEstimatedTime() {
    return compareEstimatedTime;
  }

  public void setCompareEstimatedTime(Date compareEstimatedTime) {
    this.compareEstimatedTime = compareEstimatedTime;
  }

  public Stop compareEstimatedTime(Date compareEstimatedTime) {
    this.compareEstimatedTime = compareEstimatedTime;
    return this;
  }

 /**
   * Get compareEstimatedArrivalTime
   * @return compareEstimatedArrivalTime
  **/
  @JsonProperty("compareEstimatedArrivalTime")
  public Date getCompareEstimatedArrivalTime() {
    return compareEstimatedArrivalTime;
  }

  public void setCompareEstimatedArrivalTime(Date compareEstimatedArrivalTime) {
    this.compareEstimatedArrivalTime = compareEstimatedArrivalTime;
  }

  public Stop compareEstimatedArrivalTime(Date compareEstimatedArrivalTime) {
    this.compareEstimatedArrivalTime = compareEstimatedArrivalTime;
    return this;
  }

 /**
   * Get compareEstimiatedDepartureTime
   * @return compareEstimiatedDepartureTime
  **/
  @JsonProperty("compareEstimiatedDepartureTime")
  public Date getCompareEstimiatedDepartureTime() {
    return compareEstimiatedDepartureTime;
  }

  public void setCompareEstimiatedDepartureTime(Date compareEstimiatedDepartureTime) {
    this.compareEstimiatedDepartureTime = compareEstimiatedDepartureTime;
  }

  public Stop compareEstimiatedDepartureTime(Date compareEstimiatedDepartureTime) {
    this.compareEstimiatedDepartureTime = compareEstimiatedDepartureTime;
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

  public Stop polyline(String polyline) {
    this.polyline = polyline;
    return this;
  }

 /**
   * Get parent
   * @return parent
  **/
  @JsonProperty("parent")
  public Stop getParent() {
    return parent;
  }

  public void setParent(Stop parent) {
    this.parent = parent;
  }

  public Stop parent(Stop parent) {
    this.parent = parent;
    return this;
  }

 /**
   * Get locationDisplay
   * @return locationDisplay
  **/
  @JsonProperty("locationDisplay")
  public String getLocationDisplay() {
    return locationDisplay;
  }

  public void setLocationDisplay(String locationDisplay) {
    this.locationDisplay = locationDisplay;
  }

  public Stop locationDisplay(String locationDisplay) {
    this.locationDisplay = locationDisplay;
    return this;
  }

 /**
   * Get complete
   * @return complete
  **/
  @JsonProperty("complete")
  public Boolean getComplete() {
    return complete;
  }

  public void setComplete(Boolean complete) {
    this.complete = complete;
  }

  public Stop complete(Boolean complete) {
    this.complete = complete;
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

  public Stop contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

 /**
   * Get locationAddress
   * @return locationAddress
  **/
  @JsonProperty("locationAddress")
  public String getLocationAddress() {
    return locationAddress;
  }

  public void setLocationAddress(String locationAddress) {
    this.locationAddress = locationAddress;
  }

  public Stop locationAddress(String locationAddress) {
    this.locationAddress = locationAddress;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

