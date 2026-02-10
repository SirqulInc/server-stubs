package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrderItemRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderItemRequest   {
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

  @JsonProperty("orderItemType")
  
  private OrderItemTypeEnum orderItemType;

  @JsonProperty("orderItemId")
  
  private Long orderItemId;

  @JsonProperty("offerName")
  
  private String offerName;

  @JsonProperty("orderCustomType")
  
  private String orderCustomType;

  @JsonProperty("orderCustomId")
  
  private String orderCustomId;

  @JsonProperty("retailerLocationId")
  
  private Long retailerLocationId;

  @JsonProperty("quantity")
  
  private Integer quantity;

  @JsonProperty("amount")
  
  private Double amount;

  @JsonProperty("tax")
  
  private Double tax;

  @JsonProperty("reserveStartDate")
  
  private Long reserveStartDate;

  @JsonProperty("reserveEndDate")
  
  private Long reserveEndDate;

  @JsonProperty("message")
  
  private String message;

  public OrderItemRequest orderItemType(OrderItemTypeEnum orderItemType) {
    this.orderItemType = orderItemType;
    return this;
  }

   /**
   * Get orderItemType
   * @return orderItemType
  **/
  public OrderItemTypeEnum getOrderItemType() {
    return orderItemType;
  }

  public void setOrderItemType(OrderItemTypeEnum orderItemType) {
    this.orderItemType = orderItemType;
  }

  public OrderItemRequest orderItemId(Long orderItemId) {
    this.orderItemId = orderItemId;
    return this;
  }

   /**
   * Get orderItemId
   * @return orderItemId
  **/
  public Long getOrderItemId() {
    return orderItemId;
  }

  public void setOrderItemId(Long orderItemId) {
    this.orderItemId = orderItemId;
  }

  public OrderItemRequest offerName(String offerName) {
    this.offerName = offerName;
    return this;
  }

   /**
   * Get offerName
   * @return offerName
  **/
  public String getOfferName() {
    return offerName;
  }

  public void setOfferName(String offerName) {
    this.offerName = offerName;
  }

  public OrderItemRequest orderCustomType(String orderCustomType) {
    this.orderCustomType = orderCustomType;
    return this;
  }

   /**
   * Get orderCustomType
   * @return orderCustomType
  **/
  public String getOrderCustomType() {
    return orderCustomType;
  }

  public void setOrderCustomType(String orderCustomType) {
    this.orderCustomType = orderCustomType;
  }

  public OrderItemRequest orderCustomId(String orderCustomId) {
    this.orderCustomId = orderCustomId;
    return this;
  }

   /**
   * Get orderCustomId
   * @return orderCustomId
  **/
  public String getOrderCustomId() {
    return orderCustomId;
  }

  public void setOrderCustomId(String orderCustomId) {
    this.orderCustomId = orderCustomId;
  }

  public OrderItemRequest retailerLocationId(Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
    return this;
  }

   /**
   * Get retailerLocationId
   * @return retailerLocationId
  **/
  public Long getRetailerLocationId() {
    return retailerLocationId;
  }

  public void setRetailerLocationId(Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
  }

  public OrderItemRequest quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public OrderItemRequest amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public OrderItemRequest tax(Double tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  public Double getTax() {
    return tax;
  }

  public void setTax(Double tax) {
    this.tax = tax;
  }

  public OrderItemRequest reserveStartDate(Long reserveStartDate) {
    this.reserveStartDate = reserveStartDate;
    return this;
  }

   /**
   * Get reserveStartDate
   * @return reserveStartDate
  **/
  public Long getReserveStartDate() {
    return reserveStartDate;
  }

  public void setReserveStartDate(Long reserveStartDate) {
    this.reserveStartDate = reserveStartDate;
  }

  public OrderItemRequest reserveEndDate(Long reserveEndDate) {
    this.reserveEndDate = reserveEndDate;
    return this;
  }

   /**
   * Get reserveEndDate
   * @return reserveEndDate
  **/
  public Long getReserveEndDate() {
    return reserveEndDate;
  }

  public void setReserveEndDate(Long reserveEndDate) {
    this.reserveEndDate = reserveEndDate;
  }

  public OrderItemRequest message(String message) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemRequest orderItemRequest = (OrderItemRequest) o;
    return Objects.equals(orderItemType, orderItemRequest.orderItemType) &&
        Objects.equals(orderItemId, orderItemRequest.orderItemId) &&
        Objects.equals(offerName, orderItemRequest.offerName) &&
        Objects.equals(orderCustomType, orderItemRequest.orderCustomType) &&
        Objects.equals(orderCustomId, orderItemRequest.orderCustomId) &&
        Objects.equals(retailerLocationId, orderItemRequest.retailerLocationId) &&
        Objects.equals(quantity, orderItemRequest.quantity) &&
        Objects.equals(amount, orderItemRequest.amount) &&
        Objects.equals(tax, orderItemRequest.tax) &&
        Objects.equals(reserveStartDate, orderItemRequest.reserveStartDate) &&
        Objects.equals(reserveEndDate, orderItemRequest.reserveEndDate) &&
        Objects.equals(message, orderItemRequest.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderItemType, orderItemId, offerName, orderCustomType, orderCustomId, retailerLocationId, quantity, amount, tax, reserveStartDate, reserveEndDate, message);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

