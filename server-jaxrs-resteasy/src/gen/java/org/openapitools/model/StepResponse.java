package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LegResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class StepResponse   {
  
  private LegResponse leg;
  private Double distance;
  private Long duration;
  private Double startLat;
  private Double startLng;
  private Double startAlt;
  private Long startDate;
  private Double endLat;
  private Double endLng;
  private Double endAlt;
  private Long endDate;
  private Integer accuracy;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("leg")
  @Valid
  public LegResponse getLeg() {
    return leg;
  }
  public void setLeg(LegResponse leg) {
    this.leg = leg;
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
  @JsonProperty("duration")
  public Long getDuration() {
    return duration;
  }
  public void setDuration(Long duration) {
    this.duration = duration;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startLat")
  public Double getStartLat() {
    return startLat;
  }
  public void setStartLat(Double startLat) {
    this.startLat = startLat;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startLng")
  public Double getStartLng() {
    return startLng;
  }
  public void setStartLng(Double startLng) {
    this.startLng = startLng;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startAlt")
  public Double getStartAlt() {
    return startAlt;
  }
  public void setStartAlt(Double startAlt) {
    this.startAlt = startAlt;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startDate")
  public Long getStartDate() {
    return startDate;
  }
  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endLat")
  public Double getEndLat() {
    return endLat;
  }
  public void setEndLat(Double endLat) {
    this.endLat = endLat;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endLng")
  public Double getEndLng() {
    return endLng;
  }
  public void setEndLng(Double endLng) {
    this.endLng = endLng;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endAlt")
  public Double getEndAlt() {
    return endAlt;
  }
  public void setEndAlt(Double endAlt) {
    this.endAlt = endAlt;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }
  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accuracy")
  public Integer getAccuracy() {
    return accuracy;
  }
  public void setAccuracy(Integer accuracy) {
    this.accuracy = accuracy;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

