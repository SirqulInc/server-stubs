package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.Program;
import org.openapitools.model.Retailer;
import org.openapitools.model.ServiceHub;
import org.openapitools.model.Shipment;
import org.openapitools.model.ShipmentImportStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ShipmentBatch  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Date created;

  @ApiModelProperty(value = "")

  private Date updated;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  @Valid

  private Retailer retailer;

  @ApiModelProperty(value = "")

  @Valid

  private ServiceHub hub;

  @ApiModelProperty(value = "")

  @Valid

  private Program program;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid ShipmentImportStatus> shipmentImportStatuses = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Shipment> shipments = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Date uploaded;

  @ApiModelProperty(value = "")

  private Date started;

  @ApiModelProperty(value = "")

  private Date optimizationStarted;

  @ApiModelProperty(value = "")

  private Date completed;

  @ApiModelProperty(value = "")

  private Date optimizationCompleted;

  @ApiModelProperty(value = "")

  private String source;

  @ApiModelProperty(value = "")

  private String externalId;

  @ApiModelProperty(value = "")

  private Integer total;

  @ApiModelProperty(value = "")

  private Integer processedCount;

  @ApiModelProperty(value = "")

  private Integer successCount;

  @ApiModelProperty(value = "")

  private Integer failedCount;

  @ApiModelProperty(value = "")

  private Integer validCount;

  @ApiModelProperty(value = "")

  private Integer invalidCount;

  @ApiModelProperty(value = "")

  private Double averageTravelSpeed;

  @ApiModelProperty(value = "")

  private Long maxSeconds;

public enum ImportStatusEnum {

NEW(String.valueOf("NEW")), STARTED(String.valueOf("STARTED")), FETCHING_DISTANCE_DATA(String.valueOf("FETCHING_DISTANCE_DATA")), OPTIMIZING(String.valueOf("OPTIMIZING")), CREATING_ROUTES(String.valueOf("CREATING_ROUTES")), COMPLETED(String.valueOf("COMPLETED")), INCOMPLETE(String.valueOf("INCOMPLETE"));


    private String value;

    ImportStatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

  @ApiModelProperty(value = "")

  private ImportStatusEnum importStatus;

  @ApiModelProperty(value = "")

  private Integer totalRoutes;

  @ApiModelProperty(value = "")

  private Integer routesCreated;

  @ApiModelProperty(value = "")

  private Integer totalLegsRequests;

  @ApiModelProperty(value = "")

  private Integer legsRequested;

  @ApiModelProperty(value = "")

  private Integer initScore;

  @ApiModelProperty(value = "")

  private Long hardScore;

  @ApiModelProperty(value = "")

  private Long mediumScore;

  @ApiModelProperty(value = "")

  private Long softScore;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ShipmentBatch id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get created
   * @return created
  **/
  @JsonProperty("created")
  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public ShipmentBatch created(Date created) {
    this.created = created;
    return this;
  }

 /**
   * Get updated
   * @return updated
  **/
  @JsonProperty("updated")
  public Date getUpdated() {
    return updated;
  }

  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  public ShipmentBatch updated(Date updated) {
    this.updated = updated;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ShipmentBatch active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public ShipmentBatch valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get retailer
   * @return retailer
  **/
  @JsonProperty("retailer")
  public Retailer getRetailer() {
    return retailer;
  }

  public void setRetailer(Retailer retailer) {
    this.retailer = retailer;
  }

  public ShipmentBatch retailer(Retailer retailer) {
    this.retailer = retailer;
    return this;
  }

 /**
   * Get hub
   * @return hub
  **/
  @JsonProperty("hub")
  public ServiceHub getHub() {
    return hub;
  }

  public void setHub(ServiceHub hub) {
    this.hub = hub;
  }

  public ShipmentBatch hub(ServiceHub hub) {
    this.hub = hub;
    return this;
  }

 /**
   * Get program
   * @return program
  **/
  @JsonProperty("program")
  public Program getProgram() {
    return program;
  }

  public void setProgram(Program program) {
    this.program = program;
  }

  public ShipmentBatch program(Program program) {
    this.program = program;
    return this;
  }

 /**
   * Get shipmentImportStatuses
   * @return shipmentImportStatuses
  **/
  @JsonProperty("shipmentImportStatuses")
  public List<@Valid ShipmentImportStatus> getShipmentImportStatuses() {
    return shipmentImportStatuses;
  }

  public void setShipmentImportStatuses(List<@Valid ShipmentImportStatus> shipmentImportStatuses) {
    this.shipmentImportStatuses = shipmentImportStatuses;
  }

  public ShipmentBatch shipmentImportStatuses(List<@Valid ShipmentImportStatus> shipmentImportStatuses) {
    this.shipmentImportStatuses = shipmentImportStatuses;
    return this;
  }

  public ShipmentBatch addShipmentImportStatusesItem(ShipmentImportStatus shipmentImportStatusesItem) {
    this.shipmentImportStatuses.add(shipmentImportStatusesItem);
    return this;
  }

 /**
   * Get shipments
   * @return shipments
  **/
  @JsonProperty("shipments")
  public List<@Valid Shipment> getShipments() {
    return shipments;
  }

  public void setShipments(List<@Valid Shipment> shipments) {
    this.shipments = shipments;
  }

  public ShipmentBatch shipments(List<@Valid Shipment> shipments) {
    this.shipments = shipments;
    return this;
  }

  public ShipmentBatch addShipmentsItem(Shipment shipmentsItem) {
    this.shipments.add(shipmentsItem);
    return this;
  }

 /**
   * Get uploaded
   * @return uploaded
  **/
  @JsonProperty("uploaded")
  public Date getUploaded() {
    return uploaded;
  }

  public void setUploaded(Date uploaded) {
    this.uploaded = uploaded;
  }

  public ShipmentBatch uploaded(Date uploaded) {
    this.uploaded = uploaded;
    return this;
  }

 /**
   * Get started
   * @return started
  **/
  @JsonProperty("started")
  public Date getStarted() {
    return started;
  }

  public void setStarted(Date started) {
    this.started = started;
  }

  public ShipmentBatch started(Date started) {
    this.started = started;
    return this;
  }

 /**
   * Get optimizationStarted
   * @return optimizationStarted
  **/
  @JsonProperty("optimizationStarted")
  public Date getOptimizationStarted() {
    return optimizationStarted;
  }

  public void setOptimizationStarted(Date optimizationStarted) {
    this.optimizationStarted = optimizationStarted;
  }

  public ShipmentBatch optimizationStarted(Date optimizationStarted) {
    this.optimizationStarted = optimizationStarted;
    return this;
  }

 /**
   * Get completed
   * @return completed
  **/
  @JsonProperty("completed")
  public Date getCompleted() {
    return completed;
  }

  public void setCompleted(Date completed) {
    this.completed = completed;
  }

  public ShipmentBatch completed(Date completed) {
    this.completed = completed;
    return this;
  }

 /**
   * Get optimizationCompleted
   * @return optimizationCompleted
  **/
  @JsonProperty("optimizationCompleted")
  public Date getOptimizationCompleted() {
    return optimizationCompleted;
  }

  public void setOptimizationCompleted(Date optimizationCompleted) {
    this.optimizationCompleted = optimizationCompleted;
  }

  public ShipmentBatch optimizationCompleted(Date optimizationCompleted) {
    this.optimizationCompleted = optimizationCompleted;
    return this;
  }

 /**
   * Get source
   * @return source
  **/
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public ShipmentBatch source(String source) {
    this.source = source;
    return this;
  }

 /**
   * Get externalId
   * @return externalId
  **/
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public ShipmentBatch externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

 /**
   * Get total
   * @return total
  **/
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public ShipmentBatch total(Integer total) {
    this.total = total;
    return this;
  }

 /**
   * Get processedCount
   * @return processedCount
  **/
  @JsonProperty("processedCount")
  public Integer getProcessedCount() {
    return processedCount;
  }

  public void setProcessedCount(Integer processedCount) {
    this.processedCount = processedCount;
  }

  public ShipmentBatch processedCount(Integer processedCount) {
    this.processedCount = processedCount;
    return this;
  }

 /**
   * Get successCount
   * @return successCount
  **/
  @JsonProperty("successCount")
  public Integer getSuccessCount() {
    return successCount;
  }

  public void setSuccessCount(Integer successCount) {
    this.successCount = successCount;
  }

  public ShipmentBatch successCount(Integer successCount) {
    this.successCount = successCount;
    return this;
  }

 /**
   * Get failedCount
   * @return failedCount
  **/
  @JsonProperty("failedCount")
  public Integer getFailedCount() {
    return failedCount;
  }

  public void setFailedCount(Integer failedCount) {
    this.failedCount = failedCount;
  }

  public ShipmentBatch failedCount(Integer failedCount) {
    this.failedCount = failedCount;
    return this;
  }

 /**
   * Get validCount
   * @return validCount
  **/
  @JsonProperty("validCount")
  public Integer getValidCount() {
    return validCount;
  }

  public void setValidCount(Integer validCount) {
    this.validCount = validCount;
  }

  public ShipmentBatch validCount(Integer validCount) {
    this.validCount = validCount;
    return this;
  }

 /**
   * Get invalidCount
   * @return invalidCount
  **/
  @JsonProperty("invalidCount")
  public Integer getInvalidCount() {
    return invalidCount;
  }

  public void setInvalidCount(Integer invalidCount) {
    this.invalidCount = invalidCount;
  }

  public ShipmentBatch invalidCount(Integer invalidCount) {
    this.invalidCount = invalidCount;
    return this;
  }

 /**
   * Get averageTravelSpeed
   * @return averageTravelSpeed
  **/
  @JsonProperty("averageTravelSpeed")
  public Double getAverageTravelSpeed() {
    return averageTravelSpeed;
  }

  public void setAverageTravelSpeed(Double averageTravelSpeed) {
    this.averageTravelSpeed = averageTravelSpeed;
  }

  public ShipmentBatch averageTravelSpeed(Double averageTravelSpeed) {
    this.averageTravelSpeed = averageTravelSpeed;
    return this;
  }

 /**
   * Get maxSeconds
   * @return maxSeconds
  **/
  @JsonProperty("maxSeconds")
  public Long getMaxSeconds() {
    return maxSeconds;
  }

  public void setMaxSeconds(Long maxSeconds) {
    this.maxSeconds = maxSeconds;
  }

  public ShipmentBatch maxSeconds(Long maxSeconds) {
    this.maxSeconds = maxSeconds;
    return this;
  }

 /**
   * Get importStatus
   * @return importStatus
  **/
  @JsonProperty("importStatus")
  public String getImportStatus() {
    if (importStatus == null) {
      return null;
    }
    return importStatus.value();
  }

  public void setImportStatus(ImportStatusEnum importStatus) {
    this.importStatus = importStatus;
  }

  public ShipmentBatch importStatus(ImportStatusEnum importStatus) {
    this.importStatus = importStatus;
    return this;
  }

 /**
   * Get totalRoutes
   * @return totalRoutes
  **/
  @JsonProperty("totalRoutes")
  public Integer getTotalRoutes() {
    return totalRoutes;
  }

  public void setTotalRoutes(Integer totalRoutes) {
    this.totalRoutes = totalRoutes;
  }

  public ShipmentBatch totalRoutes(Integer totalRoutes) {
    this.totalRoutes = totalRoutes;
    return this;
  }

 /**
   * Get routesCreated
   * @return routesCreated
  **/
  @JsonProperty("routesCreated")
  public Integer getRoutesCreated() {
    return routesCreated;
  }

  public void setRoutesCreated(Integer routesCreated) {
    this.routesCreated = routesCreated;
  }

  public ShipmentBatch routesCreated(Integer routesCreated) {
    this.routesCreated = routesCreated;
    return this;
  }

 /**
   * Get totalLegsRequests
   * @return totalLegsRequests
  **/
  @JsonProperty("totalLegsRequests")
  public Integer getTotalLegsRequests() {
    return totalLegsRequests;
  }

  public void setTotalLegsRequests(Integer totalLegsRequests) {
    this.totalLegsRequests = totalLegsRequests;
  }

  public ShipmentBatch totalLegsRequests(Integer totalLegsRequests) {
    this.totalLegsRequests = totalLegsRequests;
    return this;
  }

 /**
   * Get legsRequested
   * @return legsRequested
  **/
  @JsonProperty("legsRequested")
  public Integer getLegsRequested() {
    return legsRequested;
  }

  public void setLegsRequested(Integer legsRequested) {
    this.legsRequested = legsRequested;
  }

  public ShipmentBatch legsRequested(Integer legsRequested) {
    this.legsRequested = legsRequested;
    return this;
  }

 /**
   * Get initScore
   * @return initScore
  **/
  @JsonProperty("initScore")
  public Integer getInitScore() {
    return initScore;
  }

  public void setInitScore(Integer initScore) {
    this.initScore = initScore;
  }

  public ShipmentBatch initScore(Integer initScore) {
    this.initScore = initScore;
    return this;
  }

 /**
   * Get hardScore
   * @return hardScore
  **/
  @JsonProperty("hardScore")
  public Long getHardScore() {
    return hardScore;
  }

  public void setHardScore(Long hardScore) {
    this.hardScore = hardScore;
  }

  public ShipmentBatch hardScore(Long hardScore) {
    this.hardScore = hardScore;
    return this;
  }

 /**
   * Get mediumScore
   * @return mediumScore
  **/
  @JsonProperty("mediumScore")
  public Long getMediumScore() {
    return mediumScore;
  }

  public void setMediumScore(Long mediumScore) {
    this.mediumScore = mediumScore;
  }

  public ShipmentBatch mediumScore(Long mediumScore) {
    this.mediumScore = mediumScore;
    return this;
  }

 /**
   * Get softScore
   * @return softScore
  **/
  @JsonProperty("softScore")
  public Long getSoftScore() {
    return softScore;
  }

  public void setSoftScore(Long softScore) {
    this.softScore = softScore;
  }

  public ShipmentBatch softScore(Long softScore) {
    this.softScore = softScore;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

