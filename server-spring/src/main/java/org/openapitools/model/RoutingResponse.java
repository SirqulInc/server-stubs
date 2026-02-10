package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConfigRoutingRequest;
import org.openapitools.model.DriverResponse;
import org.openapitools.model.ItineraryResponse;
import org.openapitools.model.LoadResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.VehicleResponse;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RoutingResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RoutingResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  @Valid
  private List<@Valid LoadResponse> items = new ArrayList<>();

  @Valid
  private List<@Valid VehicleResponse> vehicles = new ArrayList<>();

  @Valid
  private List<@Valid DriverResponse> drivers = new ArrayList<>();

  private @Nullable ConfigRoutingRequest config;

  private @Nullable String error;

  @Valid
  private List<String> debug = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime startTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime endTime;

  @Valid
  private List<@Valid RoutingResponse> responses = new ArrayList<>();

  private @Nullable String orignalRequest;

  private @Nullable Boolean generated;

  @Valid
  private List<@Valid ItineraryResponse> itineraries = new ArrayList<>();

  private @Nullable Long score;

  private @Nullable Integer loadSize;

  private @Nullable Long runtime;

  private @Nullable Long earliestPickupWindow;

  private @Nullable Long latestPickupWindow;

  private @Nullable String returning;

  public RoutingResponse valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public RoutingResponse message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  public RoutingResponse version(@Nullable Double version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public @Nullable Double getVersion() {
    return version;
  }

  public void setVersion(@Nullable Double version) {
    this.version = version;
  }

  public RoutingResponse serializeNulls(@Nullable Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

  /**
   * Get serializeNulls
   * @return serializeNulls
   */
  
  @Schema(name = "serializeNulls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serializeNulls")
  public @Nullable Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(@Nullable Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public RoutingResponse startTimeLog(@Nullable Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

  /**
   * Get startTimeLog
   * @return startTimeLog
   */
  
  @Schema(name = "startTimeLog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTimeLog")
  public @Nullable Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(@Nullable Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public RoutingResponse errorCode(@Nullable String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
   */
  
  @Schema(name = "errorCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCode")
  public @Nullable String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(@Nullable String errorCode) {
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
   */
  @Valid 
  @Schema(name = "request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("request")
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
   */
  @Valid 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
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
   */
  @Valid 
  @Schema(name = "vehicles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicles")
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
   */
  @Valid 
  @Schema(name = "drivers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drivers")
  public List<@Valid DriverResponse> getDrivers() {
    return drivers;
  }

  public void setDrivers(List<@Valid DriverResponse> drivers) {
    this.drivers = drivers;
  }

  public RoutingResponse config(@Nullable ConfigRoutingRequest config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   * @return config
   */
  @Valid 
  @Schema(name = "config", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("config")
  public @Nullable ConfigRoutingRequest getConfig() {
    return config;
  }

  public void setConfig(@Nullable ConfigRoutingRequest config) {
    this.config = config;
  }

  public RoutingResponse error(@Nullable String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  
  @Schema(name = "error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
  public @Nullable String getError() {
    return error;
  }

  public void setError(@Nullable String error) {
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
   */
  
  @Schema(name = "debug", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("debug")
  public List<String> getDebug() {
    return debug;
  }

  public void setDebug(List<String> debug) {
    this.debug = debug;
  }

  public RoutingResponse startTime(@Nullable OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
   */
  @Valid 
  @Schema(name = "startTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTime")
  public @Nullable OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(@Nullable OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public RoutingResponse endTime(@Nullable OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
   */
  @Valid 
  @Schema(name = "endTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endTime")
  public @Nullable OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(@Nullable OffsetDateTime endTime) {
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
   */
  @Valid 
  @Schema(name = "responses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("responses")
  public List<@Valid RoutingResponse> getResponses() {
    return responses;
  }

  public void setResponses(List<@Valid RoutingResponse> responses) {
    this.responses = responses;
  }

  public RoutingResponse orignalRequest(@Nullable String orignalRequest) {
    this.orignalRequest = orignalRequest;
    return this;
  }

  /**
   * Get orignalRequest
   * @return orignalRequest
   */
  
  @Schema(name = "orignalRequest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orignalRequest")
  public @Nullable String getOrignalRequest() {
    return orignalRequest;
  }

  public void setOrignalRequest(@Nullable String orignalRequest) {
    this.orignalRequest = orignalRequest;
  }

  public RoutingResponse generated(@Nullable Boolean generated) {
    this.generated = generated;
    return this;
  }

  /**
   * Get generated
   * @return generated
   */
  
  @Schema(name = "generated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generated")
  public @Nullable Boolean getGenerated() {
    return generated;
  }

  public void setGenerated(@Nullable Boolean generated) {
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
   */
  @Valid 
  @Schema(name = "itineraries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itineraries")
  public List<@Valid ItineraryResponse> getItineraries() {
    return itineraries;
  }

  public void setItineraries(List<@Valid ItineraryResponse> itineraries) {
    this.itineraries = itineraries;
  }

  public RoutingResponse score(@Nullable Long score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
   * @return score
   */
  
  @Schema(name = "score", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("score")
  public @Nullable Long getScore() {
    return score;
  }

  public void setScore(@Nullable Long score) {
    this.score = score;
  }

  public RoutingResponse loadSize(@Nullable Integer loadSize) {
    this.loadSize = loadSize;
    return this;
  }

  /**
   * Get loadSize
   * @return loadSize
   */
  
  @Schema(name = "loadSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("loadSize")
  public @Nullable Integer getLoadSize() {
    return loadSize;
  }

  public void setLoadSize(@Nullable Integer loadSize) {
    this.loadSize = loadSize;
  }

  public RoutingResponse runtime(@Nullable Long runtime) {
    this.runtime = runtime;
    return this;
  }

  /**
   * Get runtime
   * @return runtime
   */
  
  @Schema(name = "runtime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("runtime")
  public @Nullable Long getRuntime() {
    return runtime;
  }

  public void setRuntime(@Nullable Long runtime) {
    this.runtime = runtime;
  }

  public RoutingResponse earliestPickupWindow(@Nullable Long earliestPickupWindow) {
    this.earliestPickupWindow = earliestPickupWindow;
    return this;
  }

  /**
   * Get earliestPickupWindow
   * @return earliestPickupWindow
   */
  
  @Schema(name = "earliestPickupWindow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("earliestPickupWindow")
  public @Nullable Long getEarliestPickupWindow() {
    return earliestPickupWindow;
  }

  public void setEarliestPickupWindow(@Nullable Long earliestPickupWindow) {
    this.earliestPickupWindow = earliestPickupWindow;
  }

  public RoutingResponse latestPickupWindow(@Nullable Long latestPickupWindow) {
    this.latestPickupWindow = latestPickupWindow;
    return this;
  }

  /**
   * Get latestPickupWindow
   * @return latestPickupWindow
   */
  
  @Schema(name = "latestPickupWindow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latestPickupWindow")
  public @Nullable Long getLatestPickupWindow() {
    return latestPickupWindow;
  }

  public void setLatestPickupWindow(@Nullable Long latestPickupWindow) {
    this.latestPickupWindow = latestPickupWindow;
  }

  public RoutingResponse returning(@Nullable String returning) {
    this.returning = returning;
    return this;
  }

  /**
   * Get returning
   * @return returning
   */
  
  @Schema(name = "returning", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returning")
  public @Nullable String getReturning() {
    return returning;
  }

  public void setReturning(@Nullable String returning) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

