package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * RatingIndexResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RatingIndexResponse {

  private @Nullable Long ratingIndexId;

  private @Nullable Long ratingCount;

  private @Nullable Float ratingAverage;

  private @Nullable Float value;

  private @Nullable String display;

  /**
   * Gets or Sets ratableType
   */
  public enum RatableTypeEnum {
    LOCATABLE("LOCATABLE"),
    
    RESERVABLE("RESERVABLE"),
    
    PERMISSIONABLE("PERMISSIONABLE"),
    
    NOTABLE("NOTABLE"),
    
    ASSETABLE("ASSETABLE"),
    
    LIKABLE("LIKABLE"),
    
    FLAGABLE("FLAGABLE"),
    
    FAVORITABLE("FAVORITABLE"),
    
    RATABLE("RATABLE"),
    
    ALBUM("ALBUM"),
    
    COLLECTION("COLLECTION"),
    
    APPLICATION("APPLICATION"),
    
    APPLICATION_SETTING("APPLICATION_SETTING"),
    
    APPLICATION_CERT("APPLICATION_CERT"),
    
    APPLICATION_PLACEMENT("APPLICATION_PLACEMENT"),
    
    ACCOUNT("ACCOUNT"),
    
    ACCOUNT_SETTING("ACCOUNT_SETTING"),
    
    GAME_LEVEL("GAME_LEVEL"),
    
    PACK("PACK"),
    
    MISSION("MISSION"),
    
    TOURNAMENT("TOURNAMENT"),
    
    ASSET("ASSET"),
    
    ALBUM_CONTEST("ALBUM_CONTEST"),
    
    THEME_DESCRIPTOR("THEME_DESCRIPTOR"),
    
    OFFER("OFFER"),
    
    OFFER_LOCATION("OFFER_LOCATION"),
    
    EVENT("EVENT"),
    
    RETAILER("RETAILER"),
    
    RETAILER_LOCATION("RETAILER_LOCATION"),
    
    NOTE("NOTE"),
    
    CREATIVE("CREATIVE"),
    
    FAVORITE("FAVORITE"),
    
    LIKE("LIKE"),
    
    RATING("RATING"),
    
    ANALYTIC("ANALYTIC"),
    
    THIRD_PARTY_CREDENTIAL("THIRD_PARTY_CREDENTIAL"),
    
    THIRD_PARTY_NETWORK("THIRD_PARTY_NETWORK"),
    
    REGION("REGION");

    private final String value;

    RatableTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable RatableTypeEnum ratableType;

  private @Nullable Long ratableId;

  private @Nullable CategoryResponse category;

  private @Nullable Object ratable;

  private @Nullable String secondaryType;

  public RatingIndexResponse ratingIndexId(@Nullable Long ratingIndexId) {
    this.ratingIndexId = ratingIndexId;
    return this;
  }

  /**
   * Get ratingIndexId
   * @return ratingIndexId
   */
  
  @Schema(name = "ratingIndexId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ratingIndexId")
  public @Nullable Long getRatingIndexId() {
    return ratingIndexId;
  }

  public void setRatingIndexId(@Nullable Long ratingIndexId) {
    this.ratingIndexId = ratingIndexId;
  }

  public RatingIndexResponse ratingCount(@Nullable Long ratingCount) {
    this.ratingCount = ratingCount;
    return this;
  }

  /**
   * Get ratingCount
   * @return ratingCount
   */
  
  @Schema(name = "ratingCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ratingCount")
  public @Nullable Long getRatingCount() {
    return ratingCount;
  }

  public void setRatingCount(@Nullable Long ratingCount) {
    this.ratingCount = ratingCount;
  }

  public RatingIndexResponse ratingAverage(@Nullable Float ratingAverage) {
    this.ratingAverage = ratingAverage;
    return this;
  }

  /**
   * Get ratingAverage
   * @return ratingAverage
   */
  
  @Schema(name = "ratingAverage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ratingAverage")
  public @Nullable Float getRatingAverage() {
    return ratingAverage;
  }

  public void setRatingAverage(@Nullable Float ratingAverage) {
    this.ratingAverage = ratingAverage;
  }

  public RatingIndexResponse value(@Nullable Float value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  
  @Schema(name = "value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public @Nullable Float getValue() {
    return value;
  }

  public void setValue(@Nullable Float value) {
    this.value = value;
  }

  public RatingIndexResponse display(@Nullable String display) {
    this.display = display;
    return this;
  }

  /**
   * Get display
   * @return display
   */
  
  @Schema(name = "display", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display")
  public @Nullable String getDisplay() {
    return display;
  }

  public void setDisplay(@Nullable String display) {
    this.display = display;
  }

  public RatingIndexResponse ratableType(@Nullable RatableTypeEnum ratableType) {
    this.ratableType = ratableType;
    return this;
  }

  /**
   * Get ratableType
   * @return ratableType
   */
  
  @Schema(name = "ratableType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ratableType")
  public @Nullable RatableTypeEnum getRatableType() {
    return ratableType;
  }

  public void setRatableType(@Nullable RatableTypeEnum ratableType) {
    this.ratableType = ratableType;
  }

  public RatingIndexResponse ratableId(@Nullable Long ratableId) {
    this.ratableId = ratableId;
    return this;
  }

  /**
   * Get ratableId
   * @return ratableId
   */
  
  @Schema(name = "ratableId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ratableId")
  public @Nullable Long getRatableId() {
    return ratableId;
  }

  public void setRatableId(@Nullable Long ratableId) {
    this.ratableId = ratableId;
  }

  public RatingIndexResponse category(@Nullable CategoryResponse category) {
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

  public RatingIndexResponse ratable(@Nullable Object ratable) {
    this.ratable = ratable;
    return this;
  }

  /**
   * Get ratable
   * @return ratable
   */
  
  @Schema(name = "ratable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ratable")
  public @Nullable Object getRatable() {
    return ratable;
  }

  public void setRatable(@Nullable Object ratable) {
    this.ratable = ratable;
  }

  public RatingIndexResponse secondaryType(@Nullable String secondaryType) {
    this.secondaryType = secondaryType;
    return this;
  }

  /**
   * Get secondaryType
   * @return secondaryType
   */
  
  @Schema(name = "secondaryType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondaryType")
  public @Nullable String getSecondaryType() {
    return secondaryType;
  }

  public void setSecondaryType(@Nullable String secondaryType) {
    this.secondaryType = secondaryType;
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

