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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PurchaseOrderItemResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private Long purchaseOrderItemId;
  private Long created;
  private Long updated;
  private AccountShortResponse customer;
  private String orderItemType;
  private Long orderItemId;
  private String orderCustomType;
  private String orderCustomId;
  private Long retailerLocationId;
  private Double amount;
  private Double tax;
  private String comment;
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
  @JsonProperty("purchaseOrderItemId")
  public Long getPurchaseOrderItemId() {
    return purchaseOrderItemId;
  }
  public void setPurchaseOrderItemId(Long purchaseOrderItemId) {
    this.purchaseOrderItemId = purchaseOrderItemId;
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
  @JsonProperty("orderItemType")
  public String getOrderItemType() {
    return orderItemType;
  }
  public void setOrderItemType(String orderItemType) {
    this.orderItemType = orderItemType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderItemId")
  public Long getOrderItemId() {
    return orderItemId;
  }
  public void setOrderItemId(Long orderItemId) {
    this.orderItemId = orderItemId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderCustomType")
  public String getOrderCustomType() {
    return orderCustomType;
  }
  public void setOrderCustomType(String orderCustomType) {
    this.orderCustomType = orderCustomType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderCustomId")
  public String getOrderCustomId() {
    return orderCustomId;
  }
  public void setOrderCustomId(String orderCustomId) {
    this.orderCustomId = orderCustomId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("retailerLocationId")
  public Long getRetailerLocationId() {
    return retailerLocationId;
  }
  public void setRetailerLocationId(Long retailerLocationId) {
    this.retailerLocationId = retailerLocationId;
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
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

