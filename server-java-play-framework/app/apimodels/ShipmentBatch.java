package apimodels;

import apimodels.Program;
import apimodels.Retailer;
import apimodels.ServiceHub;
import apimodels.Shipment;
import apimodels.ShipmentImportStatus;
import java.time.OffsetDateTime;
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
 * ShipmentBatch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ShipmentBatch   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("created")
  @Valid

  private OffsetDateTime created;

  @JsonProperty("updated")
  @Valid

  private OffsetDateTime updated;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("retailer")
  @Valid

  private Retailer retailer;

  @JsonProperty("hub")
  @Valid

  private ServiceHub hub;

  @JsonProperty("program")
  @Valid

  private Program program;

  @JsonProperty("shipmentImportStatuses")
  @Valid

  private List<@Valid ShipmentImportStatus> shipmentImportStatuses = null;

  @JsonProperty("shipments")
  @Valid

  private List<@Valid Shipment> shipments = null;

  @JsonProperty("uploaded")
  @Valid

  private OffsetDateTime uploaded;

  @JsonProperty("started")
  @Valid

  private OffsetDateTime started;

  @JsonProperty("optimizationStarted")
  @Valid

  private OffsetDateTime optimizationStarted;

  @JsonProperty("completed")
  @Valid

  private OffsetDateTime completed;

  @JsonProperty("optimizationCompleted")
  @Valid

  private OffsetDateTime optimizationCompleted;

  @JsonProperty("source")
  
  private String source;

  @JsonProperty("externalId")
  
  private String externalId;

  @JsonProperty("total")
  
  private Integer total;

  @JsonProperty("processedCount")
  
  private Integer processedCount;

  @JsonProperty("successCount")
  
  private Integer successCount;

  @JsonProperty("failedCount")
  
  private Integer failedCount;

  @JsonProperty("validCount")
  
  private Integer validCount;

  @JsonProperty("invalidCount")
  
  private Integer invalidCount;

  @JsonProperty("averageTravelSpeed")
  
  private Double averageTravelSpeed;

  @JsonProperty("maxSeconds")
  
  private Long maxSeconds;

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

  @JsonProperty("importStatus")
  
  private ImportStatusEnum importStatus;

  @JsonProperty("totalRoutes")
  
  private Integer totalRoutes;

  @JsonProperty("routesCreated")
  
  private Integer routesCreated;

  @JsonProperty("totalLegsRequests")
  
  private Integer totalLegsRequests;

  @JsonProperty("legsRequested")
  
  private Integer legsRequested;

  @JsonProperty("initScore")
  
  private Integer initScore;

  @JsonProperty("hardScore")
  
  private Long hardScore;

  @JsonProperty("mediumScore")
  
  private Long mediumScore;

  @JsonProperty("softScore")
  
  private Long softScore;

  public ShipmentBatch id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ShipmentBatch created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public ShipmentBatch updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }

  public ShipmentBatch active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ShipmentBatch valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public ShipmentBatch retailer(Retailer retailer) {
    this.retailer = retailer;
    return this;
  }

   /**
   * Get retailer
   * @return retailer
  **/
  public Retailer getRetailer() {
    return retailer;
  }

  public void setRetailer(Retailer retailer) {
    this.retailer = retailer;
  }

  public ShipmentBatch hub(ServiceHub hub) {
    this.hub = hub;
    return this;
  }

   /**
   * Get hub
   * @return hub
  **/
  public ServiceHub getHub() {
    return hub;
  }

  public void setHub(ServiceHub hub) {
    this.hub = hub;
  }

  public ShipmentBatch program(Program program) {
    this.program = program;
    return this;
  }

   /**
   * Get program
   * @return program
  **/
  public Program getProgram() {
    return program;
  }

  public void setProgram(Program program) {
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
  **/
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
  **/
  public List<@Valid Shipment> getShipments() {
    return shipments;
  }

  public void setShipments(List<@Valid Shipment> shipments) {
    this.shipments = shipments;
  }

  public ShipmentBatch uploaded(OffsetDateTime uploaded) {
    this.uploaded = uploaded;
    return this;
  }

   /**
   * Get uploaded
   * @return uploaded
  **/
  public OffsetDateTime getUploaded() {
    return uploaded;
  }

  public void setUploaded(OffsetDateTime uploaded) {
    this.uploaded = uploaded;
  }

  public ShipmentBatch started(OffsetDateTime started) {
    this.started = started;
    return this;
  }

   /**
   * Get started
   * @return started
  **/
  public OffsetDateTime getStarted() {
    return started;
  }

  public void setStarted(OffsetDateTime started) {
    this.started = started;
  }

  public ShipmentBatch optimizationStarted(OffsetDateTime optimizationStarted) {
    this.optimizationStarted = optimizationStarted;
    return this;
  }

   /**
   * Get optimizationStarted
   * @return optimizationStarted
  **/
  public OffsetDateTime getOptimizationStarted() {
    return optimizationStarted;
  }

  public void setOptimizationStarted(OffsetDateTime optimizationStarted) {
    this.optimizationStarted = optimizationStarted;
  }

  public ShipmentBatch completed(OffsetDateTime completed) {
    this.completed = completed;
    return this;
  }

   /**
   * Get completed
   * @return completed
  **/
  public OffsetDateTime getCompleted() {
    return completed;
  }

  public void setCompleted(OffsetDateTime completed) {
    this.completed = completed;
  }

  public ShipmentBatch optimizationCompleted(OffsetDateTime optimizationCompleted) {
    this.optimizationCompleted = optimizationCompleted;
    return this;
  }

   /**
   * Get optimizationCompleted
   * @return optimizationCompleted
  **/
  public OffsetDateTime getOptimizationCompleted() {
    return optimizationCompleted;
  }

  public void setOptimizationCompleted(OffsetDateTime optimizationCompleted) {
    this.optimizationCompleted = optimizationCompleted;
  }

  public ShipmentBatch source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public ShipmentBatch externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public ShipmentBatch total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public ShipmentBatch processedCount(Integer processedCount) {
    this.processedCount = processedCount;
    return this;
  }

   /**
   * Get processedCount
   * @return processedCount
  **/
  public Integer getProcessedCount() {
    return processedCount;
  }

  public void setProcessedCount(Integer processedCount) {
    this.processedCount = processedCount;
  }

  public ShipmentBatch successCount(Integer successCount) {
    this.successCount = successCount;
    return this;
  }

   /**
   * Get successCount
   * @return successCount
  **/
  public Integer getSuccessCount() {
    return successCount;
  }

  public void setSuccessCount(Integer successCount) {
    this.successCount = successCount;
  }

  public ShipmentBatch failedCount(Integer failedCount) {
    this.failedCount = failedCount;
    return this;
  }

   /**
   * Get failedCount
   * @return failedCount
  **/
  public Integer getFailedCount() {
    return failedCount;
  }

  public void setFailedCount(Integer failedCount) {
    this.failedCount = failedCount;
  }

  public ShipmentBatch validCount(Integer validCount) {
    this.validCount = validCount;
    return this;
  }

   /**
   * Get validCount
   * @return validCount
  **/
  public Integer getValidCount() {
    return validCount;
  }

  public void setValidCount(Integer validCount) {
    this.validCount = validCount;
  }

  public ShipmentBatch invalidCount(Integer invalidCount) {
    this.invalidCount = invalidCount;
    return this;
  }

   /**
   * Get invalidCount
   * @return invalidCount
  **/
  public Integer getInvalidCount() {
    return invalidCount;
  }

  public void setInvalidCount(Integer invalidCount) {
    this.invalidCount = invalidCount;
  }

  public ShipmentBatch averageTravelSpeed(Double averageTravelSpeed) {
    this.averageTravelSpeed = averageTravelSpeed;
    return this;
  }

   /**
   * Get averageTravelSpeed
   * @return averageTravelSpeed
  **/
  public Double getAverageTravelSpeed() {
    return averageTravelSpeed;
  }

  public void setAverageTravelSpeed(Double averageTravelSpeed) {
    this.averageTravelSpeed = averageTravelSpeed;
  }

  public ShipmentBatch maxSeconds(Long maxSeconds) {
    this.maxSeconds = maxSeconds;
    return this;
  }

   /**
   * Get maxSeconds
   * @return maxSeconds
  **/
  public Long getMaxSeconds() {
    return maxSeconds;
  }

  public void setMaxSeconds(Long maxSeconds) {
    this.maxSeconds = maxSeconds;
  }

  public ShipmentBatch importStatus(ImportStatusEnum importStatus) {
    this.importStatus = importStatus;
    return this;
  }

   /**
   * Get importStatus
   * @return importStatus
  **/
  public ImportStatusEnum getImportStatus() {
    return importStatus;
  }

  public void setImportStatus(ImportStatusEnum importStatus) {
    this.importStatus = importStatus;
  }

  public ShipmentBatch totalRoutes(Integer totalRoutes) {
    this.totalRoutes = totalRoutes;
    return this;
  }

   /**
   * Get totalRoutes
   * @return totalRoutes
  **/
  public Integer getTotalRoutes() {
    return totalRoutes;
  }

  public void setTotalRoutes(Integer totalRoutes) {
    this.totalRoutes = totalRoutes;
  }

  public ShipmentBatch routesCreated(Integer routesCreated) {
    this.routesCreated = routesCreated;
    return this;
  }

   /**
   * Get routesCreated
   * @return routesCreated
  **/
  public Integer getRoutesCreated() {
    return routesCreated;
  }

  public void setRoutesCreated(Integer routesCreated) {
    this.routesCreated = routesCreated;
  }

  public ShipmentBatch totalLegsRequests(Integer totalLegsRequests) {
    this.totalLegsRequests = totalLegsRequests;
    return this;
  }

   /**
   * Get totalLegsRequests
   * @return totalLegsRequests
  **/
  public Integer getTotalLegsRequests() {
    return totalLegsRequests;
  }

  public void setTotalLegsRequests(Integer totalLegsRequests) {
    this.totalLegsRequests = totalLegsRequests;
  }

  public ShipmentBatch legsRequested(Integer legsRequested) {
    this.legsRequested = legsRequested;
    return this;
  }

   /**
   * Get legsRequested
   * @return legsRequested
  **/
  public Integer getLegsRequested() {
    return legsRequested;
  }

  public void setLegsRequested(Integer legsRequested) {
    this.legsRequested = legsRequested;
  }

  public ShipmentBatch initScore(Integer initScore) {
    this.initScore = initScore;
    return this;
  }

   /**
   * Get initScore
   * @return initScore
  **/
  public Integer getInitScore() {
    return initScore;
  }

  public void setInitScore(Integer initScore) {
    this.initScore = initScore;
  }

  public ShipmentBatch hardScore(Long hardScore) {
    this.hardScore = hardScore;
    return this;
  }

   /**
   * Get hardScore
   * @return hardScore
  **/
  public Long getHardScore() {
    return hardScore;
  }

  public void setHardScore(Long hardScore) {
    this.hardScore = hardScore;
  }

  public ShipmentBatch mediumScore(Long mediumScore) {
    this.mediumScore = mediumScore;
    return this;
  }

   /**
   * Get mediumScore
   * @return mediumScore
  **/
  public Long getMediumScore() {
    return mediumScore;
  }

  public void setMediumScore(Long mediumScore) {
    this.mediumScore = mediumScore;
  }

  public ShipmentBatch softScore(Long softScore) {
    this.softScore = softScore;
    return this;
  }

   /**
   * Get softScore
   * @return softScore
  **/
  public Long getSoftScore() {
    return softScore;
  }

  public void setSoftScore(Long softScore) {
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
    return Objects.equals(id, shipmentBatch.id) &&
        Objects.equals(created, shipmentBatch.created) &&
        Objects.equals(updated, shipmentBatch.updated) &&
        Objects.equals(active, shipmentBatch.active) &&
        Objects.equals(valid, shipmentBatch.valid) &&
        Objects.equals(retailer, shipmentBatch.retailer) &&
        Objects.equals(hub, shipmentBatch.hub) &&
        Objects.equals(program, shipmentBatch.program) &&
        Objects.equals(shipmentImportStatuses, shipmentBatch.shipmentImportStatuses) &&
        Objects.equals(shipments, shipmentBatch.shipments) &&
        Objects.equals(uploaded, shipmentBatch.uploaded) &&
        Objects.equals(started, shipmentBatch.started) &&
        Objects.equals(optimizationStarted, shipmentBatch.optimizationStarted) &&
        Objects.equals(completed, shipmentBatch.completed) &&
        Objects.equals(optimizationCompleted, shipmentBatch.optimizationCompleted) &&
        Objects.equals(source, shipmentBatch.source) &&
        Objects.equals(externalId, shipmentBatch.externalId) &&
        Objects.equals(total, shipmentBatch.total) &&
        Objects.equals(processedCount, shipmentBatch.processedCount) &&
        Objects.equals(successCount, shipmentBatch.successCount) &&
        Objects.equals(failedCount, shipmentBatch.failedCount) &&
        Objects.equals(validCount, shipmentBatch.validCount) &&
        Objects.equals(invalidCount, shipmentBatch.invalidCount) &&
        Objects.equals(averageTravelSpeed, shipmentBatch.averageTravelSpeed) &&
        Objects.equals(maxSeconds, shipmentBatch.maxSeconds) &&
        Objects.equals(importStatus, shipmentBatch.importStatus) &&
        Objects.equals(totalRoutes, shipmentBatch.totalRoutes) &&
        Objects.equals(routesCreated, shipmentBatch.routesCreated) &&
        Objects.equals(totalLegsRequests, shipmentBatch.totalLegsRequests) &&
        Objects.equals(legsRequested, shipmentBatch.legsRequested) &&
        Objects.equals(initScore, shipmentBatch.initScore) &&
        Objects.equals(hardScore, shipmentBatch.hardScore) &&
        Objects.equals(mediumScore, shipmentBatch.mediumScore) &&
        Objects.equals(softScore, shipmentBatch.softScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, updated, active, valid, retailer, hub, program, shipmentImportStatuses, shipments, uploaded, started, optimizationStarted, completed, optimizationCompleted, source, externalId, total, processedCount, successCount, failedCount, validCount, invalidCount, averageTravelSpeed, maxSeconds, importStatus, totalRoutes, routesCreated, totalLegsRequests, legsRequested, initScore, hardScore, mediumScore, softScore);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

