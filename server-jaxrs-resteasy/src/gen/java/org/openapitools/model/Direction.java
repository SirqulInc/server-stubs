package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Direction   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private String distance;
  private String duration;
  private Double endLatitude;
  private Double endLongitude;
  private Double startLatitude;
  private Double startLongitude;
  private String instruction;
  private String polyline;

  /**
   * Gets or Sets progressStatus
   */
  public enum ProgressStatusEnum {
    PENDING("PENDING"),

        COMPLETE("COMPLETE"),

        INVALID("INVALID");
    private String value;

    ProgressStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ProgressStatusEnum progressStatus;
  private Boolean highlight;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
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

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("distance")
  public String getDistance() {
    return distance;
  }
  public void setDistance(String distance) {
    this.distance = distance;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("duration")
  public String getDuration() {
    return duration;
  }
  public void setDuration(String duration) {
    this.duration = duration;
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
  @JsonProperty("polyline")
  public String getPolyline() {
    return polyline;
  }
  public void setPolyline(String polyline) {
    this.polyline = polyline;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("progressStatus")
  public ProgressStatusEnum getProgressStatus() {
    return progressStatus;
  }
  public void setProgressStatus(ProgressStatusEnum progressStatus) {
    this.progressStatus = progressStatus;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("highlight")
  public Boolean getHighlight() {
    return highlight;
  }
  public void setHighlight(Boolean highlight) {
    this.highlight = highlight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Direction direction = (Direction) o;
    return Objects.equals(this.id, direction.id) &&
        Objects.equals(this.active, direction.active) &&
        Objects.equals(this.valid, direction.valid) &&
        Objects.equals(this.distance, direction.distance) &&
        Objects.equals(this.duration, direction.duration) &&
        Objects.equals(this.endLatitude, direction.endLatitude) &&
        Objects.equals(this.endLongitude, direction.endLongitude) &&
        Objects.equals(this.startLatitude, direction.startLatitude) &&
        Objects.equals(this.startLongitude, direction.startLongitude) &&
        Objects.equals(this.instruction, direction.instruction) &&
        Objects.equals(this.polyline, direction.polyline) &&
        Objects.equals(this.progressStatus, direction.progressStatus) &&
        Objects.equals(this.highlight, direction.highlight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, distance, duration, endLatitude, endLongitude, startLatitude, startLongitude, instruction, polyline, progressStatus, highlight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Direction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    endLatitude: ").append(toIndentedString(endLatitude)).append("\n");
    sb.append("    endLongitude: ").append(toIndentedString(endLongitude)).append("\n");
    sb.append("    startLatitude: ").append(toIndentedString(startLatitude)).append("\n");
    sb.append("    startLongitude: ").append(toIndentedString(startLongitude)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("    polyline: ").append(toIndentedString(polyline)).append("\n");
    sb.append("    progressStatus: ").append(toIndentedString(progressStatus)).append("\n");
    sb.append("    highlight: ").append(toIndentedString(highlight)).append("\n");
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

