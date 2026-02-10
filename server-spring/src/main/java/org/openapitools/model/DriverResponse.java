package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AvailabilityResponse;
import org.openapitools.model.LocationResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DriverResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class DriverResponse {

  private @Nullable String id;

  private @Nullable String name;

  private @Nullable LocationResponse depot;

  @Valid
  private List<@Valid AvailabilityResponse> availability = new ArrayList<>();

  public DriverResponse id(@Nullable String id) {
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

  public DriverResponse name(@Nullable String name) {
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

  public DriverResponse depot(@Nullable LocationResponse depot) {
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
  public @Nullable LocationResponse getDepot() {
    return depot;
  }

  public void setDepot(@Nullable LocationResponse depot) {
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
   */
  @Valid 
  @Schema(name = "availability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availability")
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

