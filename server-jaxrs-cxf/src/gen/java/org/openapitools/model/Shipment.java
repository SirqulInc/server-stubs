package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.CargoType;
import org.openapitools.model.DateTimeRange;
import org.openapitools.model.Note;
import org.openapitools.model.PromoCode;
import org.openapitools.model.Route;
import org.openapitools.model.ServiceType;
import org.openapitools.model.Stop;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Shipment  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  @Valid

  private Account owner;

  @ApiModelProperty(value = "")

  @Valid

  private Account rider;

  @ApiModelProperty(value = "")

  @Valid

  private Stop pickupStop;

  @ApiModelProperty(value = "")

  @Valid

  private Stop dropOffStop;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Note> notes = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long noteCount;

  @ApiModelProperty(value = "")

  private String batchId;

  @ApiModelProperty(value = "")

  private Date reserved;

  @ApiModelProperty(value = "")

  private Date canceled;

  @ApiModelProperty(value = "")

  private Date confirmed;

  @ApiModelProperty(value = "")

  @Valid

  private Route route;

  @ApiModelProperty(value = "")

  private String polyline;

  @ApiModelProperty(value = "")

  @Valid

  private Shipment replacePassenger;

  @ApiModelProperty(value = "")

  private Boolean refunded;

  @ApiModelProperty(value = "")

  @Valid

  private PromoCode promoCode;

  @ApiModelProperty(value = "")

  private Integer quantity;

  @ApiModelProperty(value = "")

  @Valid

  private DateTimeRange pickupTimeWindow;

  @ApiModelProperty(value = "")

  @Valid

  private DateTimeRange dropOffTimeWindow;

  @ApiModelProperty(value = "")

  @Valid

  private CargoType cargoType;

  @ApiModelProperty(value = "")

  @Valid

  private ServiceType serviceType;

  @ApiModelProperty(value = "")

  private Long routeId;

  @ApiModelProperty(value = "")

  private Double totalVolume;

  @ApiModelProperty(value = "")

  private Boolean complete;

  @ApiModelProperty(value = "")

  private String contentName;

  @ApiModelProperty(value = "")

  private String riderName;
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

  public Shipment id(Long id) {
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

  public Shipment active(Boolean active) {
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

  public Shipment valid(Boolean valid) {
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

  public Shipment name(String name) {
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

  public Shipment owner(Account owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get rider
   * @return rider
  **/
  @JsonProperty("rider")
  public Account getRider() {
    return rider;
  }

  public void setRider(Account rider) {
    this.rider = rider;
  }

  public Shipment rider(Account rider) {
    this.rider = rider;
    return this;
  }

 /**
   * Get pickupStop
   * @return pickupStop
  **/
  @JsonProperty("pickupStop")
  public Stop getPickupStop() {
    return pickupStop;
  }

  public void setPickupStop(Stop pickupStop) {
    this.pickupStop = pickupStop;
  }

  public Shipment pickupStop(Stop pickupStop) {
    this.pickupStop = pickupStop;
    return this;
  }

 /**
   * Get dropOffStop
   * @return dropOffStop
  **/
  @JsonProperty("dropOffStop")
  public Stop getDropOffStop() {
    return dropOffStop;
  }

  public void setDropOffStop(Stop dropOffStop) {
    this.dropOffStop = dropOffStop;
  }

  public Shipment dropOffStop(Stop dropOffStop) {
    this.dropOffStop = dropOffStop;
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

  public Shipment notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public Shipment addNotesItem(Note notesItem) {
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

  public Shipment noteCount(Long noteCount) {
    this.noteCount = noteCount;
    return this;
  }

 /**
   * Get batchId
   * @return batchId
  **/
  @JsonProperty("batchId")
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public Shipment batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

 /**
   * Get reserved
   * @return reserved
  **/
  @JsonProperty("reserved")
  public Date getReserved() {
    return reserved;
  }

  public void setReserved(Date reserved) {
    this.reserved = reserved;
  }

  public Shipment reserved(Date reserved) {
    this.reserved = reserved;
    return this;
  }

 /**
   * Get canceled
   * @return canceled
  **/
  @JsonProperty("canceled")
  public Date getCanceled() {
    return canceled;
  }

  public void setCanceled(Date canceled) {
    this.canceled = canceled;
  }

  public Shipment canceled(Date canceled) {
    this.canceled = canceled;
    return this;
  }

 /**
   * Get confirmed
   * @return confirmed
  **/
  @JsonProperty("confirmed")
  public Date getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(Date confirmed) {
    this.confirmed = confirmed;
  }

  public Shipment confirmed(Date confirmed) {
    this.confirmed = confirmed;
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

  public Shipment route(Route route) {
    this.route = route;
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

  public Shipment polyline(String polyline) {
    this.polyline = polyline;
    return this;
  }

 /**
   * Get replacePassenger
   * @return replacePassenger
  **/
  @JsonProperty("replacePassenger")
  public Shipment getReplacePassenger() {
    return replacePassenger;
  }

  public void setReplacePassenger(Shipment replacePassenger) {
    this.replacePassenger = replacePassenger;
  }

  public Shipment replacePassenger(Shipment replacePassenger) {
    this.replacePassenger = replacePassenger;
    return this;
  }

 /**
   * Get refunded
   * @return refunded
  **/
  @JsonProperty("refunded")
  public Boolean getRefunded() {
    return refunded;
  }

  public void setRefunded(Boolean refunded) {
    this.refunded = refunded;
  }

  public Shipment refunded(Boolean refunded) {
    this.refunded = refunded;
    return this;
  }

 /**
   * Get promoCode
   * @return promoCode
  **/
  @JsonProperty("promoCode")
  public PromoCode getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(PromoCode promoCode) {
    this.promoCode = promoCode;
  }

  public Shipment promoCode(PromoCode promoCode) {
    this.promoCode = promoCode;
    return this;
  }

 /**
   * Get quantity
   * @return quantity
  **/
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Shipment quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

 /**
   * Get pickupTimeWindow
   * @return pickupTimeWindow
  **/
  @JsonProperty("pickupTimeWindow")
  public DateTimeRange getPickupTimeWindow() {
    return pickupTimeWindow;
  }

  public void setPickupTimeWindow(DateTimeRange pickupTimeWindow) {
    this.pickupTimeWindow = pickupTimeWindow;
  }

  public Shipment pickupTimeWindow(DateTimeRange pickupTimeWindow) {
    this.pickupTimeWindow = pickupTimeWindow;
    return this;
  }

 /**
   * Get dropOffTimeWindow
   * @return dropOffTimeWindow
  **/
  @JsonProperty("dropOffTimeWindow")
  public DateTimeRange getDropOffTimeWindow() {
    return dropOffTimeWindow;
  }

  public void setDropOffTimeWindow(DateTimeRange dropOffTimeWindow) {
    this.dropOffTimeWindow = dropOffTimeWindow;
  }

  public Shipment dropOffTimeWindow(DateTimeRange dropOffTimeWindow) {
    this.dropOffTimeWindow = dropOffTimeWindow;
    return this;
  }

 /**
   * Get cargoType
   * @return cargoType
  **/
  @JsonProperty("cargoType")
  public CargoType getCargoType() {
    return cargoType;
  }

  public void setCargoType(CargoType cargoType) {
    this.cargoType = cargoType;
  }

  public Shipment cargoType(CargoType cargoType) {
    this.cargoType = cargoType;
    return this;
  }

 /**
   * Get serviceType
   * @return serviceType
  **/
  @JsonProperty("serviceType")
  public ServiceType getServiceType() {
    return serviceType;
  }

  public void setServiceType(ServiceType serviceType) {
    this.serviceType = serviceType;
  }

  public Shipment serviceType(ServiceType serviceType) {
    this.serviceType = serviceType;
    return this;
  }

 /**
   * Get routeId
   * @return routeId
  **/
  @JsonProperty("routeId")
  public Long getRouteId() {
    return routeId;
  }

  public void setRouteId(Long routeId) {
    this.routeId = routeId;
  }

  public Shipment routeId(Long routeId) {
    this.routeId = routeId;
    return this;
  }

 /**
   * Get totalVolume
   * @return totalVolume
  **/
  @JsonProperty("totalVolume")
  public Double getTotalVolume() {
    return totalVolume;
  }

  public void setTotalVolume(Double totalVolume) {
    this.totalVolume = totalVolume;
  }

  public Shipment totalVolume(Double totalVolume) {
    this.totalVolume = totalVolume;
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

  public Shipment complete(Boolean complete) {
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

  public Shipment contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

 /**
   * Get riderName
   * @return riderName
  **/
  @JsonProperty("riderName")
  public String getRiderName() {
    return riderName;
  }

  public void setRiderName(String riderName) {
    this.riderName = riderName;
  }

  public Shipment riderName(String riderName) {
    this.riderName = riderName;
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
    Shipment shipment = (Shipment) o;
    return Objects.equals(this.id, shipment.id) &&
        Objects.equals(this.active, shipment.active) &&
        Objects.equals(this.valid, shipment.valid) &&
        Objects.equals(this.name, shipment.name) &&
        Objects.equals(this.owner, shipment.owner) &&
        Objects.equals(this.rider, shipment.rider) &&
        Objects.equals(this.pickupStop, shipment.pickupStop) &&
        Objects.equals(this.dropOffStop, shipment.dropOffStop) &&
        Objects.equals(this.notes, shipment.notes) &&
        Objects.equals(this.noteCount, shipment.noteCount) &&
        Objects.equals(this.batchId, shipment.batchId) &&
        Objects.equals(this.reserved, shipment.reserved) &&
        Objects.equals(this.canceled, shipment.canceled) &&
        Objects.equals(this.confirmed, shipment.confirmed) &&
        Objects.equals(this.route, shipment.route) &&
        Objects.equals(this.polyline, shipment.polyline) &&
        Objects.equals(this.replacePassenger, shipment.replacePassenger) &&
        Objects.equals(this.refunded, shipment.refunded) &&
        Objects.equals(this.promoCode, shipment.promoCode) &&
        Objects.equals(this.quantity, shipment.quantity) &&
        Objects.equals(this.pickupTimeWindow, shipment.pickupTimeWindow) &&
        Objects.equals(this.dropOffTimeWindow, shipment.dropOffTimeWindow) &&
        Objects.equals(this.cargoType, shipment.cargoType) &&
        Objects.equals(this.serviceType, shipment.serviceType) &&
        Objects.equals(this.routeId, shipment.routeId) &&
        Objects.equals(this.totalVolume, shipment.totalVolume) &&
        Objects.equals(this.complete, shipment.complete) &&
        Objects.equals(this.contentName, shipment.contentName) &&
        Objects.equals(this.riderName, shipment.riderName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, name, owner, rider, pickupStop, dropOffStop, notes, noteCount, batchId, reserved, canceled, confirmed, route, polyline, replacePassenger, refunded, promoCode, quantity, pickupTimeWindow, dropOffTimeWindow, cargoType, serviceType, routeId, totalVolume, complete, contentName, riderName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shipment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    rider: ").append(toIndentedString(rider)).append("\n");
    sb.append("    pickupStop: ").append(toIndentedString(pickupStop)).append("\n");
    sb.append("    dropOffStop: ").append(toIndentedString(dropOffStop)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    noteCount: ").append(toIndentedString(noteCount)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    reserved: ").append(toIndentedString(reserved)).append("\n");
    sb.append("    canceled: ").append(toIndentedString(canceled)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    polyline: ").append(toIndentedString(polyline)).append("\n");
    sb.append("    replacePassenger: ").append(toIndentedString(replacePassenger)).append("\n");
    sb.append("    refunded: ").append(toIndentedString(refunded)).append("\n");
    sb.append("    promoCode: ").append(toIndentedString(promoCode)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    pickupTimeWindow: ").append(toIndentedString(pickupTimeWindow)).append("\n");
    sb.append("    dropOffTimeWindow: ").append(toIndentedString(dropOffTimeWindow)).append("\n");
    sb.append("    cargoType: ").append(toIndentedString(cargoType)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    totalVolume: ").append(toIndentedString(totalVolume)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
    sb.append("    riderName: ").append(toIndentedString(riderName)).append("\n");
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

