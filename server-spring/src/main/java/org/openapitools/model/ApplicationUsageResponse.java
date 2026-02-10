package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.openapitools.model.BillableEntityResponse;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ApplicationUsageResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ApplicationUsageResponse {

  private @Nullable BillableEntityResponse billableEntity;

  private @Nullable Long applicationId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime invoiceDate;

  private @Nullable Double balance;

  private @Nullable Long totalRequests;

  private @Nullable Long totalDataStorage;

  private @Nullable Long totalMediaStorage;

  private @Nullable Long totalNotifications;

  private @Nullable Long maxMissions;

  private @Nullable Long maxVouchers;

  private @Nullable Long maxCoupons;

  private @Nullable Long maxProducts;

  private @Nullable Long maxEvents;

  private @Nullable Long maxMedia;

  private @Nullable Long maxLocations;

  public ApplicationUsageResponse billableEntity(@Nullable BillableEntityResponse billableEntity) {
    this.billableEntity = billableEntity;
    return this;
  }

  /**
   * Get billableEntity
   * @return billableEntity
   */
  @Valid 
  @Schema(name = "billableEntity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billableEntity")
  public @Nullable BillableEntityResponse getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(@Nullable BillableEntityResponse billableEntity) {
    this.billableEntity = billableEntity;
  }

  public ApplicationUsageResponse applicationId(@Nullable Long applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * Get applicationId
   * @return applicationId
   */
  
  @Schema(name = "applicationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("applicationId")
  public @Nullable Long getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(@Nullable Long applicationId) {
    this.applicationId = applicationId;
  }

  public ApplicationUsageResponse invoiceDate(@Nullable OffsetDateTime invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

  /**
   * Get invoiceDate
   * @return invoiceDate
   */
  @Valid 
  @Schema(name = "invoiceDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invoiceDate")
  public @Nullable OffsetDateTime getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(@Nullable OffsetDateTime invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  public ApplicationUsageResponse balance(@Nullable Double balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
   */
  
  @Schema(name = "balance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balance")
  public @Nullable Double getBalance() {
    return balance;
  }

  public void setBalance(@Nullable Double balance) {
    this.balance = balance;
  }

  public ApplicationUsageResponse totalRequests(@Nullable Long totalRequests) {
    this.totalRequests = totalRequests;
    return this;
  }

  /**
   * Get totalRequests
   * @return totalRequests
   */
  
  @Schema(name = "totalRequests", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalRequests")
  public @Nullable Long getTotalRequests() {
    return totalRequests;
  }

  public void setTotalRequests(@Nullable Long totalRequests) {
    this.totalRequests = totalRequests;
  }

  public ApplicationUsageResponse totalDataStorage(@Nullable Long totalDataStorage) {
    this.totalDataStorage = totalDataStorage;
    return this;
  }

  /**
   * Get totalDataStorage
   * @return totalDataStorage
   */
  
  @Schema(name = "totalDataStorage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalDataStorage")
  public @Nullable Long getTotalDataStorage() {
    return totalDataStorage;
  }

  public void setTotalDataStorage(@Nullable Long totalDataStorage) {
    this.totalDataStorage = totalDataStorage;
  }

  public ApplicationUsageResponse totalMediaStorage(@Nullable Long totalMediaStorage) {
    this.totalMediaStorage = totalMediaStorage;
    return this;
  }

  /**
   * Get totalMediaStorage
   * @return totalMediaStorage
   */
  
  @Schema(name = "totalMediaStorage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalMediaStorage")
  public @Nullable Long getTotalMediaStorage() {
    return totalMediaStorage;
  }

  public void setTotalMediaStorage(@Nullable Long totalMediaStorage) {
    this.totalMediaStorage = totalMediaStorage;
  }

  public ApplicationUsageResponse totalNotifications(@Nullable Long totalNotifications) {
    this.totalNotifications = totalNotifications;
    return this;
  }

  /**
   * Get totalNotifications
   * @return totalNotifications
   */
  
  @Schema(name = "totalNotifications", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalNotifications")
  public @Nullable Long getTotalNotifications() {
    return totalNotifications;
  }

  public void setTotalNotifications(@Nullable Long totalNotifications) {
    this.totalNotifications = totalNotifications;
  }

  public ApplicationUsageResponse maxMissions(@Nullable Long maxMissions) {
    this.maxMissions = maxMissions;
    return this;
  }

  /**
   * Get maxMissions
   * @return maxMissions
   */
  
  @Schema(name = "maxMissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxMissions")
  public @Nullable Long getMaxMissions() {
    return maxMissions;
  }

  public void setMaxMissions(@Nullable Long maxMissions) {
    this.maxMissions = maxMissions;
  }

  public ApplicationUsageResponse maxVouchers(@Nullable Long maxVouchers) {
    this.maxVouchers = maxVouchers;
    return this;
  }

  /**
   * Get maxVouchers
   * @return maxVouchers
   */
  
  @Schema(name = "maxVouchers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxVouchers")
  public @Nullable Long getMaxVouchers() {
    return maxVouchers;
  }

  public void setMaxVouchers(@Nullable Long maxVouchers) {
    this.maxVouchers = maxVouchers;
  }

  public ApplicationUsageResponse maxCoupons(@Nullable Long maxCoupons) {
    this.maxCoupons = maxCoupons;
    return this;
  }

  /**
   * Get maxCoupons
   * @return maxCoupons
   */
  
  @Schema(name = "maxCoupons", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxCoupons")
  public @Nullable Long getMaxCoupons() {
    return maxCoupons;
  }

  public void setMaxCoupons(@Nullable Long maxCoupons) {
    this.maxCoupons = maxCoupons;
  }

  public ApplicationUsageResponse maxProducts(@Nullable Long maxProducts) {
    this.maxProducts = maxProducts;
    return this;
  }

  /**
   * Get maxProducts
   * @return maxProducts
   */
  
  @Schema(name = "maxProducts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxProducts")
  public @Nullable Long getMaxProducts() {
    return maxProducts;
  }

  public void setMaxProducts(@Nullable Long maxProducts) {
    this.maxProducts = maxProducts;
  }

  public ApplicationUsageResponse maxEvents(@Nullable Long maxEvents) {
    this.maxEvents = maxEvents;
    return this;
  }

  /**
   * Get maxEvents
   * @return maxEvents
   */
  
  @Schema(name = "maxEvents", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxEvents")
  public @Nullable Long getMaxEvents() {
    return maxEvents;
  }

  public void setMaxEvents(@Nullable Long maxEvents) {
    this.maxEvents = maxEvents;
  }

  public ApplicationUsageResponse maxMedia(@Nullable Long maxMedia) {
    this.maxMedia = maxMedia;
    return this;
  }

  /**
   * Get maxMedia
   * @return maxMedia
   */
  
  @Schema(name = "maxMedia", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxMedia")
  public @Nullable Long getMaxMedia() {
    return maxMedia;
  }

  public void setMaxMedia(@Nullable Long maxMedia) {
    this.maxMedia = maxMedia;
  }

  public ApplicationUsageResponse maxLocations(@Nullable Long maxLocations) {
    this.maxLocations = maxLocations;
    return this;
  }

  /**
   * Get maxLocations
   * @return maxLocations
   */
  
  @Schema(name = "maxLocations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxLocations")
  public @Nullable Long getMaxLocations() {
    return maxLocations;
  }

  public void setMaxLocations(@Nullable Long maxLocations) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

