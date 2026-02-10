package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SizeGroup;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Product  {
  
  @ApiModelProperty(value = "")

  private String brand;

public enum ProductTypeEnum {

APPAREL(String.valueOf("APPAREL")), APPLIANCES(String.valueOf("APPLIANCES")), APPS(String.valueOf("APPS")), ARTS_CRAFTS(String.valueOf("ARTS_CRAFTS")), AUTOMOTIVE(String.valueOf("AUTOMOTIVE")), BABY(String.valueOf("BABY")), BEAUTY(String.valueOf("BEAUTY")), BOOKS(String.valueOf("BOOKS")), CLASSICAL(String.valueOf("CLASSICAL")), COLLECTIBLES(String.valueOf("COLLECTIBLES")), DVD(String.valueOf("DVD")), ELECTRONICS(String.valueOf("ELECTRONICS")), GIFT_CARDS(String.valueOf("GIFT_CARDS")), GOURMET_FOOD(String.valueOf("GOURMET_FOOD")), GROCERY(String.valueOf("GROCERY")), HEALTH_PERSONAL_CARE(String.valueOf("HEALTH_PERSONAL_CARE")), HOME_GARDEN(String.valueOf("HOME_GARDEN")), INDUSTRIAL(String.valueOf("INDUSTRIAL")), JEWELRY(String.valueOf("JEWELRY")), KITCHEN(String.valueOf("KITCHEN")), LAWN_GARDEN(String.valueOf("LAWN_GARDEN")), MAGAZINES(String.valueOf("MAGAZINES")), MISCELLANEOUS(String.valueOf("MISCELLANEOUS")), MUSICAL_INSTRUMENTS(String.valueOf("MUSICAL_INSTRUMENTS")), OFFICE_PRODUCTS(String.valueOf("OFFICE_PRODUCTS")), OTHER(String.valueOf("OTHER")), OUTDOOR_LIVING(String.valueOf("OUTDOOR_LIVING")), PC_HARDWARE(String.valueOf("PC_HARDWARE")), PET_SUPPLIES(String.valueOf("PET_SUPPLIES")), SHOES(String.valueOf("SHOES")), SOFTWARE(String.valueOf("SOFTWARE")), SPORTING_GOODS(String.valueOf("SPORTING_GOODS")), TOOLS(String.valueOf("TOOLS")), TOYS(String.valueOf("TOYS")), VIDEO_GAMES(String.valueOf("VIDEO_GAMES")), WATCHES(String.valueOf("WATCHES")), WIRELESS(String.valueOf("WIRELESS")), WIRELESS_ACCESSORIES(String.valueOf("WIRELESS_ACCESSORIES"));


    private String value;

    ProductTypeEnum (String v) {
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
    public static ProductTypeEnum fromValue(String value) {
        for (ProductTypeEnum b : ProductTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ProductTypeEnum productType;

public enum ConditionEnum {

NEW(String.valueOf("NEW")), USED(String.valueOf("USED")), REFURBISHED(String.valueOf("REFURBISHED")), OTHER(String.valueOf("OTHER"));


    private String value;

    ConditionEnum (String v) {
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
    public static ConditionEnum fromValue(String value) {
        for (ConditionEnum b : ConditionEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ConditionEnum condition;

  @ApiModelProperty(value = "")

  private String isbn;

  @ApiModelProperty(value = "")

  private String asin;

  @ApiModelProperty(value = "")

  private List<String> catalogNumbers = new ArrayList<>();

  @ApiModelProperty(value = "")

  private String department;

  @ApiModelProperty(value = "")

  private List<String> features = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Double minimumPrice;

  @ApiModelProperty(value = "")

  private Double width;

  @ApiModelProperty(value = "")

  private Double height;

  @ApiModelProperty(value = "")

  private Double depth;

  @ApiModelProperty(value = "")

  private Double weight;

public enum UnitEnum {

MILIMETER(String.valueOf("MILIMETER")), CENTIMETER(String.valueOf("CENTIMETER")), METER(String.valueOf("METER")), INCH(String.valueOf("INCH")), FOOT(String.valueOf("FOOT")), YARD(String.valueOf("YARD"));


    private String value;

    UnitEnum (String v) {
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
    public static UnitEnum fromValue(String value) {
        for (UnitEnum b : UnitEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private UnitEnum unit;

  @ApiModelProperty(value = "")

  private String studio;

  @ApiModelProperty(value = "")

  private String parentalRating;

  @ApiModelProperty(value = "")

  private Long publishDate;

  @ApiModelProperty(value = "")

  private Long availabilityDate;

  @ApiModelProperty(value = "")

  @Valid

  private SizeGroup size;
 /**
   * Get brand
   * @return brand
  **/
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Product brand(String brand) {
    this.brand = brand;
    return this;
  }

 /**
   * Get productType
   * @return productType
  **/
  @JsonProperty("productType")
  public String getProductType() {
    if (productType == null) {
      return null;
    }
    return productType.value();
  }

  public void setProductType(ProductTypeEnum productType) {
    this.productType = productType;
  }

  public Product productType(ProductTypeEnum productType) {
    this.productType = productType;
    return this;
  }

 /**
   * Get condition
   * @return condition
  **/
  @JsonProperty("condition")
  public String getCondition() {
    if (condition == null) {
      return null;
    }
    return condition.value();
  }

  public void setCondition(ConditionEnum condition) {
    this.condition = condition;
  }

  public Product condition(ConditionEnum condition) {
    this.condition = condition;
    return this;
  }

 /**
   * Get isbn
   * @return isbn
  **/
  @JsonProperty("isbn")
  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public Product isbn(String isbn) {
    this.isbn = isbn;
    return this;
  }

 /**
   * Get asin
   * @return asin
  **/
  @JsonProperty("asin")
  public String getAsin() {
    return asin;
  }

  public void setAsin(String asin) {
    this.asin = asin;
  }

  public Product asin(String asin) {
    this.asin = asin;
    return this;
  }

 /**
   * Get catalogNumbers
   * @return catalogNumbers
  **/
  @JsonProperty("catalogNumbers")
  public List<String> getCatalogNumbers() {
    return catalogNumbers;
  }

  public void setCatalogNumbers(List<String> catalogNumbers) {
    this.catalogNumbers = catalogNumbers;
  }

  public Product catalogNumbers(List<String> catalogNumbers) {
    this.catalogNumbers = catalogNumbers;
    return this;
  }

  public Product addCatalogNumbersItem(String catalogNumbersItem) {
    this.catalogNumbers.add(catalogNumbersItem);
    return this;
  }

 /**
   * Get department
   * @return department
  **/
  @JsonProperty("department")
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public Product department(String department) {
    this.department = department;
    return this;
  }

 /**
   * Get features
   * @return features
  **/
  @JsonProperty("features")
  public List<String> getFeatures() {
    return features;
  }

  public void setFeatures(List<String> features) {
    this.features = features;
  }

  public Product features(List<String> features) {
    this.features = features;
    return this;
  }

  public Product addFeaturesItem(String featuresItem) {
    this.features.add(featuresItem);
    return this;
  }

 /**
   * Get minimumPrice
   * @return minimumPrice
  **/
  @JsonProperty("minimumPrice")
  public Double getMinimumPrice() {
    return minimumPrice;
  }

  public void setMinimumPrice(Double minimumPrice) {
    this.minimumPrice = minimumPrice;
  }

  public Product minimumPrice(Double minimumPrice) {
    this.minimumPrice = minimumPrice;
    return this;
  }

 /**
   * Get width
   * @return width
  **/
  @JsonProperty("width")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public Product width(Double width) {
    this.width = width;
    return this;
  }

 /**
   * Get height
   * @return height
  **/
  @JsonProperty("height")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public Product height(Double height) {
    this.height = height;
    return this;
  }

 /**
   * Get depth
   * @return depth
  **/
  @JsonProperty("depth")
  public Double getDepth() {
    return depth;
  }

  public void setDepth(Double depth) {
    this.depth = depth;
  }

  public Product depth(Double depth) {
    this.depth = depth;
    return this;
  }

 /**
   * Get weight
   * @return weight
  **/
  @JsonProperty("weight")
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public Product weight(Double weight) {
    this.weight = weight;
    return this;
  }

 /**
   * Get unit
   * @return unit
  **/
  @JsonProperty("unit")
  public String getUnit() {
    if (unit == null) {
      return null;
    }
    return unit.value();
  }

  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }

  public Product unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }

 /**
   * Get studio
   * @return studio
  **/
  @JsonProperty("studio")
  public String getStudio() {
    return studio;
  }

  public void setStudio(String studio) {
    this.studio = studio;
  }

  public Product studio(String studio) {
    this.studio = studio;
    return this;
  }

 /**
   * Get parentalRating
   * @return parentalRating
  **/
  @JsonProperty("parentalRating")
  public String getParentalRating() {
    return parentalRating;
  }

  public void setParentalRating(String parentalRating) {
    this.parentalRating = parentalRating;
  }

  public Product parentalRating(String parentalRating) {
    this.parentalRating = parentalRating;
    return this;
  }

 /**
   * Get publishDate
   * @return publishDate
  **/
  @JsonProperty("publishDate")
  public Long getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(Long publishDate) {
    this.publishDate = publishDate;
  }

  public Product publishDate(Long publishDate) {
    this.publishDate = publishDate;
    return this;
  }

 /**
   * Get availabilityDate
   * @return availabilityDate
  **/
  @JsonProperty("availabilityDate")
  public Long getAvailabilityDate() {
    return availabilityDate;
  }

  public void setAvailabilityDate(Long availabilityDate) {
    this.availabilityDate = availabilityDate;
  }

  public Product availabilityDate(Long availabilityDate) {
    this.availabilityDate = availabilityDate;
    return this;
  }

 /**
   * Get size
   * @return size
  **/
  @JsonProperty("size")
  public SizeGroup getSize() {
    return size;
  }

  public void setSize(SizeGroup size) {
    this.size = size;
  }

  public Product size(SizeGroup size) {
    this.size = size;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

