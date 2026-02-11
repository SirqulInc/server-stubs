package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.CategoryResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RatingResponse   {
  
  private Long ratingId;
  private Integer ratingValue;
  private Double latitude;
  private Double longitude;
  private String locationDescription;
  private CategoryResponse category;
  private AccountShortResponse owner;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ratingId")
  public Long getRatingId() {
    return ratingId;
  }
  public void setRatingId(Long ratingId) {
    this.ratingId = ratingId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ratingValue")
  public Integer getRatingValue() {
    return ratingValue;
  }
  public void setRatingValue(Integer ratingValue) {
    this.ratingValue = ratingValue;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationDescription")
  public String getLocationDescription() {
    return locationDescription;
  }
  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("category")
  @Valid
  public CategoryResponse getCategory() {
    return category;
  }
  public void setCategory(CategoryResponse category) {
    this.category = category;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("owner")
  @Valid
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

