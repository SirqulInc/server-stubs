package apimodels;

import apimodels.AvailabilityResponse;
import apimodels.LocationResponse;
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
 * DriverResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DriverResponse   {
  @JsonProperty("id")
  
  private String id;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("depot")
  @Valid

  private LocationResponse depot;

  @JsonProperty("availability")
  @Valid

  private List<@Valid AvailabilityResponse> availability = null;

  public DriverResponse id(String id) {
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

  public DriverResponse name(String name) {
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

  public DriverResponse depot(LocationResponse depot) {
    this.depot = depot;
    return this;
  }

   /**
   * Get depot
   * @return depot
  **/
  public LocationResponse getDepot() {
    return depot;
  }

  public void setDepot(LocationResponse depot) {
    this.depot = depot;
  }

  public DriverResponse availability(List<@Valid AvailabilityResponse> availability) {
    this.availability = availability;
    return this;
  }

  public DriverResponse addAvailabilityItem(AvailabilityResponse availabilityItem) {
    if (this.availability == null) {
      this.availability = new ArrayList<>();
    }
    this.availability.add(availabilityItem);
    return this;
  }

   /**
   * Get availability
   * @return availability
  **/
  public List<@Valid AvailabilityResponse> getAvailability() {
    return availability;
  }

  public void setAvailability(List<@Valid AvailabilityResponse> availability) {
    this.availability = availability;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverResponse driverResponse = (DriverResponse) o;
    return Objects.equals(id, driverResponse.id) &&
        Objects.equals(name, driverResponse.name) &&
        Objects.equals(depot, driverResponse.depot) &&
        Objects.equals(availability, driverResponse.availability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, depot, availability);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    depot: ").append(toIndentedString(depot)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
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

