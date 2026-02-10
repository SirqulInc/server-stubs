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
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.OfferTransactionResponse;
import org.openapitools.model.PurchaseOrderItemResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PaymentTransactionResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private Long paymentTransactionId;
  private AccountShortResponse customer;
  private String promoCode;
  private String remoteRefId;
  private String currencyType;
  private Double amount;
  private Double tax;
  private List<@Valid OfferTransactionResponse> offerTransactions = new ArrayList<>();
  private List<@Valid PurchaseOrderItemResponse> orderItems = new ArrayList<>();
  private String externalPaymentId;
  private String metadata;
  private Long created;
  private Long updated;
  private String returning;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }
  public void setVersion(Double version) {
    this.version = version;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }
  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }
  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("request")
  @Valid
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }
  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("paymentTransactionId")
  public Long getPaymentTransactionId() {
    return paymentTransactionId;
  }
  public void setPaymentTransactionId(Long paymentTransactionId) {
    this.paymentTransactionId = paymentTransactionId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customer")
  @Valid
  public AccountShortResponse getCustomer() {
    return customer;
  }
  public void setCustomer(AccountShortResponse customer) {
    this.customer = customer;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("promoCode")
  public String getPromoCode() {
    return promoCode;
  }
  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("remoteRefId")
  public String getRemoteRefId() {
    return remoteRefId;
  }
  public void setRemoteRefId(String remoteRefId) {
    this.remoteRefId = remoteRefId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currencyType")
  public String getCurrencyType() {
    return currencyType;
  }
  public void setCurrencyType(String currencyType) {
    this.currencyType = currencyType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("amount")
  public Double getAmount() {
    return amount;
  }
  public void setAmount(Double amount) {
    this.amount = amount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tax")
  public Double getTax() {
    return tax;
  }
  public void setTax(Double tax) {
    this.tax = tax;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offerTransactions")
  @Valid
  public List<@Valid OfferTransactionResponse> getOfferTransactions() {
    return offerTransactions;
  }
  public void setOfferTransactions(List<@Valid OfferTransactionResponse> offerTransactions) {
    this.offerTransactions = offerTransactions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderItems")
  @Valid
  public List<@Valid PurchaseOrderItemResponse> getOrderItems() {
    return orderItems;
  }
  public void setOrderItems(List<@Valid PurchaseOrderItemResponse> orderItems) {
    this.orderItems = orderItems;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("externalPaymentId")
  public String getExternalPaymentId() {
    return externalPaymentId;
  }
  public void setExternalPaymentId(String externalPaymentId) {
    this.externalPaymentId = externalPaymentId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("metadata")
  public String getMetadata() {
    return metadata;
  }
  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }
  public void setCreated(Long created) {
    this.created = created;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }
  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("returning")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

