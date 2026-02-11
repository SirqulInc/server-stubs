package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BiometricRequest;
import org.openapitools.model.Invoice;
import org.openapitools.model.OrderItemRequest;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PaymentRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PaymentRequest {

  private @Nullable String appKey;

  private @Nullable String clientPaymentId;

  private @Nullable Integer minAgeYears;

  private @Nullable Invoice invoice;

  private @Nullable BiometricRequest biometrics;

  @Valid
  private List<@Valid OrderItemRequest> orderItems = new ArrayList<>();

  private @Nullable Boolean acceptedBilling;

  public PaymentRequest appKey(@Nullable String appKey) {
    this.appKey = appKey;
    return this;
  }

  /**
   * Get appKey
   * @return appKey
   */
  
  @Schema(name = "appKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appKey")
  public @Nullable String getAppKey() {
    return appKey;
  }

  public void setAppKey(@Nullable String appKey) {
    this.appKey = appKey;
  }

  public PaymentRequest clientPaymentId(@Nullable String clientPaymentId) {
    this.clientPaymentId = clientPaymentId;
    return this;
  }

  /**
   * Get clientPaymentId
   * @return clientPaymentId
   */
  
  @Schema(name = "clientPaymentId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientPaymentId")
  public @Nullable String getClientPaymentId() {
    return clientPaymentId;
  }

  public void setClientPaymentId(@Nullable String clientPaymentId) {
    this.clientPaymentId = clientPaymentId;
  }

  public PaymentRequest minAgeYears(@Nullable Integer minAgeYears) {
    this.minAgeYears = minAgeYears;
    return this;
  }

  /**
   * Get minAgeYears
   * @return minAgeYears
   */
  
  @Schema(name = "minAgeYears", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minAgeYears")
  public @Nullable Integer getMinAgeYears() {
    return minAgeYears;
  }

  public void setMinAgeYears(@Nullable Integer minAgeYears) {
    this.minAgeYears = minAgeYears;
  }

  public PaymentRequest invoice(@Nullable Invoice invoice) {
    this.invoice = invoice;
    return this;
  }

  /**
   * Get invoice
   * @return invoice
   */
  @Valid 
  @Schema(name = "invoice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invoice")
  public @Nullable Invoice getInvoice() {
    return invoice;
  }

  public void setInvoice(@Nullable Invoice invoice) {
    this.invoice = invoice;
  }

  public PaymentRequest biometrics(@Nullable BiometricRequest biometrics) {
    this.biometrics = biometrics;
    return this;
  }

  /**
   * Get biometrics
   * @return biometrics
   */
  @Valid 
  @Schema(name = "biometrics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("biometrics")
  public @Nullable BiometricRequest getBiometrics() {
    return biometrics;
  }

  public void setBiometrics(@Nullable BiometricRequest biometrics) {
    this.biometrics = biometrics;
  }

  public PaymentRequest orderItems(List<@Valid OrderItemRequest> orderItems) {
    this.orderItems = orderItems;
    return this;
  }

  public PaymentRequest addOrderItemsItem(OrderItemRequest orderItemsItem) {
    if (this.orderItems == null) {
      this.orderItems = new ArrayList<>();
    }
    this.orderItems.add(orderItemsItem);
    return this;
  }

  /**
   * Get orderItems
   * @return orderItems
   */
  @Valid 
  @Schema(name = "orderItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderItems")
  public List<@Valid OrderItemRequest> getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(List<@Valid OrderItemRequest> orderItems) {
    this.orderItems = orderItems;
  }

  public PaymentRequest acceptedBilling(@Nullable Boolean acceptedBilling) {
    this.acceptedBilling = acceptedBilling;
    return this;
  }

  /**
   * Get acceptedBilling
   * @return acceptedBilling
   */
  
  @Schema(name = "acceptedBilling", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acceptedBilling")
  public @Nullable Boolean getAcceptedBilling() {
    return acceptedBilling;
  }

  public void setAcceptedBilling(@Nullable Boolean acceptedBilling) {
    this.acceptedBilling = acceptedBilling;
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

