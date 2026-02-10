package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RoutingResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private List<@Valid LoadResponse> items = new ArrayList<>();
  private List<@Valid VehicleResponse> vehicles = new ArrayList<>();
  private List<@Valid DriverResponse> drivers = new ArrayList<>();
  private ConfigRoutingRequest config;
  private String error;
  private List<String> debug = new ArrayList<>();
  private Date startTime;
  private Date endTime;
  private List<@Valid RoutingResponse> responses = new ArrayList<>();
  private String orignalRequest;
  private Boolean generated;
  private List<@Valid ItineraryResponse> itineraries = new ArrayList<>();
  private Long score;
  private Integer loadSize;
  private Long runtime;
  private Long earliestPickupWindow;
  private Long latestPickupWindow;
  private String returning;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }
  public void setVersion(Double version) {
    this.version = version;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }
  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }
  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("request")
  @Valid
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }
  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("items")
  @Valid
  public List<@Valid LoadResponse> getItems() {
    return items;
  }
  public void setItems(List<@Valid LoadResponse> items) {
    this.items = items;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("vehicles")
  @Valid
  public List<@Valid VehicleResponse> getVehicles() {
    return vehicles;
  }
  public void setVehicles(List<@Valid VehicleResponse> vehicles) {
    this.vehicles = vehicles;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("drivers")
  @Valid
  public List<@Valid DriverResponse> getDrivers() {
    return drivers;
  }
  public void setDrivers(List<@Valid DriverResponse> drivers) {
    this.drivers = drivers;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("config")
  @Valid
  public ConfigRoutingRequest getConfig() {
    return config;
  }
  public void setConfig(ConfigRoutingRequest config) {
    this.config = config;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("error")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("debug")
  public List<String> getDebug() {
    return debug;
  }
  public void setDebug(List<String> debug) {
    this.debug = debug;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("responses")
  @Valid
  public List<@Valid RoutingResponse> getResponses() {
    return responses;
  }
  public void setResponses(List<@Valid RoutingResponse> responses) {
    this.responses = responses;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orignalRequest")
  public String getOrignalRequest() {
    return orignalRequest;
  }
  public void setOrignalRequest(String orignalRequest) {
    this.orignalRequest = orignalRequest;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("generated")
  public Boolean getGenerated() {
    return generated;
  }
  public void setGenerated(Boolean generated) {
    this.generated = generated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("itineraries")
  @Valid
  public List<@Valid ItineraryResponse> getItineraries() {
    return itineraries;
  }
  public void setItineraries(List<@Valid ItineraryResponse> itineraries) {
    this.itineraries = itineraries;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("score")
  public Long getScore() {
    return score;
  }
  public void setScore(Long score) {
    this.score = score;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("loadSize")
  public Integer getLoadSize() {
    return loadSize;
  }
  public void setLoadSize(Integer loadSize) {
    this.loadSize = loadSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("runtime")
  public Long getRuntime() {
    return runtime;
  }
  public void setRuntime(Long runtime) {
    this.runtime = runtime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("earliestPickupWindow")
  public Long getEarliestPickupWindow() {
    return earliestPickupWindow;
  }
  public void setEarliestPickupWindow(Long earliestPickupWindow) {
    this.earliestPickupWindow = earliestPickupWindow;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("latestPickupWindow")
  public Long getLatestPickupWindow() {
    return latestPickupWindow;
  }
  public void setLatestPickupWindow(Long latestPickupWindow) {
    this.latestPickupWindow = latestPickupWindow;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("returning")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

