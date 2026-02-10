package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DirectionResponse  {
  
  @ApiModelProperty(value = "")

  private String action;

  @ApiModelProperty(value = "")

  private Double bearing;

  @ApiModelProperty(value = "")

  private Double bearingDifference;

  @ApiModelProperty(value = "")

  private String heading;

  @ApiModelProperty(value = "")

  private Double distance;

  @ApiModelProperty(value = "")

  private String distanceUnits;

  @ApiModelProperty(value = "")

  private String distanceString;

  @ApiModelProperty(value = "")

  private Double startLatitude;

  @ApiModelProperty(value = "")

  private Double startLongitude;

  @ApiModelProperty(value = "")

  private Double endLatitude;

  @ApiModelProperty(value = "")

  private Double endLongitude;

  @ApiModelProperty(value = "")

  private String instruction;

  @ApiModelProperty(value = "")

  private String progressStatus;
 /**
   * Get action
   * @return action
  **/
  @JsonProperty("action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public DirectionResponse action(String action) {
    this.action = action;
    return this;
  }

 /**
   * Get bearing
   * @return bearing
  **/
  @JsonProperty("bearing")
  public Double getBearing() {
    return bearing;
  }

  public void setBearing(Double bearing) {
    this.bearing = bearing;
  }

  public DirectionResponse bearing(Double bearing) {
    this.bearing = bearing;
    return this;
  }

 /**
   * Get bearingDifference
   * @return bearingDifference
  **/
  @JsonProperty("bearingDifference")
  public Double getBearingDifference() {
    return bearingDifference;
  }

  public void setBearingDifference(Double bearingDifference) {
    this.bearingDifference = bearingDifference;
  }

  public DirectionResponse bearingDifference(Double bearingDifference) {
    this.bearingDifference = bearingDifference;
    return this;
  }

 /**
   * Get heading
   * @return heading
  **/
  @JsonProperty("heading")
  public String getHeading() {
    return heading;
  }

  public void setHeading(String heading) {
    this.heading = heading;
  }

  public DirectionResponse heading(String heading) {
    this.heading = heading;
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

  public DirectionResponse distance(Double distance) {
    this.distance = distance;
    return this;
  }

 /**
   * Get distanceUnits
   * @return distanceUnits
  **/
  @JsonProperty("distanceUnits")
  public String getDistanceUnits() {
    return distanceUnits;
  }

  public void setDistanceUnits(String distanceUnits) {
    this.distanceUnits = distanceUnits;
  }

  public DirectionResponse distanceUnits(String distanceUnits) {
    this.distanceUnits = distanceUnits;
    return this;
  }

 /**
   * Get distanceString
   * @return distanceString
  **/
  @JsonProperty("distanceString")
  public String getDistanceString() {
    return distanceString;
  }

  public void setDistanceString(String distanceString) {
    this.distanceString = distanceString;
  }

  public DirectionResponse distanceString(String distanceString) {
    this.distanceString = distanceString;
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

  public DirectionResponse startLatitude(Double startLatitude) {
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

  public DirectionResponse startLongitude(Double startLongitude) {
    this.startLongitude = startLongitude;
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

  public DirectionResponse endLatitude(Double endLatitude) {
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

  public DirectionResponse endLongitude(Double endLongitude) {
    this.endLongitude = endLongitude;
    return this;
  }

 /**
   * Get instruction
   * @return instruction
  **/
  @JsonProperty("instruction")
  public String getInstruction() {
    return instruction;
  }

  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }

  public DirectionResponse instruction(String instruction) {
    this.instruction = instruction;
    return this;
  }

 /**
   * Get progressStatus
   * @return progressStatus
  **/
  @JsonProperty("progressStatus")
  public String getProgressStatus() {
    return progressStatus;
  }

  public void setProgressStatus(String progressStatus) {
    this.progressStatus = progressStatus;
  }

  public DirectionResponse progressStatus(String progressStatus) {
    this.progressStatus = progressStatus;
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
    DirectionResponse directionResponse = (DirectionResponse) o;
    return Objects.equals(this.action, directionResponse.action) &&
        Objects.equals(this.bearing, directionResponse.bearing) &&
        Objects.equals(this.bearingDifference, directionResponse.bearingDifference) &&
        Objects.equals(this.heading, directionResponse.heading) &&
        Objects.equals(this.distance, directionResponse.distance) &&
        Objects.equals(this.distanceUnits, directionResponse.distanceUnits) &&
        Objects.equals(this.distanceString, directionResponse.distanceString) &&
        Objects.equals(this.startLatitude, directionResponse.startLatitude) &&
        Objects.equals(this.startLongitude, directionResponse.startLongitude) &&
        Objects.equals(this.endLatitude, directionResponse.endLatitude) &&
        Objects.equals(this.endLongitude, directionResponse.endLongitude) &&
        Objects.equals(this.instruction, directionResponse.instruction) &&
        Objects.equals(this.progressStatus, directionResponse.progressStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, bearing, bearingDifference, heading, distance, distanceUnits, distanceString, startLatitude, startLongitude, endLatitude, endLongitude, instruction, progressStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectionResponse {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    bearing: ").append(toIndentedString(bearing)).append("\n");
    sb.append("    bearingDifference: ").append(toIndentedString(bearingDifference)).append("\n");
    sb.append("    heading: ").append(toIndentedString(heading)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    distanceUnits: ").append(toIndentedString(distanceUnits)).append("\n");
    sb.append("    distanceString: ").append(toIndentedString(distanceString)).append("\n");
    sb.append("    startLatitude: ").append(toIndentedString(startLatitude)).append("\n");
    sb.append("    startLongitude: ").append(toIndentedString(startLongitude)).append("\n");
    sb.append("    endLatitude: ").append(toIndentedString(endLatitude)).append("\n");
    sb.append("    endLongitude: ").append(toIndentedString(endLongitude)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("    progressStatus: ").append(toIndentedString(progressStatus)).append("\n");
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

