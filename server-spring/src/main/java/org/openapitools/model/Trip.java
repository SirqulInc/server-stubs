package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Connection;
import org.openapitools.model.Location;
import org.openapitools.model.Recurrence;
import org.openapitools.model.Route;
import org.openapitools.model.Shipment;
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
 * Trip
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Trip {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Account owner;

  private @Nullable Location pickupLocation;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime pickupTime;

  private @Nullable Location dropOffLocation;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime dropOffTime;

  @Valid
  private List<@Valid Shipment> shipments = new ArrayList<>();

  private @Nullable Recurrence recurrence;

  private @Nullable String timeZone;

  private @Nullable Route route;

  /**
   * Gets or Sets preference
   */
  public enum PreferenceEnum {
    DRIVE("DRIVE"),
    
    FLEXIBLE("FLEXIBLE"),
    
    RIDE("RIDE");

    private final String value;

    PreferenceEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PreferenceEnum fromValue(String value) {
      for (PreferenceEnum b : PreferenceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable PreferenceEnum preference;

  private @Nullable String notifications;

  @Valid
  private List<@Valid Trip> matches = new ArrayList<>();

  private @Nullable Connection ownerConnection;

  private @Nullable Long originalId;

  public Trip id(@Nullable Long id) {
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

  public Trip active(@Nullable Boolean active) {
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

  public Trip valid(@Nullable Boolean valid) {
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

  public Trip owner(@Nullable Account owner) {
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

  public Trip pickupLocation(@Nullable Location pickupLocation) {
    this.pickupLocation = pickupLocation;
    return this;
  }

  /**
   * Get pickupLocation
   * @return pickupLocation
   */
  @Valid 
  @Schema(name = "pickupLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pickupLocation")
  public @Nullable Location getPickupLocation() {
    return pickupLocation;
  }

  public void setPickupLocation(@Nullable Location pickupLocation) {
    this.pickupLocation = pickupLocation;
  }

  public Trip pickupTime(@Nullable OffsetDateTime pickupTime) {
    this.pickupTime = pickupTime;
    return this;
  }

  /**
   * Get pickupTime
   * @return pickupTime
   */
  @Valid 
  @Schema(name = "pickupTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pickupTime")
  public @Nullable OffsetDateTime getPickupTime() {
    return pickupTime;
  }

  public void setPickupTime(@Nullable OffsetDateTime pickupTime) {
    this.pickupTime = pickupTime;
  }

  public Trip dropOffLocation(@Nullable Location dropOffLocation) {
    this.dropOffLocation = dropOffLocation;
    return this;
  }

  /**
   * Get dropOffLocation
   * @return dropOffLocation
   */
  @Valid 
  @Schema(name = "dropOffLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dropOffLocation")
  public @Nullable Location getDropOffLocation() {
    return dropOffLocation;
  }

  public void setDropOffLocation(@Nullable Location dropOffLocation) {
    this.dropOffLocation = dropOffLocation;
  }

  public Trip dropOffTime(@Nullable OffsetDateTime dropOffTime) {
    this.dropOffTime = dropOffTime;
    return this;
  }

  /**
   * Get dropOffTime
   * @return dropOffTime
   */
  @Valid 
  @Schema(name = "dropOffTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dropOffTime")
  public @Nullable OffsetDateTime getDropOffTime() {
    return dropOffTime;
  }

  public void setDropOffTime(@Nullable OffsetDateTime dropOffTime) {
    this.dropOffTime = dropOffTime;
  }

  public Trip shipments(List<@Valid Shipment> shipments) {
    this.shipments = shipments;
    return this;
  }

  public Trip addShipmentsItem(Shipment shipmentsItem) {
    if (this.shipments == null) {
      this.shipments = new ArrayList<>();
    }
    this.shipments.add(shipmentsItem);
    return this;
  }

  /**
   * Get shipments
   * @return shipments
   */
  @Valid 
  @Schema(name = "shipments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipments")
  public List<@Valid Shipment> getShipments() {
    return shipments;
  }

  public void setShipments(List<@Valid Shipment> shipments) {
    this.shipments = shipments;
  }

  public Trip recurrence(@Nullable Recurrence recurrence) {
    this.recurrence = recurrence;
    return this;
  }

  /**
   * Get recurrence
   * @return recurrence
   */
  @Valid 
  @Schema(name = "recurrence", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recurrence")
  public @Nullable Recurrence getRecurrence() {
    return recurrence;
  }

  public void setRecurrence(@Nullable Recurrence recurrence) {
    this.recurrence = recurrence;
  }

  public Trip timeZone(@Nullable String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Get timeZone
   * @return timeZone
   */
  
  @Schema(name = "timeZone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeZone")
  public @Nullable String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(@Nullable String timeZone) {
    this.timeZone = timeZone;
  }

  public Trip route(@Nullable Route route) {
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

  public Trip preference(@Nullable PreferenceEnum preference) {
    this.preference = preference;
    return this;
  }

  /**
   * Get preference
   * @return preference
   */
  
  @Schema(name = "preference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preference")
  public @Nullable PreferenceEnum getPreference() {
    return preference;
  }

  public void setPreference(@Nullable PreferenceEnum preference) {
    this.preference = preference;
  }

  public Trip notifications(@Nullable String notifications) {
    this.notifications = notifications;
    return this;
  }

  /**
   * Get notifications
   * @return notifications
   */
  
  @Schema(name = "notifications", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifications")
  public @Nullable String getNotifications() {
    return notifications;
  }

  public void setNotifications(@Nullable String notifications) {
    this.notifications = notifications;
  }

  public Trip matches(List<@Valid Trip> matches) {
    this.matches = matches;
    return this;
  }

  public Trip addMatchesItem(Trip matchesItem) {
    if (this.matches == null) {
      this.matches = new ArrayList<>();
    }
    this.matches.add(matchesItem);
    return this;
  }

  /**
   * Get matches
   * @return matches
   */
  @Valid 
  @Schema(name = "matches", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("matches")
  public List<@Valid Trip> getMatches() {
    return matches;
  }

  public void setMatches(List<@Valid Trip> matches) {
    this.matches = matches;
  }

  public Trip ownerConnection(@Nullable Connection ownerConnection) {
    this.ownerConnection = ownerConnection;
    return this;
  }

  /**
   * Get ownerConnection
   * @return ownerConnection
   */
  @Valid 
  @Schema(name = "ownerConnection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ownerConnection")
  public @Nullable Connection getOwnerConnection() {
    return ownerConnection;
  }

  public void setOwnerConnection(@Nullable Connection ownerConnection) {
    this.ownerConnection = ownerConnection;
  }

  public Trip originalId(@Nullable Long originalId) {
    this.originalId = originalId;
    return this;
  }

  /**
   * Get originalId
   * @return originalId
   */
  
  @Schema(name = "originalId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("originalId")
  public @Nullable Long getOriginalId() {
    return originalId;
  }

  public void setOriginalId(@Nullable Long originalId) {
    this.originalId = originalId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trip trip = (Trip) o;
    return Objects.equals(this.id, trip.id) &&
        Objects.equals(this.active, trip.active) &&
        Objects.equals(this.valid, trip.valid) &&
        Objects.equals(this.owner, trip.owner) &&
        Objects.equals(this.pickupLocation, trip.pickupLocation) &&
        Objects.equals(this.pickupTime, trip.pickupTime) &&
        Objects.equals(this.dropOffLocation, trip.dropOffLocation) &&
        Objects.equals(this.dropOffTime, trip.dropOffTime) &&
        Objects.equals(this.shipments, trip.shipments) &&
        Objects.equals(this.recurrence, trip.recurrence) &&
        Objects.equals(this.timeZone, trip.timeZone) &&
        Objects.equals(this.route, trip.route) &&
        Objects.equals(this.preference, trip.preference) &&
        Objects.equals(this.notifications, trip.notifications) &&
        Objects.equals(this.matches, trip.matches) &&
        Objects.equals(this.ownerConnection, trip.ownerConnection) &&
        Objects.equals(this.originalId, trip.originalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, owner, pickupLocation, pickupTime, dropOffLocation, dropOffTime, shipments, recurrence, timeZone, route, preference, notifications, matches, ownerConnection, originalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trip {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    pickupLocation: ").append(toIndentedString(pickupLocation)).append("\n");
    sb.append("    pickupTime: ").append(toIndentedString(pickupTime)).append("\n");
    sb.append("    dropOffLocation: ").append(toIndentedString(dropOffLocation)).append("\n");
    sb.append("    dropOffTime: ").append(toIndentedString(dropOffTime)).append("\n");
    sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    preference: ").append(toIndentedString(preference)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
    sb.append("    ownerConnection: ").append(toIndentedString(ownerConnection)).append("\n");
    sb.append("    originalId: ").append(toIndentedString(originalId)).append("\n");
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

