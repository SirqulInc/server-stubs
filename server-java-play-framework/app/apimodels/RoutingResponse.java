package apimodels;

import apimodels.ConfigRoutingRequest;
import apimodels.DriverResponse;
import apimodels.ItineraryResponse;
import apimodels.LoadResponse;
import apimodels.NameStringValueResponse;
import apimodels.VehicleResponse;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RoutingResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RoutingResponse   {
  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("message")
  
  private String message;

  @JsonProperty("version")
  
  private Double version;

  @JsonProperty("serializeNulls")
  
  private Boolean serializeNulls;

  @JsonProperty("startTimeLog")
  
  private Long startTimeLog;

  @JsonProperty("errorCode")
  
  private String errorCode;

  @JsonProperty("request")
  @Valid

  private List<@Valid NameStringValueResponse> request = null;

  @JsonProperty("items")
  @Valid

  private List<@Valid LoadResponse> items = null;

  @JsonProperty("vehicles")
  @Valid

  private List<@Valid VehicleResponse> vehicles = null;

  @JsonProperty("drivers")
  @Valid

  private List<@Valid DriverResponse> drivers = null;

  @JsonProperty("config")
  @Valid

  private ConfigRoutingRequest config;

  @JsonProperty("error")
  
  private String error;

  @JsonProperty("debug")
  
  private List<String> debug = null;

  @JsonProperty("startTime")
  @Valid

  private OffsetDateTime startTime;

  @JsonProperty("endTime")
  @Valid

  private OffsetDateTime endTime;

  @JsonProperty("responses")
  @Valid

  private List<@Valid RoutingResponse> responses = null;

  @JsonProperty("orignalRequest")
  
  private String orignalRequest;

  @JsonProperty("generated")
  
  private Boolean generated;

  @JsonProperty("itineraries")
  @Valid

  private List<@Valid ItineraryResponse> itineraries = null;

  @JsonProperty("score")
  
  private Long score;

  @JsonProperty("loadSize")
  
  private Integer loadSize;

  @JsonProperty("runtime")
  
  private Long runtime;

  @JsonProperty("earliestPickupWindow")
  
  private Long earliestPickupWindow;

  @JsonProperty("latestPickupWindow")
  
  private Long latestPickupWindow;

  @JsonProperty("returning")
  
  private String returning;

  public RoutingResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public RoutingResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RoutingResponse version(Double version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public RoutingResponse serializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

   /**
   * Get serializeNulls
   * @return serializeNulls
  **/
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public RoutingResponse startTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

   /**
   * Get startTimeLog
   * @return startTimeLog
  **/
  public Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public RoutingResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public RoutingResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public RoutingResponse addRequestItem(NameStringValueResponse requestItem) {
    if (this.request == null) {
      this.request = new ArrayList<>();
    }
    this.request.add(requestItem);
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public RoutingResponse items(List<@Valid LoadResponse> items) {
    this.items = items;
    return this;
  }

  public RoutingResponse addItemsItem(LoadResponse itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  public List<@Valid LoadResponse> getItems() {
    return items;
  }

  public void setItems(List<@Valid LoadResponse> items) {
    this.items = items;
  }

  public RoutingResponse vehicles(List<@Valid VehicleResponse> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public RoutingResponse addVehiclesItem(VehicleResponse vehiclesItem) {
    if (this.vehicles == null) {
      this.vehicles = new ArrayList<>();
    }
    this.vehicles.add(vehiclesItem);
    return this;
  }

   /**
   * Get vehicles
   * @return vehicles
  **/
  public List<@Valid VehicleResponse> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<@Valid VehicleResponse> vehicles) {
    this.vehicles = vehicles;
  }

  public RoutingResponse drivers(List<@Valid DriverResponse> drivers) {
    this.drivers = drivers;
    return this;
  }

  public RoutingResponse addDriversItem(DriverResponse driversItem) {
    if (this.drivers == null) {
      this.drivers = new ArrayList<>();
    }
    this.drivers.add(driversItem);
    return this;
  }

   /**
   * Get drivers
   * @return drivers
  **/
  public List<@Valid DriverResponse> getDrivers() {
    return drivers;
  }

  public void setDrivers(List<@Valid DriverResponse> drivers) {
    this.drivers = drivers;
  }

  public RoutingResponse config(ConfigRoutingRequest config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  public ConfigRoutingRequest getConfig() {
    return config;
  }

  public void setConfig(ConfigRoutingRequest config) {
    this.config = config;
  }

  public RoutingResponse error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public RoutingResponse debug(List<String> debug) {
    this.debug = debug;
    return this;
  }

  public RoutingResponse addDebugItem(String debugItem) {
    if (this.debug == null) {
      this.debug = new ArrayList<>();
    }
    this.debug.add(debugItem);
    return this;
  }

   /**
   * Get debug
   * @return debug
  **/
  public List<String> getDebug() {
    return debug;
  }

  public void setDebug(List<String> debug) {
    this.debug = debug;
  }

  public RoutingResponse startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public RoutingResponse endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public RoutingResponse responses(List<@Valid RoutingResponse> responses) {
    this.responses = responses;
    return this;
  }

  public RoutingResponse addResponsesItem(RoutingResponse responsesItem) {
    if (this.responses == null) {
      this.responses = new ArrayList<>();
    }
    this.responses.add(responsesItem);
    return this;
  }

   /**
   * Get responses
   * @return responses
  **/
  public List<@Valid RoutingResponse> getResponses() {
    return responses;
  }

  public void setResponses(List<@Valid RoutingResponse> responses) {
    this.responses = responses;
  }

  public RoutingResponse orignalRequest(String orignalRequest) {
    this.orignalRequest = orignalRequest;
    return this;
  }

   /**
   * Get orignalRequest
   * @return orignalRequest
  **/
  public String getOrignalRequest() {
    return orignalRequest;
  }

  public void setOrignalRequest(String orignalRequest) {
    this.orignalRequest = orignalRequest;
  }

  public RoutingResponse generated(Boolean generated) {
    this.generated = generated;
    return this;
  }

   /**
   * Get generated
   * @return generated
  **/
  public Boolean getGenerated() {
    return generated;
  }

  public void setGenerated(Boolean generated) {
    this.generated = generated;
  }

  public RoutingResponse itineraries(List<@Valid ItineraryResponse> itineraries) {
    this.itineraries = itineraries;
    return this;
  }

  public RoutingResponse addItinerariesItem(ItineraryResponse itinerariesItem) {
    if (this.itineraries == null) {
      this.itineraries = new ArrayList<>();
    }
    this.itineraries.add(itinerariesItem);
    return this;
  }

   /**
   * Get itineraries
   * @return itineraries
  **/
  public List<@Valid ItineraryResponse> getItineraries() {
    return itineraries;
  }

  public void setItineraries(List<@Valid ItineraryResponse> itineraries) {
    this.itineraries = itineraries;
  }

  public RoutingResponse score(Long score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  public Long getScore() {
    return score;
  }

  public void setScore(Long score) {
    this.score = score;
  }

  public RoutingResponse loadSize(Integer loadSize) {
    this.loadSize = loadSize;
    return this;
  }

   /**
   * Get loadSize
   * @return loadSize
  **/
  public Integer getLoadSize() {
    return loadSize;
  }

  public void setLoadSize(Integer loadSize) {
    this.loadSize = loadSize;
  }

  public RoutingResponse runtime(Long runtime) {
    this.runtime = runtime;
    return this;
  }

   /**
   * Get runtime
   * @return runtime
  **/
  public Long getRuntime() {
    return runtime;
  }

  public void setRuntime(Long runtime) {
    this.runtime = runtime;
  }

  public RoutingResponse earliestPickupWindow(Long earliestPickupWindow) {
    this.earliestPickupWindow = earliestPickupWindow;
    return this;
  }

   /**
   * Get earliestPickupWindow
   * @return earliestPickupWindow
  **/
  public Long getEarliestPickupWindow() {
    return earliestPickupWindow;
  }

  public void setEarliestPickupWindow(Long earliestPickupWindow) {
    this.earliestPickupWindow = earliestPickupWindow;
  }

  public RoutingResponse latestPickupWindow(Long latestPickupWindow) {
    this.latestPickupWindow = latestPickupWindow;
    return this;
  }

   /**
   * Get latestPickupWindow
   * @return latestPickupWindow
  **/
  public Long getLatestPickupWindow() {
    return latestPickupWindow;
  }

  public void setLatestPickupWindow(Long latestPickupWindow) {
    this.latestPickupWindow = latestPickupWindow;
  }

  public RoutingResponse returning(String returning) {
    this.returning = returning;
    return this;
  }

   /**
   * Get returning
   * @return returning
  **/
  public String getReturning() {
    return returning;
  }

  public void setReturning(String returning) {
    this.returning = returning;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutingResponse routingResponse = (RoutingResponse) o;
    return Objects.equals(valid, routingResponse.valid) &&
        Objects.equals(message, routingResponse.message) &&
        Objects.equals(version, routingResponse.version) &&
        Objects.equals(serializeNulls, routingResponse.serializeNulls) &&
        Objects.equals(startTimeLog, routingResponse.startTimeLog) &&
        Objects.equals(errorCode, routingResponse.errorCode) &&
        Objects.equals(request, routingResponse.request) &&
        Objects.equals(items, routingResponse.items) &&
        Objects.equals(vehicles, routingResponse.vehicles) &&
        Objects.equals(drivers, routingResponse.drivers) &&
        Objects.equals(config, routingResponse.config) &&
        Objects.equals(error, routingResponse.error) &&
        Objects.equals(debug, routingResponse.debug) &&
        Objects.equals(startTime, routingResponse.startTime) &&
        Objects.equals(endTime, routingResponse.endTime) &&
        Objects.equals(responses, routingResponse.responses) &&
        Objects.equals(orignalRequest, routingResponse.orignalRequest) &&
        Objects.equals(generated, routingResponse.generated) &&
        Objects.equals(itineraries, routingResponse.itineraries) &&
        Objects.equals(score, routingResponse.score) &&
        Objects.equals(loadSize, routingResponse.loadSize) &&
        Objects.equals(runtime, routingResponse.runtime) &&
        Objects.equals(earliestPickupWindow, routingResponse.earliestPickupWindow) &&
        Objects.equals(latestPickupWindow, routingResponse.latestPickupWindow) &&
        Objects.equals(returning, routingResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, items, vehicles, drivers, config, error, debug, startTime, endTime, responses, orignalRequest, generated, itineraries, score, loadSize, runtime, earliestPickupWindow, latestPickupWindow, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
    sb.append("    drivers: ").append(toIndentedString(drivers)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    debug: ").append(toIndentedString(debug)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
    sb.append("    orignalRequest: ").append(toIndentedString(orignalRequest)).append("\n");
    sb.append("    generated: ").append(toIndentedString(generated)).append("\n");
    sb.append("    itineraries: ").append(toIndentedString(itineraries)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    loadSize: ").append(toIndentedString(loadSize)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    earliestPickupWindow: ").append(toIndentedString(earliestPickupWindow)).append("\n");
    sb.append("    latestPickupWindow: ").append(toIndentedString(latestPickupWindow)).append("\n");
    sb.append("    returning: ").append(toIndentedString(returning)).append("\n");
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

