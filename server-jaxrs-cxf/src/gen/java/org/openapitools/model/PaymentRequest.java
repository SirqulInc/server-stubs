package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BiometricRequest;
import org.openapitools.model.Invoice;
import org.openapitools.model.OrderItemRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PaymentRequest  {
  
  @ApiModelProperty(value = "")

  private String appKey;

  @ApiModelProperty(value = "")

  private String clientPaymentId;

  @ApiModelProperty(value = "")

  private Integer minAgeYears;

  @ApiModelProperty(value = "")

  @Valid

  private Invoice invoice;

  @ApiModelProperty(value = "")

  @Valid

  private BiometricRequest biometrics;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid OrderItemRequest> orderItems = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Boolean acceptedBilling;
 /**
   * Get appKey
   * @return appKey
  **/
  @JsonProperty("appKey")
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public PaymentRequest appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

 /**
   * Get clientPaymentId
   * @return clientPaymentId
  **/
  @JsonProperty("clientPaymentId")
  public String getClientPaymentId() {
    return clientPaymentId;
  }

  public void setClientPaymentId(String clientPaymentId) {
    this.clientPaymentId = clientPaymentId;
  }

  public PaymentRequest clientPaymentId(String clientPaymentId) {
    this.clientPaymentId = clientPaymentId;
    return this;
  }

 /**
   * Get minAgeYears
   * @return minAgeYears
  **/
  @JsonProperty("minAgeYears")
  public Integer getMinAgeYears() {
    return minAgeYears;
  }

  public void setMinAgeYears(Integer minAgeYears) {
    this.minAgeYears = minAgeYears;
  }

  public PaymentRequest minAgeYears(Integer minAgeYears) {
    this.minAgeYears = minAgeYears;
    return this;
  }

 /**
   * Get invoice
   * @return invoice
  **/
  @JsonProperty("invoice")
  public Invoice getInvoice() {
    return invoice;
  }

  public void setInvoice(Invoice invoice) {
    this.invoice = invoice;
  }

  public PaymentRequest invoice(Invoice invoice) {
    this.invoice = invoice;
    return this;
  }

 /**
   * Get biometrics
   * @return biometrics
  **/
  @JsonProperty("biometrics")
  public BiometricRequest getBiometrics() {
    return biometrics;
  }

  public void setBiometrics(BiometricRequest biometrics) {
    this.biometrics = biometrics;
  }

  public PaymentRequest biometrics(BiometricRequest biometrics) {
    this.biometrics = biometrics;
    return this;
  }

 /**
   * Get orderItems
   * @return orderItems
  **/
  @JsonProperty("orderItems")
  public List<@Valid OrderItemRequest> getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(List<@Valid OrderItemRequest> orderItems) {
    this.orderItems = orderItems;
  }

  public PaymentRequest orderItems(List<@Valid OrderItemRequest> orderItems) {
    this.orderItems = orderItems;
    return this;
  }

  public PaymentRequest addOrderItemsItem(OrderItemRequest orderItemsItem) {
    this.orderItems.add(orderItemsItem);
    return this;
  }

 /**
   * Get acceptedBilling
   * @return acceptedBilling
  **/
  @JsonProperty("acceptedBilling")
  public Boolean getAcceptedBilling() {
    return acceptedBilling;
  }

  public void setAcceptedBilling(Boolean acceptedBilling) {
    this.acceptedBilling = acceptedBilling;
  }

  public PaymentRequest acceptedBilling(Boolean acceptedBilling) {
    this.acceptedBilling = acceptedBilling;
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
    PaymentRequest paymentRequest = (PaymentRequest) o;
    return Objects.equals(this.appKey, paymentRequest.appKey) &&
        Objects.equals(this.clientPaymentId, paymentRequest.clientPaymentId) &&
        Objects.equals(this.minAgeYears, paymentRequest.minAgeYears) &&
        Objects.equals(this.invoice, paymentRequest.invoice) &&
        Objects.equals(this.biometrics, paymentRequest.biometrics) &&
        Objects.equals(this.orderItems, paymentRequest.orderItems) &&
        Objects.equals(this.acceptedBilling, paymentRequest.acceptedBilling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appKey, clientPaymentId, minAgeYears, invoice, biometrics, orderItems, acceptedBilling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRequest {\n");
    
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    clientPaymentId: ").append(toIndentedString(clientPaymentId)).append("\n");
    sb.append("    minAgeYears: ").append(toIndentedString(minAgeYears)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    biometrics: ").append(toIndentedString(biometrics)).append("\n");
    sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
    sb.append("    acceptedBilling: ").append(toIndentedString(acceptedBilling)).append("\n");
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

