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
import org.openapitools.model.CargoType;
import org.openapitools.model.DateTimeRange;
import org.openapitools.model.Note;
import org.openapitools.model.PromoCode;
import org.openapitools.model.Route;
import org.openapitools.model.ServiceType;
import org.openapitools.model.Stop;
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
 * Shipment
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Shipment {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable String name;

  private @Nullable Account owner;

  private @Nullable Account rider;

  private @Nullable Stop pickupStop;

  private @Nullable Stop dropOffStop;

  @Valid
  private List<@Valid Note> notes = new ArrayList<>();

  private @Nullable Long noteCount;

  private @Nullable String batchId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime reserved;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime canceled;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime confirmed;

  private @Nullable Route route;

  private @Nullable String polyline;

  private @Nullable Shipment replacePassenger;

  private @Nullable Boolean refunded;

  private @Nullable PromoCode promoCode;

  private @Nullable Integer quantity;

  private @Nullable DateTimeRange pickupTimeWindow;

  private @Nullable DateTimeRange dropOffTimeWindow;

  private @Nullable CargoType cargoType;

  private @Nullable ServiceType serviceType;

  private @Nullable Long routeId;

  private @Nullable Double totalVolume;

  private @Nullable Boolean complete;

  private @Nullable String contentName;

  private @Nullable String riderName;

  public Shipment id(@Nullable Long id) {
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

  public Shipment active(@Nullable Boolean active) {
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

  public Shipment valid(@Nullable Boolean valid) {
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

  public Shipment name(@Nullable String name) {
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

  public Shipment owner(@Nullable Account owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @Valid 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public @Nullable Account getOwner() {
    return owner;
  }

  public void setOwner(@Nullable Account owner) {
    this.owner = owner;
  }

  public Shipment rider(@Nullable Account rider) {
    this.rider = rider;
    return this;
  }

  /**
   * Get rider
   * @return rider
   */
  @Valid 
  @Schema(name = "rider", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rider")
  public @Nullable Account getRider() {
    return rider;
  }

  public void setRider(@Nullable Account rider) {
    this.rider = rider;
  }

  public Shipment pickupStop(@Nullable Stop pickupStop) {
    this.pickupStop = pickupStop;
    return this;
  }

  /**
   * Get pickupStop
   * @return pickupStop
   */
  @Valid 
  @Schema(name = "pickupStop", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pickupStop")
  public @Nullable Stop getPickupStop() {
    return pickupStop;
  }

  public void setPickupStop(@Nullable Stop pickupStop) {
    this.pickupStop = pickupStop;
  }

  public Shipment dropOffStop(@Nullable Stop dropOffStop) {
    this.dropOffStop = dropOffStop;
    return this;
  }

  /**
   * Get dropOffStop
   * @return dropOffStop
   */
  @Valid 
  @Schema(name = "dropOffStop", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dropOffStop")
  public @Nullable Stop getDropOffStop() {
    return dropOffStop;
  }

  public void setDropOffStop(@Nullable Stop dropOffStop) {
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

  public Shipment noteCount(@Nullable Long noteCount) {
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

  public Shipment batchId(@Nullable String batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * Get batchId
   * @return batchId
   */
  
  @Schema(name = "batchId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("batchId")
  public @Nullable String getBatchId() {
    return batchId;
  }

  public void setBatchId(@Nullable String batchId) {
    this.batchId = batchId;
  }

  public Shipment reserved(@Nullable OffsetDateTime reserved) {
    this.reserved = reserved;
    return this;
  }

  /**
   * Get reserved
   * @return reserved
   */
  @Valid 
  @Schema(name = "reserved", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reserved")
  public @Nullable OffsetDateTime getReserved() {
    return reserved;
  }

  public void setReserved(@Nullable OffsetDateTime reserved) {
    this.reserved = reserved;
  }

  public Shipment canceled(@Nullable OffsetDateTime canceled) {
    this.canceled = canceled;
    return this;
  }

  /**
   * Get canceled
   * @return canceled
   */
  @Valid 
  @Schema(name = "canceled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("canceled")
  public @Nullable OffsetDateTime getCanceled() {
    return canceled;
  }

  public void setCanceled(@Nullable OffsetDateTime canceled) {
    this.canceled = canceled;
  }

  public Shipment confirmed(@Nullable OffsetDateTime confirmed) {
    this.confirmed = confirmed;
    return this;
  }

  /**
   * Get confirmed
   * @return confirmed
   */
  @Valid 
  @Schema(name = "confirmed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("confirmed")
  public @Nullable OffsetDateTime getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(@Nullable OffsetDateTime confirmed) {
    this.confirmed = confirmed;
  }

  public Shipment route(@Nullable Route route) {
    this.route = route;
    return this;
  }

  /**
   * Get route
   * @return route
   */
  @Valid 
  @Schema(name = "route", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("route")
  public @Nullable Route getRoute() {
    return route;
  }

  public void setRoute(@Nullable Route route) {
    this.route = route;
  }

  public Shipment polyline(@Nullable String polyline) {
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

  public Shipment replacePassenger(@Nullable Shipment replacePassenger) {
    this.replacePassenger = replacePassenger;
    return this;
  }

  /**
   * Get replacePassenger
   * @return replacePassenger
   */
  @Valid 
  @Schema(name = "replacePassenger", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("replacePassenger")
  public @Nullable Shipment getReplacePassenger() {
    return replacePassenger;
  }

  public void setReplacePassenger(@Nullable Shipment replacePassenger) {
    this.replacePassenger = replacePassenger;
  }

  public Shipment refunded(@Nullable Boolean refunded) {
    this.refunded = refunded;
    return this;
  }

  /**
   * Get refunded
   * @return refunded
   */
  
  @Schema(name = "refunded", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refunded")
  public @Nullable Boolean getRefunded() {
    return refunded;
  }

  public void setRefunded(@Nullable Boolean refunded) {
    this.refunded = refunded;
  }

  public Shipment promoCode(@Nullable PromoCode promoCode) {
    this.promoCode = promoCode;
    return this;
  }

  /**
   * Get promoCode
   * @return promoCode
   */
  @Valid 
  @Schema(name = "promoCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promoCode")
  public @Nullable PromoCode getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(@Nullable PromoCode promoCode) {
    this.promoCode = promoCode;
  }

  public Shipment quantity(@Nullable Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
   */
  
  @Schema(name = "quantity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quantity")
  public @Nullable Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(@Nullable Integer quantity) {
    this.quantity = quantity;
  }

  public Shipment pickupTimeWindow(@Nullable DateTimeRange pickupTimeWindow) {
    this.pickupTimeWindow = pickupTimeWindow;
    return this;
  }

  /**
   * Get pickupTimeWindow
   * @return pickupTimeWindow
   */
  @Valid 
  @Schema(name = "pickupTimeWindow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pickupTimeWindow")
  public @Nullable DateTimeRange getPickupTimeWindow() {
    return pickupTimeWindow;
  }

  public void setPickupTimeWindow(@Nullable DateTimeRange pickupTimeWindow) {
    this.pickupTimeWindow = pickupTimeWindow;
  }

  public Shipment dropOffTimeWindow(@Nullable DateTimeRange dropOffTimeWindow) {
    this.dropOffTimeWindow = dropOffTimeWindow;
    return this;
  }

  /**
   * Get dropOffTimeWindow
   * @return dropOffTimeWindow
   */
  @Valid 
  @Schema(name = "dropOffTimeWindow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dropOffTimeWindow")
  public @Nullable DateTimeRange getDropOffTimeWindow() {
    return dropOffTimeWindow;
  }

  public void setDropOffTimeWindow(@Nullable DateTimeRange dropOffTimeWindow) {
    this.dropOffTimeWindow = dropOffTimeWindow;
  }

  public Shipment cargoType(@Nullable CargoType cargoType) {
    this.cargoType = cargoType;
    return this;
  }

  /**
   * Get cargoType
   * @return cargoType
   */
  @Valid 
  @Schema(name = "cargoType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cargoType")
  public @Nullable CargoType getCargoType() {
    return cargoType;
  }

  public void setCargoType(@Nullable CargoType cargoType) {
    this.cargoType = cargoType;
  }

  public Shipment serviceType(@Nullable ServiceType serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * Get serviceType
   * @return serviceType
   */
  @Valid 
  @Schema(name = "serviceType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceType")
  public @Nullable ServiceType getServiceType() {
    return serviceType;
  }

  public void setServiceType(@Nullable ServiceType serviceType) {
    this.serviceType = serviceType;
  }

  public Shipment routeId(@Nullable Long routeId) {
    this.routeId = routeId;
    return this;
  }

  /**
   * Get routeId
   * @return routeId
   */
  
  @Schema(name = "routeId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("routeId")
  public @Nullable Long getRouteId() {
    return routeId;
  }

  public void setRouteId(@Nullable Long routeId) {
    this.routeId = routeId;
  }

  public Shipment totalVolume(@Nullable Double totalVolume) {
    this.totalVolume = totalVolume;
    return this;
  }

  /**
   * Get totalVolume
   * @return totalVolume
   */
  
  @Schema(name = "totalVolume", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalVolume")
  public @Nullable Double getTotalVolume() {
    return totalVolume;
  }

  public void setTotalVolume(@Nullable Double totalVolume) {
    this.totalVolume = totalVolume;
  }

  public Shipment complete(@Nullable Boolean complete) {
    this.complete = complete;
    return this;
  }

  /**
   * Get complete
   * @return complete
   */
  
  @Schema(name = "complete", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("complete")
  public @Nullable Boolean getComplete() {
    return complete;
  }

  public void setComplete(@Nullable Boolean complete) {
    this.complete = complete;
  }

  public Shipment contentName(@Nullable String contentName) {
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

  public Shipment riderName(@Nullable String riderName) {
    this.riderName = riderName;
    return this;
  }

  /**
   * Get riderName
   * @return riderName
   */
  
  @Schema(name = "riderName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("riderName")
  public @Nullable String getRiderName() {
    return riderName;
  }

  public void setRiderName(@Nullable String riderName) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

