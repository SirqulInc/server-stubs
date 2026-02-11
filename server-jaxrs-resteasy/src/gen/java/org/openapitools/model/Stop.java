package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Stop   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Double latitude;
  private Double longitude;
  private String locationDescription;
  private String name;
  private Account owner;
  private Location location;
  private List<@Valid Note> notes = new ArrayList<>();
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
    private String value;

    StopTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private StopTypeEnum stopType;
  private Long orderIndex;
  private Date startTime;
  private Date endTime;
  private Date estimatedTime;
  private Date estimatedArrivalTime;
  private Date estimatedDepartureTime;
  private Date actualTime;
  private Date desiredTime;
  private Integer timePadding;
  private Route route;
  private Shipment shipment;

  /**
   * Gets or Sets progressStatus
   */
  public enum ProgressStatusEnum {
    PENDING("PENDING"),

        COMPLETE("COMPLETE"),

        INVALID("INVALID");
    private String value;

    ProgressStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ProgressStatusEnum progressStatus;
  private Date compareEstimatedTime;
  private Date compareEstimatedArrivalTime;
  private Date compareEstimiatedDepartureTime;
  private String polyline;
  private Stop parent;
  private String locationDisplay;
  private Boolean complete;
  private String contentName;
  private String locationAddress;

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
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationDescription")
  public String getLocationDescription() {
    return locationDescription;
  }
  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
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
  @JsonProperty("owner")
  @Valid
  public Account getOwner() {
    return owner;
  }
  public void setOwner(Account owner) {
    this.owner = owner;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("location")
  @Valid
  public Location getLocation() {
    return location;
  }
  public void setLocation(Location location) {
    this.location = location;
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
  @JsonProperty("stopType")
  public StopTypeEnum getStopType() {
    return stopType;
  }
  public void setStopType(StopTypeEnum stopType) {
    this.stopType = stopType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderIndex")
  public Long getOrderIndex() {
    return orderIndex;
  }
  public void setOrderIndex(Long orderIndex) {
    this.orderIndex = orderIndex;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("estimatedTime")
  public Date getEstimatedTime() {
    return estimatedTime;
  }
  public void setEstimatedTime(Date estimatedTime) {
    this.estimatedTime = estimatedTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("estimatedArrivalTime")
  public Date getEstimatedArrivalTime() {
    return estimatedArrivalTime;
  }
  public void setEstimatedArrivalTime(Date estimatedArrivalTime) {
    this.estimatedArrivalTime = estimatedArrivalTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("estimatedDepartureTime")
  public Date getEstimatedDepartureTime() {
    return estimatedDepartureTime;
  }
  public void setEstimatedDepartureTime(Date estimatedDepartureTime) {
    this.estimatedDepartureTime = estimatedDepartureTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("actualTime")
  public Date getActualTime() {
    return actualTime;
  }
  public void setActualTime(Date actualTime) {
    this.actualTime = actualTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("desiredTime")
  public Date getDesiredTime() {
    return desiredTime;
  }
  public void setDesiredTime(Date desiredTime) {
    this.desiredTime = desiredTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("timePadding")
  public Integer getTimePadding() {
    return timePadding;
  }
  public void setTimePadding(Integer timePadding) {
    this.timePadding = timePadding;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("route")
  @Valid
  public Route getRoute() {
    return route;
  }
  public void setRoute(Route route) {
    this.route = route;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipment")
  @Valid
  public Shipment getShipment() {
    return shipment;
  }
  public void setShipment(Shipment shipment) {
    this.shipment = shipment;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("progressStatus")
  public ProgressStatusEnum getProgressStatus() {
    return progressStatus;
  }
  public void setProgressStatus(ProgressStatusEnum progressStatus) {
    this.progressStatus = progressStatus;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("compareEstimatedTime")
  public Date getCompareEstimatedTime() {
    return compareEstimatedTime;
  }
  public void setCompareEstimatedTime(Date compareEstimatedTime) {
    this.compareEstimatedTime = compareEstimatedTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("compareEstimatedArrivalTime")
  public Date getCompareEstimatedArrivalTime() {
    return compareEstimatedArrivalTime;
  }
  public void setCompareEstimatedArrivalTime(Date compareEstimatedArrivalTime) {
    this.compareEstimatedArrivalTime = compareEstimatedArrivalTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("compareEstimiatedDepartureTime")
  public Date getCompareEstimiatedDepartureTime() {
    return compareEstimiatedDepartureTime;
  }
  public void setCompareEstimiatedDepartureTime(Date compareEstimiatedDepartureTime) {
    this.compareEstimiatedDepartureTime = compareEstimiatedDepartureTime;
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
  @JsonProperty("parent")
  @Valid
  public Stop getParent() {
    return parent;
  }
  public void setParent(Stop parent) {
    this.parent = parent;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationDisplay")
  public String getLocationDisplay() {
    return locationDisplay;
  }
  public void setLocationDisplay(String locationDisplay) {
    this.locationDisplay = locationDisplay;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("complete")
  public Boolean getComplete() {
    return complete;
  }
  public void setComplete(Boolean complete) {
    this.complete = complete;
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

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationAddress")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

