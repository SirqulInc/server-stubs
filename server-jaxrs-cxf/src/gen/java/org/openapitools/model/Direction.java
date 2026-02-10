package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Direction  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String distance;

  @ApiModelProperty(value = "")

  private String duration;

  @ApiModelProperty(value = "")

  private Double endLatitude;

  @ApiModelProperty(value = "")

  private Double endLongitude;

  @ApiModelProperty(value = "")

  private Double startLatitude;

  @ApiModelProperty(value = "")

  private Double startLongitude;

  @ApiModelProperty(value = "")

  private String instruction;

  @ApiModelProperty(value = "")

  private String polyline;

public enum ProgressStatusEnum {

PENDING(String.valueOf("PENDING")), COMPLETE(String.valueOf("COMPLETE")), INVALID(String.valueOf("INVALID"));


    private String value;

    ProgressStatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ProgressStatusEnum fromValue(String value) {
        for (ProgressStatusEnum b : ProgressStatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ProgressStatusEnum progressStatus;

  @ApiModelProperty(value = "")

  private Boolean highlight;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Direction id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Direction active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public Direction valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get distance
   * @return distance
  **/
  @JsonProperty("distance")
  public String getDistance() {
    return distance;
  }

  public void setDistance(String distance) {
    this.distance = distance;
  }

  public Direction distance(String distance) {
    this.distance = distance;
    return this;
  }

 /**
   * Get duration
   * @return duration
  **/
  @JsonProperty("duration")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public Direction duration(String duration) {
    this.duration = duration;
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

  public Direction endLatitude(Double endLatitude) {
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

  public Direction endLongitude(Double endLongitude) {
    this.endLongitude = endLongitude;
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

  public Direction startLatitude(Double startLatitude) {
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

  public Direction startLongitude(Double startLongitude) {
    this.startLongitude = startLongitude;
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

  public Direction instruction(String instruction) {
    this.instruction = instruction;
    return this;
  }

 /**
   * Get polyline
   * @return polyline
  **/
  @JsonProperty("polyline")
  public String getPolyline() {
    return polyline;
  }

  public void setPolyline(String polyline) {
    this.polyline = polyline;
  }

  public Direction polyline(String polyline) {
    this.polyline = polyline;
    return this;
  }

 /**
   * Get progressStatus
   * @return progressStatus
  **/
  @JsonProperty("progressStatus")
  public String getProgressStatus() {
    if (progressStatus == null) {
      return null;
    }
    return progressStatus.value();
  }

  public void setProgressStatus(ProgressStatusEnum progressStatus) {
    this.progressStatus = progressStatus;
  }

  public Direction progressStatus(ProgressStatusEnum progressStatus) {
    this.progressStatus = progressStatus;
    return this;
  }

 /**
   * Get highlight
   * @return highlight
  **/
  @JsonProperty("highlight")
  public Boolean getHighlight() {
    return highlight;
  }

  public void setHighlight(Boolean highlight) {
    this.highlight = highlight;
  }

  public Direction highlight(Boolean highlight) {
    this.highlight = highlight;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

