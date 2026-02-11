package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Node;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NodeRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class NodeRequest {

  private @Nullable Integer x;

  private @Nullable Integer y;

  private @Nullable Integer z;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable Double altitude;

  private @Nullable Long date;

  private @Nullable Boolean isWaypoint;

  private @Nullable Long accountId;

  private @Nullable Node node;

  public NodeRequest x(@Nullable Integer x) {
    this.x = x;
    return this;
  }

  /**
   * Get x
   * @return x
   */
  
  @Schema(name = "x", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("x")
  public @Nullable Integer getX() {
    return x;
  }

  public void setX(@Nullable Integer x) {
    this.x = x;
  }

  public NodeRequest y(@Nullable Integer y) {
    this.y = y;
    return this;
  }

  /**
   * Get y
   * @return y
   */
  
  @Schema(name = "y", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("y")
  public @Nullable Integer getY() {
    return y;
  }

  public void setY(@Nullable Integer y) {
    this.y = y;
  }

  public NodeRequest z(@Nullable Integer z) {
    this.z = z;
    return this;
  }

  /**
   * Get z
   * @return z
   */
  
  @Schema(name = "z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("z")
  public @Nullable Integer getZ() {
    return z;
  }

  public void setZ(@Nullable Integer z) {
    this.z = z;
  }

  public NodeRequest latitude(@Nullable Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   */
  
  @Schema(name = "latitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public @Nullable Double getLatitude() {
    return latitude;
  }

  public void setLatitude(@Nullable Double latitude) {
    this.latitude = latitude;
  }

  public NodeRequest longitude(@Nullable Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
   */
  
  @Schema(name = "longitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public @Nullable Double getLongitude() {
    return longitude;
  }

  public void setLongitude(@Nullable Double longitude) {
    this.longitude = longitude;
  }

  public NodeRequest altitude(@Nullable Double altitude) {
    this.altitude = altitude;
    return this;
  }

  /**
   * Get altitude
   * @return altitude
   */
  
  @Schema(name = "altitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("altitude")
  public @Nullable Double getAltitude() {
    return altitude;
  }

  public void setAltitude(@Nullable Double altitude) {
    this.altitude = altitude;
  }

  public NodeRequest date(@Nullable Long date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   */
  
  @Schema(name = "date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public @Nullable Long getDate() {
    return date;
  }

  public void setDate(@Nullable Long date) {
    this.date = date;
  }

  public NodeRequest isWaypoint(@Nullable Boolean isWaypoint) {
    this.isWaypoint = isWaypoint;
    return this;
  }

  /**
   * Get isWaypoint
   * @return isWaypoint
   */
  
  @Schema(name = "isWaypoint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isWaypoint")
  public @Nullable Boolean getIsWaypoint() {
    return isWaypoint;
  }

  public void setIsWaypoint(@Nullable Boolean isWaypoint) {
    this.isWaypoint = isWaypoint;
  }

  public NodeRequest accountId(@Nullable Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
   */
  
  @Schema(name = "accountId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountId")
  public @Nullable Long getAccountId() {
    return accountId;
  }

  public void setAccountId(@Nullable Long accountId) {
    this.accountId = accountId;
  }

  public NodeRequest node(@Nullable Node node) {
    this.node = node;
    return this;
  }

  /**
   * Get node
   * @return node
   */
  @Valid 
  @Schema(name = "node", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("node")
  public @Nullable Node getNode() {
    return node;
  }

  public void setNode(@Nullable Node node) {
    this.node = node;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeRequest nodeRequest = (NodeRequest) o;
    return Objects.equals(this.x, nodeRequest.x) &&
        Objects.equals(this.y, nodeRequest.y) &&
        Objects.equals(this.z, nodeRequest.z) &&
        Objects.equals(this.latitude, nodeRequest.latitude) &&
        Objects.equals(this.longitude, nodeRequest.longitude) &&
        Objects.equals(this.altitude, nodeRequest.altitude) &&
        Objects.equals(this.date, nodeRequest.date) &&
        Objects.equals(this.isWaypoint, nodeRequest.isWaypoint) &&
        Objects.equals(this.accountId, nodeRequest.accountId) &&
        Objects.equals(this.node, nodeRequest.node);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z, latitude, longitude, altitude, date, isWaypoint, accountId, node);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeRequest {\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    z: ").append(toIndentedString(z)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    isWaypoint: ").append(toIndentedString(isWaypoint)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
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

