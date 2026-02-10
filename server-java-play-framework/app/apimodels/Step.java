package apimodels;

import apimodels.Account;
import apimodels.Leg;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Step
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Step   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("owner")
  @Valid

  private Account owner;

  @JsonProperty("deviceId")
  
  private String deviceId;

  @JsonProperty("leg")
  @Valid

  private Leg leg;

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

  public Step id(Long id) {
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

  public Step active(Boolean active) {
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

  public Step valid(Boolean valid) {
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

  public Step owner(Account owner) {
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

  public Step deviceId(String deviceId) {
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

  public Step leg(Leg leg) {
    this.leg = leg;
    return this;
  }

   /**
   * Get leg
   * @return leg
  **/
  public Leg getLeg() {
    return leg;
  }

  public void setLeg(Leg leg) {
    this.leg = leg;
  }

  public Step distance(Double distance) {
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

  public Step duration(Long duration) {
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

  public Step startLatitude(Double startLatitude) {
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

  public Step startLongitude(Double startLongitude) {
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

  public Step startAltitude(Double startAltitude) {
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

  public Step startDate(OffsetDateTime startDate) {
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

  public Step endLatitude(Double endLatitude) {
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

  public Step endLongitude(Double endLongitude) {
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

  public Step endAltitude(Double endAltitude) {
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

  public Step endDate(OffsetDateTime endDate) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Step step = (Step) o;
    return Objects.equals(id, step.id) &&
        Objects.equals(active, step.active) &&
        Objects.equals(valid, step.valid) &&
        Objects.equals(owner, step.owner) &&
        Objects.equals(deviceId, step.deviceId) &&
        Objects.equals(leg, step.leg) &&
        Objects.equals(distance, step.distance) &&
        Objects.equals(duration, step.duration) &&
        Objects.equals(startLatitude, step.startLatitude) &&
        Objects.equals(startLongitude, step.startLongitude) &&
        Objects.equals(startAltitude, step.startAltitude) &&
        Objects.equals(startDate, step.startDate) &&
        Objects.equals(endLatitude, step.endLatitude) &&
        Objects.equals(endLongitude, step.endLongitude) &&
        Objects.equals(endAltitude, step.endAltitude) &&
        Objects.equals(endDate, step.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, owner, deviceId, leg, distance, duration, startLatitude, startLongitude, startAltitude, startDate, endLatitude, endLongitude, endAltitude, endDate);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

