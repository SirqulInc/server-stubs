package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.ApplicationMiniResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.PaymentTransactionResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrderResponse  {
  
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

  private Long orderId;

  @ApiModelProperty(value = "")

  @Valid

  private ApplicationMiniResponse application;

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse customer;

  @ApiModelProperty(value = "")

  private Double amount;

  @ApiModelProperty(value = "")

  private Double purchases;

  @ApiModelProperty(value = "")

  private Double credits;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid PaymentTransactionResponse> payments = new ArrayList<>();

  @ApiModelProperty(value = "")

  private String externalOrderId;

  @ApiModelProperty(value = "")

  private Long created;

  @ApiModelProperty(value = "")

  private Long updated;

  @ApiModelProperty(value = "")

  private Long externalDate;

  @ApiModelProperty(value = "")

  private String description;

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

  public OrderResponse valid(Boolean valid) {
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

  public OrderResponse message(String message) {
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

  public OrderResponse version(Double version) {
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

  public OrderResponse serializeNulls(Boolean serializeNulls) {
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

  public OrderResponse startTimeLog(Long startTimeLog) {
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

  public OrderResponse errorCode(String errorCode) {
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

  public OrderResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public OrderResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get orderId
   * @return orderId
  **/
  @JsonProperty("orderId")
  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public OrderResponse orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

 /**
   * Get application
   * @return application
  **/
  @JsonProperty("application")
  public ApplicationMiniResponse getApplication() {
    return application;
  }

  public void setApplication(ApplicationMiniResponse application) {
    this.application = application;
  }

  public OrderResponse application(ApplicationMiniResponse application) {
    this.application = application;
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

  public OrderResponse customer(AccountShortResponse customer) {
    this.customer = customer;
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

  public OrderResponse amount(Double amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Get purchases
   * @return purchases
  **/
  @JsonProperty("purchases")
  public Double getPurchases() {
    return purchases;
  }

  public void setPurchases(Double purchases) {
    this.purchases = purchases;
  }

  public OrderResponse purchases(Double purchases) {
    this.purchases = purchases;
    return this;
  }

 /**
   * Get credits
   * @return credits
  **/
  @JsonProperty("credits")
  public Double getCredits() {
    return credits;
  }

  public void setCredits(Double credits) {
    this.credits = credits;
  }

  public OrderResponse credits(Double credits) {
    this.credits = credits;
    return this;
  }

 /**
   * Get payments
   * @return payments
  **/
  @JsonProperty("payments")
  public List<@Valid PaymentTransactionResponse> getPayments() {
    return payments;
  }

  public void setPayments(List<@Valid PaymentTransactionResponse> payments) {
    this.payments = payments;
  }

  public OrderResponse payments(List<@Valid PaymentTransactionResponse> payments) {
    this.payments = payments;
    return this;
  }

  public OrderResponse addPaymentsItem(PaymentTransactionResponse paymentsItem) {
    this.payments.add(paymentsItem);
    return this;
  }

 /**
   * Get externalOrderId
   * @return externalOrderId
  **/
  @JsonProperty("externalOrderId")
  public String getExternalOrderId() {
    return externalOrderId;
  }

  public void setExternalOrderId(String externalOrderId) {
    this.externalOrderId = externalOrderId;
  }

  public OrderResponse externalOrderId(String externalOrderId) {
    this.externalOrderId = externalOrderId;
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

  public OrderResponse created(Long created) {
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

  public OrderResponse updated(Long updated) {
    this.updated = updated;
    return this;
  }

 /**
   * Get externalDate
   * @return externalDate
  **/
  @JsonProperty("externalDate")
  public Long getExternalDate() {
    return externalDate;
  }

  public void setExternalDate(Long externalDate) {
    this.externalDate = externalDate;
  }

  public OrderResponse externalDate(Long externalDate) {
    this.externalDate = externalDate;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrderResponse description(String description) {
    this.description = description;
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

  public OrderResponse returning(String returning) {
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
    OrderResponse orderResponse = (OrderResponse) o;
    return Objects.equals(this.valid, orderResponse.valid) &&
        Objects.equals(this.message, orderResponse.message) &&
        Objects.equals(this.version, orderResponse.version) &&
        Objects.equals(this.serializeNulls, orderResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, orderResponse.startTimeLog) &&
        Objects.equals(this.errorCode, orderResponse.errorCode) &&
        Objects.equals(this.request, orderResponse.request) &&
        Objects.equals(this.orderId, orderResponse.orderId) &&
        Objects.equals(this.application, orderResponse.application) &&
        Objects.equals(this.customer, orderResponse.customer) &&
        Objects.equals(this.amount, orderResponse.amount) &&
        Objects.equals(this.purchases, orderResponse.purchases) &&
        Objects.equals(this.credits, orderResponse.credits) &&
        Objects.equals(this.payments, orderResponse.payments) &&
        Objects.equals(this.externalOrderId, orderResponse.externalOrderId) &&
        Objects.equals(this.created, orderResponse.created) &&
        Objects.equals(this.updated, orderResponse.updated) &&
        Objects.equals(this.externalDate, orderResponse.externalDate) &&
        Objects.equals(this.description, orderResponse.description) &&
        Objects.equals(this.returning, orderResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, orderId, application, customer, amount, purchases, credits, payments, externalOrderId, created, updated, externalDate, description, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    purchases: ").append(toIndentedString(purchases)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    externalOrderId: ").append(toIndentedString(externalOrderId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    externalDate: ").append(toIndentedString(externalDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

