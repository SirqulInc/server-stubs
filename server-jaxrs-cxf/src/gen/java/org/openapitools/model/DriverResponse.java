package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AvailabilityResponse;
import org.openapitools.model.LocationResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DriverResponse  {
  
  @ApiModelProperty(value = "")

  private String id;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  @Valid

  private LocationResponse depot;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid AvailabilityResponse> availability = new ArrayList<>();
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

  public DriverResponse id(String id) {
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

  public DriverResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get depot
   * @return depot
  **/
  @JsonProperty("depot")
  public LocationResponse getDepot() {
    return depot;
  }

  public void setDepot(LocationResponse depot) {
    this.depot = depot;
  }

  public DriverResponse depot(LocationResponse depot) {
    this.depot = depot;
    return this;
  }

 /**
   * Get availability
   * @return availability
  **/
  @JsonProperty("availability")
  public List<@Valid AvailabilityResponse> getAvailability() {
    return availability;
  }

  public void setAvailability(List<@Valid AvailabilityResponse> availability) {
    this.availability = availability;
  }

  public DriverResponse availability(List<@Valid AvailabilityResponse> availability) {
    this.availability = availability;
    return this;
  }

  public DriverResponse addAvailabilityItem(AvailabilityResponse availabilityItem) {
    this.availability.add(availabilityItem);
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
    DriverResponse driverResponse = (DriverResponse) o;
    return Objects.equals(this.id, driverResponse.id) &&
        Objects.equals(this.name, driverResponse.name) &&
        Objects.equals(this.depot, driverResponse.depot) &&
        Objects.equals(this.availability, driverResponse.availability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, depot, availability);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

