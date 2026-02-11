package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.OfferTransactionResponse;
import org.openapitools.model.PurchaseOrderItemResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PaymentTransactionResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PaymentTransactionResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  private @Nullable Long paymentTransactionId;

  private @Nullable AccountShortResponse customer;

  private @Nullable String promoCode;

  private @Nullable String remoteRefId;

  private @Nullable String currencyType;

  private @Nullable Double amount;

  private @Nullable Double tax;

  @Valid
  private List<@Valid OfferTransactionResponse> offerTransactions = new ArrayList<>();

  @Valid
  private List<@Valid PurchaseOrderItemResponse> orderItems = new ArrayList<>();

  private @Nullable String externalPaymentId;

  private @Nullable String metadata;

  private @Nullable Long created;

  private @Nullable Long updated;

  private @Nullable String returning;

  public PaymentTransactionResponse valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public PaymentTransactionResponse message(@Nullable String message) {
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

  public PaymentTransactionResponse version(@Nullable Double version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public @Nullable Double getVersion() {
    return version;
  }

  public void setVersion(@Nullable Double version) {
    this.version = version;
  }

  public PaymentTransactionResponse serializeNulls(@Nullable Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

  /**
   * Get serializeNulls
   * @return serializeNulls
   */
  
  @Schema(name = "serializeNulls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serializeNulls")
  public @Nullable Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(@Nullable Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public PaymentTransactionResponse startTimeLog(@Nullable Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

  /**
   * Get startTimeLog
   * @return startTimeLog
   */
  
  @Schema(name = "startTimeLog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTimeLog")
  public @Nullable Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(@Nullable Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public PaymentTransactionResponse errorCode(@Nullable String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
   */
  
  @Schema(name = "errorCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCode")
  public @Nullable String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(@Nullable String errorCode) {
    this.errorCode = errorCode;
  }

  public PaymentTransactionResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public PaymentTransactionResponse addRequestItem(NameStringValueResponse requestItem) {
    if (this.request == null) {
      this.request = new ArrayList<>();
    }
    this.request.add(requestItem);
    return this;
  }

  /**
   * Get request
   * @return request
   */
  @Valid 
  @Schema(name = "request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("request")
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public PaymentTransactionResponse paymentTransactionId(@Nullable Long paymentTransactionId) {
    this.paymentTransactionId = paymentTransactionId;
    return this;
  }

  /**
   * Get paymentTransactionId
   * @return paymentTransactionId
   */
  
  @Schema(name = "paymentTransactionId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentTransactionId")
  public @Nullable Long getPaymentTransactionId() {
    return paymentTransactionId;
  }

  public void setPaymentTransactionId(@Nullable Long paymentTransactionId) {
    this.paymentTransactionId = paymentTransactionId;
  }

  public PaymentTransactionResponse customer(@Nullable AccountShortResponse customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
   */
  @Valid 
  @Schema(name = "customer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customer")
  public @Nullable AccountShortResponse getCustomer() {
    return customer;
  }

  public void setCustomer(@Nullable AccountShortResponse customer) {
    this.customer = customer;
  }

  public PaymentTransactionResponse promoCode(@Nullable String promoCode) {
    this.promoCode = promoCode;
    return this;
  }

  /**
   * Get promoCode
   * @return promoCode
   */
  
  @Schema(name = "promoCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promoCode")
  public @Nullable String getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(@Nullable String promoCode) {
    this.promoCode = promoCode;
  }

  public PaymentTransactionResponse remoteRefId(@Nullable String remoteRefId) {
    this.remoteRefId = remoteRefId;
    return this;
  }

  /**
   * Get remoteRefId
   * @return remoteRefId
   */
  
  @Schema(name = "remoteRefId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remoteRefId")
  public @Nullable String getRemoteRefId() {
    return remoteRefId;
  }

  public void setRemoteRefId(@Nullable String remoteRefId) {
    this.remoteRefId = remoteRefId;
  }

  public PaymentTransactionResponse currencyType(@Nullable String currencyType) {
    this.currencyType = currencyType;
    return this;
  }

  /**
   * Get currencyType
   * @return currencyType
   */
  
  @Schema(name = "currencyType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currencyType")
  public @Nullable String getCurrencyType() {
    return currencyType;
  }

  public void setCurrencyType(@Nullable String currencyType) {
    this.currencyType = currencyType;
  }

  public PaymentTransactionResponse amount(@Nullable Double amount) {
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

  public PaymentTransactionResponse tax(@Nullable Double tax) {
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

  public PaymentTransactionResponse offerTransactions(List<@Valid OfferTransactionResponse> offerTransactions) {
    this.offerTransactions = offerTransactions;
    return this;
  }

  public PaymentTransactionResponse addOfferTransactionsItem(OfferTransactionResponse offerTransactionsItem) {
    if (this.offerTransactions == null) {
      this.offerTransactions = new ArrayList<>();
    }
    this.offerTransactions.add(offerTransactionsItem);
    return this;
  }

  /**
   * Get offerTransactions
   * @return offerTransactions
   */
  @Valid 
  @Schema(name = "offerTransactions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerTransactions")
  public List<@Valid OfferTransactionResponse> getOfferTransactions() {
    return offerTransactions;
  }

  public void setOfferTransactions(List<@Valid OfferTransactionResponse> offerTransactions) {
    this.offerTransactions = offerTransactions;
  }

  public PaymentTransactionResponse orderItems(List<@Valid PurchaseOrderItemResponse> orderItems) {
    this.orderItems = orderItems;
    return this;
  }

  public PaymentTransactionResponse addOrderItemsItem(PurchaseOrderItemResponse orderItemsItem) {
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
  public List<@Valid PurchaseOrderItemResponse> getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(List<@Valid PurchaseOrderItemResponse> orderItems) {
    this.orderItems = orderItems;
  }

  public PaymentTransactionResponse externalPaymentId(@Nullable String externalPaymentId) {
    this.externalPaymentId = externalPaymentId;
    return this;
  }

  /**
   * Get externalPaymentId
   * @return externalPaymentId
   */
  
  @Schema(name = "externalPaymentId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalPaymentId")
  public @Nullable String getExternalPaymentId() {
    return externalPaymentId;
  }

  public void setExternalPaymentId(@Nullable String externalPaymentId) {
    this.externalPaymentId = externalPaymentId;
  }

  public PaymentTransactionResponse metadata(@Nullable String metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  
  @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadata")
  public @Nullable String getMetadata() {
    return metadata;
  }

  public void setMetadata(@Nullable String metadata) {
    this.metadata = metadata;
  }

  public PaymentTransactionResponse created(@Nullable Long created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  
  @Schema(name = "created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created")
  public @Nullable Long getCreated() {
    return created;
  }

  public void setCreated(@Nullable Long created) {
    this.created = created;
  }

  public PaymentTransactionResponse updated(@Nullable Long updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
   */
  
  @Schema(name = "updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated")
  public @Nullable Long getUpdated() {
    return updated;
  }

  public void setUpdated(@Nullable Long updated) {
    this.updated = updated;
  }

  public PaymentTransactionResponse returning(@Nullable String returning) {
    this.returning = returning;
    return this;
  }

  /**
   * Get returning
   * @return returning
   */
  
  @Schema(name = "returning", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returning")
  public @Nullable String getReturning() {
    return returning;
  }

  public void setReturning(@Nullable String returning) {
    this.returning = returning;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransactionResponse paymentTransactionResponse = (PaymentTransactionResponse) o;
    return Objects.equals(this.valid, paymentTransactionResponse.valid) &&
        Objects.equals(this.message, paymentTransactionResponse.message) &&
        Objects.equals(this.version, paymentTransactionResponse.version) &&
        Objects.equals(this.serializeNulls, paymentTransactionResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, paymentTransactionResponse.startTimeLog) &&
        Objects.equals(this.errorCode, paymentTransactionResponse.errorCode) &&
        Objects.equals(this.request, paymentTransactionResponse.request) &&
        Objects.equals(this.paymentTransactionId, paymentTransactionResponse.paymentTransactionId) &&
        Objects.equals(this.customer, paymentTransactionResponse.customer) &&
        Objects.equals(this.promoCode, paymentTransactionResponse.promoCode) &&
        Objects.equals(this.remoteRefId, paymentTransactionResponse.remoteRefId) &&
        Objects.equals(this.currencyType, paymentTransactionResponse.currencyType) &&
        Objects.equals(this.amount, paymentTransactionResponse.amount) &&
        Objects.equals(this.tax, paymentTransactionResponse.tax) &&
        Objects.equals(this.offerTransactions, paymentTransactionResponse.offerTransactions) &&
        Objects.equals(this.orderItems, paymentTransactionResponse.orderItems) &&
        Objects.equals(this.externalPaymentId, paymentTransactionResponse.externalPaymentId) &&
        Objects.equals(this.metadata, paymentTransactionResponse.metadata) &&
        Objects.equals(this.created, paymentTransactionResponse.created) &&
        Objects.equals(this.updated, paymentTransactionResponse.updated) &&
        Objects.equals(this.returning, paymentTransactionResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, paymentTransactionId, customer, promoCode, remoteRefId, currencyType, amount, tax, offerTransactions, orderItems, externalPaymentId, metadata, created, updated, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransactionResponse {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    paymentTransactionId: ").append(toIndentedString(paymentTransactionId)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    promoCode: ").append(toIndentedString(promoCode)).append("\n");
    sb.append("    remoteRefId: ").append(toIndentedString(remoteRefId)).append("\n");
    sb.append("    currencyType: ").append(toIndentedString(currencyType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    offerTransactions: ").append(toIndentedString(offerTransactions)).append("\n");
    sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
    sb.append("    externalPaymentId: ").append(toIndentedString(externalPaymentId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    returning: ").append(toIndentedString(returning)).append("\n");
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

