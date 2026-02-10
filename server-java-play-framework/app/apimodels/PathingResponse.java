package apimodels;

import apimodels.DirectionResponse;
import apimodels.NodeRequest;
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
 * PathingResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PathingResponse   {
  @JsonProperty("start")
  @Valid

  private NodeRequest start;

  @JsonProperty("end")
  @Valid

  private NodeRequest end;

  @JsonProperty("waypoints")
  @Valid

  private List<@Valid NodeRequest> waypoints = null;

  @JsonProperty("exclusions")
  @Valid

  private List<@Valid NodeRequest> exclusions = null;

  @JsonProperty("width")
  
  private Integer width;

  @JsonProperty("height")
  
  private Integer height;

  @JsonProperty("southwest")
  @Valid

  private NodeRequest southwest;

  @JsonProperty("northeast")
  @Valid

  private NodeRequest northeast;

  @JsonProperty("metersPerX")
  
  private Double metersPerX;

  @JsonProperty("metersPerY")
  
  private Double metersPerY;

  @JsonProperty("path")
  @Valid

  private List<@Valid NodeRequest> path = null;

  @JsonProperty("pathCount")
  
  private Integer pathCount;

  @JsonProperty("directions")
  @Valid

  private List<@Valid DirectionResponse> directions = null;

  @JsonProperty("directionCount")
  
  private Integer directionCount;

  @JsonProperty("swcalibration")
  @Valid

  private NodeRequest swcalibration;

  @JsonProperty("calibrationBearings")
  
  private Double calibrationBearings;

  @JsonProperty("necalibration")
  @Valid

  private NodeRequest necalibration;

  public PathingResponse start(NodeRequest start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  public NodeRequest getStart() {
    return start;
  }

  public void setStart(NodeRequest start) {
    this.start = start;
  }

  public PathingResponse end(NodeRequest end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  public NodeRequest getEnd() {
    return end;
  }

  public void setEnd(NodeRequest end) {
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
  **/
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
  **/
  public List<@Valid NodeRequest> getExclusions() {
    return exclusions;
  }

  public void setExclusions(List<@Valid NodeRequest> exclusions) {
    this.exclusions = exclusions;
  }

  public PathingResponse width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public PathingResponse height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public PathingResponse southwest(NodeRequest southwest) {
    this.southwest = southwest;
    return this;
  }

   /**
   * Get southwest
   * @return southwest
  **/
  public NodeRequest getSouthwest() {
    return southwest;
  }

  public void setSouthwest(NodeRequest southwest) {
    this.southwest = southwest;
  }

  public PathingResponse northeast(NodeRequest northeast) {
    this.northeast = northeast;
    return this;
  }

   /**
   * Get northeast
   * @return northeast
  **/
  public NodeRequest getNortheast() {
    return northeast;
  }

  public void setNortheast(NodeRequest northeast) {
    this.northeast = northeast;
  }

  public PathingResponse metersPerX(Double metersPerX) {
    this.metersPerX = metersPerX;
    return this;
  }

   /**
   * Get metersPerX
   * @return metersPerX
  **/
  public Double getMetersPerX() {
    return metersPerX;
  }

  public void setMetersPerX(Double metersPerX) {
    this.metersPerX = metersPerX;
  }

  public PathingResponse metersPerY(Double metersPerY) {
    this.metersPerY = metersPerY;
    return this;
  }

   /**
   * Get metersPerY
   * @return metersPerY
  **/
  public Double getMetersPerY() {
    return metersPerY;
  }

  public void setMetersPerY(Double metersPerY) {
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
  **/
  public List<@Valid NodeRequest> getPath() {
    return path;
  }

  public void setPath(List<@Valid NodeRequest> path) {
    this.path = path;
  }

  public PathingResponse pathCount(Integer pathCount) {
    this.pathCount = pathCount;
    return this;
  }

   /**
   * Get pathCount
   * @return pathCount
  **/
  public Integer getPathCount() {
    return pathCount;
  }

  public void setPathCount(Integer pathCount) {
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
  **/
  public List<@Valid DirectionResponse> getDirections() {
    return directions;
  }

  public void setDirections(List<@Valid DirectionResponse> directions) {
    this.directions = directions;
  }

  public PathingResponse directionCount(Integer directionCount) {
    this.directionCount = directionCount;
    return this;
  }

   /**
   * Get directionCount
   * @return directionCount
  **/
  public Integer getDirectionCount() {
    return directionCount;
  }

  public void setDirectionCount(Integer directionCount) {
    this.directionCount = directionCount;
  }

  public PathingResponse swcalibration(NodeRequest swcalibration) {
    this.swcalibration = swcalibration;
    return this;
  }

   /**
   * Get swcalibration
   * @return swcalibration
  **/
  public NodeRequest getSwcalibration() {
    return swcalibration;
  }

  public void setSwcalibration(NodeRequest swcalibration) {
    this.swcalibration = swcalibration;
  }

  public PathingResponse calibrationBearings(Double calibrationBearings) {
    this.calibrationBearings = calibrationBearings;
    return this;
  }

   /**
   * Get calibrationBearings
   * @return calibrationBearings
  **/
  public Double getCalibrationBearings() {
    return calibrationBearings;
  }

  public void setCalibrationBearings(Double calibrationBearings) {
    this.calibrationBearings = calibrationBearings;
  }

  public PathingResponse necalibration(NodeRequest necalibration) {
    this.necalibration = necalibration;
    return this;
  }

   /**
   * Get necalibration
   * @return necalibration
  **/
  public NodeRequest getNecalibration() {
    return necalibration;
  }

  public void setNecalibration(NodeRequest necalibration) {
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
    return Objects.equals(start, pathingResponse.start) &&
        Objects.equals(end, pathingResponse.end) &&
        Objects.equals(waypoints, pathingResponse.waypoints) &&
        Objects.equals(exclusions, pathingResponse.exclusions) &&
        Objects.equals(width, pathingResponse.width) &&
        Objects.equals(height, pathingResponse.height) &&
        Objects.equals(southwest, pathingResponse.southwest) &&
        Objects.equals(northeast, pathingResponse.northeast) &&
        Objects.equals(metersPerX, pathingResponse.metersPerX) &&
        Objects.equals(metersPerY, pathingResponse.metersPerY) &&
        Objects.equals(path, pathingResponse.path) &&
        Objects.equals(pathCount, pathingResponse.pathCount) &&
        Objects.equals(directions, pathingResponse.directions) &&
        Objects.equals(directionCount, pathingResponse.directionCount) &&
        Objects.equals(swcalibration, pathingResponse.swcalibration) &&
        Objects.equals(calibrationBearings, pathingResponse.calibrationBearings) &&
        Objects.equals(necalibration, pathingResponse.necalibration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, waypoints, exclusions, width, height, southwest, northeast, metersPerX, metersPerY, path, pathCount, directions, directionCount, swcalibration, calibrationBearings, necalibration);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

