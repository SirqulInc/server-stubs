package org.openapitools.model;

import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.OfferShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ReservationResponse  {
  
  @ApiModelProperty(value = "")

  private Long reservationId;

  @ApiModelProperty(value = "")

  private Long reservableId;

  @ApiModelProperty(value = "")

  private String reservableType;

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse account;

  @ApiModelProperty(value = "")

  private Long createdDate;

  @ApiModelProperty(value = "")

  private Long updatedDate;

  @ApiModelProperty(value = "")

  private Long startDate;

  @ApiModelProperty(value = "")

  private Long endDate;

  @ApiModelProperty(value = "")

  @Valid

  private OfferShortResponse transaction;
 /**
   * Get reservationId
   * @return reservationId
  **/
  @JsonProperty("reservationId")
  public Long getReservationId() {
    return reservationId;
  }

  public void setReservationId(Long reservationId) {
    this.reservationId = reservationId;
  }

  public ReservationResponse reservationId(Long reservationId) {
    this.reservationId = reservationId;
    return this;
  }

 /**
   * Get reservableId
   * @return reservableId
  **/
  @JsonProperty("reservableId")
  public Long getReservableId() {
    return reservableId;
  }

  public void setReservableId(Long reservableId) {
    this.reservableId = reservableId;
  }

  public ReservationResponse reservableId(Long reservableId) {
    this.reservableId = reservableId;
    return this;
  }

 /**
   * Get reservableType
   * @return reservableType
  **/
  @JsonProperty("reservableType")
  public String getReservableType() {
    return reservableType;
  }

  public void setReservableType(String reservableType) {
    this.reservableType = reservableType;
  }

  public ReservationResponse reservableType(String reservableType) {
    this.reservableType = reservableType;
    return this;
  }

 /**
   * Get account
   * @return account
  **/
  @JsonProperty("account")
  public AccountShortResponse getAccount() {
    return account;
  }

  public void setAccount(AccountShortResponse account) {
    this.account = account;
  }

  public ReservationResponse account(AccountShortResponse account) {
    this.account = account;
    return this;
  }

 /**
   * Get createdDate
   * @return createdDate
  **/
  @JsonProperty("createdDate")
  public Long getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  public ReservationResponse createdDate(Long createdDate) {
    this.createdDate = createdDate;
    return this;
  }

 /**
   * Get updatedDate
   * @return updatedDate
  **/
  @JsonProperty("updatedDate")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  public ReservationResponse updatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

 /**
   * Get startDate
   * @return startDate
  **/
  @JsonProperty("startDate")
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public ReservationResponse startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * Get endDate
   * @return endDate
  **/
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public ReservationResponse endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * Get transaction
   * @return transaction
  **/
  @JsonProperty("transaction")
  public OfferShortResponse getTransaction() {
    return transaction;
  }

  public void setTransaction(OfferShortResponse transaction) {
    this.transaction = transaction;
  }

  public ReservationResponse transaction(OfferShortResponse transaction) {
    this.transaction = transaction;
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
    ReservationResponse reservationResponse = (ReservationResponse) o;
    return Objects.equals(this.reservationId, reservationResponse.reservationId) &&
        Objects.equals(this.reservableId, reservationResponse.reservableId) &&
        Objects.equals(this.reservableType, reservationResponse.reservableType) &&
        Objects.equals(this.account, reservationResponse.account) &&
        Objects.equals(this.createdDate, reservationResponse.createdDate) &&
        Objects.equals(this.updatedDate, reservationResponse.updatedDate) &&
        Objects.equals(this.startDate, reservationResponse.startDate) &&
        Objects.equals(this.endDate, reservationResponse.endDate) &&
        Objects.equals(this.transaction, reservationResponse.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reservationId, reservableId, reservableType, account, createdDate, updatedDate, startDate, endDate, transaction);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

