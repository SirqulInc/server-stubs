package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CategoryResponse;
import org.openapitools.model.ListingResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ListingGroupResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ListingGroupResponse {

  private @Nullable CategoryResponse category;

  @Valid
  private List<@Valid ListingResponse> listings = new ArrayList<>();

  public ListingGroupResponse category(@Nullable CategoryResponse category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
   */
  @Valid 
  @Schema(name = "category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public @Nullable CategoryResponse getCategory() {
    return category;
  }

  public void setCategory(@Nullable CategoryResponse category) {
    this.category = category;
  }

  public ListingGroupResponse listings(List<@Valid ListingResponse> listings) {
    this.listings = listings;
    return this;
  }

  public ListingGroupResponse addListingsItem(ListingResponse listingsItem) {
    if (this.listings == null) {
      this.listings = new ArrayList<>();
    }
    this.listings.add(listingsItem);
    return this;
  }

  /**
   * Get listings
   * @return listings
   */
  @Valid 
  @Schema(name = "listings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("listings")
  public List<@Valid ListingResponse> getListings() {
    return listings;
  }

  public void setListings(List<@Valid ListingResponse> listings) {
    this.listings = listings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingGroupResponse listingGroupResponse = (ListingGroupResponse) o;
    return Objects.equals(this.category, listingGroupResponse.category) &&
        Objects.equals(this.listings, listingGroupResponse.listings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, listings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListingGroupResponse {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    listings: ").append(toIndentedString(listings)).append("\n");
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

