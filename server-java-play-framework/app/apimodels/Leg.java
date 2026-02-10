package apimodels;

import apimodels.Account;
import apimodels.Application;
import apimodels.Step;
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
 * Leg
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Leg   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("owner")
  @Valid

  private Account owner;

  @JsonProperty("parentOwner")
  @Valid

  private Account parentOwner;

  @JsonProperty("application")
  @Valid

  private Application application;

  @JsonProperty("deviceId")
  
  private String deviceId;

  @JsonProperty("distance")
  
  private Double distance;

  @JsonProperty("duration")
  
  private Long duration;

  @JsonProperty("startLatitude")
  
  private Double startLatitude;

  @JsonProperty("startLongitude")
  
  private Double startLongitude;

  @JsonProperty("startAltitude")
  
  private Double startAltitude;

  @JsonProperty("startDate")
  @Valid

  private OffsetDateTime startDate;

  @JsonProperty("endLatitude")
  
  private Double endLatitude;

  @JsonProperty("endLongitude")
  
  private Double endLongitude;

  @JsonProperty("endAltitude")
  
  private Double endAltitude;

  @JsonProperty("endDate")
  @Valid

  private OffsetDateTime endDate;

  @JsonProperty("type")
  
  private String type;

  @JsonProperty("retailerLocationId")
  
  private Long retailerLocationId;

  @JsonProperty("floorId")
  
  private String floorId;

  @JsonProperty("steps")
  @Valid

  private List<@Valid Step> steps = null;

  public Leg id(Long id) {
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

  public Leg active(Boolean active) {
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

  public Leg valid(Boolean valid) {
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

  public Leg owner(Account owner) {
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

  public Leg parentOwner(Account parentOwner) {
    this.parentOwner = parentOwner;
    return this;
  }

   /**
   * Get parentOwner
   * @return parentOwner
  **/
  public Account getParentOwner() {
    return parentOwner;
  }

  public void setParentOwner(Account parentOwner) {
    this.parentOwner = parentOwner;
  }

  public Leg application(Application application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }

  public Leg deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public Leg distance(Double distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public Leg duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public Leg startLatitude(Double startLatitude) {
    this.startLatitude = startLatitude;
    return this;
  }

   /**
   * Get startLatitude
   * @return startLatitude
  **/
  public Double getStartLatitude() {
    return startLatitude;
  }

  public void setStartLatitude(Double startLatitude) {
    this.startLatitude = startLatitude;
  }

  public Leg startLongitude(Double startLongitude) {
    this.startLongitude = startLongitude;
    return this;
  }

   /**
   * Get startLongitude
   * @return startLongitude
  **/
  public Double getStartLongitude() {
    return startLongitude;
  }

  public void setStartLongitude(Double startLongitude) {
    this.startLongitude = startLongitude;
  }

  public Leg startAltitude(Double startAltitude) {
    this.startAltitude = startAltitude;
    return this;
  }

   /**
   * Get startAltitude
   * @return startAltitude
  **/
  public Double getStartAltitude() {
    return startAltitude;
  }

  public void setStartAltitude(Double startAltitude) {
    this.startAltitude = startAltitude;
  }

  public Leg startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public Leg endLatitude(Double endLatitude) {
    this.endLatitude = endLatitude;
    return this;
  }

   /**
   * Get endLatitude
   * @return endLatitude
  **/
  public Double getEndLatitude() {
    return endLatitude;
  }

  public void setEndLatitude(Double endLatitude) {
    this.endLatitude = endLatitude;
  }

  public Leg endLongitude(Double endLongitude) {
    this.endLongitude = endLongitude;
    return this;
  }

   /**
   * Get endLongitude
   * @return endLongitude
  **/
  public Double getEndLongitude() {
    return endLongitude;
  }

  public void setEndLongitude(Double endLongitude) {
    this.endLongitude = endLongitude;
  }

  public Leg endAltitude(Double endAltitude) {
    this.endAltitude = endAltitude;
    return this;
  }

   /**
   * Get endAltitude
   * @return endAltitude
  **/
  public Double getEndAltitude() {
    return endAltitude;
  }

  public void setEndAltitude(Double endAltitude) {
    this.endAltitude = endAltitude;
  }

  public Leg endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public Leg type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Leg retailerLocationId(Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
    return this;
  }

   /**
   * Get retailerLocationId
   * @return retailerLocationId
  **/
  public Long getRetailerLocationId() {
    return retailerLocationId;
  }

  public void setRetailerLocationId(Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
  }

  public Leg floorId(String floorId) {
    this.floorId = floorId;
    return this;
  }

   /**
   * Get floorId
   * @return floorId
  **/
  public String getFloorId() {
    return floorId;
  }

  public void setFloorId(String floorId) {
    this.floorId = floorId;
  }

  public Leg steps(List<@Valid Step> steps) {
    this.steps = steps;
    return this;
  }

  public Leg addStepsItem(Step stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  public List<@Valid Step> getSteps() {
    return steps;
  }

  public void setSteps(List<@Valid Step> steps) {
    this.steps = steps;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Leg leg = (Leg) o;
    return Objects.equals(id, leg.id) &&
        Objects.equals(active, leg.active) &&
        Objects.equals(valid, leg.valid) &&
        Objects.equals(owner, leg.owner) &&
        Objects.equals(parentOwner, leg.parentOwner) &&
        Objects.equals(application, leg.application) &&
        Objects.equals(deviceId, leg.deviceId) &&
        Objects.equals(distance, leg.distance) &&
        Objects.equals(duration, leg.duration) &&
        Objects.equals(startLatitude, leg.startLatitude) &&
        Objects.equals(startLongitude, leg.startLongitude) &&
        Objects.equals(startAltitude, leg.startAltitude) &&
        Objects.equals(startDate, leg.startDate) &&
        Objects.equals(endLatitude, leg.endLatitude) &&
        Objects.equals(endLongitude, leg.endLongitude) &&
        Objects.equals(endAltitude, leg.endAltitude) &&
        Objects.equals(endDate, leg.endDate) &&
        Objects.equals(type, leg.type) &&
        Objects.equals(retailerLocationId, leg.retailerLocationId) &&
        Objects.equals(floorId, leg.floorId) &&
        Objects.equals(steps, leg.steps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, owner, parentOwner, application, deviceId, distance, duration, startLatitude, startLongitude, startAltitude, startDate, endLatitude, endLongitude, endAltitude, endDate, type, retailerLocationId, floorId, steps);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Leg {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    parentOwner: ").append(toIndentedString(parentOwner)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    startLatitude: ").append(toIndentedString(startLatitude)).append("\n");
    sb.append("    startLongitude: ").append(toIndentedString(startLongitude)).append("\n");
    sb.append("    startAltitude: ").append(toIndentedString(startAltitude)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endLatitude: ").append(toIndentedString(endLatitude)).append("\n");
    sb.append("    endLongitude: ").append(toIndentedString(endLongitude)).append("\n");
    sb.append("    endAltitude: ").append(toIndentedString(endAltitude)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    retailerLocationId: ").append(toIndentedString(retailerLocationId)).append("\n");
    sb.append("    floorId: ").append(toIndentedString(floorId)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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

