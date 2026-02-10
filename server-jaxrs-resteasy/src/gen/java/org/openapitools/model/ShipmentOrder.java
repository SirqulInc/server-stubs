package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.OrderPackage;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ShipmentOrder   {
  
  private Boolean valid;
  private Integer batchID;
  private Integer batchSize;
  private Double orderTrackingID;
  private String clientRefNo;
  private String clientRefNo2;
  private String hubCode;
  private String accountNo;
  private String companyName;
  private String vehicleTypeName;
  private String serviceTypeName;
  private String serviceCode;
  private Integer pieces;
  private Double weight;
  private Double cubicFeet;
  private String pickupCompany;
  private String pickupContact;
  private String pickupPhone;
  private String pickupStreet;
  private String pickupStreet2;
  private String pickupCity;
  private String pickupState;
  private String pickupZip;
  private Date pickupTargetFrom;
  private Date pickupTargetTo;
  private String deliveryCompany;
  private String deliveryContact;
  private String deliveryPhone;
  private String deliveryStreet;
  private String deliveryStreet2;
  private String deliveryCity;
  private String deliveryState;
  private String deliveryZip;
  private Date deliveryTargetFrom;
  private Date deliveryTargetTo;
  private List<@Valid OrderPackage> orderPackages = new ArrayList<>();
  private Integer routeID;
  private Integer driverID;
  private Integer pickupSequenceNo;
  private Integer deliverySequenceNo;
  private String pickupETA;
  private String deliveryETA;

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
  @JsonProperty("BatchID")
  public Integer getBatchID() {
    return batchID;
  }
  public void setBatchID(Integer batchID) {
    this.batchID = batchID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("BatchSize")
  public Integer getBatchSize() {
    return batchSize;
  }
  public void setBatchSize(Integer batchSize) {
    this.batchSize = batchSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("OrderTrackingID")
  public Double getOrderTrackingID() {
    return orderTrackingID;
  }
  public void setOrderTrackingID(Double orderTrackingID) {
    this.orderTrackingID = orderTrackingID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ClientRefNo")
  public String getClientRefNo() {
    return clientRefNo;
  }
  public void setClientRefNo(String clientRefNo) {
    this.clientRefNo = clientRefNo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ClientRefNo2")
  public String getClientRefNo2() {
    return clientRefNo2;
  }
  public void setClientRefNo2(String clientRefNo2) {
    this.clientRefNo2 = clientRefNo2;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("HubCode")
  public String getHubCode() {
    return hubCode;
  }
  public void setHubCode(String hubCode) {
    this.hubCode = hubCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("AccountNo")
  public String getAccountNo() {
    return accountNo;
  }
  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("CompanyName")
  public String getCompanyName() {
    return companyName;
  }
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("VehicleTypeName")
  public String getVehicleTypeName() {
    return vehicleTypeName;
  }
  public void setVehicleTypeName(String vehicleTypeName) {
    this.vehicleTypeName = vehicleTypeName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ServiceTypeName")
  public String getServiceTypeName() {
    return serviceTypeName;
  }
  public void setServiceTypeName(String serviceTypeName) {
    this.serviceTypeName = serviceTypeName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ServiceCode")
  public String getServiceCode() {
    return serviceCode;
  }
  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Pieces")
  public Integer getPieces() {
    return pieces;
  }
  public void setPieces(Integer pieces) {
    this.pieces = pieces;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Weight")
  public Double getWeight() {
    return weight;
  }
  public void setWeight(Double weight) {
    this.weight = weight;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("CubicFeet")
  public Double getCubicFeet() {
    return cubicFeet;
  }
  public void setCubicFeet(Double cubicFeet) {
    this.cubicFeet = cubicFeet;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("PickupCompany")
  public String getPickupCompany() {
    return pickupCompany;
  }
  public void setPickupCompany(String pickupCompany) {
    this.pickupCompany = pickupCompany;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("PickupContact")
  public String getPickupContact() {
    return pickupContact;
  }
  public void setPickupContact(String pickupContact) {
    this.pickupContact = pickupContact;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("PickupPhone")
  public String getPickupPhone() {
    return pickupPhone;
  }
  public void setPickupPhone(String pickupPhone) {
    this.pickupPhone = pickupPhone;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("PickupStreet")
  public String getPickupStreet() {
    return pickupStreet;
  }
  public void setPickupStreet(String pickupStreet) {
    this.pickupStreet = pickupStreet;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("PickupStreet2")
  public String getPickupStreet2() {
    return pickupStreet2;
  }
  public void setPickupStreet2(String pickupStreet2) {
    this.pickupStreet2 = pickupStreet2;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("PickupCity")
  public String getPickupCity() {
    return pickupCity;
  }
  public void setPickupCity(String pickupCity) {
    this.pickupCity = pickupCity;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("PickupState")
  public String getPickupState() {
    return pickupState;
  }
  public void setPickupState(String pickupState) {
    this.pickupState = pickupState;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("PickupZip")
  public String getPickupZip() {
    return pickupZip;
  }
  public void setPickupZip(String pickupZip) {
    this.pickupZip = pickupZip;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("PickupTargetFrom")
  public Date getPickupTargetFrom() {
    return pickupTargetFrom;
  }
  public void setPickupTargetFrom(Date pickupTargetFrom) {
    this.pickupTargetFrom = pickupTargetFrom;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("PickupTargetTo")
  public Date getPickupTargetTo() {
    return pickupTargetTo;
  }
  public void setPickupTargetTo(Date pickupTargetTo) {
    this.pickupTargetTo = pickupTargetTo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("DeliveryCompany")
  public String getDeliveryCompany() {
    return deliveryCompany;
  }
  public void setDeliveryCompany(String deliveryCompany) {
    this.deliveryCompany = deliveryCompany;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("DeliveryContact")
  public String getDeliveryContact() {
    return deliveryContact;
  }
  public void setDeliveryContact(String deliveryContact) {
    this.deliveryContact = deliveryContact;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("DeliveryPhone")
  public String getDeliveryPhone() {
    return deliveryPhone;
  }
  public void setDeliveryPhone(String deliveryPhone) {
    this.deliveryPhone = deliveryPhone;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("DeliveryStreet")
  public String getDeliveryStreet() {
    return deliveryStreet;
  }
  public void setDeliveryStreet(String deliveryStreet) {
    this.deliveryStreet = deliveryStreet;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("DeliveryStreet2")
  public String getDeliveryStreet2() {
    return deliveryStreet2;
  }
  public void setDeliveryStreet2(String deliveryStreet2) {
    this.deliveryStreet2 = deliveryStreet2;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("DeliveryCity")
  public String getDeliveryCity() {
    return deliveryCity;
  }
  public void setDeliveryCity(String deliveryCity) {
    this.deliveryCity = deliveryCity;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("DeliveryState")
  public String getDeliveryState() {
    return deliveryState;
  }
  public void setDeliveryState(String deliveryState) {
    this.deliveryState = deliveryState;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("DeliveryZip")
  public String getDeliveryZip() {
    return deliveryZip;
  }
  public void setDeliveryZip(String deliveryZip) {
    this.deliveryZip = deliveryZip;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("DeliveryTargetFrom")
  public Date getDeliveryTargetFrom() {
    return deliveryTargetFrom;
  }
  public void setDeliveryTargetFrom(Date deliveryTargetFrom) {
    this.deliveryTargetFrom = deliveryTargetFrom;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("DeliveryTargetTo")
  public Date getDeliveryTargetTo() {
    return deliveryTargetTo;
  }
  public void setDeliveryTargetTo(Date deliveryTargetTo) {
    this.deliveryTargetTo = deliveryTargetTo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("OrderPackages")
  @Valid
  public List<@Valid OrderPackage> getOrderPackages() {
    return orderPackages;
  }
  public void setOrderPackages(List<@Valid OrderPackage> orderPackages) {
    this.orderPackages = orderPackages;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("RouteID")
  public Integer getRouteID() {
    return routeID;
  }
  public void setRouteID(Integer routeID) {
    this.routeID = routeID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("DriverID")
  public Integer getDriverID() {
    return driverID;
  }
  public void setDriverID(Integer driverID) {
    this.driverID = driverID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("PickupSequenceNo")
  public Integer getPickupSequenceNo() {
    return pickupSequenceNo;
  }
  public void setPickupSequenceNo(Integer pickupSequenceNo) {
    this.pickupSequenceNo = pickupSequenceNo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("DeliverySequenceNo")
  public Integer getDeliverySequenceNo() {
    return deliverySequenceNo;
  }
  public void setDeliverySequenceNo(Integer deliverySequenceNo) {
    this.deliverySequenceNo = deliverySequenceNo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("PickupETA")
  public String getPickupETA() {
    return pickupETA;
  }
  public void setPickupETA(String pickupETA) {
    this.pickupETA = pickupETA;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("DeliveryETA")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

