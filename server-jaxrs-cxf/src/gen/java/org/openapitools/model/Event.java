package org.openapitools.model;

import org.openapitools.model.Listing;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Event  {
  
  @ApiModelProperty(value = "")

  private Boolean sponsered;

  @ApiModelProperty(value = "")

  @Valid

  private Listing listing;
 /**
   * Get sponsered
   * @return sponsered
  **/
  @JsonProperty("sponsered")
  public Boolean getSponsered() {
    return sponsered;
  }

  public void setSponsered(Boolean sponsered) {
    this.sponsered = sponsered;
  }

  public Event sponsered(Boolean sponsered) {
    this.sponsered = sponsered;
    return this;
  }

 /**
   * Get listing
   * @return listing
  **/
  @JsonProperty("listing")
  public Listing getListing() {
    return listing;
  }

  public void setListing(Listing listing) {
    this.listing = listing;
  }

  public Event listing(Listing listing) {
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
    Event event = (Event) o;
    return Objects.equals(this.sponsered, event.sponsered) &&
        Objects.equals(this.listing, event.listing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sponsered, listing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    sponsered: ").append(toIndentedString(sponsered)).append("\n");
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

