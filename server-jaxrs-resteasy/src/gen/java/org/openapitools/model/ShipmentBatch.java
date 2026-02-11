package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ShipmentBatch   {
  
  private Long id;
  private Date created;
  private Date updated;
  private Boolean active;
  private Boolean valid;
  private Retailer retailer;
  private ServiceHub hub;
  private Program program;
  private List<@Valid ShipmentImportStatus> shipmentImportStatuses = new ArrayList<>();
  private List<@Valid Shipment> shipments = new ArrayList<>();
  private Date uploaded;
  private Date started;
  private Date optimizationStarted;
  private Date completed;
  private Date optimizationCompleted;
  private String source;
  private String externalId;
  private Integer total;
  private Integer processedCount;
  private Integer successCount;
  private Integer failedCount;
  private Integer validCount;
  private Integer invalidCount;
  private Double averageTravelSpeed;
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
    private String value;

    ImportStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ImportStatusEnum importStatus;
  private Integer totalRoutes;
  private Integer routesCreated;
  private Integer totalLegsRequests;
  private Integer legsRequested;
  private Integer initScore;
  private Long hardScore;
  private Long mediumScore;
  private Long softScore;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("created")
  public Date getCreated() {
    return created;
  }
  public void setCreated(Date created) {
    this.created = created;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("updated")
  public Date getUpdated() {
    return updated;
  }
  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("retailer")
  @Valid
  public Retailer getRetailer() {
    return retailer;
  }
  public void setRetailer(Retailer retailer) {
    this.retailer = retailer;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hub")
  @Valid
  public ServiceHub getHub() {
    return hub;
  }
  public void setHub(ServiceHub hub) {
    this.hub = hub;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("program")
  @Valid
  public Program getProgram() {
    return program;
  }
  public void setProgram(Program program) {
    this.program = program;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipmentImportStatuses")
  @Valid
  public List<@Valid ShipmentImportStatus> getShipmentImportStatuses() {
    return shipmentImportStatuses;
  }
  public void setShipmentImportStatuses(List<@Valid ShipmentImportStatus> shipmentImportStatuses) {
    this.shipmentImportStatuses = shipmentImportStatuses;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipments")
  @Valid
  public List<@Valid Shipment> getShipments() {
    return shipments;
  }
  public void setShipments(List<@Valid Shipment> shipments) {
    this.shipments = shipments;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("uploaded")
  public Date getUploaded() {
    return uploaded;
  }
  public void setUploaded(Date uploaded) {
    this.uploaded = uploaded;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("started")
  public Date getStarted() {
    return started;
  }
  public void setStarted(Date started) {
    this.started = started;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("optimizationStarted")
  public Date getOptimizationStarted() {
    return optimizationStarted;
  }
  public void setOptimizationStarted(Date optimizationStarted) {
    this.optimizationStarted = optimizationStarted;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("completed")
  public Date getCompleted() {
    return completed;
  }
  public void setCompleted(Date completed) {
    this.completed = completed;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("optimizationCompleted")
  public Date getOptimizationCompleted() {
    return optimizationCompleted;
  }
  public void setOptimizationCompleted(Date optimizationCompleted) {
    this.optimizationCompleted = optimizationCompleted;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("processedCount")
  public Integer getProcessedCount() {
    return processedCount;
  }
  public void setProcessedCount(Integer processedCount) {
    this.processedCount = processedCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("successCount")
  public Integer getSuccessCount() {
    return successCount;
  }
  public void setSuccessCount(Integer successCount) {
    this.successCount = successCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("failedCount")
  public Integer getFailedCount() {
    return failedCount;
  }
  public void setFailedCount(Integer failedCount) {
    this.failedCount = failedCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("validCount")
  public Integer getValidCount() {
    return validCount;
  }
  public void setValidCount(Integer validCount) {
    this.validCount = validCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("invalidCount")
  public Integer getInvalidCount() {
    return invalidCount;
  }
  public void setInvalidCount(Integer invalidCount) {
    this.invalidCount = invalidCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("averageTravelSpeed")
  public Double getAverageTravelSpeed() {
    return averageTravelSpeed;
  }
  public void setAverageTravelSpeed(Double averageTravelSpeed) {
    this.averageTravelSpeed = averageTravelSpeed;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxSeconds")
  public Long getMaxSeconds() {
    return maxSeconds;
  }
  public void setMaxSeconds(Long maxSeconds) {
    this.maxSeconds = maxSeconds;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("importStatus")
  public ImportStatusEnum getImportStatus() {
    return importStatus;
  }
  public void setImportStatus(ImportStatusEnum importStatus) {
    this.importStatus = importStatus;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalRoutes")
  public Integer getTotalRoutes() {
    return totalRoutes;
  }
  public void setTotalRoutes(Integer totalRoutes) {
    this.totalRoutes = totalRoutes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("routesCreated")
  public Integer getRoutesCreated() {
    return routesCreated;
  }
  public void setRoutesCreated(Integer routesCreated) {
    this.routesCreated = routesCreated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalLegsRequests")
  public Integer getTotalLegsRequests() {
    return totalLegsRequests;
  }
  public void setTotalLegsRequests(Integer totalLegsRequests) {
    this.totalLegsRequests = totalLegsRequests;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("legsRequested")
  public Integer getLegsRequested() {
    return legsRequested;
  }
  public void setLegsRequested(Integer legsRequested) {
    this.legsRequested = legsRequested;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("initScore")
  public Integer getInitScore() {
    return initScore;
  }
  public void setInitScore(Integer initScore) {
    this.initScore = initScore;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hardScore")
  public Long getHardScore() {
    return hardScore;
  }
  public void setHardScore(Long hardScore) {
    this.hardScore = hardScore;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mediumScore")
  public Long getMediumScore() {
    return mediumScore;
  }
  public void setMediumScore(Long mediumScore) {
    this.mediumScore = mediumScore;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("softScore")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

