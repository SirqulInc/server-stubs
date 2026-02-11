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
import org.openapitools.model.ApplicationMiniResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.PaymentTransactionResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrderResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private Long orderId;
  private ApplicationMiniResponse application;
  private AccountShortResponse customer;
  private Double amount;
  private Double purchases;
  private Double credits;
  private List<@Valid PaymentTransactionResponse> payments = new ArrayList<>();
  private String externalOrderId;
  private Long created;
  private Long updated;
  private Long externalDate;
  private String description;
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
  @JsonProperty("orderId")
  public Long getOrderId() {
    return orderId;
  }
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("application")
  @Valid
  public ApplicationMiniResponse getApplication() {
    return application;
  }
  public void setApplication(ApplicationMiniResponse application) {
    this.application = application;
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
  @JsonProperty("purchases")
  public Double getPurchases() {
    return purchases;
  }
  public void setPurchases(Double purchases) {
    this.purchases = purchases;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("credits")
  public Double getCredits() {
    return credits;
  }
  public void setCredits(Double credits) {
    this.credits = credits;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("payments")
  @Valid
  public List<@Valid PaymentTransactionResponse> getPayments() {
    return payments;
  }
  public void setPayments(List<@Valid PaymentTransactionResponse> payments) {
    this.payments = payments;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("externalOrderId")
  public String getExternalOrderId() {
    return externalOrderId;
  }
  public void setExternalOrderId(String externalOrderId) {
    this.externalOrderId = externalOrderId;
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
  @JsonProperty("externalDate")
  public Long getExternalDate() {
    return externalDate;
  }
  public void setExternalDate(Long externalDate) {
    this.externalDate = externalDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

