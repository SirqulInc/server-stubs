package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.openapitools.model.Shipment;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ShipmentImportStatus
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ShipmentImportStatus {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable String name;

  private @Nullable String batchId;

  private @Nullable String message;

  private @Nullable Shipment shipment;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime started;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime completed;

  public ShipmentImportStatus id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public ShipmentImportStatus active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  public ShipmentImportStatus valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public ShipmentImportStatus name(@Nullable String name) {
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

  public ShipmentImportStatus batchId(@Nullable String batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * Get batchId
   * @return batchId
   */
  
  @Schema(name = "batchId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("batchId")
  public @Nullable String getBatchId() {
    return batchId;
  }

  public void setBatchId(@Nullable String batchId) {
    this.batchId = batchId;
  }

  public ShipmentImportStatus message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  public ShipmentImportStatus shipment(@Nullable Shipment shipment) {
    this.shipment = shipment;
    return this;
  }

  /**
   * Get shipment
   * @return shipment
   */
  @Valid 
  @Schema(name = "shipment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipment")
  public @Nullable Shipment getShipment() {
    return shipment;
  }

  public void setShipment(@Nullable Shipment shipment) {
    this.shipment = shipment;
  }

  public ShipmentImportStatus started(@Nullable OffsetDateTime started) {
    this.started = started;
    return this;
  }

  /**
   * Get started
   * @return started
   */
  @Valid 
  @Schema(name = "started", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("started")
  public @Nullable OffsetDateTime getStarted() {
    return started;
  }

  public void setStarted(@Nullable OffsetDateTime started) {
    this.started = started;
  }

  public ShipmentImportStatus completed(@Nullable OffsetDateTime completed) {
    this.completed = completed;
    return this;
  }

  /**
   * Get completed
   * @return completed
   */
  @Valid 
  @Schema(name = "completed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completed")
  public @Nullable OffsetDateTime getCompleted() {
    return completed;
  }

  public void setCompleted(@Nullable OffsetDateTime completed) {
    this.completed = completed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentImportStatus shipmentImportStatus = (ShipmentImportStatus) o;
    return Objects.equals(this.id, shipmentImportStatus.id) &&
        Objects.equals(this.active, shipmentImportStatus.active) &&
        Objects.equals(this.valid, shipmentImportStatus.valid) &&
        Objects.equals(this.name, shipmentImportStatus.name) &&
        Objects.equals(this.batchId, shipmentImportStatus.batchId) &&
        Objects.equals(this.message, shipmentImportStatus.message) &&
        Objects.equals(this.shipment, shipmentImportStatus.shipment) &&
        Objects.equals(this.started, shipmentImportStatus.started) &&
        Objects.equals(this.completed, shipmentImportStatus.completed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, name, batchId, message, shipment, started, completed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentImportStatus {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    shipment: ").append(toIndentedString(shipment)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
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

