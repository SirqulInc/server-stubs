package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Connection;
import org.openapitools.model.Location;
import org.openapitools.model.Recurrence;
import org.openapitools.model.Route;
import org.openapitools.model.Shipment;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Trip  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  @Valid

  private Account owner;

  @ApiModelProperty(value = "")

  @Valid

  private Location pickupLocation;

  @ApiModelProperty(value = "")

  private Date pickupTime;

  @ApiModelProperty(value = "")

  @Valid

  private Location dropOffLocation;

  @ApiModelProperty(value = "")

  private Date dropOffTime;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Shipment> shipments = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private Recurrence recurrence;

  @ApiModelProperty(value = "")

  private String timeZone;

  @ApiModelProperty(value = "")

  @Valid

  private Route route;

public enum PreferenceEnum {

DRIVE(String.valueOf("DRIVE")), FLEXIBLE(String.valueOf("FLEXIBLE")), RIDE(String.valueOf("RIDE"));


    private String value;

    PreferenceEnum (String v) {
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
    public static PreferenceEnum fromValue(String value) {
        for (PreferenceEnum b : PreferenceEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private PreferenceEnum preference;

  @ApiModelProperty(value = "")

  private String notifications;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Trip> matches = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private Connection ownerConnection;

  @ApiModelProperty(value = "")

  private Long originalId;
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

  public Trip id(Long id) {
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

  public Trip active(Boolean active) {
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

  public Trip valid(Boolean valid) {
    this.valid = valid;
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

  public Trip owner(Account owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get pickupLocation
   * @return pickupLocation
  **/
  @JsonProperty("pickupLocation")
  public Location getPickupLocation() {
    return pickupLocation;
  }

  public void setPickupLocation(Location pickupLocation) {
    this.pickupLocation = pickupLocation;
  }

  public Trip pickupLocation(Location pickupLocation) {
    this.pickupLocation = pickupLocation;
    return this;
  }

 /**
   * Get pickupTime
   * @return pickupTime
  **/
  @JsonProperty("pickupTime")
  public Date getPickupTime() {
    return pickupTime;
  }

  public void setPickupTime(Date pickupTime) {
    this.pickupTime = pickupTime;
  }

  public Trip pickupTime(Date pickupTime) {
    this.pickupTime = pickupTime;
    return this;
  }

 /**
   * Get dropOffLocation
   * @return dropOffLocation
  **/
  @JsonProperty("dropOffLocation")
  public Location getDropOffLocation() {
    return dropOffLocation;
  }

  public void setDropOffLocation(Location dropOffLocation) {
    this.dropOffLocation = dropOffLocation;
  }

  public Trip dropOffLocation(Location dropOffLocation) {
    this.dropOffLocation = dropOffLocation;
    return this;
  }

 /**
   * Get dropOffTime
   * @return dropOffTime
  **/
  @JsonProperty("dropOffTime")
  public Date getDropOffTime() {
    return dropOffTime;
  }

  public void setDropOffTime(Date dropOffTime) {
    this.dropOffTime = dropOffTime;
  }

  public Trip dropOffTime(Date dropOffTime) {
    this.dropOffTime = dropOffTime;
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

  public Trip shipments(List<@Valid Shipment> shipments) {
    this.shipments = shipments;
    return this;
  }

  public Trip addShipmentsItem(Shipment shipmentsItem) {
    this.shipments.add(shipmentsItem);
    return this;
  }

 /**
   * Get recurrence
   * @return recurrence
  **/
  @JsonProperty("recurrence")
  public Recurrence getRecurrence() {
    return recurrence;
  }

  public void setRecurrence(Recurrence recurrence) {
    this.recurrence = recurrence;
  }

  public Trip recurrence(Recurrence recurrence) {
    this.recurrence = recurrence;
    return this;
  }

 /**
   * Get timeZone
   * @return timeZone
  **/
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public Trip timeZone(String timeZone) {
    this.timeZone = timeZone;
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

  public Trip route(Route route) {
    this.route = route;
    return this;
  }

 /**
   * Get preference
   * @return preference
  **/
  @JsonProperty("preference")
  public String getPreference() {
    if (preference == null) {
      return null;
    }
    return preference.value();
  }

  public void setPreference(PreferenceEnum preference) {
    this.preference = preference;
  }

  public Trip preference(PreferenceEnum preference) {
    this.preference = preference;
    return this;
  }

 /**
   * Get notifications
   * @return notifications
  **/
  @JsonProperty("notifications")
  public String getNotifications() {
    return notifications;
  }

  public void setNotifications(String notifications) {
    this.notifications = notifications;
  }

  public Trip notifications(String notifications) {
    this.notifications = notifications;
    return this;
  }

 /**
   * Get matches
   * @return matches
  **/
  @JsonProperty("matches")
  public List<@Valid Trip> getMatches() {
    return matches;
  }

  public void setMatches(List<@Valid Trip> matches) {
    this.matches = matches;
  }

  public Trip matches(List<@Valid Trip> matches) {
    this.matches = matches;
    return this;
  }

  public Trip addMatchesItem(Trip matchesItem) {
    this.matches.add(matchesItem);
    return this;
  }

 /**
   * Get ownerConnection
   * @return ownerConnection
  **/
  @JsonProperty("ownerConnection")
  public Connection getOwnerConnection() {
    return ownerConnection;
  }

  public void setOwnerConnection(Connection ownerConnection) {
    this.ownerConnection = ownerConnection;
  }

  public Trip ownerConnection(Connection ownerConnection) {
    this.ownerConnection = ownerConnection;
    return this;
  }

 /**
   * Get originalId
   * @return originalId
  **/
  @JsonProperty("originalId")
  public Long getOriginalId() {
    return originalId;
  }

  public void setOriginalId(Long originalId) {
    this.originalId = originalId;
  }

  public Trip originalId(Long originalId) {
    this.originalId = originalId;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

