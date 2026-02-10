package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class DirectionResponse   {
  
  private String action;
  private Double bearing;
  private Double bearingDifference;
  private String heading;
  private Double distance;
  private String distanceUnits;
  private String distanceString;
  private Double startLatitude;
  private Double startLongitude;
  private Double endLatitude;
  private Double endLongitude;
  private String instruction;
  private String progressStatus;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("action")
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bearing")
  public Double getBearing() {
    return bearing;
  }
  public void setBearing(Double bearing) {
    this.bearing = bearing;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bearingDifference")
  public Double getBearingDifference() {
    return bearingDifference;
  }
  public void setBearingDifference(Double bearingDifference) {
    this.bearingDifference = bearingDifference;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("heading")
  public String getHeading() {
    return heading;
  }
  public void setHeading(String heading) {
    this.heading = heading;
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
  @JsonProperty("distanceUnits")
  public String getDistanceUnits() {
    return distanceUnits;
  }
  public void setDistanceUnits(String distanceUnits) {
    this.distanceUnits = distanceUnits;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("distanceString")
  public String getDistanceString() {
    return distanceString;
  }
  public void setDistanceString(String distanceString) {
    this.distanceString = distanceString;
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
  @JsonProperty("instruction")
  public String getInstruction() {
    return instruction;
  }
  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("progressStatus")
  public String getProgressStatus() {
    return progressStatus;
  }
  public void setProgressStatus(String progressStatus) {
    this.progressStatus = progressStatus;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

