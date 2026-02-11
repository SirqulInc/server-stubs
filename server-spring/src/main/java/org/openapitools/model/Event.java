package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Listing;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Event
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Event {

  private @Nullable Boolean sponsered;

  private @Nullable Listing listing;

  public Event sponsered(@Nullable Boolean sponsered) {
    this.sponsered = sponsered;
    return this;
  }

  /**
   * Get sponsered
   * @return sponsered
   */
  
  @Schema(name = "sponsered", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sponsered")
  public @Nullable Boolean getSponsered() {
    return sponsered;
  }

  public void setSponsered(@Nullable Boolean sponsered) {
    this.sponsered = sponsered;
  }

  public Event listing(@Nullable Listing listing) {
    this.listing = listing;
    return this;
  }

  /**
   * Get listing
   * @return listing
   */
  @Valid 
  @Schema(name = "listing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("listing")
  public @Nullable Listing getListing() {
    return listing;
  }

  public void setListing(@Nullable Listing listing) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

