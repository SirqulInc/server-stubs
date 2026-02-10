package apimodels;

import apimodels.Account;
import apimodels.CargoType;
import apimodels.DateTimeRange;
import apimodels.Note;
import apimodels.PromoCode;
import apimodels.Route;
import apimodels.ServiceType;
import apimodels.Stop;
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
 * Shipment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Shipment   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("owner")
  @Valid

  private Account owner;

  @JsonProperty("rider")
  @Valid

  private Account rider;

  @JsonProperty("pickupStop")
  @Valid

  private Stop pickupStop;

  @JsonProperty("dropOffStop")
  @Valid

  private Stop dropOffStop;

  @JsonProperty("notes")
  @Valid

  private List<@Valid Note> notes = null;

  @JsonProperty("noteCount")
  
  private Long noteCount;

  @JsonProperty("batchId")
  
  private String batchId;

  @JsonProperty("reserved")
  @Valid

  private OffsetDateTime reserved;

  @JsonProperty("canceled")
  @Valid

  private OffsetDateTime canceled;

  @JsonProperty("confirmed")
  @Valid

  private OffsetDateTime confirmed;

  @JsonProperty("route")
  @Valid

  private Route route;

  @JsonProperty("polyline")
  
  private String polyline;

  @JsonProperty("replacePassenger")
  @Valid

  private Shipment replacePassenger;

  @JsonProperty("refunded")
  
  private Boolean refunded;

  @JsonProperty("promoCode")
  @Valid

  private PromoCode promoCode;

  @JsonProperty("quantity")
  
  private Integer quantity;

  @JsonProperty("pickupTimeWindow")
  @Valid

  private DateTimeRange pickupTimeWindow;

  @JsonProperty("dropOffTimeWindow")
  @Valid

  private DateTimeRange dropOffTimeWindow;

  @JsonProperty("cargoType")
  @Valid

  private CargoType cargoType;

  @JsonProperty("serviceType")
  @Valid

  private ServiceType serviceType;

  @JsonProperty("routeId")
  
  private Long routeId;

  @JsonProperty("totalVolume")
  
  private Double totalVolume;

  @JsonProperty("complete")
  
  private Boolean complete;

  @JsonProperty("contentName")
  
  private String contentName;

  @JsonProperty("riderName")
  
  private String riderName;

  public Shipment id(Long id) {
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

  public Shipment active(Boolean active) {
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

  public Shipment valid(Boolean valid) {
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

  public Shipment name(String name) {
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

  public Shipment owner(Account owner) {
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

  public Shipment rider(Account rider) {
    this.rider = rider;
    return this;
  }

   /**
   * Get rider
   * @return rider
  **/
  public Account getRider() {
    return rider;
  }

  public void setRider(Account rider) {
    this.rider = rider;
  }

  public Shipment pickupStop(Stop pickupStop) {
    this.pickupStop = pickupStop;
    return this;
  }

   /**
   * Get pickupStop
   * @return pickupStop
  **/
  public Stop getPickupStop() {
    return pickupStop;
  }

  public void setPickupStop(Stop pickupStop) {
    this.pickupStop = pickupStop;
  }

  public Shipment dropOffStop(Stop dropOffStop) {
    this.dropOffStop = dropOffStop;
    return this;
  }

   /**
   * Get dropOffStop
   * @return dropOffStop
  **/
  public Stop getDropOffStop() {
    return dropOffStop;
  }

  public void setDropOffStop(Stop dropOffStop) {
    this.dropOffStop = dropOffStop;
  }

  public Shipment notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public Shipment addNotesItem(Note notesItem) {
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

  public Shipment noteCount(Long noteCount) {
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

  public Shipment batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

   /**
   * Get batchId
   * @return batchId
  **/
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public Shipment reserved(OffsetDateTime reserved) {
    this.reserved = reserved;
    return this;
  }

   /**
   * Get reserved
   * @return reserved
  **/
  public OffsetDateTime getReserved() {
    return reserved;
  }

  public void setReserved(OffsetDateTime reserved) {
    this.reserved = reserved;
  }

  public Shipment canceled(OffsetDateTime canceled) {
    this.canceled = canceled;
    return this;
  }

   /**
   * Get canceled
   * @return canceled
  **/
  public OffsetDateTime getCanceled() {
    return canceled;
  }

  public void setCanceled(OffsetDateTime canceled) {
    this.canceled = canceled;
  }

  public Shipment confirmed(OffsetDateTime confirmed) {
    this.confirmed = confirmed;
    return this;
  }

   /**
   * Get confirmed
   * @return confirmed
  **/
  public OffsetDateTime getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(OffsetDateTime confirmed) {
    this.confirmed = confirmed;
  }

  public Shipment route(Route route) {
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

  public Shipment polyline(String polyline) {
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

  public Shipment replacePassenger(Shipment replacePassenger) {
    this.replacePassenger = replacePassenger;
    return this;
  }

   /**
   * Get replacePassenger
   * @return replacePassenger
  **/
  public Shipment getReplacePassenger() {
    return replacePassenger;
  }

  public void setReplacePassenger(Shipment replacePassenger) {
    this.replacePassenger = replacePassenger;
  }

  public Shipment refunded(Boolean refunded) {
    this.refunded = refunded;
    return this;
  }

   /**
   * Get refunded
   * @return refunded
  **/
  public Boolean getRefunded() {
    return refunded;
  }

  public void setRefunded(Boolean refunded) {
    this.refunded = refunded;
  }

  public Shipment promoCode(PromoCode promoCode) {
    this.promoCode = promoCode;
    return this;
  }

   /**
   * Get promoCode
   * @return promoCode
  **/
  public PromoCode getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(PromoCode promoCode) {
    this.promoCode = promoCode;
  }

  public Shipment quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Shipment pickupTimeWindow(DateTimeRange pickupTimeWindow) {
    this.pickupTimeWindow = pickupTimeWindow;
    return this;
  }

   /**
   * Get pickupTimeWindow
   * @return pickupTimeWindow
  **/
  public DateTimeRange getPickupTimeWindow() {
    return pickupTimeWindow;
  }

  public void setPickupTimeWindow(DateTimeRange pickupTimeWindow) {
    this.pickupTimeWindow = pickupTimeWindow;
  }

  public Shipment dropOffTimeWindow(DateTimeRange dropOffTimeWindow) {
    this.dropOffTimeWindow = dropOffTimeWindow;
    return this;
  }

   /**
   * Get dropOffTimeWindow
   * @return dropOffTimeWindow
  **/
  public DateTimeRange getDropOffTimeWindow() {
    return dropOffTimeWindow;
  }

  public void setDropOffTimeWindow(DateTimeRange dropOffTimeWindow) {
    this.dropOffTimeWindow = dropOffTimeWindow;
  }

  public Shipment cargoType(CargoType cargoType) {
    this.cargoType = cargoType;
    return this;
  }

   /**
   * Get cargoType
   * @return cargoType
  **/
  public CargoType getCargoType() {
    return cargoType;
  }

  public void setCargoType(CargoType cargoType) {
    this.cargoType = cargoType;
  }

  public Shipment serviceType(ServiceType serviceType) {
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Get serviceType
   * @return serviceType
  **/
  public ServiceType getServiceType() {
    return serviceType;
  }

  public void setServiceType(ServiceType serviceType) {
    this.serviceType = serviceType;
  }

  public Shipment routeId(Long routeId) {
    this.routeId = routeId;
    return this;
  }

   /**
   * Get routeId
   * @return routeId
  **/
  public Long getRouteId() {
    return routeId;
  }

  public void setRouteId(Long routeId) {
    this.routeId = routeId;
  }

  public Shipment totalVolume(Double totalVolume) {
    this.totalVolume = totalVolume;
    return this;
  }

   /**
   * Get totalVolume
   * @return totalVolume
  **/
  public Double getTotalVolume() {
    return totalVolume;
  }

  public void setTotalVolume(Double totalVolume) {
    this.totalVolume = totalVolume;
  }

  public Shipment complete(Boolean complete) {
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

  public Shipment contentName(String contentName) {
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

  public Shipment riderName(String riderName) {
    this.riderName = riderName;
    return this;
  }

   /**
   * Get riderName
   * @return riderName
  **/
  public String getRiderName() {
    return riderName;
  }

  public void setRiderName(String riderName) {
    this.riderName = riderName;
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
    return Objects.equals(id, shipment.id) &&
        Objects.equals(active, shipment.active) &&
        Objects.equals(valid, shipment.valid) &&
        Objects.equals(name, shipment.name) &&
        Objects.equals(owner, shipment.owner) &&
        Objects.equals(rider, shipment.rider) &&
        Objects.equals(pickupStop, shipment.pickupStop) &&
        Objects.equals(dropOffStop, shipment.dropOffStop) &&
        Objects.equals(notes, shipment.notes) &&
        Objects.equals(noteCount, shipment.noteCount) &&
        Objects.equals(batchId, shipment.batchId) &&
        Objects.equals(reserved, shipment.reserved) &&
        Objects.equals(canceled, shipment.canceled) &&
        Objects.equals(confirmed, shipment.confirmed) &&
        Objects.equals(route, shipment.route) &&
        Objects.equals(polyline, shipment.polyline) &&
        Objects.equals(replacePassenger, shipment.replacePassenger) &&
        Objects.equals(refunded, shipment.refunded) &&
        Objects.equals(promoCode, shipment.promoCode) &&
        Objects.equals(quantity, shipment.quantity) &&
        Objects.equals(pickupTimeWindow, shipment.pickupTimeWindow) &&
        Objects.equals(dropOffTimeWindow, shipment.dropOffTimeWindow) &&
        Objects.equals(cargoType, shipment.cargoType) &&
        Objects.equals(serviceType, shipment.serviceType) &&
        Objects.equals(routeId, shipment.routeId) &&
        Objects.equals(totalVolume, shipment.totalVolume) &&
        Objects.equals(complete, shipment.complete) &&
        Objects.equals(contentName, shipment.contentName) &&
        Objects.equals(riderName, shipment.riderName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, name, owner, rider, pickupStop, dropOffStop, notes, noteCount, batchId, reserved, canceled, confirmed, route, polyline, replacePassenger, refunded, promoCode, quantity, pickupTimeWindow, dropOffTimeWindow, cargoType, serviceType, routeId, totalVolume, complete, contentName, riderName);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

