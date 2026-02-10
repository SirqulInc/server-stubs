package apimodels;

import apimodels.LegResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * StepResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class StepResponse   {
  @JsonProperty("leg")
  @Valid

  private LegResponse leg;

  @JsonProperty("distance")
  
  private Double distance;

  @JsonProperty("duration")
  
  private Long duration;

  @JsonProperty("startLat")
  
  private Double startLat;

  @JsonProperty("startLng")
  
  private Double startLng;

  @JsonProperty("startAlt")
  
  private Double startAlt;

  @JsonProperty("startDate")
  
  private Long startDate;

  @JsonProperty("endLat")
  
  private Double endLat;

  @JsonProperty("endLng")
  
  private Double endLng;

  @JsonProperty("endAlt")
  
  private Double endAlt;

  @JsonProperty("endDate")
  
  private Long endDate;

  @JsonProperty("accuracy")
  
  private Integer accuracy;

  public StepResponse leg(LegResponse leg) {
    this.leg = leg;
    return this;
  }

   /**
   * Get leg
   * @return leg
  **/
  public LegResponse getLeg() {
    return leg;
  }

  public void setLeg(LegResponse leg) {
    this.leg = leg;
  }

  public StepResponse distance(Double distance) {
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

  public StepResponse duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public StepResponse startLat(Double startLat) {
    this.startLat = startLat;
    return this;
  }

   /**
   * Get startLat
   * @return startLat
  **/
  public Double getStartLat() {
    return startLat;
  }

  public void setStartLat(Double startLat) {
    this.startLat = startLat;
  }

  public StepResponse startLng(Double startLng) {
    this.startLng = startLng;
    return this;
  }

   /**
   * Get startLng
   * @return startLng
  **/
  public Double getStartLng() {
    return startLng;
  }

  public void setStartLng(Double startLng) {
    this.startLng = startLng;
  }

  public StepResponse startAlt(Double startAlt) {
    this.startAlt = startAlt;
    return this;
  }

   /**
   * Get startAlt
   * @return startAlt
  **/
  public Double getStartAlt() {
    return startAlt;
  }

  public void setStartAlt(Double startAlt) {
    this.startAlt = startAlt;
  }

  public StepResponse startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public StepResponse endLat(Double endLat) {
    this.endLat = endLat;
    return this;
  }

   /**
   * Get endLat
   * @return endLat
  **/
  public Double getEndLat() {
    return endLat;
  }

  public void setEndLat(Double endLat) {
    this.endLat = endLat;
  }

  public StepResponse endLng(Double endLng) {
    this.endLng = endLng;
    return this;
  }

   /**
   * Get endLng
   * @return endLng
  **/
  public Double getEndLng() {
    return endLng;
  }

  public void setEndLng(Double endLng) {
    this.endLng = endLng;
  }

  public StepResponse endAlt(Double endAlt) {
    this.endAlt = endAlt;
    return this;
  }

   /**
   * Get endAlt
   * @return endAlt
  **/
  public Double getEndAlt() {
    return endAlt;
  }

  public void setEndAlt(Double endAlt) {
    this.endAlt = endAlt;
  }

  public StepResponse endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public StepResponse accuracy(Integer accuracy) {
    this.accuracy = accuracy;
    return this;
  }

   /**
   * Get accuracy
   * @return accuracy
  **/
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
    return Objects.equals(leg, stepResponse.leg) &&
        Objects.equals(distance, stepResponse.distance) &&
        Objects.equals(duration, stepResponse.duration) &&
        Objects.equals(startLat, stepResponse.startLat) &&
        Objects.equals(startLng, stepResponse.startLng) &&
        Objects.equals(startAlt, stepResponse.startAlt) &&
        Objects.equals(startDate, stepResponse.startDate) &&
        Objects.equals(endLat, stepResponse.endLat) &&
        Objects.equals(endLng, stepResponse.endLng) &&
        Objects.equals(endAlt, stepResponse.endAlt) &&
        Objects.equals(endDate, stepResponse.endDate) &&
        Objects.equals(accuracy, stepResponse.accuracy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leg, distance, duration, startLat, startLng, startAlt, startDate, endLat, endLng, endAlt, endDate, accuracy);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

