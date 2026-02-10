package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DirectionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DirectionResponse   {
  @JsonProperty("action")
  
  private String action;

  @JsonProperty("bearing")
  
  private Double bearing;

  @JsonProperty("bearingDifference")
  
  private Double bearingDifference;

  @JsonProperty("heading")
  
  private String heading;

  @JsonProperty("distance")
  
  private Double distance;

  @JsonProperty("distanceUnits")
  
  private String distanceUnits;

  @JsonProperty("distanceString")
  
  private String distanceString;

  @JsonProperty("startLatitude")
  
  private Double startLatitude;

  @JsonProperty("startLongitude")
  
  private Double startLongitude;

  @JsonProperty("endLatitude")
  
  private Double endLatitude;

  @JsonProperty("endLongitude")
  
  private Double endLongitude;

  @JsonProperty("instruction")
  
  private String instruction;

  @JsonProperty("progressStatus")
  
  private String progressStatus;

  public DirectionResponse action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public DirectionResponse bearing(Double bearing) {
    this.bearing = bearing;
    return this;
  }

   /**
   * Get bearing
   * @return bearing
  **/
  public Double getBearing() {
    return bearing;
  }

  public void setBearing(Double bearing) {
    this.bearing = bearing;
  }

  public DirectionResponse bearingDifference(Double bearingDifference) {
    this.bearingDifference = bearingDifference;
    return this;
  }

   /**
   * Get bearingDifference
   * @return bearingDifference
  **/
  public Double getBearingDifference() {
    return bearingDifference;
  }

  public void setBearingDifference(Double bearingDifference) {
    this.bearingDifference = bearingDifference;
  }

  public DirectionResponse heading(String heading) {
    this.heading = heading;
    return this;
  }

   /**
   * Get heading
   * @return heading
  **/
  public String getHeading() {
    return heading;
  }

  public void setHeading(String heading) {
    this.heading = heading;
  }

  public DirectionResponse distance(Double distance) {
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

  public DirectionResponse distanceUnits(String distanceUnits) {
    this.distanceUnits = distanceUnits;
    return this;
  }

   /**
   * Get distanceUnits
   * @return distanceUnits
  **/
  public String getDistanceUnits() {
    return distanceUnits;
  }

  public void setDistanceUnits(String distanceUnits) {
    this.distanceUnits = distanceUnits;
  }

  public DirectionResponse distanceString(String distanceString) {
    this.distanceString = distanceString;
    return this;
  }

   /**
   * Get distanceString
   * @return distanceString
  **/
  public String getDistanceString() {
    return distanceString;
  }

  public void setDistanceString(String distanceString) {
    this.distanceString = distanceString;
  }

  public DirectionResponse startLatitude(Double startLatitude) {
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

  public DirectionResponse startLongitude(Double startLongitude) {
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

  public DirectionResponse endLatitude(Double endLatitude) {
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

  public DirectionResponse endLongitude(Double endLongitude) {
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

  public DirectionResponse instruction(String instruction) {
    this.instruction = instruction;
    return this;
  }

   /**
   * Get instruction
   * @return instruction
  **/
  public String getInstruction() {
    return instruction;
  }

  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }

  public DirectionResponse progressStatus(String progressStatus) {
    this.progressStatus = progressStatus;
    return this;
  }

   /**
   * Get progressStatus
   * @return progressStatus
  **/
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
    return Objects.equals(action, directionResponse.action) &&
        Objects.equals(bearing, directionResponse.bearing) &&
        Objects.equals(bearingDifference, directionResponse.bearingDifference) &&
        Objects.equals(heading, directionResponse.heading) &&
        Objects.equals(distance, directionResponse.distance) &&
        Objects.equals(distanceUnits, directionResponse.distanceUnits) &&
        Objects.equals(distanceString, directionResponse.distanceString) &&
        Objects.equals(startLatitude, directionResponse.startLatitude) &&
        Objects.equals(startLongitude, directionResponse.startLongitude) &&
        Objects.equals(endLatitude, directionResponse.endLatitude) &&
        Objects.equals(endLongitude, directionResponse.endLongitude) &&
        Objects.equals(instruction, directionResponse.instruction) &&
        Objects.equals(progressStatus, directionResponse.progressStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, bearing, bearingDifference, heading, distance, distanceUnits, distanceString, startLatitude, startLongitude, endLatitude, endLongitude, instruction, progressStatus);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

