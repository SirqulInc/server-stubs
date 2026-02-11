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
import org.openapitools.model.DirectionResponse;
import org.openapitools.model.NodeRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PathingResponse   {
  
  private NodeRequest start;
  private NodeRequest end;
  private List<@Valid NodeRequest> waypoints = new ArrayList<>();
  private List<@Valid NodeRequest> exclusions = new ArrayList<>();
  private Integer width;
  private Integer height;
  private NodeRequest southwest;
  private NodeRequest northeast;
  private Double metersPerX;
  private Double metersPerY;
  private List<@Valid NodeRequest> path = new ArrayList<>();
  private Integer pathCount;
  private List<@Valid DirectionResponse> directions = new ArrayList<>();
  private Integer directionCount;
  private NodeRequest swcalibration;
  private Double calibrationBearings;
  private NodeRequest necalibration;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("start")
  @Valid
  public NodeRequest getStart() {
    return start;
  }
  public void setStart(NodeRequest start) {
    this.start = start;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("end")
  @Valid
  public NodeRequest getEnd() {
    return end;
  }
  public void setEnd(NodeRequest end) {
    this.end = end;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("waypoints")
  @Valid
  public List<@Valid NodeRequest> getWaypoints() {
    return waypoints;
  }
  public void setWaypoints(List<@Valid NodeRequest> waypoints) {
    this.waypoints = waypoints;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("exclusions")
  @Valid
  public List<@Valid NodeRequest> getExclusions() {
    return exclusions;
  }
  public void setExclusions(List<@Valid NodeRequest> exclusions) {
    this.exclusions = exclusions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }
  public void setWidth(Integer width) {
    this.width = width;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("southwest")
  @Valid
  public NodeRequest getSouthwest() {
    return southwest;
  }
  public void setSouthwest(NodeRequest southwest) {
    this.southwest = southwest;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("northeast")
  @Valid
  public NodeRequest getNortheast() {
    return northeast;
  }
  public void setNortheast(NodeRequest northeast) {
    this.northeast = northeast;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("metersPerX")
  public Double getMetersPerX() {
    return metersPerX;
  }
  public void setMetersPerX(Double metersPerX) {
    this.metersPerX = metersPerX;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("metersPerY")
  public Double getMetersPerY() {
    return metersPerY;
  }
  public void setMetersPerY(Double metersPerY) {
    this.metersPerY = metersPerY;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("path")
  @Valid
  public List<@Valid NodeRequest> getPath() {
    return path;
  }
  public void setPath(List<@Valid NodeRequest> path) {
    this.path = path;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pathCount")
  public Integer getPathCount() {
    return pathCount;
  }
  public void setPathCount(Integer pathCount) {
    this.pathCount = pathCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("directions")
  @Valid
  public List<@Valid DirectionResponse> getDirections() {
    return directions;
  }
  public void setDirections(List<@Valid DirectionResponse> directions) {
    this.directions = directions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("directionCount")
  public Integer getDirectionCount() {
    return directionCount;
  }
  public void setDirectionCount(Integer directionCount) {
    this.directionCount = directionCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("swcalibration")
  @Valid
  public NodeRequest getSwcalibration() {
    return swcalibration;
  }
  public void setSwcalibration(NodeRequest swcalibration) {
    this.swcalibration = swcalibration;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("calibrationBearings")
  public Double getCalibrationBearings() {
    return calibrationBearings;
  }
  public void setCalibrationBearings(Double calibrationBearings) {
    this.calibrationBearings = calibrationBearings;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("necalibration")
  @Valid
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

