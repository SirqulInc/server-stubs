package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.ConfigRoutingRequest;
import org.openapitools.model.DriverResponse;
import org.openapitools.model.ItineraryResponse;
import org.openapitools.model.LoadResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.VehicleResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RoutingResponse  {
  
  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String message;

  @ApiModelProperty(value = "")

  private Double version;

  @ApiModelProperty(value = "")

  private Boolean serializeNulls;

  @ApiModelProperty(value = "")

  private Long startTimeLog;

  @ApiModelProperty(value = "")

  private String errorCode;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid LoadResponse> items = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid VehicleResponse> vehicles = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid DriverResponse> drivers = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private ConfigRoutingRequest config;

  @ApiModelProperty(value = "")

  private String error;

  @ApiModelProperty(value = "")

  private List<String> debug = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Date startTime;

  @ApiModelProperty(value = "")

  private Date endTime;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid RoutingResponse> responses = new ArrayList<>();

  @ApiModelProperty(value = "")

  private String orignalRequest;

  @ApiModelProperty(value = "")

  private Boolean generated;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid ItineraryResponse> itineraries = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long score;

  @ApiModelProperty(value = "")

  private Integer loadSize;

  @ApiModelProperty(value = "")

  private Long runtime;

  @ApiModelProperty(value = "")

  private Long earliestPickupWindow;

  @ApiModelProperty(value = "")

  private Long latestPickupWindow;

  @ApiModelProperty(value = "")

  private String returning;
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

  public RoutingResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RoutingResponse message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public RoutingResponse version(Double version) {
    this.version = version;
    return this;
  }

 /**
   * Get serializeNulls
   * @return serializeNulls
  **/
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public RoutingResponse serializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

 /**
   * Get startTimeLog
   * @return startTimeLog
  **/
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public RoutingResponse startTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

 /**
   * Get errorCode
   * @return errorCode
  **/
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public RoutingResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

 /**
   * Get request
   * @return request
  **/
  @JsonProperty("request")
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public RoutingResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public RoutingResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<@Valid LoadResponse> getItems() {
    return items;
  }

  public void setItems(List<@Valid LoadResponse> items) {
    this.items = items;
  }

  public RoutingResponse items(List<@Valid LoadResponse> items) {
    this.items = items;
    return this;
  }

  public RoutingResponse addItemsItem(LoadResponse itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
   * Get vehicles
   * @return vehicles
  **/
  @JsonProperty("vehicles")
  public List<@Valid VehicleResponse> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<@Valid VehicleResponse> vehicles) {
    this.vehicles = vehicles;
  }

  public RoutingResponse vehicles(List<@Valid VehicleResponse> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public RoutingResponse addVehiclesItem(VehicleResponse vehiclesItem) {
    this.vehicles.add(vehiclesItem);
    return this;
  }

 /**
   * Get drivers
   * @return drivers
  **/
  @JsonProperty("drivers")
  public List<@Valid DriverResponse> getDrivers() {
    return drivers;
  }

  public void setDrivers(List<@Valid DriverResponse> drivers) {
    this.drivers = drivers;
  }

  public RoutingResponse drivers(List<@Valid DriverResponse> drivers) {
    this.drivers = drivers;
    return this;
  }

  public RoutingResponse addDriversItem(DriverResponse driversItem) {
    this.drivers.add(driversItem);
    return this;
  }

 /**
   * Get config
   * @return config
  **/
  @JsonProperty("config")
  public ConfigRoutingRequest getConfig() {
    return config;
  }

  public void setConfig(ConfigRoutingRequest config) {
    this.config = config;
  }

  public RoutingResponse config(ConfigRoutingRequest config) {
    this.config = config;
    return this;
  }

 /**
   * Get error
   * @return error
  **/
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public RoutingResponse error(String error) {
    this.error = error;
    return this;
  }

 /**
   * Get debug
   * @return debug
  **/
  @JsonProperty("debug")
  public List<String> getDebug() {
    return debug;
  }

  public void setDebug(List<String> debug) {
    this.debug = debug;
  }

  public RoutingResponse debug(List<String> debug) {
    this.debug = debug;
    return this;
  }

  public RoutingResponse addDebugItem(String debugItem) {
    this.debug.add(debugItem);
    return this;
  }

 /**
   * Get startTime
   * @return startTime
  **/
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }

  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  public RoutingResponse startTime(Date startTime) {
    this.startTime = startTime;
    return this;
  }

 /**
   * Get endTime
   * @return endTime
  **/
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  public RoutingResponse endTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }

 /**
   * Get responses
   * @return responses
  **/
  @JsonProperty("responses")
  public List<@Valid RoutingResponse> getResponses() {
    return responses;
  }

  public void setResponses(List<@Valid RoutingResponse> responses) {
    this.responses = responses;
  }

  public RoutingResponse responses(List<@Valid RoutingResponse> responses) {
    this.responses = responses;
    return this;
  }

  public RoutingResponse addResponsesItem(RoutingResponse responsesItem) {
    this.responses.add(responsesItem);
    return this;
  }

 /**
   * Get orignalRequest
   * @return orignalRequest
  **/
  @JsonProperty("orignalRequest")
  public String getOrignalRequest() {
    return orignalRequest;
  }

  public void setOrignalRequest(String orignalRequest) {
    this.orignalRequest = orignalRequest;
  }

  public RoutingResponse orignalRequest(String orignalRequest) {
    this.orignalRequest = orignalRequest;
    return this;
  }

 /**
   * Get generated
   * @return generated
  **/
  @JsonProperty("generated")
  public Boolean getGenerated() {
    return generated;
  }

  public void setGenerated(Boolean generated) {
    this.generated = generated;
  }

  public RoutingResponse generated(Boolean generated) {
    this.generated = generated;
    return this;
  }

 /**
   * Get itineraries
   * @return itineraries
  **/
  @JsonProperty("itineraries")
  public List<@Valid ItineraryResponse> getItineraries() {
    return itineraries;
  }

  public void setItineraries(List<@Valid ItineraryResponse> itineraries) {
    this.itineraries = itineraries;
  }

  public RoutingResponse itineraries(List<@Valid ItineraryResponse> itineraries) {
    this.itineraries = itineraries;
    return this;
  }

  public RoutingResponse addItinerariesItem(ItineraryResponse itinerariesItem) {
    this.itineraries.add(itinerariesItem);
    return this;
  }

 /**
   * Get score
   * @return score
  **/
  @JsonProperty("score")
  public Long getScore() {
    return score;
  }

  public void setScore(Long score) {
    this.score = score;
  }

  public RoutingResponse score(Long score) {
    this.score = score;
    return this;
  }

 /**
   * Get loadSize
   * @return loadSize
  **/
  @JsonProperty("loadSize")
  public Integer getLoadSize() {
    return loadSize;
  }

  public void setLoadSize(Integer loadSize) {
    this.loadSize = loadSize;
  }

  public RoutingResponse loadSize(Integer loadSize) {
    this.loadSize = loadSize;
    return this;
  }

 /**
   * Get runtime
   * @return runtime
  **/
  @JsonProperty("runtime")
  public Long getRuntime() {
    return runtime;
  }

  public void setRuntime(Long runtime) {
    this.runtime = runtime;
  }

  public RoutingResponse runtime(Long runtime) {
    this.runtime = runtime;
    return this;
  }

 /**
   * Get earliestPickupWindow
   * @return earliestPickupWindow
  **/
  @JsonProperty("earliestPickupWindow")
  public Long getEarliestPickupWindow() {
    return earliestPickupWindow;
  }

  public void setEarliestPickupWindow(Long earliestPickupWindow) {
    this.earliestPickupWindow = earliestPickupWindow;
  }

  public RoutingResponse earliestPickupWindow(Long earliestPickupWindow) {
    this.earliestPickupWindow = earliestPickupWindow;
    return this;
  }

 /**
   * Get latestPickupWindow
   * @return latestPickupWindow
  **/
  @JsonProperty("latestPickupWindow")
  public Long getLatestPickupWindow() {
    return latestPickupWindow;
  }

  public void setLatestPickupWindow(Long latestPickupWindow) {
    this.latestPickupWindow = latestPickupWindow;
  }

  public RoutingResponse latestPickupWindow(Long latestPickupWindow) {
    this.latestPickupWindow = latestPickupWindow;
    return this;
  }

 /**
   * Get returning
   * @return returning
  **/
  @JsonProperty("returning")
  public String getReturning() {
    return returning;
  }

  public void setReturning(String returning) {
    this.returning = returning;
  }

  public RoutingResponse returning(String returning) {
    this.returning = returning;
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
    RoutingResponse routingResponse = (RoutingResponse) o;
    return Objects.equals(this.valid, routingResponse.valid) &&
        Objects.equals(this.message, routingResponse.message) &&
        Objects.equals(this.version, routingResponse.version) &&
        Objects.equals(this.serializeNulls, routingResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, routingResponse.startTimeLog) &&
        Objects.equals(this.errorCode, routingResponse.errorCode) &&
        Objects.equals(this.request, routingResponse.request) &&
        Objects.equals(this.items, routingResponse.items) &&
        Objects.equals(this.vehicles, routingResponse.vehicles) &&
        Objects.equals(this.drivers, routingResponse.drivers) &&
        Objects.equals(this.config, routingResponse.config) &&
        Objects.equals(this.error, routingResponse.error) &&
        Objects.equals(this.debug, routingResponse.debug) &&
        Objects.equals(this.startTime, routingResponse.startTime) &&
        Objects.equals(this.endTime, routingResponse.endTime) &&
        Objects.equals(this.responses, routingResponse.responses) &&
        Objects.equals(this.orignalRequest, routingResponse.orignalRequest) &&
        Objects.equals(this.generated, routingResponse.generated) &&
        Objects.equals(this.itineraries, routingResponse.itineraries) &&
        Objects.equals(this.score, routingResponse.score) &&
        Objects.equals(this.loadSize, routingResponse.loadSize) &&
        Objects.equals(this.runtime, routingResponse.runtime) &&
        Objects.equals(this.earliestPickupWindow, routingResponse.earliestPickupWindow) &&
        Objects.equals(this.latestPickupWindow, routingResponse.latestPickupWindow) &&
        Objects.equals(this.returning, routingResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, items, vehicles, drivers, config, error, debug, startTime, endTime, responses, orignalRequest, generated, itineraries, score, loadSize, runtime, earliestPickupWindow, latestPickupWindow, returning);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

