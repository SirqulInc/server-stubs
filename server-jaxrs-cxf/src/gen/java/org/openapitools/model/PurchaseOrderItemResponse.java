package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PurchaseOrderItemResponse  {
  
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

  private Long purchaseOrderItemId;

  @ApiModelProperty(value = "")

  private Long created;

  @ApiModelProperty(value = "")

  private Long updated;

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse customer;

  @ApiModelProperty(value = "")

  private String orderItemType;

  @ApiModelProperty(value = "")

  private Long orderItemId;

  @ApiModelProperty(value = "")

  private String orderCustomType;

  @ApiModelProperty(value = "")

  private String orderCustomId;

  @ApiModelProperty(value = "")

  private Long retailerLocationId;

  @ApiModelProperty(value = "")

  private Double amount;

  @ApiModelProperty(value = "")

  private Double tax;

  @ApiModelProperty(value = "")

  private String comment;

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

  public PurchaseOrderItemResponse valid(Boolean valid) {
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

  public PurchaseOrderItemResponse message(String message) {
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

  public PurchaseOrderItemResponse version(Double version) {
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

  public PurchaseOrderItemResponse serializeNulls(Boolean serializeNulls) {
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

  public PurchaseOrderItemResponse startTimeLog(Long startTimeLog) {
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

  public PurchaseOrderItemResponse errorCode(String errorCode) {
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

  public PurchaseOrderItemResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public PurchaseOrderItemResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get purchaseOrderItemId
   * @return purchaseOrderItemId
  **/
  @JsonProperty("purchaseOrderItemId")
  public Long getPurchaseOrderItemId() {
    return purchaseOrderItemId;
  }

  public void setPurchaseOrderItemId(Long purchaseOrderItemId) {
    this.purchaseOrderItemId = purchaseOrderItemId;
  }

  public PurchaseOrderItemResponse purchaseOrderItemId(Long purchaseOrderItemId) {
    this.purchaseOrderItemId = purchaseOrderItemId;
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

  public PurchaseOrderItemResponse created(Long created) {
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

  public PurchaseOrderItemResponse updated(Long updated) {
    this.updated = updated;
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

  public PurchaseOrderItemResponse customer(AccountShortResponse customer) {
    this.customer = customer;
    return this;
  }

 /**
   * Get orderItemType
   * @return orderItemType
  **/
  @JsonProperty("orderItemType")
  public String getOrderItemType() {
    return orderItemType;
  }

  public void setOrderItemType(String orderItemType) {
    this.orderItemType = orderItemType;
  }

  public PurchaseOrderItemResponse orderItemType(String orderItemType) {
    this.orderItemType = orderItemType;
    return this;
  }

 /**
   * Get orderItemId
   * @return orderItemId
  **/
  @JsonProperty("orderItemId")
  public Long getOrderItemId() {
    return orderItemId;
  }

  public void setOrderItemId(Long orderItemId) {
    this.orderItemId = orderItemId;
  }

  public PurchaseOrderItemResponse orderItemId(Long orderItemId) {
    this.orderItemId = orderItemId;
    return this;
  }

 /**
   * Get orderCustomType
   * @return orderCustomType
  **/
  @JsonProperty("orderCustomType")
  public String getOrderCustomType() {
    return orderCustomType;
  }

  public void setOrderCustomType(String orderCustomType) {
    this.orderCustomType = orderCustomType;
  }

  public PurchaseOrderItemResponse orderCustomType(String orderCustomType) {
    this.orderCustomType = orderCustomType;
    return this;
  }

 /**
   * Get orderCustomId
   * @return orderCustomId
  **/
  @JsonProperty("orderCustomId")
  public String getOrderCustomId() {
    return orderCustomId;
  }

  public void setOrderCustomId(String orderCustomId) {
    this.orderCustomId = orderCustomId;
  }

  public PurchaseOrderItemResponse orderCustomId(String orderCustomId) {
    this.orderCustomId = orderCustomId;
    return this;
  }

 /**
   * Get retailerLocationId
   * @return retailerLocationId
  **/
  @JsonProperty("retailerLocationId")
  public Long getRetailerLocationId() {
    return retailerLocationId;
  }

  public void setRetailerLocationId(Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
  }

  public PurchaseOrderItemResponse retailerLocationId(Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
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

  public PurchaseOrderItemResponse amount(Double amount) {
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

  public PurchaseOrderItemResponse tax(Double tax) {
    this.tax = tax;
    return this;
  }

 /**
   * Get comment
   * @return comment
  **/
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public PurchaseOrderItemResponse comment(String comment) {
    this.comment = comment;
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

  public PurchaseOrderItemResponse returning(String returning) {
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
    PurchaseOrderItemResponse purchaseOrderItemResponse = (PurchaseOrderItemResponse) o;
    return Objects.equals(this.valid, purchaseOrderItemResponse.valid) &&
        Objects.equals(this.message, purchaseOrderItemResponse.message) &&
        Objects.equals(this.version, purchaseOrderItemResponse.version) &&
        Objects.equals(this.serializeNulls, purchaseOrderItemResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, purchaseOrderItemResponse.startTimeLog) &&
        Objects.equals(this.errorCode, purchaseOrderItemResponse.errorCode) &&
        Objects.equals(this.request, purchaseOrderItemResponse.request) &&
        Objects.equals(this.purchaseOrderItemId, purchaseOrderItemResponse.purchaseOrderItemId) &&
        Objects.equals(this.created, purchaseOrderItemResponse.created) &&
        Objects.equals(this.updated, purchaseOrderItemResponse.updated) &&
        Objects.equals(this.customer, purchaseOrderItemResponse.customer) &&
        Objects.equals(this.orderItemType, purchaseOrderItemResponse.orderItemType) &&
        Objects.equals(this.orderItemId, purchaseOrderItemResponse.orderItemId) &&
        Objects.equals(this.orderCustomType, purchaseOrderItemResponse.orderCustomType) &&
        Objects.equals(this.orderCustomId, purchaseOrderItemResponse.orderCustomId) &&
        Objects.equals(this.retailerLocationId, purchaseOrderItemResponse.retailerLocationId) &&
        Objects.equals(this.amount, purchaseOrderItemResponse.amount) &&
        Objects.equals(this.tax, purchaseOrderItemResponse.tax) &&
        Objects.equals(this.comment, purchaseOrderItemResponse.comment) &&
        Objects.equals(this.returning, purchaseOrderItemResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, purchaseOrderItemId, created, updated, customer, orderItemType, orderItemId, orderCustomType, orderCustomId, retailerLocationId, amount, tax, comment, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseOrderItemResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    purchaseOrderItemId: ").append(toIndentedString(purchaseOrderItemId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    orderItemType: ").append(toIndentedString(orderItemType)).append("\n");
    sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
    sb.append("    orderCustomType: ").append(toIndentedString(orderCustomType)).append("\n");
    sb.append("    orderCustomId: ").append(toIndentedString(orderCustomId)).append("\n");
    sb.append("    retailerLocationId: ").append(toIndentedString(retailerLocationId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

