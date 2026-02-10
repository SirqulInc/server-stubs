package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CategoryResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RatingIndexResponse   {
  
  private Long ratingIndexId;
  private Long ratingCount;
  private Float ratingAverage;
  private Float value;
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
    private String value;

    RatableTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private RatableTypeEnum ratableType;
  private Long ratableId;
  private CategoryResponse category;
  private Object ratable;
  private String secondaryType;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ratingIndexId")
  public Long getRatingIndexId() {
    return ratingIndexId;
  }
  public void setRatingIndexId(Long ratingIndexId) {
    this.ratingIndexId = ratingIndexId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ratingCount")
  public Long getRatingCount() {
    return ratingCount;
  }
  public void setRatingCount(Long ratingCount) {
    this.ratingCount = ratingCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ratingAverage")
  public Float getRatingAverage() {
    return ratingAverage;
  }
  public void setRatingAverage(Float ratingAverage) {
    this.ratingAverage = ratingAverage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("value")
  public Float getValue() {
    return value;
  }
  public void setValue(Float value) {
    this.value = value;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }
  public void setDisplay(String display) {
    this.display = display;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ratableType")
  public RatableTypeEnum getRatableType() {
    return ratableType;
  }
  public void setRatableType(RatableTypeEnum ratableType) {
    this.ratableType = ratableType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ratableId")
  public Long getRatableId() {
    return ratableId;
  }
  public void setRatableId(Long ratableId) {
    this.ratableId = ratableId;
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
  @JsonProperty("ratable")
  public Object getRatable() {
    return ratable;
  }
  public void setRatable(Object ratable) {
    this.ratable = ratable;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("secondaryType")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

