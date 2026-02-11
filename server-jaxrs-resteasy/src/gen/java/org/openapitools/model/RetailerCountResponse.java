package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RetailerCountResponse   {
  
  private Integer locations;
  private Integer transactions;
  private Integer offers;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locations")
  public Integer getLocations() {
    return locations;
  }
  public void setLocations(Integer locations) {
    this.locations = locations;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("transactions")
  public Integer getTransactions() {
    return transactions;
  }
  public void setTransactions(Integer transactions) {
    this.transactions = transactions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offers")
  public Integer getOffers() {
    return offers;
  }
  public void setOffers(Integer offers) {
    this.offers = offers;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

