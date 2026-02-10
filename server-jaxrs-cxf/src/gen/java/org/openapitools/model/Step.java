package org.openapitools.model;

import java.util.Date;
import org.openapitools.model.Account;
import org.openapitools.model.Leg;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Step  {
  
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

  private String deviceId;

  @ApiModelProperty(value = "")

  @Valid

  private Leg leg;

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

  public Step id(Long id) {
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

  public Step active(Boolean active) {
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

  public Step valid(Boolean valid) {
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

  public Step owner(Account owner) {
    this.owner = owner;
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

  public Step deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

 /**
   * Get leg
   * @return leg
  **/
  @JsonProperty("leg")
  public Leg getLeg() {
    return leg;
  }

  public void setLeg(Leg leg) {
    this.leg = leg;
  }

  public Step leg(Leg leg) {
    this.leg = leg;
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

  public Step distance(Double distance) {
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

  public Step duration(Long duration) {
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

  public Step startLatitude(Double startLatitude) {
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

  public Step startLongitude(Double startLongitude) {
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

  public Step startAltitude(Double startAltitude) {
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

  public Step startDate(Date startDate) {
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

  public Step endLatitude(Double endLatitude) {
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

  public Step endLongitude(Double endLongitude) {
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

  public Step endAltitude(Double endAltitude) {
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

  public Step endDate(Date endDate) {
    this.endDate = endDate;
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
    Step step = (Step) o;
    return Objects.equals(this.id, step.id) &&
        Objects.equals(this.active, step.active) &&
        Objects.equals(this.valid, step.valid) &&
        Objects.equals(this.owner, step.owner) &&
        Objects.equals(this.deviceId, step.deviceId) &&
        Objects.equals(this.leg, step.leg) &&
        Objects.equals(this.distance, step.distance) &&
        Objects.equals(this.duration, step.duration) &&
        Objects.equals(this.startLatitude, step.startLatitude) &&
        Objects.equals(this.startLongitude, step.startLongitude) &&
        Objects.equals(this.startAltitude, step.startAltitude) &&
        Objects.equals(this.startDate, step.startDate) &&
        Objects.equals(this.endLatitude, step.endLatitude) &&
        Objects.equals(this.endLongitude, step.endLongitude) &&
        Objects.equals(this.endAltitude, step.endAltitude) &&
        Objects.equals(this.endDate, step.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, owner, deviceId, leg, distance, duration, startLatitude, startLongitude, startAltitude, startDate, endLatitude, endLongitude, endAltitude, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Step {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    leg: ").append(toIndentedString(leg)).append("\n");
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

