package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * LoadShortResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class LoadShortResponse {

  private @Nullable String id;

  private @Nullable String name;

  private @Nullable Long size;

  private @Nullable Long loadingTime;

  private @Nullable Boolean separatePayloads;

  private @Nullable StopResponse pickup;

  private @Nullable StopResponse dropoff;

  public LoadShortResponse id(@Nullable String id) {
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

  public LoadShortResponse name(@Nullable String name) {
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

  public LoadShortResponse size(@Nullable Long size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
   */
  
  @Schema(name = "size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public @Nullable Long getSize() {
    return size;
  }

  public void setSize(@Nullable Long size) {
    this.size = size;
  }

  public LoadShortResponse loadingTime(@Nullable Long loadingTime) {
    this.loadingTime = loadingTime;
    return this;
  }

  /**
   * Get loadingTime
   * @return loadingTime
   */
  
  @Schema(name = "loadingTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("loadingTime")
  public @Nullable Long getLoadingTime() {
    return loadingTime;
  }

  public void setLoadingTime(@Nullable Long loadingTime) {
    this.loadingTime = loadingTime;
  }

  public LoadShortResponse separatePayloads(@Nullable Boolean separatePayloads) {
    this.separatePayloads = separatePayloads;
    return this;
  }

  /**
   * Get separatePayloads
   * @return separatePayloads
   */
  
  @Schema(name = "separatePayloads", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("separatePayloads")
  public @Nullable Boolean getSeparatePayloads() {
    return separatePayloads;
  }

  public void setSeparatePayloads(@Nullable Boolean separatePayloads) {
    this.separatePayloads = separatePayloads;
  }

  public LoadShortResponse pickup(@Nullable StopResponse pickup) {
    this.pickup = pickup;
    return this;
  }

  /**
   * Get pickup
   * @return pickup
   */
  @Valid 
  @Schema(name = "pickup", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pickup")
  public @Nullable StopResponse getPickup() {
    return pickup;
  }

  public void setPickup(@Nullable StopResponse pickup) {
    this.pickup = pickup;
  }

  public LoadShortResponse dropoff(@Nullable StopResponse dropoff) {
    this.dropoff = dropoff;
    return this;
  }

  /**
   * Get dropoff
   * @return dropoff
   */
  @Valid 
  @Schema(name = "dropoff", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dropoff")
  public @Nullable StopResponse getDropoff() {
    return dropoff;
  }

  public void setDropoff(@Nullable StopResponse dropoff) {
    this.dropoff = dropoff;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadShortResponse loadShortResponse = (LoadShortResponse) o;
    return Objects.equals(this.id, loadShortResponse.id) &&
        Objects.equals(this.name, loadShortResponse.name) &&
        Objects.equals(this.size, loadShortResponse.size) &&
        Objects.equals(this.loadingTime, loadShortResponse.loadingTime) &&
        Objects.equals(this.separatePayloads, loadShortResponse.separatePayloads) &&
        Objects.equals(this.pickup, loadShortResponse.pickup) &&
        Objects.equals(this.dropoff, loadShortResponse.dropoff);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, size, loadingTime, separatePayloads, pickup, dropoff);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadShortResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    loadingTime: ").append(toIndentedString(loadingTime)).append("\n");
    sb.append("    separatePayloads: ").append(toIndentedString(separatePayloads)).append("\n");
    sb.append("    pickup: ").append(toIndentedString(pickup)).append("\n");
    sb.append("    dropoff: ").append(toIndentedString(dropoff)).append("\n");
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

