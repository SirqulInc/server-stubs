package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.OrderPackage;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ShipmentOrder  {
  
  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private Integer batchID;

  @ApiModelProperty(value = "")

  private Integer batchSize;

  @ApiModelProperty(value = "")

  private Double orderTrackingID;

  @ApiModelProperty(value = "")

  private String clientRefNo;

  @ApiModelProperty(value = "")

  private String clientRefNo2;

  @ApiModelProperty(value = "")

  private String hubCode;

  @ApiModelProperty(value = "")

  private String accountNo;

  @ApiModelProperty(value = "")

  private String companyName;

  @ApiModelProperty(value = "")

  private String vehicleTypeName;

  @ApiModelProperty(value = "")

  private String serviceTypeName;

  @ApiModelProperty(value = "")

  private String serviceCode;

  @ApiModelProperty(value = "")

  private Integer pieces;

  @ApiModelProperty(value = "")

  private Double weight;

  @ApiModelProperty(value = "")

  private Double cubicFeet;

  @ApiModelProperty(value = "")

  private String pickupCompany;

  @ApiModelProperty(value = "")

  private String pickupContact;

  @ApiModelProperty(value = "")

  private String pickupPhone;

  @ApiModelProperty(value = "")

  private String pickupStreet;

  @ApiModelProperty(value = "")

  private String pickupStreet2;

  @ApiModelProperty(value = "")

  private String pickupCity;

  @ApiModelProperty(value = "")

  private String pickupState;

  @ApiModelProperty(value = "")

  private String pickupZip;

  @ApiModelProperty(value = "")

  private Date pickupTargetFrom;

  @ApiModelProperty(value = "")

  private Date pickupTargetTo;

  @ApiModelProperty(value = "")

  private String deliveryCompany;

  @ApiModelProperty(value = "")

  private String deliveryContact;

  @ApiModelProperty(value = "")

  private String deliveryPhone;

  @ApiModelProperty(value = "")

  private String deliveryStreet;

  @ApiModelProperty(value = "")

  private String deliveryStreet2;

  @ApiModelProperty(value = "")

  private String deliveryCity;

  @ApiModelProperty(value = "")

  private String deliveryState;

  @ApiModelProperty(value = "")

  private String deliveryZip;

  @ApiModelProperty(value = "")

  private Date deliveryTargetFrom;

  @ApiModelProperty(value = "")

  private Date deliveryTargetTo;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid OrderPackage> orderPackages = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Integer routeID;

  @ApiModelProperty(value = "")

  private Integer driverID;

  @ApiModelProperty(value = "")

  private Integer pickupSequenceNo;

  @ApiModelProperty(value = "")

  private Integer deliverySequenceNo;

  @ApiModelProperty(value = "")

  private String pickupETA;

  @ApiModelProperty(value = "")

  private String deliveryETA;
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

  public ShipmentOrder valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get batchID
   * @return batchID
  **/
  @JsonProperty("BatchID")
  public Integer getBatchID() {
    return batchID;
  }

  public void setBatchID(Integer batchID) {
    this.batchID = batchID;
  }

  public ShipmentOrder batchID(Integer batchID) {
    this.batchID = batchID;
    return this;
  }

 /**
   * Get batchSize
   * @return batchSize
  **/
  @JsonProperty("BatchSize")
  public Integer getBatchSize() {
    return batchSize;
  }

  public void setBatchSize(Integer batchSize) {
    this.batchSize = batchSize;
  }

  public ShipmentOrder batchSize(Integer batchSize) {
    this.batchSize = batchSize;
    return this;
  }

 /**
   * Get orderTrackingID
   * @return orderTrackingID
  **/
  @JsonProperty("OrderTrackingID")
  public Double getOrderTrackingID() {
    return orderTrackingID;
  }

  public void setOrderTrackingID(Double orderTrackingID) {
    this.orderTrackingID = orderTrackingID;
  }

  public ShipmentOrder orderTrackingID(Double orderTrackingID) {
    this.orderTrackingID = orderTrackingID;
    return this;
  }

 /**
   * Get clientRefNo
   * @return clientRefNo
  **/
  @JsonProperty("ClientRefNo")
  public String getClientRefNo() {
    return clientRefNo;
  }

  public void setClientRefNo(String clientRefNo) {
    this.clientRefNo = clientRefNo;
  }

  public ShipmentOrder clientRefNo(String clientRefNo) {
    this.clientRefNo = clientRefNo;
    return this;
  }

 /**
   * Get clientRefNo2
   * @return clientRefNo2
  **/
  @JsonProperty("ClientRefNo2")
  public String getClientRefNo2() {
    return clientRefNo2;
  }

  public void setClientRefNo2(String clientRefNo2) {
    this.clientRefNo2 = clientRefNo2;
  }

  public ShipmentOrder clientRefNo2(String clientRefNo2) {
    this.clientRefNo2 = clientRefNo2;
    return this;
  }

 /**
   * Get hubCode
   * @return hubCode
  **/
  @JsonProperty("HubCode")
  public String getHubCode() {
    return hubCode;
  }

  public void setHubCode(String hubCode) {
    this.hubCode = hubCode;
  }

  public ShipmentOrder hubCode(String hubCode) {
    this.hubCode = hubCode;
    return this;
  }

 /**
   * Get accountNo
   * @return accountNo
  **/
  @JsonProperty("AccountNo")
  public String getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  public ShipmentOrder accountNo(String accountNo) {
    this.accountNo = accountNo;
    return this;
  }

 /**
   * Get companyName
   * @return companyName
  **/
  @JsonProperty("CompanyName")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public ShipmentOrder companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

 /**
   * Get vehicleTypeName
   * @return vehicleTypeName
  **/
  @JsonProperty("VehicleTypeName")
  public String getVehicleTypeName() {
    return vehicleTypeName;
  }

  public void setVehicleTypeName(String vehicleTypeName) {
    this.vehicleTypeName = vehicleTypeName;
  }

  public ShipmentOrder vehicleTypeName(String vehicleTypeName) {
    this.vehicleTypeName = vehicleTypeName;
    return this;
  }

 /**
   * Get serviceTypeName
   * @return serviceTypeName
  **/
  @JsonProperty("ServiceTypeName")
  public String getServiceTypeName() {
    return serviceTypeName;
  }

  public void setServiceTypeName(String serviceTypeName) {
    this.serviceTypeName = serviceTypeName;
  }

  public ShipmentOrder serviceTypeName(String serviceTypeName) {
    this.serviceTypeName = serviceTypeName;
    return this;
  }

 /**
   * Get serviceCode
   * @return serviceCode
  **/
  @JsonProperty("ServiceCode")
  public String getServiceCode() {
    return serviceCode;
  }

  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }

  public ShipmentOrder serviceCode(String serviceCode) {
    this.serviceCode = serviceCode;
    return this;
  }

 /**
   * Get pieces
   * @return pieces
  **/
  @JsonProperty("Pieces")
  public Integer getPieces() {
    return pieces;
  }

  public void setPieces(Integer pieces) {
    this.pieces = pieces;
  }

  public ShipmentOrder pieces(Integer pieces) {
    this.pieces = pieces;
    return this;
  }

 /**
   * Get weight
   * @return weight
  **/
  @JsonProperty("Weight")
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public ShipmentOrder weight(Double weight) {
    this.weight = weight;
    return this;
  }

 /**
   * Get cubicFeet
   * @return cubicFeet
  **/
  @JsonProperty("CubicFeet")
  public Double getCubicFeet() {
    return cubicFeet;
  }

  public void setCubicFeet(Double cubicFeet) {
    this.cubicFeet = cubicFeet;
  }

  public ShipmentOrder cubicFeet(Double cubicFeet) {
    this.cubicFeet = cubicFeet;
    return this;
  }

 /**
   * Get pickupCompany
   * @return pickupCompany
  **/
  @JsonProperty("PickupCompany")
  public String getPickupCompany() {
    return pickupCompany;
  }

  public void setPickupCompany(String pickupCompany) {
    this.pickupCompany = pickupCompany;
  }

  public ShipmentOrder pickupCompany(String pickupCompany) {
    this.pickupCompany = pickupCompany;
    return this;
  }

 /**
   * Get pickupContact
   * @return pickupContact
  **/
  @JsonProperty("PickupContact")
  public String getPickupContact() {
    return pickupContact;
  }

  public void setPickupContact(String pickupContact) {
    this.pickupContact = pickupContact;
  }

  public ShipmentOrder pickupContact(String pickupContact) {
    this.pickupContact = pickupContact;
    return this;
  }

 /**
   * Get pickupPhone
   * @return pickupPhone
  **/
  @JsonProperty("PickupPhone")
  public String getPickupPhone() {
    return pickupPhone;
  }

  public void setPickupPhone(String pickupPhone) {
    this.pickupPhone = pickupPhone;
  }

  public ShipmentOrder pickupPhone(String pickupPhone) {
    this.pickupPhone = pickupPhone;
    return this;
  }

 /**
   * Get pickupStreet
   * @return pickupStreet
  **/
  @JsonProperty("PickupStreet")
  public String getPickupStreet() {
    return pickupStreet;
  }

  public void setPickupStreet(String pickupStreet) {
    this.pickupStreet = pickupStreet;
  }

  public ShipmentOrder pickupStreet(String pickupStreet) {
    this.pickupStreet = pickupStreet;
    return this;
  }

 /**
   * Get pickupStreet2
   * @return pickupStreet2
  **/
  @JsonProperty("PickupStreet2")
  public String getPickupStreet2() {
    return pickupStreet2;
  }

  public void setPickupStreet2(String pickupStreet2) {
    this.pickupStreet2 = pickupStreet2;
  }

  public ShipmentOrder pickupStreet2(String pickupStreet2) {
    this.pickupStreet2 = pickupStreet2;
    return this;
  }

 /**
   * Get pickupCity
   * @return pickupCity
  **/
  @JsonProperty("PickupCity")
  public String getPickupCity() {
    return pickupCity;
  }

  public void setPickupCity(String pickupCity) {
    this.pickupCity = pickupCity;
  }

  public ShipmentOrder pickupCity(String pickupCity) {
    this.pickupCity = pickupCity;
    return this;
  }

 /**
   * Get pickupState
   * @return pickupState
  **/
  @JsonProperty("PickupState")
  public String getPickupState() {
    return pickupState;
  }

  public void setPickupState(String pickupState) {
    this.pickupState = pickupState;
  }

  public ShipmentOrder pickupState(String pickupState) {
    this.pickupState = pickupState;
    return this;
  }

 /**
   * Get pickupZip
   * @return pickupZip
  **/
  @JsonProperty("PickupZip")
  public String getPickupZip() {
    return pickupZip;
  }

  public void setPickupZip(String pickupZip) {
    this.pickupZip = pickupZip;
  }

  public ShipmentOrder pickupZip(String pickupZip) {
    this.pickupZip = pickupZip;
    return this;
  }

 /**
   * Get pickupTargetFrom
   * @return pickupTargetFrom
  **/
  @JsonProperty("PickupTargetFrom")
  public Date getPickupTargetFrom() {
    return pickupTargetFrom;
  }

  public void setPickupTargetFrom(Date pickupTargetFrom) {
    this.pickupTargetFrom = pickupTargetFrom;
  }

  public ShipmentOrder pickupTargetFrom(Date pickupTargetFrom) {
    this.pickupTargetFrom = pickupTargetFrom;
    return this;
  }

 /**
   * Get pickupTargetTo
   * @return pickupTargetTo
  **/
  @JsonProperty("PickupTargetTo")
  public Date getPickupTargetTo() {
    return pickupTargetTo;
  }

  public void setPickupTargetTo(Date pickupTargetTo) {
    this.pickupTargetTo = pickupTargetTo;
  }

  public ShipmentOrder pickupTargetTo(Date pickupTargetTo) {
    this.pickupTargetTo = pickupTargetTo;
    return this;
  }

 /**
   * Get deliveryCompany
   * @return deliveryCompany
  **/
  @JsonProperty("DeliveryCompany")
  public String getDeliveryCompany() {
    return deliveryCompany;
  }

  public void setDeliveryCompany(String deliveryCompany) {
    this.deliveryCompany = deliveryCompany;
  }

  public ShipmentOrder deliveryCompany(String deliveryCompany) {
    this.deliveryCompany = deliveryCompany;
    return this;
  }

 /**
   * Get deliveryContact
   * @return deliveryContact
  **/
  @JsonProperty("DeliveryContact")
  public String getDeliveryContact() {
    return deliveryContact;
  }

  public void setDeliveryContact(String deliveryContact) {
    this.deliveryContact = deliveryContact;
  }

  public ShipmentOrder deliveryContact(String deliveryContact) {
    this.deliveryContact = deliveryContact;
    return this;
  }

 /**
   * Get deliveryPhone
   * @return deliveryPhone
  **/
  @JsonProperty("DeliveryPhone")
  public String getDeliveryPhone() {
    return deliveryPhone;
  }

  public void setDeliveryPhone(String deliveryPhone) {
    this.deliveryPhone = deliveryPhone;
  }

  public ShipmentOrder deliveryPhone(String deliveryPhone) {
    this.deliveryPhone = deliveryPhone;
    return this;
  }

 /**
   * Get deliveryStreet
   * @return deliveryStreet
  **/
  @JsonProperty("DeliveryStreet")
  public String getDeliveryStreet() {
    return deliveryStreet;
  }

  public void setDeliveryStreet(String deliveryStreet) {
    this.deliveryStreet = deliveryStreet;
  }

  public ShipmentOrder deliveryStreet(String deliveryStreet) {
    this.deliveryStreet = deliveryStreet;
    return this;
  }

 /**
   * Get deliveryStreet2
   * @return deliveryStreet2
  **/
  @JsonProperty("DeliveryStreet2")
  public String getDeliveryStreet2() {
    return deliveryStreet2;
  }

  public void setDeliveryStreet2(String deliveryStreet2) {
    this.deliveryStreet2 = deliveryStreet2;
  }

  public ShipmentOrder deliveryStreet2(String deliveryStreet2) {
    this.deliveryStreet2 = deliveryStreet2;
    return this;
  }

 /**
   * Get deliveryCity
   * @return deliveryCity
  **/
  @JsonProperty("DeliveryCity")
  public String getDeliveryCity() {
    return deliveryCity;
  }

  public void setDeliveryCity(String deliveryCity) {
    this.deliveryCity = deliveryCity;
  }

  public ShipmentOrder deliveryCity(String deliveryCity) {
    this.deliveryCity = deliveryCity;
    return this;
  }

 /**
   * Get deliveryState
   * @return deliveryState
  **/
  @JsonProperty("DeliveryState")
  public String getDeliveryState() {
    return deliveryState;
  }

  public void setDeliveryState(String deliveryState) {
    this.deliveryState = deliveryState;
  }

  public ShipmentOrder deliveryState(String deliveryState) {
    this.deliveryState = deliveryState;
    return this;
  }

 /**
   * Get deliveryZip
   * @return deliveryZip
  **/
  @JsonProperty("DeliveryZip")
  public String getDeliveryZip() {
    return deliveryZip;
  }

  public void setDeliveryZip(String deliveryZip) {
    this.deliveryZip = deliveryZip;
  }

  public ShipmentOrder deliveryZip(String deliveryZip) {
    this.deliveryZip = deliveryZip;
    return this;
  }

 /**
   * Get deliveryTargetFrom
   * @return deliveryTargetFrom
  **/
  @JsonProperty("DeliveryTargetFrom")
  public Date getDeliveryTargetFrom() {
    return deliveryTargetFrom;
  }

  public void setDeliveryTargetFrom(Date deliveryTargetFrom) {
    this.deliveryTargetFrom = deliveryTargetFrom;
  }

  public ShipmentOrder deliveryTargetFrom(Date deliveryTargetFrom) {
    this.deliveryTargetFrom = deliveryTargetFrom;
    return this;
  }

 /**
   * Get deliveryTargetTo
   * @return deliveryTargetTo
  **/
  @JsonProperty("DeliveryTargetTo")
  public Date getDeliveryTargetTo() {
    return deliveryTargetTo;
  }

  public void setDeliveryTargetTo(Date deliveryTargetTo) {
    this.deliveryTargetTo = deliveryTargetTo;
  }

  public ShipmentOrder deliveryTargetTo(Date deliveryTargetTo) {
    this.deliveryTargetTo = deliveryTargetTo;
    return this;
  }

 /**
   * Get orderPackages
   * @return orderPackages
  **/
  @JsonProperty("OrderPackages")
  public List<@Valid OrderPackage> getOrderPackages() {
    return orderPackages;
  }

  public void setOrderPackages(List<@Valid OrderPackage> orderPackages) {
    this.orderPackages = orderPackages;
  }

  public ShipmentOrder orderPackages(List<@Valid OrderPackage> orderPackages) {
    this.orderPackages = orderPackages;
    return this;
  }

  public ShipmentOrder addOrderPackagesItem(OrderPackage orderPackagesItem) {
    this.orderPackages.add(orderPackagesItem);
    return this;
  }

 /**
   * Get routeID
   * @return routeID
  **/
  @JsonProperty("RouteID")
  public Integer getRouteID() {
    return routeID;
  }

  public void setRouteID(Integer routeID) {
    this.routeID = routeID;
  }

  public ShipmentOrder routeID(Integer routeID) {
    this.routeID = routeID;
    return this;
  }

 /**
   * Get driverID
   * @return driverID
  **/
  @JsonProperty("DriverID")
  public Integer getDriverID() {
    return driverID;
  }

  public void setDriverID(Integer driverID) {
    this.driverID = driverID;
  }

  public ShipmentOrder driverID(Integer driverID) {
    this.driverID = driverID;
    return this;
  }

 /**
   * Get pickupSequenceNo
   * @return pickupSequenceNo
  **/
  @JsonProperty("PickupSequenceNo")
  public Integer getPickupSequenceNo() {
    return pickupSequenceNo;
  }

  public void setPickupSequenceNo(Integer pickupSequenceNo) {
    this.pickupSequenceNo = pickupSequenceNo;
  }

  public ShipmentOrder pickupSequenceNo(Integer pickupSequenceNo) {
    this.pickupSequenceNo = pickupSequenceNo;
    return this;
  }

 /**
   * Get deliverySequenceNo
   * @return deliverySequenceNo
  **/
  @JsonProperty("DeliverySequenceNo")
  public Integer getDeliverySequenceNo() {
    return deliverySequenceNo;
  }

  public void setDeliverySequenceNo(Integer deliverySequenceNo) {
    this.deliverySequenceNo = deliverySequenceNo;
  }

  public ShipmentOrder deliverySequenceNo(Integer deliverySequenceNo) {
    this.deliverySequenceNo = deliverySequenceNo;
    return this;
  }

 /**
   * Get pickupETA
   * @return pickupETA
  **/
  @JsonProperty("PickupETA")
  public String getPickupETA() {
    return pickupETA;
  }

  public void setPickupETA(String pickupETA) {
    this.pickupETA = pickupETA;
  }

  public ShipmentOrder pickupETA(String pickupETA) {
    this.pickupETA = pickupETA;
    return this;
  }

 /**
   * Get deliveryETA
   * @return deliveryETA
  **/
  @JsonProperty("DeliveryETA")
  public String getDeliveryETA() {
    return deliveryETA;
  }

  public void setDeliveryETA(String deliveryETA) {
    this.deliveryETA = deliveryETA;
  }

  public ShipmentOrder deliveryETA(String deliveryETA) {
    this.deliveryETA = deliveryETA;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

