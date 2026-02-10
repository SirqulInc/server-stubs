package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SizeGroup;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Product   {
  
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
    private String value;

    ProductTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ProductTypeEnum productType;

  /**
   * Gets or Sets condition
   */
  public enum ConditionEnum {
    NEW("NEW"),

        USED("USED"),

        REFURBISHED("REFURBISHED"),

        OTHER("OTHER");
    private String value;

    ConditionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ConditionEnum condition;
  private String isbn;
  private String asin;
  private List<String> catalogNumbers = new ArrayList<>();
  private String department;
  private List<String> features = new ArrayList<>();
  private Double minimumPrice;
  private Double width;
  private Double height;
  private Double depth;
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
    private String value;

    UnitEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private UnitEnum unit;
  private String studio;
  private String parentalRating;
  private Long publishDate;
  private Long availabilityDate;
  private SizeGroup size;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("productType")
  public ProductTypeEnum getProductType() {
    return productType;
  }
  public void setProductType(ProductTypeEnum productType) {
    this.productType = productType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("condition")
  public ConditionEnum getCondition() {
    return condition;
  }
  public void setCondition(ConditionEnum condition) {
    this.condition = condition;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isbn")
  public String getIsbn() {
    return isbn;
  }
  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asin")
  public String getAsin() {
    return asin;
  }
  public void setAsin(String asin) {
    this.asin = asin;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("catalogNumbers")
  public List<String> getCatalogNumbers() {
    return catalogNumbers;
  }
  public void setCatalogNumbers(List<String> catalogNumbers) {
    this.catalogNumbers = catalogNumbers;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("department")
  public String getDepartment() {
    return department;
  }
  public void setDepartment(String department) {
    this.department = department;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("features")
  public List<String> getFeatures() {
    return features;
  }
  public void setFeatures(List<String> features) {
    this.features = features;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("minimumPrice")
  public Double getMinimumPrice() {
    return minimumPrice;
  }
  public void setMinimumPrice(Double minimumPrice) {
    this.minimumPrice = minimumPrice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("width")
  public Double getWidth() {
    return width;
  }
  public void setWidth(Double width) {
    this.width = width;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("height")
  public Double getHeight() {
    return height;
  }
  public void setHeight(Double height) {
    this.height = height;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("depth")
  public Double getDepth() {
    return depth;
  }
  public void setDepth(Double depth) {
    this.depth = depth;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("weight")
  public Double getWeight() {
    return weight;
  }
  public void setWeight(Double weight) {
    this.weight = weight;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("unit")
  public UnitEnum getUnit() {
    return unit;
  }
  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("studio")
  public String getStudio() {
    return studio;
  }
  public void setStudio(String studio) {
    this.studio = studio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("parentalRating")
  public String getParentalRating() {
    return parentalRating;
  }
  public void setParentalRating(String parentalRating) {
    this.parentalRating = parentalRating;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("publishDate")
  public Long getPublishDate() {
    return publishDate;
  }
  public void setPublishDate(Long publishDate) {
    this.publishDate = publishDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("availabilityDate")
  public Long getAvailabilityDate() {
    return availabilityDate;
  }
  public void setAvailabilityDate(Long availabilityDate) {
    this.availabilityDate = availabilityDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("size")
  @Valid
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

