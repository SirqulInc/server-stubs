package apimodels;

import apimodels.GeoResponse;
import apimodels.StopResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * VehicleResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class VehicleResponse   {
  @JsonProperty("id")
  
  private String id;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("capacity")
  
  private Long capacity;

  @JsonProperty("depot")
  @Valid

  private GeoResponse depot;

  @JsonProperty("startWindow")
  
  private Long startWindow;

  @JsonProperty("endWindow")
  
  private Long endWindow;

  @JsonProperty("current")
  @Valid

  private GeoResponse current;

  @JsonProperty("depotAsStop")
  @Valid

  private StopResponse depotAsStop;

  public VehicleResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VehicleResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VehicleResponse capacity(Long capacity) {
    this.capacity = capacity;
    return this;
  }

   /**
   * Get capacity
   * @return capacity
  **/
  public Long getCapacity() {
    return capacity;
  }

  public void setCapacity(Long capacity) {
    this.capacity = capacity;
  }

  public VehicleResponse depot(GeoResponse depot) {
    this.depot = depot;
    return this;
  }

   /**
   * Get depot
   * @return depot
  **/
  public GeoResponse getDepot() {
    return depot;
  }

  public void setDepot(GeoResponse depot) {
    this.depot = depot;
  }

  public VehicleResponse startWindow(Long startWindow) {
    this.startWindow = startWindow;
    return this;
  }

   /**
   * Get startWindow
   * @return startWindow
  **/
  public Long getStartWindow() {
    return startWindow;
  }

  public void setStartWindow(Long startWindow) {
    this.startWindow = startWindow;
  }

  public VehicleResponse endWindow(Long endWindow) {
    this.endWindow = endWindow;
    return this;
  }

   /**
   * Get endWindow
   * @return endWindow
  **/
  public Long getEndWindow() {
    return endWindow;
  }

  public void setEndWindow(Long endWindow) {
    this.endWindow = endWindow;
  }

  public VehicleResponse current(GeoResponse current) {
    this.current = current;
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  public GeoResponse getCurrent() {
    return current;
  }

  public void setCurrent(GeoResponse current) {
    this.current = current;
  }

  public VehicleResponse depotAsStop(StopResponse depotAsStop) {
    this.depotAsStop = depotAsStop;
    return this;
  }

   /**
   * Get depotAsStop
   * @return depotAsStop
  **/
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
    return Objects.equals(id, vehicleResponse.id) &&
        Objects.equals(name, vehicleResponse.name) &&
        Objects.equals(capacity, vehicleResponse.capacity) &&
        Objects.equals(depot, vehicleResponse.depot) &&
        Objects.equals(startWindow, vehicleResponse.startWindow) &&
        Objects.equals(endWindow, vehicleResponse.endWindow) &&
        Objects.equals(current, vehicleResponse.current) &&
        Objects.equals(depotAsStop, vehicleResponse.depotAsStop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, capacity, depot, startWindow, endWindow, current, depotAsStop);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

