package apimodels;

import apimodels.StopResponse;
import apimodels.VehicleResponse;
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
 * ItineraryResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ItineraryResponse   {
  @JsonProperty("itineraryId")
  
  private String itineraryId;

  @JsonProperty("waypointCount")
  
  private Long waypointCount;

  @JsonProperty("score")
  
  private Long score;

  @JsonProperty("errorCode")
  
  private String errorCode;

  @JsonProperty("error")
  
  private String error;

  @JsonProperty("itemCount")
  
  private Integer itemCount;

  @JsonProperty("vehicle")
  @Valid

  private VehicleResponse vehicle;

  @JsonProperty("stops")
  @Valid

  private List<@Valid StopResponse> stops = null;

  @JsonProperty("estimatedStartTime")
  
  private Long estimatedStartTime;

  @JsonProperty("estimatedEndTime")
  
  private Long estimatedEndTime;

  @JsonProperty("estimatedDuration")
  
  private Long estimatedDuration;

  @JsonProperty("estimatedDistance")
  
  private Double estimatedDistance;

  @JsonProperty("waitTime")
  
  private Long waitTime;

  @JsonProperty("generated")
  
  private Boolean generated;

  @JsonProperty("valid")
  
  private Boolean valid;

  public ItineraryResponse itineraryId(String itineraryId) {
    this.itineraryId = itineraryId;
    return this;
  }

   /**
   * Get itineraryId
   * @return itineraryId
  **/
  public String getItineraryId() {
    return itineraryId;
  }

  public void setItineraryId(String itineraryId) {
    this.itineraryId = itineraryId;
  }

  public ItineraryResponse waypointCount(Long waypointCount) {
    this.waypointCount = waypointCount;
    return this;
  }

   /**
   * Get waypointCount
   * @return waypointCount
  **/
  public Long getWaypointCount() {
    return waypointCount;
  }

  public void setWaypointCount(Long waypointCount) {
    this.waypointCount = waypointCount;
  }

  public ItineraryResponse score(Long score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  public Long getScore() {
    return score;
  }

  public void setScore(Long score) {
    this.score = score;
  }

  public ItineraryResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ItineraryResponse error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public ItineraryResponse itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

   /**
   * Get itemCount
   * @return itemCount
  **/
  public Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }

  public ItineraryResponse vehicle(VehicleResponse vehicle) {
    this.vehicle = vehicle;
    return this;
  }

   /**
   * Get vehicle
   * @return vehicle
  **/
  public VehicleResponse getVehicle() {
    return vehicle;
  }

  public void setVehicle(VehicleResponse vehicle) {
    this.vehicle = vehicle;
  }

  public ItineraryResponse stops(List<@Valid StopResponse> stops) {
    this.stops = stops;
    return this;
  }

  public ItineraryResponse addStopsItem(StopResponse stopsItem) {
    if (this.stops == null) {
      this.stops = new ArrayList<>();
    }
    this.stops.add(stopsItem);
    return this;
  }

   /**
   * Get stops
   * @return stops
  **/
  public List<@Valid StopResponse> getStops() {
    return stops;
  }

  public void setStops(List<@Valid StopResponse> stops) {
    this.stops = stops;
  }

  public ItineraryResponse estimatedStartTime(Long estimatedStartTime) {
    this.estimatedStartTime = estimatedStartTime;
    return this;
  }

   /**
   * Get estimatedStartTime
   * @return estimatedStartTime
  **/
  public Long getEstimatedStartTime() {
    return estimatedStartTime;
  }

  public void setEstimatedStartTime(Long estimatedStartTime) {
    this.estimatedStartTime = estimatedStartTime;
  }

  public ItineraryResponse estimatedEndTime(Long estimatedEndTime) {
    this.estimatedEndTime = estimatedEndTime;
    return this;
  }

   /**
   * Get estimatedEndTime
   * @return estimatedEndTime
  **/
  public Long getEstimatedEndTime() {
    return estimatedEndTime;
  }

  public void setEstimatedEndTime(Long estimatedEndTime) {
    this.estimatedEndTime = estimatedEndTime;
  }

  public ItineraryResponse estimatedDuration(Long estimatedDuration) {
    this.estimatedDuration = estimatedDuration;
    return this;
  }

   /**
   * Get estimatedDuration
   * @return estimatedDuration
  **/
  public Long getEstimatedDuration() {
    return estimatedDuration;
  }

  public void setEstimatedDuration(Long estimatedDuration) {
    this.estimatedDuration = estimatedDuration;
  }

  public ItineraryResponse estimatedDistance(Double estimatedDistance) {
    this.estimatedDistance = estimatedDistance;
    return this;
  }

   /**
   * Get estimatedDistance
   * @return estimatedDistance
  **/
  public Double getEstimatedDistance() {
    return estimatedDistance;
  }

  public void setEstimatedDistance(Double estimatedDistance) {
    this.estimatedDistance = estimatedDistance;
  }

  public ItineraryResponse waitTime(Long waitTime) {
    this.waitTime = waitTime;
    return this;
  }

   /**
   * Get waitTime
   * @return waitTime
  **/
  public Long getWaitTime() {
    return waitTime;
  }

  public void setWaitTime(Long waitTime) {
    this.waitTime = waitTime;
  }

  public ItineraryResponse generated(Boolean generated) {
    this.generated = generated;
    return this;
  }

   /**
   * Get generated
   * @return generated
  **/
  public Boolean getGenerated() {
    return generated;
  }

  public void setGenerated(Boolean generated) {
    this.generated = generated;
  }

  public ItineraryResponse valid(Boolean valid) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItineraryResponse itineraryResponse = (ItineraryResponse) o;
    return Objects.equals(itineraryId, itineraryResponse.itineraryId) &&
        Objects.equals(waypointCount, itineraryResponse.waypointCount) &&
        Objects.equals(score, itineraryResponse.score) &&
        Objects.equals(errorCode, itineraryResponse.errorCode) &&
        Objects.equals(error, itineraryResponse.error) &&
        Objects.equals(itemCount, itineraryResponse.itemCount) &&
        Objects.equals(vehicle, itineraryResponse.vehicle) &&
        Objects.equals(stops, itineraryResponse.stops) &&
        Objects.equals(estimatedStartTime, itineraryResponse.estimatedStartTime) &&
        Objects.equals(estimatedEndTime, itineraryResponse.estimatedEndTime) &&
        Objects.equals(estimatedDuration, itineraryResponse.estimatedDuration) &&
        Objects.equals(estimatedDistance, itineraryResponse.estimatedDistance) &&
        Objects.equals(waitTime, itineraryResponse.waitTime) &&
        Objects.equals(generated, itineraryResponse.generated) &&
        Objects.equals(valid, itineraryResponse.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itineraryId, waypointCount, score, errorCode, error, itemCount, vehicle, stops, estimatedStartTime, estimatedEndTime, estimatedDuration, estimatedDistance, waitTime, generated, valid);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItineraryResponse {\n");
    
    sb.append("    itineraryId: ").append(toIndentedString(itineraryId)).append("\n");
    sb.append("    waypointCount: ").append(toIndentedString(waypointCount)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    vehicle: ").append(toIndentedString(vehicle)).append("\n");
    sb.append("    stops: ").append(toIndentedString(stops)).append("\n");
    sb.append("    estimatedStartTime: ").append(toIndentedString(estimatedStartTime)).append("\n");
    sb.append("    estimatedEndTime: ").append(toIndentedString(estimatedEndTime)).append("\n");
    sb.append("    estimatedDuration: ").append(toIndentedString(estimatedDuration)).append("\n");
    sb.append("    estimatedDistance: ").append(toIndentedString(estimatedDistance)).append("\n");
    sb.append("    waitTime: ").append(toIndentedString(waitTime)).append("\n");
    sb.append("    generated: ").append(toIndentedString(generated)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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

