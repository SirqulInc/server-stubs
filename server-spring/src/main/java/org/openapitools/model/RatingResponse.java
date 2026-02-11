package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.CategoryResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RatingResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RatingResponse {

  private @Nullable Long ratingId;

  private @Nullable Integer ratingValue;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable String locationDescription;

  private @Nullable CategoryResponse category;

  private @Nullable AccountShortResponse owner;

  public RatingResponse ratingId(@Nullable Long ratingId) {
    this.ratingId = ratingId;
    return this;
  }

  /**
   * Get ratingId
   * @return ratingId
   */
  
  @Schema(name = "ratingId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ratingId")
  public @Nullable Long getRatingId() {
    return ratingId;
  }

  public void setRatingId(@Nullable Long ratingId) {
    this.ratingId = ratingId;
  }

  public RatingResponse ratingValue(@Nullable Integer ratingValue) {
    this.ratingValue = ratingValue;
    return this;
  }

  /**
   * Get ratingValue
   * @return ratingValue
   */
  
  @Schema(name = "ratingValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ratingValue")
  public @Nullable Integer getRatingValue() {
    return ratingValue;
  }

  public void setRatingValue(@Nullable Integer ratingValue) {
    this.ratingValue = ratingValue;
  }

  public RatingResponse latitude(@Nullable Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   */
  
  @Schema(name = "latitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public @Nullable Double getLatitude() {
    return latitude;
  }

  public void setLatitude(@Nullable Double latitude) {
    this.latitude = latitude;
  }

  public RatingResponse longitude(@Nullable Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
   */
  
  @Schema(name = "longitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public @Nullable Double getLongitude() {
    return longitude;
  }

  public void setLongitude(@Nullable Double longitude) {
    this.longitude = longitude;
  }

  public RatingResponse locationDescription(@Nullable String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

  /**
   * Get locationDescription
   * @return locationDescription
   */
  
  @Schema(name = "locationDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationDescription")
  public @Nullable String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(@Nullable String locationDescription) {
    this.locationDescription = locationDescription;
  }

  public RatingResponse category(@Nullable CategoryResponse category) {
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

  public RatingResponse owner(@Nullable AccountShortResponse owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @Valid 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public @Nullable AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(@Nullable AccountShortResponse owner) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

