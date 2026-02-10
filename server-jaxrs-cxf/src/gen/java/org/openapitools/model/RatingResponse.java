package org.openapitools.model;

import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.CategoryResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RatingResponse  {
  
  @ApiModelProperty(value = "")

  private Long ratingId;

  @ApiModelProperty(value = "")

  private Integer ratingValue;

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;

  @ApiModelProperty(value = "")

  private String locationDescription;

  @ApiModelProperty(value = "")

  @Valid

  private CategoryResponse category;

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse owner;
 /**
   * Get ratingId
   * @return ratingId
  **/
  @JsonProperty("ratingId")
  public Long getRatingId() {
    return ratingId;
  }

  public void setRatingId(Long ratingId) {
    this.ratingId = ratingId;
  }

  public RatingResponse ratingId(Long ratingId) {
    this.ratingId = ratingId;
    return this;
  }

 /**
   * Get ratingValue
   * @return ratingValue
  **/
  @JsonProperty("ratingValue")
  public Integer getRatingValue() {
    return ratingValue;
  }

  public void setRatingValue(Integer ratingValue) {
    this.ratingValue = ratingValue;
  }

  public RatingResponse ratingValue(Integer ratingValue) {
    this.ratingValue = ratingValue;
    return this;
  }

 /**
   * Get latitude
   * @return latitude
  **/
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public RatingResponse latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Get longitude
   * @return longitude
  **/
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public RatingResponse longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Get locationDescription
   * @return locationDescription
  **/
  @JsonProperty("locationDescription")
  public String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }

  public RatingResponse locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

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

  public RatingResponse category(CategoryResponse category) {
    this.category = category;
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  public RatingResponse owner(AccountShortResponse owner) {
    this.owner = owner;
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
    RatingResponse ratingResponse = (RatingResponse) o;
    return Objects.equals(this.ratingId, ratingResponse.ratingId) &&
        Objects.equals(this.ratingValue, ratingResponse.ratingValue) &&
        Objects.equals(this.latitude, ratingResponse.latitude) &&
        Objects.equals(this.longitude, ratingResponse.longitude) &&
        Objects.equals(this.locationDescription, ratingResponse.locationDescription) &&
        Objects.equals(this.category, ratingResponse.category) &&
        Objects.equals(this.owner, ratingResponse.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratingId, ratingValue, latitude, longitude, locationDescription, category, owner);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

