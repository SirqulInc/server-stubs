package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DirectionResponse;
import org.openapitools.model.NodeRequest;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PathingResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PathingResponse {

  private @Nullable NodeRequest start;

  private @Nullable NodeRequest end;

  @Valid
  private List<@Valid NodeRequest> waypoints = new ArrayList<>();

  @Valid
  private List<@Valid NodeRequest> exclusions = new ArrayList<>();

  private @Nullable Integer width;

  private @Nullable Integer height;

  private @Nullable NodeRequest southwest;

  private @Nullable NodeRequest northeast;

  private @Nullable Double metersPerX;

  private @Nullable Double metersPerY;

  @Valid
  private List<@Valid NodeRequest> path = new ArrayList<>();

  private @Nullable Integer pathCount;

  @Valid
  private List<@Valid DirectionResponse> directions = new ArrayList<>();

  private @Nullable Integer directionCount;

  private @Nullable NodeRequest swcalibration;

  private @Nullable Double calibrationBearings;

  private @Nullable NodeRequest necalibration;

  public PathingResponse start(@Nullable NodeRequest start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
   */
  @Valid 
  @Schema(name = "start", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start")
  public @Nullable NodeRequest getStart() {
    return start;
  }

  public void setStart(@Nullable NodeRequest start) {
    this.start = start;
  }

  public PathingResponse end(@Nullable NodeRequest end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
   */
  @Valid 
  @Schema(name = "end", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end")
  public @Nullable NodeRequest getEnd() {
    return end;
  }

  public void setEnd(@Nullable NodeRequest end) {
    this.end = end;
  }

  public PathingResponse waypoints(List<@Valid NodeRequest> waypoints) {
    this.waypoints = waypoints;
    return this;
  }

  public PathingResponse addWaypointsItem(NodeRequest waypointsItem) {
    if (this.waypoints == null) {
      this.waypoints = new ArrayList<>();
    }
    this.waypoints.add(waypointsItem);
    return this;
  }

  /**
   * Get waypoints
   * @return waypoints
   */
  @Valid 
  @Schema(name = "waypoints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("waypoints")
  public List<@Valid NodeRequest> getWaypoints() {
    return waypoints;
  }

  public void setWaypoints(List<@Valid NodeRequest> waypoints) {
    this.waypoints = waypoints;
  }

  public PathingResponse exclusions(List<@Valid NodeRequest> exclusions) {
    this.exclusions = exclusions;
    return this;
  }

  public PathingResponse addExclusionsItem(NodeRequest exclusionsItem) {
    if (this.exclusions == null) {
      this.exclusions = new ArrayList<>();
    }
    this.exclusions.add(exclusionsItem);
    return this;
  }

  /**
   * Get exclusions
   * @return exclusions
   */
  @Valid 
  @Schema(name = "exclusions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exclusions")
  public List<@Valid NodeRequest> getExclusions() {
    return exclusions;
  }

  public void setExclusions(List<@Valid NodeRequest> exclusions) {
    this.exclusions = exclusions;
  }

  public PathingResponse width(@Nullable Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   * @return width
   */
  
  @Schema(name = "width", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("width")
  public @Nullable Integer getWidth() {
    return width;
  }

  public void setWidth(@Nullable Integer width) {
    this.width = width;
  }

  public PathingResponse height(@Nullable Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
   */
  
  @Schema(name = "height", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("height")
  public @Nullable Integer getHeight() {
    return height;
  }

  public void setHeight(@Nullable Integer height) {
    this.height = height;
  }

  public PathingResponse southwest(@Nullable NodeRequest southwest) {
    this.southwest = southwest;
    return this;
  }

  /**
   * Get southwest
   * @return southwest
   */
  @Valid 
  @Schema(name = "southwest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("southwest")
  public @Nullable NodeRequest getSouthwest() {
    return southwest;
  }

  public void setSouthwest(@Nullable NodeRequest southwest) {
    this.southwest = southwest;
  }

  public PathingResponse northeast(@Nullable NodeRequest northeast) {
    this.northeast = northeast;
    return this;
  }

  /**
   * Get northeast
   * @return northeast
   */
  @Valid 
  @Schema(name = "northeast", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("northeast")
  public @Nullable NodeRequest getNortheast() {
    return northeast;
  }

  public void setNortheast(@Nullable NodeRequest northeast) {
    this.northeast = northeast;
  }

  public PathingResponse metersPerX(@Nullable Double metersPerX) {
    this.metersPerX = metersPerX;
    return this;
  }

  /**
   * Get metersPerX
   * @return metersPerX
   */
  
  @Schema(name = "metersPerX", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metersPerX")
  public @Nullable Double getMetersPerX() {
    return metersPerX;
  }

  public void setMetersPerX(@Nullable Double metersPerX) {
    this.metersPerX = metersPerX;
  }

  public PathingResponse metersPerY(@Nullable Double metersPerY) {
    this.metersPerY = metersPerY;
    return this;
  }

  /**
   * Get metersPerY
   * @return metersPerY
   */
  
  @Schema(name = "metersPerY", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metersPerY")
  public @Nullable Double getMetersPerY() {
    return metersPerY;
  }

  public void setMetersPerY(@Nullable Double metersPerY) {
    this.metersPerY = metersPerY;
  }

  public PathingResponse path(List<@Valid NodeRequest> path) {
    this.path = path;
    return this;
  }

  public PathingResponse addPathItem(NodeRequest pathItem) {
    if (this.path == null) {
      this.path = new ArrayList<>();
    }
    this.path.add(pathItem);
    return this;
  }

  /**
   * Get path
   * @return path
   */
  @Valid 
  @Schema(name = "path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("path")
  public List<@Valid NodeRequest> getPath() {
    return path;
  }

  public void setPath(List<@Valid NodeRequest> path) {
    this.path = path;
  }

  public PathingResponse pathCount(@Nullable Integer pathCount) {
    this.pathCount = pathCount;
    return this;
  }

  /**
   * Get pathCount
   * @return pathCount
   */
  
  @Schema(name = "pathCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pathCount")
  public @Nullable Integer getPathCount() {
    return pathCount;
  }

  public void setPathCount(@Nullable Integer pathCount) {
    this.pathCount = pathCount;
  }

  public PathingResponse directions(List<@Valid DirectionResponse> directions) {
    this.directions = directions;
    return this;
  }

  public PathingResponse addDirectionsItem(DirectionResponse directionsItem) {
    if (this.directions == null) {
      this.directions = new ArrayList<>();
    }
    this.directions.add(directionsItem);
    return this;
  }

  /**
   * Get directions
   * @return directions
   */
  @Valid 
  @Schema(name = "directions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("directions")
  public List<@Valid DirectionResponse> getDirections() {
    return directions;
  }

  public void setDirections(List<@Valid DirectionResponse> directions) {
    this.directions = directions;
  }

  public PathingResponse directionCount(@Nullable Integer directionCount) {
    this.directionCount = directionCount;
    return this;
  }

  /**
   * Get directionCount
   * @return directionCount
   */
  
  @Schema(name = "directionCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("directionCount")
  public @Nullable Integer getDirectionCount() {
    return directionCount;
  }

  public void setDirectionCount(@Nullable Integer directionCount) {
    this.directionCount = directionCount;
  }

  public PathingResponse swcalibration(@Nullable NodeRequest swcalibration) {
    this.swcalibration = swcalibration;
    return this;
  }

  /**
   * Get swcalibration
   * @return swcalibration
   */
  @Valid 
  @Schema(name = "swcalibration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("swcalibration")
  public @Nullable NodeRequest getSwcalibration() {
    return swcalibration;
  }

  public void setSwcalibration(@Nullable NodeRequest swcalibration) {
    this.swcalibration = swcalibration;
  }

  public PathingResponse calibrationBearings(@Nullable Double calibrationBearings) {
    this.calibrationBearings = calibrationBearings;
    return this;
  }

  /**
   * Get calibrationBearings
   * @return calibrationBearings
   */
  
  @Schema(name = "calibrationBearings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("calibrationBearings")
  public @Nullable Double getCalibrationBearings() {
    return calibrationBearings;
  }

  public void setCalibrationBearings(@Nullable Double calibrationBearings) {
    this.calibrationBearings = calibrationBearings;
  }

  public PathingResponse necalibration(@Nullable NodeRequest necalibration) {
    this.necalibration = necalibration;
    return this;
  }

  /**
   * Get necalibration
   * @return necalibration
   */
  @Valid 
  @Schema(name = "necalibration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("necalibration")
  public @Nullable NodeRequest getNecalibration() {
    return necalibration;
  }

  public void setNecalibration(@Nullable NodeRequest necalibration) {
    this.necalibration = necalibration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathingResponse pathingResponse = (PathingResponse) o;
    return Objects.equals(this.start, pathingResponse.start) &&
        Objects.equals(this.end, pathingResponse.end) &&
        Objects.equals(this.waypoints, pathingResponse.waypoints) &&
        Objects.equals(this.exclusions, pathingResponse.exclusions) &&
        Objects.equals(this.width, pathingResponse.width) &&
        Objects.equals(this.height, pathingResponse.height) &&
        Objects.equals(this.southwest, pathingResponse.southwest) &&
        Objects.equals(this.northeast, pathingResponse.northeast) &&
        Objects.equals(this.metersPerX, pathingResponse.metersPerX) &&
        Objects.equals(this.metersPerY, pathingResponse.metersPerY) &&
        Objects.equals(this.path, pathingResponse.path) &&
        Objects.equals(this.pathCount, pathingResponse.pathCount) &&
        Objects.equals(this.directions, pathingResponse.directions) &&
        Objects.equals(this.directionCount, pathingResponse.directionCount) &&
        Objects.equals(this.swcalibration, pathingResponse.swcalibration) &&
        Objects.equals(this.calibrationBearings, pathingResponse.calibrationBearings) &&
        Objects.equals(this.necalibration, pathingResponse.necalibration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, waypoints, exclusions, width, height, southwest, northeast, metersPerX, metersPerY, path, pathCount, directions, directionCount, swcalibration, calibrationBearings, necalibration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathingResponse {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    waypoints: ").append(toIndentedString(waypoints)).append("\n");
    sb.append("    exclusions: ").append(toIndentedString(exclusions)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    southwest: ").append(toIndentedString(southwest)).append("\n");
    sb.append("    northeast: ").append(toIndentedString(northeast)).append("\n");
    sb.append("    metersPerX: ").append(toIndentedString(metersPerX)).append("\n");
    sb.append("    metersPerY: ").append(toIndentedString(metersPerY)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    pathCount: ").append(toIndentedString(pathCount)).append("\n");
    sb.append("    directions: ").append(toIndentedString(directions)).append("\n");
    sb.append("    directionCount: ").append(toIndentedString(directionCount)).append("\n");
    sb.append("    swcalibration: ").append(toIndentedString(swcalibration)).append("\n");
    sb.append("    calibrationBearings: ").append(toIndentedString(calibrationBearings)).append("\n");
    sb.append("    necalibration: ").append(toIndentedString(necalibration)).append("\n");
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

