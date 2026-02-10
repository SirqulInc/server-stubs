package org.openapitools.model;

import java.util.Date;
import org.openapitools.model.Shipment;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ShipmentImportStatus  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String batchId;

  @ApiModelProperty(value = "")

  private String message;

  @ApiModelProperty(value = "")

  @Valid

  private Shipment shipment;

  @ApiModelProperty(value = "")

  private Date started;

  @ApiModelProperty(value = "")

  private Date completed;
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

  public ShipmentImportStatus id(Long id) {
    this.id = id;
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

  public ShipmentImportStatus active(Boolean active) {
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

  public ShipmentImportStatus valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ShipmentImportStatus name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get batchId
   * @return batchId
  **/
  @JsonProperty("batchId")
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public ShipmentImportStatus batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ShipmentImportStatus message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get shipment
   * @return shipment
  **/
  @JsonProperty("shipment")
  public Shipment getShipment() {
    return shipment;
  }

  public void setShipment(Shipment shipment) {
    this.shipment = shipment;
  }

  public ShipmentImportStatus shipment(Shipment shipment) {
    this.shipment = shipment;
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

  public ShipmentImportStatus started(Date started) {
    this.started = started;
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

  public ShipmentImportStatus completed(Date completed) {
    this.completed = completed;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

