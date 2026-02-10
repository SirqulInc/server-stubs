package apimodels;

import apimodels.OrderPackage;
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
 * ShipmentOrder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ShipmentOrder   {
  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("BatchID")
  
  private Integer batchID;

  @JsonProperty("BatchSize")
  
  private Integer batchSize;

  @JsonProperty("OrderTrackingID")
  
  private Double orderTrackingID;

  @JsonProperty("ClientRefNo")
  
  private String clientRefNo;

  @JsonProperty("ClientRefNo2")
  
  private String clientRefNo2;

  @JsonProperty("HubCode")
  
  private String hubCode;

  @JsonProperty("AccountNo")
  
  private String accountNo;

  @JsonProperty("CompanyName")
  
  private String companyName;

  @JsonProperty("VehicleTypeName")
  
  private String vehicleTypeName;

  @JsonProperty("ServiceTypeName")
  
  private String serviceTypeName;

  @JsonProperty("ServiceCode")
  
  private String serviceCode;

  @JsonProperty("Pieces")
  
  private Integer pieces;

  @JsonProperty("Weight")
  
  private Double weight;

  @JsonProperty("CubicFeet")
  
  private Double cubicFeet;

  @JsonProperty("PickupCompany")
  
  private String pickupCompany;

  @JsonProperty("PickupContact")
  
  private String pickupContact;

  @JsonProperty("PickupPhone")
  
  private String pickupPhone;

  @JsonProperty("PickupStreet")
  
  private String pickupStreet;

  @JsonProperty("PickupStreet2")
  
  private String pickupStreet2;

  @JsonProperty("PickupCity")
  
  private String pickupCity;

  @JsonProperty("PickupState")
  
  private String pickupState;

  @JsonProperty("PickupZip")
  
  private String pickupZip;

  @JsonProperty("PickupTargetFrom")
  @Valid

  private OffsetDateTime pickupTargetFrom;

  @JsonProperty("PickupTargetTo")
  @Valid

  private OffsetDateTime pickupTargetTo;

  @JsonProperty("DeliveryCompany")
  
  private String deliveryCompany;

  @JsonProperty("DeliveryContact")
  
  private String deliveryContact;

  @JsonProperty("DeliveryPhone")
  
  private String deliveryPhone;

  @JsonProperty("DeliveryStreet")
  
  private String deliveryStreet;

  @JsonProperty("DeliveryStreet2")
  
  private String deliveryStreet2;

  @JsonProperty("DeliveryCity")
  
  private String deliveryCity;

  @JsonProperty("DeliveryState")
  
  private String deliveryState;

  @JsonProperty("DeliveryZip")
  
  private String deliveryZip;

  @JsonProperty("DeliveryTargetFrom")
  @Valid

  private OffsetDateTime deliveryTargetFrom;

  @JsonProperty("DeliveryTargetTo")
  @Valid

  private OffsetDateTime deliveryTargetTo;

  @JsonProperty("OrderPackages")
  @Valid

  private List<@Valid OrderPackage> orderPackages = null;

  @JsonProperty("RouteID")
  
  private Integer routeID;

  @JsonProperty("DriverID")
  
  private Integer driverID;

  @JsonProperty("PickupSequenceNo")
  
  private Integer pickupSequenceNo;

  @JsonProperty("DeliverySequenceNo")
  
  private Integer deliverySequenceNo;

  @JsonProperty("PickupETA")
  
  private String pickupETA;

  @JsonProperty("DeliveryETA")
  
  private String deliveryETA;

  public ShipmentOrder valid(Boolean valid) {
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

  public ShipmentOrder batchID(Integer batchID) {
    this.batchID = batchID;
    return this;
  }

   /**
   * Get batchID
   * @return batchID
  **/
  public Integer getBatchID() {
    return batchID;
  }

  public void setBatchID(Integer batchID) {
    this.batchID = batchID;
  }

  public ShipmentOrder batchSize(Integer batchSize) {
    this.batchSize = batchSize;
    return this;
  }

   /**
   * Get batchSize
   * @return batchSize
  **/
  public Integer getBatchSize() {
    return batchSize;
  }

  public void setBatchSize(Integer batchSize) {
    this.batchSize = batchSize;
  }

  public ShipmentOrder orderTrackingID(Double orderTrackingID) {
    this.orderTrackingID = orderTrackingID;
    return this;
  }

   /**
   * Get orderTrackingID
   * @return orderTrackingID
  **/
  public Double getOrderTrackingID() {
    return orderTrackingID;
  }

  public void setOrderTrackingID(Double orderTrackingID) {
    this.orderTrackingID = orderTrackingID;
  }

  public ShipmentOrder clientRefNo(String clientRefNo) {
    this.clientRefNo = clientRefNo;
    return this;
  }

   /**
   * Get clientRefNo
   * @return clientRefNo
  **/
  public String getClientRefNo() {
    return clientRefNo;
  }

  public void setClientRefNo(String clientRefNo) {
    this.clientRefNo = clientRefNo;
  }

  public ShipmentOrder clientRefNo2(String clientRefNo2) {
    this.clientRefNo2 = clientRefNo2;
    return this;
  }

   /**
   * Get clientRefNo2
   * @return clientRefNo2
  **/
  public String getClientRefNo2() {
    return clientRefNo2;
  }

  public void setClientRefNo2(String clientRefNo2) {
    this.clientRefNo2 = clientRefNo2;
  }

  public ShipmentOrder hubCode(String hubCode) {
    this.hubCode = hubCode;
    return this;
  }

   /**
   * Get hubCode
   * @return hubCode
  **/
  public String getHubCode() {
    return hubCode;
  }

  public void setHubCode(String hubCode) {
    this.hubCode = hubCode;
  }

  public ShipmentOrder accountNo(String accountNo) {
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  public String getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  public ShipmentOrder companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public ShipmentOrder vehicleTypeName(String vehicleTypeName) {
    this.vehicleTypeName = vehicleTypeName;
    return this;
  }

   /**
   * Get vehicleTypeName
   * @return vehicleTypeName
  **/
  public String getVehicleTypeName() {
    return vehicleTypeName;
  }

  public void setVehicleTypeName(String vehicleTypeName) {
    this.vehicleTypeName = vehicleTypeName;
  }

  public ShipmentOrder serviceTypeName(String serviceTypeName) {
    this.serviceTypeName = serviceTypeName;
    return this;
  }

   /**
   * Get serviceTypeName
   * @return serviceTypeName
  **/
  public String getServiceTypeName() {
    return serviceTypeName;
  }

  public void setServiceTypeName(String serviceTypeName) {
    this.serviceTypeName = serviceTypeName;
  }

  public ShipmentOrder serviceCode(String serviceCode) {
    this.serviceCode = serviceCode;
    return this;
  }

   /**
   * Get serviceCode
   * @return serviceCode
  **/
  public String getServiceCode() {
    return serviceCode;
  }

  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }

  public ShipmentOrder pieces(Integer pieces) {
    this.pieces = pieces;
    return this;
  }

   /**
   * Get pieces
   * @return pieces
  **/
  public Integer getPieces() {
    return pieces;
  }

  public void setPieces(Integer pieces) {
    this.pieces = pieces;
  }

  public ShipmentOrder weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public ShipmentOrder cubicFeet(Double cubicFeet) {
    this.cubicFeet = cubicFeet;
    return this;
  }

   /**
   * Get cubicFeet
   * @return cubicFeet
  **/
  public Double getCubicFeet() {
    return cubicFeet;
  }

  public void setCubicFeet(Double cubicFeet) {
    this.cubicFeet = cubicFeet;
  }

  public ShipmentOrder pickupCompany(String pickupCompany) {
    this.pickupCompany = pickupCompany;
    return this;
  }

   /**
   * Get pickupCompany
   * @return pickupCompany
  **/
  public String getPickupCompany() {
    return pickupCompany;
  }

  public void setPickupCompany(String pickupCompany) {
    this.pickupCompany = pickupCompany;
  }

  public ShipmentOrder pickupContact(String pickupContact) {
    this.pickupContact = pickupContact;
    return this;
  }

   /**
   * Get pickupContact
   * @return pickupContact
  **/
  public String getPickupContact() {
    return pickupContact;
  }

  public void setPickupContact(String pickupContact) {
    this.pickupContact = pickupContact;
  }

  public ShipmentOrder pickupPhone(String pickupPhone) {
    this.pickupPhone = pickupPhone;
    return this;
  }

   /**
   * Get pickupPhone
   * @return pickupPhone
  **/
  public String getPickupPhone() {
    return pickupPhone;
  }

  public void setPickupPhone(String pickupPhone) {
    this.pickupPhone = pickupPhone;
  }

  public ShipmentOrder pickupStreet(String pickupStreet) {
    this.pickupStreet = pickupStreet;
    return this;
  }

   /**
   * Get pickupStreet
   * @return pickupStreet
  **/
  public String getPickupStreet() {
    return pickupStreet;
  }

  public void setPickupStreet(String pickupStreet) {
    this.pickupStreet = pickupStreet;
  }

  public ShipmentOrder pickupStreet2(String pickupStreet2) {
    this.pickupStreet2 = pickupStreet2;
    return this;
  }

   /**
   * Get pickupStreet2
   * @return pickupStreet2
  **/
  public String getPickupStreet2() {
    return pickupStreet2;
  }

  public void setPickupStreet2(String pickupStreet2) {
    this.pickupStreet2 = pickupStreet2;
  }

  public ShipmentOrder pickupCity(String pickupCity) {
    this.pickupCity = pickupCity;
    return this;
  }

   /**
   * Get pickupCity
   * @return pickupCity
  **/
  public String getPickupCity() {
    return pickupCity;
  }

  public void setPickupCity(String pickupCity) {
    this.pickupCity = pickupCity;
  }

  public ShipmentOrder pickupState(String pickupState) {
    this.pickupState = pickupState;
    return this;
  }

   /**
   * Get pickupState
   * @return pickupState
  **/
  public String getPickupState() {
    return pickupState;
  }

  public void setPickupState(String pickupState) {
    this.pickupState = pickupState;
  }

  public ShipmentOrder pickupZip(String pickupZip) {
    this.pickupZip = pickupZip;
    return this;
  }

   /**
   * Get pickupZip
   * @return pickupZip
  **/
  public String getPickupZip() {
    return pickupZip;
  }

  public void setPickupZip(String pickupZip) {
    this.pickupZip = pickupZip;
  }

  public ShipmentOrder pickupTargetFrom(OffsetDateTime pickupTargetFrom) {
    this.pickupTargetFrom = pickupTargetFrom;
    return this;
  }

   /**
   * Get pickupTargetFrom
   * @return pickupTargetFrom
  **/
  public OffsetDateTime getPickupTargetFrom() {
    return pickupTargetFrom;
  }

  public void setPickupTargetFrom(OffsetDateTime pickupTargetFrom) {
    this.pickupTargetFrom = pickupTargetFrom;
  }

  public ShipmentOrder pickupTargetTo(OffsetDateTime pickupTargetTo) {
    this.pickupTargetTo = pickupTargetTo;
    return this;
  }

   /**
   * Get pickupTargetTo
   * @return pickupTargetTo
  **/
  public OffsetDateTime getPickupTargetTo() {
    return pickupTargetTo;
  }

  public void setPickupTargetTo(OffsetDateTime pickupTargetTo) {
    this.pickupTargetTo = pickupTargetTo;
  }

  public ShipmentOrder deliveryCompany(String deliveryCompany) {
    this.deliveryCompany = deliveryCompany;
    return this;
  }

   /**
   * Get deliveryCompany
   * @return deliveryCompany
  **/
  public String getDeliveryCompany() {
    return deliveryCompany;
  }

  public void setDeliveryCompany(String deliveryCompany) {
    this.deliveryCompany = deliveryCompany;
  }

  public ShipmentOrder deliveryContact(String deliveryContact) {
    this.deliveryContact = deliveryContact;
    return this;
  }

   /**
   * Get deliveryContact
   * @return deliveryContact
  **/
  public String getDeliveryContact() {
    return deliveryContact;
  }

  public void setDeliveryContact(String deliveryContact) {
    this.deliveryContact = deliveryContact;
  }

  public ShipmentOrder deliveryPhone(String deliveryPhone) {
    this.deliveryPhone = deliveryPhone;
    return this;
  }

   /**
   * Get deliveryPhone
   * @return deliveryPhone
  **/
  public String getDeliveryPhone() {
    return deliveryPhone;
  }

  public void setDeliveryPhone(String deliveryPhone) {
    this.deliveryPhone = deliveryPhone;
  }

  public ShipmentOrder deliveryStreet(String deliveryStreet) {
    this.deliveryStreet = deliveryStreet;
    return this;
  }

   /**
   * Get deliveryStreet
   * @return deliveryStreet
  **/
  public String getDeliveryStreet() {
    return deliveryStreet;
  }

  public void setDeliveryStreet(String deliveryStreet) {
    this.deliveryStreet = deliveryStreet;
  }

  public ShipmentOrder deliveryStreet2(String deliveryStreet2) {
    this.deliveryStreet2 = deliveryStreet2;
    return this;
  }

   /**
   * Get deliveryStreet2
   * @return deliveryStreet2
  **/
  public String getDeliveryStreet2() {
    return deliveryStreet2;
  }

  public void setDeliveryStreet2(String deliveryStreet2) {
    this.deliveryStreet2 = deliveryStreet2;
  }

  public ShipmentOrder deliveryCity(String deliveryCity) {
    this.deliveryCity = deliveryCity;
    return this;
  }

   /**
   * Get deliveryCity
   * @return deliveryCity
  **/
  public String getDeliveryCity() {
    return deliveryCity;
  }

  public void setDeliveryCity(String deliveryCity) {
    this.deliveryCity = deliveryCity;
  }

  public ShipmentOrder deliveryState(String deliveryState) {
    this.deliveryState = deliveryState;
    return this;
  }

   /**
   * Get deliveryState
   * @return deliveryState
  **/
  public String getDeliveryState() {
    return deliveryState;
  }

  public void setDeliveryState(String deliveryState) {
    this.deliveryState = deliveryState;
  }

  public ShipmentOrder deliveryZip(String deliveryZip) {
    this.deliveryZip = deliveryZip;
    return this;
  }

   /**
   * Get deliveryZip
   * @return deliveryZip
  **/
  public String getDeliveryZip() {
    return deliveryZip;
  }

  public void setDeliveryZip(String deliveryZip) {
    this.deliveryZip = deliveryZip;
  }

  public ShipmentOrder deliveryTargetFrom(OffsetDateTime deliveryTargetFrom) {
    this.deliveryTargetFrom = deliveryTargetFrom;
    return this;
  }

   /**
   * Get deliveryTargetFrom
   * @return deliveryTargetFrom
  **/
  public OffsetDateTime getDeliveryTargetFrom() {
    return deliveryTargetFrom;
  }

  public void setDeliveryTargetFrom(OffsetDateTime deliveryTargetFrom) {
    this.deliveryTargetFrom = deliveryTargetFrom;
  }

  public ShipmentOrder deliveryTargetTo(OffsetDateTime deliveryTargetTo) {
    this.deliveryTargetTo = deliveryTargetTo;
    return this;
  }

   /**
   * Get deliveryTargetTo
   * @return deliveryTargetTo
  **/
  public OffsetDateTime getDeliveryTargetTo() {
    return deliveryTargetTo;
  }

  public void setDeliveryTargetTo(OffsetDateTime deliveryTargetTo) {
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
  **/
  public List<@Valid OrderPackage> getOrderPackages() {
    return orderPackages;
  }

  public void setOrderPackages(List<@Valid OrderPackage> orderPackages) {
    this.orderPackages = orderPackages;
  }

  public ShipmentOrder routeID(Integer routeID) {
    this.routeID = routeID;
    return this;
  }

   /**
   * Get routeID
   * @return routeID
  **/
  public Integer getRouteID() {
    return routeID;
  }

  public void setRouteID(Integer routeID) {
    this.routeID = routeID;
  }

  public ShipmentOrder driverID(Integer driverID) {
    this.driverID = driverID;
    return this;
  }

   /**
   * Get driverID
   * @return driverID
  **/
  public Integer getDriverID() {
    return driverID;
  }

  public void setDriverID(Integer driverID) {
    this.driverID = driverID;
  }

  public ShipmentOrder pickupSequenceNo(Integer pickupSequenceNo) {
    this.pickupSequenceNo = pickupSequenceNo;
    return this;
  }

   /**
   * Get pickupSequenceNo
   * @return pickupSequenceNo
  **/
  public Integer getPickupSequenceNo() {
    return pickupSequenceNo;
  }

  public void setPickupSequenceNo(Integer pickupSequenceNo) {
    this.pickupSequenceNo = pickupSequenceNo;
  }

  public ShipmentOrder deliverySequenceNo(Integer deliverySequenceNo) {
    this.deliverySequenceNo = deliverySequenceNo;
    return this;
  }

   /**
   * Get deliverySequenceNo
   * @return deliverySequenceNo
  **/
  public Integer getDeliverySequenceNo() {
    return deliverySequenceNo;
  }

  public void setDeliverySequenceNo(Integer deliverySequenceNo) {
    this.deliverySequenceNo = deliverySequenceNo;
  }

  public ShipmentOrder pickupETA(String pickupETA) {
    this.pickupETA = pickupETA;
    return this;
  }

   /**
   * Get pickupETA
   * @return pickupETA
  **/
  public String getPickupETA() {
    return pickupETA;
  }

  public void setPickupETA(String pickupETA) {
    this.pickupETA = pickupETA;
  }

  public ShipmentOrder deliveryETA(String deliveryETA) {
    this.deliveryETA = deliveryETA;
    return this;
  }

   /**
   * Get deliveryETA
   * @return deliveryETA
  **/
  public String getDeliveryETA() {
    return deliveryETA;
  }

  public void setDeliveryETA(String deliveryETA) {
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
    return Objects.equals(valid, shipmentOrder.valid) &&
        Objects.equals(batchID, shipmentOrder.batchID) &&
        Objects.equals(batchSize, shipmentOrder.batchSize) &&
        Objects.equals(orderTrackingID, shipmentOrder.orderTrackingID) &&
        Objects.equals(clientRefNo, shipmentOrder.clientRefNo) &&
        Objects.equals(clientRefNo2, shipmentOrder.clientRefNo2) &&
        Objects.equals(hubCode, shipmentOrder.hubCode) &&
        Objects.equals(accountNo, shipmentOrder.accountNo) &&
        Objects.equals(companyName, shipmentOrder.companyName) &&
        Objects.equals(vehicleTypeName, shipmentOrder.vehicleTypeName) &&
        Objects.equals(serviceTypeName, shipmentOrder.serviceTypeName) &&
        Objects.equals(serviceCode, shipmentOrder.serviceCode) &&
        Objects.equals(pieces, shipmentOrder.pieces) &&
        Objects.equals(weight, shipmentOrder.weight) &&
        Objects.equals(cubicFeet, shipmentOrder.cubicFeet) &&
        Objects.equals(pickupCompany, shipmentOrder.pickupCompany) &&
        Objects.equals(pickupContact, shipmentOrder.pickupContact) &&
        Objects.equals(pickupPhone, shipmentOrder.pickupPhone) &&
        Objects.equals(pickupStreet, shipmentOrder.pickupStreet) &&
        Objects.equals(pickupStreet2, shipmentOrder.pickupStreet2) &&
        Objects.equals(pickupCity, shipmentOrder.pickupCity) &&
        Objects.equals(pickupState, shipmentOrder.pickupState) &&
        Objects.equals(pickupZip, shipmentOrder.pickupZip) &&
        Objects.equals(pickupTargetFrom, shipmentOrder.pickupTargetFrom) &&
        Objects.equals(pickupTargetTo, shipmentOrder.pickupTargetTo) &&
        Objects.equals(deliveryCompany, shipmentOrder.deliveryCompany) &&
        Objects.equals(deliveryContact, shipmentOrder.deliveryContact) &&
        Objects.equals(deliveryPhone, shipmentOrder.deliveryPhone) &&
        Objects.equals(deliveryStreet, shipmentOrder.deliveryStreet) &&
        Objects.equals(deliveryStreet2, shipmentOrder.deliveryStreet2) &&
        Objects.equals(deliveryCity, shipmentOrder.deliveryCity) &&
        Objects.equals(deliveryState, shipmentOrder.deliveryState) &&
        Objects.equals(deliveryZip, shipmentOrder.deliveryZip) &&
        Objects.equals(deliveryTargetFrom, shipmentOrder.deliveryTargetFrom) &&
        Objects.equals(deliveryTargetTo, shipmentOrder.deliveryTargetTo) &&
        Objects.equals(orderPackages, shipmentOrder.orderPackages) &&
        Objects.equals(routeID, shipmentOrder.routeID) &&
        Objects.equals(driverID, shipmentOrder.driverID) &&
        Objects.equals(pickupSequenceNo, shipmentOrder.pickupSequenceNo) &&
        Objects.equals(deliverySequenceNo, shipmentOrder.deliverySequenceNo) &&
        Objects.equals(pickupETA, shipmentOrder.pickupETA) &&
        Objects.equals(deliveryETA, shipmentOrder.deliveryETA);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, batchID, batchSize, orderTrackingID, clientRefNo, clientRefNo2, hubCode, accountNo, companyName, vehicleTypeName, serviceTypeName, serviceCode, pieces, weight, cubicFeet, pickupCompany, pickupContact, pickupPhone, pickupStreet, pickupStreet2, pickupCity, pickupState, pickupZip, pickupTargetFrom, pickupTargetTo, deliveryCompany, deliveryContact, deliveryPhone, deliveryStreet, deliveryStreet2, deliveryCity, deliveryState, deliveryZip, deliveryTargetFrom, deliveryTargetTo, orderPackages, routeID, driverID, pickupSequenceNo, deliverySequenceNo, pickupETA, deliveryETA);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

