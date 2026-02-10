package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Listing;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Event   {
  
  private Boolean sponsered;
  private Listing listing;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sponsered")
  public Boolean getSponsered() {
    return sponsered;
  }
  public void setSponsered(Boolean sponsered) {
    this.sponsered = sponsered;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("listing")
  @Valid
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

