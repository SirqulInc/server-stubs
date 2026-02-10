package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.StopResponse;
import org.openapitools.model.VehicleResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ItineraryResponse  {
  
  @ApiModelProperty(value = "")

  private String itineraryId;

  @ApiModelProperty(value = "")

  private Long waypointCount;

  @ApiModelProperty(value = "")

  private Long score;

  @ApiModelProperty(value = "")

  private String errorCode;

  @ApiModelProperty(value = "")

  private String error;

  @ApiModelProperty(value = "")

  private Integer itemCount;

  @ApiModelProperty(value = "")

  @Valid

  private VehicleResponse vehicle;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid StopResponse> stops = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long estimatedStartTime;

  @ApiModelProperty(value = "")

  private Long estimatedEndTime;

  @ApiModelProperty(value = "")

  private Long estimatedDuration;

  @ApiModelProperty(value = "")

  private Double estimatedDistance;

  @ApiModelProperty(value = "")

  private Long waitTime;

  @ApiModelProperty(value = "")

  private Boolean generated;

  @ApiModelProperty(value = "")

  private Boolean valid;
 /**
   * Get itineraryId
   * @return itineraryId
  **/
  @JsonProperty("itineraryId")
  public String getItineraryId() {
    return itineraryId;
  }

  public void setItineraryId(String itineraryId) {
    this.itineraryId = itineraryId;
  }

  public ItineraryResponse itineraryId(String itineraryId) {
    this.itineraryId = itineraryId;
    return this;
  }

 /**
   * Get waypointCount
   * @return waypointCount
  **/
  @JsonProperty("waypointCount")
  public Long getWaypointCount() {
    return waypointCount;
  }

  public void setWaypointCount(Long waypointCount) {
    this.waypointCount = waypointCount;
  }

  public ItineraryResponse waypointCount(Long waypointCount) {
    this.waypointCount = waypointCount;
    return this;
  }

 /**
   * Get score
   * @return score
  **/
  @JsonProperty("score")
  public Long getScore() {
    return score;
  }

  public void setScore(Long score) {
    this.score = score;
  }

  public ItineraryResponse score(Long score) {
    this.score = score;
    return this;
  }

 /**
   * Get errorCode
   * @return errorCode
  **/
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ItineraryResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

 /**
   * Get error
   * @return error
  **/
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public ItineraryResponse error(String error) {
    this.error = error;
    return this;
  }

 /**
   * Get itemCount
   * @return itemCount
  **/
  @JsonProperty("itemCount")
  public Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }

  public ItineraryResponse itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

 /**
   * Get vehicle
   * @return vehicle
  **/
  @JsonProperty("vehicle")
  public VehicleResponse getVehicle() {
    return vehicle;
  }

  public void setVehicle(VehicleResponse vehicle) {
    this.vehicle = vehicle;
  }

  public ItineraryResponse vehicle(VehicleResponse vehicle) {
    this.vehicle = vehicle;
    return this;
  }

 /**
   * Get stops
   * @return stops
  **/
  @JsonProperty("stops")
  public List<@Valid StopResponse> getStops() {
    return stops;
  }

  public void setStops(List<@Valid StopResponse> stops) {
    this.stops = stops;
  }

  public ItineraryResponse stops(List<@Valid StopResponse> stops) {
    this.stops = stops;
    return this;
  }

  public ItineraryResponse addStopsItem(StopResponse stopsItem) {
    this.stops.add(stopsItem);
    return this;
  }

 /**
   * Get estimatedStartTime
   * @return estimatedStartTime
  **/
  @JsonProperty("estimatedStartTime")
  public Long getEstimatedStartTime() {
    return estimatedStartTime;
  }

  public void setEstimatedStartTime(Long estimatedStartTime) {
    this.estimatedStartTime = estimatedStartTime;
  }

  public ItineraryResponse estimatedStartTime(Long estimatedStartTime) {
    this.estimatedStartTime = estimatedStartTime;
    return this;
  }

 /**
   * Get estimatedEndTime
   * @return estimatedEndTime
  **/
  @JsonProperty("estimatedEndTime")
  public Long getEstimatedEndTime() {
    return estimatedEndTime;
  }

  public void setEstimatedEndTime(Long estimatedEndTime) {
    this.estimatedEndTime = estimatedEndTime;
  }

  public ItineraryResponse estimatedEndTime(Long estimatedEndTime) {
    this.estimatedEndTime = estimatedEndTime;
    return this;
  }

 /**
   * Get estimatedDuration
   * @return estimatedDuration
  **/
  @JsonProperty("estimatedDuration")
  public Long getEstimatedDuration() {
    return estimatedDuration;
  }

  public void setEstimatedDuration(Long estimatedDuration) {
    this.estimatedDuration = estimatedDuration;
  }

  public ItineraryResponse estimatedDuration(Long estimatedDuration) {
    this.estimatedDuration = estimatedDuration;
    return this;
  }

 /**
   * Get estimatedDistance
   * @return estimatedDistance
  **/
  @JsonProperty("estimatedDistance")
  public Double getEstimatedDistance() {
    return estimatedDistance;
  }

  public void setEstimatedDistance(Double estimatedDistance) {
    this.estimatedDistance = estimatedDistance;
  }

  public ItineraryResponse estimatedDistance(Double estimatedDistance) {
    this.estimatedDistance = estimatedDistance;
    return this;
  }

 /**
   * Get waitTime
   * @return waitTime
  **/
  @JsonProperty("waitTime")
  public Long getWaitTime() {
    return waitTime;
  }

  public void setWaitTime(Long waitTime) {
    this.waitTime = waitTime;
  }

  public ItineraryResponse waitTime(Long waitTime) {
    this.waitTime = waitTime;
    return this;
  }

 /**
   * Get generated
   * @return generated
  **/
  @JsonProperty("generated")
  public Boolean getGenerated() {
    return generated;
  }

  public void setGenerated(Boolean generated) {
    this.generated = generated;
  }

  public ItineraryResponse generated(Boolean generated) {
    this.generated = generated;
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

  public ItineraryResponse valid(Boolean valid) {
    this.valid = valid;
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
    ItineraryResponse itineraryResponse = (ItineraryResponse) o;
    return Objects.equals(this.itineraryId, itineraryResponse.itineraryId) &&
        Objects.equals(this.waypointCount, itineraryResponse.waypointCount) &&
        Objects.equals(this.score, itineraryResponse.score) &&
        Objects.equals(this.errorCode, itineraryResponse.errorCode) &&
        Objects.equals(this.error, itineraryResponse.error) &&
        Objects.equals(this.itemCount, itineraryResponse.itemCount) &&
        Objects.equals(this.vehicle, itineraryResponse.vehicle) &&
        Objects.equals(this.stops, itineraryResponse.stops) &&
        Objects.equals(this.estimatedStartTime, itineraryResponse.estimatedStartTime) &&
        Objects.equals(this.estimatedEndTime, itineraryResponse.estimatedEndTime) &&
        Objects.equals(this.estimatedDuration, itineraryResponse.estimatedDuration) &&
        Objects.equals(this.estimatedDistance, itineraryResponse.estimatedDistance) &&
        Objects.equals(this.waitTime, itineraryResponse.waitTime) &&
        Objects.equals(this.generated, itineraryResponse.generated) &&
        Objects.equals(this.valid, itineraryResponse.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itineraryId, waypointCount, score, errorCode, error, itemCount, vehicle, stops, estimatedStartTime, estimatedEndTime, estimatedDuration, estimatedDistance, waitTime, generated, valid);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

