package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.OfferShortResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ReservationResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ReservationResponse {

  private @Nullable Long reservationId;

  private @Nullable Long reservableId;

  private @Nullable String reservableType;

  private @Nullable AccountShortResponse account;

  private @Nullable Long createdDate;

  private @Nullable Long updatedDate;

  private @Nullable Long startDate;

  private @Nullable Long endDate;

  private @Nullable OfferShortResponse transaction;

  public ReservationResponse reservationId(@Nullable Long reservationId) {
    this.reservationId = reservationId;
    return this;
  }

  /**
   * Get reservationId
   * @return reservationId
   */
  
  @Schema(name = "reservationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reservationId")
  public @Nullable Long getReservationId() {
    return reservationId;
  }

  public void setReservationId(@Nullable Long reservationId) {
    this.reservationId = reservationId;
  }

  public ReservationResponse reservableId(@Nullable Long reservableId) {
    this.reservableId = reservableId;
    return this;
  }

  /**
   * Get reservableId
   * @return reservableId
   */
  
  @Schema(name = "reservableId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reservableId")
  public @Nullable Long getReservableId() {
    return reservableId;
  }

  public void setReservableId(@Nullable Long reservableId) {
    this.reservableId = reservableId;
  }

  public ReservationResponse reservableType(@Nullable String reservableType) {
    this.reservableType = reservableType;
    return this;
  }

  /**
   * Get reservableType
   * @return reservableType
   */
  
  @Schema(name = "reservableType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reservableType")
  public @Nullable String getReservableType() {
    return reservableType;
  }

  public void setReservableType(@Nullable String reservableType) {
    this.reservableType = reservableType;
  }

  public ReservationResponse account(@Nullable AccountShortResponse account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
   */
  @Valid 
  @Schema(name = "account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("account")
  public @Nullable AccountShortResponse getAccount() {
    return account;
  }

  public void setAccount(@Nullable AccountShortResponse account) {
    this.account = account;
  }

  public ReservationResponse createdDate(@Nullable Long createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
   */
  
  @Schema(name = "createdDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdDate")
  public @Nullable Long getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(@Nullable Long createdDate) {
    this.createdDate = createdDate;
  }

  public ReservationResponse updatedDate(@Nullable Long updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

  /**
   * Get updatedDate
   * @return updatedDate
   */
  
  @Schema(name = "updatedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedDate")
  public @Nullable Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(@Nullable Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  public ReservationResponse startDate(@Nullable Long startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public @Nullable Long getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable Long startDate) {
    this.startDate = startDate;
  }

  public ReservationResponse endDate(@Nullable Long endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  
  @Schema(name = "endDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public @Nullable Long getEndDate() {
    return endDate;
  }

  public void setEndDate(@Nullable Long endDate) {
    this.endDate = endDate;
  }

  public ReservationResponse transaction(@Nullable OfferShortResponse transaction) {
    this.transaction = transaction;
    return this;
  }

  /**
   * Get transaction
   * @return transaction
   */
  @Valid 
  @Schema(name = "transaction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transaction")
  public @Nullable OfferShortResponse getTransaction() {
    return transaction;
  }

  public void setTransaction(@Nullable OfferShortResponse transaction) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

