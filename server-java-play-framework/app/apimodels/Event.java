package apimodels;

import apimodels.Listing;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Event
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Event   {
  @JsonProperty("sponsered")
  
  private Boolean sponsered;

  @JsonProperty("listing")
  @Valid

  private Listing listing;

  public Event sponsered(Boolean sponsered) {
    this.sponsered = sponsered;
    return this;
  }

   /**
   * Get sponsered
   * @return sponsered
  **/
  public Boolean getSponsered() {
    return sponsered;
  }

  public void setSponsered(Boolean sponsered) {
    this.sponsered = sponsered;
  }

  public Event listing(Listing listing) {
    this.listing = listing;
    return this;
  }

   /**
   * Get listing
   * @return listing
  **/
  public Listing getListing() {
    return listing;
  }

  public void setListing(Listing listing) {
    this.listing = listing;
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
    return Objects.equals(sponsered, event.sponsered) &&
        Objects.equals(listing, event.listing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sponsered, listing);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

