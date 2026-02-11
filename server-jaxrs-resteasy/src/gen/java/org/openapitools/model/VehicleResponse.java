package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GeoResponse;
import org.openapitools.model.StopResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class VehicleResponse   {
  
  private String id;
  private String name;
  private Long capacity;
  private GeoResponse depot;
  private Long startWindow;
  private Long endWindow;
  private GeoResponse current;
  private StopResponse depotAsStop;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("capacity")
  public Long getCapacity() {
    return capacity;
  }
  public void setCapacity(Long capacity) {
    this.capacity = capacity;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("depot")
  @Valid
  public GeoResponse getDepot() {
    return depot;
  }
  public void setDepot(GeoResponse depot) {
    this.depot = depot;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startWindow")
  public Long getStartWindow() {
    return startWindow;
  }
  public void setStartWindow(Long startWindow) {
    this.startWindow = startWindow;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endWindow")
  public Long getEndWindow() {
    return endWindow;
  }
  public void setEndWindow(Long endWindow) {
    this.endWindow = endWindow;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("current")
  @Valid
  public GeoResponse getCurrent() {
    return current;
  }
  public void setCurrent(GeoResponse current) {
    this.current = current;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("depotAsStop")
  @Valid
  public StopResponse getDepotAsStop() {
    return depotAsStop;
  }
  public void setDepotAsStop(StopResponse depotAsStop) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

