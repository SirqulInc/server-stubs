package apimodels;

import apimodels.Shipment;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ShipmentImportStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ShipmentImportStatus   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("batchId")
  
  private String batchId;

  @JsonProperty("message")
  
  private String message;

  @JsonProperty("shipment")
  @Valid

  private Shipment shipment;

  @JsonProperty("started")
  @Valid

  private OffsetDateTime started;

  @JsonProperty("completed")
  @Valid

  private OffsetDateTime completed;

  public ShipmentImportStatus id(Long id) {
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

  public ShipmentImportStatus active(Boolean active) {
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

  public ShipmentImportStatus valid(Boolean valid) {
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

  public ShipmentImportStatus name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ShipmentImportStatus batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

   /**
   * Get batchId
   * @return batchId
  **/
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public ShipmentImportStatus message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ShipmentImportStatus shipment(Shipment shipment) {
    this.shipment = shipment;
    return this;
  }

   /**
   * Get shipment
   * @return shipment
  **/
  public Shipment getShipment() {
    return shipment;
  }

  public void setShipment(Shipment shipment) {
    this.shipment = shipment;
  }

  public ShipmentImportStatus started(OffsetDateTime started) {
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

  public ShipmentImportStatus completed(OffsetDateTime completed) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentImportStatus shipmentImportStatus = (ShipmentImportStatus) o;
    return Objects.equals(id, shipmentImportStatus.id) &&
        Objects.equals(active, shipmentImportStatus.active) &&
        Objects.equals(valid, shipmentImportStatus.valid) &&
        Objects.equals(name, shipmentImportStatus.name) &&
        Objects.equals(batchId, shipmentImportStatus.batchId) &&
        Objects.equals(message, shipmentImportStatus.message) &&
        Objects.equals(shipment, shipmentImportStatus.shipment) &&
        Objects.equals(started, shipmentImportStatus.started) &&
        Objects.equals(completed, shipmentImportStatus.completed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, name, batchId, message, shipment, started, completed);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

