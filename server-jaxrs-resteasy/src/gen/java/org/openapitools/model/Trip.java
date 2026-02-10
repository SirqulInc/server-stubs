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
import org.openapitools.model.Connection;
import org.openapitools.model.Location;
import org.openapitools.model.Recurrence;
import org.openapitools.model.Route;
import org.openapitools.model.Shipment;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Trip   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Account owner;
  private Location pickupLocation;
  private Date pickupTime;
  private Location dropOffLocation;
  private Date dropOffTime;
  private List<@Valid Shipment> shipments = new ArrayList<>();
  private Recurrence recurrence;
  private String timeZone;
  private Route route;

  /**
   * Gets or Sets preference
   */
  public enum PreferenceEnum {
    DRIVE("DRIVE"),

        FLEXIBLE("FLEXIBLE"),

        RIDE("RIDE");
    private String value;

    PreferenceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private PreferenceEnum preference;
  private String notifications;
  private List<@Valid Trip> matches = new ArrayList<>();
  private Connection ownerConnection;
  private Long originalId;

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
  @JsonProperty("pickupLocation")
  @Valid
  public Location getPickupLocation() {
    return pickupLocation;
  }
  public void setPickupLocation(Location pickupLocation) {
    this.pickupLocation = pickupLocation;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pickupTime")
  public Date getPickupTime() {
    return pickupTime;
  }
  public void setPickupTime(Date pickupTime) {
    this.pickupTime = pickupTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dropOffLocation")
  @Valid
  public Location getDropOffLocation() {
    return dropOffLocation;
  }
  public void setDropOffLocation(Location dropOffLocation) {
    this.dropOffLocation = dropOffLocation;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dropOffTime")
  public Date getDropOffTime() {
    return dropOffTime;
  }
  public void setDropOffTime(Date dropOffTime) {
    this.dropOffTime = dropOffTime;
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
  @JsonProperty("recurrence")
  @Valid
  public Recurrence getRecurrence() {
    return recurrence;
  }
  public void setRecurrence(Recurrence recurrence) {
    this.recurrence = recurrence;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
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
  @JsonProperty("preference")
  public PreferenceEnum getPreference() {
    return preference;
  }
  public void setPreference(PreferenceEnum preference) {
    this.preference = preference;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notifications")
  public String getNotifications() {
    return notifications;
  }
  public void setNotifications(String notifications) {
    this.notifications = notifications;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("matches")
  @Valid
  public List<@Valid Trip> getMatches() {
    return matches;
  }
  public void setMatches(List<@Valid Trip> matches) {
    this.matches = matches;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ownerConnection")
  @Valid
  public Connection getOwnerConnection() {
    return ownerConnection;
  }
  public void setOwnerConnection(Connection ownerConnection) {
    this.ownerConnection = ownerConnection;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("originalId")
  public Long getOriginalId() {
    return originalId;
  }
  public void setOriginalId(Long originalId) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

