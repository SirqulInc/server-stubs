package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderPackage;
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
 * ShipmentOrder
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ShipmentOrder {

  private @Nullable Boolean valid;

  private @Nullable Integer batchID;

  private @Nullable Integer batchSize;

  private @Nullable Double orderTrackingID;

  private @Nullable String clientRefNo;

  private @Nullable String clientRefNo2;

  private @Nullable String hubCode;

  private @Nullable String accountNo;

  private @Nullable String companyName;

  private @Nullable String vehicleTypeName;

  private @Nullable String serviceTypeName;

  private @Nullable String serviceCode;

  private @Nullable Integer pieces;

  private @Nullable Double weight;

  private @Nullable Double cubicFeet;

  private @Nullable String pickupCompany;

  private @Nullable String pickupContact;

  private @Nullable String pickupPhone;

  private @Nullable String pickupStreet;

  private @Nullable String pickupStreet2;

  private @Nullable String pickupCity;

  private @Nullable String pickupState;

  private @Nullable String pickupZip;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime pickupTargetFrom;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime pickupTargetTo;

  private @Nullable String deliveryCompany;

  private @Nullable String deliveryContact;

  private @Nullable String deliveryPhone;

  private @Nullable String deliveryStreet;

  private @Nullable String deliveryStreet2;

  private @Nullable String deliveryCity;

  private @Nullable String deliveryState;

  private @Nullable String deliveryZip;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime deliveryTargetFrom;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime deliveryTargetTo;

  @Valid
  private List<@Valid OrderPackage> orderPackages = new ArrayList<>();

  private @Nullable Integer routeID;

  private @Nullable Integer driverID;

  private @Nullable Integer pickupSequenceNo;

  private @Nullable Integer deliverySequenceNo;

  private @Nullable String pickupETA;

  private @Nullable String deliveryETA;

  public ShipmentOrder valid(@Nullable Boolean valid) {
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

  public ShipmentOrder batchID(@Nullable Integer batchID) {
    this.batchID = batchID;
    return this;
  }

  /**
   * Get batchID
   * @return batchID
   */
  
  @Schema(name = "BatchID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BatchID")
  public @Nullable Integer getBatchID() {
    return batchID;
  }

  public void setBatchID(@Nullable Integer batchID) {
    this.batchID = batchID;
  }

  public ShipmentOrder batchSize(@Nullable Integer batchSize) {
    this.batchSize = batchSize;
    return this;
  }

  /**
   * Get batchSize
   * @return batchSize
   */
  
  @Schema(name = "BatchSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BatchSize")
  public @Nullable Integer getBatchSize() {
    return batchSize;
  }

  public void setBatchSize(@Nullable Integer batchSize) {
    this.batchSize = batchSize;
  }

  public ShipmentOrder orderTrackingID(@Nullable Double orderTrackingID) {
    this.orderTrackingID = orderTrackingID;
    return this;
  }

  /**
   * Get orderTrackingID
   * @return orderTrackingID
   */
  
  @Schema(name = "OrderTrackingID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OrderTrackingID")
  public @Nullable Double getOrderTrackingID() {
    return orderTrackingID;
  }

  public void setOrderTrackingID(@Nullable Double orderTrackingID) {
    this.orderTrackingID = orderTrackingID;
  }

  public ShipmentOrder clientRefNo(@Nullable String clientRefNo) {
    this.clientRefNo = clientRefNo;
    return this;
  }

  /**
   * Get clientRefNo
   * @return clientRefNo
   */
  
  @Schema(name = "ClientRefNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ClientRefNo")
  public @Nullable String getClientRefNo() {
    return clientRefNo;
  }

  public void setClientRefNo(@Nullable String clientRefNo) {
    this.clientRefNo = clientRefNo;
  }

  public ShipmentOrder clientRefNo2(@Nullable String clientRefNo2) {
    this.clientRefNo2 = clientRefNo2;
    return this;
  }

  /**
   * Get clientRefNo2
   * @return clientRefNo2
   */
  
  @Schema(name = "ClientRefNo2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ClientRefNo2")
  public @Nullable String getClientRefNo2() {
    return clientRefNo2;
  }

  public void setClientRefNo2(@Nullable String clientRefNo2) {
    this.clientRefNo2 = clientRefNo2;
  }

  public ShipmentOrder hubCode(@Nullable String hubCode) {
    this.hubCode = hubCode;
    return this;
  }

  /**
   * Get hubCode
   * @return hubCode
   */
  
  @Schema(name = "HubCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HubCode")
  public @Nullable String getHubCode() {
    return hubCode;
  }

  public void setHubCode(@Nullable String hubCode) {
    this.hubCode = hubCode;
  }

  public ShipmentOrder accountNo(@Nullable String accountNo) {
    this.accountNo = accountNo;
    return this;
  }

  /**
   * Get accountNo
   * @return accountNo
   */
  
  @Schema(name = "AccountNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AccountNo")
  public @Nullable String getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(@Nullable String accountNo) {
    this.accountNo = accountNo;
  }

  public ShipmentOrder companyName(@Nullable String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
   */
  
  @Schema(name = "CompanyName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CompanyName")
  public @Nullable String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(@Nullable String companyName) {
    this.companyName = companyName;
  }

  public ShipmentOrder vehicleTypeName(@Nullable String vehicleTypeName) {
    this.vehicleTypeName = vehicleTypeName;
    return this;
  }

  /**
   * Get vehicleTypeName
   * @return vehicleTypeName
   */
  
  @Schema(name = "VehicleTypeName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VehicleTypeName")
  public @Nullable String getVehicleTypeName() {
    return vehicleTypeName;
  }

  public void setVehicleTypeName(@Nullable String vehicleTypeName) {
    this.vehicleTypeName = vehicleTypeName;
  }

  public ShipmentOrder serviceTypeName(@Nullable String serviceTypeName) {
    this.serviceTypeName = serviceTypeName;
    return this;
  }

  /**
   * Get serviceTypeName
   * @return serviceTypeName
   */
  
  @Schema(name = "ServiceTypeName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServiceTypeName")
  public @Nullable String getServiceTypeName() {
    return serviceTypeName;
  }

  public void setServiceTypeName(@Nullable String serviceTypeName) {
    this.serviceTypeName = serviceTypeName;
  }

  public ShipmentOrder serviceCode(@Nullable String serviceCode) {
    this.serviceCode = serviceCode;
    return this;
  }

  /**
   * Get serviceCode
   * @return serviceCode
   */
  
  @Schema(name = "ServiceCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServiceCode")
  public @Nullable String getServiceCode() {
    return serviceCode;
  }

  public void setServiceCode(@Nullable String serviceCode) {
    this.serviceCode = serviceCode;
  }

  public ShipmentOrder pieces(@Nullable Integer pieces) {
    this.pieces = pieces;
    return this;
  }

  /**
   * Get pieces
   * @return pieces
   */
  
  @Schema(name = "Pieces", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Pieces")
  public @Nullable Integer getPieces() {
    return pieces;
  }

  public void setPieces(@Nullable Integer pieces) {
    this.pieces = pieces;
  }

  public ShipmentOrder weight(@Nullable Double weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
   */
  
  @Schema(name = "Weight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Weight")
  public @Nullable Double getWeight() {
    return weight;
  }

  public void setWeight(@Nullable Double weight) {
    this.weight = weight;
  }

  public ShipmentOrder cubicFeet(@Nullable Double cubicFeet) {
    this.cubicFeet = cubicFeet;
    return this;
  }

  /**
   * Get cubicFeet
   * @return cubicFeet
   */
  
  @Schema(name = "CubicFeet", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CubicFeet")
  public @Nullable Double getCubicFeet() {
    return cubicFeet;
  }

  public void setCubicFeet(@Nullable Double cubicFeet) {
    this.cubicFeet = cubicFeet;
  }

  public ShipmentOrder pickupCompany(@Nullable String pickupCompany) {
    this.pickupCompany = pickupCompany;
    return this;
  }

  /**
   * Get pickupCompany
   * @return pickupCompany
   */
  
  @Schema(name = "PickupCompany", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PickupCompany")
  public @Nullable String getPickupCompany() {
    return pickupCompany;
  }

  public void setPickupCompany(@Nullable String pickupCompany) {
    this.pickupCompany = pickupCompany;
  }

  public ShipmentOrder pickupContact(@Nullable String pickupContact) {
    this.pickupContact = pickupContact;
    return this;
  }

  /**
   * Get pickupContact
   * @return pickupContact
   */
  
  @Schema(name = "PickupContact", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PickupContact")
  public @Nullable String getPickupContact() {
    return pickupContact;
  }

  public void setPickupContact(@Nullable String pickupContact) {
    this.pickupContact = pickupContact;
  }

  public ShipmentOrder pickupPhone(@Nullable String pickupPhone) {
    this.pickupPhone = pickupPhone;
    return this;
  }

  /**
   * Get pickupPhone
   * @return pickupPhone
   */
  
  @Schema(name = "PickupPhone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PickupPhone")
  public @Nullable String getPickupPhone() {
    return pickupPhone;
  }

  public void setPickupPhone(@Nullable String pickupPhone) {
    this.pickupPhone = pickupPhone;
  }

  public ShipmentOrder pickupStreet(@Nullable String pickupStreet) {
    this.pickupStreet = pickupStreet;
    return this;
  }

  /**
   * Get pickupStreet
   * @return pickupStreet
   */
  
  @Schema(name = "PickupStreet", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PickupStreet")
  public @Nullable String getPickupStreet() {
    return pickupStreet;
  }

  public void setPickupStreet(@Nullable String pickupStreet) {
    this.pickupStreet = pickupStreet;
  }

  public ShipmentOrder pickupStreet2(@Nullable String pickupStreet2) {
    this.pickupStreet2 = pickupStreet2;
    return this;
  }

  /**
   * Get pickupStreet2
   * @return pickupStreet2
   */
  
  @Schema(name = "PickupStreet2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PickupStreet2")
  public @Nullable String getPickupStreet2() {
    return pickupStreet2;
  }

  public void setPickupStreet2(@Nullable String pickupStreet2) {
    this.pickupStreet2 = pickupStreet2;
  }

  public ShipmentOrder pickupCity(@Nullable String pickupCity) {
    this.pickupCity = pickupCity;
    return this;
  }

  /**
   * Get pickupCity
   * @return pickupCity
   */
  
  @Schema(name = "PickupCity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PickupCity")
  public @Nullable String getPickupCity() {
    return pickupCity;
  }

  public void setPickupCity(@Nullable String pickupCity) {
    this.pickupCity = pickupCity;
  }

  public ShipmentOrder pickupState(@Nullable String pickupState) {
    this.pickupState = pickupState;
    return this;
  }

  /**
   * Get pickupState
   * @return pickupState
   */
  
  @Schema(name = "PickupState", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PickupState")
  public @Nullable String getPickupState() {
    return pickupState;
  }

  public void setPickupState(@Nullable String pickupState) {
    this.pickupState = pickupState;
  }

  public ShipmentOrder pickupZip(@Nullable String pickupZip) {
    this.pickupZip = pickupZip;
    return this;
  }

  /**
   * Get pickupZip
   * @return pickupZip
   */
  
  @Schema(name = "PickupZip", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PickupZip")
  public @Nullable String getPickupZip() {
    return pickupZip;
  }

  public void setPickupZip(@Nullable String pickupZip) {
    this.pickupZip = pickupZip;
  }

  public ShipmentOrder pickupTargetFrom(@Nullable OffsetDateTime pickupTargetFrom) {
    this.pickupTargetFrom = pickupTargetFrom;
    return this;
  }

  /**
   * Get pickupTargetFrom
   * @return pickupTargetFrom
   */
  @Valid 
  @Schema(name = "PickupTargetFrom", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PickupTargetFrom")
  public @Nullable OffsetDateTime getPickupTargetFrom() {
    return pickupTargetFrom;
  }

  public void setPickupTargetFrom(@Nullable OffsetDateTime pickupTargetFrom) {
    this.pickupTargetFrom = pickupTargetFrom;
  }

  public ShipmentOrder pickupTargetTo(@Nullable OffsetDateTime pickupTargetTo) {
    this.pickupTargetTo = pickupTargetTo;
    return this;
  }

  /**
   * Get pickupTargetTo
   * @return pickupTargetTo
   */
  @Valid 
  @Schema(name = "PickupTargetTo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PickupTargetTo")
  public @Nullable OffsetDateTime getPickupTargetTo() {
    return pickupTargetTo;
  }

  public void setPickupTargetTo(@Nullable OffsetDateTime pickupTargetTo) {
    this.pickupTargetTo = pickupTargetTo;
  }

  public ShipmentOrder deliveryCompany(@Nullable String deliveryCompany) {
    this.deliveryCompany = deliveryCompany;
    return this;
  }

  /**
   * Get deliveryCompany
   * @return deliveryCompany
   */
  
  @Schema(name = "DeliveryCompany", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeliveryCompany")
  public @Nullable String getDeliveryCompany() {
    return deliveryCompany;
  }

  public void setDeliveryCompany(@Nullable String deliveryCompany) {
    this.deliveryCompany = deliveryCompany;
  }

  public ShipmentOrder deliveryContact(@Nullable String deliveryContact) {
    this.deliveryContact = deliveryContact;
    return this;
  }

  /**
   * Get deliveryContact
   * @return deliveryContact
   */
  
  @Schema(name = "DeliveryContact", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeliveryContact")
  public @Nullable String getDeliveryContact() {
    return deliveryContact;
  }

  public void setDeliveryContact(@Nullable String deliveryContact) {
    this.deliveryContact = deliveryContact;
  }

  public ShipmentOrder deliveryPhone(@Nullable String deliveryPhone) {
    this.deliveryPhone = deliveryPhone;
    return this;
  }

  /**
   * Get deliveryPhone
   * @return deliveryPhone
   */
  
  @Schema(name = "DeliveryPhone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeliveryPhone")
  public @Nullable String getDeliveryPhone() {
    return deliveryPhone;
  }

  public void setDeliveryPhone(@Nullable String deliveryPhone) {
    this.deliveryPhone = deliveryPhone;
  }

  public ShipmentOrder deliveryStreet(@Nullable String deliveryStreet) {
    this.deliveryStreet = deliveryStreet;
    return this;
  }

  /**
   * Get deliveryStreet
   * @return deliveryStreet
   */
  
  @Schema(name = "DeliveryStreet", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeliveryStreet")
  public @Nullable String getDeliveryStreet() {
    return deliveryStreet;
  }

  public void setDeliveryStreet(@Nullable String deliveryStreet) {
    this.deliveryStreet = deliveryStreet;
  }

  public ShipmentOrder deliveryStreet2(@Nullable String deliveryStreet2) {
    this.deliveryStreet2 = deliveryStreet2;
    return this;
  }

  /**
   * Get deliveryStreet2
   * @return deliveryStreet2
   */
  
  @Schema(name = "DeliveryStreet2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeliveryStreet2")
  public @Nullable String getDeliveryStreet2() {
    return deliveryStreet2;
  }

  public void setDeliveryStreet2(@Nullable String deliveryStreet2) {
    this.deliveryStreet2 = deliveryStreet2;
  }

  public ShipmentOrder deliveryCity(@Nullable String deliveryCity) {
    this.deliveryCity = deliveryCity;
    return this;
  }

  /**
   * Get deliveryCity
   * @return deliveryCity
   */
  
  @Schema(name = "DeliveryCity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeliveryCity")
  public @Nullable String getDeliveryCity() {
    return deliveryCity;
  }

  public void setDeliveryCity(@Nullable String deliveryCity) {
    this.deliveryCity = deliveryCity;
  }

  public ShipmentOrder deliveryState(@Nullable String deliveryState) {
    this.deliveryState = deliveryState;
    return this;
  }

  /**
   * Get deliveryState
   * @return deliveryState
   */
  
  @Schema(name = "DeliveryState", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeliveryState")
  public @Nullable String getDeliveryState() {
    return deliveryState;
  }

  public void setDeliveryState(@Nullable String deliveryState) {
    this.deliveryState = deliveryState;
  }

  public ShipmentOrder deliveryZip(@Nullable String deliveryZip) {
    this.deliveryZip = deliveryZip;
    return this;
  }

  /**
   * Get deliveryZip
   * @return deliveryZip
   */
  
  @Schema(name = "DeliveryZip", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeliveryZip")
  public @Nullable String getDeliveryZip() {
    return deliveryZip;
  }

  public void setDeliveryZip(@Nullable String deliveryZip) {
    this.deliveryZip = deliveryZip;
  }

  public ShipmentOrder deliveryTargetFrom(@Nullable OffsetDateTime deliveryTargetFrom) {
    this.deliveryTargetFrom = deliveryTargetFrom;
    return this;
  }

  /**
   * Get deliveryTargetFrom
   * @return deliveryTargetFrom
   */
  @Valid 
  @Schema(name = "DeliveryTargetFrom", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeliveryTargetFrom")
  public @Nullable OffsetDateTime getDeliveryTargetFrom() {
    return deliveryTargetFrom;
  }

  public void setDeliveryTargetFrom(@Nullable OffsetDateTime deliveryTargetFrom) {
    this.deliveryTargetFrom = deliveryTargetFrom;
  }

  public ShipmentOrder deliveryTargetTo(@Nullable OffsetDateTime deliveryTargetTo) {
    this.deliveryTargetTo = deliveryTargetTo;
    return this;
  }

  /**
   * Get deliveryTargetTo
   * @return deliveryTargetTo
   */
  @Valid 
  @Schema(name = "DeliveryTargetTo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeliveryTargetTo")
  public @Nullable OffsetDateTime getDeliveryTargetTo() {
    return deliveryTargetTo;
  }

  public void setDeliveryTargetTo(@Nullable OffsetDateTime deliveryTargetTo) {
    this.deliveryTargetTo = deliveryTargetTo;
  }

  public ShipmentOrder orderPackages(List<@Valid OrderPackage> orderPackages) {
    this.orderPackages = orderPackages;
    return this;
  }

  public ShipmentOrder addOrderPackagesItem(OrderPackage orderPackagesItem) {
    if (this.orderPackages == null) {
      this.orderPackages = new ArrayList<>();
    }
    this.orderPackages.add(orderPackagesItem);
    return this;
  }

  /**
   * Get orderPackages
   * @return orderPackages
   */
  @Valid 
  @Schema(name = "OrderPackages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OrderPackages")
  public List<@Valid OrderPackage> getOrderPackages() {
    return orderPackages;
  }

  public void setOrderPackages(List<@Valid OrderPackage> orderPackages) {
    this.orderPackages = orderPackages;
  }

  public ShipmentOrder routeID(@Nullable Integer routeID) {
    this.routeID = routeID;
    return this;
  }

  /**
   * Get routeID
   * @return routeID
   */
  
  @Schema(name = "RouteID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RouteID")
  public @Nullable Integer getRouteID() {
    return routeID;
  }

  public void setRouteID(@Nullable Integer routeID) {
    this.routeID = routeID;
  }

  public ShipmentOrder driverID(@Nullable Integer driverID) {
    this.driverID = driverID;
    return this;
  }

  /**
   * Get driverID
   * @return driverID
   */
  
  @Schema(name = "DriverID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DriverID")
  public @Nullable Integer getDriverID() {
    return driverID;
  }

  public void setDriverID(@Nullable Integer driverID) {
    this.driverID = driverID;
  }

  public ShipmentOrder pickupSequenceNo(@Nullable Integer pickupSequenceNo) {
    this.pickupSequenceNo = pickupSequenceNo;
    return this;
  }

  /**
   * Get pickupSequenceNo
   * @return pickupSequenceNo
   */
  
  @Schema(name = "PickupSequenceNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PickupSequenceNo")
  public @Nullable Integer getPickupSequenceNo() {
    return pickupSequenceNo;
  }

  public void setPickupSequenceNo(@Nullable Integer pickupSequenceNo) {
    this.pickupSequenceNo = pickupSequenceNo;
  }

  public ShipmentOrder deliverySequenceNo(@Nullable Integer deliverySequenceNo) {
    this.deliverySequenceNo = deliverySequenceNo;
    return this;
  }

  /**
   * Get deliverySequenceNo
   * @return deliverySequenceNo
   */
  
  @Schema(name = "DeliverySequenceNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeliverySequenceNo")
  public @Nullable Integer getDeliverySequenceNo() {
    return deliverySequenceNo;
  }

  public void setDeliverySequenceNo(@Nullable Integer deliverySequenceNo) {
    this.deliverySequenceNo = deliverySequenceNo;
  }

  public ShipmentOrder pickupETA(@Nullable String pickupETA) {
    this.pickupETA = pickupETA;
    return this;
  }

  /**
   * Get pickupETA
   * @return pickupETA
   */
  
  @Schema(name = "PickupETA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PickupETA")
  public @Nullable String getPickupETA() {
    return pickupETA;
  }

  public void setPickupETA(@Nullable String pickupETA) {
    this.pickupETA = pickupETA;
  }

  public ShipmentOrder deliveryETA(@Nullable String deliveryETA) {
    this.deliveryETA = deliveryETA;
    return this;
  }

  /**
   * Get deliveryETA
   * @return deliveryETA
   */
  
  @Schema(name = "DeliveryETA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeliveryETA")
  public @Nullable String getDeliveryETA() {
    return deliveryETA;
  }

  public void setDeliveryETA(@Nullable String deliveryETA) {
    this.deliveryETA = deliveryETA;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentOrder shipmentOrder = (ShipmentOrder) o;
    return Objects.equals(this.valid, shipmentOrder.valid) &&
        Objects.equals(this.batchID, shipmentOrder.batchID) &&
        Objects.equals(this.batchSize, shipmentOrder.batchSize) &&
        Objects.equals(this.orderTrackingID, shipmentOrder.orderTrackingID) &&
        Objects.equals(this.clientRefNo, shipmentOrder.clientRefNo) &&
        Objects.equals(this.clientRefNo2, shipmentOrder.clientRefNo2) &&
        Objects.equals(this.hubCode, shipmentOrder.hubCode) &&
        Objects.equals(this.accountNo, shipmentOrder.accountNo) &&
        Objects.equals(this.companyName, shipmentOrder.companyName) &&
        Objects.equals(this.vehicleTypeName, shipmentOrder.vehicleTypeName) &&
        Objects.equals(this.serviceTypeName, shipmentOrder.serviceTypeName) &&
        Objects.equals(this.serviceCode, shipmentOrder.serviceCode) &&
        Objects.equals(this.pieces, shipmentOrder.pieces) &&
        Objects.equals(this.weight, shipmentOrder.weight) &&
        Objects.equals(this.cubicFeet, shipmentOrder.cubicFeet) &&
        Objects.equals(this.pickupCompany, shipmentOrder.pickupCompany) &&
        Objects.equals(this.pickupContact, shipmentOrder.pickupContact) &&
        Objects.equals(this.pickupPhone, shipmentOrder.pickupPhone) &&
        Objects.equals(this.pickupStreet, shipmentOrder.pickupStreet) &&
        Objects.equals(this.pickupStreet2, shipmentOrder.pickupStreet2) &&
        Objects.equals(this.pickupCity, shipmentOrder.pickupCity) &&
        Objects.equals(this.pickupState, shipmentOrder.pickupState) &&
        Objects.equals(this.pickupZip, shipmentOrder.pickupZip) &&
        Objects.equals(this.pickupTargetFrom, shipmentOrder.pickupTargetFrom) &&
        Objects.equals(this.pickupTargetTo, shipmentOrder.pickupTargetTo) &&
        Objects.equals(this.deliveryCompany, shipmentOrder.deliveryCompany) &&
        Objects.equals(this.deliveryContact, shipmentOrder.deliveryContact) &&
        Objects.equals(this.deliveryPhone, shipmentOrder.deliveryPhone) &&
        Objects.equals(this.deliveryStreet, shipmentOrder.deliveryStreet) &&
        Objects.equals(this.deliveryStreet2, shipmentOrder.deliveryStreet2) &&
        Objects.equals(this.deliveryCity, shipmentOrder.deliveryCity) &&
        Objects.equals(this.deliveryState, shipmentOrder.deliveryState) &&
        Objects.equals(this.deliveryZip, shipmentOrder.deliveryZip) &&
        Objects.equals(this.deliveryTargetFrom, shipmentOrder.deliveryTargetFrom) &&
        Objects.equals(this.deliveryTargetTo, shipmentOrder.deliveryTargetTo) &&
        Objects.equals(this.orderPackages, shipmentOrder.orderPackages) &&
        Objects.equals(this.routeID, shipmentOrder.routeID) &&
        Objects.equals(this.driverID, shipmentOrder.driverID) &&
        Objects.equals(this.pickupSequenceNo, shipmentOrder.pickupSequenceNo) &&
        Objects.equals(this.deliverySequenceNo, shipmentOrder.deliverySequenceNo) &&
        Objects.equals(this.pickupETA, shipmentOrder.pickupETA) &&
        Objects.equals(this.deliveryETA, shipmentOrder.deliveryETA);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, batchID, batchSize, orderTrackingID, clientRefNo, clientRefNo2, hubCode, accountNo, companyName, vehicleTypeName, serviceTypeName, serviceCode, pieces, weight, cubicFeet, pickupCompany, pickupContact, pickupPhone, pickupStreet, pickupStreet2, pickupCity, pickupState, pickupZip, pickupTargetFrom, pickupTargetTo, deliveryCompany, deliveryContact, deliveryPhone, deliveryStreet, deliveryStreet2, deliveryCity, deliveryState, deliveryZip, deliveryTargetFrom, deliveryTargetTo, orderPackages, routeID, driverID, pickupSequenceNo, deliverySequenceNo, pickupETA, deliveryETA);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentOrder {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    batchID: ").append(toIndentedString(batchID)).append("\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    sb.append("    orderTrackingID: ").append(toIndentedString(orderTrackingID)).append("\n");
    sb.append("    clientRefNo: ").append(toIndentedString(clientRefNo)).append("\n");
    sb.append("    clientRefNo2: ").append(toIndentedString(clientRefNo2)).append("\n");
    sb.append("    hubCode: ").append(toIndentedString(hubCode)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    vehicleTypeName: ").append(toIndentedString(vehicleTypeName)).append("\n");
    sb.append("    serviceTypeName: ").append(toIndentedString(serviceTypeName)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
    sb.append("    pieces: ").append(toIndentedString(pieces)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    cubicFeet: ").append(toIndentedString(cubicFeet)).append("\n");
    sb.append("    pickupCompany: ").append(toIndentedString(pickupCompany)).append("\n");
    sb.append("    pickupContact: ").append(toIndentedString(pickupContact)).append("\n");
    sb.append("    pickupPhone: ").append(toIndentedString(pickupPhone)).append("\n");
    sb.append("    pickupStreet: ").append(toIndentedString(pickupStreet)).append("\n");
    sb.append("    pickupStreet2: ").append(toIndentedString(pickupStreet2)).append("\n");
    sb.append("    pickupCity: ").append(toIndentedString(pickupCity)).append("\n");
    sb.append("    pickupState: ").append(toIndentedString(pickupState)).append("\n");
    sb.append("    pickupZip: ").append(toIndentedString(pickupZip)).append("\n");
    sb.append("    pickupTargetFrom: ").append(toIndentedString(pickupTargetFrom)).append("\n");
    sb.append("    pickupTargetTo: ").append(toIndentedString(pickupTargetTo)).append("\n");
    sb.append("    deliveryCompany: ").append(toIndentedString(deliveryCompany)).append("\n");
    sb.append("    deliveryContact: ").append(toIndentedString(deliveryContact)).append("\n");
    sb.append("    deliveryPhone: ").append(toIndentedString(deliveryPhone)).append("\n");
    sb.append("    deliveryStreet: ").append(toIndentedString(deliveryStreet)).append("\n");
    sb.append("    deliveryStreet2: ").append(toIndentedString(deliveryStreet2)).append("\n");
    sb.append("    deliveryCity: ").append(toIndentedString(deliveryCity)).append("\n");
    sb.append("    deliveryState: ").append(toIndentedString(deliveryState)).append("\n");
    sb.append("    deliveryZip: ").append(toIndentedString(deliveryZip)).append("\n");
    sb.append("    deliveryTargetFrom: ").append(toIndentedString(deliveryTargetFrom)).append("\n");
    sb.append("    deliveryTargetTo: ").append(toIndentedString(deliveryTargetTo)).append("\n");
    sb.append("    orderPackages: ").append(toIndentedString(orderPackages)).append("\n");
    sb.append("    routeID: ").append(toIndentedString(routeID)).append("\n");
    sb.append("    driverID: ").append(toIndentedString(driverID)).append("\n");
    sb.append("    pickupSequenceNo: ").append(toIndentedString(pickupSequenceNo)).append("\n");
    sb.append("    deliverySequenceNo: ").append(toIndentedString(deliverySequenceNo)).append("\n");
    sb.append("    pickupETA: ").append(toIndentedString(pickupETA)).append("\n");
    sb.append("    deliveryETA: ").append(toIndentedString(deliveryETA)).append("\n");
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

