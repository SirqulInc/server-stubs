package org.openapitools.model;

import java.util.Date;
import org.openapitools.model.BillableEntityResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ApplicationUsageResponse  {
  
  @ApiModelProperty(value = "")

  @Valid

  private BillableEntityResponse billableEntity;

  @ApiModelProperty(value = "")

  private Long applicationId;

  @ApiModelProperty(value = "")

  private Date invoiceDate;

  @ApiModelProperty(value = "")

  private Double balance;

  @ApiModelProperty(value = "")

  private Long totalRequests;

  @ApiModelProperty(value = "")

  private Long totalDataStorage;

  @ApiModelProperty(value = "")

  private Long totalMediaStorage;

  @ApiModelProperty(value = "")

  private Long totalNotifications;

  @ApiModelProperty(value = "")

  private Long maxMissions;

  @ApiModelProperty(value = "")

  private Long maxVouchers;

  @ApiModelProperty(value = "")

  private Long maxCoupons;

  @ApiModelProperty(value = "")

  private Long maxProducts;

  @ApiModelProperty(value = "")

  private Long maxEvents;

  @ApiModelProperty(value = "")

  private Long maxMedia;

  @ApiModelProperty(value = "")

  private Long maxLocations;
 /**
   * Get billableEntity
   * @return billableEntity
  **/
  @JsonProperty("billableEntity")
  public BillableEntityResponse getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(BillableEntityResponse billableEntity) {
    this.billableEntity = billableEntity;
  }

  public ApplicationUsageResponse billableEntity(BillableEntityResponse billableEntity) {
    this.billableEntity = billableEntity;
    return this;
  }

 /**
   * Get applicationId
   * @return applicationId
  **/
  @JsonProperty("applicationId")
  public Long getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }

  public ApplicationUsageResponse applicationId(Long applicationId) {
    this.applicationId = applicationId;
    return this;
  }

 /**
   * Get invoiceDate
   * @return invoiceDate
  **/
  @JsonProperty("invoiceDate")
  public Date getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(Date invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  public ApplicationUsageResponse invoiceDate(Date invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

 /**
   * Get balance
   * @return balance
  **/
  @JsonProperty("balance")
  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public ApplicationUsageResponse balance(Double balance) {
    this.balance = balance;
    return this;
  }

 /**
   * Get totalRequests
   * @return totalRequests
  **/
  @JsonProperty("totalRequests")
  public Long getTotalRequests() {
    return totalRequests;
  }

  public void setTotalRequests(Long totalRequests) {
    this.totalRequests = totalRequests;
  }

  public ApplicationUsageResponse totalRequests(Long totalRequests) {
    this.totalRequests = totalRequests;
    return this;
  }

 /**
   * Get totalDataStorage
   * @return totalDataStorage
  **/
  @JsonProperty("totalDataStorage")
  public Long getTotalDataStorage() {
    return totalDataStorage;
  }

  public void setTotalDataStorage(Long totalDataStorage) {
    this.totalDataStorage = totalDataStorage;
  }

  public ApplicationUsageResponse totalDataStorage(Long totalDataStorage) {
    this.totalDataStorage = totalDataStorage;
    return this;
  }

 /**
   * Get totalMediaStorage
   * @return totalMediaStorage
  **/
  @JsonProperty("totalMediaStorage")
  public Long getTotalMediaStorage() {
    return totalMediaStorage;
  }

  public void setTotalMediaStorage(Long totalMediaStorage) {
    this.totalMediaStorage = totalMediaStorage;
  }

  public ApplicationUsageResponse totalMediaStorage(Long totalMediaStorage) {
    this.totalMediaStorage = totalMediaStorage;
    return this;
  }

 /**
   * Get totalNotifications
   * @return totalNotifications
  **/
  @JsonProperty("totalNotifications")
  public Long getTotalNotifications() {
    return totalNotifications;
  }

  public void setTotalNotifications(Long totalNotifications) {
    this.totalNotifications = totalNotifications;
  }

  public ApplicationUsageResponse totalNotifications(Long totalNotifications) {
    this.totalNotifications = totalNotifications;
    return this;
  }

 /**
   * Get maxMissions
   * @return maxMissions
  **/
  @JsonProperty("maxMissions")
  public Long getMaxMissions() {
    return maxMissions;
  }

  public void setMaxMissions(Long maxMissions) {
    this.maxMissions = maxMissions;
  }

  public ApplicationUsageResponse maxMissions(Long maxMissions) {
    this.maxMissions = maxMissions;
    return this;
  }

 /**
   * Get maxVouchers
   * @return maxVouchers
  **/
  @JsonProperty("maxVouchers")
  public Long getMaxVouchers() {
    return maxVouchers;
  }

  public void setMaxVouchers(Long maxVouchers) {
    this.maxVouchers = maxVouchers;
  }

  public ApplicationUsageResponse maxVouchers(Long maxVouchers) {
    this.maxVouchers = maxVouchers;
    return this;
  }

 /**
   * Get maxCoupons
   * @return maxCoupons
  **/
  @JsonProperty("maxCoupons")
  public Long getMaxCoupons() {
    return maxCoupons;
  }

  public void setMaxCoupons(Long maxCoupons) {
    this.maxCoupons = maxCoupons;
  }

  public ApplicationUsageResponse maxCoupons(Long maxCoupons) {
    this.maxCoupons = maxCoupons;
    return this;
  }

 /**
   * Get maxProducts
   * @return maxProducts
  **/
  @JsonProperty("maxProducts")
  public Long getMaxProducts() {
    return maxProducts;
  }

  public void setMaxProducts(Long maxProducts) {
    this.maxProducts = maxProducts;
  }

  public ApplicationUsageResponse maxProducts(Long maxProducts) {
    this.maxProducts = maxProducts;
    return this;
  }

 /**
   * Get maxEvents
   * @return maxEvents
  **/
  @JsonProperty("maxEvents")
  public Long getMaxEvents() {
    return maxEvents;
  }

  public void setMaxEvents(Long maxEvents) {
    this.maxEvents = maxEvents;
  }

  public ApplicationUsageResponse maxEvents(Long maxEvents) {
    this.maxEvents = maxEvents;
    return this;
  }

 /**
   * Get maxMedia
   * @return maxMedia
  **/
  @JsonProperty("maxMedia")
  public Long getMaxMedia() {
    return maxMedia;
  }

  public void setMaxMedia(Long maxMedia) {
    this.maxMedia = maxMedia;
  }

  public ApplicationUsageResponse maxMedia(Long maxMedia) {
    this.maxMedia = maxMedia;
    return this;
  }

 /**
   * Get maxLocations
   * @return maxLocations
  **/
  @JsonProperty("maxLocations")
  public Long getMaxLocations() {
    return maxLocations;
  }

  public void setMaxLocations(Long maxLocations) {
    this.maxLocations = maxLocations;
  }

  public ApplicationUsageResponse maxLocations(Long maxLocations) {
    this.maxLocations = maxLocations;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

