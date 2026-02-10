package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CategoryResponse;
import org.openapitools.model.ListingResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListingGroupResponse  {
  
  @ApiModelProperty(value = "")

  @Valid

  private CategoryResponse category;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid ListingResponse> listings = new ArrayList<>();
 /**
   * Get category
   * @return category
  **/
  @JsonProperty("category")
  public CategoryResponse getCategory() {
    return category;
  }

  public void setCategory(CategoryResponse category) {
    this.category = category;
  }

  public ListingGroupResponse category(CategoryResponse category) {
    this.category = category;
    return this;
  }

 /**
   * Get listings
   * @return listings
  **/
  @JsonProperty("listings")
  public List<@Valid ListingResponse> getListings() {
    return listings;
  }

  public void setListings(List<@Valid ListingResponse> listings) {
    this.listings = listings;
  }

  public ListingGroupResponse listings(List<@Valid ListingResponse> listings) {
    this.listings = listings;
    return this;
  }

  public ListingGroupResponse addListingsItem(ListingResponse listingsItem) {
    this.listings.add(listingsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

