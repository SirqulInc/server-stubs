package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.StopResponse;
import org.openapitools.model.VehicleResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ItineraryResponse   {
  
  private String itineraryId;
  private Long waypointCount;
  private Long score;
  private String errorCode;
  private String error;
  private Integer itemCount;
  private VehicleResponse vehicle;
  private List<@Valid StopResponse> stops = new ArrayList<>();
  private Long estimatedStartTime;
  private Long estimatedEndTime;
  private Long estimatedDuration;
  private Double estimatedDistance;
  private Long waitTime;
  private Boolean generated;
  private Boolean valid;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("itineraryId")
  public String getItineraryId() {
    return itineraryId;
  }
  public void setItineraryId(String itineraryId) {
    this.itineraryId = itineraryId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("waypointCount")
  public Long getWaypointCount() {
    return waypointCount;
  }
  public void setWaypointCount(Long waypointCount) {
    this.waypointCount = waypointCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("score")
  public Long getScore() {
    return score;
  }
  public void setScore(Long score) {
    this.score = score;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("error")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("itemCount")
  public Integer getItemCount() {
    return itemCount;
  }
  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("vehicle")
  @Valid
  public VehicleResponse getVehicle() {
    return vehicle;
  }
  public void setVehicle(VehicleResponse vehicle) {
    this.vehicle = vehicle;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stops")
  @Valid
  public List<@Valid StopResponse> getStops() {
    return stops;
  }
  public void setStops(List<@Valid StopResponse> stops) {
    this.stops = stops;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("estimatedStartTime")
  public Long getEstimatedStartTime() {
    return estimatedStartTime;
  }
  public void setEstimatedStartTime(Long estimatedStartTime) {
    this.estimatedStartTime = estimatedStartTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("estimatedEndTime")
  public Long getEstimatedEndTime() {
    return estimatedEndTime;
  }
  public void setEstimatedEndTime(Long estimatedEndTime) {
    this.estimatedEndTime = estimatedEndTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("estimatedDuration")
  public Long getEstimatedDuration() {
    return estimatedDuration;
  }
  public void setEstimatedDuration(Long estimatedDuration) {
    this.estimatedDuration = estimatedDuration;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("estimatedDistance")
  public Double getEstimatedDistance() {
    return estimatedDistance;
  }
  public void setEstimatedDistance(Double estimatedDistance) {
    this.estimatedDistance = estimatedDistance;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("waitTime")
  public Long getWaitTime() {
    return waitTime;
  }
  public void setWaitTime(Long waitTime) {
    this.waitTime = waitTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("generated")
  public Boolean getGenerated() {
    return generated;
  }
  public void setGenerated(Boolean generated) {
    this.generated = generated;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

