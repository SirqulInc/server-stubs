package apimodels;

import apimodels.AccountShortResponse;
import apimodels.ApplicationMiniResponse;
import apimodels.NameStringValueResponse;
import apimodels.PaymentTransactionResponse;
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
 * OrderResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderResponse   {
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

  @JsonProperty("orderId")
  
  private Long orderId;

  @JsonProperty("application")
  @Valid

  private ApplicationMiniResponse application;

  @JsonProperty("customer")
  @Valid

  private AccountShortResponse customer;

  @JsonProperty("amount")
  
  private Double amount;

  @JsonProperty("purchases")
  
  private Double purchases;

  @JsonProperty("credits")
  
  private Double credits;

  @JsonProperty("payments")
  @Valid

  private List<@Valid PaymentTransactionResponse> payments = null;

  @JsonProperty("externalOrderId")
  
  private String externalOrderId;

  @JsonProperty("created")
  
  private Long created;

  @JsonProperty("updated")
  
  private Long updated;

  @JsonProperty("externalDate")
  
  private Long externalDate;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("returning")
  
  private String returning;

  public OrderResponse valid(Boolean valid) {
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

  public OrderResponse message(String message) {
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

  public OrderResponse version(Double version) {
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

  public OrderResponse serializeNulls(Boolean serializeNulls) {
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

  public OrderResponse startTimeLog(Long startTimeLog) {
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

  public OrderResponse errorCode(String errorCode) {
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
  **/
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public OrderResponse orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public OrderResponse application(ApplicationMiniResponse application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  public ApplicationMiniResponse getApplication() {
    return application;
  }

  public void setApplication(ApplicationMiniResponse application) {
    this.application = application;
  }

  public OrderResponse customer(AccountShortResponse customer) {
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

  public OrderResponse amount(Double amount) {
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

  public OrderResponse purchases(Double purchases) {
    this.purchases = purchases;
    return this;
  }

   /**
   * Get purchases
   * @return purchases
  **/
  public Double getPurchases() {
    return purchases;
  }

  public void setPurchases(Double purchases) {
    this.purchases = purchases;
  }

  public OrderResponse credits(Double credits) {
    this.credits = credits;
    return this;
  }

   /**
   * Get credits
   * @return credits
  **/
  public Double getCredits() {
    return credits;
  }

  public void setCredits(Double credits) {
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
  **/
  public List<@Valid PaymentTransactionResponse> getPayments() {
    return payments;
  }

  public void setPayments(List<@Valid PaymentTransactionResponse> payments) {
    this.payments = payments;
  }

  public OrderResponse externalOrderId(String externalOrderId) {
    this.externalOrderId = externalOrderId;
    return this;
  }

   /**
   * Get externalOrderId
   * @return externalOrderId
  **/
  public String getExternalOrderId() {
    return externalOrderId;
  }

  public void setExternalOrderId(String externalOrderId) {
    this.externalOrderId = externalOrderId;
  }

  public OrderResponse created(Long created) {
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

  public OrderResponse updated(Long updated) {
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

  public OrderResponse externalDate(Long externalDate) {
    this.externalDate = externalDate;
    return this;
  }

   /**
   * Get externalDate
   * @return externalDate
  **/
  public Long getExternalDate() {
    return externalDate;
  }

  public void setExternalDate(Long externalDate) {
    this.externalDate = externalDate;
  }

  public OrderResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrderResponse returning(String returning) {
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
    OrderResponse orderResponse = (OrderResponse) o;
    return Objects.equals(valid, orderResponse.valid) &&
        Objects.equals(message, orderResponse.message) &&
        Objects.equals(version, orderResponse.version) &&
        Objects.equals(serializeNulls, orderResponse.serializeNulls) &&
        Objects.equals(startTimeLog, orderResponse.startTimeLog) &&
        Objects.equals(errorCode, orderResponse.errorCode) &&
        Objects.equals(request, orderResponse.request) &&
        Objects.equals(orderId, orderResponse.orderId) &&
        Objects.equals(application, orderResponse.application) &&
        Objects.equals(customer, orderResponse.customer) &&
        Objects.equals(amount, orderResponse.amount) &&
        Objects.equals(purchases, orderResponse.purchases) &&
        Objects.equals(credits, orderResponse.credits) &&
        Objects.equals(payments, orderResponse.payments) &&
        Objects.equals(externalOrderId, orderResponse.externalOrderId) &&
        Objects.equals(created, orderResponse.created) &&
        Objects.equals(updated, orderResponse.updated) &&
        Objects.equals(externalDate, orderResponse.externalDate) &&
        Objects.equals(description, orderResponse.description) &&
        Objects.equals(returning, orderResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, orderId, application, customer, amount, purchases, credits, payments, externalOrderId, created, updated, externalDate, description, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

