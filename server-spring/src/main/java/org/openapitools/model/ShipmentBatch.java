package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Program;
import org.openapitools.model.Retailer;
import org.openapitools.model.ServiceHub;
import org.openapitools.model.Shipment;
import org.openapitools.model.ShipmentImportStatus;
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
 * ShipmentBatch
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ShipmentBatch {

  private @Nullable Long id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime created;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime updated;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Retailer retailer;

  private @Nullable ServiceHub hub;

  private @Nullable Program program;

  @Valid
  private List<@Valid ShipmentImportStatus> shipmentImportStatuses = new ArrayList<>();

  @Valid
  private List<@Valid Shipment> shipments = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime uploaded;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime started;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime optimizationStarted;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime completed;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime optimizationCompleted;

  private @Nullable String source;

  private @Nullable String externalId;

  private @Nullable Integer total;

  private @Nullable Integer processedCount;

  private @Nullable Integer successCount;

  private @Nullable Integer failedCount;

  private @Nullable Integer validCount;

  private @Nullable Integer invalidCount;

  private @Nullable Double averageTravelSpeed;

  private @Nullable Long maxSeconds;

  /**
   * Gets or Sets importStatus
   */
  public enum ImportStatusEnum {
    NEW("NEW"),
    
    STARTED("STARTED"),
    
    FETCHING_DISTANCE_DATA("FETCHING_DISTANCE_DATA"),
    
    OPTIMIZING("OPTIMIZING"),
    
    CREATING_ROUTES("CREATING_ROUTES"),
    
    COMPLETED("COMPLETED"),
    
    INCOMPLETE("INCOMPLETE");

    private final String value;

    ImportStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ImportStatusEnum fromValue(String value) {
      for (ImportStatusEnum b : ImportStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ImportStatusEnum importStatus;

  private @Nullable Integer totalRoutes;

  private @Nullable Integer routesCreated;

  private @Nullable Integer totalLegsRequests;

  private @Nullable Integer legsRequested;

  private @Nullable Integer initScore;

  private @Nullable Long hardScore;

  private @Nullable Long mediumScore;

  private @Nullable Long softScore;

  public ShipmentBatch id(@Nullable Long id) {
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

  public ShipmentBatch created(@Nullable OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  @Valid 
  @Schema(name = "created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created")
  public @Nullable OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(@Nullable OffsetDateTime created) {
    this.created = created;
  }

  public ShipmentBatch updated(@Nullable OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
   */
  @Valid 
  @Schema(name = "updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated")
  public @Nullable OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(@Nullable OffsetDateTime updated) {
    this.updated = updated;
  }

  public ShipmentBatch active(@Nullable Boolean active) {
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

  public ShipmentBatch valid(@Nullable Boolean valid) {
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

  public ShipmentBatch retailer(@Nullable Retailer retailer) {
    this.retailer = retailer;
    return this;
  }

  /**
   * Get retailer
   * @return retailer
   */
  @Valid 
  @Schema(name = "retailer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retailer")
  public @Nullable Retailer getRetailer() {
    return retailer;
  }

  public void setRetailer(@Nullable Retailer retailer) {
    this.retailer = retailer;
  }

  public ShipmentBatch hub(@Nullable ServiceHub hub) {
    this.hub = hub;
    return this;
  }

  /**
   * Get hub
   * @return hub
   */
  @Valid 
  @Schema(name = "hub", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hub")
  public @Nullable ServiceHub getHub() {
    return hub;
  }

  public void setHub(@Nullable ServiceHub hub) {
    this.hub = hub;
  }

  public ShipmentBatch program(@Nullable Program program) {
    this.program = program;
    return this;
  }

  /**
   * Get program
   * @return program
   */
  @Valid 
  @Schema(name = "program", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("program")
  public @Nullable Program getProgram() {
    return program;
  }

  public void setProgram(@Nullable Program program) {
    this.program = program;
  }

  public ShipmentBatch shipmentImportStatuses(List<@Valid ShipmentImportStatus> shipmentImportStatuses) {
    this.shipmentImportStatuses = shipmentImportStatuses;
    return this;
  }

  public ShipmentBatch addShipmentImportStatusesItem(ShipmentImportStatus shipmentImportStatusesItem) {
    if (this.shipmentImportStatuses == null) {
      this.shipmentImportStatuses = new ArrayList<>();
    }
    this.shipmentImportStatuses.add(shipmentImportStatusesItem);
    return this;
  }

  /**
   * Get shipmentImportStatuses
   * @return shipmentImportStatuses
   */
  @Valid 
  @Schema(name = "shipmentImportStatuses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipmentImportStatuses")
  public List<@Valid ShipmentImportStatus> getShipmentImportStatuses() {
    return shipmentImportStatuses;
  }

  public void setShipmentImportStatuses(List<@Valid ShipmentImportStatus> shipmentImportStatuses) {
    this.shipmentImportStatuses = shipmentImportStatuses;
  }

  public ShipmentBatch shipments(List<@Valid Shipment> shipments) {
    this.shipments = shipments;
    return this;
  }

  public ShipmentBatch addShipmentsItem(Shipment shipmentsItem) {
    if (this.shipments == null) {
      this.shipments = new ArrayList<>();
    }
    this.shipments.add(shipmentsItem);
    return this;
  }

  /**
   * Get shipments
   * @return shipments
   */
  @Valid 
  @Schema(name = "shipments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipments")
  public List<@Valid Shipment> getShipments() {
    return shipments;
  }

  public void setShipments(List<@Valid Shipment> shipments) {
    this.shipments = shipments;
  }

  public ShipmentBatch uploaded(@Nullable OffsetDateTime uploaded) {
    this.uploaded = uploaded;
    return this;
  }

  /**
   * Get uploaded
   * @return uploaded
   */
  @Valid 
  @Schema(name = "uploaded", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uploaded")
  public @Nullable OffsetDateTime getUploaded() {
    return uploaded;
  }

  public void setUploaded(@Nullable OffsetDateTime uploaded) {
    this.uploaded = uploaded;
  }

  public ShipmentBatch started(@Nullable OffsetDateTime started) {
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

  public ShipmentBatch optimizationStarted(@Nullable OffsetDateTime optimizationStarted) {
    this.optimizationStarted = optimizationStarted;
    return this;
  }

  /**
   * Get optimizationStarted
   * @return optimizationStarted
   */
  @Valid 
  @Schema(name = "optimizationStarted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optimizationStarted")
  public @Nullable OffsetDateTime getOptimizationStarted() {
    return optimizationStarted;
  }

  public void setOptimizationStarted(@Nullable OffsetDateTime optimizationStarted) {
    this.optimizationStarted = optimizationStarted;
  }

  public ShipmentBatch completed(@Nullable OffsetDateTime completed) {
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

  public ShipmentBatch optimizationCompleted(@Nullable OffsetDateTime optimizationCompleted) {
    this.optimizationCompleted = optimizationCompleted;
    return this;
  }

  /**
   * Get optimizationCompleted
   * @return optimizationCompleted
   */
  @Valid 
  @Schema(name = "optimizationCompleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optimizationCompleted")
  public @Nullable OffsetDateTime getOptimizationCompleted() {
    return optimizationCompleted;
  }

  public void setOptimizationCompleted(@Nullable OffsetDateTime optimizationCompleted) {
    this.optimizationCompleted = optimizationCompleted;
  }

  public ShipmentBatch source(@Nullable String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   */
  
  @Schema(name = "source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source")
  public @Nullable String getSource() {
    return source;
  }

  public void setSource(@Nullable String source) {
    this.source = source;
  }

  public ShipmentBatch externalId(@Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
   */
  
  @Schema(name = "externalId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalId")
  public @Nullable String getExternalId() {
    return externalId;
  }

  public void setExternalId(@Nullable String externalId) {
    this.externalId = externalId;
  }

  public ShipmentBatch total(@Nullable Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
   */
  
  @Schema(name = "total", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public @Nullable Integer getTotal() {
    return total;
  }

  public void setTotal(@Nullable Integer total) {
    this.total = total;
  }

  public ShipmentBatch processedCount(@Nullable Integer processedCount) {
    this.processedCount = processedCount;
    return this;
  }

  /**
   * Get processedCount
   * @return processedCount
   */
  
  @Schema(name = "processedCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processedCount")
  public @Nullable Integer getProcessedCount() {
    return processedCount;
  }

  public void setProcessedCount(@Nullable Integer processedCount) {
    this.processedCount = processedCount;
  }

  public ShipmentBatch successCount(@Nullable Integer successCount) {
    this.successCount = successCount;
    return this;
  }

  /**
   * Get successCount
   * @return successCount
   */
  
  @Schema(name = "successCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("successCount")
  public @Nullable Integer getSuccessCount() {
    return successCount;
  }

  public void setSuccessCount(@Nullable Integer successCount) {
    this.successCount = successCount;
  }

  public ShipmentBatch failedCount(@Nullable Integer failedCount) {
    this.failedCount = failedCount;
    return this;
  }

  /**
   * Get failedCount
   * @return failedCount
   */
  
  @Schema(name = "failedCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failedCount")
  public @Nullable Integer getFailedCount() {
    return failedCount;
  }

  public void setFailedCount(@Nullable Integer failedCount) {
    this.failedCount = failedCount;
  }

  public ShipmentBatch validCount(@Nullable Integer validCount) {
    this.validCount = validCount;
    return this;
  }

  /**
   * Get validCount
   * @return validCount
   */
  
  @Schema(name = "validCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validCount")
  public @Nullable Integer getValidCount() {
    return validCount;
  }

  public void setValidCount(@Nullable Integer validCount) {
    this.validCount = validCount;
  }

  public ShipmentBatch invalidCount(@Nullable Integer invalidCount) {
    this.invalidCount = invalidCount;
    return this;
  }

  /**
   * Get invalidCount
   * @return invalidCount
   */
  
  @Schema(name = "invalidCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invalidCount")
  public @Nullable Integer getInvalidCount() {
    return invalidCount;
  }

  public void setInvalidCount(@Nullable Integer invalidCount) {
    this.invalidCount = invalidCount;
  }

  public ShipmentBatch averageTravelSpeed(@Nullable Double averageTravelSpeed) {
    this.averageTravelSpeed = averageTravelSpeed;
    return this;
  }

  /**
   * Get averageTravelSpeed
   * @return averageTravelSpeed
   */
  
  @Schema(name = "averageTravelSpeed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("averageTravelSpeed")
  public @Nullable Double getAverageTravelSpeed() {
    return averageTravelSpeed;
  }

  public void setAverageTravelSpeed(@Nullable Double averageTravelSpeed) {
    this.averageTravelSpeed = averageTravelSpeed;
  }

  public ShipmentBatch maxSeconds(@Nullable Long maxSeconds) {
    this.maxSeconds = maxSeconds;
    return this;
  }

  /**
   * Get maxSeconds
   * @return maxSeconds
   */
  
  @Schema(name = "maxSeconds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxSeconds")
  public @Nullable Long getMaxSeconds() {
    return maxSeconds;
  }

  public void setMaxSeconds(@Nullable Long maxSeconds) {
    this.maxSeconds = maxSeconds;
  }

  public ShipmentBatch importStatus(@Nullable ImportStatusEnum importStatus) {
    this.importStatus = importStatus;
    return this;
  }

  /**
   * Get importStatus
   * @return importStatus
   */
  
  @Schema(name = "importStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("importStatus")
  public @Nullable ImportStatusEnum getImportStatus() {
    return importStatus;
  }

  public void setImportStatus(@Nullable ImportStatusEnum importStatus) {
    this.importStatus = importStatus;
  }

  public ShipmentBatch totalRoutes(@Nullable Integer totalRoutes) {
    this.totalRoutes = totalRoutes;
    return this;
  }

  /**
   * Get totalRoutes
   * @return totalRoutes
   */
  
  @Schema(name = "totalRoutes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalRoutes")
  public @Nullable Integer getTotalRoutes() {
    return totalRoutes;
  }

  public void setTotalRoutes(@Nullable Integer totalRoutes) {
    this.totalRoutes = totalRoutes;
  }

  public ShipmentBatch routesCreated(@Nullable Integer routesCreated) {
    this.routesCreated = routesCreated;
    return this;
  }

  /**
   * Get routesCreated
   * @return routesCreated
   */
  
  @Schema(name = "routesCreated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("routesCreated")
  public @Nullable Integer getRoutesCreated() {
    return routesCreated;
  }

  public void setRoutesCreated(@Nullable Integer routesCreated) {
    this.routesCreated = routesCreated;
  }

  public ShipmentBatch totalLegsRequests(@Nullable Integer totalLegsRequests) {
    this.totalLegsRequests = totalLegsRequests;
    return this;
  }

  /**
   * Get totalLegsRequests
   * @return totalLegsRequests
   */
  
  @Schema(name = "totalLegsRequests", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalLegsRequests")
  public @Nullable Integer getTotalLegsRequests() {
    return totalLegsRequests;
  }

  public void setTotalLegsRequests(@Nullable Integer totalLegsRequests) {
    this.totalLegsRequests = totalLegsRequests;
  }

  public ShipmentBatch legsRequested(@Nullable Integer legsRequested) {
    this.legsRequested = legsRequested;
    return this;
  }

  /**
   * Get legsRequested
   * @return legsRequested
   */
  
  @Schema(name = "legsRequested", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("legsRequested")
  public @Nullable Integer getLegsRequested() {
    return legsRequested;
  }

  public void setLegsRequested(@Nullable Integer legsRequested) {
    this.legsRequested = legsRequested;
  }

  public ShipmentBatch initScore(@Nullable Integer initScore) {
    this.initScore = initScore;
    return this;
  }

  /**
   * Get initScore
   * @return initScore
   */
  
  @Schema(name = "initScore", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("initScore")
  public @Nullable Integer getInitScore() {
    return initScore;
  }

  public void setInitScore(@Nullable Integer initScore) {
    this.initScore = initScore;
  }

  public ShipmentBatch hardScore(@Nullable Long hardScore) {
    this.hardScore = hardScore;
    return this;
  }

  /**
   * Get hardScore
   * @return hardScore
   */
  
  @Schema(name = "hardScore", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hardScore")
  public @Nullable Long getHardScore() {
    return hardScore;
  }

  public void setHardScore(@Nullable Long hardScore) {
    this.hardScore = hardScore;
  }

  public ShipmentBatch mediumScore(@Nullable Long mediumScore) {
    this.mediumScore = mediumScore;
    return this;
  }

  /**
   * Get mediumScore
   * @return mediumScore
   */
  
  @Schema(name = "mediumScore", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mediumScore")
  public @Nullable Long getMediumScore() {
    return mediumScore;
  }

  public void setMediumScore(@Nullable Long mediumScore) {
    this.mediumScore = mediumScore;
  }

  public ShipmentBatch softScore(@Nullable Long softScore) {
    this.softScore = softScore;
    return this;
  }

  /**
   * Get softScore
   * @return softScore
   */
  
  @Schema(name = "softScore", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("softScore")
  public @Nullable Long getSoftScore() {
    return softScore;
  }

  public void setSoftScore(@Nullable Long softScore) {
    this.softScore = softScore;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentBatch shipmentBatch = (ShipmentBatch) o;
    return Objects.equals(this.id, shipmentBatch.id) &&
        Objects.equals(this.created, shipmentBatch.created) &&
        Objects.equals(this.updated, shipmentBatch.updated) &&
        Objects.equals(this.active, shipmentBatch.active) &&
        Objects.equals(this.valid, shipmentBatch.valid) &&
        Objects.equals(this.retailer, shipmentBatch.retailer) &&
        Objects.equals(this.hub, shipmentBatch.hub) &&
        Objects.equals(this.program, shipmentBatch.program) &&
        Objects.equals(this.shipmentImportStatuses, shipmentBatch.shipmentImportStatuses) &&
        Objects.equals(this.shipments, shipmentBatch.shipments) &&
        Objects.equals(this.uploaded, shipmentBatch.uploaded) &&
        Objects.equals(this.started, shipmentBatch.started) &&
        Objects.equals(this.optimizationStarted, shipmentBatch.optimizationStarted) &&
        Objects.equals(this.completed, shipmentBatch.completed) &&
        Objects.equals(this.optimizationCompleted, shipmentBatch.optimizationCompleted) &&
        Objects.equals(this.source, shipmentBatch.source) &&
        Objects.equals(this.externalId, shipmentBatch.externalId) &&
        Objects.equals(this.total, shipmentBatch.total) &&
        Objects.equals(this.processedCount, shipmentBatch.processedCount) &&
        Objects.equals(this.successCount, shipmentBatch.successCount) &&
        Objects.equals(this.failedCount, shipmentBatch.failedCount) &&
        Objects.equals(this.validCount, shipmentBatch.validCount) &&
        Objects.equals(this.invalidCount, shipmentBatch.invalidCount) &&
        Objects.equals(this.averageTravelSpeed, shipmentBatch.averageTravelSpeed) &&
        Objects.equals(this.maxSeconds, shipmentBatch.maxSeconds) &&
        Objects.equals(this.importStatus, shipmentBatch.importStatus) &&
        Objects.equals(this.totalRoutes, shipmentBatch.totalRoutes) &&
        Objects.equals(this.routesCreated, shipmentBatch.routesCreated) &&
        Objects.equals(this.totalLegsRequests, shipmentBatch.totalLegsRequests) &&
        Objects.equals(this.legsRequested, shipmentBatch.legsRequested) &&
        Objects.equals(this.initScore, shipmentBatch.initScore) &&
        Objects.equals(this.hardScore, shipmentBatch.hardScore) &&
        Objects.equals(this.mediumScore, shipmentBatch.mediumScore) &&
        Objects.equals(this.softScore, shipmentBatch.softScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, updated, active, valid, retailer, hub, program, shipmentImportStatuses, shipments, uploaded, started, optimizationStarted, completed, optimizationCompleted, source, externalId, total, processedCount, successCount, failedCount, validCount, invalidCount, averageTravelSpeed, maxSeconds, importStatus, totalRoutes, routesCreated, totalLegsRequests, legsRequested, initScore, hardScore, mediumScore, softScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentBatch {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    retailer: ").append(toIndentedString(retailer)).append("\n");
    sb.append("    hub: ").append(toIndentedString(hub)).append("\n");
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
    sb.append("    shipmentImportStatuses: ").append(toIndentedString(shipmentImportStatuses)).append("\n");
    sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
    sb.append("    uploaded: ").append(toIndentedString(uploaded)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    optimizationStarted: ").append(toIndentedString(optimizationStarted)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    optimizationCompleted: ").append(toIndentedString(optimizationCompleted)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    processedCount: ").append(toIndentedString(processedCount)).append("\n");
    sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
    sb.append("    failedCount: ").append(toIndentedString(failedCount)).append("\n");
    sb.append("    validCount: ").append(toIndentedString(validCount)).append("\n");
    sb.append("    invalidCount: ").append(toIndentedString(invalidCount)).append("\n");
    sb.append("    averageTravelSpeed: ").append(toIndentedString(averageTravelSpeed)).append("\n");
    sb.append("    maxSeconds: ").append(toIndentedString(maxSeconds)).append("\n");
    sb.append("    importStatus: ").append(toIndentedString(importStatus)).append("\n");
    sb.append("    totalRoutes: ").append(toIndentedString(totalRoutes)).append("\n");
    sb.append("    routesCreated: ").append(toIndentedString(routesCreated)).append("\n");
    sb.append("    totalLegsRequests: ").append(toIndentedString(totalLegsRequests)).append("\n");
    sb.append("    legsRequested: ").append(toIndentedString(legsRequested)).append("\n");
    sb.append("    initScore: ").append(toIndentedString(initScore)).append("\n");
    sb.append("    hardScore: ").append(toIndentedString(hardScore)).append("\n");
    sb.append("    mediumScore: ").append(toIndentedString(mediumScore)).append("\n");
    sb.append("    softScore: ").append(toIndentedString(softScore)).append("\n");
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

