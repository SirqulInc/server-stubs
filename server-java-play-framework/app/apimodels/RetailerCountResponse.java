package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RetailerCountResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RetailerCountResponse   {
  @JsonProperty("locations")
  
  private Integer locations;

  @JsonProperty("transactions")
  
  private Integer transactions;

  @JsonProperty("offers")
  
  private Integer offers;

  public RetailerCountResponse locations(Integer locations) {
    this.locations = locations;
    return this;
  }

   /**
   * Get locations
   * @return locations
  **/
  public Integer getLocations() {
    return locations;
  }

  public void setLocations(Integer locations) {
    this.locations = locations;
  }

  public RetailerCountResponse transactions(Integer transactions) {
    this.transactions = transactions;
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  public Integer getTransactions() {
    return transactions;
  }

  public void setTransactions(Integer transactions) {
    this.transactions = transactions;
  }

  public RetailerCountResponse offers(Integer offers) {
    this.offers = offers;
    return this;
  }

   /**
   * Get offers
   * @return offers
  **/
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
    return Objects.equals(locations, retailerCountResponse.locations) &&
        Objects.equals(transactions, retailerCountResponse.transactions) &&
        Objects.equals(offers, retailerCountResponse.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locations, transactions, offers);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

