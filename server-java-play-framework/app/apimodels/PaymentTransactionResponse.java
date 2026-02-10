package apimodels;

import apimodels.AccountShortResponse;
import apimodels.NameStringValueResponse;
import apimodels.OfferTransactionResponse;
import apimodels.PurchaseOrderItemResponse;
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
 * PaymentTransactionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PaymentTransactionResponse   {
  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("message")
  
  private String message;

  @JsonProperty("version")
  
  private Double version;

  @JsonProperty("serializeNulls")
  
  private Boolean serializeNulls;

  @JsonProperty("startTimeLog")
  
  private Long startTimeLog;

  @JsonProperty("errorCode")
  
  private String errorCode;

  @JsonProperty("request")
  @Valid

  private List<@Valid NameStringValueResponse> request = null;

  @JsonProperty("paymentTransactionId")
  
  private Long paymentTransactionId;

  @JsonProperty("customer")
  @Valid

  private AccountShortResponse customer;

  @JsonProperty("promoCode")
  
  private String promoCode;

  @JsonProperty("remoteRefId")
  
  private String remoteRefId;

  @JsonProperty("currencyType")
  
  private String currencyType;

  @JsonProperty("amount")
  
  private Double amount;

  @JsonProperty("tax")
  
  private Double tax;

  @JsonProperty("offerTransactions")
  @Valid

  private List<@Valid OfferTransactionResponse> offerTransactions = null;

  @JsonProperty("orderItems")
  @Valid

  private List<@Valid PurchaseOrderItemResponse> orderItems = null;

  @JsonProperty("externalPaymentId")
  
  private String externalPaymentId;

  @JsonProperty("metadata")
  
  private String metadata;

  @JsonProperty("created")
  
  private Long created;

  @JsonProperty("updated")
  
  private Long updated;

  @JsonProperty("returning")
  
  private String returning;

  public PaymentTransactionResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public PaymentTransactionResponse message(String message) {
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

  public PaymentTransactionResponse version(Double version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public PaymentTransactionResponse serializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

   /**
   * Get serializeNulls
   * @return serializeNulls
  **/
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public PaymentTransactionResponse startTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

   /**
   * Get startTimeLog
   * @return startTimeLog
  **/
  public Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public PaymentTransactionResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
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
  **/
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public PaymentTransactionResponse paymentTransactionId(Long paymentTransactionId) {
    this.paymentTransactionId = paymentTransactionId;
    return this;
  }

   /**
   * Get paymentTransactionId
   * @return paymentTransactionId
  **/
  public Long getPaymentTransactionId() {
    return paymentTransactionId;
  }

  public void setPaymentTransactionId(Long paymentTransactionId) {
    this.paymentTransactionId = paymentTransactionId;
  }

  public PaymentTransactionResponse customer(AccountShortResponse customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  public AccountShortResponse getCustomer() {
    return customer;
  }

  public void setCustomer(AccountShortResponse customer) {
    this.customer = customer;
  }

  public PaymentTransactionResponse promoCode(String promoCode) {
    this.promoCode = promoCode;
    return this;
  }

   /**
   * Get promoCode
   * @return promoCode
  **/
  public String getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  public PaymentTransactionResponse remoteRefId(String remoteRefId) {
    this.remoteRefId = remoteRefId;
    return this;
  }

   /**
   * Get remoteRefId
   * @return remoteRefId
  **/
  public String getRemoteRefId() {
    return remoteRefId;
  }

  public void setRemoteRefId(String remoteRefId) {
    this.remoteRefId = remoteRefId;
  }

  public PaymentTransactionResponse currencyType(String currencyType) {
    this.currencyType = currencyType;
    return this;
  }

   /**
   * Get currencyType
   * @return currencyType
  **/
  public String getCurrencyType() {
    return currencyType;
  }

  public void setCurrencyType(String currencyType) {
    this.currencyType = currencyType;
  }

  public PaymentTransactionResponse amount(Double amount) {
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

  public PaymentTransactionResponse tax(Double tax) {
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
  **/
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
  **/
  public List<@Valid PurchaseOrderItemResponse> getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(List<@Valid PurchaseOrderItemResponse> orderItems) {
    this.orderItems = orderItems;
  }

  public PaymentTransactionResponse externalPaymentId(String externalPaymentId) {
    this.externalPaymentId = externalPaymentId;
    return this;
  }

   /**
   * Get externalPaymentId
   * @return externalPaymentId
  **/
  public String getExternalPaymentId() {
    return externalPaymentId;
  }

  public void setExternalPaymentId(String externalPaymentId) {
    this.externalPaymentId = externalPaymentId;
  }

  public PaymentTransactionResponse metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  public PaymentTransactionResponse created(Long created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public PaymentTransactionResponse updated(Long updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  public PaymentTransactionResponse returning(String returning) {
    this.returning = returning;
    return this;
  }

   /**
   * Get returning
   * @return returning
  **/
  public String getReturning() {
    return returning;
  }

  public void setReturning(String returning) {
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
    return Objects.equals(valid, paymentTransactionResponse.valid) &&
        Objects.equals(message, paymentTransactionResponse.message) &&
        Objects.equals(version, paymentTransactionResponse.version) &&
        Objects.equals(serializeNulls, paymentTransactionResponse.serializeNulls) &&
        Objects.equals(startTimeLog, paymentTransactionResponse.startTimeLog) &&
        Objects.equals(errorCode, paymentTransactionResponse.errorCode) &&
        Objects.equals(request, paymentTransactionResponse.request) &&
        Objects.equals(paymentTransactionId, paymentTransactionResponse.paymentTransactionId) &&
        Objects.equals(customer, paymentTransactionResponse.customer) &&
        Objects.equals(promoCode, paymentTransactionResponse.promoCode) &&
        Objects.equals(remoteRefId, paymentTransactionResponse.remoteRefId) &&
        Objects.equals(currencyType, paymentTransactionResponse.currencyType) &&
        Objects.equals(amount, paymentTransactionResponse.amount) &&
        Objects.equals(tax, paymentTransactionResponse.tax) &&
        Objects.equals(offerTransactions, paymentTransactionResponse.offerTransactions) &&
        Objects.equals(orderItems, paymentTransactionResponse.orderItems) &&
        Objects.equals(externalPaymentId, paymentTransactionResponse.externalPaymentId) &&
        Objects.equals(metadata, paymentTransactionResponse.metadata) &&
        Objects.equals(created, paymentTransactionResponse.created) &&
        Objects.equals(updated, paymentTransactionResponse.updated) &&
        Objects.equals(returning, paymentTransactionResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, paymentTransactionId, customer, promoCode, remoteRefId, currencyType, amount, tax, offerTransactions, orderItems, externalPaymentId, metadata, created, updated, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

