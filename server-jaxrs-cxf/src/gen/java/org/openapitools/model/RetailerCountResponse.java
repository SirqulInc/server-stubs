package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RetailerCountResponse  {
  
  @ApiModelProperty(value = "")

  private Integer locations;

  @ApiModelProperty(value = "")

  private Integer transactions;

  @ApiModelProperty(value = "")

  private Integer offers;
 /**
   * Get locations
   * @return locations
  **/
  @JsonProperty("locations")
  public Integer getLocations() {
    return locations;
  }

  public void setLocations(Integer locations) {
    this.locations = locations;
  }

  public RetailerCountResponse locations(Integer locations) {
    this.locations = locations;
    return this;
  }

 /**
   * Get transactions
   * @return transactions
  **/
  @JsonProperty("transactions")
  public Integer getTransactions() {
    return transactions;
  }

  public void setTransactions(Integer transactions) {
    this.transactions = transactions;
  }

  public RetailerCountResponse transactions(Integer transactions) {
    this.transactions = transactions;
    return this;
  }

 /**
   * Get offers
   * @return offers
  **/
  @JsonProperty("offers")
  public Integer getOffers() {
    return offers;
  }

  public void setOffers(Integer offers) {
    this.offers = offers;
  }

  public RetailerCountResponse offers(Integer offers) {
    this.offers = offers;
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
    RetailerCountResponse retailerCountResponse = (RetailerCountResponse) o;
    return Objects.equals(this.locations, retailerCountResponse.locations) &&
        Objects.equals(this.transactions, retailerCountResponse.transactions) &&
        Objects.equals(this.offers, retailerCountResponse.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locations, transactions, offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailerCountResponse {\n");
    
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
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

