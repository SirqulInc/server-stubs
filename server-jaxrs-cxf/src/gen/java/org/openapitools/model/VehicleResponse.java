package org.openapitools.model;

import org.openapitools.model.GeoResponse;
import org.openapitools.model.StopResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class VehicleResponse  {
  
  @ApiModelProperty(value = "")

  private String id;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private Long capacity;

  @ApiModelProperty(value = "")

  @Valid

  private GeoResponse depot;

  @ApiModelProperty(value = "")

  private Long startWindow;

  @ApiModelProperty(value = "")

  private Long endWindow;

  @ApiModelProperty(value = "")

  @Valid

  private GeoResponse current;

  @ApiModelProperty(value = "")

  @Valid

  private StopResponse depotAsStop;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VehicleResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VehicleResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get capacity
   * @return capacity
  **/
  @JsonProperty("capacity")
  public Long getCapacity() {
    return capacity;
  }

  public void setCapacity(Long capacity) {
    this.capacity = capacity;
  }

  public VehicleResponse capacity(Long capacity) {
    this.capacity = capacity;
    return this;
  }

 /**
   * Get depot
   * @return depot
  **/
  @JsonProperty("depot")
  public GeoResponse getDepot() {
    return depot;
  }

  public void setDepot(GeoResponse depot) {
    this.depot = depot;
  }

  public VehicleResponse depot(GeoResponse depot) {
    this.depot = depot;
    return this;
  }

 /**
   * Get startWindow
   * @return startWindow
  **/
  @JsonProperty("startWindow")
  public Long getStartWindow() {
    return startWindow;
  }

  public void setStartWindow(Long startWindow) {
    this.startWindow = startWindow;
  }

  public VehicleResponse startWindow(Long startWindow) {
    this.startWindow = startWindow;
    return this;
  }

 /**
   * Get endWindow
   * @return endWindow
  **/
  @JsonProperty("endWindow")
  public Long getEndWindow() {
    return endWindow;
  }

  public void setEndWindow(Long endWindow) {
    this.endWindow = endWindow;
  }

  public VehicleResponse endWindow(Long endWindow) {
    this.endWindow = endWindow;
    return this;
  }

 /**
   * Get current
   * @return current
  **/
  @JsonProperty("current")
  public GeoResponse getCurrent() {
    return current;
  }

  public void setCurrent(GeoResponse current) {
    this.current = current;
  }

  public VehicleResponse current(GeoResponse current) {
    this.current = current;
    return this;
  }

 /**
   * Get depotAsStop
   * @return depotAsStop
  **/
  @JsonProperty("depotAsStop")
  public StopResponse getDepotAsStop() {
    return depotAsStop;
  }

  public void setDepotAsStop(StopResponse depotAsStop) {
    this.depotAsStop = depotAsStop;
  }

  public VehicleResponse depotAsStop(StopResponse depotAsStop) {
    this.depotAsStop = depotAsStop;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

