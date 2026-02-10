package apimodels;

import apimodels.Account;
import apimodels.Connection;
import apimodels.Location;
import apimodels.Recurrence;
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
 * Trip
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Trip   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("owner")
  @Valid

  private Account owner;

  @JsonProperty("pickupLocation")
  @Valid

  private Location pickupLocation;

  @JsonProperty("pickupTime")
  @Valid

  private OffsetDateTime pickupTime;

  @JsonProperty("dropOffLocation")
  @Valid

  private Location dropOffLocation;

  @JsonProperty("dropOffTime")
  @Valid

  private OffsetDateTime dropOffTime;

  @JsonProperty("shipments")
  @Valid

  private List<@Valid Shipment> shipments = null;

  @JsonProperty("recurrence")
  @Valid

  private Recurrence recurrence;

  @JsonProperty("timeZone")
  
  private String timeZone;

  @JsonProperty("route")
  @Valid

  private Route route;

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

  @JsonProperty("preference")
  
  private PreferenceEnum preference;

  @JsonProperty("notifications")
  
  private String notifications;

  @JsonProperty("matches")
  @Valid

  private List<@Valid Trip> matches = null;

  @JsonProperty("ownerConnection")
  @Valid

  private Connection ownerConnection;

  @JsonProperty("originalId")
  
  private Long originalId;

  public Trip id(Long id) {
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

  public Trip active(Boolean active) {
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

  public Trip valid(Boolean valid) {
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

  public Trip owner(Account owner) {
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

  public Trip pickupLocation(Location pickupLocation) {
    this.pickupLocation = pickupLocation;
    return this;
  }

   /**
   * Get pickupLocation
   * @return pickupLocation
  **/
  public Location getPickupLocation() {
    return pickupLocation;
  }

  public void setPickupLocation(Location pickupLocation) {
    this.pickupLocation = pickupLocation;
  }

  public Trip pickupTime(OffsetDateTime pickupTime) {
    this.pickupTime = pickupTime;
    return this;
  }

   /**
   * Get pickupTime
   * @return pickupTime
  **/
  public OffsetDateTime getPickupTime() {
    return pickupTime;
  }

  public void setPickupTime(OffsetDateTime pickupTime) {
    this.pickupTime = pickupTime;
  }

  public Trip dropOffLocation(Location dropOffLocation) {
    this.dropOffLocation = dropOffLocation;
    return this;
  }

   /**
   * Get dropOffLocation
   * @return dropOffLocation
  **/
  public Location getDropOffLocation() {
    return dropOffLocation;
  }

  public void setDropOffLocation(Location dropOffLocation) {
    this.dropOffLocation = dropOffLocation;
  }

  public Trip dropOffTime(OffsetDateTime dropOffTime) {
    this.dropOffTime = dropOffTime;
    return this;
  }

   /**
   * Get dropOffTime
   * @return dropOffTime
  **/
  public OffsetDateTime getDropOffTime() {
    return dropOffTime;
  }

  public void setDropOffTime(OffsetDateTime dropOffTime) {
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
  **/
  public List<@Valid Shipment> getShipments() {
    return shipments;
  }

  public void setShipments(List<@Valid Shipment> shipments) {
    this.shipments = shipments;
  }

  public Trip recurrence(Recurrence recurrence) {
    this.recurrence = recurrence;
    return this;
  }

   /**
   * Get recurrence
   * @return recurrence
  **/
  public Recurrence getRecurrence() {
    return recurrence;
  }

  public void setRecurrence(Recurrence recurrence) {
    this.recurrence = recurrence;
  }

  public Trip timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public Trip route(Route route) {
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

  public Trip preference(PreferenceEnum preference) {
    this.preference = preference;
    return this;
  }

   /**
   * Get preference
   * @return preference
  **/
  public PreferenceEnum getPreference() {
    return preference;
  }

  public void setPreference(PreferenceEnum preference) {
    this.preference = preference;
  }

  public Trip notifications(String notifications) {
    this.notifications = notifications;
    return this;
  }

   /**
   * Get notifications
   * @return notifications
  **/
  public String getNotifications() {
    return notifications;
  }

  public void setNotifications(String notifications) {
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
  **/
  public List<@Valid Trip> getMatches() {
    return matches;
  }

  public void setMatches(List<@Valid Trip> matches) {
    this.matches = matches;
  }

  public Trip ownerConnection(Connection ownerConnection) {
    this.ownerConnection = ownerConnection;
    return this;
  }

   /**
   * Get ownerConnection
   * @return ownerConnection
  **/
  public Connection getOwnerConnection() {
    return ownerConnection;
  }

  public void setOwnerConnection(Connection ownerConnection) {
    this.ownerConnection = ownerConnection;
  }

  public Trip originalId(Long originalId) {
    this.originalId = originalId;
    return this;
  }

   /**
   * Get originalId
   * @return originalId
  **/
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
    return Objects.equals(id, trip.id) &&
        Objects.equals(active, trip.active) &&
        Objects.equals(valid, trip.valid) &&
        Objects.equals(owner, trip.owner) &&
        Objects.equals(pickupLocation, trip.pickupLocation) &&
        Objects.equals(pickupTime, trip.pickupTime) &&
        Objects.equals(dropOffLocation, trip.dropOffLocation) &&
        Objects.equals(dropOffTime, trip.dropOffTime) &&
        Objects.equals(shipments, trip.shipments) &&
        Objects.equals(recurrence, trip.recurrence) &&
        Objects.equals(timeZone, trip.timeZone) &&
        Objects.equals(route, trip.route) &&
        Objects.equals(preference, trip.preference) &&
        Objects.equals(notifications, trip.notifications) &&
        Objects.equals(matches, trip.matches) &&
        Objects.equals(ownerConnection, trip.ownerConnection) &&
        Objects.equals(originalId, trip.originalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, owner, pickupLocation, pickupTime, dropOffLocation, dropOffTime, shipments, recurrence, timeZone, route, preference, notifications, matches, ownerConnection, originalId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

