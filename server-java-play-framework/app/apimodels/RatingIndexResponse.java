package apimodels;

import apimodels.CategoryResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RatingIndexResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RatingIndexResponse   {
  @JsonProperty("ratingIndexId")
  
  private Long ratingIndexId;

  @JsonProperty("ratingCount")
  
  private Long ratingCount;

  @JsonProperty("ratingAverage")
  
  private Float ratingAverage;

  @JsonProperty("value")
  
  private Float value;

  @JsonProperty("display")
  
  private String display;

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

  @JsonProperty("ratableType")
  
  private RatableTypeEnum ratableType;

  @JsonProperty("ratableId")
  
  private Long ratableId;

  @JsonProperty("category")
  @Valid

  private CategoryResponse category;

  @JsonProperty("ratable")
  
  private Object ratable;

  @JsonProperty("secondaryType")
  
  private String secondaryType;

  public RatingIndexResponse ratingIndexId(Long ratingIndexId) {
    this.ratingIndexId = ratingIndexId;
    return this;
  }

   /**
   * Get ratingIndexId
   * @return ratingIndexId
  **/
  public Long getRatingIndexId() {
    return ratingIndexId;
  }

  public void setRatingIndexId(Long ratingIndexId) {
    this.ratingIndexId = ratingIndexId;
  }

  public RatingIndexResponse ratingCount(Long ratingCount) {
    this.ratingCount = ratingCount;
    return this;
  }

   /**
   * Get ratingCount
   * @return ratingCount
  **/
  public Long getRatingCount() {
    return ratingCount;
  }

  public void setRatingCount(Long ratingCount) {
    this.ratingCount = ratingCount;
  }

  public RatingIndexResponse ratingAverage(Float ratingAverage) {
    this.ratingAverage = ratingAverage;
    return this;
  }

   /**
   * Get ratingAverage
   * @return ratingAverage
  **/
  public Float getRatingAverage() {
    return ratingAverage;
  }

  public void setRatingAverage(Float ratingAverage) {
    this.ratingAverage = ratingAverage;
  }

  public RatingIndexResponse value(Float value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }

  public RatingIndexResponse display(String display) {
    this.display = display;
    return this;
  }

   /**
   * Get display
   * @return display
  **/
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public RatingIndexResponse ratableType(RatableTypeEnum ratableType) {
    this.ratableType = ratableType;
    return this;
  }

   /**
   * Get ratableType
   * @return ratableType
  **/
  public RatableTypeEnum getRatableType() {
    return ratableType;
  }

  public void setRatableType(RatableTypeEnum ratableType) {
    this.ratableType = ratableType;
  }

  public RatingIndexResponse ratableId(Long ratableId) {
    this.ratableId = ratableId;
    return this;
  }

   /**
   * Get ratableId
   * @return ratableId
  **/
  public Long getRatableId() {
    return ratableId;
  }

  public void setRatableId(Long ratableId) {
    this.ratableId = ratableId;
  }

  public RatingIndexResponse category(CategoryResponse category) {
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

  public RatingIndexResponse ratable(Object ratable) {
    this.ratable = ratable;
    return this;
  }

   /**
   * Get ratable
   * @return ratable
  **/
  public Object getRatable() {
    return ratable;
  }

  public void setRatable(Object ratable) {
    this.ratable = ratable;
  }

  public RatingIndexResponse secondaryType(String secondaryType) {
    this.secondaryType = secondaryType;
    return this;
  }

   /**
   * Get secondaryType
   * @return secondaryType
  **/
  public String getSecondaryType() {
    return secondaryType;
  }

  public void setSecondaryType(String secondaryType) {
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
    return Objects.equals(ratingIndexId, ratingIndexResponse.ratingIndexId) &&
        Objects.equals(ratingCount, ratingIndexResponse.ratingCount) &&
        Objects.equals(ratingAverage, ratingIndexResponse.ratingAverage) &&
        Objects.equals(value, ratingIndexResponse.value) &&
        Objects.equals(display, ratingIndexResponse.display) &&
        Objects.equals(ratableType, ratingIndexResponse.ratableType) &&
        Objects.equals(ratableId, ratingIndexResponse.ratableId) &&
        Objects.equals(category, ratingIndexResponse.category) &&
        Objects.equals(ratable, ratingIndexResponse.ratable) &&
        Objects.equals(secondaryType, ratingIndexResponse.secondaryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratingIndexId, ratingCount, ratingAverage, value, display, ratableType, ratableId, category, ratable, secondaryType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

