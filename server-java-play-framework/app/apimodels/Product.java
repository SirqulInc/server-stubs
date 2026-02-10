package apimodels;

import apimodels.SizeGroup;
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
 * Product
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Product   {
  @JsonProperty("brand")
  
  private String brand;

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

    @Override
    @JsonValue
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

  @JsonProperty("productType")
  
  private ProductTypeEnum productType;

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

    @Override
    @JsonValue
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

  @JsonProperty("condition")
  
  private ConditionEnum condition;

  @JsonProperty("isbn")
  
  private String isbn;

  @JsonProperty("asin")
  
  private String asin;

  @JsonProperty("catalogNumbers")
  
  private List<String> catalogNumbers = null;

  @JsonProperty("department")
  
  private String department;

  @JsonProperty("features")
  
  private List<String> features = null;

  @JsonProperty("minimumPrice")
  
  private Double minimumPrice;

  @JsonProperty("width")
  
  private Double width;

  @JsonProperty("height")
  
  private Double height;

  @JsonProperty("depth")
  
  private Double depth;

  @JsonProperty("weight")
  
  private Double weight;

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

    @Override
    @JsonValue
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

  @JsonProperty("unit")
  
  private UnitEnum unit;

  @JsonProperty("studio")
  
  private String studio;

  @JsonProperty("parentalRating")
  
  private String parentalRating;

  @JsonProperty("publishDate")
  
  private Long publishDate;

  @JsonProperty("availabilityDate")
  
  private Long availabilityDate;

  @JsonProperty("size")
  @Valid

  private SizeGroup size;

  public Product brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Product productType(ProductTypeEnum productType) {
    this.productType = productType;
    return this;
  }

   /**
   * Get productType
   * @return productType
  **/
  public ProductTypeEnum getProductType() {
    return productType;
  }

  public void setProductType(ProductTypeEnum productType) {
    this.productType = productType;
  }

  public Product condition(ConditionEnum condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  public ConditionEnum getCondition() {
    return condition;
  }

  public void setCondition(ConditionEnum condition) {
    this.condition = condition;
  }

  public Product isbn(String isbn) {
    this.isbn = isbn;
    return this;
  }

   /**
   * Get isbn
   * @return isbn
  **/
  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public Product asin(String asin) {
    this.asin = asin;
    return this;
  }

   /**
   * Get asin
   * @return asin
  **/
  public String getAsin() {
    return asin;
  }

  public void setAsin(String asin) {
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
  **/
  public List<String> getCatalogNumbers() {
    return catalogNumbers;
  }

  public void setCatalogNumbers(List<String> catalogNumbers) {
    this.catalogNumbers = catalogNumbers;
  }

  public Product department(String department) {
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
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
  **/
  public List<String> getFeatures() {
    return features;
  }

  public void setFeatures(List<String> features) {
    this.features = features;
  }

  public Product minimumPrice(Double minimumPrice) {
    this.minimumPrice = minimumPrice;
    return this;
  }

   /**
   * Get minimumPrice
   * @return minimumPrice
  **/
  public Double getMinimumPrice() {
    return minimumPrice;
  }

  public void setMinimumPrice(Double minimumPrice) {
    this.minimumPrice = minimumPrice;
  }

  public Product width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public Product height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public Product depth(Double depth) {
    this.depth = depth;
    return this;
  }

   /**
   * Get depth
   * @return depth
  **/
  public Double getDepth() {
    return depth;
  }

  public void setDepth(Double depth) {
    this.depth = depth;
  }

  public Product weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public Product unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  public UnitEnum getUnit() {
    return unit;
  }

  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }

  public Product studio(String studio) {
    this.studio = studio;
    return this;
  }

   /**
   * Get studio
   * @return studio
  **/
  public String getStudio() {
    return studio;
  }

  public void setStudio(String studio) {
    this.studio = studio;
  }

  public Product parentalRating(String parentalRating) {
    this.parentalRating = parentalRating;
    return this;
  }

   /**
   * Get parentalRating
   * @return parentalRating
  **/
  public String getParentalRating() {
    return parentalRating;
  }

  public void setParentalRating(String parentalRating) {
    this.parentalRating = parentalRating;
  }

  public Product publishDate(Long publishDate) {
    this.publishDate = publishDate;
    return this;
  }

   /**
   * Get publishDate
   * @return publishDate
  **/
  public Long getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(Long publishDate) {
    this.publishDate = publishDate;
  }

  public Product availabilityDate(Long availabilityDate) {
    this.availabilityDate = availabilityDate;
    return this;
  }

   /**
   * Get availabilityDate
   * @return availabilityDate
  **/
  public Long getAvailabilityDate() {
    return availabilityDate;
  }

  public void setAvailabilityDate(Long availabilityDate) {
    this.availabilityDate = availabilityDate;
  }

  public Product size(SizeGroup size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  public SizeGroup getSize() {
    return size;
  }

  public void setSize(SizeGroup size) {
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
    return Objects.equals(brand, product.brand) &&
        Objects.equals(productType, product.productType) &&
        Objects.equals(condition, product.condition) &&
        Objects.equals(isbn, product.isbn) &&
        Objects.equals(asin, product.asin) &&
        Objects.equals(catalogNumbers, product.catalogNumbers) &&
        Objects.equals(department, product.department) &&
        Objects.equals(features, product.features) &&
        Objects.equals(minimumPrice, product.minimumPrice) &&
        Objects.equals(width, product.width) &&
        Objects.equals(height, product.height) &&
        Objects.equals(depth, product.depth) &&
        Objects.equals(weight, product.weight) &&
        Objects.equals(unit, product.unit) &&
        Objects.equals(studio, product.studio) &&
        Objects.equals(parentalRating, product.parentalRating) &&
        Objects.equals(publishDate, product.publishDate) &&
        Objects.equals(availabilityDate, product.availabilityDate) &&
        Objects.equals(size, product.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, productType, condition, isbn, asin, catalogNumbers, department, features, minimumPrice, width, height, depth, weight, unit, studio, parentalRating, publishDate, availabilityDate, size);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

