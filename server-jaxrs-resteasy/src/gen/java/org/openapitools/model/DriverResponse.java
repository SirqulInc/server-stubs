package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AvailabilityResponse;
import org.openapitools.model.LocationResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class DriverResponse   {
  
  private String id;
  private String name;
  private LocationResponse depot;
  private List<@Valid AvailabilityResponse> availability = new ArrayList<>();

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
  @JsonProperty("depot")
  @Valid
  public LocationResponse getDepot() {
    return depot;
  }
  public void setDepot(LocationResponse depot) {
    this.depot = depot;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("availability")
  @Valid
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

