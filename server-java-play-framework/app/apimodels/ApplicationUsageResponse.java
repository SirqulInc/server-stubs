package apimodels;

import apimodels.BillableEntityResponse;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ApplicationUsageResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ApplicationUsageResponse   {
  @JsonProperty("billableEntity")
  @Valid

  private BillableEntityResponse billableEntity;

  @JsonProperty("applicationId")
  
  private Long applicationId;

  @JsonProperty("invoiceDate")
  @Valid

  private OffsetDateTime invoiceDate;

  @JsonProperty("balance")
  
  private Double balance;

  @JsonProperty("totalRequests")
  
  private Long totalRequests;

  @JsonProperty("totalDataStorage")
  
  private Long totalDataStorage;

  @JsonProperty("totalMediaStorage")
  
  private Long totalMediaStorage;

  @JsonProperty("totalNotifications")
  
  private Long totalNotifications;

  @JsonProperty("maxMissions")
  
  private Long maxMissions;

  @JsonProperty("maxVouchers")
  
  private Long maxVouchers;

  @JsonProperty("maxCoupons")
  
  private Long maxCoupons;

  @JsonProperty("maxProducts")
  
  private Long maxProducts;

  @JsonProperty("maxEvents")
  
  private Long maxEvents;

  @JsonProperty("maxMedia")
  
  private Long maxMedia;

  @JsonProperty("maxLocations")
  
  private Long maxLocations;

  public ApplicationUsageResponse billableEntity(BillableEntityResponse billableEntity) {
    this.billableEntity = billableEntity;
    return this;
  }

   /**
   * Get billableEntity
   * @return billableEntity
  **/
  public BillableEntityResponse getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(BillableEntityResponse billableEntity) {
    this.billableEntity = billableEntity;
  }

  public ApplicationUsageResponse applicationId(Long applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Get applicationId
   * @return applicationId
  **/
  public Long getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }

  public ApplicationUsageResponse invoiceDate(OffsetDateTime invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * Get invoiceDate
   * @return invoiceDate
  **/
  public OffsetDateTime getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(OffsetDateTime invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  public ApplicationUsageResponse balance(Double balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public ApplicationUsageResponse totalRequests(Long totalRequests) {
    this.totalRequests = totalRequests;
    return this;
  }

   /**
   * Get totalRequests
   * @return totalRequests
  **/
  public Long getTotalRequests() {
    return totalRequests;
  }

  public void setTotalRequests(Long totalRequests) {
    this.totalRequests = totalRequests;
  }

  public ApplicationUsageResponse totalDataStorage(Long totalDataStorage) {
    this.totalDataStorage = totalDataStorage;
    return this;
  }

   /**
   * Get totalDataStorage
   * @return totalDataStorage
  **/
  public Long getTotalDataStorage() {
    return totalDataStorage;
  }

  public void setTotalDataStorage(Long totalDataStorage) {
    this.totalDataStorage = totalDataStorage;
  }

  public ApplicationUsageResponse totalMediaStorage(Long totalMediaStorage) {
    this.totalMediaStorage = totalMediaStorage;
    return this;
  }

   /**
   * Get totalMediaStorage
   * @return totalMediaStorage
  **/
  public Long getTotalMediaStorage() {
    return totalMediaStorage;
  }

  public void setTotalMediaStorage(Long totalMediaStorage) {
    this.totalMediaStorage = totalMediaStorage;
  }

  public ApplicationUsageResponse totalNotifications(Long totalNotifications) {
    this.totalNotifications = totalNotifications;
    return this;
  }

   /**
   * Get totalNotifications
   * @return totalNotifications
  **/
  public Long getTotalNotifications() {
    return totalNotifications;
  }

  public void setTotalNotifications(Long totalNotifications) {
    this.totalNotifications = totalNotifications;
  }

  public ApplicationUsageResponse maxMissions(Long maxMissions) {
    this.maxMissions = maxMissions;
    return this;
  }

   /**
   * Get maxMissions
   * @return maxMissions
  **/
  public Long getMaxMissions() {
    return maxMissions;
  }

  public void setMaxMissions(Long maxMissions) {
    this.maxMissions = maxMissions;
  }

  public ApplicationUsageResponse maxVouchers(Long maxVouchers) {
    this.maxVouchers = maxVouchers;
    return this;
  }

   /**
   * Get maxVouchers
   * @return maxVouchers
  **/
  public Long getMaxVouchers() {
    return maxVouchers;
  }

  public void setMaxVouchers(Long maxVouchers) {
    this.maxVouchers = maxVouchers;
  }

  public ApplicationUsageResponse maxCoupons(Long maxCoupons) {
    this.maxCoupons = maxCoupons;
    return this;
  }

   /**
   * Get maxCoupons
   * @return maxCoupons
  **/
  public Long getMaxCoupons() {
    return maxCoupons;
  }

  public void setMaxCoupons(Long maxCoupons) {
    this.maxCoupons = maxCoupons;
  }

  public ApplicationUsageResponse maxProducts(Long maxProducts) {
    this.maxProducts = maxProducts;
    return this;
  }

   /**
   * Get maxProducts
   * @return maxProducts
  **/
  public Long getMaxProducts() {
    return maxProducts;
  }

  public void setMaxProducts(Long maxProducts) {
    this.maxProducts = maxProducts;
  }

  public ApplicationUsageResponse maxEvents(Long maxEvents) {
    this.maxEvents = maxEvents;
    return this;
  }

   /**
   * Get maxEvents
   * @return maxEvents
  **/
  public Long getMaxEvents() {
    return maxEvents;
  }

  public void setMaxEvents(Long maxEvents) {
    this.maxEvents = maxEvents;
  }

  public ApplicationUsageResponse maxMedia(Long maxMedia) {
    this.maxMedia = maxMedia;
    return this;
  }

   /**
   * Get maxMedia
   * @return maxMedia
  **/
  public Long getMaxMedia() {
    return maxMedia;
  }

  public void setMaxMedia(Long maxMedia) {
    this.maxMedia = maxMedia;
  }

  public ApplicationUsageResponse maxLocations(Long maxLocations) {
    this.maxLocations = maxLocations;
    return this;
  }

   /**
   * Get maxLocations
   * @return maxLocations
  **/
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
    return Objects.equals(billableEntity, applicationUsageResponse.billableEntity) &&
        Objects.equals(applicationId, applicationUsageResponse.applicationId) &&
        Objects.equals(invoiceDate, applicationUsageResponse.invoiceDate) &&
        Objects.equals(balance, applicationUsageResponse.balance) &&
        Objects.equals(totalRequests, applicationUsageResponse.totalRequests) &&
        Objects.equals(totalDataStorage, applicationUsageResponse.totalDataStorage) &&
        Objects.equals(totalMediaStorage, applicationUsageResponse.totalMediaStorage) &&
        Objects.equals(totalNotifications, applicationUsageResponse.totalNotifications) &&
        Objects.equals(maxMissions, applicationUsageResponse.maxMissions) &&
        Objects.equals(maxVouchers, applicationUsageResponse.maxVouchers) &&
        Objects.equals(maxCoupons, applicationUsageResponse.maxCoupons) &&
        Objects.equals(maxProducts, applicationUsageResponse.maxProducts) &&
        Objects.equals(maxEvents, applicationUsageResponse.maxEvents) &&
        Objects.equals(maxMedia, applicationUsageResponse.maxMedia) &&
        Objects.equals(maxLocations, applicationUsageResponse.maxLocations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billableEntity, applicationId, invoiceDate, balance, totalRequests, totalDataStorage, totalMediaStorage, totalNotifications, maxMissions, maxVouchers, maxCoupons, maxProducts, maxEvents, maxMedia, maxLocations);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

