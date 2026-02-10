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
import org.openapitools.model.CargoType;
import org.openapitools.model.DateTimeRange;
import org.openapitools.model.Note;
import org.openapitools.model.PromoCode;
import org.openapitools.model.Route;
import org.openapitools.model.ServiceType;
import org.openapitools.model.Stop;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Shipment   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private String name;
  private Account owner;
  private Account rider;
  private Stop pickupStop;
  private Stop dropOffStop;
  private List<@Valid Note> notes = new ArrayList<>();
  private Long noteCount;
  private String batchId;
  private Date reserved;
  private Date canceled;
  private Date confirmed;
  private Route route;
  private String polyline;
  private Shipment replacePassenger;
  private Boolean refunded;
  private PromoCode promoCode;
  private Integer quantity;
  private DateTimeRange pickupTimeWindow;
  private DateTimeRange dropOffTimeWindow;
  private CargoType cargoType;
  private ServiceType serviceType;
  private Long routeId;
  private Double totalVolume;
  private Boolean complete;
  private String contentName;
  private String riderName;

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
  @JsonProperty("rider")
  @Valid
  public Account getRider() {
    return rider;
  }
  public void setRider(Account rider) {
    this.rider = rider;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pickupStop")
  @Valid
  public Stop getPickupStop() {
    return pickupStop;
  }
  public void setPickupStop(Stop pickupStop) {
    this.pickupStop = pickupStop;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dropOffStop")
  @Valid
  public Stop getDropOffStop() {
    return dropOffStop;
  }
  public void setDropOffStop(Stop dropOffStop) {
    this.dropOffStop = dropOffStop;
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
  @JsonProperty("batchId")
  public String getBatchId() {
    return batchId;
  }
  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("reserved")
  public Date getReserved() {
    return reserved;
  }
  public void setReserved(Date reserved) {
    this.reserved = reserved;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("canceled")
  public Date getCanceled() {
    return canceled;
  }
  public void setCanceled(Date canceled) {
    this.canceled = canceled;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("confirmed")
  public Date getConfirmed() {
    return confirmed;
  }
  public void setConfirmed(Date confirmed) {
    this.confirmed = confirmed;
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
  @JsonProperty("replacePassenger")
  @Valid
  public Shipment getReplacePassenger() {
    return replacePassenger;
  }
  public void setReplacePassenger(Shipment replacePassenger) {
    this.replacePassenger = replacePassenger;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("refunded")
  public Boolean getRefunded() {
    return refunded;
  }
  public void setRefunded(Boolean refunded) {
    this.refunded = refunded;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("promoCode")
  @Valid
  public PromoCode getPromoCode() {
    return promoCode;
  }
  public void setPromoCode(PromoCode promoCode) {
    this.promoCode = promoCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pickupTimeWindow")
  @Valid
  public DateTimeRange getPickupTimeWindow() {
    return pickupTimeWindow;
  }
  public void setPickupTimeWindow(DateTimeRange pickupTimeWindow) {
    this.pickupTimeWindow = pickupTimeWindow;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dropOffTimeWindow")
  @Valid
  public DateTimeRange getDropOffTimeWindow() {
    return dropOffTimeWindow;
  }
  public void setDropOffTimeWindow(DateTimeRange dropOffTimeWindow) {
    this.dropOffTimeWindow = dropOffTimeWindow;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cargoType")
  @Valid
  public CargoType getCargoType() {
    return cargoType;
  }
  public void setCargoType(CargoType cargoType) {
    this.cargoType = cargoType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serviceType")
  @Valid
  public ServiceType getServiceType() {
    return serviceType;
  }
  public void setServiceType(ServiceType serviceType) {
    this.serviceType = serviceType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("routeId")
  public Long getRouteId() {
    return routeId;
  }
  public void setRouteId(Long routeId) {
    this.routeId = routeId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalVolume")
  public Double getTotalVolume() {
    return totalVolume;
  }
  public void setTotalVolume(Double totalVolume) {
    this.totalVolume = totalVolume;
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
  @JsonProperty("riderName")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

