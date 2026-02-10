package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConfigRoutingRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConfigRoutingRequest   {
  @JsonProperty("debugMode")
  
  private Boolean debugMode;

  @JsonProperty("threaded")
  
  private Boolean threaded;

  @JsonProperty("threadType")
  
  private String threadType;

  @JsonProperty("maxRuntime")
  
  private Long maxRuntime;

  @JsonProperty("numberOfMatches")
  
  private Integer numberOfMatches;

  @JsonProperty("maxItineraryTime")
  
  private Integer maxItineraryTime;

  @JsonProperty("maxStopsPerVehicle")
  
  private Integer maxStopsPerVehicle;

  @JsonProperty("averageCityTimePerMile")
  
  private Integer averageCityTimePerMile;

  @JsonProperty("averageFreewayTimePerMile")
  
  private Integer averageFreewayTimePerMile;

  @JsonProperty("freewayTravelDistance")
  
  private Float freewayTravelDistance;

  @JsonProperty("sameStopBuffer")
  
  private Double sameStopBuffer;

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

  @JsonProperty("orderAlgorithm")
  
  private OrderAlgorithmEnum orderAlgorithm;

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

  @JsonProperty("scoreAlgorithm")
  
  private ScoreAlgorithmEnum scoreAlgorithm;

  public ConfigRoutingRequest debugMode(Boolean debugMode) {
    this.debugMode = debugMode;
    return this;
  }

   /**
   * Get debugMode
   * @return debugMode
  **/
  public Boolean getDebugMode() {
    return debugMode;
  }

  public void setDebugMode(Boolean debugMode) {
    this.debugMode = debugMode;
  }

  public ConfigRoutingRequest threaded(Boolean threaded) {
    this.threaded = threaded;
    return this;
  }

   /**
   * Get threaded
   * @return threaded
  **/
  public Boolean getThreaded() {
    return threaded;
  }

  public void setThreaded(Boolean threaded) {
    this.threaded = threaded;
  }

  public ConfigRoutingRequest threadType(String threadType) {
    this.threadType = threadType;
    return this;
  }

   /**
   * Get threadType
   * @return threadType
  **/
  public String getThreadType() {
    return threadType;
  }

  public void setThreadType(String threadType) {
    this.threadType = threadType;
  }

  public ConfigRoutingRequest maxRuntime(Long maxRuntime) {
    this.maxRuntime = maxRuntime;
    return this;
  }

   /**
   * Get maxRuntime
   * @return maxRuntime
  **/
  public Long getMaxRuntime() {
    return maxRuntime;
  }

  public void setMaxRuntime(Long maxRuntime) {
    this.maxRuntime = maxRuntime;
  }

  public ConfigRoutingRequest numberOfMatches(Integer numberOfMatches) {
    this.numberOfMatches = numberOfMatches;
    return this;
  }

   /**
   * Get numberOfMatches
   * @return numberOfMatches
  **/
  public Integer getNumberOfMatches() {
    return numberOfMatches;
  }

  public void setNumberOfMatches(Integer numberOfMatches) {
    this.numberOfMatches = numberOfMatches;
  }

  public ConfigRoutingRequest maxItineraryTime(Integer maxItineraryTime) {
    this.maxItineraryTime = maxItineraryTime;
    return this;
  }

   /**
   * Get maxItineraryTime
   * @return maxItineraryTime
  **/
  public Integer getMaxItineraryTime() {
    return maxItineraryTime;
  }

  public void setMaxItineraryTime(Integer maxItineraryTime) {
    this.maxItineraryTime = maxItineraryTime;
  }

  public ConfigRoutingRequest maxStopsPerVehicle(Integer maxStopsPerVehicle) {
    this.maxStopsPerVehicle = maxStopsPerVehicle;
    return this;
  }

   /**
   * Get maxStopsPerVehicle
   * @return maxStopsPerVehicle
  **/
  public Integer getMaxStopsPerVehicle() {
    return maxStopsPerVehicle;
  }

  public void setMaxStopsPerVehicle(Integer maxStopsPerVehicle) {
    this.maxStopsPerVehicle = maxStopsPerVehicle;
  }

  public ConfigRoutingRequest averageCityTimePerMile(Integer averageCityTimePerMile) {
    this.averageCityTimePerMile = averageCityTimePerMile;
    return this;
  }

   /**
   * Get averageCityTimePerMile
   * @return averageCityTimePerMile
  **/
  public Integer getAverageCityTimePerMile() {
    return averageCityTimePerMile;
  }

  public void setAverageCityTimePerMile(Integer averageCityTimePerMile) {
    this.averageCityTimePerMile = averageCityTimePerMile;
  }

  public ConfigRoutingRequest averageFreewayTimePerMile(Integer averageFreewayTimePerMile) {
    this.averageFreewayTimePerMile = averageFreewayTimePerMile;
    return this;
  }

   /**
   * Get averageFreewayTimePerMile
   * @return averageFreewayTimePerMile
  **/
  public Integer getAverageFreewayTimePerMile() {
    return averageFreewayTimePerMile;
  }

  public void setAverageFreewayTimePerMile(Integer averageFreewayTimePerMile) {
    this.averageFreewayTimePerMile = averageFreewayTimePerMile;
  }

  public ConfigRoutingRequest freewayTravelDistance(Float freewayTravelDistance) {
    this.freewayTravelDistance = freewayTravelDistance;
    return this;
  }

   /**
   * Get freewayTravelDistance
   * @return freewayTravelDistance
  **/
  public Float getFreewayTravelDistance() {
    return freewayTravelDistance;
  }

  public void setFreewayTravelDistance(Float freewayTravelDistance) {
    this.freewayTravelDistance = freewayTravelDistance;
  }

  public ConfigRoutingRequest sameStopBuffer(Double sameStopBuffer) {
    this.sameStopBuffer = sameStopBuffer;
    return this;
  }

   /**
   * Get sameStopBuffer
   * @return sameStopBuffer
  **/
  public Double getSameStopBuffer() {
    return sameStopBuffer;
  }

  public void setSameStopBuffer(Double sameStopBuffer) {
    this.sameStopBuffer = sameStopBuffer;
  }

  public ConfigRoutingRequest orderAlgorithm(OrderAlgorithmEnum orderAlgorithm) {
    this.orderAlgorithm = orderAlgorithm;
    return this;
  }

   /**
   * Get orderAlgorithm
   * @return orderAlgorithm
  **/
  public OrderAlgorithmEnum getOrderAlgorithm() {
    return orderAlgorithm;
  }

  public void setOrderAlgorithm(OrderAlgorithmEnum orderAlgorithm) {
    this.orderAlgorithm = orderAlgorithm;
  }

  public ConfigRoutingRequest scoreAlgorithm(ScoreAlgorithmEnum scoreAlgorithm) {
    this.scoreAlgorithm = scoreAlgorithm;
    return this;
  }

   /**
   * Get scoreAlgorithm
   * @return scoreAlgorithm
  **/
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
    return Objects.equals(debugMode, configRoutingRequest.debugMode) &&
        Objects.equals(threaded, configRoutingRequest.threaded) &&
        Objects.equals(threadType, configRoutingRequest.threadType) &&
        Objects.equals(maxRuntime, configRoutingRequest.maxRuntime) &&
        Objects.equals(numberOfMatches, configRoutingRequest.numberOfMatches) &&
        Objects.equals(maxItineraryTime, configRoutingRequest.maxItineraryTime) &&
        Objects.equals(maxStopsPerVehicle, configRoutingRequest.maxStopsPerVehicle) &&
        Objects.equals(averageCityTimePerMile, configRoutingRequest.averageCityTimePerMile) &&
        Objects.equals(averageFreewayTimePerMile, configRoutingRequest.averageFreewayTimePerMile) &&
        Objects.equals(freewayTravelDistance, configRoutingRequest.freewayTravelDistance) &&
        Objects.equals(sameStopBuffer, configRoutingRequest.sameStopBuffer) &&
        Objects.equals(orderAlgorithm, configRoutingRequest.orderAlgorithm) &&
        Objects.equals(scoreAlgorithm, configRoutingRequest.scoreAlgorithm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(debugMode, threaded, threadType, maxRuntime, numberOfMatches, maxItineraryTime, maxStopsPerVehicle, averageCityTimePerMile, averageFreewayTimePerMile, freewayTravelDistance, sameStopBuffer, orderAlgorithm, scoreAlgorithm);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

