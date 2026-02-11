package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SizeGroup;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Product
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Product {

  private @Nullable String brand;

  /**
   * Gets or Sets productType
   */
  public enum ProductTypeEnum {
    APPAREL("APPAREL"),
    
    APPLIANCES("APPLIANCES"),
    
    APPS("APPS"),
    
    ARTS_CRAFTS("ARTS_CRAFTS"),
    
    AUTOMOTIVE("AUTOMOTIVE"),
    
    BABY("BABY"),
    
    BEAUTY("BEAUTY"),
    
    BOOKS("BOOKS"),
    
    CLASSICAL("CLASSICAL"),
    
    COLLECTIBLES("COLLECTIBLES"),
    
    DVD("DVD"),
    
    ELECTRONICS("ELECTRONICS"),
    
    GIFT_CARDS("GIFT_CARDS"),
    
    GOURMET_FOOD("GOURMET_FOOD"),
    
    GROCERY("GROCERY"),
    
    HEALTH_PERSONAL_CARE("HEALTH_PERSONAL_CARE"),
    
    HOME_GARDEN("HOME_GARDEN"),
    
    INDUSTRIAL("INDUSTRIAL"),
    
    JEWELRY("JEWELRY"),
    
    KITCHEN("KITCHEN"),
    
    LAWN_GARDEN("LAWN_GARDEN"),
    
    MAGAZINES("MAGAZINES"),
    
    MISCELLANEOUS("MISCELLANEOUS"),
    
    MUSICAL_INSTRUMENTS("MUSICAL_INSTRUMENTS"),
    
    OFFICE_PRODUCTS("OFFICE_PRODUCTS"),
    
    OTHER("OTHER"),
    
    OUTDOOR_LIVING("OUTDOOR_LIVING"),
    
    PC_HARDWARE("PC_HARDWARE"),
    
    PET_SUPPLIES("PET_SUPPLIES"),
    
    SHOES("SHOES"),
    
    SOFTWARE("SOFTWARE"),
    
    SPORTING_GOODS("SPORTING_GOODS"),
    
    TOOLS("TOOLS"),
    
    TOYS("TOYS"),
    
    VIDEO_GAMES("VIDEO_GAMES"),
    
    WATCHES("WATCHES"),
    
    WIRELESS("WIRELESS"),
    
    WIRELESS_ACCESSORIES("WIRELESS_ACCESSORIES");

    private final String value;

    ProductTypeEnum(String value) {
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
    public static ProductTypeEnum fromValue(String value) {
      for (ProductTypeEnum b : ProductTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ProductTypeEnum productType;

  /**
   * Gets or Sets condition
   */
  public enum ConditionEnum {
    NEW("NEW"),
    
    USED("USED"),
    
    REFURBISHED("REFURBISHED"),
    
    OTHER("OTHER");

    private final String value;

    ConditionEnum(String value) {
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
    public static ConditionEnum fromValue(String value) {
      for (ConditionEnum b : ConditionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ConditionEnum condition;

  private @Nullable String isbn;

  private @Nullable String asin;

  @Valid
  private List<String> catalogNumbers = new ArrayList<>();

  private @Nullable String department;

  @Valid
  private List<String> features = new ArrayList<>();

  private @Nullable Double minimumPrice;

  private @Nullable Double width;

  private @Nullable Double height;

  private @Nullable Double depth;

  private @Nullable Double weight;

  /**
   * Gets or Sets unit
   */
  public enum UnitEnum {
    MILIMETER("MILIMETER"),
    
    CENTIMETER("CENTIMETER"),
    
    METER("METER"),
    
    INCH("INCH"),
    
    FOOT("FOOT"),
    
    YARD("YARD");

    private final String value;

    UnitEnum(String value) {
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
    public static UnitEnum fromValue(String value) {
      for (UnitEnum b : UnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable UnitEnum unit;

  private @Nullable String studio;

  private @Nullable String parentalRating;

  private @Nullable Long publishDate;

  private @Nullable Long availabilityDate;

  private @Nullable SizeGroup size;

  public Product brand(@Nullable String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand
   * @return brand
   */
  
  @Schema(name = "brand", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("brand")
  public @Nullable String getBrand() {
    return brand;
  }

  public void setBrand(@Nullable String brand) {
    this.brand = brand;
  }

  public Product productType(@Nullable ProductTypeEnum productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Get productType
   * @return productType
   */
  
  @Schema(name = "productType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productType")
  public @Nullable ProductTypeEnum getProductType() {
    return productType;
  }

  public void setProductType(@Nullable ProductTypeEnum productType) {
    this.productType = productType;
  }

  public Product condition(@Nullable ConditionEnum condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Get condition
   * @return condition
   */
  
  @Schema(name = "condition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("condition")
  public @Nullable ConditionEnum getCondition() {
    return condition;
  }

  public void setCondition(@Nullable ConditionEnum condition) {
    this.condition = condition;
  }

  public Product isbn(@Nullable String isbn) {
    this.isbn = isbn;
    return this;
  }

  /**
   * Get isbn
   * @return isbn
   */
  
  @Schema(name = "isbn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isbn")
  public @Nullable String getIsbn() {
    return isbn;
  }

  public void setIsbn(@Nullable String isbn) {
    this.isbn = isbn;
  }

  public Product asin(@Nullable String asin) {
    this.asin = asin;
    return this;
  }

  /**
   * Get asin
   * @return asin
   */
  
  @Schema(name = "asin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asin")
  public @Nullable String getAsin() {
    return asin;
  }

  public void setAsin(@Nullable String asin) {
    this.asin = asin;
  }

  public Product catalogNumbers(List<String> catalogNumbers) {
    this.catalogNumbers = catalogNumbers;
    return this;
  }

  public Product addCatalogNumbersItem(String catalogNumbersItem) {
    if (this.catalogNumbers == null) {
      this.catalogNumbers = new ArrayList<>();
    }
    this.catalogNumbers.add(catalogNumbersItem);
    return this;
  }

  /**
   * Get catalogNumbers
   * @return catalogNumbers
   */
  
  @Schema(name = "catalogNumbers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalogNumbers")
  public List<String> getCatalogNumbers() {
    return catalogNumbers;
  }

  public void setCatalogNumbers(List<String> catalogNumbers) {
    this.catalogNumbers = catalogNumbers;
  }

  public Product department(@Nullable String department) {
    this.department = department;
    return this;
  }

  /**
   * Get department
   * @return department
   */
  
  @Schema(name = "department", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("department")
  public @Nullable String getDepartment() {
    return department;
  }

  public void setDepartment(@Nullable String department) {
    this.department = department;
  }

  public Product features(List<String> features) {
    this.features = features;
    return this;
  }

  public Product addFeaturesItem(String featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

  /**
   * Get features
   * @return features
   */
  
  @Schema(name = "features", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("features")
  public List<String> getFeatures() {
    return features;
  }

  public void setFeatures(List<String> features) {
    this.features = features;
  }

  public Product minimumPrice(@Nullable Double minimumPrice) {
    this.minimumPrice = minimumPrice;
    return this;
  }

  /**
   * Get minimumPrice
   * @return minimumPrice
   */
  
  @Schema(name = "minimumPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minimumPrice")
  public @Nullable Double getMinimumPrice() {
    return minimumPrice;
  }

  public void setMinimumPrice(@Nullable Double minimumPrice) {
    this.minimumPrice = minimumPrice;
  }

  public Product width(@Nullable Double width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   * @return width
   */
  
  @Schema(name = "width", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("width")
  public @Nullable Double getWidth() {
    return width;
  }

  public void setWidth(@Nullable Double width) {
    this.width = width;
  }

  public Product height(@Nullable Double height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
   */
  
  @Schema(name = "height", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("height")
  public @Nullable Double getHeight() {
    return height;
  }

  public void setHeight(@Nullable Double height) {
    this.height = height;
  }

  public Product depth(@Nullable Double depth) {
    this.depth = depth;
    return this;
  }

  /**
   * Get depth
   * @return depth
   */
  
  @Schema(name = "depth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("depth")
  public @Nullable Double getDepth() {
    return depth;
  }

  public void setDepth(@Nullable Double depth) {
    this.depth = depth;
  }

  public Product weight(@Nullable Double weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
   */
  
  @Schema(name = "weight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weight")
  public @Nullable Double getWeight() {
    return weight;
  }

  public void setWeight(@Nullable Double weight) {
    this.weight = weight;
  }

  public Product unit(@Nullable UnitEnum unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
   */
  
  @Schema(name = "unit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unit")
  public @Nullable UnitEnum getUnit() {
    return unit;
  }

  public void setUnit(@Nullable UnitEnum unit) {
    this.unit = unit;
  }

  public Product studio(@Nullable String studio) {
    this.studio = studio;
    return this;
  }

  /**
   * Get studio
   * @return studio
   */
  
  @Schema(name = "studio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("studio")
  public @Nullable String getStudio() {
    return studio;
  }

  public void setStudio(@Nullable String studio) {
    this.studio = studio;
  }

  public Product parentalRating(@Nullable String parentalRating) {
    this.parentalRating = parentalRating;
    return this;
  }

  /**
   * Get parentalRating
   * @return parentalRating
   */
  
  @Schema(name = "parentalRating", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentalRating")
  public @Nullable String getParentalRating() {
    return parentalRating;
  }

  public void setParentalRating(@Nullable String parentalRating) {
    this.parentalRating = parentalRating;
  }

  public Product publishDate(@Nullable Long publishDate) {
    this.publishDate = publishDate;
    return this;
  }

  /**
   * Get publishDate
   * @return publishDate
   */
  
  @Schema(name = "publishDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publishDate")
  public @Nullable Long getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(@Nullable Long publishDate) {
    this.publishDate = publishDate;
  }

  public Product availabilityDate(@Nullable Long availabilityDate) {
    this.availabilityDate = availabilityDate;
    return this;
  }

  /**
   * Get availabilityDate
   * @return availabilityDate
   */
  
  @Schema(name = "availabilityDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availabilityDate")
  public @Nullable Long getAvailabilityDate() {
    return availabilityDate;
  }

  public void setAvailabilityDate(@Nullable Long availabilityDate) {
    this.availabilityDate = availabilityDate;
  }

  public Product size(@Nullable SizeGroup size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
   */
  @Valid 
  @Schema(name = "size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public @Nullable SizeGroup getSize() {
    return size;
  }

  public void setSize(@Nullable SizeGroup size) {
    this.size = size;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.brand, product.brand) &&
        Objects.equals(this.productType, product.productType) &&
        Objects.equals(this.condition, product.condition) &&
        Objects.equals(this.isbn, product.isbn) &&
        Objects.equals(this.asin, product.asin) &&
        Objects.equals(this.catalogNumbers, product.catalogNumbers) &&
        Objects.equals(this.department, product.department) &&
        Objects.equals(this.features, product.features) &&
        Objects.equals(this.minimumPrice, product.minimumPrice) &&
        Objects.equals(this.width, product.width) &&
        Objects.equals(this.height, product.height) &&
        Objects.equals(this.depth, product.depth) &&
        Objects.equals(this.weight, product.weight) &&
        Objects.equals(this.unit, product.unit) &&
        Objects.equals(this.studio, product.studio) &&
        Objects.equals(this.parentalRating, product.parentalRating) &&
        Objects.equals(this.publishDate, product.publishDate) &&
        Objects.equals(this.availabilityDate, product.availabilityDate) &&
        Objects.equals(this.size, product.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, productType, condition, isbn, asin, catalogNumbers, department, features, minimumPrice, width, height, depth, weight, unit, studio, parentalRating, publishDate, availabilityDate, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    isbn: ").append(toIndentedString(isbn)).append("\n");
    sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
    sb.append("    catalogNumbers: ").append(toIndentedString(catalogNumbers)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    minimumPrice: ").append(toIndentedString(minimumPrice)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    studio: ").append(toIndentedString(studio)).append("\n");
    sb.append("    parentalRating: ").append(toIndentedString(parentalRating)).append("\n");
    sb.append("    publishDate: ").append(toIndentedString(publishDate)).append("\n");
    sb.append("    availabilityDate: ").append(toIndentedString(availabilityDate)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

