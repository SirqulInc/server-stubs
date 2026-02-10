package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConfigRoutingRequest  {
  
  @ApiModelProperty(value = "")

  private Boolean debugMode;

  @ApiModelProperty(value = "")

  private Boolean threaded;

  @ApiModelProperty(value = "")

  private String threadType;

  @ApiModelProperty(value = "")

  private Long maxRuntime;

  @ApiModelProperty(value = "")

  private Integer numberOfMatches;

  @ApiModelProperty(value = "")

  private Integer maxItineraryTime;

  @ApiModelProperty(value = "")

  private Integer maxStopsPerVehicle;

  @ApiModelProperty(value = "")

  private Integer averageCityTimePerMile;

  @ApiModelProperty(value = "")

  private Integer averageFreewayTimePerMile;

  @ApiModelProperty(value = "")

  private Float freewayTravelDistance;

  @ApiModelProperty(value = "")

  private Double sameStopBuffer;

public enum OrderAlgorithmEnum {

CLOSEST_FIRST(String.valueOf("CLOSEST_FIRST")), FURTHEST_FIRST(String.valueOf("FURTHEST_FIRST")), PICKUPS_FIRST(String.valueOf("PICKUPS_FIRST"));


    private String value;

    OrderAlgorithmEnum (String v) {
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
    public static OrderAlgorithmEnum fromValue(String value) {
        for (OrderAlgorithmEnum b : OrderAlgorithmEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private OrderAlgorithmEnum orderAlgorithm;

public enum ScoreAlgorithmEnum {

FEWEST_VEHICLES(String.valueOf("FEWEST_VEHICLES")), SHORTEST_PASSENGER_TIME(String.valueOf("SHORTEST_PASSENGER_TIME"));


    private String value;

    ScoreAlgorithmEnum (String v) {
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
    public static ScoreAlgorithmEnum fromValue(String value) {
        for (ScoreAlgorithmEnum b : ScoreAlgorithmEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ScoreAlgorithmEnum scoreAlgorithm;
 /**
   * Get debugMode
   * @return debugMode
  **/
  @JsonProperty("debugMode")
  public Boolean getDebugMode() {
    return debugMode;
  }

  public void setDebugMode(Boolean debugMode) {
    this.debugMode = debugMode;
  }

  public ConfigRoutingRequest debugMode(Boolean debugMode) {
    this.debugMode = debugMode;
    return this;
  }

 /**
   * Get threaded
   * @return threaded
  **/
  @JsonProperty("threaded")
  public Boolean getThreaded() {
    return threaded;
  }

  public void setThreaded(Boolean threaded) {
    this.threaded = threaded;
  }

  public ConfigRoutingRequest threaded(Boolean threaded) {
    this.threaded = threaded;
    return this;
  }

 /**
   * Get threadType
   * @return threadType
  **/
  @JsonProperty("threadType")
  public String getThreadType() {
    return threadType;
  }

  public void setThreadType(String threadType) {
    this.threadType = threadType;
  }

  public ConfigRoutingRequest threadType(String threadType) {
    this.threadType = threadType;
    return this;
  }

 /**
   * Get maxRuntime
   * @return maxRuntime
  **/
  @JsonProperty("maxRuntime")
  public Long getMaxRuntime() {
    return maxRuntime;
  }

  public void setMaxRuntime(Long maxRuntime) {
    this.maxRuntime = maxRuntime;
  }

  public ConfigRoutingRequest maxRuntime(Long maxRuntime) {
    this.maxRuntime = maxRuntime;
    return this;
  }

 /**
   * Get numberOfMatches
   * @return numberOfMatches
  **/
  @JsonProperty("numberOfMatches")
  public Integer getNumberOfMatches() {
    return numberOfMatches;
  }

  public void setNumberOfMatches(Integer numberOfMatches) {
    this.numberOfMatches = numberOfMatches;
  }

  public ConfigRoutingRequest numberOfMatches(Integer numberOfMatches) {
    this.numberOfMatches = numberOfMatches;
    return this;
  }

 /**
   * Get maxItineraryTime
   * @return maxItineraryTime
  **/
  @JsonProperty("maxItineraryTime")
  public Integer getMaxItineraryTime() {
    return maxItineraryTime;
  }

  public void setMaxItineraryTime(Integer maxItineraryTime) {
    this.maxItineraryTime = maxItineraryTime;
  }

  public ConfigRoutingRequest maxItineraryTime(Integer maxItineraryTime) {
    this.maxItineraryTime = maxItineraryTime;
    return this;
  }

 /**
   * Get maxStopsPerVehicle
   * @return maxStopsPerVehicle
  **/
  @JsonProperty("maxStopsPerVehicle")
  public Integer getMaxStopsPerVehicle() {
    return maxStopsPerVehicle;
  }

  public void setMaxStopsPerVehicle(Integer maxStopsPerVehicle) {
    this.maxStopsPerVehicle = maxStopsPerVehicle;
  }

  public ConfigRoutingRequest maxStopsPerVehicle(Integer maxStopsPerVehicle) {
    this.maxStopsPerVehicle = maxStopsPerVehicle;
    return this;
  }

 /**
   * Get averageCityTimePerMile
   * @return averageCityTimePerMile
  **/
  @JsonProperty("averageCityTimePerMile")
  public Integer getAverageCityTimePerMile() {
    return averageCityTimePerMile;
  }

  public void setAverageCityTimePerMile(Integer averageCityTimePerMile) {
    this.averageCityTimePerMile = averageCityTimePerMile;
  }

  public ConfigRoutingRequest averageCityTimePerMile(Integer averageCityTimePerMile) {
    this.averageCityTimePerMile = averageCityTimePerMile;
    return this;
  }

 /**
   * Get averageFreewayTimePerMile
   * @return averageFreewayTimePerMile
  **/
  @JsonProperty("averageFreewayTimePerMile")
  public Integer getAverageFreewayTimePerMile() {
    return averageFreewayTimePerMile;
  }

  public void setAverageFreewayTimePerMile(Integer averageFreewayTimePerMile) {
    this.averageFreewayTimePerMile = averageFreewayTimePerMile;
  }

  public ConfigRoutingRequest averageFreewayTimePerMile(Integer averageFreewayTimePerMile) {
    this.averageFreewayTimePerMile = averageFreewayTimePerMile;
    return this;
  }

 /**
   * Get freewayTravelDistance
   * @return freewayTravelDistance
  **/
  @JsonProperty("freewayTravelDistance")
  public Float getFreewayTravelDistance() {
    return freewayTravelDistance;
  }

  public void setFreewayTravelDistance(Float freewayTravelDistance) {
    this.freewayTravelDistance = freewayTravelDistance;
  }

  public ConfigRoutingRequest freewayTravelDistance(Float freewayTravelDistance) {
    this.freewayTravelDistance = freewayTravelDistance;
    return this;
  }

 /**
   * Get sameStopBuffer
   * @return sameStopBuffer
  **/
  @JsonProperty("sameStopBuffer")
  public Double getSameStopBuffer() {
    return sameStopBuffer;
  }

  public void setSameStopBuffer(Double sameStopBuffer) {
    this.sameStopBuffer = sameStopBuffer;
  }

  public ConfigRoutingRequest sameStopBuffer(Double sameStopBuffer) {
    this.sameStopBuffer = sameStopBuffer;
    return this;
  }

 /**
   * Get orderAlgorithm
   * @return orderAlgorithm
  **/
  @JsonProperty("orderAlgorithm")
  public String getOrderAlgorithm() {
    if (orderAlgorithm == null) {
      return null;
    }
    return orderAlgorithm.value();
  }

  public void setOrderAlgorithm(OrderAlgorithmEnum orderAlgorithm) {
    this.orderAlgorithm = orderAlgorithm;
  }

  public ConfigRoutingRequest orderAlgorithm(OrderAlgorithmEnum orderAlgorithm) {
    this.orderAlgorithm = orderAlgorithm;
    return this;
  }

 /**
   * Get scoreAlgorithm
   * @return scoreAlgorithm
  **/
  @JsonProperty("scoreAlgorithm")
  public String getScoreAlgorithm() {
    if (scoreAlgorithm == null) {
      return null;
    }
    return scoreAlgorithm.value();
  }

  public void setScoreAlgorithm(ScoreAlgorithmEnum scoreAlgorithm) {
    this.scoreAlgorithm = scoreAlgorithm;
  }

  public ConfigRoutingRequest scoreAlgorithm(ScoreAlgorithmEnum scoreAlgorithm) {
    this.scoreAlgorithm = scoreAlgorithm;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

