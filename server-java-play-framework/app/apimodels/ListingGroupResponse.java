package apimodels;

import apimodels.CategoryResponse;
import apimodels.ListingResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListingGroupResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ListingGroupResponse   {
  @JsonProperty("category")
  @Valid

  private CategoryResponse category;

  @JsonProperty("listings")
  @Valid

  private List<@Valid ListingResponse> listings = null;

  public ListingGroupResponse category(CategoryResponse category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  public CategoryResponse getCategory() {
    return category;
  }

  public void setCategory(CategoryResponse category) {
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
  **/
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
    return Objects.equals(category, listingGroupResponse.category) &&
        Objects.equals(listings, listingGroupResponse.listings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, listings);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

