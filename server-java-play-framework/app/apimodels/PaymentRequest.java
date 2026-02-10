package apimodels;

import apimodels.BiometricRequest;
import apimodels.Invoice;
import apimodels.OrderItemRequest;
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
 * PaymentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PaymentRequest   {
  @JsonProperty("appKey")
  
  private String appKey;

  @JsonProperty("clientPaymentId")
  
  private String clientPaymentId;

  @JsonProperty("minAgeYears")
  
  private Integer minAgeYears;

  @JsonProperty("invoice")
  @Valid

  private Invoice invoice;

  @JsonProperty("biometrics")
  @Valid

  private BiometricRequest biometrics;

  @JsonProperty("orderItems")
  @Valid

  private List<@Valid OrderItemRequest> orderItems = null;

  @JsonProperty("acceptedBilling")
  
  private Boolean acceptedBilling;

  public PaymentRequest appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

   /**
   * Get appKey
   * @return appKey
  **/
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public PaymentRequest clientPaymentId(String clientPaymentId) {
    this.clientPaymentId = clientPaymentId;
    return this;
  }

   /**
   * Get clientPaymentId
   * @return clientPaymentId
  **/
  public String getClientPaymentId() {
    return clientPaymentId;
  }

  public void setClientPaymentId(String clientPaymentId) {
    this.clientPaymentId = clientPaymentId;
  }

  public PaymentRequest minAgeYears(Integer minAgeYears) {
    this.minAgeYears = minAgeYears;
    return this;
  }

   /**
   * Get minAgeYears
   * @return minAgeYears
  **/
  public Integer getMinAgeYears() {
    return minAgeYears;
  }

  public void setMinAgeYears(Integer minAgeYears) {
    this.minAgeYears = minAgeYears;
  }

  public PaymentRequest invoice(Invoice invoice) {
    this.invoice = invoice;
    return this;
  }

   /**
   * Get invoice
   * @return invoice
  **/
  public Invoice getInvoice() {
    return invoice;
  }

  public void setInvoice(Invoice invoice) {
    this.invoice = invoice;
  }

  public PaymentRequest biometrics(BiometricRequest biometrics) {
    this.biometrics = biometrics;
    return this;
  }

   /**
   * Get biometrics
   * @return biometrics
  **/
  public BiometricRequest getBiometrics() {
    return biometrics;
  }

  public void setBiometrics(BiometricRequest biometrics) {
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
  **/
  public List<@Valid OrderItemRequest> getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(List<@Valid OrderItemRequest> orderItems) {
    this.orderItems = orderItems;
  }

  public PaymentRequest acceptedBilling(Boolean acceptedBilling) {
    this.acceptedBilling = acceptedBilling;
    return this;
  }

   /**
   * Get acceptedBilling
   * @return acceptedBilling
  **/
  public Boolean getAcceptedBilling() {
    return acceptedBilling;
  }

  public void setAcceptedBilling(Boolean acceptedBilling) {
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
    return Objects.equals(appKey, paymentRequest.appKey) &&
        Objects.equals(clientPaymentId, paymentRequest.clientPaymentId) &&
        Objects.equals(minAgeYears, paymentRequest.minAgeYears) &&
        Objects.equals(invoice, paymentRequest.invoice) &&
        Objects.equals(biometrics, paymentRequest.biometrics) &&
        Objects.equals(orderItems, paymentRequest.orderItems) &&
        Objects.equals(acceptedBilling, paymentRequest.acceptedBilling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appKey, clientPaymentId, minAgeYears, invoice, biometrics, orderItems, acceptedBilling);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

