package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.OfferTransactionResponse;
import org.openapitools.model.PurchaseOrderItemResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PaymentTransactionResponse  {
  
  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String message;

  @ApiModelProperty(value = "")

  private Double version;

  @ApiModelProperty(value = "")

  private Boolean serializeNulls;

  @ApiModelProperty(value = "")

  private Long startTimeLog;

  @ApiModelProperty(value = "")

  private String errorCode;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long paymentTransactionId;

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse customer;

  @ApiModelProperty(value = "")

  private String promoCode;

  @ApiModelProperty(value = "")

  private String remoteRefId;

  @ApiModelProperty(value = "")

  private String currencyType;

  @ApiModelProperty(value = "")

  private Double amount;

  @ApiModelProperty(value = "")

  private Double tax;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid OfferTransactionResponse> offerTransactions = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid PurchaseOrderItemResponse> orderItems = new ArrayList<>();

  @ApiModelProperty(value = "")

  private String externalPaymentId;

  @ApiModelProperty(value = "")

  private String metadata;

  @ApiModelProperty(value = "")

  private Long created;

  @ApiModelProperty(value = "")

  private Long updated;

  @ApiModelProperty(value = "")

  private String returning;
 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public PaymentTransactionResponse valid(Boolean valid) {
    this.valid = valid;
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

  public PaymentTransactionResponse message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public PaymentTransactionResponse version(Double version) {
    this.version = version;
    return this;
  }

 /**
   * Get serializeNulls
   * @return serializeNulls
  **/
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public PaymentTransactionResponse serializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

 /**
   * Get startTimeLog
   * @return startTimeLog
  **/
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public PaymentTransactionResponse startTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

 /**
   * Get errorCode
   * @return errorCode
  **/
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public PaymentTransactionResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

 /**
   * Get request
   * @return request
  **/
  @JsonProperty("request")
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public PaymentTransactionResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public PaymentTransactionResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get paymentTransactionId
   * @return paymentTransactionId
  **/
  @JsonProperty("paymentTransactionId")
  public Long getPaymentTransactionId() {
    return paymentTransactionId;
  }

  public void setPaymentTransactionId(Long paymentTransactionId) {
    this.paymentTransactionId = paymentTransactionId;
  }

  public PaymentTransactionResponse paymentTransactionId(Long paymentTransactionId) {
    this.paymentTransactionId = paymentTransactionId;
    return this;
  }

 /**
   * Get customer
   * @return customer
  **/
  @JsonProperty("customer")
  public AccountShortResponse getCustomer() {
    return customer;
  }

  public void setCustomer(AccountShortResponse customer) {
    this.customer = customer;
  }

  public PaymentTransactionResponse customer(AccountShortResponse customer) {
    this.customer = customer;
    return this;
  }

 /**
   * Get promoCode
   * @return promoCode
  **/
  @JsonProperty("promoCode")
  public String getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  public PaymentTransactionResponse promoCode(String promoCode) {
    this.promoCode = promoCode;
    return this;
  }

 /**
   * Get remoteRefId
   * @return remoteRefId
  **/
  @JsonProperty("remoteRefId")
  public String getRemoteRefId() {
    return remoteRefId;
  }

  public void setRemoteRefId(String remoteRefId) {
    this.remoteRefId = remoteRefId;
  }

  public PaymentTransactionResponse remoteRefId(String remoteRefId) {
    this.remoteRefId = remoteRefId;
    return this;
  }

 /**
   * Get currencyType
   * @return currencyType
  **/
  @JsonProperty("currencyType")
  public String getCurrencyType() {
    return currencyType;
  }

  public void setCurrencyType(String currencyType) {
    this.currencyType = currencyType;
  }

  public PaymentTransactionResponse currencyType(String currencyType) {
    this.currencyType = currencyType;
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

  public PaymentTransactionResponse amount(Double amount) {
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

  public PaymentTransactionResponse tax(Double tax) {
    this.tax = tax;
    return this;
  }

 /**
   * Get offerTransactions
   * @return offerTransactions
  **/
  @JsonProperty("offerTransactions")
  public List<@Valid OfferTransactionResponse> getOfferTransactions() {
    return offerTransactions;
  }

  public void setOfferTransactions(List<@Valid OfferTransactionResponse> offerTransactions) {
    this.offerTransactions = offerTransactions;
  }

  public PaymentTransactionResponse offerTransactions(List<@Valid OfferTransactionResponse> offerTransactions) {
    this.offerTransactions = offerTransactions;
    return this;
  }

  public PaymentTransactionResponse addOfferTransactionsItem(OfferTransactionResponse offerTransactionsItem) {
    this.offerTransactions.add(offerTransactionsItem);
    return this;
  }

 /**
   * Get orderItems
   * @return orderItems
  **/
  @JsonProperty("orderItems")
  public List<@Valid PurchaseOrderItemResponse> getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(List<@Valid PurchaseOrderItemResponse> orderItems) {
    this.orderItems = orderItems;
  }

  public PaymentTransactionResponse orderItems(List<@Valid PurchaseOrderItemResponse> orderItems) {
    this.orderItems = orderItems;
    return this;
  }

  public PaymentTransactionResponse addOrderItemsItem(PurchaseOrderItemResponse orderItemsItem) {
    this.orderItems.add(orderItemsItem);
    return this;
  }

 /**
   * Get externalPaymentId
   * @return externalPaymentId
  **/
  @JsonProperty("externalPaymentId")
  public String getExternalPaymentId() {
    return externalPaymentId;
  }

  public void setExternalPaymentId(String externalPaymentId) {
    this.externalPaymentId = externalPaymentId;
  }

  public PaymentTransactionResponse externalPaymentId(String externalPaymentId) {
    this.externalPaymentId = externalPaymentId;
    return this;
  }

 /**
   * Get metadata
   * @return metadata
  **/
  @JsonProperty("metadata")
  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  public PaymentTransactionResponse metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

 /**
   * Get created
   * @return created
  **/
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public PaymentTransactionResponse created(Long created) {
    this.created = created;
    return this;
  }

 /**
   * Get updated
   * @return updated
  **/
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  public PaymentTransactionResponse updated(Long updated) {
    this.updated = updated;
    return this;
  }

 /**
   * Get returning
   * @return returning
  **/
  @JsonProperty("returning")
  public String getReturning() {
    return returning;
  }

  public void setReturning(String returning) {
    this.returning = returning;
  }

  public PaymentTransactionResponse returning(String returning) {
    this.returning = returning;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

