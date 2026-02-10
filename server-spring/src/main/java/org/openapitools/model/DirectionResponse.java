package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DirectionResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class DirectionResponse {

  private @Nullable String action;

  private @Nullable Double bearing;

  private @Nullable Double bearingDifference;

  private @Nullable String heading;

  private @Nullable Double distance;

  private @Nullable String distanceUnits;

  private @Nullable String distanceString;

  private @Nullable Double startLatitude;

  private @Nullable Double startLongitude;

  private @Nullable Double endLatitude;

  private @Nullable Double endLongitude;

  private @Nullable String instruction;

  private @Nullable String progressStatus;

  public DirectionResponse action(@Nullable String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   */
  
  @Schema(name = "action", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("action")
  public @Nullable String getAction() {
    return action;
  }

  public void setAction(@Nullable String action) {
    this.action = action;
  }

  public DirectionResponse bearing(@Nullable Double bearing) {
    this.bearing = bearing;
    return this;
  }

  /**
   * Get bearing
   * @return bearing
   */
  
  @Schema(name = "bearing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bearing")
  public @Nullable Double getBearing() {
    return bearing;
  }

  public void setBearing(@Nullable Double bearing) {
    this.bearing = bearing;
  }

  public DirectionResponse bearingDifference(@Nullable Double bearingDifference) {
    this.bearingDifference = bearingDifference;
    return this;
  }

  /**
   * Get bearingDifference
   * @return bearingDifference
   */
  
  @Schema(name = "bearingDifference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bearingDifference")
  public @Nullable Double getBearingDifference() {
    return bearingDifference;
  }

  public void setBearingDifference(@Nullable Double bearingDifference) {
    this.bearingDifference = bearingDifference;
  }

  public DirectionResponse heading(@Nullable String heading) {
    this.heading = heading;
    return this;
  }

  /**
   * Get heading
   * @return heading
   */
  
  @Schema(name = "heading", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("heading")
  public @Nullable String getHeading() {
    return heading;
  }

  public void setHeading(@Nullable String heading) {
    this.heading = heading;
  }

  public DirectionResponse distance(@Nullable Double distance) {
    this.distance = distance;
    return this;
  }

  /**
   * Get distance
   * @return distance
   */
  
  @Schema(name = "distance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("distance")
  public @Nullable Double getDistance() {
    return distance;
  }

  public void setDistance(@Nullable Double distance) {
    this.distance = distance;
  }

  public DirectionResponse distanceUnits(@Nullable String distanceUnits) {
    this.distanceUnits = distanceUnits;
    return this;
  }

  /**
   * Get distanceUnits
   * @return distanceUnits
   */
  
  @Schema(name = "distanceUnits", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("distanceUnits")
  public @Nullable String getDistanceUnits() {
    return distanceUnits;
  }

  public void setDistanceUnits(@Nullable String distanceUnits) {
    this.distanceUnits = distanceUnits;
  }

  public DirectionResponse distanceString(@Nullable String distanceString) {
    this.distanceString = distanceString;
    return this;
  }

  /**
   * Get distanceString
   * @return distanceString
   */
  
  @Schema(name = "distanceString", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("distanceString")
  public @Nullable String getDistanceString() {
    return distanceString;
  }

  public void setDistanceString(@Nullable String distanceString) {
    this.distanceString = distanceString;
  }

  public DirectionResponse startLatitude(@Nullable Double startLatitude) {
    this.startLatitude = startLatitude;
    return this;
  }

  /**
   * Get startLatitude
   * @return startLatitude
   */
  
  @Schema(name = "startLatitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startLatitude")
  public @Nullable Double getStartLatitude() {
    return startLatitude;
  }

  public void setStartLatitude(@Nullable Double startLatitude) {
    this.startLatitude = startLatitude;
  }

  public DirectionResponse startLongitude(@Nullable Double startLongitude) {
    this.startLongitude = startLongitude;
    return this;
  }

  /**
   * Get startLongitude
   * @return startLongitude
   */
  
  @Schema(name = "startLongitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startLongitude")
  public @Nullable Double getStartLongitude() {
    return startLongitude;
  }

  public void setStartLongitude(@Nullable Double startLongitude) {
    this.startLongitude = startLongitude;
  }

  public DirectionResponse endLatitude(@Nullable Double endLatitude) {
    this.endLatitude = endLatitude;
    return this;
  }

  /**
   * Get endLatitude
   * @return endLatitude
   */
  
  @Schema(name = "endLatitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endLatitude")
  public @Nullable Double getEndLatitude() {
    return endLatitude;
  }

  public void setEndLatitude(@Nullable Double endLatitude) {
    this.endLatitude = endLatitude;
  }

  public DirectionResponse endLongitude(@Nullable Double endLongitude) {
    this.endLongitude = endLongitude;
    return this;
  }

  /**
   * Get endLongitude
   * @return endLongitude
   */
  
  @Schema(name = "endLongitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endLongitude")
  public @Nullable Double getEndLongitude() {
    return endLongitude;
  }

  public void setEndLongitude(@Nullable Double endLongitude) {
    this.endLongitude = endLongitude;
  }

  public DirectionResponse instruction(@Nullable String instruction) {
    this.instruction = instruction;
    return this;
  }

  /**
   * Get instruction
   * @return instruction
   */
  
  @Schema(name = "instruction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instruction")
  public @Nullable String getInstruction() {
    return instruction;
  }

  public void setInstruction(@Nullable String instruction) {
    this.instruction = instruction;
  }

  public DirectionResponse progressStatus(@Nullable String progressStatus) {
    this.progressStatus = progressStatus;
    return this;
  }

  /**
   * Get progressStatus
   * @return progressStatus
   */
  
  @Schema(name = "progressStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("progressStatus")
  public @Nullable String getProgressStatus() {
    return progressStatus;
  }

  public void setProgressStatus(@Nullable String progressStatus) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

