package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.OfferShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ReservationResponse   {
  
  private Long reservationId;
  private Long reservableId;
  private String reservableType;
  private AccountShortResponse account;
  private Long createdDate;
  private Long updatedDate;
  private Long startDate;
  private Long endDate;
  private OfferShortResponse transaction;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("reservationId")
  public Long getReservationId() {
    return reservationId;
  }
  public void setReservationId(Long reservationId) {
    this.reservationId = reservationId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("reservableId")
  public Long getReservableId() {
    return reservableId;
  }
  public void setReservableId(Long reservableId) {
    this.reservableId = reservableId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("reservableType")
  public String getReservableType() {
    return reservableType;
  }
  public void setReservableType(String reservableType) {
    this.reservableType = reservableType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("account")
  @Valid
  public AccountShortResponse getAccount() {
    return account;
  }
  public void setAccount(AccountShortResponse account) {
    this.account = account;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("createdDate")
  public Long getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("updatedDate")
  public Long getUpdatedDate() {
    return updatedDate;
  }
  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startDate")
  public Long getStartDate() {
    return startDate;
  }
  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }
  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("transaction")
  @Valid
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

