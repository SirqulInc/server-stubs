package apimodels;

import apimodels.Account;
import apimodels.Location;
import apimodels.Note;
import apimodels.Route;
import apimodels.Shipment;
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
 * Stop
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Stop   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("latitude")
  
  private Double latitude;

  @JsonProperty("longitude")
  
  private Double longitude;

  @JsonProperty("locationDescription")
  
  private String locationDescription;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("owner")
  @Valid

  private Account owner;

  @JsonProperty("location")
  @Valid

  private Location location;

  @JsonProperty("notes")
  @Valid

  private List<@Valid Note> notes = null;

  @JsonProperty("noteCount")
  
  private Long noteCount;

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

  @JsonProperty("stopType")
  
  private StopTypeEnum stopType;

  @JsonProperty("orderIndex")
  
  private Long orderIndex;

  @JsonProperty("startTime")
  @Valid

  private OffsetDateTime startTime;

  @JsonProperty("endTime")
  @Valid

  private OffsetDateTime endTime;

  @JsonProperty("estimatedTime")
  @Valid

  private OffsetDateTime estimatedTime;

  @JsonProperty("estimatedArrivalTime")
  @Valid

  private OffsetDateTime estimatedArrivalTime;

  @JsonProperty("estimatedDepartureTime")
  @Valid

  private OffsetDateTime estimatedDepartureTime;

  @JsonProperty("actualTime")
  @Valid

  private OffsetDateTime actualTime;

  @JsonProperty("desiredTime")
  @Valid

  private OffsetDateTime desiredTime;

  @JsonProperty("timePadding")
  
  private Integer timePadding;

  @JsonProperty("route")
  @Valid

  private Route route;

  @JsonProperty("shipment")
  @Valid

  private Shipment shipment;

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

  @JsonProperty("progressStatus")
  
  private ProgressStatusEnum progressStatus;

  @JsonProperty("compareEstimatedTime")
  @Valid

  private OffsetDateTime compareEstimatedTime;

  @JsonProperty("compareEstimatedArrivalTime")
  @Valid

  private OffsetDateTime compareEstimatedArrivalTime;

  @JsonProperty("compareEstimiatedDepartureTime")
  @Valid

  private OffsetDateTime compareEstimiatedDepartureTime;

  @JsonProperty("polyline")
  
  private String polyline;

  @JsonProperty("parent")
  @Valid

  private Stop parent;

  @JsonProperty("locationDisplay")
  
  private String locationDisplay;

  @JsonProperty("complete")
  
  private Boolean complete;

  @JsonProperty("contentName")
  
  private String contentName;

  @JsonProperty("locationAddress")
  
  private String locationAddress;

  public Stop id(Long id) {
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

  public Stop active(Boolean active) {
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

  public Stop valid(Boolean valid) {
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

  public Stop latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Stop longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public Stop locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

   /**
   * Get locationDescription
   * @return locationDescription
  **/
  public String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }

  public Stop name(String name) {
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

  public Stop owner(Account owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public Stop location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
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
  **/
  public List<@Valid Note> getNotes() {
    return notes;
  }

  public void setNotes(List<@Valid Note> notes) {
    this.notes = notes;
  }

  public Stop noteCount(Long noteCount) {
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

  public Stop stopType(StopTypeEnum stopType) {
    this.stopType = stopType;
    return this;
  }

   /**
   * Get stopType
   * @return stopType
  **/
  public StopTypeEnum getStopType() {
    return stopType;
  }

  public void setStopType(StopTypeEnum stopType) {
    this.stopType = stopType;
  }

  public Stop orderIndex(Long orderIndex) {
    this.orderIndex = orderIndex;
    return this;
  }

   /**
   * Get orderIndex
   * @return orderIndex
  **/
  public Long getOrderIndex() {
    return orderIndex;
  }

  public void setOrderIndex(Long orderIndex) {
    this.orderIndex = orderIndex;
  }

  public Stop startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public Stop endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public Stop estimatedTime(OffsetDateTime estimatedTime) {
    this.estimatedTime = estimatedTime;
    return this;
  }

   /**
   * Get estimatedTime
   * @return estimatedTime
  **/
  public OffsetDateTime getEstimatedTime() {
    return estimatedTime;
  }

  public void setEstimatedTime(OffsetDateTime estimatedTime) {
    this.estimatedTime = estimatedTime;
  }

  public Stop estimatedArrivalTime(OffsetDateTime estimatedArrivalTime) {
    this.estimatedArrivalTime = estimatedArrivalTime;
    return this;
  }

   /**
   * Get estimatedArrivalTime
   * @return estimatedArrivalTime
  **/
  public OffsetDateTime getEstimatedArrivalTime() {
    return estimatedArrivalTime;
  }

  public void setEstimatedArrivalTime(OffsetDateTime estimatedArrivalTime) {
    this.estimatedArrivalTime = estimatedArrivalTime;
  }

  public Stop estimatedDepartureTime(OffsetDateTime estimatedDepartureTime) {
    this.estimatedDepartureTime = estimatedDepartureTime;
    return this;
  }

   /**
   * Get estimatedDepartureTime
   * @return estimatedDepartureTime
  **/
  public OffsetDateTime getEstimatedDepartureTime() {
    return estimatedDepartureTime;
  }

  public void setEstimatedDepartureTime(OffsetDateTime estimatedDepartureTime) {
    this.estimatedDepartureTime = estimatedDepartureTime;
  }

  public Stop actualTime(OffsetDateTime actualTime) {
    this.actualTime = actualTime;
    return this;
  }

   /**
   * Get actualTime
   * @return actualTime
  **/
  public OffsetDateTime getActualTime() {
    return actualTime;
  }

  public void setActualTime(OffsetDateTime actualTime) {
    this.actualTime = actualTime;
  }

  public Stop desiredTime(OffsetDateTime desiredTime) {
    this.desiredTime = desiredTime;
    return this;
  }

   /**
   * Get desiredTime
   * @return desiredTime
  **/
  public OffsetDateTime getDesiredTime() {
    return desiredTime;
  }

  public void setDesiredTime(OffsetDateTime desiredTime) {
    this.desiredTime = desiredTime;
  }

  public Stop timePadding(Integer timePadding) {
    this.timePadding = timePadding;
    return this;
  }

   /**
   * Get timePadding
   * @return timePadding
  **/
  public Integer getTimePadding() {
    return timePadding;
  }

  public void setTimePadding(Integer timePadding) {
    this.timePadding = timePadding;
  }

  public Stop route(Route route) {
    this.route = route;
    return this;
  }

   /**
   * Get route
   * @return route
  **/
  public Route getRoute() {
    return route;
  }

  public void setRoute(Route route) {
    this.route = route;
  }

  public Stop shipment(Shipment shipment) {
    this.shipment = shipment;
    return this;
  }

   /**
   * Get shipment
   * @return shipment
  **/
  public Shipment getShipment() {
    return shipment;
  }

  public void setShipment(Shipment shipment) {
    this.shipment = shipment;
  }

  public Stop progressStatus(ProgressStatusEnum progressStatus) {
    this.progressStatus = progressStatus;
    return this;
  }

   /**
   * Get progressStatus
   * @return progressStatus
  **/
  public ProgressStatusEnum getProgressStatus() {
    return progressStatus;
  }

  public void setProgressStatus(ProgressStatusEnum progressStatus) {
    this.progressStatus = progressStatus;
  }

  public Stop compareEstimatedTime(OffsetDateTime compareEstimatedTime) {
    this.compareEstimatedTime = compareEstimatedTime;
    return this;
  }

   /**
   * Get compareEstimatedTime
   * @return compareEstimatedTime
  **/
  public OffsetDateTime getCompareEstimatedTime() {
    return compareEstimatedTime;
  }

  public void setCompareEstimatedTime(OffsetDateTime compareEstimatedTime) {
    this.compareEstimatedTime = compareEstimatedTime;
  }

  public Stop compareEstimatedArrivalTime(OffsetDateTime compareEstimatedArrivalTime) {
    this.compareEstimatedArrivalTime = compareEstimatedArrivalTime;
    return this;
  }

   /**
   * Get compareEstimatedArrivalTime
   * @return compareEstimatedArrivalTime
  **/
  public OffsetDateTime getCompareEstimatedArrivalTime() {
    return compareEstimatedArrivalTime;
  }

  public void setCompareEstimatedArrivalTime(OffsetDateTime compareEstimatedArrivalTime) {
    this.compareEstimatedArrivalTime = compareEstimatedArrivalTime;
  }

  public Stop compareEstimiatedDepartureTime(OffsetDateTime compareEstimiatedDepartureTime) {
    this.compareEstimiatedDepartureTime = compareEstimiatedDepartureTime;
    return this;
  }

   /**
   * Get compareEstimiatedDepartureTime
   * @return compareEstimiatedDepartureTime
  **/
  public OffsetDateTime getCompareEstimiatedDepartureTime() {
    return compareEstimiatedDepartureTime;
  }

  public void setCompareEstimiatedDepartureTime(OffsetDateTime compareEstimiatedDepartureTime) {
    this.compareEstimiatedDepartureTime = compareEstimiatedDepartureTime;
  }

  public Stop polyline(String polyline) {
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

  public Stop parent(Stop parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  public Stop getParent() {
    return parent;
  }

  public void setParent(Stop parent) {
    this.parent = parent;
  }

  public Stop locationDisplay(String locationDisplay) {
    this.locationDisplay = locationDisplay;
    return this;
  }

   /**
   * Get locationDisplay
   * @return locationDisplay
  **/
  public String getLocationDisplay() {
    return locationDisplay;
  }

  public void setLocationDisplay(String locationDisplay) {
    this.locationDisplay = locationDisplay;
  }

  public Stop complete(Boolean complete) {
    this.complete = complete;
    return this;
  }

   /**
   * Get complete
   * @return complete
  **/
  public Boolean getComplete() {
    return complete;
  }

  public void setComplete(Boolean complete) {
    this.complete = complete;
  }

  public Stop contentName(String contentName) {
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

  public Stop locationAddress(String locationAddress) {
    this.locationAddress = locationAddress;
    return this;
  }

   /**
   * Get locationAddress
   * @return locationAddress
  **/
  public String getLocationAddress() {
    return locationAddress;
  }

  public void setLocationAddress(String locationAddress) {
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
    return Objects.equals(id, stop.id) &&
        Objects.equals(active, stop.active) &&
        Objects.equals(valid, stop.valid) &&
        Objects.equals(latitude, stop.latitude) &&
        Objects.equals(longitude, stop.longitude) &&
        Objects.equals(locationDescription, stop.locationDescription) &&
        Objects.equals(name, stop.name) &&
        Objects.equals(owner, stop.owner) &&
        Objects.equals(location, stop.location) &&
        Objects.equals(notes, stop.notes) &&
        Objects.equals(noteCount, stop.noteCount) &&
        Objects.equals(stopType, stop.stopType) &&
        Objects.equals(orderIndex, stop.orderIndex) &&
        Objects.equals(startTime, stop.startTime) &&
        Objects.equals(endTime, stop.endTime) &&
        Objects.equals(estimatedTime, stop.estimatedTime) &&
        Objects.equals(estimatedArrivalTime, stop.estimatedArrivalTime) &&
        Objects.equals(estimatedDepartureTime, stop.estimatedDepartureTime) &&
        Objects.equals(actualTime, stop.actualTime) &&
        Objects.equals(desiredTime, stop.desiredTime) &&
        Objects.equals(timePadding, stop.timePadding) &&
        Objects.equals(route, stop.route) &&
        Objects.equals(shipment, stop.shipment) &&
        Objects.equals(progressStatus, stop.progressStatus) &&
        Objects.equals(compareEstimatedTime, stop.compareEstimatedTime) &&
        Objects.equals(compareEstimatedArrivalTime, stop.compareEstimatedArrivalTime) &&
        Objects.equals(compareEstimiatedDepartureTime, stop.compareEstimiatedDepartureTime) &&
        Objects.equals(polyline, stop.polyline) &&
        Objects.equals(parent, stop.parent) &&
        Objects.equals(locationDisplay, stop.locationDisplay) &&
        Objects.equals(complete, stop.complete) &&
        Objects.equals(contentName, stop.contentName) &&
        Objects.equals(locationAddress, stop.locationAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, latitude, longitude, locationDescription, name, owner, location, notes, noteCount, stopType, orderIndex, startTime, endTime, estimatedTime, estimatedArrivalTime, estimatedDepartureTime, actualTime, desiredTime, timePadding, route, shipment, progressStatus, compareEstimatedTime, compareEstimatedArrivalTime, compareEstimiatedDepartureTime, polyline, parent, locationDisplay, complete, contentName, locationAddress);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

