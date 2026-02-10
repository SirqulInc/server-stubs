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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ConfigRoutingRequest   {
  
  private Boolean debugMode;
  private Boolean threaded;
  private String threadType;
  private Long maxRuntime;
  private Integer numberOfMatches;
  private Integer maxItineraryTime;
  private Integer maxStopsPerVehicle;
  private Integer averageCityTimePerMile;
  private Integer averageFreewayTimePerMile;
  private Float freewayTravelDistance;
  private Double sameStopBuffer;

  /**
   * Gets or Sets orderAlgorithm
   */
  public enum OrderAlgorithmEnum {
    CLOSEST_FIRST("CLOSEST_FIRST"),

        FURTHEST_FIRST("FURTHEST_FIRST"),

        PICKUPS_FIRST("PICKUPS_FIRST");
    private String value;

    OrderAlgorithmEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private OrderAlgorithmEnum orderAlgorithm;

  /**
   * Gets or Sets scoreAlgorithm
   */
  public enum ScoreAlgorithmEnum {
    FEWEST_VEHICLES("FEWEST_VEHICLES"),

        SHORTEST_PASSENGER_TIME("SHORTEST_PASSENGER_TIME");
    private String value;

    ScoreAlgorithmEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ScoreAlgorithmEnum scoreAlgorithm;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("debugMode")
  public Boolean getDebugMode() {
    return debugMode;
  }
  public void setDebugMode(Boolean debugMode) {
    this.debugMode = debugMode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("threaded")
  public Boolean getThreaded() {
    return threaded;
  }
  public void setThreaded(Boolean threaded) {
    this.threaded = threaded;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("threadType")
  public String getThreadType() {
    return threadType;
  }
  public void setThreadType(String threadType) {
    this.threadType = threadType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxRuntime")
  public Long getMaxRuntime() {
    return maxRuntime;
  }
  public void setMaxRuntime(Long maxRuntime) {
    this.maxRuntime = maxRuntime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numberOfMatches")
  public Integer getNumberOfMatches() {
    return numberOfMatches;
  }
  public void setNumberOfMatches(Integer numberOfMatches) {
    this.numberOfMatches = numberOfMatches;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxItineraryTime")
  public Integer getMaxItineraryTime() {
    return maxItineraryTime;
  }
  public void setMaxItineraryTime(Integer maxItineraryTime) {
    this.maxItineraryTime = maxItineraryTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxStopsPerVehicle")
  public Integer getMaxStopsPerVehicle() {
    return maxStopsPerVehicle;
  }
  public void setMaxStopsPerVehicle(Integer maxStopsPerVehicle) {
    this.maxStopsPerVehicle = maxStopsPerVehicle;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("averageCityTimePerMile")
  public Integer getAverageCityTimePerMile() {
    return averageCityTimePerMile;
  }
  public void setAverageCityTimePerMile(Integer averageCityTimePerMile) {
    this.averageCityTimePerMile = averageCityTimePerMile;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("averageFreewayTimePerMile")
  public Integer getAverageFreewayTimePerMile() {
    return averageFreewayTimePerMile;
  }
  public void setAverageFreewayTimePerMile(Integer averageFreewayTimePerMile) {
    this.averageFreewayTimePerMile = averageFreewayTimePerMile;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("freewayTravelDistance")
  public Float getFreewayTravelDistance() {
    return freewayTravelDistance;
  }
  public void setFreewayTravelDistance(Float freewayTravelDistance) {
    this.freewayTravelDistance = freewayTravelDistance;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sameStopBuffer")
  public Double getSameStopBuffer() {
    return sameStopBuffer;
  }
  public void setSameStopBuffer(Double sameStopBuffer) {
    this.sameStopBuffer = sameStopBuffer;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderAlgorithm")
  public OrderAlgorithmEnum getOrderAlgorithm() {
    return orderAlgorithm;
  }
  public void setOrderAlgorithm(OrderAlgorithmEnum orderAlgorithm) {
    this.orderAlgorithm = orderAlgorithm;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scoreAlgorithm")
  public ScoreAlgorithmEnum getScoreAlgorithm() {
    return scoreAlgorithm;
  }
  public void setScoreAlgorithm(ScoreAlgorithmEnum scoreAlgorithm) {
    this.scoreAlgorithm = scoreAlgorithm;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigRoutingRequest configRoutingRequest = (ConfigRoutingRequest) o;
    return Objects.equals(this.debugMode, configRoutingRequest.debugMode) &&
        Objects.equals(this.threaded, configRoutingRequest.threaded) &&
        Objects.equals(this.threadType, configRoutingRequest.threadType) &&
        Objects.equals(this.maxRuntime, configRoutingRequest.maxRuntime) &&
        Objects.equals(this.numberOfMatches, configRoutingRequest.numberOfMatches) &&
        Objects.equals(this.maxItineraryTime, configRoutingRequest.maxItineraryTime) &&
        Objects.equals(this.maxStopsPerVehicle, configRoutingRequest.maxStopsPerVehicle) &&
        Objects.equals(this.averageCityTimePerMile, configRoutingRequest.averageCityTimePerMile) &&
        Objects.equals(this.averageFreewayTimePerMile, configRoutingRequest.averageFreewayTimePerMile) &&
        Objects.equals(this.freewayTravelDistance, configRoutingRequest.freewayTravelDistance) &&
        Objects.equals(this.sameStopBuffer, configRoutingRequest.sameStopBuffer) &&
        Objects.equals(this.orderAlgorithm, configRoutingRequest.orderAlgorithm) &&
        Objects.equals(this.scoreAlgorithm, configRoutingRequest.scoreAlgorithm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(debugMode, threaded, threadType, maxRuntime, numberOfMatches, maxItineraryTime, maxStopsPerVehicle, averageCityTimePerMile, averageFreewayTimePerMile, freewayTravelDistance, sameStopBuffer, orderAlgorithm, scoreAlgorithm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigRoutingRequest {\n");
    
    sb.append("    debugMode: ").append(toIndentedString(debugMode)).append("\n");
    sb.append("    threaded: ").append(toIndentedString(threaded)).append("\n");
    sb.append("    threadType: ").append(toIndentedString(threadType)).append("\n");
    sb.append("    maxRuntime: ").append(toIndentedString(maxRuntime)).append("\n");
    sb.append("    numberOfMatches: ").append(toIndentedString(numberOfMatches)).append("\n");
    sb.append("    maxItineraryTime: ").append(toIndentedString(maxItineraryTime)).append("\n");
    sb.append("    maxStopsPerVehicle: ").append(toIndentedString(maxStopsPerVehicle)).append("\n");
    sb.append("    averageCityTimePerMile: ").append(toIndentedString(averageCityTimePerMile)).append("\n");
    sb.append("    averageFreewayTimePerMile: ").append(toIndentedString(averageFreewayTimePerMile)).append("\n");
    sb.append("    freewayTravelDistance: ").append(toIndentedString(freewayTravelDistance)).append("\n");
    sb.append("    sameStopBuffer: ").append(toIndentedString(sameStopBuffer)).append("\n");
    sb.append("    orderAlgorithm: ").append(toIndentedString(orderAlgorithm)).append("\n");
    sb.append("    scoreAlgorithm: ").append(toIndentedString(scoreAlgorithm)).append("\n");
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

