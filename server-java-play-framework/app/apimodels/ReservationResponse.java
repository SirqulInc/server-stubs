package apimodels;

import apimodels.AccountShortResponse;
import apimodels.OfferShortResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ReservationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ReservationResponse   {
  @JsonProperty("reservationId")
  
  private Long reservationId;

  @JsonProperty("reservableId")
  
  private Long reservableId;

  @JsonProperty("reservableType")
  
  private String reservableType;

  @JsonProperty("account")
  @Valid

  private AccountShortResponse account;

  @JsonProperty("createdDate")
  
  private Long createdDate;

  @JsonProperty("updatedDate")
  
  private Long updatedDate;

  @JsonProperty("startDate")
  
  private Long startDate;

  @JsonProperty("endDate")
  
  private Long endDate;

  @JsonProperty("transaction")
  @Valid

  private OfferShortResponse transaction;

  public ReservationResponse reservationId(Long reservationId) {
    this.reservationId = reservationId;
    return this;
  }

   /**
   * Get reservationId
   * @return reservationId
  **/
  public Long getReservationId() {
    return reservationId;
  }

  public void setReservationId(Long reservationId) {
    this.reservationId = reservationId;
  }

  public ReservationResponse reservableId(Long reservableId) {
    this.reservableId = reservableId;
    return this;
  }

   /**
   * Get reservableId
   * @return reservableId
  **/
  public Long getReservableId() {
    return reservableId;
  }

  public void setReservableId(Long reservableId) {
    this.reservableId = reservableId;
  }

  public ReservationResponse reservableType(String reservableType) {
    this.reservableType = reservableType;
    return this;
  }

   /**
   * Get reservableType
   * @return reservableType
  **/
  public String getReservableType() {
    return reservableType;
  }

  public void setReservableType(String reservableType) {
    this.reservableType = reservableType;
  }

  public ReservationResponse account(AccountShortResponse account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  public AccountShortResponse getAccount() {
    return account;
  }

  public void setAccount(AccountShortResponse account) {
    this.account = account;
  }

  public ReservationResponse createdDate(Long createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  public Long getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  public ReservationResponse updatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

   /**
   * Get updatedDate
   * @return updatedDate
  **/
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  public ReservationResponse startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public ReservationResponse endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public ReservationResponse transaction(OfferShortResponse transaction) {
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  public OfferShortResponse getTransaction() {
    return transaction;
  }

  public void setTransaction(OfferShortResponse transaction) {
    this.transaction = transaction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservationResponse reservationResponse = (ReservationResponse) o;
    return Objects.equals(reservationId, reservationResponse.reservationId) &&
        Objects.equals(reservableId, reservationResponse.reservableId) &&
        Objects.equals(reservableType, reservationResponse.reservableType) &&
        Objects.equals(account, reservationResponse.account) &&
        Objects.equals(createdDate, reservationResponse.createdDate) &&
        Objects.equals(updatedDate, reservationResponse.updatedDate) &&
        Objects.equals(startDate, reservationResponse.startDate) &&
        Objects.equals(endDate, reservationResponse.endDate) &&
        Objects.equals(transaction, reservationResponse.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reservationId, reservableId, reservableType, account, createdDate, updatedDate, startDate, endDate, transaction);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationResponse {\n");
    
    sb.append("    reservationId: ").append(toIndentedString(reservationId)).append("\n");
    sb.append("    reservableId: ").append(toIndentedString(reservableId)).append("\n");
    sb.append("    reservableType: ").append(toIndentedString(reservableType)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

