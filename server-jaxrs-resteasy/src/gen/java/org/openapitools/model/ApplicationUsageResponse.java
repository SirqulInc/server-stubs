package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.BillableEntityResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ApplicationUsageResponse   {
  
  private BillableEntityResponse billableEntity;
  private Long applicationId;
  private Date invoiceDate;
  private Double balance;
  private Long totalRequests;
  private Long totalDataStorage;
  private Long totalMediaStorage;
  private Long totalNotifications;
  private Long maxMissions;
  private Long maxVouchers;
  private Long maxCoupons;
  private Long maxProducts;
  private Long maxEvents;
  private Long maxMedia;
  private Long maxLocations;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billableEntity")
  @Valid
  public BillableEntityResponse getBillableEntity() {
    return billableEntity;
  }
  public void setBillableEntity(BillableEntityResponse billableEntity) {
    this.billableEntity = billableEntity;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("applicationId")
  public Long getApplicationId() {
    return applicationId;
  }
  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("invoiceDate")
  public Date getInvoiceDate() {
    return invoiceDate;
  }
  public void setInvoiceDate(Date invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("balance")
  public Double getBalance() {
    return balance;
  }
  public void setBalance(Double balance) {
    this.balance = balance;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalRequests")
  public Long getTotalRequests() {
    return totalRequests;
  }
  public void setTotalRequests(Long totalRequests) {
    this.totalRequests = totalRequests;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalDataStorage")
  public Long getTotalDataStorage() {
    return totalDataStorage;
  }
  public void setTotalDataStorage(Long totalDataStorage) {
    this.totalDataStorage = totalDataStorage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalMediaStorage")
  public Long getTotalMediaStorage() {
    return totalMediaStorage;
  }
  public void setTotalMediaStorage(Long totalMediaStorage) {
    this.totalMediaStorage = totalMediaStorage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalNotifications")
  public Long getTotalNotifications() {
    return totalNotifications;
  }
  public void setTotalNotifications(Long totalNotifications) {
    this.totalNotifications = totalNotifications;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxMissions")
  public Long getMaxMissions() {
    return maxMissions;
  }
  public void setMaxMissions(Long maxMissions) {
    this.maxMissions = maxMissions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxVouchers")
  public Long getMaxVouchers() {
    return maxVouchers;
  }
  public void setMaxVouchers(Long maxVouchers) {
    this.maxVouchers = maxVouchers;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxCoupons")
  public Long getMaxCoupons() {
    return maxCoupons;
  }
  public void setMaxCoupons(Long maxCoupons) {
    this.maxCoupons = maxCoupons;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxProducts")
  public Long getMaxProducts() {
    return maxProducts;
  }
  public void setMaxProducts(Long maxProducts) {
    this.maxProducts = maxProducts;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxEvents")
  public Long getMaxEvents() {
    return maxEvents;
  }
  public void setMaxEvents(Long maxEvents) {
    this.maxEvents = maxEvents;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxMedia")
  public Long getMaxMedia() {
    return maxMedia;
  }
  public void setMaxMedia(Long maxMedia) {
    this.maxMedia = maxMedia;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxLocations")
  public Long getMaxLocations() {
    return maxLocations;
  }
  public void setMaxLocations(Long maxLocations) {
    this.maxLocations = maxLocations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationUsageResponse applicationUsageResponse = (ApplicationUsageResponse) o;
    return Objects.equals(this.billableEntity, applicationUsageResponse.billableEntity) &&
        Objects.equals(this.applicationId, applicationUsageResponse.applicationId) &&
        Objects.equals(this.invoiceDate, applicationUsageResponse.invoiceDate) &&
        Objects.equals(this.balance, applicationUsageResponse.balance) &&
        Objects.equals(this.totalRequests, applicationUsageResponse.totalRequests) &&
        Objects.equals(this.totalDataStorage, applicationUsageResponse.totalDataStorage) &&
        Objects.equals(this.totalMediaStorage, applicationUsageResponse.totalMediaStorage) &&
        Objects.equals(this.totalNotifications, applicationUsageResponse.totalNotifications) &&
        Objects.equals(this.maxMissions, applicationUsageResponse.maxMissions) &&
        Objects.equals(this.maxVouchers, applicationUsageResponse.maxVouchers) &&
        Objects.equals(this.maxCoupons, applicationUsageResponse.maxCoupons) &&
        Objects.equals(this.maxProducts, applicationUsageResponse.maxProducts) &&
        Objects.equals(this.maxEvents, applicationUsageResponse.maxEvents) &&
        Objects.equals(this.maxMedia, applicationUsageResponse.maxMedia) &&
        Objects.equals(this.maxLocations, applicationUsageResponse.maxLocations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billableEntity, applicationId, invoiceDate, balance, totalRequests, totalDataStorage, totalMediaStorage, totalNotifications, maxMissions, maxVouchers, maxCoupons, maxProducts, maxEvents, maxMedia, maxLocations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationUsageResponse {\n");
    
    sb.append("    billableEntity: ").append(toIndentedString(billableEntity)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    totalRequests: ").append(toIndentedString(totalRequests)).append("\n");
    sb.append("    totalDataStorage: ").append(toIndentedString(totalDataStorage)).append("\n");
    sb.append("    totalMediaStorage: ").append(toIndentedString(totalMediaStorage)).append("\n");
    sb.append("    totalNotifications: ").append(toIndentedString(totalNotifications)).append("\n");
    sb.append("    maxMissions: ").append(toIndentedString(maxMissions)).append("\n");
    sb.append("    maxVouchers: ").append(toIndentedString(maxVouchers)).append("\n");
    sb.append("    maxCoupons: ").append(toIndentedString(maxCoupons)).append("\n");
    sb.append("    maxProducts: ").append(toIndentedString(maxProducts)).append("\n");
    sb.append("    maxEvents: ").append(toIndentedString(maxEvents)).append("\n");
    sb.append("    maxMedia: ").append(toIndentedString(maxMedia)).append("\n");
    sb.append("    maxLocations: ").append(toIndentedString(maxLocations)).append("\n");
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

