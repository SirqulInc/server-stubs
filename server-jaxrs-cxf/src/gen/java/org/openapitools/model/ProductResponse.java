package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SizeGroupResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ProductResponse  {
  
  @ApiModelProperty(value = "")

  private String brand;

  @ApiModelProperty(value = "")

  private String productType;

  @ApiModelProperty(value = "")

  private String condition;

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

  @ApiModelProperty(value = "")

  private String unit;

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

  private SizeGroupResponse size;
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

  public ProductResponse brand(String brand) {
    this.brand = brand;
    return this;
  }

 /**
   * Get productType
   * @return productType
  **/
  @JsonProperty("productType")
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public ProductResponse productType(String productType) {
    this.productType = productType;
    return this;
  }

 /**
   * Get condition
   * @return condition
  **/
  @JsonProperty("condition")
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public ProductResponse condition(String condition) {
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

  public ProductResponse isbn(String isbn) {
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

  public ProductResponse asin(String asin) {
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

  public ProductResponse catalogNumbers(List<String> catalogNumbers) {
    this.catalogNumbers = catalogNumbers;
    return this;
  }

  public ProductResponse addCatalogNumbersItem(String catalogNumbersItem) {
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

  public ProductResponse department(String department) {
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

  public ProductResponse features(List<String> features) {
    this.features = features;
    return this;
  }

  public ProductResponse addFeaturesItem(String featuresItem) {
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

  public ProductResponse minimumPrice(Double minimumPrice) {
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

  public ProductResponse width(Double width) {
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

  public ProductResponse height(Double height) {
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

  public ProductResponse depth(Double depth) {
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

  public ProductResponse weight(Double weight) {
    this.weight = weight;
    return this;
  }

 /**
   * Get unit
   * @return unit
  **/
  @JsonProperty("unit")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public ProductResponse unit(String unit) {
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

  public ProductResponse studio(String studio) {
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

  public ProductResponse parentalRating(String parentalRating) {
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

  public ProductResponse publishDate(Long publishDate) {
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

  public ProductResponse availabilityDate(Long availabilityDate) {
    this.availabilityDate = availabilityDate;
    return this;
  }

 /**
   * Get size
   * @return size
  **/
  @JsonProperty("size")
  public SizeGroupResponse getSize() {
    return size;
  }

  public void setSize(SizeGroupResponse size) {
    this.size = size;
  }

  public ProductResponse size(SizeGroupResponse size) {
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
    ProductResponse productResponse = (ProductResponse) o;
    return Objects.equals(this.brand, productResponse.brand) &&
        Objects.equals(this.productType, productResponse.productType) &&
        Objects.equals(this.condition, productResponse.condition) &&
        Objects.equals(this.isbn, productResponse.isbn) &&
        Objects.equals(this.asin, productResponse.asin) &&
        Objects.equals(this.catalogNumbers, productResponse.catalogNumbers) &&
        Objects.equals(this.department, productResponse.department) &&
        Objects.equals(this.features, productResponse.features) &&
        Objects.equals(this.minimumPrice, productResponse.minimumPrice) &&
        Objects.equals(this.width, productResponse.width) &&
        Objects.equals(this.height, productResponse.height) &&
        Objects.equals(this.depth, productResponse.depth) &&
        Objects.equals(this.weight, productResponse.weight) &&
        Objects.equals(this.unit, productResponse.unit) &&
        Objects.equals(this.studio, productResponse.studio) &&
        Objects.equals(this.parentalRating, productResponse.parentalRating) &&
        Objects.equals(this.publishDate, productResponse.publishDate) &&
        Objects.equals(this.availabilityDate, productResponse.availabilityDate) &&
        Objects.equals(this.size, productResponse.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, productType, condition, isbn, asin, catalogNumbers, department, features, minimumPrice, width, height, depth, weight, unit, studio, parentalRating, publishDate, availabilityDate, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductResponse {\n");
    
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

