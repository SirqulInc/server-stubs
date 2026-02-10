package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.Account;
import org.openapitools.model.Leg;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Step   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Account owner;
  private String deviceId;
  private Leg leg;
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
  @JsonProperty("leg")
  @Valid
  public Leg getLeg() {
    return leg;
  }
  public void setLeg(Leg leg) {
    this.leg = leg;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

