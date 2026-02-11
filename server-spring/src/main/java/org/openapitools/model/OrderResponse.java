package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.ApplicationMiniResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.PaymentTransactionResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OrderResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrderResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  private @Nullable Long orderId;

  private @Nullable ApplicationMiniResponse application;

  private @Nullable AccountShortResponse customer;

  private @Nullable Double amount;

  private @Nullable Double purchases;

  private @Nullable Double credits;

  @Valid
  private List<@Valid PaymentTransactionResponse> payments = new ArrayList<>();

  private @Nullable String externalOrderId;

  private @Nullable Long created;

  private @Nullable Long updated;

  private @Nullable Long externalDate;

  private @Nullable String description;

  private @Nullable String returning;

  public OrderResponse valid(@Nullable Boolean valid) {
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

  public OrderResponse message(@Nullable String message) {
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

  public OrderResponse version(@Nullable Double version) {
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

  public OrderResponse serializeNulls(@Nullable Boolean serializeNulls) {
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

  public OrderResponse startTimeLog(@Nullable Long startTimeLog) {
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

  public OrderResponse errorCode(@Nullable String errorCode) {
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

  public OrderResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public OrderResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public OrderResponse orderId(@Nullable Long orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
   */
  
  @Schema(name = "orderId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderId")
  public @Nullable Long getOrderId() {
    return orderId;
  }

  public void setOrderId(@Nullable Long orderId) {
    this.orderId = orderId;
  }

  public OrderResponse application(@Nullable ApplicationMiniResponse application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
   */
  @Valid 
  @Schema(name = "application", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("application")
  public @Nullable ApplicationMiniResponse getApplication() {
    return application;
  }

  public void setApplication(@Nullable ApplicationMiniResponse application) {
    this.application = application;
  }

  public OrderResponse customer(@Nullable AccountShortResponse customer) {
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

  public OrderResponse amount(@Nullable Double amount) {
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

  public OrderResponse purchases(@Nullable Double purchases) {
    this.purchases = purchases;
    return this;
  }

  /**
   * Get purchases
   * @return purchases
   */
  
  @Schema(name = "purchases", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purchases")
  public @Nullable Double getPurchases() {
    return purchases;
  }

  public void setPurchases(@Nullable Double purchases) {
    this.purchases = purchases;
  }

  public OrderResponse credits(@Nullable Double credits) {
    this.credits = credits;
    return this;
  }

  /**
   * Get credits
   * @return credits
   */
  
  @Schema(name = "credits", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("credits")
  public @Nullable Double getCredits() {
    return credits;
  }

  public void setCredits(@Nullable Double credits) {
    this.credits = credits;
  }

  public OrderResponse payments(List<@Valid PaymentTransactionResponse> payments) {
    this.payments = payments;
    return this;
  }

  public OrderResponse addPaymentsItem(PaymentTransactionResponse paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

  /**
   * Get payments
   * @return payments
   */
  @Valid 
  @Schema(name = "payments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("payments")
  public List<@Valid PaymentTransactionResponse> getPayments() {
    return payments;
  }

  public void setPayments(List<@Valid PaymentTransactionResponse> payments) {
    this.payments = payments;
  }

  public OrderResponse externalOrderId(@Nullable String externalOrderId) {
    this.externalOrderId = externalOrderId;
    return this;
  }

  /**
   * Get externalOrderId
   * @return externalOrderId
   */
  
  @Schema(name = "externalOrderId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalOrderId")
  public @Nullable String getExternalOrderId() {
    return externalOrderId;
  }

  public void setExternalOrderId(@Nullable String externalOrderId) {
    this.externalOrderId = externalOrderId;
  }

  public OrderResponse created(@Nullable Long created) {
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

  public OrderResponse updated(@Nullable Long updated) {
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

  public OrderResponse externalDate(@Nullable Long externalDate) {
    this.externalDate = externalDate;
    return this;
  }

  /**
   * Get externalDate
   * @return externalDate
   */
  
  @Schema(name = "externalDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalDate")
  public @Nullable Long getExternalDate() {
    return externalDate;
  }

  public void setExternalDate(@Nullable Long externalDate) {
    this.externalDate = externalDate;
  }

  public OrderResponse description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public OrderResponse returning(@Nullable String returning) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

