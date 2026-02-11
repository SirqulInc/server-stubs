package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ConfigRoutingRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ConfigRoutingRequest {

  private @Nullable Boolean debugMode;

  private @Nullable Boolean threaded;

  private @Nullable String threadType;

  private @Nullable Long maxRuntime;

  private @Nullable Integer numberOfMatches;

  private @Nullable Integer maxItineraryTime;

  private @Nullable Integer maxStopsPerVehicle;

  private @Nullable Integer averageCityTimePerMile;

  private @Nullable Integer averageFreewayTimePerMile;

  private @Nullable Float freewayTravelDistance;

  private @Nullable Double sameStopBuffer;

  /**
   * Gets or Sets orderAlgorithm
   */
  public enum OrderAlgorithmEnum {
    CLOSEST_FIRST("CLOSEST_FIRST"),
    
    FURTHEST_FIRST("FURTHEST_FIRST"),
    
    PICKUPS_FIRST("PICKUPS_FIRST");

    private final String value;

    OrderAlgorithmEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable OrderAlgorithmEnum orderAlgorithm;

  /**
   * Gets or Sets scoreAlgorithm
   */
  public enum ScoreAlgorithmEnum {
    FEWEST_VEHICLES("FEWEST_VEHICLES"),
    
    SHORTEST_PASSENGER_TIME("SHORTEST_PASSENGER_TIME");

    private final String value;

    ScoreAlgorithmEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable ScoreAlgorithmEnum scoreAlgorithm;

  public ConfigRoutingRequest debugMode(@Nullable Boolean debugMode) {
    this.debugMode = debugMode;
    return this;
  }

  /**
   * Get debugMode
   * @return debugMode
   */
  
  @Schema(name = "debugMode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("debugMode")
  public @Nullable Boolean getDebugMode() {
    return debugMode;
  }

  public void setDebugMode(@Nullable Boolean debugMode) {
    this.debugMode = debugMode;
  }

  public ConfigRoutingRequest threaded(@Nullable Boolean threaded) {
    this.threaded = threaded;
    return this;
  }

  /**
   * Get threaded
   * @return threaded
   */
  
  @Schema(name = "threaded", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("threaded")
  public @Nullable Boolean getThreaded() {
    return threaded;
  }

  public void setThreaded(@Nullable Boolean threaded) {
    this.threaded = threaded;
  }

  public ConfigRoutingRequest threadType(@Nullable String threadType) {
    this.threadType = threadType;
    return this;
  }

  /**
   * Get threadType
   * @return threadType
   */
  
  @Schema(name = "threadType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("threadType")
  public @Nullable String getThreadType() {
    return threadType;
  }

  public void setThreadType(@Nullable String threadType) {
    this.threadType = threadType;
  }

  public ConfigRoutingRequest maxRuntime(@Nullable Long maxRuntime) {
    this.maxRuntime = maxRuntime;
    return this;
  }

  /**
   * Get maxRuntime
   * @return maxRuntime
   */
  
  @Schema(name = "maxRuntime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxRuntime")
  public @Nullable Long getMaxRuntime() {
    return maxRuntime;
  }

  public void setMaxRuntime(@Nullable Long maxRuntime) {
    this.maxRuntime = maxRuntime;
  }

  public ConfigRoutingRequest numberOfMatches(@Nullable Integer numberOfMatches) {
    this.numberOfMatches = numberOfMatches;
    return this;
  }

  /**
   * Get numberOfMatches
   * @return numberOfMatches
   */
  
  @Schema(name = "numberOfMatches", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberOfMatches")
  public @Nullable Integer getNumberOfMatches() {
    return numberOfMatches;
  }

  public void setNumberOfMatches(@Nullable Integer numberOfMatches) {
    this.numberOfMatches = numberOfMatches;
  }

  public ConfigRoutingRequest maxItineraryTime(@Nullable Integer maxItineraryTime) {
    this.maxItineraryTime = maxItineraryTime;
    return this;
  }

  /**
   * Get maxItineraryTime
   * @return maxItineraryTime
   */
  
  @Schema(name = "maxItineraryTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxItineraryTime")
  public @Nullable Integer getMaxItineraryTime() {
    return maxItineraryTime;
  }

  public void setMaxItineraryTime(@Nullable Integer maxItineraryTime) {
    this.maxItineraryTime = maxItineraryTime;
  }

  public ConfigRoutingRequest maxStopsPerVehicle(@Nullable Integer maxStopsPerVehicle) {
    this.maxStopsPerVehicle = maxStopsPerVehicle;
    return this;
  }

  /**
   * Get maxStopsPerVehicle
   * @return maxStopsPerVehicle
   */
  
  @Schema(name = "maxStopsPerVehicle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxStopsPerVehicle")
  public @Nullable Integer getMaxStopsPerVehicle() {
    return maxStopsPerVehicle;
  }

  public void setMaxStopsPerVehicle(@Nullable Integer maxStopsPerVehicle) {
    this.maxStopsPerVehicle = maxStopsPerVehicle;
  }

  public ConfigRoutingRequest averageCityTimePerMile(@Nullable Integer averageCityTimePerMile) {
    this.averageCityTimePerMile = averageCityTimePerMile;
    return this;
  }

  /**
   * Get averageCityTimePerMile
   * @return averageCityTimePerMile
   */
  
  @Schema(name = "averageCityTimePerMile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("averageCityTimePerMile")
  public @Nullable Integer getAverageCityTimePerMile() {
    return averageCityTimePerMile;
  }

  public void setAverageCityTimePerMile(@Nullable Integer averageCityTimePerMile) {
    this.averageCityTimePerMile = averageCityTimePerMile;
  }

  public ConfigRoutingRequest averageFreewayTimePerMile(@Nullable Integer averageFreewayTimePerMile) {
    this.averageFreewayTimePerMile = averageFreewayTimePerMile;
    return this;
  }

  /**
   * Get averageFreewayTimePerMile
   * @return averageFreewayTimePerMile
   */
  
  @Schema(name = "averageFreewayTimePerMile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("averageFreewayTimePerMile")
  public @Nullable Integer getAverageFreewayTimePerMile() {
    return averageFreewayTimePerMile;
  }

  public void setAverageFreewayTimePerMile(@Nullable Integer averageFreewayTimePerMile) {
    this.averageFreewayTimePerMile = averageFreewayTimePerMile;
  }

  public ConfigRoutingRequest freewayTravelDistance(@Nullable Float freewayTravelDistance) {
    this.freewayTravelDistance = freewayTravelDistance;
    return this;
  }

  /**
   * Get freewayTravelDistance
   * @return freewayTravelDistance
   */
  
  @Schema(name = "freewayTravelDistance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("freewayTravelDistance")
  public @Nullable Float getFreewayTravelDistance() {
    return freewayTravelDistance;
  }

  public void setFreewayTravelDistance(@Nullable Float freewayTravelDistance) {
    this.freewayTravelDistance = freewayTravelDistance;
  }

  public ConfigRoutingRequest sameStopBuffer(@Nullable Double sameStopBuffer) {
    this.sameStopBuffer = sameStopBuffer;
    return this;
  }

  /**
   * Get sameStopBuffer
   * @return sameStopBuffer
   */
  
  @Schema(name = "sameStopBuffer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sameStopBuffer")
  public @Nullable Double getSameStopBuffer() {
    return sameStopBuffer;
  }

  public void setSameStopBuffer(@Nullable Double sameStopBuffer) {
    this.sameStopBuffer = sameStopBuffer;
  }

  public ConfigRoutingRequest orderAlgorithm(@Nullable OrderAlgorithmEnum orderAlgorithm) {
    this.orderAlgorithm = orderAlgorithm;
    return this;
  }

  /**
   * Get orderAlgorithm
   * @return orderAlgorithm
   */
  
  @Schema(name = "orderAlgorithm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderAlgorithm")
  public @Nullable OrderAlgorithmEnum getOrderAlgorithm() {
    return orderAlgorithm;
  }

  public void setOrderAlgorithm(@Nullable OrderAlgorithmEnum orderAlgorithm) {
    this.orderAlgorithm = orderAlgorithm;
  }

  public ConfigRoutingRequest scoreAlgorithm(@Nullable ScoreAlgorithmEnum scoreAlgorithm) {
    this.scoreAlgorithm = scoreAlgorithm;
    return this;
  }

  /**
   * Get scoreAlgorithm
   * @return scoreAlgorithm
   */
  
  @Schema(name = "scoreAlgorithm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scoreAlgorithm")
  public @Nullable ScoreAlgorithmEnum getScoreAlgorithm() {
    return scoreAlgorithm;
  }

  public void setScoreAlgorithm(@Nullable ScoreAlgorithmEnum scoreAlgorithm) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

