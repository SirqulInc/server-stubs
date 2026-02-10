package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.GeoResponse;
import org.openapitools.model.StopResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * VehicleResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class VehicleResponse {

  private @Nullable String id;

  private @Nullable String name;

  private @Nullable Long capacity;

  private @Nullable GeoResponse depot;

  private @Nullable Long startWindow;

  private @Nullable Long endWindow;

  private @Nullable GeoResponse current;

  private @Nullable StopResponse depotAsStop;

  public VehicleResponse id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public VehicleResponse name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public VehicleResponse capacity(@Nullable Long capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * Get capacity
   * @return capacity
   */
  
  @Schema(name = "capacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("capacity")
  public @Nullable Long getCapacity() {
    return capacity;
  }

  public void setCapacity(@Nullable Long capacity) {
    this.capacity = capacity;
  }

  public VehicleResponse depot(@Nullable GeoResponse depot) {
    this.depot = depot;
    return this;
  }

  /**
   * Get depot
   * @return depot
   */
  @Valid 
  @Schema(name = "depot", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("depot")
  public @Nullable GeoResponse getDepot() {
    return depot;
  }

  public void setDepot(@Nullable GeoResponse depot) {
    this.depot = depot;
  }

  public VehicleResponse startWindow(@Nullable Long startWindow) {
    this.startWindow = startWindow;
    return this;
  }

  /**
   * Get startWindow
   * @return startWindow
   */
  
  @Schema(name = "startWindow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startWindow")
  public @Nullable Long getStartWindow() {
    return startWindow;
  }

  public void setStartWindow(@Nullable Long startWindow) {
    this.startWindow = startWindow;
  }

  public VehicleResponse endWindow(@Nullable Long endWindow) {
    this.endWindow = endWindow;
    return this;
  }

  /**
   * Get endWindow
   * @return endWindow
   */
  
  @Schema(name = "endWindow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endWindow")
  public @Nullable Long getEndWindow() {
    return endWindow;
  }

  public void setEndWindow(@Nullable Long endWindow) {
    this.endWindow = endWindow;
  }

  public VehicleResponse current(@Nullable GeoResponse current) {
    this.current = current;
    return this;
  }

  /**
   * Get current
   * @return current
   */
  @Valid 
  @Schema(name = "current", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("current")
  public @Nullable GeoResponse getCurrent() {
    return current;
  }

  public void setCurrent(@Nullable GeoResponse current) {
    this.current = current;
  }

  public VehicleResponse depotAsStop(@Nullable StopResponse depotAsStop) {
    this.depotAsStop = depotAsStop;
    return this;
  }

  /**
   * Get depotAsStop
   * @return depotAsStop
   */
  @Valid 
  @Schema(name = "depotAsStop", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("depotAsStop")
  public @Nullable StopResponse getDepotAsStop() {
    return depotAsStop;
  }

  public void setDepotAsStop(@Nullable StopResponse depotAsStop) {
    this.depotAsStop = depotAsStop;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleResponse vehicleResponse = (VehicleResponse) o;
    return Objects.equals(this.id, vehicleResponse.id) &&
        Objects.equals(this.name, vehicleResponse.name) &&
        Objects.equals(this.capacity, vehicleResponse.capacity) &&
        Objects.equals(this.depot, vehicleResponse.depot) &&
        Objects.equals(this.startWindow, vehicleResponse.startWindow) &&
        Objects.equals(this.endWindow, vehicleResponse.endWindow) &&
        Objects.equals(this.current, vehicleResponse.current) &&
        Objects.equals(this.depotAsStop, vehicleResponse.depotAsStop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, capacity, depot, startWindow, endWindow, current, depotAsStop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    depot: ").append(toIndentedString(depot)).append("\n");
    sb.append("    startWindow: ").append(toIndentedString(startWindow)).append("\n");
    sb.append("    endWindow: ").append(toIndentedString(endWindow)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    depotAsStop: ").append(toIndentedString(depotAsStop)).append("\n");
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

