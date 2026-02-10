package org.openapitools.model;

import org.openapitools.model.ListingResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EventResponse  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ListingResponse listing;
 /**
   * Get listing
   * @return listing
  **/
  @JsonProperty("listing")
  public ListingResponse getListing() {
    return listing;
  }

  public void setListing(ListingResponse listing) {
    this.listing = listing;
  }

  public EventResponse listing(ListingResponse listing) {
    this.listing = listing;
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
    EventResponse eventResponse = (EventResponse) o;
    return Objects.equals(this.listing, eventResponse.listing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventResponse {\n");
    
    sb.append("    listing: ").append(toIndentedString(listing)).append("\n");
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

