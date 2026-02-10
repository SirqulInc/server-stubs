package apimodels;

import apimodels.AccountShortResponse;
import apimodels.CategoryResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RatingResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RatingResponse   {
  @JsonProperty("ratingId")
  
  private Long ratingId;

  @JsonProperty("ratingValue")
  
  private Integer ratingValue;

  @JsonProperty("latitude")
  
  private Double latitude;

  @JsonProperty("longitude")
  
  private Double longitude;

  @JsonProperty("locationDescription")
  
  private String locationDescription;

  @JsonProperty("category")
  @Valid

  private CategoryResponse category;

  @JsonProperty("owner")
  @Valid

  private AccountShortResponse owner;

  public RatingResponse ratingId(Long ratingId) {
    this.ratingId = ratingId;
    return this;
  }

   /**
   * Get ratingId
   * @return ratingId
  **/
  public Long getRatingId() {
    return ratingId;
  }

  public void setRatingId(Long ratingId) {
    this.ratingId = ratingId;
  }

  public RatingResponse ratingValue(Integer ratingValue) {
    this.ratingValue = ratingValue;
    return this;
  }

   /**
   * Get ratingValue
   * @return ratingValue
  **/
  public Integer getRatingValue() {
    return ratingValue;
  }

  public void setRatingValue(Integer ratingValue) {
    this.ratingValue = ratingValue;
  }

  public RatingResponse latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public RatingResponse longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public RatingResponse locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

   /**
   * Get locationDescription
   * @return locationDescription
  **/
  public String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }

  public RatingResponse category(CategoryResponse category) {
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

  public RatingResponse owner(AccountShortResponse owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  public AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatingResponse ratingResponse = (RatingResponse) o;
    return Objects.equals(ratingId, ratingResponse.ratingId) &&
        Objects.equals(ratingValue, ratingResponse.ratingValue) &&
        Objects.equals(latitude, ratingResponse.latitude) &&
        Objects.equals(longitude, ratingResponse.longitude) &&
        Objects.equals(locationDescription, ratingResponse.locationDescription) &&
        Objects.equals(category, ratingResponse.category) &&
        Objects.equals(owner, ratingResponse.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratingId, ratingValue, latitude, longitude, locationDescription, category, owner);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingResponse {\n");
    
    sb.append("    ratingId: ").append(toIndentedString(ratingId)).append("\n");
    sb.append("    ratingValue: ").append(toIndentedString(ratingValue)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

