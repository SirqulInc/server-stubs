package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BiometricRequest;
import org.openapitools.model.Invoice;
import org.openapitools.model.OrderItemRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PaymentRequest   {
  
  private String appKey;
  private String clientPaymentId;
  private Integer minAgeYears;
  private Invoice invoice;
  private BiometricRequest biometrics;
  private List<@Valid OrderItemRequest> orderItems = new ArrayList<>();
  private Boolean acceptedBilling;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appKey")
  public String getAppKey() {
    return appKey;
  }
  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("clientPaymentId")
  public String getClientPaymentId() {
    return clientPaymentId;
  }
  public void setClientPaymentId(String clientPaymentId) {
    this.clientPaymentId = clientPaymentId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("minAgeYears")
  public Integer getMinAgeYears() {
    return minAgeYears;
  }
  public void setMinAgeYears(Integer minAgeYears) {
    this.minAgeYears = minAgeYears;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("invoice")
  @Valid
  public Invoice getInvoice() {
    return invoice;
  }
  public void setInvoice(Invoice invoice) {
    this.invoice = invoice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("biometrics")
  @Valid
  public BiometricRequest getBiometrics() {
    return biometrics;
  }
  public void setBiometrics(BiometricRequest biometrics) {
    this.biometrics = biometrics;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderItems")
  @Valid
  public List<@Valid OrderItemRequest> getOrderItems() {
    return orderItems;
  }
  public void setOrderItems(List<@Valid OrderItemRequest> orderItems) {
    this.orderItems = orderItems;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("acceptedBilling")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

