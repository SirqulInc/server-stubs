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
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PurchaseOrderItemResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PurchaseOrderItemResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  private @Nullable Long purchaseOrderItemId;

  private @Nullable Long created;

  private @Nullable Long updated;

  private @Nullable AccountShortResponse customer;

  private @Nullable String orderItemType;

  private @Nullable Long orderItemId;

  private @Nullable String orderCustomType;

  private @Nullable String orderCustomId;

  private @Nullable Long retailerLocationId;

  private @Nullable Double amount;

  private @Nullable Double tax;

  private @Nullable String comment;

  private @Nullable String returning;

  public PurchaseOrderItemResponse valid(@Nullable Boolean valid) {
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

  public PurchaseOrderItemResponse message(@Nullable String message) {
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

  public PurchaseOrderItemResponse version(@Nullable Double version) {
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

  public PurchaseOrderItemResponse serializeNulls(@Nullable Boolean serializeNulls) {
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

  public PurchaseOrderItemResponse startTimeLog(@Nullable Long startTimeLog) {
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

  public PurchaseOrderItemResponse errorCode(@Nullable String errorCode) {
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

  public PurchaseOrderItemResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public PurchaseOrderItemResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public PurchaseOrderItemResponse purchaseOrderItemId(@Nullable Long purchaseOrderItemId) {
    this.purchaseOrderItemId = purchaseOrderItemId;
    return this;
  }

  /**
   * Get purchaseOrderItemId
   * @return purchaseOrderItemId
   */
  
  @Schema(name = "purchaseOrderItemId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purchaseOrderItemId")
  public @Nullable Long getPurchaseOrderItemId() {
    return purchaseOrderItemId;
  }

  public void setPurchaseOrderItemId(@Nullable Long purchaseOrderItemId) {
    this.purchaseOrderItemId = purchaseOrderItemId;
  }

  public PurchaseOrderItemResponse created(@Nullable Long created) {
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

  public PurchaseOrderItemResponse updated(@Nullable Long updated) {
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

  public PurchaseOrderItemResponse customer(@Nullable AccountShortResponse customer) {
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

  public PurchaseOrderItemResponse orderItemType(@Nullable String orderItemType) {
    this.orderItemType = orderItemType;
    return this;
  }

  /**
   * Get orderItemType
   * @return orderItemType
   */
  
  @Schema(name = "orderItemType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderItemType")
  public @Nullable String getOrderItemType() {
    return orderItemType;
  }

  public void setOrderItemType(@Nullable String orderItemType) {
    this.orderItemType = orderItemType;
  }

  public PurchaseOrderItemResponse orderItemId(@Nullable Long orderItemId) {
    this.orderItemId = orderItemId;
    return this;
  }

  /**
   * Get orderItemId
   * @return orderItemId
   */
  
  @Schema(name = "orderItemId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderItemId")
  public @Nullable Long getOrderItemId() {
    return orderItemId;
  }

  public void setOrderItemId(@Nullable Long orderItemId) {
    this.orderItemId = orderItemId;
  }

  public PurchaseOrderItemResponse orderCustomType(@Nullable String orderCustomType) {
    this.orderCustomType = orderCustomType;
    return this;
  }

  /**
   * Get orderCustomType
   * @return orderCustomType
   */
  
  @Schema(name = "orderCustomType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderCustomType")
  public @Nullable String getOrderCustomType() {
    return orderCustomType;
  }

  public void setOrderCustomType(@Nullable String orderCustomType) {
    this.orderCustomType = orderCustomType;
  }

  public PurchaseOrderItemResponse orderCustomId(@Nullable String orderCustomId) {
    this.orderCustomId = orderCustomId;
    return this;
  }

  /**
   * Get orderCustomId
   * @return orderCustomId
   */
  
  @Schema(name = "orderCustomId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderCustomId")
  public @Nullable String getOrderCustomId() {
    return orderCustomId;
  }

  public void setOrderCustomId(@Nullable String orderCustomId) {
    this.orderCustomId = orderCustomId;
  }

  public PurchaseOrderItemResponse retailerLocationId(@Nullable Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
    return this;
  }

  /**
   * Get retailerLocationId
   * @return retailerLocationId
   */
  
  @Schema(name = "retailerLocationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retailerLocationId")
  public @Nullable Long getRetailerLocationId() {
    return retailerLocationId;
  }

  public void setRetailerLocationId(@Nullable Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
  }

  public PurchaseOrderItemResponse amount(@Nullable Double amount) {
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

  public PurchaseOrderItemResponse tax(@Nullable Double tax) {
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

  public PurchaseOrderItemResponse comment(@Nullable String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  
  @Schema(name = "comment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public @Nullable String getComment() {
    return comment;
  }

  public void setComment(@Nullable String comment) {
    this.comment = comment;
  }

  public PurchaseOrderItemResponse returning(@Nullable String returning) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

