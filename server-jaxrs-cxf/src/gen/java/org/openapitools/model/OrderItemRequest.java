package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrderItemRequest  {
  
public enum OrderItemTypeEnum {

OFFER(String.valueOf("OFFER")), CUSTOM(String.valueOf("CUSTOM"));


    private String value;

    OrderItemTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static OrderItemTypeEnum fromValue(String value) {
        for (OrderItemTypeEnum b : OrderItemTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private OrderItemTypeEnum orderItemType;

  @ApiModelProperty(value = "")

  private Long orderItemId;

  @ApiModelProperty(value = "")

  private String offerName;

  @ApiModelProperty(value = "")

  private String orderCustomType;

  @ApiModelProperty(value = "")

  private String orderCustomId;

  @ApiModelProperty(value = "")

  private Long retailerLocationId;

  @ApiModelProperty(value = "")

  private Integer quantity;

  @ApiModelProperty(value = "")

  private Double amount;

  @ApiModelProperty(value = "")

  private Double tax;

  @ApiModelProperty(value = "")

  private Long reserveStartDate;

  @ApiModelProperty(value = "")

  private Long reserveEndDate;

  @ApiModelProperty(value = "")

  private String message;
 /**
   * Get orderItemType
   * @return orderItemType
  **/
  @JsonProperty("orderItemType")
  public String getOrderItemType() {
    if (orderItemType == null) {
      return null;
    }
    return orderItemType.value();
  }

  public void setOrderItemType(OrderItemTypeEnum orderItemType) {
    this.orderItemType = orderItemType;
  }

  public OrderItemRequest orderItemType(OrderItemTypeEnum orderItemType) {
    this.orderItemType = orderItemType;
    return this;
  }

 /**
   * Get orderItemId
   * @return orderItemId
  **/
  @JsonProperty("orderItemId")
  public Long getOrderItemId() {
    return orderItemId;
  }

  public void setOrderItemId(Long orderItemId) {
    this.orderItemId = orderItemId;
  }

  public OrderItemRequest orderItemId(Long orderItemId) {
    this.orderItemId = orderItemId;
    return this;
  }

 /**
   * Get offerName
   * @return offerName
  **/
  @JsonProperty("offerName")
  public String getOfferName() {
    return offerName;
  }

  public void setOfferName(String offerName) {
    this.offerName = offerName;
  }

  public OrderItemRequest offerName(String offerName) {
    this.offerName = offerName;
    return this;
  }

 /**
   * Get orderCustomType
   * @return orderCustomType
  **/
  @JsonProperty("orderCustomType")
  public String getOrderCustomType() {
    return orderCustomType;
  }

  public void setOrderCustomType(String orderCustomType) {
    this.orderCustomType = orderCustomType;
  }

  public OrderItemRequest orderCustomType(String orderCustomType) {
    this.orderCustomType = orderCustomType;
    return this;
  }

 /**
   * Get orderCustomId
   * @return orderCustomId
  **/
  @JsonProperty("orderCustomId")
  public String getOrderCustomId() {
    return orderCustomId;
  }

  public void setOrderCustomId(String orderCustomId) {
    this.orderCustomId = orderCustomId;
  }

  public OrderItemRequest orderCustomId(String orderCustomId) {
    this.orderCustomId = orderCustomId;
    return this;
  }

 /**
   * Get retailerLocationId
   * @return retailerLocationId
  **/
  @JsonProperty("retailerLocationId")
  public Long getRetailerLocationId() {
    return retailerLocationId;
  }

  public void setRetailerLocationId(Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
  }

  public OrderItemRequest retailerLocationId(Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
    return this;
  }

 /**
   * Get quantity
   * @return quantity
  **/
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public OrderItemRequest quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

 /**
   * Get amount
   * @return amount
  **/
  @JsonProperty("amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public OrderItemRequest amount(Double amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Get tax
   * @return tax
  **/
  @JsonProperty("tax")
  public Double getTax() {
    return tax;
  }

  public void setTax(Double tax) {
    this.tax = tax;
  }

  public OrderItemRequest tax(Double tax) {
    this.tax = tax;
    return this;
  }

 /**
   * Get reserveStartDate
   * @return reserveStartDate
  **/
  @JsonProperty("reserveStartDate")
  public Long getReserveStartDate() {
    return reserveStartDate;
  }

  public void setReserveStartDate(Long reserveStartDate) {
    this.reserveStartDate = reserveStartDate;
  }

  public OrderItemRequest reserveStartDate(Long reserveStartDate) {
    this.reserveStartDate = reserveStartDate;
    return this;
  }

 /**
   * Get reserveEndDate
   * @return reserveEndDate
  **/
  @JsonProperty("reserveEndDate")
  public Long getReserveEndDate() {
    return reserveEndDate;
  }

  public void setReserveEndDate(Long reserveEndDate) {
    this.reserveEndDate = reserveEndDate;
  }

  public OrderItemRequest reserveEndDate(Long reserveEndDate) {
    this.reserveEndDate = reserveEndDate;
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

  public OrderItemRequest message(String message) {
    this.message = message;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

