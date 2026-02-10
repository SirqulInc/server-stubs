package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DirectionResponse;
import org.openapitools.model.NodeRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PathingResponse  {
  
  @ApiModelProperty(value = "")

  @Valid

  private NodeRequest start;

  @ApiModelProperty(value = "")

  @Valid

  private NodeRequest end;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid NodeRequest> waypoints = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid NodeRequest> exclusions = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Integer width;

  @ApiModelProperty(value = "")

  private Integer height;

  @ApiModelProperty(value = "")

  @Valid

  private NodeRequest southwest;

  @ApiModelProperty(value = "")

  @Valid

  private NodeRequest northeast;

  @ApiModelProperty(value = "")

  private Double metersPerX;

  @ApiModelProperty(value = "")

  private Double metersPerY;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid NodeRequest> path = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Integer pathCount;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid DirectionResponse> directions = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Integer directionCount;

  @ApiModelProperty(value = "")

  @Valid

  private NodeRequest swcalibration;

  @ApiModelProperty(value = "")

  private Double calibrationBearings;

  @ApiModelProperty(value = "")

  @Valid

  private NodeRequest necalibration;
 /**
   * Get start
   * @return start
  **/
  @JsonProperty("start")
  public NodeRequest getStart() {
    return start;
  }

  public void setStart(NodeRequest start) {
    this.start = start;
  }

  public PathingResponse start(NodeRequest start) {
    this.start = start;
    return this;
  }

 /**
   * Get end
   * @return end
  **/
  @JsonProperty("end")
  public NodeRequest getEnd() {
    return end;
  }

  public void setEnd(NodeRequest end) {
    this.end = end;
  }

  public PathingResponse end(NodeRequest end) {
    this.end = end;
    return this;
  }

 /**
   * Get waypoints
   * @return waypoints
  **/
  @JsonProperty("waypoints")
  public List<@Valid NodeRequest> getWaypoints() {
    return waypoints;
  }

  public void setWaypoints(List<@Valid NodeRequest> waypoints) {
    this.waypoints = waypoints;
  }

  public PathingResponse waypoints(List<@Valid NodeRequest> waypoints) {
    this.waypoints = waypoints;
    return this;
  }

  public PathingResponse addWaypointsItem(NodeRequest waypointsItem) {
    this.waypoints.add(waypointsItem);
    return this;
  }

 /**
   * Get exclusions
   * @return exclusions
  **/
  @JsonProperty("exclusions")
  public List<@Valid NodeRequest> getExclusions() {
    return exclusions;
  }

  public void setExclusions(List<@Valid NodeRequest> exclusions) {
    this.exclusions = exclusions;
  }

  public PathingResponse exclusions(List<@Valid NodeRequest> exclusions) {
    this.exclusions = exclusions;
    return this;
  }

  public PathingResponse addExclusionsItem(NodeRequest exclusionsItem) {
    this.exclusions.add(exclusionsItem);
    return this;
  }

 /**
   * Get width
   * @return width
  **/
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public PathingResponse width(Integer width) {
    this.width = width;
    return this;
  }

 /**
   * Get height
   * @return height
  **/
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public PathingResponse height(Integer height) {
    this.height = height;
    return this;
  }

 /**
   * Get southwest
   * @return southwest
  **/
  @JsonProperty("southwest")
  public NodeRequest getSouthwest() {
    return southwest;
  }

  public void setSouthwest(NodeRequest southwest) {
    this.southwest = southwest;
  }

  public PathingResponse southwest(NodeRequest southwest) {
    this.southwest = southwest;
    return this;
  }

 /**
   * Get northeast
   * @return northeast
  **/
  @JsonProperty("northeast")
  public NodeRequest getNortheast() {
    return northeast;
  }

  public void setNortheast(NodeRequest northeast) {
    this.northeast = northeast;
  }

  public PathingResponse northeast(NodeRequest northeast) {
    this.northeast = northeast;
    return this;
  }

 /**
   * Get metersPerX
   * @return metersPerX
  **/
  @JsonProperty("metersPerX")
  public Double getMetersPerX() {
    return metersPerX;
  }

  public void setMetersPerX(Double metersPerX) {
    this.metersPerX = metersPerX;
  }

  public PathingResponse metersPerX(Double metersPerX) {
    this.metersPerX = metersPerX;
    return this;
  }

 /**
   * Get metersPerY
   * @return metersPerY
  **/
  @JsonProperty("metersPerY")
  public Double getMetersPerY() {
    return metersPerY;
  }

  public void setMetersPerY(Double metersPerY) {
    this.metersPerY = metersPerY;
  }

  public PathingResponse metersPerY(Double metersPerY) {
    this.metersPerY = metersPerY;
    return this;
  }

 /**
   * Get path
   * @return path
  **/
  @JsonProperty("path")
  public List<@Valid NodeRequest> getPath() {
    return path;
  }

  public void setPath(List<@Valid NodeRequest> path) {
    this.path = path;
  }

  public PathingResponse path(List<@Valid NodeRequest> path) {
    this.path = path;
    return this;
  }

  public PathingResponse addPathItem(NodeRequest pathItem) {
    this.path.add(pathItem);
    return this;
  }

 /**
   * Get pathCount
   * @return pathCount
  **/
  @JsonProperty("pathCount")
  public Integer getPathCount() {
    return pathCount;
  }

  public void setPathCount(Integer pathCount) {
    this.pathCount = pathCount;
  }

  public PathingResponse pathCount(Integer pathCount) {
    this.pathCount = pathCount;
    return this;
  }

 /**
   * Get directions
   * @return directions
  **/
  @JsonProperty("directions")
  public List<@Valid DirectionResponse> getDirections() {
    return directions;
  }

  public void setDirections(List<@Valid DirectionResponse> directions) {
    this.directions = directions;
  }

  public PathingResponse directions(List<@Valid DirectionResponse> directions) {
    this.directions = directions;
    return this;
  }

  public PathingResponse addDirectionsItem(DirectionResponse directionsItem) {
    this.directions.add(directionsItem);
    return this;
  }

 /**
   * Get directionCount
   * @return directionCount
  **/
  @JsonProperty("directionCount")
  public Integer getDirectionCount() {
    return directionCount;
  }

  public void setDirectionCount(Integer directionCount) {
    this.directionCount = directionCount;
  }

  public PathingResponse directionCount(Integer directionCount) {
    this.directionCount = directionCount;
    return this;
  }

 /**
   * Get swcalibration
   * @return swcalibration
  **/
  @JsonProperty("swcalibration")
  public NodeRequest getSwcalibration() {
    return swcalibration;
  }

  public void setSwcalibration(NodeRequest swcalibration) {
    this.swcalibration = swcalibration;
  }

  public PathingResponse swcalibration(NodeRequest swcalibration) {
    this.swcalibration = swcalibration;
    return this;
  }

 /**
   * Get calibrationBearings
   * @return calibrationBearings
  **/
  @JsonProperty("calibrationBearings")
  public Double getCalibrationBearings() {
    return calibrationBearings;
  }

  public void setCalibrationBearings(Double calibrationBearings) {
    this.calibrationBearings = calibrationBearings;
  }

  public PathingResponse calibrationBearings(Double calibrationBearings) {
    this.calibrationBearings = calibrationBearings;
    return this;
  }

 /**
   * Get necalibration
   * @return necalibration
  **/
  @JsonProperty("necalibration")
  public NodeRequest getNecalibration() {
    return necalibration;
  }

  public void setNecalibration(NodeRequest necalibration) {
    this.necalibration = necalibration;
  }

  public PathingResponse necalibration(NodeRequest necalibration) {
    this.necalibration = necalibration;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

