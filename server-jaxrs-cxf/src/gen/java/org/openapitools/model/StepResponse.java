package org.openapitools.model;

import org.openapitools.model.LegResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class StepResponse  {
  
  @ApiModelProperty(value = "")

  @Valid

  private LegResponse leg;

  @ApiModelProperty(value = "")

  private Double distance;

  @ApiModelProperty(value = "")

  private Long duration;

  @ApiModelProperty(value = "")

  private Double startLat;

  @ApiModelProperty(value = "")

  private Double startLng;

  @ApiModelProperty(value = "")

  private Double startAlt;

  @ApiModelProperty(value = "")

  private Long startDate;

  @ApiModelProperty(value = "")

  private Double endLat;

  @ApiModelProperty(value = "")

  private Double endLng;

  @ApiModelProperty(value = "")

  private Double endAlt;

  @ApiModelProperty(value = "")

  private Long endDate;

  @ApiModelProperty(value = "")

  private Integer accuracy;
 /**
   * Get leg
   * @return leg
  **/
  @JsonProperty("leg")
  public LegResponse getLeg() {
    return leg;
  }

  public void setLeg(LegResponse leg) {
    this.leg = leg;
  }

  public StepResponse leg(LegResponse leg) {
    this.leg = leg;
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

  public StepResponse distance(Double distance) {
    this.distance = distance;
    return this;
  }

 /**
   * Get duration
   * @return duration
  **/
  @JsonProperty("duration")
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public StepResponse duration(Long duration) {
    this.duration = duration;
    return this;
  }

 /**
   * Get startLat
   * @return startLat
  **/
  @JsonProperty("startLat")
  public Double getStartLat() {
    return startLat;
  }

  public void setStartLat(Double startLat) {
    this.startLat = startLat;
  }

  public StepResponse startLat(Double startLat) {
    this.startLat = startLat;
    return this;
  }

 /**
   * Get startLng
   * @return startLng
  **/
  @JsonProperty("startLng")
  public Double getStartLng() {
    return startLng;
  }

  public void setStartLng(Double startLng) {
    this.startLng = startLng;
  }

  public StepResponse startLng(Double startLng) {
    this.startLng = startLng;
    return this;
  }

 /**
   * Get startAlt
   * @return startAlt
  **/
  @JsonProperty("startAlt")
  public Double getStartAlt() {
    return startAlt;
  }

  public void setStartAlt(Double startAlt) {
    this.startAlt = startAlt;
  }

  public StepResponse startAlt(Double startAlt) {
    this.startAlt = startAlt;
    return this;
  }

 /**
   * Get startDate
   * @return startDate
  **/
  @JsonProperty("startDate")
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public StepResponse startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * Get endLat
   * @return endLat
  **/
  @JsonProperty("endLat")
  public Double getEndLat() {
    return endLat;
  }

  public void setEndLat(Double endLat) {
    this.endLat = endLat;
  }

  public StepResponse endLat(Double endLat) {
    this.endLat = endLat;
    return this;
  }

 /**
   * Get endLng
   * @return endLng
  **/
  @JsonProperty("endLng")
  public Double getEndLng() {
    return endLng;
  }

  public void setEndLng(Double endLng) {
    this.endLng = endLng;
  }

  public StepResponse endLng(Double endLng) {
    this.endLng = endLng;
    return this;
  }

 /**
   * Get endAlt
   * @return endAlt
  **/
  @JsonProperty("endAlt")
  public Double getEndAlt() {
    return endAlt;
  }

  public void setEndAlt(Double endAlt) {
    this.endAlt = endAlt;
  }

  public StepResponse endAlt(Double endAlt) {
    this.endAlt = endAlt;
    return this;
  }

 /**
   * Get endDate
   * @return endDate
  **/
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public StepResponse endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * Get accuracy
   * @return accuracy
  **/
  @JsonProperty("accuracy")
  public Integer getAccuracy() {
    return accuracy;
  }

  public void setAccuracy(Integer accuracy) {
    this.accuracy = accuracy;
  }

  public StepResponse accuracy(Integer accuracy) {
    this.accuracy = accuracy;
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
    StepResponse stepResponse = (StepResponse) o;
    return Objects.equals(this.leg, stepResponse.leg) &&
        Objects.equals(this.distance, stepResponse.distance) &&
        Objects.equals(this.duration, stepResponse.duration) &&
        Objects.equals(this.startLat, stepResponse.startLat) &&
        Objects.equals(this.startLng, stepResponse.startLng) &&
        Objects.equals(this.startAlt, stepResponse.startAlt) &&
        Objects.equals(this.startDate, stepResponse.startDate) &&
        Objects.equals(this.endLat, stepResponse.endLat) &&
        Objects.equals(this.endLng, stepResponse.endLng) &&
        Objects.equals(this.endAlt, stepResponse.endAlt) &&
        Objects.equals(this.endDate, stepResponse.endDate) &&
        Objects.equals(this.accuracy, stepResponse.accuracy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leg, distance, duration, startLat, startLng, startAlt, startDate, endLat, endLng, endAlt, endDate, accuracy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StepResponse {\n");
    
    sb.append("    leg: ").append(toIndentedString(leg)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    startLat: ").append(toIndentedString(startLat)).append("\n");
    sb.append("    startLng: ").append(toIndentedString(startLng)).append("\n");
    sb.append("    startAlt: ").append(toIndentedString(startAlt)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endLat: ").append(toIndentedString(endLat)).append("\n");
    sb.append("    endLng: ").append(toIndentedString(endLng)).append("\n");
    sb.append("    endAlt: ").append(toIndentedString(endAlt)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
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

