package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OrderItemRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrderItemRequest {

  /**
   * Gets or Sets orderItemType
   */
  public enum OrderItemTypeEnum {
    OFFER("OFFER"),
    
    CUSTOM("CUSTOM");

    private final String value;

    OrderItemTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable OrderItemTypeEnum orderItemType;

  private @Nullable Long orderItemId;

  private @Nullable String offerName;

  private @Nullable String orderCustomType;

  private @Nullable String orderCustomId;

  private @Nullable Long retailerLocationId;

  private @Nullable Integer quantity;

  private @Nullable Double amount;

  private @Nullable Double tax;

  private @Nullable Long reserveStartDate;

  private @Nullable Long reserveEndDate;

  private @Nullable String message;

  public OrderItemRequest orderItemType(@Nullable OrderItemTypeEnum orderItemType) {
    this.orderItemType = orderItemType;
    return this;
  }

  /**
   * Get orderItemType
   * @return orderItemType
   */
  
  @Schema(name = "orderItemType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderItemType")
  public @Nullable OrderItemTypeEnum getOrderItemType() {
    return orderItemType;
  }

  public void setOrderItemType(@Nullable OrderItemTypeEnum orderItemType) {
    this.orderItemType = orderItemType;
  }

  public OrderItemRequest orderItemId(@Nullable Long orderItemId) {
    this.orderItemId = orderItemId;
    return this;
  }

  /**
   * Get orderItemId
   * @return orderItemId
   */
  
  @Schema(name = "orderItemId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderItemId")
  public @Nullable Long getOrderItemId() {
    return orderItemId;
  }

  public void setOrderItemId(@Nullable Long orderItemId) {
    this.orderItemId = orderItemId;
  }

  public OrderItemRequest offerName(@Nullable String offerName) {
    this.offerName = offerName;
    return this;
  }

  /**
   * Get offerName
   * @return offerName
   */
  
  @Schema(name = "offerName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerName")
  public @Nullable String getOfferName() {
    return offerName;
  }

  public void setOfferName(@Nullable String offerName) {
    this.offerName = offerName;
  }

  public OrderItemRequest orderCustomType(@Nullable String orderCustomType) {
    this.orderCustomType = orderCustomType;
    return this;
  }

  /**
   * Get orderCustomType
   * @return orderCustomType
   */
  
  @Schema(name = "orderCustomType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderCustomType")
  public @Nullable String getOrderCustomType() {
    return orderCustomType;
  }

  public void setOrderCustomType(@Nullable String orderCustomType) {
    this.orderCustomType = orderCustomType;
  }

  public OrderItemRequest orderCustomId(@Nullable String orderCustomId) {
    this.orderCustomId = orderCustomId;
    return this;
  }

  /**
   * Get orderCustomId
   * @return orderCustomId
   */
  
  @Schema(name = "orderCustomId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderCustomId")
  public @Nullable String getOrderCustomId() {
    return orderCustomId;
  }

  public void setOrderCustomId(@Nullable String orderCustomId) {
    this.orderCustomId = orderCustomId;
  }

  public OrderItemRequest retailerLocationId(@Nullable Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
    return this;
  }

  /**
   * Get retailerLocationId
   * @return retailerLocationId
   */
  
  @Schema(name = "retailerLocationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retailerLocationId")
  public @Nullable Long getRetailerLocationId() {
    return retailerLocationId;
  }

  public void setRetailerLocationId(@Nullable Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
  }

  public OrderItemRequest quantity(@Nullable Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
   */
  
  @Schema(name = "quantity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quantity")
  public @Nullable Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(@Nullable Integer quantity) {
    this.quantity = quantity;
  }

  public OrderItemRequest amount(@Nullable Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  
  @Schema(name = "amount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount")
  public @Nullable Double getAmount() {
    return amount;
  }

  public void setAmount(@Nullable Double amount) {
    this.amount = amount;
  }

  public OrderItemRequest tax(@Nullable Double tax) {
    this.tax = tax;
    return this;
  }

  /**
   * Get tax
   * @return tax
   */
  
  @Schema(name = "tax", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tax")
  public @Nullable Double getTax() {
    return tax;
  }

  public void setTax(@Nullable Double tax) {
    this.tax = tax;
  }

  public OrderItemRequest reserveStartDate(@Nullable Long reserveStartDate) {
    this.reserveStartDate = reserveStartDate;
    return this;
  }

  /**
   * Get reserveStartDate
   * @return reserveStartDate
   */
  
  @Schema(name = "reserveStartDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reserveStartDate")
  public @Nullable Long getReserveStartDate() {
    return reserveStartDate;
  }

  public void setReserveStartDate(@Nullable Long reserveStartDate) {
    this.reserveStartDate = reserveStartDate;
  }

  public OrderItemRequest reserveEndDate(@Nullable Long reserveEndDate) {
    this.reserveEndDate = reserveEndDate;
    return this;
  }

  /**
   * Get reserveEndDate
   * @return reserveEndDate
   */
  
  @Schema(name = "reserveEndDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reserveEndDate")
  public @Nullable Long getReserveEndDate() {
    return reserveEndDate;
  }

  public void setReserveEndDate(@Nullable Long reserveEndDate) {
    this.reserveEndDate = reserveEndDate;
  }

  public OrderItemRequest message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  public void setMessage(@Nullable String message) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

