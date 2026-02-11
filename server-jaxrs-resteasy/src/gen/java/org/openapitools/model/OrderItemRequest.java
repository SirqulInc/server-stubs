package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrderItemRequest   {
  

  /**
   * Gets or Sets orderItemType
   */
  public enum OrderItemTypeEnum {
    OFFER("OFFER"),

        CUSTOM("CUSTOM");
    private String value;

    OrderItemTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private OrderItemTypeEnum orderItemType;
  private Long orderItemId;
  private String offerName;
  private String orderCustomType;
  private String orderCustomId;
  private Long retailerLocationId;
  private Integer quantity;
  private Double amount;
  private Double tax;
  private Long reserveStartDate;
  private Long reserveEndDate;
  private String message;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderItemType")
  public OrderItemTypeEnum getOrderItemType() {
    return orderItemType;
  }
  public void setOrderItemType(OrderItemTypeEnum orderItemType) {
    this.orderItemType = orderItemType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderItemId")
  public Long getOrderItemId() {
    return orderItemId;
  }
  public void setOrderItemId(Long orderItemId) {
    this.orderItemId = orderItemId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offerName")
  public String getOfferName() {
    return offerName;
  }
  public void setOfferName(String offerName) {
    this.offerName = offerName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderCustomType")
  public String getOrderCustomType() {
    return orderCustomType;
  }
  public void setOrderCustomType(String orderCustomType) {
    this.orderCustomType = orderCustomType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderCustomId")
  public String getOrderCustomId() {
    return orderCustomId;
  }
  public void setOrderCustomId(String orderCustomId) {
    this.orderCustomId = orderCustomId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("retailerLocationId")
  public Long getRetailerLocationId() {
    return retailerLocationId;
  }
  public void setRetailerLocationId(Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("amount")
  public Double getAmount() {
    return amount;
  }
  public void setAmount(Double amount) {
    this.amount = amount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tax")
  public Double getTax() {
    return tax;
  }
  public void setTax(Double tax) {
    this.tax = tax;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("reserveStartDate")
  public Long getReserveStartDate() {
    return reserveStartDate;
  }
  public void setReserveStartDate(Long reserveStartDate) {
    this.reserveStartDate = reserveStartDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("reserveEndDate")
  public Long getReserveEndDate() {
    return reserveEndDate;
  }
  public void setReserveEndDate(Long reserveEndDate) {
    this.reserveEndDate = reserveEndDate;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemRequest orderItemRequest = (OrderItemRequest) o;
    return Objects.equals(this.orderItemType, orderItemRequest.orderItemType) &&
        Objects.equals(this.orderItemId, orderItemRequest.orderItemId) &&
        Objects.equals(this.offerName, orderItemRequest.offerName) &&
        Objects.equals(this.orderCustomType, orderItemRequest.orderCustomType) &&
        Objects.equals(this.orderCustomId, orderItemRequest.orderCustomId) &&
        Objects.equals(this.retailerLocationId, orderItemRequest.retailerLocationId) &&
        Objects.equals(this.quantity, orderItemRequest.quantity) &&
        Objects.equals(this.amount, orderItemRequest.amount) &&
        Objects.equals(this.tax, orderItemRequest.tax) &&
        Objects.equals(this.reserveStartDate, orderItemRequest.reserveStartDate) &&
        Objects.equals(this.reserveEndDate, orderItemRequest.reserveEndDate) &&
        Objects.equals(this.message, orderItemRequest.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderItemType, orderItemId, offerName, orderCustomType, orderCustomId, retailerLocationId, quantity, amount, tax, reserveStartDate, reserveEndDate, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemRequest {\n");
    
    sb.append("    orderItemType: ").append(toIndentedString(orderItemType)).append("\n");
    sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
    sb.append("    offerName: ").append(toIndentedString(offerName)).append("\n");
    sb.append("    orderCustomType: ").append(toIndentedString(orderCustomType)).append("\n");
    sb.append("    orderCustomId: ").append(toIndentedString(orderCustomId)).append("\n");
    sb.append("    retailerLocationId: ").append(toIndentedString(retailerLocationId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    reserveStartDate: ").append(toIndentedString(reserveStartDate)).append("\n");
    sb.append("    reserveEndDate: ").append(toIndentedString(reserveEndDate)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

