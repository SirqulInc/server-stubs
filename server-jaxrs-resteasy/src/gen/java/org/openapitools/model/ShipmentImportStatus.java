package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.Shipment;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ShipmentImportStatus   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private String name;
  private String batchId;
  private String message;
  private Shipment shipment;
  private Date started;
  private Date completed;

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
  @JsonProperty("batchId")
  public String getBatchId() {
    return batchId;
  }
  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipment")
  @Valid
  public Shipment getShipment() {
    return shipment;
  }
  public void setShipment(Shipment shipment) {
    this.shipment = shipment;
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
  @JsonProperty("completed")
  public Date getCompleted() {
    return completed;
  }
  public void setCompleted(Date completed) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

