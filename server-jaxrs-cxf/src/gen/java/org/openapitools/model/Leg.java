package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Application;
import org.openapitools.model.Step;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Leg  {
  
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

  private Account parentOwner;

  @ApiModelProperty(value = "")

  @Valid

  private Application application;

  @ApiModelProperty(value = "")

  private String deviceId;

  @ApiModelProperty(value = "")

  private Double distance;

  @ApiModelProperty(value = "")

  private Long duration;

  @ApiModelProperty(value = "")

  private Double startLatitude;

  @ApiModelProperty(value = "")

  private Double startLongitude;

  @ApiModelProperty(value = "")

  private Double startAltitude;

  @ApiModelProperty(value = "")

  private Date startDate;

  @ApiModelProperty(value = "")

  private Double endLatitude;

  @ApiModelProperty(value = "")

  private Double endLongitude;

  @ApiModelProperty(value = "")

  private Double endAltitude;

  @ApiModelProperty(value = "")

  private Date endDate;

  @ApiModelProperty(value = "")

  private String type;

  @ApiModelProperty(value = "")

  private Long retailerLocationId;

  @ApiModelProperty(value = "")

  private String floorId;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Step> steps = new ArrayList<>();
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

  public Leg id(Long id) {
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

  public Leg active(Boolean active) {
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

  public Leg valid(Boolean valid) {
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

  public Leg owner(Account owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get parentOwner
   * @return parentOwner
  **/
  @JsonProperty("parentOwner")
  public Account getParentOwner() {
    return parentOwner;
  }

  public void setParentOwner(Account parentOwner) {
    this.parentOwner = parentOwner;
  }

  public Leg parentOwner(Account parentOwner) {
    this.parentOwner = parentOwner;
    return this;
  }

 /**
   * Get application
   * @return application
  **/
  @JsonProperty("application")
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }

  public Leg application(Application application) {
    this.application = application;
    return this;
  }

 /**
   * Get deviceId
   * @return deviceId
  **/
  @JsonProperty("deviceId")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public Leg deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

 /**
   * Get distance
   * @return distance
  **/
  @JsonProperty("distance")
  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public Leg distance(Double distance) {
    this.distance = distance;
    return this;
  }

 /**
   * Get duration
   * @return duration
  **/
  @JsonProperty("duration")
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public Leg duration(Long duration) {
    this.duration = duration;
    return this;
  }

 /**
   * Get startLatitude
   * @return startLatitude
  **/
  @JsonProperty("startLatitude")
  public Double getStartLatitude() {
    return startLatitude;
  }

  public void setStartLatitude(Double startLatitude) {
    this.startLatitude = startLatitude;
  }

  public Leg startLatitude(Double startLatitude) {
    this.startLatitude = startLatitude;
    return this;
  }

 /**
   * Get startLongitude
   * @return startLongitude
  **/
  @JsonProperty("startLongitude")
  public Double getStartLongitude() {
    return startLongitude;
  }

  public void setStartLongitude(Double startLongitude) {
    this.startLongitude = startLongitude;
  }

  public Leg startLongitude(Double startLongitude) {
    this.startLongitude = startLongitude;
    return this;
  }

 /**
   * Get startAltitude
   * @return startAltitude
  **/
  @JsonProperty("startAltitude")
  public Double getStartAltitude() {
    return startAltitude;
  }

  public void setStartAltitude(Double startAltitude) {
    this.startAltitude = startAltitude;
  }

  public Leg startAltitude(Double startAltitude) {
    this.startAltitude = startAltitude;
    return this;
  }

 /**
   * Get startDate
   * @return startDate
  **/
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Leg startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * Get endLatitude
   * @return endLatitude
  **/
  @JsonProperty("endLatitude")
  public Double getEndLatitude() {
    return endLatitude;
  }

  public void setEndLatitude(Double endLatitude) {
    this.endLatitude = endLatitude;
  }

  public Leg endLatitude(Double endLatitude) {
    this.endLatitude = endLatitude;
    return this;
  }

 /**
   * Get endLongitude
   * @return endLongitude
  **/
  @JsonProperty("endLongitude")
  public Double getEndLongitude() {
    return endLongitude;
  }

  public void setEndLongitude(Double endLongitude) {
    this.endLongitude = endLongitude;
  }

  public Leg endLongitude(Double endLongitude) {
    this.endLongitude = endLongitude;
    return this;
  }

 /**
   * Get endAltitude
   * @return endAltitude
  **/
  @JsonProperty("endAltitude")
  public Double getEndAltitude() {
    return endAltitude;
  }

  public void setEndAltitude(Double endAltitude) {
    this.endAltitude = endAltitude;
  }

  public Leg endAltitude(Double endAltitude) {
    this.endAltitude = endAltitude;
    return this;
  }

 /**
   * Get endDate
   * @return endDate
  **/
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public Leg endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Leg type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get retailerLocationId
   * @return retailerLocationId
  **/
  @JsonProperty("retailerLocationId")
  public Long getRetailerLocationId() {
    return retailerLocationId;
  }

  public void setRetailerLocationId(Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
  }

  public Leg retailerLocationId(Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
    return this;
  }

 /**
   * Get floorId
   * @return floorId
  **/
  @JsonProperty("floorId")
  public String getFloorId() {
    return floorId;
  }

  public void setFloorId(String floorId) {
    this.floorId = floorId;
  }

  public Leg floorId(String floorId) {
    this.floorId = floorId;
    return this;
  }

 /**
   * Get steps
   * @return steps
  **/
  @JsonProperty("steps")
  public List<@Valid Step> getSteps() {
    return steps;
  }

  public void setSteps(List<@Valid Step> steps) {
    this.steps = steps;
  }

  public Leg steps(List<@Valid Step> steps) {
    this.steps = steps;
    return this;
  }

  public Leg addStepsItem(Step stepsItem) {
    this.steps.add(stepsItem);
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
    Leg leg = (Leg) o;
    return Objects.equals(this.id, leg.id) &&
        Objects.equals(this.active, leg.active) &&
        Objects.equals(this.valid, leg.valid) &&
        Objects.equals(this.owner, leg.owner) &&
        Objects.equals(this.parentOwner, leg.parentOwner) &&
        Objects.equals(this.application, leg.application) &&
        Objects.equals(this.deviceId, leg.deviceId) &&
        Objects.equals(this.distance, leg.distance) &&
        Objects.equals(this.duration, leg.duration) &&
        Objects.equals(this.startLatitude, leg.startLatitude) &&
        Objects.equals(this.startLongitude, leg.startLongitude) &&
        Objects.equals(this.startAltitude, leg.startAltitude) &&
        Objects.equals(this.startDate, leg.startDate) &&
        Objects.equals(this.endLatitude, leg.endLatitude) &&
        Objects.equals(this.endLongitude, leg.endLongitude) &&
        Objects.equals(this.endAltitude, leg.endAltitude) &&
        Objects.equals(this.endDate, leg.endDate) &&
        Objects.equals(this.type, leg.type) &&
        Objects.equals(this.retailerLocationId, leg.retailerLocationId) &&
        Objects.equals(this.floorId, leg.floorId) &&
        Objects.equals(this.steps, leg.steps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, owner, parentOwner, application, deviceId, distance, duration, startLatitude, startLongitude, startAltitude, startDate, endLatitude, endLongitude, endAltitude, endDate, type, retailerLocationId, floorId, steps);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

