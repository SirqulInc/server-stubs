package apimodels;

import apimodels.AccountShortResponse;
import apimodels.NameStringValueResponse;
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
 * PurchaseOrderItemResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PurchaseOrderItemResponse   {
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

  @JsonProperty("purchaseOrderItemId")
  
  private Long purchaseOrderItemId;

  @JsonProperty("created")
  
  private Long created;

  @JsonProperty("updated")
  
  private Long updated;

  @JsonProperty("customer")
  @Valid

  private AccountShortResponse customer;

  @JsonProperty("orderItemType")
  
  private String orderItemType;

  @JsonProperty("orderItemId")
  
  private Long orderItemId;

  @JsonProperty("orderCustomType")
  
  private String orderCustomType;

  @JsonProperty("orderCustomId")
  
  private String orderCustomId;

  @JsonProperty("retailerLocationId")
  
  private Long retailerLocationId;

  @JsonProperty("amount")
  
  private Double amount;

  @JsonProperty("tax")
  
  private Double tax;

  @JsonProperty("comment")
  
  private String comment;

  @JsonProperty("returning")
  
  private String returning;

  public PurchaseOrderItemResponse valid(Boolean valid) {
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

  public PurchaseOrderItemResponse message(String message) {
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

  public PurchaseOrderItemResponse version(Double version) {
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

  public PurchaseOrderItemResponse serializeNulls(Boolean serializeNulls) {
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

  public PurchaseOrderItemResponse startTimeLog(Long startTimeLog) {
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

  public PurchaseOrderItemResponse errorCode(String errorCode) {
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
  **/
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public PurchaseOrderItemResponse purchaseOrderItemId(Long purchaseOrderItemId) {
    this.purchaseOrderItemId = purchaseOrderItemId;
    return this;
  }

   /**
   * Get purchaseOrderItemId
   * @return purchaseOrderItemId
  **/
  public Long getPurchaseOrderItemId() {
    return purchaseOrderItemId;
  }

  public void setPurchaseOrderItemId(Long purchaseOrderItemId) {
    this.purchaseOrderItemId = purchaseOrderItemId;
  }

  public PurchaseOrderItemResponse created(Long created) {
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

  public PurchaseOrderItemResponse updated(Long updated) {
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

  public PurchaseOrderItemResponse customer(AccountShortResponse customer) {
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

  public PurchaseOrderItemResponse orderItemType(String orderItemType) {
    this.orderItemType = orderItemType;
    return this;
  }

   /**
   * Get orderItemType
   * @return orderItemType
  **/
  public String getOrderItemType() {
    return orderItemType;
  }

  public void setOrderItemType(String orderItemType) {
    this.orderItemType = orderItemType;
  }

  public PurchaseOrderItemResponse orderItemId(Long orderItemId) {
    this.orderItemId = orderItemId;
    return this;
  }

   /**
   * Get orderItemId
   * @return orderItemId
  **/
  public Long getOrderItemId() {
    return orderItemId;
  }

  public void setOrderItemId(Long orderItemId) {
    this.orderItemId = orderItemId;
  }

  public PurchaseOrderItemResponse orderCustomType(String orderCustomType) {
    this.orderCustomType = orderCustomType;
    return this;
  }

   /**
   * Get orderCustomType
   * @return orderCustomType
  **/
  public String getOrderCustomType() {
    return orderCustomType;
  }

  public void setOrderCustomType(String orderCustomType) {
    this.orderCustomType = orderCustomType;
  }

  public PurchaseOrderItemResponse orderCustomId(String orderCustomId) {
    this.orderCustomId = orderCustomId;
    return this;
  }

   /**
   * Get orderCustomId
   * @return orderCustomId
  **/
  public String getOrderCustomId() {
    return orderCustomId;
  }

  public void setOrderCustomId(String orderCustomId) {
    this.orderCustomId = orderCustomId;
  }

  public PurchaseOrderItemResponse retailerLocationId(Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
    return this;
  }

   /**
   * Get retailerLocationId
   * @return retailerLocationId
  **/
  public Long getRetailerLocationId() {
    return retailerLocationId;
  }

  public void setRetailerLocationId(Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
  }

  public PurchaseOrderItemResponse amount(Double amount) {
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

  public PurchaseOrderItemResponse tax(Double tax) {
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

  public PurchaseOrderItemResponse comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public PurchaseOrderItemResponse returning(String returning) {
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
    PurchaseOrderItemResponse purchaseOrderItemResponse = (PurchaseOrderItemResponse) o;
    return Objects.equals(valid, purchaseOrderItemResponse.valid) &&
        Objects.equals(message, purchaseOrderItemResponse.message) &&
        Objects.equals(version, purchaseOrderItemResponse.version) &&
        Objects.equals(serializeNulls, purchaseOrderItemResponse.serializeNulls) &&
        Objects.equals(startTimeLog, purchaseOrderItemResponse.startTimeLog) &&
        Objects.equals(errorCode, purchaseOrderItemResponse.errorCode) &&
        Objects.equals(request, purchaseOrderItemResponse.request) &&
        Objects.equals(purchaseOrderItemId, purchaseOrderItemResponse.purchaseOrderItemId) &&
        Objects.equals(created, purchaseOrderItemResponse.created) &&
        Objects.equals(updated, purchaseOrderItemResponse.updated) &&
        Objects.equals(customer, purchaseOrderItemResponse.customer) &&
        Objects.equals(orderItemType, purchaseOrderItemResponse.orderItemType) &&
        Objects.equals(orderItemId, purchaseOrderItemResponse.orderItemId) &&
        Objects.equals(orderCustomType, purchaseOrderItemResponse.orderCustomType) &&
        Objects.equals(orderCustomId, purchaseOrderItemResponse.orderCustomId) &&
        Objects.equals(retailerLocationId, purchaseOrderItemResponse.retailerLocationId) &&
        Objects.equals(amount, purchaseOrderItemResponse.amount) &&
        Objects.equals(tax, purchaseOrderItemResponse.tax) &&
        Objects.equals(comment, purchaseOrderItemResponse.comment) &&
        Objects.equals(returning, purchaseOrderItemResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, purchaseOrderItemId, created, updated, customer, orderItemType, orderItemId, orderCustomType, orderCustomId, retailerLocationId, amount, tax, comment, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

