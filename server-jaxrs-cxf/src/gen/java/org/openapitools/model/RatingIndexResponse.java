package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CategoryResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RatingIndexResponse  {
  
  @ApiModelProperty(value = "")

  private Long ratingIndexId;

  @ApiModelProperty(value = "")

  private Long ratingCount;

  @ApiModelProperty(value = "")

  private Float ratingAverage;

  @ApiModelProperty(value = "")

  private Float value;

  @ApiModelProperty(value = "")

  private String display;

public enum RatableTypeEnum {

LOCATABLE(String.valueOf("LOCATABLE")), RESERVABLE(String.valueOf("RESERVABLE")), PERMISSIONABLE(String.valueOf("PERMISSIONABLE")), NOTABLE(String.valueOf("NOTABLE")), ASSETABLE(String.valueOf("ASSETABLE")), LIKABLE(String.valueOf("LIKABLE")), FLAGABLE(String.valueOf("FLAGABLE")), FAVORITABLE(String.valueOf("FAVORITABLE")), RATABLE(String.valueOf("RATABLE")), ALBUM(String.valueOf("ALBUM")), COLLECTION(String.valueOf("COLLECTION")), APPLICATION(String.valueOf("APPLICATION")), APPLICATION_SETTING(String.valueOf("APPLICATION_SETTING")), APPLICATION_CERT(String.valueOf("APPLICATION_CERT")), APPLICATION_PLACEMENT(String.valueOf("APPLICATION_PLACEMENT")), ACCOUNT(String.valueOf("ACCOUNT")), ACCOUNT_SETTING(String.valueOf("ACCOUNT_SETTING")), GAME_LEVEL(String.valueOf("GAME_LEVEL")), PACK(String.valueOf("PACK")), MISSION(String.valueOf("MISSION")), TOURNAMENT(String.valueOf("TOURNAMENT")), ASSET(String.valueOf("ASSET")), ALBUM_CONTEST(String.valueOf("ALBUM_CONTEST")), THEME_DESCRIPTOR(String.valueOf("THEME_DESCRIPTOR")), OFFER(String.valueOf("OFFER")), OFFER_LOCATION(String.valueOf("OFFER_LOCATION")), EVENT(String.valueOf("EVENT")), RETAILER(String.valueOf("RETAILER")), RETAILER_LOCATION(String.valueOf("RETAILER_LOCATION")), NOTE(String.valueOf("NOTE")), CREATIVE(String.valueOf("CREATIVE")), FAVORITE(String.valueOf("FAVORITE")), LIKE(String.valueOf("LIKE")), RATING(String.valueOf("RATING")), ANALYTIC(String.valueOf("ANALYTIC")), THIRD_PARTY_CREDENTIAL(String.valueOf("THIRD_PARTY_CREDENTIAL")), THIRD_PARTY_NETWORK(String.valueOf("THIRD_PARTY_NETWORK")), REGION(String.valueOf("REGION"));


    private String value;

    RatableTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static RatableTypeEnum fromValue(String value) {
        for (RatableTypeEnum b : RatableTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private RatableTypeEnum ratableType;

  @ApiModelProperty(value = "")

  private Long ratableId;

  @ApiModelProperty(value = "")

  @Valid

  private CategoryResponse category;

  @ApiModelProperty(value = "")

  private Object ratable;

  @ApiModelProperty(value = "")

  private String secondaryType;
 /**
   * Get ratingIndexId
   * @return ratingIndexId
  **/
  @JsonProperty("ratingIndexId")
  public Long getRatingIndexId() {
    return ratingIndexId;
  }

  public void setRatingIndexId(Long ratingIndexId) {
    this.ratingIndexId = ratingIndexId;
  }

  public RatingIndexResponse ratingIndexId(Long ratingIndexId) {
    this.ratingIndexId = ratingIndexId;
    return this;
  }

 /**
   * Get ratingCount
   * @return ratingCount
  **/
  @JsonProperty("ratingCount")
  public Long getRatingCount() {
    return ratingCount;
  }

  public void setRatingCount(Long ratingCount) {
    this.ratingCount = ratingCount;
  }

  public RatingIndexResponse ratingCount(Long ratingCount) {
    this.ratingCount = ratingCount;
    return this;
  }

 /**
   * Get ratingAverage
   * @return ratingAverage
  **/
  @JsonProperty("ratingAverage")
  public Float getRatingAverage() {
    return ratingAverage;
  }

  public void setRatingAverage(Float ratingAverage) {
    this.ratingAverage = ratingAverage;
  }

  public RatingIndexResponse ratingAverage(Float ratingAverage) {
    this.ratingAverage = ratingAverage;
    return this;
  }

 /**
   * Get value
   * @return value
  **/
  @JsonProperty("value")
  public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }

  public RatingIndexResponse value(Float value) {
    this.value = value;
    return this;
  }

 /**
   * Get display
   * @return display
  **/
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public RatingIndexResponse display(String display) {
    this.display = display;
    return this;
  }

 /**
   * Get ratableType
   * @return ratableType
  **/
  @JsonProperty("ratableType")
  public String getRatableType() {
    if (ratableType == null) {
      return null;
    }
    return ratableType.value();
  }

  public void setRatableType(RatableTypeEnum ratableType) {
    this.ratableType = ratableType;
  }

  public RatingIndexResponse ratableType(RatableTypeEnum ratableType) {
    this.ratableType = ratableType;
    return this;
  }

 /**
   * Get ratableId
   * @return ratableId
  **/
  @JsonProperty("ratableId")
  public Long getRatableId() {
    return ratableId;
  }

  public void setRatableId(Long ratableId) {
    this.ratableId = ratableId;
  }

  public RatingIndexResponse ratableId(Long ratableId) {
    this.ratableId = ratableId;
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

  public RatingIndexResponse category(CategoryResponse category) {
    this.category = category;
    return this;
  }

 /**
   * Get ratable
   * @return ratable
  **/
  @JsonProperty("ratable")
  public Object getRatable() {
    return ratable;
  }

  public void setRatable(Object ratable) {
    this.ratable = ratable;
  }

  public RatingIndexResponse ratable(Object ratable) {
    this.ratable = ratable;
    return this;
  }

 /**
   * Get secondaryType
   * @return secondaryType
  **/
  @JsonProperty("secondaryType")
  public String getSecondaryType() {
    return secondaryType;
  }

  public void setSecondaryType(String secondaryType) {
    this.secondaryType = secondaryType;
  }

  public RatingIndexResponse secondaryType(String secondaryType) {
    this.secondaryType = secondaryType;
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
    RatingIndexResponse ratingIndexResponse = (RatingIndexResponse) o;
    return Objects.equals(this.ratingIndexId, ratingIndexResponse.ratingIndexId) &&
        Objects.equals(this.ratingCount, ratingIndexResponse.ratingCount) &&
        Objects.equals(this.ratingAverage, ratingIndexResponse.ratingAverage) &&
        Objects.equals(this.value, ratingIndexResponse.value) &&
        Objects.equals(this.display, ratingIndexResponse.display) &&
        Objects.equals(this.ratableType, ratingIndexResponse.ratableType) &&
        Objects.equals(this.ratableId, ratingIndexResponse.ratableId) &&
        Objects.equals(this.category, ratingIndexResponse.category) &&
        Objects.equals(this.ratable, ratingIndexResponse.ratable) &&
        Objects.equals(this.secondaryType, ratingIndexResponse.secondaryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratingIndexId, ratingCount, ratingAverage, value, display, ratableType, ratableId, category, ratable, secondaryType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingIndexResponse {\n");
    
    sb.append("    ratingIndexId: ").append(toIndentedString(ratingIndexId)).append("\n");
    sb.append("    ratingCount: ").append(toIndentedString(ratingCount)).append("\n");
    sb.append("    ratingAverage: ").append(toIndentedString(ratingAverage)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    ratableType: ").append(toIndentedString(ratableType)).append("\n");
    sb.append("    ratableId: ").append(toIndentedString(ratableId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    ratable: ").append(toIndentedString(ratable)).append("\n");
    sb.append("    secondaryType: ").append(toIndentedString(secondaryType)).append("\n");
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

