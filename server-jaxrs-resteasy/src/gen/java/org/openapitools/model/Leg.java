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
import org.openapitools.model.Application;
import org.openapitools.model.Step;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Leg   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Account owner;
  private Account parentOwner;
  private Application application;
  private String deviceId;
  private Double distance;
  private Long duration;
  private Double startLatitude;
  private Double startLongitude;
  private Double startAltitude;
  private Date startDate;
  private Double endLatitude;
  private Double endLongitude;
  private Double endAltitude;
  private Date endDate;
  private String type;
  private Long retailerLocationId;
  private String floorId;
  private List<@Valid Step> steps = new ArrayList<>();

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
  @JsonProperty("parentOwner")
  @Valid
  public Account getParentOwner() {
    return parentOwner;
  }
  public void setParentOwner(Account parentOwner) {
    this.parentOwner = parentOwner;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("application")
  @Valid
  public Application getApplication() {
    return application;
  }
  public void setApplication(Application application) {
    this.application = application;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deviceId")
  public String getDeviceId() {
    return deviceId;
  }
  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("distance")
  public Double getDistance() {
    return distance;
  }
  public void setDistance(Double distance) {
    this.distance = distance;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("duration")
  public Long getDuration() {
    return duration;
  }
  public void setDuration(Long duration) {
    this.duration = duration;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startLatitude")
  public Double getStartLatitude() {
    return startLatitude;
  }
  public void setStartLatitude(Double startLatitude) {
    this.startLatitude = startLatitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startLongitude")
  public Double getStartLongitude() {
    return startLongitude;
  }
  public void setStartLongitude(Double startLongitude) {
    this.startLongitude = startLongitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startAltitude")
  public Double getStartAltitude() {
    return startAltitude;
  }
  public void setStartAltitude(Double startAltitude) {
    this.startAltitude = startAltitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endLatitude")
  public Double getEndLatitude() {
    return endLatitude;
  }
  public void setEndLatitude(Double endLatitude) {
    this.endLatitude = endLatitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endLongitude")
  public Double getEndLongitude() {
    return endLongitude;
  }
  public void setEndLongitude(Double endLongitude) {
    this.endLongitude = endLongitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endAltitude")
  public Double getEndAltitude() {
    return endAltitude;
  }
  public void setEndAltitude(Double endAltitude) {
    this.endAltitude = endAltitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("retailerLocationId")
  public Long getRetailerLocationId() {
    return retailerLocationId;
  }
  public void setRetailerLocationId(Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("floorId")
  public String getFloorId() {
    return floorId;
  }
  public void setFloorId(String floorId) {
    this.floorId = floorId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("steps")
  @Valid
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

